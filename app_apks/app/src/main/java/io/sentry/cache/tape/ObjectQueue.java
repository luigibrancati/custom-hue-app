package io.sentry.cache.tape;

import java.io.Closeable;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class ObjectQueue<T> implements Iterable<T>, Closeable {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface Converter<T> {
        T from(byte[] bArr);

        void toStream(T t10, OutputStream outputStream);
    }

    public static <T> ObjectQueue<T> create(QueueFile queueFile, Converter<T> converter) {
        return new FileObjectQueue(queueFile, converter);
    }

    public static <T> ObjectQueue<T> createEmpty() {
        return new EmptyObjectQueue();
    }

    public abstract void add(T t10);

    public List<T> asList() {
        return peek(size());
    }

    public void clear() {
        remove(size());
    }

    public abstract QueueFile file();

    public boolean isEmpty() {
        return size() == 0;
    }

    public abstract T peek();

    public List<T> peek(int i10) {
        int iMin = Math.min(i10, size());
        ArrayList arrayList = new ArrayList(iMin);
        Iterator<T> it = iterator();
        for (int i11 = 0; i11 < iMin; i11++) {
            arrayList.add(it.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void remove() {
        remove(1);
    }

    public abstract void remove(int i10);

    public abstract int size();
}
