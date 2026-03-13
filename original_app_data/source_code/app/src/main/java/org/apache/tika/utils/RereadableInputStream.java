package org.apache.tika.utils;

import Ne.h;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class RereadableInputStream extends InputStream {
    private static final int DEFAULT_MAX_BYTES_IN_MEMORY = 536870912;
    private int bufferHighWaterMark;
    private int bufferPointer;
    private byte[] byteBuffer;
    private final boolean closeOriginalStreamOnClose;
    private boolean closed;
    private InputStream inputStream;
    private final int maxBytesInMemory;
    private final InputStream originalInputStream;
    private boolean readingFromBuffer;
    private File storeFile;
    private OutputStream storeOutputStream;

    public RereadableInputStream(InputStream inputStream) {
        this(inputStream, DEFAULT_MAX_BYTES_IN_MEMORY, true);
    }

    private void closeStream() throws IOException {
        InputStream inputStream = this.originalInputStream;
        InputStream inputStream2 = this.inputStream;
        if (inputStream != inputStream2) {
            inputStream2.close();
        }
        if (this.closeOriginalStreamOnClose) {
            this.originalInputStream.close();
        }
    }

    private void saveByte(int i10) throws IOException {
        byte[] bArr = this.byteBuffer;
        if (bArr == null) {
            this.storeOutputStream.write(i10);
            return;
        }
        int i11 = this.bufferPointer;
        if (i11 != this.maxBytesInMemory) {
            this.bufferPointer = i11 + 1;
            bArr[i11] = (byte) i10;
            return;
        }
        this.storeFile = Files.createTempFile("TIKA_streamstore_", ".tmp", new FileAttribute[0]).toFile();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(this.storeFile));
        this.storeOutputStream = bufferedOutputStream;
        bufferedOutputStream.write(this.byteBuffer, 0, this.bufferPointer);
        this.storeOutputStream.write(i10);
        this.byteBuffer = null;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        closeStream();
        OutputStream outputStream = this.storeOutputStream;
        if (outputStream != null) {
            outputStream.close();
            this.storeOutputStream = null;
        }
        super.close();
        File file = this.storeFile;
        if (file != null) {
            file.delete();
        }
        this.closed = true;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        InputStream inputStream;
        if (this.closed) {
            throw new IOException("Stream is already closed");
        }
        int i10 = this.inputStream.read();
        if (i10 == -1 && (inputStream = this.inputStream) != this.originalInputStream) {
            if (this.readingFromBuffer) {
                this.readingFromBuffer = false;
                inputStream.close();
            } else {
                inputStream.close();
                this.storeOutputStream = new BufferedOutputStream(new FileOutputStream(this.storeFile, true));
            }
            InputStream inputStream2 = this.originalInputStream;
            this.inputStream = inputStream2;
            i10 = inputStream2.read();
        }
        if (i10 != -1 && this.inputStream == this.originalInputStream) {
            saveByte(i10);
        }
        return i10;
    }

    public void rewind() throws IOException {
        if (this.closed) {
            throw new IOException("Stream is already closed");
        }
        OutputStream outputStream = this.storeOutputStream;
        if (outputStream != null) {
            outputStream.close();
            this.storeOutputStream = null;
        }
        InputStream inputStream = this.inputStream;
        if (inputStream != this.originalInputStream) {
            inputStream.close();
        }
        int iMax = Math.max(this.bufferPointer, this.bufferHighWaterMark);
        this.bufferHighWaterMark = iMax;
        this.bufferPointer = iMax;
        if (iMax <= 0) {
            this.inputStream = this.originalInputStream;
        } else if (this.byteBuffer == null) {
            this.inputStream = new BufferedInputStream(new FileInputStream(this.storeFile));
        } else {
            this.readingFromBuffer = true;
            this.inputStream = h.a().p(this.byteBuffer).r(0).q(this.bufferHighWaterMark).o();
        }
    }

    public RereadableInputStream(InputStream inputStream, boolean z10) {
        this(inputStream, DEFAULT_MAX_BYTES_IN_MEMORY, z10);
    }

    public RereadableInputStream(InputStream inputStream, int i10) {
        this(inputStream, i10, true);
    }

    public RereadableInputStream(InputStream inputStream, int i10, boolean z10) {
        this.inputStream = inputStream;
        this.originalInputStream = inputStream;
        this.maxBytesInMemory = i10;
        this.byteBuffer = new byte[i10];
        this.closeOriginalStreamOnClose = z10;
    }
}
