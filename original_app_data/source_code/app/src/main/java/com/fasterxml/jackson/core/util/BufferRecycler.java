package com.fasterxml.jackson.core.util;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class BufferRecycler {
    public static final int BYTE_BASE64_CODEC_BUFFER = 3;
    public static final int BYTE_READ_IO_BUFFER = 0;
    public static final int BYTE_WRITE_CONCAT_BUFFER = 2;
    public static final int BYTE_WRITE_ENCODING_BUFFER = 1;
    public static final int CHAR_CONCAT_BUFFER = 1;
    public static final int CHAR_NAME_COPY_BUFFER = 3;
    public static final int CHAR_TEXT_BUFFER = 2;
    public static final int CHAR_TOKEN_BUFFER = 0;
    protected final AtomicReferenceArray<byte[]> _byteBuffers;
    protected final AtomicReferenceArray<char[]> _charBuffers;
    private static final int[] BYTE_BUFFER_LENGTHS = {8000, 8000, 2000, 2000};
    private static final int[] CHAR_BUFFER_LENGTHS = {4000, 4000, 200, 200};

    public BufferRecycler() {
        this(4, 4);
    }

    public final byte[] allocByteBuffer(int i10) {
        return allocByteBuffer(i10, 0);
    }

    public final char[] allocCharBuffer(int i10) {
        return allocCharBuffer(i10, 0);
    }

    public byte[] balloc(int i10) {
        return new byte[i10];
    }

    public int byteBufferLength(int i10) {
        return BYTE_BUFFER_LENGTHS[i10];
    }

    public char[] calloc(int i10) {
        return new char[i10];
    }

    public int charBufferLength(int i10) {
        return CHAR_BUFFER_LENGTHS[i10];
    }

    public void releaseByteBuffer(int i10, byte[] bArr) {
        this._byteBuffers.set(i10, bArr);
    }

    public void releaseCharBuffer(int i10, char[] cArr) {
        this._charBuffers.set(i10, cArr);
    }

    public BufferRecycler(int i10, int i11) {
        this._byteBuffers = new AtomicReferenceArray<>(i10);
        this._charBuffers = new AtomicReferenceArray<>(i11);
    }

    public byte[] allocByteBuffer(int i10, int i11) {
        int iByteBufferLength = byteBufferLength(i10);
        if (i11 < iByteBufferLength) {
            i11 = iByteBufferLength;
        }
        byte[] andSet = this._byteBuffers.getAndSet(i10, null);
        return (andSet == null || andSet.length < i11) ? balloc(i11) : andSet;
    }

    public char[] allocCharBuffer(int i10, int i11) {
        int iCharBufferLength = charBufferLength(i10);
        if (i11 < iCharBufferLength) {
            i11 = iCharBufferLength;
        }
        char[] andSet = this._charBuffers.getAndSet(i10, null);
        return (andSet == null || andSet.length < i11) ? calloc(i11) : andSet;
    }
}
