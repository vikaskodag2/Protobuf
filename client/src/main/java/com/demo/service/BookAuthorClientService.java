package com.demo.service;

import com.demo.Author;
import com.demo.BookAuthorServiceGrpc;
import com.google.protobuf.Descriptors;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class BookAuthorClientService {

    @GrpcClient("grpc-demo-service")
    BookAuthorServiceGrpc.BookAuthorServiceBlockingStub synchronousClient;

    public Map<Descriptors.FieldDescriptor, Object> getAuthor(int authorId) {
        long time = System.currentTimeMillis();
        Author authorRequest = Author.newBuilder().setAuthorId(authorId).build();
        Author authorResponse = synchronousClient.getAuthor(authorRequest);
        System.out.println("Time taken to fetch the data: " + (System.currentTimeMillis() - time) + " ms");
        return authorResponse.getAllFields();
    }

}
