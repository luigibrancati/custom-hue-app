package Fe;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class o extends K {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public K f4144f;

    public o(K delegate) {
        AbstractC4862t.e(delegate, "delegate");
        this.f4144f = delegate;
    }

    @Override // Fe.K
    public K a() {
        return this.f4144f.a();
    }

    @Override // Fe.K
    public K b() {
        return this.f4144f.b();
    }

    @Override // Fe.K
    public long c() {
        return this.f4144f.c();
    }

    @Override // Fe.K
    public K d(long j10) {
        return this.f4144f.d(j10);
    }

    @Override // Fe.K
    public boolean e() {
        return this.f4144f.e();
    }

    @Override // Fe.K
    public void f() throws InterruptedIOException {
        this.f4144f.f();
    }

    @Override // Fe.K
    public K g(long j10, TimeUnit unit) {
        AbstractC4862t.e(unit, "unit");
        return this.f4144f.g(j10, unit);
    }

    public final K i() {
        return this.f4144f;
    }

    public final o j(K delegate) {
        AbstractC4862t.e(delegate, "delegate");
        this.f4144f = delegate;
        return this;
    }
}
