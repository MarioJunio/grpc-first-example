// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: customer.proto

package br.com.mj;

public final class Customer {
  private Customer() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_customer_CustomerMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_customer_CustomerMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_customer_CustomerRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_customer_CustomerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_customer_CustomerResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_customer_CustomerResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016customer.proto\022\010customer\"@\n\017CustomerMe" +
      "ssage\022\014\n\004name\030\001 \001(\t\022\r\n\005email\030\002 \001(\t\022\020\n\010pa" +
      "ssword\030\003 \001(\t\">\n\017CustomerRequest\022+\n\010custo" +
      "mer\030\001 \001(\0132\031.customer.CustomerMessage\"\"\n\020" +
      "CustomerResponse\022\016\n\006result\030\001 \001(\t2R\n\017Cust" +
      "omerService\022?\n\004Save\022\031.customer.CustomerR" +
      "equest\032\032.customer.CustomerResponse\"\000B\r\n\t" +
      "br.com.mjP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_customer_CustomerMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_customer_CustomerMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_customer_CustomerMessage_descriptor,
        new java.lang.String[] { "Name", "Email", "Password", });
    internal_static_customer_CustomerRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_customer_CustomerRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_customer_CustomerRequest_descriptor,
        new java.lang.String[] { "Customer", });
    internal_static_customer_CustomerResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_customer_CustomerResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_customer_CustomerResponse_descriptor,
        new java.lang.String[] { "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
