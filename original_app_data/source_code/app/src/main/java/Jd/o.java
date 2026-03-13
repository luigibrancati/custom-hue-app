package Jd;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4862t;
import wc.InterfaceC6184a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class o extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6424b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Iterator, InterfaceC6184a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f6425a = true;

        public a() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f6425a;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f6425a) {
                throw new NoSuchElementException();
            }
            this.f6425a = false;
            return o.this.f();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Object value, int i10) {
        super(null);
        AbstractC4862t.e(value, "value");
        this.f6423a = value;
        this.f6424b = i10;
    }

    @Override // Jd.c
    public int c() {
        return 1;
    }

    @Override // Jd.c
    public void d(int i10, Object value) {
        AbstractC4862t.e(value, "value");
        throw new IllegalStateException();
    }

    public final int e() {
        return this.f6424b;
    }

    public final Object f() {
        return this.f6423a;
    }

    @Override // Jd.c
    public Object get(int i10) {
        if (i10 == this.f6424b) {
            return this.f6423a;
        }
        return null;
    }

    @Override // Jd.c, java.lang.Iterable
    public Iterator iterator() {
        return new a();
    }
}
