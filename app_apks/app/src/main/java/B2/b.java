package B2;

import G1.M;
import i2.E;
import i2.J;
import java.math.RoundingMode;
import org.apache.tika.pipes.PipesConfigBase;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final E f575d;

    public b(long j10, long j11, long j12) {
        this.f575d = new E(new long[]{j11}, new long[]{0}, j10);
        this.f572a = j11;
        this.f573b = j12;
        int i10 = -2147483647;
        if (j10 == -9223372036854775807L) {
            this.f574c = -2147483647;
            return;
        }
        long jD1 = M.d1(j11 - j12, 8L, j10, RoundingMode.HALF_UP);
        if (jD1 > 0 && jD1 <= 2147483647L) {
            i10 = (int) jD1;
        }
        this.f574c = i10;
    }

    public boolean a(long j10) {
        return this.f575d.c(j10, PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH);
    }

    @Override // B2.g
    public long b(long j10) {
        return this.f575d.b(j10);
    }

    public void c(long j10, long j11) {
        if (a(j10)) {
            return;
        }
        this.f575d.a(j10, j11);
    }

    @Override // B2.g
    public long d() {
        return this.f572a;
    }

    @Override // i2.J
    public J.a e(long j10) {
        return this.f575d.e(j10);
    }

    public void f(long j10) {
        this.f575d.f(j10);
    }

    @Override // B2.g
    public long g() {
        return this.f573b;
    }

    @Override // i2.J
    public boolean h() {
        return this.f575d.h();
    }

    @Override // B2.g
    public int l() {
        return this.f574c;
    }

    @Override // i2.J
    public long m() {
        return this.f575d.m();
    }
}
