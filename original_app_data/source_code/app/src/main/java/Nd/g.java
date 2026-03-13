package Nd;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;
import wc.InterfaceC6184a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC6082a f10651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vc.l f10652b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Iterator, InterfaceC6184a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f10653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10654b = -2;

        public a() {
        }

        private final void a() {
            Object objInvoke;
            if (this.f10654b == -2) {
                objInvoke = g.this.f10651a.invoke();
            } else {
                vc.l lVar = g.this.f10652b;
                Object obj = this.f10653a;
                AbstractC4862t.b(obj);
                objInvoke = lVar.invoke(obj);
            }
            this.f10653a = objInvoke;
            this.f10654b = objInvoke == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f10654b < 0) {
                a();
            }
            return this.f10654b == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f10654b < 0) {
                a();
            }
            if (this.f10654b == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f10653a;
            AbstractC4862t.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f10654b = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public g(InterfaceC6082a getInitialValue, vc.l getNextValue) {
        AbstractC4862t.e(getInitialValue, "getInitialValue");
        AbstractC4862t.e(getNextValue, "getNextValue");
        this.f10651a = getInitialValue;
        this.f10652b = getNextValue;
    }

    @Override // Nd.h
    public Iterator iterator() {
        return new a();
    }
}
