# GRPC and Protobuf
Spring-boot Project for learning Protobuf and GRPC.

# Description
In this project I have developed 2 Servers, GRPC Server and RestServer which takes data from a json file and serve this data to the client application. The volume of data transaferred is 7.24 mb.

# Technologies Used
  - Java Spring Boot
  - GRPC (https://github.com/yidongnan/grpc-spring-boot-starter)
  - Protobuf (https://grpc.io/docs/languages/java/quickstart/)

# Pojo used (60,000+ object of this was transferred) The json file can be found in resources folder of 2 server modules
```
public class AuthorDTO {
    private String authorId;
    private String firstName;
    private String lastName;
    private String gender;
}
```

# Time Comparison bw Rest Server and GRPC Server
Rest Server
```
Time taken to fetch the data via Rest: 135 ms
Time taken to fetch the data via Rest: 103 ms
Time taken to fetch the data via Rest: 154 ms
Time taken to fetch the data via Rest: 116 ms
Time taken to fetch the data via Rest: 167 ms
Time taken to fetch the data via Rest: 157 ms
Time taken to fetch the data via Rest: 107 ms
Time taken to fetch the data via Rest: 156 ms
```

GRPC Server
```
Time taken to fetch the data via grpc: 70 ms
Time taken to fetch the data via grpc: 86 ms
Time taken to fetch the data via grpc: 67 ms
Time taken to fetch the data via grpc: 64 ms
Time taken to fetch the data via grpc: 49 ms
Time taken to fetch the data via grpc: 79 ms
Time taken to fetch the data via grpc: 67 ms
Time taken to fetch the data via grpc: 57 ms
Time taken to fetch the data via grpc: 60 ms
```