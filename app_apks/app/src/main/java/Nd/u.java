package Nd;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4862t;
import wc.InterfaceC6184a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class u implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f10669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vc.l f10670b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Iterator, InterfaceC6184a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator f10671a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10672b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f10673c;

        public a() {
            this.f10671a = u.this.f10669a.iterator();
        }

        private final void a() {
            if (this.f10671a.hasNext()) {
                Object next = this.f10671a.next();
                if (((Boolean) u.this.f10670b.invoke(next)).booleanValue()) {
                    this.f10672b = 1;
                    this.f10673c = next;
                    return;
                }
            }
            this.f10672b = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f10672b == -1) {
                a();
            }
            return this.f10672b == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f10672b == -1) {
                a();
            }
            if (this.f10672b == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f10673c;
            this.f10673c = null;
            this.f10672b = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public u(h sequence, vc.l predicate) {
        AbstractC4862t.e(sequence, "sequence");
        AbstractC4862t.e(predicate, "predicate");
        this.f10669a = sequence;
        this.f10670b = predicate;
    }

    @Override // Nd.h
    public Iterator iterator() {
        return new a();
    }
}
