package Nd;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4862t;
import wc.InterfaceC6184a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements h, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f10632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10633b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Iterator, InterfaceC6184a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator f10634a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10635b;

        public a(b bVar) {
            this.f10634a = bVar.f10632a.iterator();
            this.f10635b = bVar.f10633b;
        }

        public final void a() {
            while (this.f10635b > 0 && this.f10634a.hasNext()) {
                this.f10634a.next();
                this.f10635b--;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.f10634a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            return this.f10634a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(h sequence, int i10) {
        AbstractC4862t.e(sequence, "sequence");
        this.f10632a = sequence;
        this.f10633b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // Nd.c
    public h a(int i10) {
        int i11 = this.f10633b + i10;
        return i11 < 0 ? new b(this, i10) : new b(this.f10632a, i11);
    }

    @Override // Nd.h
    public Iterator iterator() {
        return new a(this);
    }
}
