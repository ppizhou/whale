package com.petstore.whale.server.quorum;

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
}
