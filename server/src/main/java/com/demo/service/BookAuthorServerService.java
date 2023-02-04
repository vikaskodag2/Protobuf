package com.demo.service;

import com.demo.Author;
import com.demo.BookAuthorServiceGrpc;
import com.demo.dao.AuthorDao;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GrpcService
public class BookAuthorServerService extends BookAuthorServiceGrpc.BookAuthorServiceImplBase {

    @Autowired
    private AuthorDao authorDao;

    @Override
    public void getAuthor(Author request, StreamObserver<Author> responseObserver) {
        authorDao.getAuthorWithId(request.getAuthorId()).ifPresent(responseObserver::onNext);

        responseObserver.onCompleted();
    }
}
