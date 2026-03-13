package com.fasterxml.jackson.databind.util;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class LRUMap<K, V> implements Serializable {
    private static final long serialVersionUID = 1;
    protected transient int _jdkSerializeMaxEntries;
    protected final transient ConcurrentHashMap<K, V> _map;
    protected final transient int _maxEntries;

    public LRUMap(int i10, int i11) {
        this._map = new ConcurrentHashMap<>(i10, 0.8f, 4);
        this._maxEntries = i11;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this._jdkSerializeMaxEntries = objectInputStream.readInt();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this._jdkSerializeMaxEntries);
    }

    public void clear() {
        this._map.clear();
    }

    public V get(Object obj) {
        return this._map.get(obj);
    }

    public V put(K k10, V v10) {
        if (this._map.size() >= this._maxEntries) {
            synchronized (this) {
                try {
                    if (this._map.size() >= this._maxEntries) {
                        clear();
                    }
                } finally {
                }
            }
        }
        return this._map.put(k10, v10);
    }

    public V putIfAbsent(K k10, V v10) {
        if (this._map.size() >= this._maxEntries) {
            synchronized (this) {
                try {
                    if (this._map.size() >= this._maxEntries) {
                        clear();
                    }
                } finally {
                }
            }
        }
        return this._map.putIfAbsent(k10, v10);
    }

    public Object readResolve() {
        int i10 = this._jdkSerializeMaxEntries;
        return new LRUMap(i10, i10);
    }

    public int size() {
        return this._map.size();
    }
}
