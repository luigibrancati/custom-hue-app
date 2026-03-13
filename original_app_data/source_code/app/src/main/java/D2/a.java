package D2;

import D1.w;
import G1.AbstractC0853a;
import G1.M;
import i2.AbstractC4338s;
import i2.InterfaceC4337q;
import i2.J;
import i2.K;
import io.sentry.TransactionOptions;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;
import org.apache.tika.pipes.PipesConfigBase;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f2145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f2147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f2148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f2150f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f2151g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f2152h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f2153i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f2154j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f2155k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f2156l;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class b implements J {
        public b() {
        }

        @Override // i2.J
        public J.a e(long j10) {
            return new J.a(new K(j10, M.p((a.this.f2146b + BigInteger.valueOf(a.this.f2148d.c(j10)).multiply(BigInteger.valueOf(a.this.f2147c - a.this.f2146b)).divide(BigInteger.valueOf(a.this.f2150f)).longValue()) - TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, a.this.f2146b, a.this.f2147c - 1)));
        }

        @Override // i2.J
        public boolean h() {
            return true;
        }

        @Override // i2.J
        public long m() {
            return a.this.f2148d.b(a.this.f2150f);
        }
    }

    public a(i iVar, long j10, long j11, long j12, long j13, boolean z10) {
        AbstractC0853a.a(j10 >= 0 && j11 > j10);
        this.f2148d = iVar;
        this.f2146b = j10;
        this.f2147c = j11;
        if (j12 == j11 - j10 || z10) {
            this.f2150f = j13;
            this.f2149e = 4;
        } else {
            this.f2149e = 0;
        }
        this.f2145a = new f();
    }

    @Override // D2.g
    public long a(InterfaceC4337q interfaceC4337q) throws IOException {
        int i10 = this.f2149e;
        if (i10 == 0) {
            long position = interfaceC4337q.getPosition();
            this.f2151g = position;
            this.f2149e = 1;
            long j10 = this.f2147c - 65307;
            if (j10 > position) {
                return j10;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                long jI = i(interfaceC4337q);
                if (jI != -1) {
                    return jI;
                }
                this.f2149e = 3;
            } else if (i10 != 3) {
                if (i10 == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            k(interfaceC4337q);
            this.f2149e = 4;
            return -(this.f2155k + 2);
        }
        this.f2150f = j(interfaceC4337q);
        this.f2149e = 4;
        return this.f2151g;
    }

    @Override // D2.g
    public void c(long j10) {
        this.f2152h = M.p(j10, 0L, this.f2150f - 1);
        this.f2149e = 2;
        this.f2153i = this.f2146b;
        this.f2154j = this.f2147c;
        this.f2155k = 0L;
        this.f2156l = this.f2150f;
    }

    @Override // D2.g
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public b b() {
        if (this.f2150f != 0) {
            return new b();
        }
        return null;
    }

    public final long i(InterfaceC4337q interfaceC4337q) throws IOException {
        if (this.f2153i == this.f2154j) {
            return -1L;
        }
        long position = interfaceC4337q.getPosition();
        if (!this.f2145a.d(interfaceC4337q, this.f2154j)) {
            long j10 = this.f2153i;
            if (j10 != position) {
                return j10;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f2145a.a(interfaceC4337q, false);
        interfaceC4337q.i();
        long j11 = this.f2152h;
        f fVar = this.f2145a;
        long j12 = fVar.f2175c;
        long j13 = j11 - j12;
        int i10 = fVar.f2180h + fVar.f2181i;
        if (0 <= j13 && j13 < 72000) {
            return -1L;
        }
        if (j13 < 0) {
            this.f2154j = position;
            this.f2156l = j12;
        } else {
            this.f2153i = interfaceC4337q.getPosition() + ((long) i10);
            this.f2155k = this.f2145a.f2175c;
        }
        long j14 = this.f2154j;
        long j15 = this.f2153i;
        if (j14 - j15 < PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH) {
            this.f2154j = j15;
            return j15;
        }
        long position2 = interfaceC4337q.getPosition() - (((long) i10) * (j13 <= 0 ? 2L : 1L));
        long j16 = this.f2154j;
        long j17 = this.f2153i;
        return M.p(position2 + ((j13 * (j16 - j17)) / (this.f2156l - this.f2155k)), j17, j16 - 1);
    }

    public long j(InterfaceC4337q interfaceC4337q) throws w, EOFException {
        this.f2145a.b();
        if (!this.f2145a.c(interfaceC4337q)) {
            throw new EOFException();
        }
        this.f2145a.a(interfaceC4337q, false);
        f fVar = this.f2145a;
        interfaceC4337q.q(fVar.f2180h + fVar.f2181i);
        long j10 = this.f2145a.f2175c;
        while (true) {
            f fVar2 = this.f2145a;
            if ((fVar2.f2174b & 4) == 4 || !fVar2.c(interfaceC4337q) || interfaceC4337q.getPosition() >= this.f2147c || !this.f2145a.a(interfaceC4337q, true)) {
                break;
            }
            f fVar3 = this.f2145a;
            if (!AbstractC4338s.f(interfaceC4337q, fVar3.f2180h + fVar3.f2181i)) {
                break;
            }
            j10 = this.f2145a.f2175c;
        }
        return j10;
    }

    public final void k(InterfaceC4337q interfaceC4337q) throws w {
        while (true) {
            this.f2145a.c(interfaceC4337q);
            this.f2145a.a(interfaceC4337q, false);
            f fVar = this.f2145a;
            if (fVar.f2175c > this.f2152h) {
                interfaceC4337q.i();
                return;
            } else {
                interfaceC4337q.q(fVar.f2180h + fVar.f2181i);
                this.f2153i = interfaceC4337q.getPosition();
                this.f2155k = this.f2145a.f2175c;
            }
        }
    }
}
