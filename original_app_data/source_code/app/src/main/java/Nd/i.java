package Nd;

import fc.AbstractC4036s;
import fc.C4015H;
import fc.C4035r;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4862t;
import lc.C4993j;
import lc.InterfaceC4988e;
import lc.InterfaceC4992i;
import mc.C5046c;
import wc.InterfaceC6184a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends j implements Iterator, InterfaceC4988e, InterfaceC6184a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f10657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f10658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC4988e f10659d;

    @Override // Nd.j
    public Object a(Object obj, InterfaceC4988e interfaceC4988e) {
        this.f10657b = obj;
        this.f10656a = 3;
        this.f10659d = interfaceC4988e;
        Object objF = C5046c.f();
        if (objF == C5046c.f()) {
            nc.h.c(interfaceC4988e);
        }
        return objF == C5046c.f() ? objF : C4015H.f34254a;
    }

    public final Throwable c() {
        int i10 = this.f10656a;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f10656a);
    }

    public final Object d() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    public final void f(InterfaceC4988e interfaceC4988e) {
        this.f10659d = interfaceC4988e;
    }

    @Override // lc.InterfaceC4988e
    public InterfaceC4992i getContext() {
        return C4993j.f40088a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() throws Throwable {
        while (true) {
            int i10 = this.f10656a;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 || i10 == 3) {
                        return true;
                    }
                    if (i10 == 4) {
                        return false;
                    }
                    throw c();
                }
                Iterator it = this.f10658c;
                AbstractC4862t.b(it);
                if (it.hasNext()) {
                    this.f10656a = 2;
                    return true;
                }
                this.f10658c = null;
            }
            this.f10656a = 5;
            InterfaceC4988e interfaceC4988e = this.f10659d;
            AbstractC4862t.b(interfaceC4988e);
            this.f10659d = null;
            interfaceC4988e.resumeWith(C4035r.b(C4015H.f34254a));
        }
    }

    @Override // java.util.Iterator
    public Object next() throws Throwable {
        int i10 = this.f10656a;
        if (i10 == 0 || i10 == 1) {
            return d();
        }
        if (i10 == 2) {
            this.f10656a = 1;
            Iterator it = this.f10658c;
            AbstractC4862t.b(it);
            return it.next();
        }
        if (i10 != 3) {
            throw c();
        }
        this.f10656a = 0;
        Object obj = this.f10657b;
        this.f10657b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // lc.InterfaceC4988e
    public void resumeWith(Object obj) throws Throwable {
        AbstractC4036s.b(obj);
        this.f10656a = 4;
    }
}
