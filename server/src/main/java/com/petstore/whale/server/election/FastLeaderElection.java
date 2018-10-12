package com.petstore.whale.server.election;

import com.petstore.whale.server.quorum.QuorumPeer;

public class FastLeaderElection implements Election {

    private QuorumPeer peer;
    private volatile boolean stop;

    public FastLeaderElection(QuorumPeer peer) {
        this.peer = peer;
    }

    @Override
    public void lookForLeader() {
        while (peer.getPeerState() == QuorumPeer.ServerState.LOOKING && !stop) {

        }
    }
}
