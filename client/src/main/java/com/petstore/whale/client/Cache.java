package com.petstore.whale.client;

public interface Cache<K, V> {
    void put(K k, V v);

    V get(K k);
}
