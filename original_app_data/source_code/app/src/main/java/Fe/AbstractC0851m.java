package Fe;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Fe.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0851m implements H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H f4142a;

    public AbstractC0851m(H delegate) {
        AbstractC4862t.e(delegate, "delegate");
        this.f4142a = delegate;
    }

    @Override // Fe.H
    public void J(C0843e source, long j10) {
        AbstractC4862t.e(source, "source");
        this.f4142a.J(source, j10);
    }

    @Override // Fe.H, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
        this.f4142a.close();
    }

    @Override // Fe.H, java.io.Flushable
    public void flush() {
        this.f4142a.flush();
    }

    @Override // Fe.H
    public K n() {
        return this.f4142a.n();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f4142a + ')';
    }
}
