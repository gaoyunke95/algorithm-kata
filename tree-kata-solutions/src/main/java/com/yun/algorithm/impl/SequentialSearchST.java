package com.yun.algorithm.impl;

import com.yun.algorithm.SymbolTable;

import java.util.LinkedList;
import java.util.List;

/**
 * Default Symbol Table with sequential search
 * @author Henry Gao
 * @date 9/23/21 - 11:02 PM
 */
public class SequentialSearchST<K,V> implements SymbolTable<K,V> {

    private Node head = new Node(null, null, null);
    private Node first;
    private int size;

    private class Node{
        K key;
        V value;
        Node next;
        public Node(K key, V value, Node next){
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }


    @Override
    public void put(K key, V value) {

        if(key == null) throw new IllegalArgumentException("first argument key can not be null");
        if(value == null) {
            delete(key);
            return;
        }
        //search for key, update value if found; grow table if new.
        for(Node x = first; x != null; x = x.next){
            if(key.equals(x.key)){
                //search Hit: update value
                x.value = value;
                return;
            }
        }
        //search miss: add new node.
        first = new Node(key, value, first);
        size++;
    }

    @Override
    public V get(K key) {

        if(key == null) throw new IllegalArgumentException("can not get value with null key");
        //search for key, return associated value.
        for(Node x = first; x != null; x = x.next){
            if(key.equals(x.key)){
                //search hit: return value.
                return x.value;
            }
        }
        //search miss: return null.
        return null;
    }

    @Override
    public void delete(K key) {
        if(key == null) throw new IllegalArgumentException("can not delete with null key");

        if(first.key.equals(key)){
            first = first.next;
            size--;
            return;
        }
        for(Node node = first; node != null; node = node.next){
            if(node.next != null && node.next.key.equals(key)){
                node.next = node.next.next;
                size--;
                return;
            }
        }

    }


    @Override
    public boolean contains(K key) {
        if(key == null) throw new IllegalArgumentException("can not check null key");
        return get(key) != null;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterable<K> keys() {
        List<K> keyList = new LinkedList<>();
        for(Node node = first; node != null; node = node.next){
            keyList.add(node.key);
        }
        return keyList;
    }
}
