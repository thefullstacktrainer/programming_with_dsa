package org.excelr.day5;

import java.util.LinkedList;

class HashTable<K, V> {
    private static final int SIZE = 10;
    private LinkedList<Entry<K, V>>[] table;

    public HashTable() {
        table = new LinkedList[SIZE];
    }

    public void put(K key, V value) {
        int index = hash(key);
        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }

        // Check if the key already exists in the bucket
        for (Entry<K, V> entry : table[index]) {
            if (entry.key.equals(key)) {
                entry.value = value; // Update the value if the key already exists
                return;
            }
        }

        // Add a new entry to the bucket
        table[index].add(new Entry<>(key, value));
    }

    public V get(K key) {
        int index = hash(key);
        LinkedList<Entry<K, V>> bucket = table[index];

        // Check if the bucket is not null
        if (bucket != null) {
            // Search for the key in the bucket
            for (Entry<K, V> entry : bucket) {
                if (entry.key.equals(key)) {
                    return entry.value; // Return the value if the key is found
                }
            }
        }

        return null; // Key not found
    }

    private int hash(K key) {
        return key.hashCode() % SIZE;
    }

    private static class Entry<K, V> {
        K key;
        V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
