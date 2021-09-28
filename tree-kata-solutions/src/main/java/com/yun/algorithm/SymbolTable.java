package com.yun.algorithm;

/**
 *
 * A symbol table is a data structure for key-value pairs that supports two operations
 * insert (put) a new pair into the table and search for (get) the value associated with
 * a given key
 *
 * This the basic interface for SymbolTable
 * @author Henry Gao
 * @date 2021-09-20 - 23:02
 */
public interface SymbolTable<K, V> {

    /**
     * put key-value pair into the table
     * remove key from table if value is null
     *
     * @param key key with which the specified value is to be associated
     * @param value value to be associated with the specified key
     */
    void put(K key, V value);

    /**
     *
     * @param key key with which the specified value is to be associated
     * @return value paired with key (null if key is absent)
     */
    V get(K key);

    /**
     * remove key and its value from the table
     * @param key key with which the specified value is to be associated
     */
    void delete(K key);


    /**
     * check if the table contains the key
     * @param key key with which the specified value is to be associated
     * @return true if contains the key , false if not contains
     */
    boolean contains(K key);

    /**
     *
     * @return true if the table is empty , false if the table is not empty
     */
    boolean isEmpty();

    /**
     *
     * @return number of key-value pairs in the table
     */
    int size();

    /**
     *
     * @return all keys in the table
     */
    Iterable<K> keys();

}
