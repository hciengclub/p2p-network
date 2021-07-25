package com.messaging.peerNode;

import java.util.HashMap;

import com.messaging.peerNode.stubs.*;
import com.messaging.peerNode.stubs.PeerNodeServiceGrpc.*;

import io.grpc.stub.StreamObserver;
import io.grpc.ManagedChannel;

public class PeerNodeServiceImpl extends PeerNodeServiceImplBase {
    protected HashMap<Integer, ManagedChannel> connectedPeerNodes;

    @Override
    public void sendMessage(MessageRequest request, StreamObserver<MessageResponse> responseObserver) {
        System.out.println(request.toString());
        MessageResponse response = MessageResponse.newBuilder().setSent(true).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

}
