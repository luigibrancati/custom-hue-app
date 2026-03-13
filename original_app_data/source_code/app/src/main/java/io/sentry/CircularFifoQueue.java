package io.sentry;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
final class CircularFifoQueue<E> extends AbstractCollection<E> implements Queue<E>, Serializable {
    private static final long serialVersionUID = -8423413834657610406L;
    private transient E[] elements;
    private transient int end;
    private transient boolean full;
    private final int maxElements;
    private transient int start;

    public CircularFifoQueue() {
        this(32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int decrement(int i10) {
        int i11 = i10 - 1;
        return i11 < 0 ? this.maxElements - 1 : i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int increment(int i10) {
        int i11 = i10 + 1;
        if (i11 >= this.maxElements) {
            return 0;
        }
        return i11;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.elements = (E[]) new Object[this.maxElements];
        int i10 = objectInputStream.readInt();
        for (int i11 = 0; i11 < i10; i11++) {
            ((E[]) this.elements)[i11] = objectInputStream.readObject();
        }
        this.start = 0;
        boolean z10 = i10 == this.maxElements;
        this.full = z10;
        if (z10) {
            this.end = 0;
        } else {
            this.end = i10;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(E e10) {
        if (e10 == null) {
            throw new NullPointerException("Attempted to add null object to queue");
        }
        if (isAtFullCapacity()) {
            remove();
        }
        E[] eArr = this.elements;
        int i10 = this.end;
        int i11 = i10 + 1;
        this.end = i11;
        eArr[i10] = e10;
        if (i11 >= this.maxElements) {
            this.end = 0;
        }
        if (this.end == this.start) {
            this.full = true;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.full = false;
        this.start = 0;
        this.end = 0;
        Arrays.fill(this.elements, (Object) null);
    }

    @Override // java.util.Queue
    public E element() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        return peek();
    }

    public E get(int i10) {
        int size = size();
        if (i10 < 0 || i10 >= size) {
            throw new NoSuchElementException(String.format("The specified index (%1$d) is outside the available range [0, %2$d)", Integer.valueOf(i10), Integer.valueOf(size)));
        }
        return this.elements[(this.start + i10) % this.maxElements];
    }

    public boolean isAtFullCapacity() {
        return size() == this.maxElements;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean isFull() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new Iterator<E>() { // from class: io.sentry.CircularFifoQueue.1
            private int index;
            private boolean isFirst;
            private int lastReturnedIndex = -1;

            {
                this.index = CircularFifoQueue.this.start;
                this.isFirst = CircularFifoQueue.this.full;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.isFirst || this.index != CircularFifoQueue.this.end;
            }

            @Override // java.util.Iterator
            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.isFirst = false;
                int i10 = this.index;
                this.lastReturnedIndex = i10;
                this.index = CircularFifoQueue.this.increment(i10);
                return (E) CircularFifoQueue.this.elements[this.lastReturnedIndex];
            }

            @Override // java.util.Iterator
            public void remove() {
                int i10 = this.lastReturnedIndex;
                if (i10 == -1) {
                    throw new IllegalStateException();
                }
                if (i10 == CircularFifoQueue.this.start) {
                    CircularFifoQueue.this.remove();
                    this.lastReturnedIndex = -1;
                    return;
                }
                int iIncrement = this.lastReturnedIndex + 1;
                if (CircularFifoQueue.this.start >= this.lastReturnedIndex || iIncrement >= CircularFifoQueue.this.end) {
                    while (iIncrement != CircularFifoQueue.this.end) {
                        if (iIncrement >= CircularFifoQueue.this.maxElements) {
                            CircularFifoQueue.this.elements[iIncrement - 1] = CircularFifoQueue.this.elements[0];
                            iIncrement = 0;
                        } else {
                            CircularFifoQueue.this.elements[CircularFifoQueue.this.decrement(iIncrement)] = CircularFifoQueue.this.elements[iIncrement];
                            iIncrement = CircularFifoQueue.this.increment(iIncrement);
                        }
                    }
                } else {
                    System.arraycopy(CircularFifoQueue.this.elements, iIncrement, CircularFifoQueue.this.elements, this.lastReturnedIndex, CircularFifoQueue.this.end - iIncrement);
                }
                this.lastReturnedIndex = -1;
                CircularFifoQueue circularFifoQueue = CircularFifoQueue.this;
                circularFifoQueue.end = circularFifoQueue.decrement(circularFifoQueue.end);
                CircularFifoQueue.this.elements[CircularFifoQueue.this.end] = null;
                CircularFifoQueue.this.full = false;
                this.index = CircularFifoQueue.this.decrement(this.index);
            }
        };
    }

    public int maxSize() {
        return this.maxElements;
    }

    @Override // java.util.Queue
    public boolean offer(E e10) {
        return add(e10);
    }

    @Override // java.util.Queue
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return this.elements[this.start];
    }

    @Override // java.util.Queue
    public E poll() {
        if (isEmpty()) {
            return null;
        }
        return remove();
    }

    @Override // java.util.Queue
    public E remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        E[] eArr = this.elements;
        int i10 = this.start;
        E e10 = eArr[i10];
        if (e10 != null) {
            int i11 = i10 + 1;
            this.start = i11;
            eArr[i10] = null;
            if (i11 >= this.maxElements) {
                this.start = 0;
            }
            this.full = false;
        }
        return e10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        int i10 = this.end;
        int i11 = this.start;
        if (i10 < i11) {
            return (this.maxElements - i11) + i10;
        }
        if (i10 != i11) {
            return i10 - i11;
        }
        if (this.full) {
            return this.maxElements;
        }
        return 0;
    }

    public CircularFifoQueue(int i10) {
        this.start = 0;
        this.end = 0;
        this.full = false;
        if (i10 <= 0) {
            throw new IllegalArgumentException("The size must be greater than 0");
        }
        E[] eArr = (E[]) new Object[i10];
        this.elements = eArr;
        this.maxElements = eArr.length;
    }

    public CircularFifoQueue(Collection<? extends E> collection) {
        this(collection.size());
        addAll(collection);
    }
}
