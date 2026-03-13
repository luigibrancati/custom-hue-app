package io.sentry.cache.tape;

import io.sentry.cache.tape.ObjectQueue;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
final class FileObjectQueue<T> extends ObjectQueue<T> {
    private final DirectByteArrayOutputStream bytes = new DirectByteArrayOutputStream();
    final ObjectQueue.Converter<T> converter;
    private final QueueFile queueFile;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class DirectByteArrayOutputStream extends ByteArrayOutputStream {
        public byte[] getArray() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class QueueFileIterator implements Iterator<T> {
        final Iterator<byte[]> iterator;

        public QueueFileIterator(Iterator<byte[]> it) {
            this.iterator = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            try {
                return FileObjectQueue.this.converter.from(this.iterator.next());
            } catch (IOException e10) {
                throw ((Error) QueueFile.getSneakyThrowable(e10));
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            this.iterator.remove();
        }
    }

    public FileObjectQueue(QueueFile queueFile, ObjectQueue.Converter<T> converter) {
        this.queueFile = queueFile;
        this.converter = converter;
    }

    @Override // io.sentry.cache.tape.ObjectQueue
    public void add(T t10) throws IOException {
        this.bytes.reset();
        this.converter.toStream(t10, this.bytes);
        this.queueFile.add(this.bytes.getArray(), 0, this.bytes.size());
    }

    @Override // io.sentry.cache.tape.ObjectQueue
    public void clear() throws IOException {
        this.queueFile.clear();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.queueFile.close();
    }

    @Override // io.sentry.cache.tape.ObjectQueue
    public QueueFile file() {
        return this.queueFile;
    }

    @Override // io.sentry.cache.tape.ObjectQueue
    public boolean isEmpty() {
        return this.queueFile.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new QueueFileIterator(this.queueFile.iterator());
    }

    @Override // io.sentry.cache.tape.ObjectQueue
    public T peek() {
        byte[] bArrPeek = this.queueFile.peek();
        if (bArrPeek == null) {
            return null;
        }
        return this.converter.from(bArrPeek);
    }

    @Override // io.sentry.cache.tape.ObjectQueue
    public void remove() throws IOException {
        this.queueFile.remove();
    }

    @Override // io.sentry.cache.tape.ObjectQueue
    public int size() {
        return this.queueFile.size();
    }

    public String toString() {
        return "FileObjectQueue{queueFile=" + this.queueFile + '}';
    }

    @Override // io.sentry.cache.tape.ObjectQueue
    public void remove(int i10) throws IOException {
        this.queueFile.remove(i10);
    }
}
