package datastructure.com.ownMap;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.ReentrantLock;

public class MyOwnConcurrentHashMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {
	   
    final Segment<K,V>[] segments;
    // Other varialbes

    static final class HashEntry<K,V> {
        final int hash;
        final K key;
        volatile V value;
        volatile HashEntry<K,V> next;
            // Constructors + utility methods
    }

    static final class Segment<K,V> extends ReentrantLock implements Serializable {
            // Implementations of methods like replace,clear,put etc. 
            // Each such operation is handled by the particular Segment.
    }

    public boolean isEmpty() {
      // checks by iterating through all the segments.
    }

    public int size() {
        // Iterates through all the segments to get the count/size.
    }

    // Performed without acquiring the lock.
    public V get(Object key) {
        // Get segment
        // Get HashEntries for that Segment
        // itarate over the HashEntries to compare the Key.
    }

    public boolean containsValue(Object value) {
        // Iterates over all the Segments.
        // To check any Segment, locks it and then gets all HashEntries, and compare each of them.
        // Releases the lock for that segment after it.
    }

    public V put(K key, V value) {
        // Gets the Segment, and calls the put method implemented within that segment.
    }

    public V remove(Object key) {
        // Gets the Segment, and calls the remove method implemented within that segment.
    }

    public boolean replace(K key, V oldValue, V newValue) {
         // Gets the Segment, and calls the replace method implemented within that segment.
    }

    public void clear() {
        // Gets the Segment, and calls the clear method implemented within that segment.
    }
}


static final class Segment<K,V> extends ReentrantLock implements Serializable {
    
    transient volatile HashEntry<K,V>[] table;
    transient int threshold;
    final float loadFactor;

    final V put(K key, int hash, V value, boolean onlyIfAbsent) {
        // Obtain the lock on the current Segment
        HashEntry<K,V> node = tryLock() ? null : scanAndLockForPut(key, hash, value); 
        try {
            // Do normal Put operation like in hashmap
        } finally {
            // Release the lock after put is finished.
            unlock();
        }
    }

    /**
     * Remove; match on key only if value null, else match both.
     */
    final V remove(Object key, int hash, Object value) {
        // Obtain the lock on the current Segment
        if (!tryLock())
            scanAndLock(key, hash);
        
        try {
            // Normal Remove operation as in HashMap.
        } finally {
            // Release the lock once the remove is done.
            unlock();
        }
        
    }

    final boolean replace(K key, int hash, V oldValue, V newValue) {
        // Obtain the lock on the current Segment
        if (!tryLock())
            scanAndLock(key, hash);
        try {
            // Normal Replace operation as in HashMap.
        } finally {
             // Release the lock once the remove is done.
            unlock();
        }
        return replaced;
    }

    final void clear() {
       // Obtain the lock on the current Segment
        lock();
        try {
            // Normal clear operation as in HashMap.
        } finally {
                // Release the lock once the clear is done.
            unlock();
        }
    }
}