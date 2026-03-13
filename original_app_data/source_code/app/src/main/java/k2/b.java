package k2;

import D1.o;
import D1.v;
import D1.w;
import F2.s;
import F2.t;
import G1.AbstractC0853a;
import G1.C;
import K7.Y;
import i2.G;
import i2.I;
import i2.InterfaceC4336p;
import i2.InterfaceC4337q;
import i2.J;
import i2.O;
import i2.r;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC4336p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f39204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f39205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f39206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s.a f39207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f39208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r f39209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public k2.c f39210g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f39211h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e[] f39212i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f39213j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e f39214k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f39215l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f39216m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f39217n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f39218o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f39219p;

    /* JADX INFO: renamed from: k2.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C0511b implements J {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f39220a;

        public C0511b(long j10) {
            this.f39220a = j10;
        }

        @Override // i2.J
        public J.a e(long j10) {
            J.a aVarI = b.this.f39212i[0].i(j10);
            for (int i10 = 1; i10 < b.this.f39212i.length; i10++) {
                J.a aVarI2 = b.this.f39212i[i10].i(j10);
                if (aVarI2.f36872a.f36878b < aVarI.f36872a.f36878b) {
                    aVarI = aVarI2;
                }
            }
            return aVarI;
        }

        @Override // i2.J
        public boolean h() {
            return true;
        }

        @Override // i2.J
        public long m() {
            return this.f39220a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f39222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f39223b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f39224c;

        public c() {
        }

        public void a(C c10) {
            this.f39222a = c10.y();
            this.f39223b = c10.y();
            this.f39224c = 0;
        }

        public void b(C c10) throws w {
            a(c10);
            if (this.f39222a == 1414744396) {
                this.f39224c = c10.y();
                return;
            }
            throw w.a("LIST expected, found: " + this.f39222a, null);
        }
    }

    @Deprecated
    public b() {
        this(1, s.a.f3686a);
    }

    public static void d(InterfaceC4337q interfaceC4337q) {
        if ((interfaceC4337q.getPosition() & 1) == 1) {
            interfaceC4337q.q(1);
        }
    }

    @Override // i2.InterfaceC4336p
    public void a(long j10, long j11) {
        this.f39213j = -1L;
        this.f39214k = null;
        for (e eVar : this.f39212i) {
            eVar.o(j10);
        }
        if (j10 != 0) {
            this.f39208e = 6;
        } else if (this.f39212i.length == 0) {
            this.f39208e = 0;
        } else {
            this.f39208e = 3;
        }
    }

    @Override // i2.InterfaceC4336p
    public void c(r rVar) {
        this.f39208e = 0;
        if (this.f39206c) {
            rVar = new t(rVar, this.f39207d);
        }
        this.f39209f = rVar;
        this.f39213j = -1L;
    }

    public final e e(int i10) {
        for (e eVar : this.f39212i) {
            if (eVar.j(i10)) {
                return eVar;
            }
        }
        return null;
    }

    public final void g(C c10) throws w {
        f fVarC = f.c(1819436136, c10);
        if (fVarC.getType() != 1819436136) {
            throw w.a("Unexpected header list type " + fVarC.getType(), null);
        }
        k2.c cVar = (k2.c) fVarC.b(k2.c.class);
        if (cVar == null) {
            throw w.a("AviHeader not found", null);
        }
        this.f39210g = cVar;
        this.f39211h = ((long) cVar.f39227c) * ((long) cVar.f39225a);
        ArrayList arrayList = new ArrayList();
        Y it = fVarC.f39250a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            InterfaceC4790a interfaceC4790a = (InterfaceC4790a) it.next();
            if (interfaceC4790a.getType() == 1819440243) {
                int i11 = i10 + 1;
                e eVarM = m((f) interfaceC4790a, i10);
                if (eVarM != null) {
                    arrayList.add(eVarM);
                }
                i10 = i11;
            }
        }
        this.f39212i = (e[]) arrayList.toArray(new e[0]);
        this.f39209f.n();
    }

    public final void h(C c10) {
        int i10;
        long jL = l(c10);
        while (true) {
            if (c10.a() < 16) {
                break;
            }
            int iY = c10.y();
            int iY2 = c10.y();
            long jY = ((long) c10.y()) + jL;
            c10.b0(4);
            e eVarE = e(iY);
            if (eVarE != null) {
                eVarE.b(jY, (iY2 & 16) == 16);
            }
        }
        for (e eVar : this.f39212i) {
            eVar.c();
        }
        this.f39219p = true;
        if (this.f39212i.length == 0) {
            this.f39209f.v(new J.b(this.f39211h));
        } else {
            this.f39209f.v(new C0511b(this.f39211h));
        }
    }

    @Override // i2.InterfaceC4336p
    public int i(InterfaceC4337q interfaceC4337q, I i10) throws w {
        if (o(interfaceC4337q, i10)) {
            return 1;
        }
        switch (this.f39208e) {
            case 0:
                if (!j(interfaceC4337q)) {
                    throw w.a("AVI Header List not found", null);
                }
                interfaceC4337q.q(12);
                this.f39208e = 1;
                return 0;
            case 1:
                interfaceC4337q.readFully(this.f39204a.f(), 0, 12);
                this.f39204a.a0(0);
                this.f39205b.b(this.f39204a);
                c cVar = this.f39205b;
                if (cVar.f39224c == 1819436136) {
                    this.f39215l = cVar.f39223b;
                    this.f39208e = 2;
                    return 0;
                }
                throw w.a("hdrl expected, found: " + this.f39205b.f39224c, null);
            case 2:
                int i11 = this.f39215l - 4;
                C c10 = new C(i11);
                interfaceC4337q.readFully(c10.f(), 0, i11);
                g(c10);
                this.f39208e = 3;
                return 0;
            case 3:
                if (this.f39216m != -1) {
                    long position = interfaceC4337q.getPosition();
                    long j10 = this.f39216m;
                    if (position != j10) {
                        this.f39213j = j10;
                        return 0;
                    }
                }
                interfaceC4337q.s(this.f39204a.f(), 0, 12);
                interfaceC4337q.i();
                this.f39204a.a0(0);
                this.f39205b.a(this.f39204a);
                int iY = this.f39204a.y();
                int i12 = this.f39205b.f39222a;
                if (i12 == 1179011410) {
                    interfaceC4337q.q(12);
                    return 0;
                }
                if (i12 != 1414744396 || iY != 1769369453) {
                    this.f39213j = interfaceC4337q.getPosition() + ((long) this.f39205b.f39223b) + 8;
                    return 0;
                }
                long position2 = interfaceC4337q.getPosition();
                this.f39216m = position2;
                this.f39217n = position2 + ((long) this.f39205b.f39223b) + 8;
                if (!this.f39219p) {
                    if (((k2.c) AbstractC0853a.e(this.f39210g)).a()) {
                        this.f39208e = 4;
                        this.f39213j = this.f39217n;
                        return 0;
                    }
                    this.f39209f.v(new J.b(this.f39211h));
                    this.f39219p = true;
                }
                this.f39213j = interfaceC4337q.getPosition() + 12;
                this.f39208e = 6;
                return 0;
            case 4:
                interfaceC4337q.readFully(this.f39204a.f(), 0, 8);
                this.f39204a.a0(0);
                int iY2 = this.f39204a.y();
                int iY3 = this.f39204a.y();
                if (iY2 == 829973609) {
                    this.f39208e = 5;
                    this.f39218o = iY3;
                } else {
                    this.f39213j = interfaceC4337q.getPosition() + ((long) iY3);
                }
                return 0;
            case 5:
                C c11 = new C(this.f39218o);
                interfaceC4337q.readFully(c11.f(), 0, this.f39218o);
                h(c11);
                this.f39208e = 6;
                this.f39213j = this.f39216m;
                return 0;
            case 6:
                return n(interfaceC4337q);
            default:
                throw new AssertionError();
        }
    }

    @Override // i2.InterfaceC4336p
    public boolean j(InterfaceC4337q interfaceC4337q) {
        interfaceC4337q.s(this.f39204a.f(), 0, 12);
        this.f39204a.a0(0);
        if (this.f39204a.y() != 1179011410) {
            return false;
        }
        this.f39204a.b0(4);
        return this.f39204a.y() == 541677121;
    }

    public final long l(C c10) {
        if (c10.a() < 16) {
            return 0L;
        }
        int iG = c10.g();
        c10.b0(8);
        long jY = c10.y();
        long j10 = this.f39216m;
        long j11 = jY <= j10 ? j10 + 8 : 0L;
        c10.a0(iG);
        return j11;
    }

    public final e m(f fVar, int i10) {
        d dVar = (d) fVar.b(d.class);
        g gVar = (g) fVar.b(g.class);
        if (dVar == null) {
            G1.t.h("AviExtractor", "Missing Stream Header");
            return null;
        }
        if (gVar == null) {
            G1.t.h("AviExtractor", "Missing Stream Format");
            return null;
        }
        long jA = dVar.a();
        o oVar = gVar.f39252a;
        o.b bVarB = oVar.b();
        bVarB.i0(i10);
        int i11 = dVar.f39234f;
        if (i11 != 0) {
            bVarB.o0(i11);
        }
        h hVar = (h) fVar.b(h.class);
        if (hVar != null) {
            bVarB.l0(hVar.f39253a);
        }
        int iK = v.k(oVar.f1805o);
        if (iK != 1 && iK != 2) {
            return null;
        }
        O oF = this.f39209f.f(i10, iK);
        oF.e(bVarB.P());
        oF.f(jA);
        this.f39211h = Math.max(this.f39211h, jA);
        return new e(i10, dVar, oF);
    }

    public final int n(InterfaceC4337q interfaceC4337q) {
        if (interfaceC4337q.getPosition() >= this.f39217n) {
            return -1;
        }
        e eVar = this.f39214k;
        if (eVar == null) {
            d(interfaceC4337q);
            interfaceC4337q.s(this.f39204a.f(), 0, 12);
            this.f39204a.a0(0);
            int iY = this.f39204a.y();
            if (iY == 1414744396) {
                this.f39204a.a0(8);
                interfaceC4337q.q(this.f39204a.y() != 1769369453 ? 8 : 12);
                interfaceC4337q.i();
                return 0;
            }
            int iY2 = this.f39204a.y();
            if (iY == 1263424842) {
                this.f39213j = interfaceC4337q.getPosition() + ((long) iY2) + 8;
                return 0;
            }
            interfaceC4337q.q(8);
            interfaceC4337q.i();
            e eVarE = e(iY);
            if (eVarE == null) {
                this.f39213j = interfaceC4337q.getPosition() + ((long) iY2);
                return 0;
            }
            eVarE.n(iY2);
            this.f39214k = eVarE;
        } else if (eVar.m(interfaceC4337q)) {
            this.f39214k = null;
        }
        return 0;
    }

    public final boolean o(InterfaceC4337q interfaceC4337q, I i10) {
        boolean z10;
        if (this.f39213j != -1) {
            long position = interfaceC4337q.getPosition();
            long j10 = this.f39213j;
            if (j10 < position || j10 > 262144 + position) {
                i10.f36871a = j10;
                z10 = true;
            } else {
                interfaceC4337q.q((int) (j10 - position));
                z10 = false;
            }
        } else {
            z10 = false;
        }
        this.f39213j = -1L;
        return z10;
    }

    public b(int i10, s.a aVar) {
        this.f39207d = aVar;
        this.f39206c = (i10 & 1) == 0;
        this.f39204a = new C(12);
        this.f39205b = new c();
        this.f39209f = new G();
        this.f39212i = new e[0];
        this.f39216m = -1L;
        this.f39217n = -1L;
        this.f39215l = -1;
        this.f39211h = -9223372036854775807L;
    }

    @Override // i2.InterfaceC4336p
    public void release() {
    }
}
