package com.yun.algorithm.impl;

import com.yun.algorithm.SymbolTable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Henry Gao
 * @date 9/25/21 - 10:25 PM
 */
class SequentialSearchSTTest {


    @Test
     void testClientForPutNewElementsIntoST(){
        SymbolTable<String, Integer> st = new SequentialSearchST<>();

        for(int i = 1;i <= 5; i++){
            String key = "Key" + i;
            st.put(key, i);
        }

        st.put("Key5", 15);

        assertAll(
                () -> assertEquals(1,st.get("Key1")),
                () -> assertEquals(2,st.get("Key2")),
                () -> assertEquals(3,st.get("Key3")),
                () -> assertEquals(4,st.get("Key4")),
                () -> assertEquals(15,st.get("Key5")),
                () -> assertNull(st.get("Key6"))
        );
    }


    @Test
    void testDeleteElementByKey(){
        SymbolTable<String, Integer> st = new SequentialSearchST<>();

        for(int i = 1;i <= 5; i++){
            String key = "Key" + i;
            st.put(key, i);
        }

        st.delete("Key3");

        assertAll(
                () -> assertEquals(1,st.get("Key1")),
                () -> assertEquals(2,st.get("Key2")),
                () -> assertNull(st.get("Key3")),
                () -> assertEquals(4,st.get("Key4")),
                () -> assertEquals(5,st.get("Key5")),
                () -> assertNull(st.get("Key6"))
        );
    }

    @Test
    void testContainsByKey(){
        SymbolTable<String, Integer> st = new SequentialSearchST<>();

        for(int i = 1;i <= 3; i++){
            String key = "Key" + i;
            st.put(key, i);
        }

        st.delete("Key3");

        assertAll(
                () -> assertTrue(st.contains("Key1")),
                () -> assertTrue(st.contains("Key2")),
                () -> assertFalse(st.contains("Key3")),
                () -> assertFalse(st.contains("Key4"))

        );
    }

    @Test
    void testIsEmpty(){
        SymbolTable<String, Integer> st = new SequentialSearchST<>();
        boolean result1 = st.isEmpty();

        for(int i = 1;i <= 3; i++){
            String key = "Key" + i;
            st.put(key, i);
        }
        boolean result2 = st.isEmpty();

        for(int i = 1;i <= 3; i++){
            String key = "Key" + i;
            st.delete(key);
        }
        boolean result3 = st.isEmpty();

        assertAll(
                () -> assertTrue(result1),
                () -> assertFalse(result2),
                () -> assertTrue(result3)
        );

    }

    @Test
    void testSize(){
        SymbolTable<String, Integer> st = new SequentialSearchST<>();
        int result1 = st.size();

        for(int i = 1;i <= 3; i++){
            String key = "Key" + i;
            st.put(key, i);
        }
        int result2 = st.size();

        st.delete("Key3");
        int result3 = st.size();

        st.delete("Key2");
        st.delete("Key1");
        int result4 = st.size();

        assertAll(
                () -> assertEquals(0, result1),
                () -> assertEquals(3, result2),
                () -> assertEquals(2, result3),
                () -> assertEquals(0, result4)
        );

    }

    @Test
    void testKeys(){

        List<String> expectedKeys = Arrays.asList("Key3", "Key2", "Key1");
        SymbolTable<String, Integer> st = new SequentialSearchST<>();
        List<String> keys1= (List<String>) st.keys();

        for(int i = 1;i <= 3; i++){
            String key = "Key" + i;
            st.put(key, i);
        }
        List<String> keys2 = (List<String>) st.keys();

        st.delete("Key2");
        List<String> keys3 = (List<String>) st.keys();

        st.delete("Key3");
        st.delete("Key1");

        List<String> keys4 = (List<String>) st.keys();


        assertAll(
                () -> assertEquals(0, keys1.size()),
                () -> assertEquals(3, keys2.size()),
                () -> assertIterableEquals(expectedKeys,keys2),
                () -> assertEquals(2, keys3.size()),
                () -> assertEquals(0, keys4.size())
        );
    }

    @Test
    void testPutNullKey(){
        SymbolTable<String, Integer> st = new SequentialSearchST<>();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            st.put(null,1);
        });

        assertAll(
                () -> assertThrows(IllegalArgumentException.class, () -> st.put(null, 1)),
                () -> assertThrows(IllegalArgumentException.class, () -> st.contains(null)),
                () -> assertThrows(IllegalArgumentException.class, () -> st.delete(null))

                );
    }

    @Test
    void testPutNullValue(){
        SymbolTable<String, Integer> st = new SequentialSearchST<>();

        st.put("Key1",1);
        int size1 = st.size();
        st.put("Key1",null);
        int size2 = st.size();

        assertAll(
                () -> assertEquals(1, size1),
                () -> assertEquals(0, size2)
        );

    }
}