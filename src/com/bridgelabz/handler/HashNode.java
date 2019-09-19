/**
 * Purpose: Node class which can be implemented inside hash map
 * 
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   13-09-2019
 *
 * @param <K>	key type
 * @param <V>	value type
 */

package com.bridgelabz.handler;
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
