package com.fasterxml.jackson.core.util;

import java.io.OutputStream;
import java.util.LinkedList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class ByteArrayBuilder extends OutputStream {
    static final int DEFAULT_BLOCK_ARRAY_SIZE = 40;
    private static final int INITIAL_BLOCK_SIZE = 500;
    private static final int MAX_BLOCK_SIZE = 131072;
    public static final byte[] NO_BYTES = new byte[0];
    private final BufferRecycler _bufferRecycler;
    private byte[] _currBlock;
    private int _currBlockPtr;
    private final LinkedList<byte[]> _pastBlocks;
    private int _pastLen;

    public ByteArrayBuilder() {
        this((BufferRecycler) null);
    }

    private void _allocMore() {
        int length = this._pastLen + this._currBlock.length;
        if (length < 0) {
            throw new IllegalStateException("Maximum Java array size (2GB) exceeded by `ByteArrayBuilder`");
        }
        this._pastLen = length;
        int iMax = Math.max(length >> 1, 1000);
        if (iMax > MAX_BLOCK_SIZE) {
            iMax = MAX_BLOCK_SIZE;
        }
        this._pastBlocks.add(this._currBlock);
        this._currBlock = new byte[iMax];
        this._currBlockPtr = 0;
    }

    public static ByteArrayBuilder fromInitial(byte[] bArr, int i10) {
        return new ByteArrayBuilder(null, bArr, i10);
    }

    public void append(int i10) {
        if (this._currBlockPtr >= this._currBlock.length) {
            _allocMore();
        }
        byte[] bArr = this._currBlock;
        int i11 = this._currBlockPtr;
        this._currBlockPtr = i11 + 1;
        bArr[i11] = (byte) i10;
    }

    public void appendFourBytes(int i10) {
        int i11 = this._currBlockPtr;
        int i12 = i11 + 3;
        byte[] bArr = this._currBlock;
        if (i12 >= bArr.length) {
            append(i10 >> 24);
            append(i10 >> 16);
            append(i10 >> 8);
            append(i10);
            return;
        }
        int i13 = i11 + 1;
        this._currBlockPtr = i13;
        bArr[i11] = (byte) (i10 >> 24);
        int i14 = i11 + 2;
        this._currBlockPtr = i14;
        bArr[i13] = (byte) (i10 >> 16);
        int i15 = i11 + 3;
        this._currBlockPtr = i15;
        bArr[i14] = (byte) (i10 >> 8);
        this._currBlockPtr = i11 + 4;
        bArr[i15] = (byte) i10;
    }

    public void appendThreeBytes(int i10) {
        int i11 = this._currBlockPtr;
        int i12 = i11 + 2;
        byte[] bArr = this._currBlock;
        if (i12 >= bArr.length) {
            append(i10 >> 16);
            append(i10 >> 8);
            append(i10);
            return;
        }
        int i13 = i11 + 1;
        this._currBlockPtr = i13;
        bArr[i11] = (byte) (i10 >> 16);
        int i14 = i11 + 2;
        this._currBlockPtr = i14;
        bArr[i13] = (byte) (i10 >> 8);
        this._currBlockPtr = i11 + 3;
        bArr[i14] = (byte) i10;
    }

    public void appendTwoBytes(int i10) {
        int i11 = this._currBlockPtr;
        int i12 = i11 + 1;
        byte[] bArr = this._currBlock;
        if (i12 >= bArr.length) {
            append(i10 >> 8);
            append(i10);
            return;
        }
        int i13 = i11 + 1;
        this._currBlockPtr = i13;
        bArr[i11] = (byte) (i10 >> 8);
        this._currBlockPtr = i11 + 2;
        bArr[i13] = (byte) i10;
    }

    public byte[] completeAndCoalesce(int i10) {
        this._currBlockPtr = i10;
        return toByteArray();
    }

    public byte[] finishCurrentSegment() {
        _allocMore();
        return this._currBlock;
    }

    public byte[] getCurrentSegment() {
        return this._currBlock;
    }

    public int getCurrentSegmentLength() {
        return this._currBlockPtr;
    }

    public void release() {
        byte[] bArr;
        reset();
        BufferRecycler bufferRecycler = this._bufferRecycler;
        if (bufferRecycler == null || (bArr = this._currBlock) == null) {
            return;
        }
        bufferRecycler.releaseByteBuffer(2, bArr);
        this._currBlock = null;
    }

    public void reset() {
        this._pastLen = 0;
        this._currBlockPtr = 0;
        if (this._pastBlocks.isEmpty()) {
            return;
        }
        this._pastBlocks.clear();
    }

    public byte[] resetAndGetFirstSegment() {
        reset();
        return this._currBlock;
    }

    public void setCurrentSegmentLength(int i10) {
        this._currBlockPtr = i10;
    }

    public int size() {
        return this._pastLen + this._currBlockPtr;
    }

    public byte[] toByteArray() {
        int i10 = this._pastLen + this._currBlockPtr;
        if (i10 == 0) {
            return NO_BYTES;
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (byte[] bArr2 : this._pastBlocks) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i11, length);
            i11 += length;
        }
        System.arraycopy(this._currBlock, 0, bArr, i11, this._currBlockPtr);
        int i12 = i11 + this._currBlockPtr;
        if (i12 == i10) {
            if (!this._pastBlocks.isEmpty()) {
                reset();
            }
            return bArr;
        }
        throw new RuntimeException("Internal error: total len assumed to be " + i10 + ", copied " + i12 + " bytes");
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public ByteArrayBuilder(BufferRecycler bufferRecycler) {
        this(bufferRecycler, 500);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        while (true) {
            int iMin = Math.min(this._currBlock.length - this._currBlockPtr, i11);
            if (iMin > 0) {
                System.arraycopy(bArr, i10, this._currBlock, this._currBlockPtr, iMin);
                i10 += iMin;
                this._currBlockPtr += iMin;
                i11 -= iMin;
            }
            if (i11 <= 0) {
                return;
            } else {
                _allocMore();
            }
        }
    }

    public ByteArrayBuilder(int i10) {
        this(null, i10);
    }

    public ByteArrayBuilder(BufferRecycler bufferRecycler, int i10) {
        this._pastBlocks = new LinkedList<>();
        this._bufferRecycler = bufferRecycler;
        this._currBlock = bufferRecycler == null ? new byte[i10] : bufferRecycler.allocByteBuffer(2);
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        append(i10);
    }

    private ByteArrayBuilder(BufferRecycler bufferRecycler, byte[] bArr, int i10) {
        this._pastBlocks = new LinkedList<>();
        this._bufferRecycler = null;
        this._currBlock = bArr;
        this._currBlockPtr = i10;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
    }
}
