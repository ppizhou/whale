package com.petstore.whale.server.quorum;

import java.nio.ByteBuffer;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class QuorumCnxnManager {
    public ConcurrentMap<Long, BlockingQueue<ByteBuffer>> quorumCnxn = new ConcurrentHashMap<>();
}
