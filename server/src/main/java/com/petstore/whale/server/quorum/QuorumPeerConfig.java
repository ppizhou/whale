package com.petstore.whale.server.quorum;

import java.util.HashMap;
import java.util.Map;

public class QuorumPeerConfig {

    private Map<Long, QuorumServer> peers = new HashMap<>();

    public Map<Long, QuorumServer> getPeers() {
        return peers;
    }
}
