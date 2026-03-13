package io.sentry.cache.tape;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
final class EmptyObjectQueue<T> extends ObjectQueue<T> {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class EmptyIterator<T> implements Iterator<T> {
        private EmptyIterator() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            throw new NoSuchElementException("No elements in EmptyIterator!");
        }
    }

    @Override // io.sentry.cache.tape.ObjectQueue
    public QueueFile file() {
        return null;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new EmptyIterator();
    }

    @Override // io.sentry.cache.tape.ObjectQueue
    public T peek() {
        return null;
    }

    @Override // io.sentry.cache.tape.ObjectQueue
    public int size() {
        return 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // io.sentry.cache.tape.ObjectQueue
    public void add(T t10) {
    }

    @Override // io.sentry.cache.tape.ObjectQueue
    public void remove(int i10) {
    }
}
