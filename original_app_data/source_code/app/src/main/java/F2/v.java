package F2;

import D1.InterfaceC0749g;
import F2.s;
import G1.AbstractC0853a;
import G1.C;
import G1.InterfaceC0864l;
import G1.M;
import i2.O;
import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class v implements O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O f3697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s.a f3698b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public s f3704h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public D1.o f3705i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f3706j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f3699c = new d();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3701e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3702f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f3703g = M.f4267f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C f3700d = new C();

    public v(O o10, s.a aVar) {
        this.f3697a = o10;
        this.f3698b = aVar;
    }

    @Override // i2.O
    public int c(InterfaceC0749g interfaceC0749g, int i10, boolean z10, int i11) throws EOFException {
        if (this.f3704h == null) {
            return this.f3697a.c(interfaceC0749g, i10, z10, i11);
        }
        i(i10);
        int i12 = interfaceC0749g.read(this.f3703g, this.f3702f, i10);
        if (i12 != -1) {
            this.f3702f += i12;
            return i12;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // i2.O
    public void d(final long j10, final int i10, int i11, int i12, O.a aVar) {
        int i13;
        if (this.f3704h == null) {
            this.f3697a.d(j10, i10, i11, i12, aVar);
            return;
        }
        AbstractC0853a.b(aVar == null, "DRM on subtitles is not supported");
        int i14 = (this.f3702f - i12) - i11;
        try {
            i13 = i14;
        } catch (RuntimeException e10) {
            e = e10;
            i13 = i14;
        }
        try {
            this.f3704h.c(this.f3703g, i13, i11, s.b.b(), new InterfaceC0864l() { // from class: F2.u
                @Override // G1.InterfaceC0864l
                public final void accept(Object obj) {
                    this.f3694a.j((e) obj, j10, i10);
                }
            });
        } catch (RuntimeException e11) {
            e = e11;
            RuntimeException runtimeException = e;
            if (!this.f3706j) {
                throw runtimeException;
            }
            G1.t.i("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", runtimeException);
        }
        int i15 = i13 + i11;
        this.f3701e = i15;
        if (i15 == this.f3702f) {
            this.f3701e = 0;
            this.f3702f = 0;
        }
    }

    @Override // i2.O
    public void e(D1.o oVar) {
        AbstractC0853a.e(oVar.f1805o);
        AbstractC0853a.a(D1.v.k(oVar.f1805o) == 3);
        if (!oVar.equals(this.f3705i)) {
            this.f3705i = oVar;
            this.f3704h = this.f3698b.a(oVar) ? this.f3698b.b(oVar) : null;
        }
        if (this.f3704h == null) {
            this.f3697a.e(oVar);
        } else {
            this.f3697a.e(oVar.b().y0("application/x-media3-cues").U(oVar.f1805o).C0(Long.MAX_VALUE).Y(this.f3698b.c(oVar)).P());
        }
    }

    @Override // i2.O
    public void g(C c10, int i10, int i11) {
        if (this.f3704h == null) {
            this.f3697a.g(c10, i10, i11);
            return;
        }
        i(i10);
        c10.q(this.f3703g, this.f3702f, i10);
        this.f3702f += i10;
    }

    public final void i(int i10) {
        int length = this.f3703g.length;
        int i11 = this.f3702f;
        if (length - i11 >= i10) {
            return;
        }
        int i12 = i11 - this.f3701e;
        int iMax = Math.max(i12 * 2, i10 + i12);
        byte[] bArr = this.f3703g;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f3701e, bArr2, 0, i12);
        this.f3701e = 0;
        this.f3702f = i12;
        this.f3703g = bArr2;
    }

    public final void j(e eVar, long j10, int i10) {
        AbstractC0853a.i(this.f3705i);
        byte[] bArrA = this.f3699c.a(eVar.f3659a, eVar.f3661c);
        this.f3700d.X(bArrA);
        this.f3697a.b(this.f3700d, bArrA.length);
        long j11 = eVar.f3660b;
        if (j11 == -9223372036854775807L) {
            AbstractC0853a.g(this.f3705i.f1810t == Long.MAX_VALUE);
        } else {
            long j12 = this.f3705i.f1810t;
            j10 = j12 == Long.MAX_VALUE ? j10 + j11 : j11 + j12;
        }
        this.f3697a.d(j10, i10 | 1, bArrA.length, 0, null);
    }

    public void k(boolean z10) {
        this.f3706j = z10;
    }
}
