package b2;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: b2.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2792b implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f24968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f24969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f24970d;

    public AbstractC2792b(long j10, long j11) {
        this.f24968b = j10;
        this.f24969c = j11;
        f();
    }

    public final void c() {
        long j10 = this.f24970d;
        if (j10 < this.f24968b || j10 > this.f24969c) {
            throw new NoSuchElementException();
        }
    }

    public final long d() {
        return this.f24970d;
    }

    public boolean e() {
        return this.f24970d > this.f24969c;
    }

    public void f() {
        this.f24970d = this.f24968b - 1;
    }

    @Override // b2.n
    public boolean next() {
        this.f24970d++;
        return !e();
    }
}
