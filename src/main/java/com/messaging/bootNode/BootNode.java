package com.messaging.bootNode;

import com.messaging.bootNode.stubs.BootNodeServiceGrpc.BootNodeServiceBlockingStub;
import com.messaging.constants.Constants;

import java.util.*;

import com.messaging.bootNode.stubs.*;
import com.messaging.node.*;
import com.messaging.peerToPeer.*;

import io.grpc.*;

public class BootNode extends BootNodeServiceImpl implements Node {
    final int port;

    public BootNode() {
        this.port = 0;
    }

    public BootNode(int port) {
        this.port = port;
        this.bootstrap();
    }

    private void bootstrap() {
        Map<BootNodeServiceBlockingStub, ManagedChannel> bootNodes = this.connectToBootNodes();
        this.connectedBootNodes = bootNodes;
    }

    private Map<BootNodeServiceBlockingStub, ManagedChannel> connectToBootNodes() {
        Random rand = new Random();

        Map<BootNodeServiceBlockingStub, ManagedChannel> bootNodes = new HashMap<BootNodeServiceBlockingStub, ManagedChannel>();

        for (int i = 0; i < Constants.BOOT_NODE_ADDRESSES.length; i++) {
            int addr = Constants.BOOT_NODE_ADDRESSES[rand.nextInt(Constants.BOOT_NODE_ADDRESSES.length)];
            ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", addr).usePlaintext().build();
            BootNodeServiceBlockingStub bootNode = BootNodeServiceGrpc.newBlockingStub(channel);
            bootNodes.put(bootNode, channel);
        }

        return bootNodes;
    }

    @Override
    public NodeType whichNode() {
        return NodeType.BOOT;
    }

    public void run() {
        GrpcServer server = ServerFactory.getServer(NodeType.BOOT, this.port);
        server.run();
    }

    public static ManagedChannel getRandomBootNodeChannel() {
        Random rand = new Random();

        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost",
                        Constants.BOOT_NODE_ADDRESSES[rand.nextInt(Constants.BOOT_NODE_ADDRESSES.length)])
                .usePlaintext().build();

        return channel;
    }
}