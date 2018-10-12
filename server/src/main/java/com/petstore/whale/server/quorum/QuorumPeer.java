package com.petstore.whale.server.quorum;

import java.net.InetSocketAddress;

public class QuorumPeer {

    private volatile ServerState state = ServerState.LOOKING;

    public void setPeerState(ServerState state) {
        this.state = state;
    }

    public ServerState getPeerState() {
        return state;
    }

    public enum ServerState {
        LOOKING, LEADING, FOLLOWING
    }

    public class QuorumServer {
        public long sid;
        public InetSocketAddress electionAddr;
        public InetSocketAddress addr;
    }


}
