package com.demo.service;

import com.demo.Author;
import com.demo.AuthorList;
import com.demo.AuthorListRequest;
import com.demo.BookAuthorServiceGrpc;
import com.google.protobuf.Descriptors;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@Service
public class BookAuthorClientService {

    @GrpcClient("grpc-demo-service")
    private BookAuthorServiceGrpc.BookAuthorServiceBlockingStub synchronousClient;

    @GrpcClient("grpc-demo-service")
    private BookAuthorServiceGrpc.BookAuthorServiceStub asynchronousClient;

    public Map<Descriptors.FieldDescriptor, Object> getAuthor(int authorId) {
        long time = System.currentTimeMillis();
        Author authorRequest = Author.newBuilder().setAuthorId(authorId).build();
        Author authorResponse = synchronousClient.getAuthor(authorRequest);
        System.out.println("Time taken to fetch the data via grpc: " + (System.currentTimeMillis() - time) + " ms");
        return authorResponse.getAllFields();
    }

    public String getAllAuthor() throws InvalidProtocolBufferException {
        long time = System.currentTimeMillis();
        AuthorListRequest authorListRequest = AuthorListRequest.newBuilder().build();
        AuthorList authorResponse = synchronousClient.getAllAuthor(authorListRequest);
        System.out.println("Time taken to fetch the data via grpc: " + (System.currentTimeMillis() - time) + " ms");
        String response = JsonFormat.printer().print(authorResponse);
        return response;
    }

    public List<Map<Descriptors.FieldDescriptor, Object>> getAllAuthorStream() throws InterruptedException {
        long time = System.currentTimeMillis();
        AuthorListRequest authorListRequest = AuthorListRequest.newBuilder().build();
        CountDownLatch countDownLatch = new CountDownLatch(1);

        List<Map<Descriptors.FieldDescriptor, Object>> authorListResponse = new ArrayList<>();
        asynchronousClient.getAllAuthorStream(authorListRequest, new StreamObserver<>() {
            @Override
            public void onNext(Author author) {
                authorListResponse.add(author.getAllFields());
            }

            @Override
            public void onError(Throwable throwable) {
                countDownLatch.countDown();
            }

            @Override
            public void onCompleted() {
                countDownLatch.countDown();
            }
        });

        boolean await = countDownLatch.await(1, TimeUnit.MINUTES);
        System.out.println("Time taken to fetch the data via grpc: " + (System.currentTimeMillis() - time) + " ms");
        return await ? authorListResponse : Collections.emptyList();
    }
}
