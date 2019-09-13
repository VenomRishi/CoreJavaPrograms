package com.bridgelabz.Handler;
//A node of chains
public class HashNode<K, V> {
	K key;
	V value;
	HashNode<K, V> next;

	HashNode(K key, V value) {
		this.key = key;
		this.value = value;
	}
}
