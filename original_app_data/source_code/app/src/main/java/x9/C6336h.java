package x9;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: x9.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6336h extends C9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Writer f47965r = new a();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final u9.o f47966s = new u9.o("closed");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f47967o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f47968p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public u9.j f47969q;

    /* JADX INFO: renamed from: x9.h$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends Writer {
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    public C6336h() {
        super(f47965r);
        this.f47967o = new ArrayList();
        this.f47969q = u9.l.f45471a;
    }

    @Override // C9.c
    public C9.c C() {
        W0(u9.l.f45471a);
        return this;
    }

    @Override // C9.c
    public C9.c C0(String str) {
        if (str == null) {
            return C();
        }
        W0(new u9.o(str));
        return this;
    }

    @Override // C9.c
    public C9.c G0(boolean z10) {
        W0(new u9.o(Boolean.valueOf(z10)));
        return this;
    }

    public u9.j M0() {
        if (this.f47967o.isEmpty()) {
            return this.f47969q;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f47967o);
    }

    public final u9.j Q0() {
        return (u9.j) this.f47967o.get(r1.size() - 1);
    }

    public final void W0(u9.j jVar) {
        if (this.f47968p != null) {
            if (!jVar.l() || j()) {
                ((u9.m) Q0()).r(this.f47968p, jVar);
            }
            this.f47968p = null;
            return;
        }
        if (this.f47967o.isEmpty()) {
            this.f47969q = jVar;
            return;
        }
        u9.j jVarQ0 = Q0();
        if (!(jVarQ0 instanceof u9.g)) {
            throw new IllegalStateException();
        }
        ((u9.g) jVarQ0).r(jVar);
    }

    @Override // C9.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f47967o.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f47967o.add(f47966s);
    }

    @Override // C9.c
    public C9.c d() {
        u9.g gVar = new u9.g();
        W0(gVar);
        this.f47967o.add(gVar);
        return this;
    }

    @Override // C9.c
    public C9.c f() {
        u9.m mVar = new u9.m();
        W0(mVar);
        this.f47967o.add(mVar);
        return this;
    }

    @Override // C9.c
    public C9.c h() {
        if (this.f47967o.isEmpty() || this.f47968p != null) {
            throw new IllegalStateException();
        }
        if (!(Q0() instanceof u9.g)) {
            throw new IllegalStateException();
        }
        this.f47967o.remove(r0.size() - 1);
        return this;
    }

    @Override // C9.c
    public C9.c i() {
        if (this.f47967o.isEmpty() || this.f47968p != null) {
            throw new IllegalStateException();
        }
        if (!(Q0() instanceof u9.m)) {
            throw new IllegalStateException();
        }
        this.f47967o.remove(r0.size() - 1);
        return this;
    }

    @Override // C9.c
    public C9.c k0(double d10) {
        if (o() || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
            W0(new u9.o(Double.valueOf(d10)));
            return this;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d10);
    }

    @Override // C9.c
    public C9.c p0(long j10) {
        W0(new u9.o(Long.valueOf(j10)));
        return this;
    }

    @Override // C9.c
    public C9.c q(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f47967o.isEmpty() || this.f47968p != null) {
            throw new IllegalStateException("Did not expect a name");
        }
        if (!(Q0() instanceof u9.m)) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f47968p = str;
        return this;
    }

    @Override // C9.c
    public C9.c v0(Boolean bool) {
        if (bool == null) {
            return C();
        }
        W0(new u9.o(bool));
        return this;
    }

    @Override // C9.c
    public C9.c x0(Number number) {
        if (number == null) {
            return C();
        }
        if (!o()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        W0(new u9.o(number));
        return this;
    }

    @Override // C9.c, java.io.Flushable
    public void flush() {
    }
}
