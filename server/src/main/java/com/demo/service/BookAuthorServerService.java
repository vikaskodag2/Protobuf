package com.demo.service;

import com.demo.Author;
import com.demo.AuthorList;
import com.demo.AuthorListRequest;
import com.demo.BookAuthorServiceGrpc;
import com.demo.dao.AuthorDao;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@GrpcService
public class BookAuthorServerService extends BookAuthorServiceGrpc.BookAuthorServiceImplBase {

    @Autowired
    private AuthorDao authorDao;

    @Override
    public void getAllAuthorStream(AuthorListRequest request, StreamObserver<Author> responseObserver) {
        authorDao.getAllAuthors().stream().forEach(responseObserver::onNext);
        responseObserver.onCompleted();
    }

    @Override
    public void getAllAuthor(AuthorListRequest request, StreamObserver<AuthorList> responseObserver) {
        List<Author> allAuthors = authorDao.getAllAuthors();
        AuthorList authorList = AuthorList.newBuilder().addAllAuthors(allAuthors).build();
        System.out.println("GRPC Server: Got list of objects:" + allAuthors.size());
        responseObserver.onNext(authorList);
        responseObserver.onCompleted();
    }

    @Override
    public void getAuthor(Author request, StreamObserver<Author> responseObserver) {
        authorDao.getAuthorWithId(request.getAuthorId()).ifPresent(responseObserver::onNext);

        responseObserver.onCompleted();
    }
}
