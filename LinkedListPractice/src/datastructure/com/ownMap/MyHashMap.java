package datastructure.com.ownMap;

import java.util.Arrays;

public class MyHashMap<K, V> {
	
	private class Entry<K, V>{
		K key;
		V value;
		Entry next;
		public Entry(K key, V value) {
			this.key = key;
			this.value = value;
		}
		public K getKey() {
			return key;
		}
		
		public V getValue() {
			return value;
		}
		
		public void setValue(V value) {
			this.value = value;
		}	
		
		@Override
		public String toString() {
			Entry<K, V> temp = this;
			StringBuilder sb = new StringBuilder();
			while(temp != null) {
				sb.append(temp.getKey()+" -> "+temp.getValue()+",");
				temp = temp.next;
			}
			return sb.toString();
		}
	}
	
	private class TreeNode<K, V>{
		
	}
	
	private final int SIZE = 5;
	
	private Entry<K, V> table[];
	
	public MyHashMap() {
		table = new Entry[SIZE];
	}
	
	public void put(K key, V value) {
		int hash = key.hashCode() % SIZE; // key.hashCode() will return something like 23563 so % will make it between range of 0-9
		Entry e = table[hash];
		if(e == null) {
			table[hash] = new Entry(key, value);
		}
		else {
			while(e.next != null) {
				if(e.getKey() == key) {
					e.setValue(value);
					return;
				}
				e = e.next;
			}
			if(e.getKey() == key) {
				e.setValue(value);
				return;
			}
			e.next = new Entry(key, value);
		}
		
	}
	
	public V get(K key) {
		int hash = key.hashCode() % SIZE;
		Entry<K, V> e = table[hash];
		if(e == null) {
			return null;
		}
		else {
			while(e != null) {
				if(e.getKey() == key) {
					return e.getValue();
				}
				e = e.next;
			}
		}		
		return null;
	}
	
	public Entry<K, V> remove(K key){
		int hash = key.hashCode() % SIZE;
		Entry<K, V> e = table[hash];
		if(e == null) {
			return null;
		}
		if(e.getKey() == key) {
			table[hash] = e.next;
			e.next = null;
			return e;
		}
		Entry<K, V> prev = e;
		e = e.next;
		while(e!=null) {
			if(e.getKey() == key) {
				prev.next = e.next;
				e.next = null;
				return e;
			}
			prev = e;
			e = e.next;
		}
		return null;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<SIZE; i++) {
			if(table[i] != null) {
				sb.append(i + " " + table[i] + "\n");
			}
			else {
				sb.append(i + " " + null + "\n");
			}
		}
		return sb.toString();
	}
	
	
}
