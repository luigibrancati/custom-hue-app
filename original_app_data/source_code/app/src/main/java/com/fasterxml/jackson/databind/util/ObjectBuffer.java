package com.fasterxml.jackson.databind.util;

import java.lang.reflect.Array;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class ObjectBuffer {
    private static final int MAX_CHUNK = 262144;
    private static final int SMALL_CHUNK = 16384;
    private Object[] _freeBuffer;
    private LinkedNode<Object[]> _head;
    private int _size;
    private LinkedNode<Object[]> _tail;

    public final void _copyTo(Object obj, int i10, Object[] objArr, int i11) {
        int i12 = 0;
        for (LinkedNode<Object[]> next = this._head; next != null; next = next.next()) {
            Object[] objArrValue = next.value();
            int length = objArrValue.length;
            System.arraycopy(objArrValue, 0, obj, i12, length);
            i12 += length;
        }
        System.arraycopy(objArr, 0, obj, i12, i11);
        int i13 = i12 + i11;
        if (i13 == i10) {
            return;
        }
        throw new IllegalStateException("Should have gotten " + i10 + " entries, got " + i13);
    }

    public void _reset() {
        LinkedNode<Object[]> linkedNode = this._tail;
        if (linkedNode != null) {
            this._freeBuffer = linkedNode.value();
        }
        this._tail = null;
        this._head = null;
        this._size = 0;
    }

    public Object[] appendCompletedChunk(Object[] objArr) {
        LinkedNode<Object[]> linkedNode = new LinkedNode<>(objArr, null);
        if (this._head == null) {
            this._tail = linkedNode;
            this._head = linkedNode;
        } else {
            this._tail.linkNext(linkedNode);
            this._tail = linkedNode;
        }
        int length = objArr.length;
        this._size += length;
        if (length < SMALL_CHUNK) {
            length += length;
        } else if (length < MAX_CHUNK) {
            length += length >> 2;
        }
        return new Object[length];
    }

    public int bufferedSize() {
        return this._size;
    }

    public Object[] completeAndClearBuffer(Object[] objArr, int i10) {
        int i11 = this._size + i10;
        Object[] objArr2 = new Object[i11];
        _copyTo(objArr2, i11, objArr, i10);
        _reset();
        return objArr2;
    }

    public int initialCapacity() {
        Object[] objArr = this._freeBuffer;
        if (objArr == null) {
            return 0;
        }
        return objArr.length;
    }

    public Object[] resetAndStart() {
        _reset();
        Object[] objArr = this._freeBuffer;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArr2 = new Object[12];
        this._freeBuffer = objArr2;
        return objArr2;
    }

    public Object[] resetAndStart(Object[] objArr, int i10) {
        _reset();
        Object[] objArr2 = this._freeBuffer;
        if (objArr2 == null || objArr2.length < i10) {
            this._freeBuffer = new Object[Math.max(12, i10)];
        }
        System.arraycopy(objArr, 0, this._freeBuffer, 0, i10);
        return this._freeBuffer;
    }

    public <T> T[] completeAndClearBuffer(Object[] objArr, int i10, Class<T> cls) {
        int i11 = this._size + i10;
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i11));
        _copyTo(tArr, i11, objArr, i10);
        _reset();
        return tArr;
    }

    public void completeAndClearBuffer(Object[] objArr, int i10, List<Object> list) {
        int i11;
        LinkedNode<Object[]> next = this._head;
        while (true) {
            i11 = 0;
            if (next == null) {
                break;
            }
            Object[] objArrValue = next.value();
            int length = objArrValue.length;
            while (i11 < length) {
                list.add(objArrValue[i11]);
                i11++;
            }
            next = next.next();
        }
        while (i11 < i10) {
            list.add(objArr[i11]);
            i11++;
        }
        _reset();
    }
}
