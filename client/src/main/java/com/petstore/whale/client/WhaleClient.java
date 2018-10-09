package com.petstore.whale.client;

import java.net.InetSocketAddress;
import java.util.List;

public class WhaleClient {

    private List<InetSocketAddress> servers;

    public WhaleClient(List<InetSocketAddress> servers) {
        this.servers = servers;
    }

    public void put(String key, String value) {

    }
}
