# GRPC and Protobuf
Spring-boot Project for learning Protobuf and GRPC.

# Description
In this project I have developed 2 Servers, GRPC Server and RestServer which takes data from a json file and serve this data to the client application. The volume of data transaferred is 1.6 mb.

# Technologies Used
  - Java Spring Boot
  - GRPC (https://github.com/yidongnan/grpc-spring-boot-starter)
  - Protobuf (https://grpc.io/docs/languages/java/quickstart/)

# Time Comparison bw Rest Server and GRPC Server
Rest Server
```Time taken to fetch the data via Rest: 1061 ms
Time taken to fetch the data via Rest: 43 ms
Time taken to fetch the data via Rest: 25 ms
Time taken to fetch the data via Rest: 22 ms
Time taken to fetch the data via Rest: 33 ms
Time taken to fetch the data via Rest: 24 ms
Time taken to fetch the data via Rest: 27 ms
```

GRPC Server
```Time taken to fetch the data via grpc: 724 ms
Time taken to fetch the data via grpc: 25 ms
Time taken to fetch the data via grpc: 21 ms
Time taken to fetch the data via grpc: 21 ms
Time taken to fetch the data via grpc: 17 ms
Time taken to fetch the data via grpc: 18 ms
Time taken to fetch the data via grpc: 13 ms
```