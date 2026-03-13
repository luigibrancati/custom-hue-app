package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class S extends T {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a implements Map.Entry {
        public abstract S a();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Iterator f32180a;

        public b(Iterator it) {
            this.f32180a = it;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            Map.Entry entry = (Map.Entry) this.f32180a.next();
            entry.getValue();
            return entry;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f32180a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f32180a.remove();
        }
    }
}
