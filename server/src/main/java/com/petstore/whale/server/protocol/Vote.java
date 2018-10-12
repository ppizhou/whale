package com.petstore.whale.server.protocol;

import com.petstore.whale.server.quorum.QuorumPeer;

public class Vote {
    public Vote(long sid, long zxid, long leader, QuorumPeer.ServerState state, long epoch) {
    }
}
