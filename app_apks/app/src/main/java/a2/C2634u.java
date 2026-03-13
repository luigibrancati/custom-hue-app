package a2;

import D1.o;
import K1.C0;
import K1.F0;
import K1.k1;
import a2.InterfaceC2610C;
import a2.InterfaceC2633t;
import android.net.Uri;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: a2.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C2634u implements InterfaceC2610C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f20897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f20898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f20899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f20900d = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference f20901e = new AtomicReference();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f20902f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public O7.e f20903g;

    /* JADX INFO: renamed from: a2.u$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class a implements c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f20904a = 0;

        public a() {
        }

        @Override // a2.c0
        public void a() throws IOException {
            Throwable th = (Throwable) C2634u.this.f20901e.get();
            if (th != null) {
                throw new IOException(th);
            }
        }

        public void b() {
            if (this.f20904a == 2) {
                this.f20904a = 1;
            }
        }

        @Override // a2.c0
        public int f(C0 c02, J1.f fVar, int i10) {
            int i11 = this.f20904a;
            if (i11 == 2) {
                fVar.q(4);
                return -4;
            }
            if ((i10 & 2) != 0 || i11 == 0) {
                c02.f6835b = C2634u.this.f20898b.b(0).a(0);
                this.f20904a = 1;
                return -5;
            }
            if (!C2634u.this.f20900d.get()) {
                return -3;
            }
            int length = C2634u.this.f20899c.length;
            fVar.q(1);
            fVar.f5880f = 0L;
            if ((i10 & 4) == 0) {
                fVar.D(length);
                fVar.f5878d.put(C2634u.this.f20899c, 0, length);
            }
            if ((i10 & 1) == 0) {
                this.f20904a = 2;
            }
            return -4;
        }

        @Override // a2.c0
        public boolean isReady() {
            return C2634u.this.f20900d.get();
        }

        @Override // a2.c0
        public int n(long j10) {
            return 0;
        }
    }

    public C2634u(Uri uri, String str, InterfaceC2633t interfaceC2633t) {
        this.f20897a = uri;
        this.f20898b = new n0(new D1.E(new o.b().y0(str).P()));
        this.f20899c = uri.toString().getBytes(StandardCharsets.UTF_8);
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public long b() {
        return this.f20900d.get() ? Long.MIN_VALUE : 0L;
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public boolean d() {
        return !this.f20900d.get();
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public boolean e(F0 f02) {
        return !this.f20900d.get();
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public long g() {
        return this.f20900d.get() ? Long.MIN_VALUE : 0L;
    }

    @Override // a2.InterfaceC2610C
    public long i(long j10) {
        for (int i10 = 0; i10 < this.f20902f.size(); i10++) {
            ((a) this.f20902f.get(i10)).b();
        }
        return j10;
    }

    @Override // a2.InterfaceC2610C
    public long k() {
        return -9223372036854775807L;
    }

    @Override // a2.InterfaceC2610C
    public long l(d2.r[] rVarArr, boolean[] zArr, c0[] c0VarArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            c0 c0Var = c0VarArr[i10];
            if (c0Var != null && (rVarArr[i10] == null || !zArr[i10])) {
                this.f20902f.remove(c0Var);
                c0VarArr[i10] = null;
            }
            if (c0VarArr[i10] == null && rVarArr[i10] != null) {
                a aVar = new a();
                this.f20902f.add(aVar);
                c0VarArr[i10] = aVar;
                zArr2[i10] = true;
            }
        }
        return j10;
    }

    public void o() {
        O7.e eVar = this.f20903g;
        if (eVar != null) {
            eVar.cancel(false);
        }
    }

    @Override // a2.InterfaceC2610C
    public void p(InterfaceC2610C.a aVar, long j10) {
        aVar.n(this);
        new InterfaceC2633t.a(this.f20897a);
        throw null;
    }

    @Override // a2.InterfaceC2610C
    public n0 q() {
        return this.f20898b;
    }

    @Override // a2.InterfaceC2610C
    public void m() {
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public void h(long j10) {
    }

    @Override // a2.InterfaceC2610C
    public long c(long j10, k1 k1Var) {
        return j10;
    }

    @Override // a2.InterfaceC2610C
    public void u(long j10, boolean z10) {
    }
}
