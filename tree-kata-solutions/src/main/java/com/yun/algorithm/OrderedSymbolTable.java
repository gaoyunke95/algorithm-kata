package com.yun.algorithm;

/**
 * @author Henry Gao
 * @date 9/23/21 - 10:39 PM
 */
public interface OrderedSymbolTable <K extends Comparable<K>, V> extends SymbolTable<K, V>{
/*
    *//**
     * put key-value pair into the table
     * remove key from table if value is null
     *
     * @param key key with which the specified value is to be associated
     * @param value value to be associated with the specified key
     *//*
    void put(K key, V value);

    *//**
     *
     * @param key key with which the specified value is to be associated
     * @return value paired with key (null if key is absent)
     *//*
    V get(K key);

    *//**
     * remove key and its value from the table
     * @param key key with which the specified value is to be associated
     *//*
    void delete(K key);


    *//**
     * check if the table contains the key
     * @param key key with which the specified value is to be associated
     * @return true if contains the key , false if not contains
     *//*
    boolean contains(K key);

    *//**
     *
     * @return true if the table is empty , false if the table is not empty
     *//*
    boolean isEmpty();

    *//**
     *
     * @return number of key-value pairs in the table
     *//*
    int size();*/

    /**
     *
     * @return smallest key
     */
    K min();

    /**
     *
     * @return largest key
     */
    K max();

    /**
     *
     * @param key key
     * @return largest key less than or equal to the given key
     */
    K floor(K key);

    /**
     *
     * @param key key
     * @return smallest key greater or equal to the given key
     */
    K ceiling(K key);

    /**
     *
     * @param key key
     * @return number of keys less than given key
     */
    int rank(K key);

    /**
     *
     * @param k rank value k
     * @return key of rank k
     */
    K select(int k);

    /**
     * delete smallest key
     */
    void deleteMin();

    /**
     * delete largest key
     */
    void deleteMax();

    /**
     *
     * @param lo low key
     * @param hi high key
     * @return number of keys in [lo... hi]
     */
    int size(K lo, K hi);

    /**
     *
     * @param lo low key
     * @param hi high key
     * @return keys in [lo... hi], in sorted order
     */
    Iterable<K> keys(K lo, K hi);

/*

    */
/**
     *
     * @return all keys in the table, in sorted order
     *//*

    Iterable<K> keys();
*/


}
