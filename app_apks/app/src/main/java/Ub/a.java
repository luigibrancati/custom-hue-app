package Ub;

import Mb.g;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f16815a = new AtomicReference();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f16816b = new AtomicReference();

    /* JADX INFO: renamed from: Ub.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0210a extends AtomicReference {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f16817a;

        public C0210a() {
        }

        public Object a() {
            Object objB = b();
            e(null);
            return objB;
        }

        public Object b() {
            return this.f16817a;
        }

        public C0210a c() {
            return (C0210a) get();
        }

        public void d(C0210a c0210a) {
            lazySet(c0210a);
        }

        public void e(Object obj) {
            this.f16817a = obj;
        }

        public C0210a(Object obj) {
            e(obj);
        }
    }

    public a() {
        C0210a c0210a = new C0210a();
        d(c0210a);
        e(c0210a);
    }

    public C0210a a() {
        return (C0210a) this.f16816b.get();
    }

    public C0210a b() {
        return (C0210a) this.f16816b.get();
    }

    public C0210a c() {
        return (C0210a) this.f16815a.get();
    }

    @Override // Mb.h
    public void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    public void d(C0210a c0210a) {
        this.f16816b.lazySet(c0210a);
    }

    public C0210a e(C0210a c0210a) {
        return (C0210a) this.f16815a.getAndSet(c0210a);
    }

    @Override // Mb.h
    public boolean isEmpty() {
        return b() == c();
    }

    @Override // Mb.h
    public boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        C0210a c0210a = new C0210a(obj);
        e(c0210a).d(c0210a);
        return true;
    }

    @Override // Mb.g, Mb.h
    public Object poll() {
        C0210a c0210aC;
        C0210a c0210aA = a();
        C0210a c0210aC2 = c0210aA.c();
        if (c0210aC2 != null) {
            Object objA = c0210aC2.a();
            d(c0210aC2);
            return objA;
        }
        if (c0210aA == c()) {
            return null;
        }
        do {
            c0210aC = c0210aA.c();
        } while (c0210aC == null);
        Object objA2 = c0210aC.a();
        d(c0210aC);
        return objA2;
    }
}
