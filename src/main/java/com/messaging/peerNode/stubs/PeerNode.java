// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: peer_node.proto

package com.messaging.peerNode.stubs;

public final class PeerNode {
  private PeerNode() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_messaging_peerNode_stubs_MessageRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_messaging_peerNode_stubs_MessageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_messaging_peerNode_stubs_MessageResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_messaging_peerNode_stubs_MessageResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_messaging_peerNode_stubs_RegisterPeerNodeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_messaging_peerNode_stubs_RegisterPeerNodeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_messaging_peerNode_stubs_RegisterPeerNodeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_messaging_peerNode_stubs_RegisterPeerNodeResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017peer_node.proto\022\034com.messaging.peerNod" +
      "e.stubs\"5\n\016MessageRequest\022\017\n\007message\030\001 \001" +
      "(\t\022\022\n\ntargetPort\030\002 \001(\r\"\037\n\017MessageRespons" +
      "e\022\014\n\004sent\030\001 \001(\010\"\'\n\027RegisterPeerNodeReque" +
      "st\022\014\n\004port\030\001 \001(\r\".\n\030RegisterPeerNodeResp" +
      "onse\022\022\n\nregistered\030\001 \001(\0102\201\002\n\017PeerNodeSer" +
      "vice\022j\n\013sendMessage\022,.com.messaging.peer" +
      "Node.stubs.MessageRequest\032-.com.messagin" +
      "g.peerNode.stubs.MessageResponse\022\201\001\n\020reg" +
      "isterPeerNode\0225.com.messaging.peerNode.s",
      "tubs.RegisterPeerNodeRequest\0326.com.messa" +
      "ging.peerNode.stubs.RegisterPeerNodeResp" +
      "onseB\002P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_messaging_peerNode_stubs_MessageRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_messaging_peerNode_stubs_MessageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_messaging_peerNode_stubs_MessageRequest_descriptor,
        new java.lang.String[] { "Message", "TargetPort", });
    internal_static_com_messaging_peerNode_stubs_MessageResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_messaging_peerNode_stubs_MessageResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_messaging_peerNode_stubs_MessageResponse_descriptor,
        new java.lang.String[] { "Sent", });
    internal_static_com_messaging_peerNode_stubs_RegisterPeerNodeRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_messaging_peerNode_stubs_RegisterPeerNodeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_messaging_peerNode_stubs_RegisterPeerNodeRequest_descriptor,
        new java.lang.String[] { "Port", });
    internal_static_com_messaging_peerNode_stubs_RegisterPeerNodeResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_messaging_peerNode_stubs_RegisterPeerNodeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_messaging_peerNode_stubs_RegisterPeerNodeResponse_descriptor,
        new java.lang.String[] { "Registered", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
