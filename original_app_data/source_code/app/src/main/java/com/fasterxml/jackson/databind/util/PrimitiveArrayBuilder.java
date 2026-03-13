package com.fasterxml.jackson.databind.util;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class PrimitiveArrayBuilder<T> {
    static final int INITIAL_CHUNK_SIZE = 12;
    static final int MAX_CHUNK_SIZE = 262144;
    static final int SMALL_CHUNK_SIZE = 16384;
    protected Node<T> _bufferHead;
    protected Node<T> _bufferTail;
    protected int _bufferedEntryCount;
    protected T _freeBuffer;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Node<T> {
        final T _data;
        final int _dataLength;
        Node<T> _next;

        public Node(T t10, int i10) {
            this._data = t10;
            this._dataLength = i10;
        }

        public int copyData(T t10, int i10) {
            System.arraycopy(this._data, 0, t10, i10, this._dataLength);
            return i10 + this._dataLength;
        }

        public T getData() {
            return this._data;
        }

        public void linkNext(Node<T> node) {
            if (this._next != null) {
                throw new IllegalStateException();
            }
            this._next = node;
        }

        public Node<T> next() {
            return this._next;
        }
    }

    public abstract T _constructArray(int i10);

    public void _reset() {
        Node<T> node = this._bufferTail;
        if (node != null) {
            this._freeBuffer = node.getData();
        }
        this._bufferTail = null;
        this._bufferHead = null;
        this._bufferedEntryCount = 0;
    }

    public final T appendCompletedChunk(T t10, int i10) {
        Node<T> node = new Node<>(t10, i10);
        if (this._bufferHead == null) {
            this._bufferTail = node;
            this._bufferHead = node;
        } else {
            this._bufferTail.linkNext(node);
            this._bufferTail = node;
        }
        this._bufferedEntryCount += i10;
        return _constructArray(i10 < SMALL_CHUNK_SIZE ? i10 + i10 : i10 + (i10 >> 2));
    }

    public int bufferedSize() {
        return this._bufferedEntryCount;
    }

    public T completeAndClearBuffer(T t10, int i10) {
        int i11 = this._bufferedEntryCount + i10;
        T t_constructArray = _constructArray(i11);
        int iCopyData = 0;
        for (Node<T> next = this._bufferHead; next != null; next = next.next()) {
            iCopyData = next.copyData(t_constructArray, iCopyData);
        }
        System.arraycopy(t10, 0, t_constructArray, iCopyData, i10);
        int i12 = iCopyData + i10;
        if (i12 == i11) {
            return t_constructArray;
        }
        throw new IllegalStateException("Should have gotten " + i11 + " entries, got " + i12);
    }

    public T resetAndStart() {
        _reset();
        T t10 = this._freeBuffer;
        return t10 == null ? _constructArray(12) : t10;
    }
}
