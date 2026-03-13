package Fe;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Fe.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0852n implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J f4143a;

    public AbstractC0852n(J delegate) {
        AbstractC4862t.e(delegate, "delegate");
        this.f4143a = delegate;
    }

    @Override // Fe.J
    public long V0(C0843e sink, long j10) {
        AbstractC4862t.e(sink, "sink");
        return this.f4143a.V0(sink, j10);
    }

    public final J a() {
        return this.f4143a;
    }

    @Override // Fe.J, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f4143a.close();
    }

    @Override // Fe.J
    public K n() {
        return this.f4143a.n();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f4143a + ')';
    }
}
