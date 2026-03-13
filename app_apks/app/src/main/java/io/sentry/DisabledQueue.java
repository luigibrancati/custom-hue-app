package io.sentry;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
final class DisabledQueue<E> extends AbstractCollection<E> implements Queue<E>, Serializable {
    private static final long serialVersionUID = -8423413834657610417L;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(E e10) {
        return false;
    }

    @Override // java.util.Queue
    public E element() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new Iterator<E>() { // from class: io.sentry.DisabledQueue.1
            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public E next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new IllegalStateException();
            }
        };
    }

    @Override // java.util.Queue
    public boolean offer(E e10) {
        return false;
    }

    @Override // java.util.Queue
    public E peek() {
        return null;
    }

    @Override // java.util.Queue
    public E poll() {
        return null;
    }

    @Override // java.util.Queue
    public E remove() {
        throw new NoSuchElementException("queue is disabled");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
    }
}
