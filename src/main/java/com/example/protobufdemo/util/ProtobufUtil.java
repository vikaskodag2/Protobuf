package com.example.protobufdemo.util;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.util.JsonFormat;
import org.springframework.stereotype.Component;

@Component
public class ProtobufUtil {

    public static String toJson(MessageOrBuilder message) {
        return JsonFormat.printer().print(message);
    }
}
