// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pojo.proto

package com.example.protobufdemo.proto;

public final class PojoProto {
    private PojoProto() {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions(
                (com.google.protobuf.ExtensionRegistryLite) registry);
    }

    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_protobufdemo_proto_Course_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_protobufdemo_proto_Course_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_protobufdemo_proto_Student_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_protobufdemo_proto_Student_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_protobufdemo_proto_Student_PhoneNumber_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_protobufdemo_proto_Student_PhoneNumber_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor
            descriptor;

    static {
        String[] descriptorData = {
                "\n\npojo.proto\022\022protobufdemo.proto\"W\n\006Cour" +
                        "se\022\n\n\002id\030\001 \001(\005\022\023\n\013course_name\030\002 \001(\t\022,\n\007s" +
                        "tudent\030\003 \003(\0132\033.protobufdemo.proto.Studen" +
                        "t\"\376\001\n\007Student\022\n\n\002id\030\001 \001(\005\022\022\n\nfirst_name\030" +
                        "\002 \001(\t\022\021\n\tlast_name\030\003 \001(\t\022\r\n\005email\030\004 \001(\t\022" +
                        "6\n\005phone\030\005 \003(\0132\'.protobufdemo.proto.Stud" +
                        "ent.PhoneNumber\032R\n\013PhoneNumber\022\016\n\006number" +
                        "\030\001 \001(\t\0223\n\004type\030\002 \001(\0162%.protobufdemo.prot" +
                        "o.Student.PhoneType\"%\n\tPhoneType\022\n\n\006MOBI" +
                        "LE\020\000\022\014\n\010LANDLINE\020\001B-\n\036com.example.protob",
                "ufdemo.protoB\tPojoProtoP\001b\006proto3"
        };
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
                new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
                    public com.google.protobuf.ExtensionRegistry assignDescriptors(
                            com.google.protobuf.Descriptors.FileDescriptor root) {
                        descriptor = root;
                        return null;
                    }
                };
        com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[]{
                        }, assigner);
        internal_static_protobufdemo_proto_Course_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_protobufdemo_proto_Course_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_protobufdemo_proto_Course_descriptor,
                new String[]{"Id", "CourseName", "Student",});
        internal_static_protobufdemo_proto_Student_descriptor =
                getDescriptor().getMessageTypes().get(1);
        internal_static_protobufdemo_proto_Student_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_protobufdemo_proto_Student_descriptor,
                new String[]{"Id", "FirstName", "LastName", "Email", "Phone",});
        internal_static_protobufdemo_proto_Student_PhoneNumber_descriptor =
                internal_static_protobufdemo_proto_Student_descriptor.getNestedTypes().get(0);
        internal_static_protobufdemo_proto_Student_PhoneNumber_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_protobufdemo_proto_Student_PhoneNumber_descriptor,
                new String[]{"Number", "Type",});
    }

    // @@protoc_insertion_point(outer_class_scope)
}
