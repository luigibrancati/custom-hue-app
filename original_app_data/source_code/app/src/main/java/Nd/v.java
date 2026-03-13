package Nd;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4862t;
import wc.InterfaceC6184a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class v implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f10675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vc.l f10676b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Iterator, InterfaceC6184a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator f10677a;

        public a() {
            this.f10677a = v.this.f10675a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10677a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return v.this.f10676b.invoke(this.f10677a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public v(h sequence, vc.l transformer) {
        AbstractC4862t.e(sequence, "sequence");
        AbstractC4862t.e(transformer, "transformer");
        this.f10675a = sequence;
        this.f10676b = transformer;
    }

    public final h d(vc.l iterator) {
        AbstractC4862t.e(iterator, "iterator");
        return new f(this.f10675a, this.f10676b, iterator);
    }

    @Override // Nd.h
    public Iterator iterator() {
        return new a();
    }
}
