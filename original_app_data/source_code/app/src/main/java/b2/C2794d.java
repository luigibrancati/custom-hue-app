package b2;

import D1.InterfaceC0749g;
import D1.o;
import D1.v;
import F2.s;
import G1.AbstractC0853a;
import G1.C;
import G1.M;
import L1.B0;
import android.util.SparseArray;
import b2.InterfaceC2796f;
import i2.C4327g;
import i2.C4334n;
import i2.I;
import i2.InterfaceC4336p;
import i2.InterfaceC4337q;
import i2.J;
import i2.O;
import i2.r;
import java.util.List;
import java.util.Objects;
import org.apache.tika.utils.StringUtils;
import q2.C5479a;

/* JADX INFO: renamed from: b2.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C2794d implements r, InterfaceC2796f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f24973j = new b();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final I f24974k = new I();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4336p f24975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D1.o f24977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray f24978d = new SparseArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f24979e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InterfaceC2796f.b f24980f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f24981g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public J f24982h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public D1.o[] f24983i;

    /* JADX INFO: renamed from: b2.d$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements O {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f24984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f24985b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final D1.o f24986c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final C4334n f24987d = new C4334n();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public D1.o f24988e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public O f24989f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f24990g;

        public a(int i10, int i11, D1.o oVar) {
            this.f24984a = i10;
            this.f24985b = i11;
            this.f24986c = oVar;
        }

        @Override // i2.O
        public int c(InterfaceC0749g interfaceC0749g, int i10, boolean z10, int i11) {
            return ((O) M.i(this.f24989f)).a(interfaceC0749g, i10, z10);
        }

        @Override // i2.O
        public void d(long j10, int i10, int i11, int i12, O.a aVar) {
            long j11 = this.f24990g;
            if (j11 != -9223372036854775807L && j10 >= j11) {
                this.f24989f = this.f24987d;
            }
            ((O) M.i(this.f24989f)).d(j10, i10, i11, i12, aVar);
        }

        @Override // i2.O
        public void e(D1.o oVar) {
            D1.o oVar2 = this.f24986c;
            if (oVar2 != null) {
                oVar = oVar.i(oVar2);
            }
            this.f24988e = oVar;
            ((O) M.i(this.f24989f)).e(this.f24988e);
        }

        @Override // i2.O
        public void g(C c10, int i10, int i11) {
            ((O) M.i(this.f24989f)).b(c10, i10);
        }

        public void h(InterfaceC2796f.b bVar, long j10) {
            if (bVar == null) {
                this.f24989f = this.f24987d;
                return;
            }
            this.f24990g = j10;
            O oF = bVar.f(this.f24984a, this.f24985b);
            this.f24989f = oF;
            D1.o oVar = this.f24988e;
            if (oVar != null) {
                oF.e(oVar);
            }
        }
    }

    /* JADX INFO: renamed from: b2.d$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements InterfaceC2796f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public s.a f24991a = new F2.h();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f24992b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f24993c;

        @Override // b2.InterfaceC2796f.a
        public D1.o d(D1.o oVar) {
            String str;
            if (!this.f24992b || !this.f24991a.a(oVar)) {
                return oVar;
            }
            o.b bVarY = oVar.b().y0("application/x-media3-cues").Y(this.f24991a.c(oVar));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(oVar.f1805o);
            if (oVar.f1801k != null) {
                str = StringUtils.SPACE + oVar.f1801k;
            } else {
                str = "";
            }
            sb2.append(str);
            return bVarY.U(sb2.toString()).C0(Long.MAX_VALUE).P();
        }

        @Override // b2.InterfaceC2796f.a
        public InterfaceC2796f e(int i10, D1.o oVar, boolean z10, List list, O o10, B0 b02) {
            InterfaceC4336p hVar;
            String str = oVar.f1804n;
            if (!v.s(str)) {
                if (v.r(str)) {
                    hVar = new A2.e(this.f24991a, this.f24992b ? 1 : 3);
                } else if (Objects.equals(str, "image/jpeg")) {
                    hVar = new C5479a(1);
                } else if (Objects.equals(str, "image/png")) {
                    hVar = new E2.a();
                } else {
                    int i11 = z10 ? 4 : 0;
                    if (!this.f24992b) {
                        i11 |= 32;
                    }
                    hVar = new C2.h(this.f24991a, i11 | C2.h.h(this.f24993c), null, null, list, o10);
                }
            } else {
                if (!this.f24992b) {
                    return null;
                }
                hVar = new F2.o(this.f24991a.b(oVar), oVar);
            }
            return new C2794d(hVar, i10, oVar);
        }

        @Override // b2.InterfaceC2796f.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public b b(boolean z10) {
            this.f24992b = z10;
            return this;
        }

        @Override // b2.InterfaceC2796f.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public b c(int i10) {
            this.f24993c = i10;
            return this;
        }

        @Override // b2.InterfaceC2796f.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public b a(s.a aVar) {
            this.f24991a = (s.a) AbstractC0853a.e(aVar);
            return this;
        }
    }

    public C2794d(InterfaceC4336p interfaceC4336p, int i10, D1.o oVar) {
        this.f24975a = interfaceC4336p;
        this.f24976b = i10;
        this.f24977c = oVar;
    }

    @Override // b2.InterfaceC2796f
    public boolean a(InterfaceC4337q interfaceC4337q) {
        int i10 = this.f24975a.i(interfaceC4337q, f24974k);
        AbstractC0853a.g(i10 != 1);
        return i10 == 0;
    }

    @Override // b2.InterfaceC2796f
    public void b(InterfaceC2796f.b bVar, long j10, long j11) {
        this.f24980f = bVar;
        this.f24981g = j11;
        if (!this.f24979e) {
            this.f24975a.c(this);
            if (j10 != -9223372036854775807L) {
                this.f24975a.a(0L, j10);
            }
            this.f24979e = true;
            return;
        }
        InterfaceC4336p interfaceC4336p = this.f24975a;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        interfaceC4336p.a(0L, j10);
        for (int i10 = 0; i10 < this.f24978d.size(); i10++) {
            ((a) this.f24978d.valueAt(i10)).h(bVar, j11);
        }
    }

    @Override // b2.InterfaceC2796f
    public C4327g c() {
        J j10 = this.f24982h;
        if (j10 instanceof C4327g) {
            return (C4327g) j10;
        }
        return null;
    }

    @Override // b2.InterfaceC2796f
    public D1.o[] d() {
        return this.f24983i;
    }

    @Override // i2.r
    public O f(int i10, int i11) {
        a aVar = (a) this.f24978d.get(i10);
        if (aVar == null) {
            AbstractC0853a.g(this.f24983i == null);
            aVar = new a(i10, i11, i11 == this.f24976b ? this.f24977c : null);
            aVar.h(this.f24980f, this.f24981g);
            this.f24978d.put(i10, aVar);
        }
        return aVar;
    }

    @Override // i2.r
    public void n() {
        D1.o[] oVarArr = new D1.o[this.f24978d.size()];
        for (int i10 = 0; i10 < this.f24978d.size(); i10++) {
            oVarArr[i10] = (D1.o) AbstractC0853a.i(((a) this.f24978d.valueAt(i10)).f24988e);
        }
        this.f24983i = oVarArr;
    }

    @Override // b2.InterfaceC2796f
    public void release() {
        this.f24975a.release();
    }

    @Override // i2.r
    public void v(J j10) {
        this.f24982h = j10;
    }
}
