package Nd;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4862t;
import wc.InterfaceC6184a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f10637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vc.l f10639c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Iterator, InterfaceC6184a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator f10640a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10641b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f10642c;

        public a() {
            this.f10640a = e.this.f10637a.iterator();
        }

        public final void a() {
            while (this.f10640a.hasNext()) {
                Object next = this.f10640a.next();
                if (((Boolean) e.this.f10639c.invoke(next)).booleanValue() == e.this.f10638b) {
                    this.f10642c = next;
                    this.f10641b = 1;
                    return;
                }
            }
            this.f10641b = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f10641b == -1) {
                a();
            }
            return this.f10641b == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f10641b == -1) {
                a();
            }
            if (this.f10641b == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f10642c;
            this.f10642c = null;
            this.f10641b = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e(h sequence, boolean z10, vc.l predicate) {
        AbstractC4862t.e(sequence, "sequence");
        AbstractC4862t.e(predicate, "predicate");
        this.f10637a = sequence;
        this.f10638b = z10;
        this.f10639c = predicate;
    }

    @Override // Nd.h
    public Iterator iterator() {
        return new a();
    }
}
