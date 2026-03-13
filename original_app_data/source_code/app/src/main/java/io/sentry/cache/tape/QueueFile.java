package io.sentry.cache.tape;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class QueueFile implements Closeable, Iterable<byte[]> {
    static final int INITIAL_LENGTH = 4096;
    private static final int VERSIONED_HEADER = -2147483647;
    private static final byte[] ZEROES = new byte[4096];
    boolean closed;
    int elementCount;
    final File file;
    long fileLength;
    Element first;
    private Element last;
    private final int maxElements;
    RandomAccessFile raf;
    private final boolean zero;
    final int headerLength = 32;
    private final byte[] buffer = new byte[32];
    int modCount = 0;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Builder {
        final File file;
        boolean zero = true;
        int size = -1;

        public Builder(File file) {
            if (file == null) {
                throw new NullPointerException("file == null");
            }
            this.file = file;
        }

        public QueueFile build() throws IOException {
            RandomAccessFile randomAccessFileInitializeFromFile = QueueFile.initializeFromFile(this.file);
            try {
                return new QueueFile(this.file, randomAccessFileInitializeFromFile, this.zero, this.size);
            } catch (Throwable th) {
                randomAccessFileInitializeFromFile.close();
                throw th;
            }
        }

        public Builder size(int i10) {
            this.size = i10;
            return this;
        }

        public Builder zero(boolean z10) {
            this.zero = z10;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Element {
        static final int HEADER_LENGTH = 4;
        static final Element NULL = new Element(0, 0);
        final int length;
        final long position;

        public Element(long j10, int i10) {
            this.position = j10;
            this.length = i10;
        }

        public String toString() {
            return Element.class.getSimpleName() + "[position=" + this.position + ", length=" + this.length + "]";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class ElementIterator implements Iterator<byte[]> {
        int expectedModCount;
        int nextElementIndex = 0;
        private long nextElementPosition;

        public ElementIterator() {
            this.nextElementPosition = QueueFile.this.first.position;
            this.expectedModCount = QueueFile.this.modCount;
        }

        private void checkForComodification() {
            if (QueueFile.this.modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (QueueFile.this.closed) {
                throw new IllegalStateException("closed");
            }
            checkForComodification();
            return this.nextElementIndex != QueueFile.this.elementCount;
        }

        @Override // java.util.Iterator
        public void remove() {
            checkForComodification();
            if (QueueFile.this.isEmpty()) {
                throw new NoSuchElementException();
            }
            if (this.nextElementIndex != 1) {
                throw new UnsupportedOperationException("Removal is only permitted from the head.");
            }
            try {
                QueueFile.this.remove();
                this.expectedModCount = QueueFile.this.modCount;
                this.nextElementIndex--;
            } catch (IOException e10) {
                throw ((Error) QueueFile.getSneakyThrowable(e10));
            }
        }

        @Override // java.util.Iterator
        public byte[] next() {
            if (QueueFile.this.closed) {
                throw new IllegalStateException("closed");
            }
            checkForComodification();
            if (QueueFile.this.isEmpty()) {
                throw new NoSuchElementException();
            }
            int i10 = this.nextElementIndex;
            QueueFile queueFile = QueueFile.this;
            if (i10 >= queueFile.elementCount) {
                throw new NoSuchElementException();
            }
            try {
                try {
                    Element element = queueFile.readElement(this.nextElementPosition);
                    byte[] bArr = new byte[element.length];
                    long jWrapPosition = QueueFile.this.wrapPosition(element.position + 4);
                    this.nextElementPosition = jWrapPosition;
                    if (!QueueFile.this.ringRead(jWrapPosition, bArr, 0, element.length)) {
                        this.nextElementIndex = QueueFile.this.elementCount;
                        return QueueFile.ZEROES;
                    }
                    this.nextElementPosition = QueueFile.this.wrapPosition(element.position + 4 + ((long) element.length));
                    this.nextElementIndex++;
                    return bArr;
                } catch (IOException e10) {
                    throw ((Error) QueueFile.getSneakyThrowable(e10));
                } catch (OutOfMemoryError unused) {
                    QueueFile.this.resetFile();
                    this.nextElementIndex = QueueFile.this.elementCount;
                    return QueueFile.ZEROES;
                }
            } catch (IOException e11) {
                throw ((Error) QueueFile.getSneakyThrowable(e11));
            }
        }
    }

    public QueueFile(File file, RandomAccessFile randomAccessFile, boolean z10, int i10) throws IOException {
        this.file = file;
        this.raf = randomAccessFile;
        this.zero = z10;
        this.maxElements = i10;
        readInitialData();
    }

    private void expandIfNecessary(long j10) throws IOException {
        long j11;
        long j12;
        long j13 = j10 + 4;
        long jRemainingBytes = remainingBytes();
        if (jRemainingBytes >= j13) {
            return;
        }
        long j14 = this.fileLength;
        do {
            jRemainingBytes += j14;
            j14 <<= 1;
        } while (jRemainingBytes < j13);
        setLength(j14);
        Element element = this.last;
        long jWrapPosition = wrapPosition(element.position + 4 + ((long) element.length));
        if (jWrapPosition <= this.first.position) {
            FileChannel channel = this.raf.getChannel();
            channel.position(this.fileLength);
            j11 = jWrapPosition - 32;
            if (channel.transferTo(32L, j11, channel) != j11) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        } else {
            j11 = 0;
        }
        long j15 = this.last.position;
        long j16 = this.first.position;
        if (j15 < j16) {
            long j17 = (this.fileLength + j15) - 32;
            writeHeader(j14, this.elementCount, j16, j17);
            this.last = new Element(j17, this.last.length);
            j12 = j14;
        } else {
            writeHeader(j14, this.elementCount, j16, j15);
            j12 = j14;
        }
        this.fileLength = j12;
        if (this.zero) {
            ringErase(32L, j11);
        }
    }

    public static RandomAccessFile initializeFromFile(File file) throws IOException {
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFileOpen = open(file2);
            try {
                randomAccessFileOpen.setLength(4096L);
                randomAccessFileOpen.seek(0L);
                randomAccessFileOpen.writeInt(VERSIONED_HEADER);
                randomAccessFileOpen.writeLong(4096L);
                randomAccessFileOpen.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFileOpen.close();
                throw th;
            }
        }
        return open(file);
    }

    private static RandomAccessFile open(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    private void readInitialData() throws IOException {
        this.raf.seek(0L);
        this.raf.readFully(this.buffer);
        this.fileLength = readLong(this.buffer, 4);
        this.elementCount = readInt(this.buffer, 12);
        long j10 = readLong(this.buffer, 16);
        long j11 = readLong(this.buffer, 24);
        if (this.fileLength > this.raf.length()) {
            throw new IOException("File is truncated. Expected length: " + this.fileLength + ", Actual length: " + this.raf.length());
        }
        if (this.fileLength > 32) {
            this.first = readElement(j10);
            this.last = readElement(j11);
        } else {
            throw new IOException("File is corrupt; length stored in header (" + this.fileLength + ") is invalid.");
        }
    }

    private static int readInt(byte[] bArr, int i10) {
        return ((bArr[i10] & ForkServer.ERROR) << 24) + ((bArr[i10 + 1] & ForkServer.ERROR) << 16) + ((bArr[i10 + 2] & ForkServer.ERROR) << 8) + (bArr[i10 + 3] & ForkServer.ERROR);
    }

    private static long readLong(byte[] bArr, int i10) {
        return ((((long) bArr[i10]) & 255) << 56) + ((((long) bArr[i10 + 1]) & 255) << 48) + ((((long) bArr[i10 + 2]) & 255) << 40) + ((((long) bArr[i10 + 3]) & 255) << 32) + ((((long) bArr[i10 + 4]) & 255) << 24) + ((((long) bArr[i10 + 5]) & 255) << 16) + ((((long) bArr[i10 + 6]) & 255) << 8) + (((long) bArr[i10 + 7]) & 255);
    }

    private long remainingBytes() {
        return this.fileLength - usedBytes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetFile() throws IOException {
        this.raf.close();
        this.file.delete();
        this.raf = initializeFromFile(this.file);
        readInitialData();
    }

    private void ringErase(long j10, long j11) throws IOException {
        long j12 = j10;
        while (j11 > 0) {
            byte[] bArr = ZEROES;
            int iMin = (int) Math.min(j11, bArr.length);
            QueueFile queueFile = this;
            queueFile.ringWrite(j12, bArr, 0, iMin);
            long j13 = iMin;
            j11 -= j13;
            j12 += j13;
            this = queueFile;
        }
    }

    private void ringWrite(long j10, byte[] bArr, int i10, int i11) throws IOException {
        long jWrapPosition = wrapPosition(j10);
        long j11 = ((long) i11) + jWrapPosition;
        long j12 = this.fileLength;
        if (j11 <= j12) {
            this.raf.seek(jWrapPosition);
            this.raf.write(bArr, i10, i11);
            return;
        }
        int i12 = (int) (j12 - jWrapPosition);
        this.raf.seek(jWrapPosition);
        this.raf.write(bArr, i10, i12);
        this.raf.seek(32L);
        this.raf.write(bArr, i10 + i12, i11 - i12);
    }

    private void setLength(long j10) throws IOException {
        this.raf.setLength(j10);
        this.raf.getChannel().force(true);
    }

    private long usedBytes() {
        if (this.elementCount == 0) {
            return 32L;
        }
        Element element = this.last;
        long j10 = element.position;
        long j11 = this.first.position;
        return j10 >= j11 ? (j10 - j11) + 4 + ((long) element.length) + 32 : (((j10 + 4) + ((long) element.length)) + this.fileLength) - j11;
    }

    private void writeHeader(long j10, int i10, long j11, long j12) throws IOException {
        this.raf.seek(0L);
        writeInt(this.buffer, 0, VERSIONED_HEADER);
        writeLong(this.buffer, 4, j10);
        writeInt(this.buffer, 12, i10);
        writeLong(this.buffer, 16, j11);
        writeLong(this.buffer, 24, j12);
        this.raf.write(this.buffer, 0, 32);
    }

    private static void writeInt(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 >> 24);
        bArr[i10 + 1] = (byte) (i11 >> 16);
        bArr[i10 + 2] = (byte) (i11 >> 8);
        bArr[i10 + 3] = (byte) i11;
    }

    private static void writeLong(byte[] bArr, int i10, long j10) {
        bArr[i10] = (byte) (j10 >> 56);
        bArr[i10 + 1] = (byte) (j10 >> 48);
        bArr[i10 + 2] = (byte) (j10 >> 40);
        bArr[i10 + 3] = (byte) (j10 >> 32);
        bArr[i10 + 4] = (byte) (j10 >> 24);
        bArr[i10 + 5] = (byte) (j10 >> 16);
        bArr[i10 + 6] = (byte) (j10 >> 8);
        bArr[i10 + 7] = (byte) j10;
    }

    public void add(byte[] bArr) throws IOException {
        add(bArr, 0, bArr.length);
    }

    public void clear() throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        writeHeader(4096L, 0, 0L, 0L);
        if (this.zero) {
            this.raf.seek(32L);
            this.raf.write(ZEROES, 0, 4064);
        }
        this.elementCount = 0;
        Element element = Element.NULL;
        this.first = element;
        this.last = element;
        if (this.fileLength > 4096) {
            setLength(4096L);
        }
        this.fileLength = 4096L;
        this.modCount++;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.closed = true;
        this.raf.close();
    }

    public File file() {
        return this.file;
    }

    public boolean isAtFullCapacity() {
        return this.maxElements != -1 && size() == this.maxElements;
    }

    public boolean isEmpty() {
        return this.elementCount == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<byte[]> iterator() {
        return new ElementIterator();
    }

    public byte[] peek() {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (isEmpty()) {
            return null;
        }
        Element element = this.first;
        int i10 = element.length;
        byte[] bArr = new byte[i10];
        if (ringRead(element.position + 4, bArr, 0, i10)) {
            return bArr;
        }
        return null;
    }

    public Element readElement(long j10) {
        return j10 == 0 ? Element.NULL : !ringRead(j10, this.buffer, 0, 4) ? Element.NULL : new Element(j10, readInt(this.buffer, 0));
    }

    public void remove() throws IOException {
        remove(1);
    }

    public boolean ringRead(long j10, byte[] bArr, int i10, int i11) throws IOException {
        try {
            long jWrapPosition = wrapPosition(j10);
            long j11 = ((long) i11) + jWrapPosition;
            long j12 = this.fileLength;
            if (j11 <= j12) {
                this.raf.seek(jWrapPosition);
                this.raf.readFully(bArr, i10, i11);
                return true;
            }
            int i12 = (int) (j12 - jWrapPosition);
            this.raf.seek(jWrapPosition);
            this.raf.readFully(bArr, i10, i12);
            this.raf.seek(32L);
            this.raf.readFully(bArr, i10 + i12, i11 - i12);
            return true;
        } catch (EOFException unused) {
            resetFile();
            return false;
        } catch (IOException e10) {
            throw e10;
        } catch (Throwable unused2) {
            resetFile();
            return false;
        }
    }

    public int size() {
        return this.elementCount;
    }

    public String toString() {
        return "QueueFile{file=" + this.file + ", zero=" + this.zero + ", length=" + this.fileLength + ", size=" + this.elementCount + ", first=" + this.first + ", last=" + this.last + '}';
    }

    public long wrapPosition(long j10) {
        long j11 = this.fileLength;
        return j10 < j11 ? j10 : (j10 + 32) - j11;
    }

    public void add(byte[] bArr, int i10, int i11) throws IOException {
        long jWrapPosition;
        if (bArr == null) {
            throw new NullPointerException("data == null");
        }
        if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
            throw new IndexOutOfBoundsException();
        }
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (isAtFullCapacity()) {
            remove();
        }
        expandIfNecessary(i11);
        boolean zIsEmpty = isEmpty();
        if (zIsEmpty) {
            jWrapPosition = 32;
        } else {
            Element element = this.last;
            jWrapPosition = wrapPosition(element.position + 4 + ((long) element.length));
        }
        Element element2 = new Element(jWrapPosition, i11);
        writeInt(this.buffer, 0, i11);
        ringWrite(element2.position, this.buffer, 0, 4);
        ringWrite(element2.position + 4, bArr, i10, i11);
        writeHeader(this.fileLength, this.elementCount + 1, zIsEmpty ? element2.position : this.first.position, element2.position);
        this.last = element2;
        this.elementCount++;
        this.modCount++;
        if (zIsEmpty) {
            this.first = element2;
        }
    }

    public void remove(int i10) throws IOException {
        if (i10 < 0) {
            throw new IllegalArgumentException("Cannot remove negative (" + i10 + ") number of elements.");
        }
        if (i10 == 0) {
            return;
        }
        if (i10 == this.elementCount) {
            clear();
            return;
        }
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (i10 > this.elementCount) {
            throw new IllegalArgumentException("Cannot remove more elements (" + i10 + ") than present in queue (" + this.elementCount + ").");
        }
        Element element = this.first;
        long j10 = element.position;
        int i11 = element.length;
        long j11 = 0;
        int i12 = 0;
        long j12 = j10;
        while (i12 < i10) {
            j11 += (long) (i11 + 4);
            long jWrapPosition = wrapPosition(j12 + 4 + ((long) i11));
            if (!ringRead(jWrapPosition, this.buffer, 0, 4)) {
                return;
            }
            i11 = readInt(this.buffer, 0);
            i12++;
            j12 = jWrapPosition;
        }
        writeHeader(this.fileLength, this.elementCount - i10, j12, this.last.position);
        this.elementCount -= i10;
        this.modCount++;
        this.first = new Element(j12, i11);
        if (this.zero) {
            ringErase(j10, j11);
        }
    }

    public static <T extends Throwable> T getSneakyThrowable(Throwable th) throws Throwable {
        throw th;
    }
}
