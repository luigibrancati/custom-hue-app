package b2;

import D1.v;
import G1.C;
import I1.w;
import b2.InterfaceC2796f;
import i2.C4330j;
import i2.O;

/* JADX INFO: renamed from: b2.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C2800j extends AbstractC2791a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f25035o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f25036p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InterfaceC2796f f25037q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f25038r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile boolean f25039s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f25040t;

    public C2800j(I1.f fVar, I1.j jVar, D1.o oVar, int i10, Object obj, long j10, long j11, long j12, long j13, long j14, int i11, long j15, InterfaceC2796f interfaceC2796f) {
        super(fVar, jVar, oVar, i10, obj, j10, j11, j12, j13, j14);
        this.f25035o = i11;
        this.f25036p = j15;
        this.f25037q = interfaceC2796f;
    }

    @Override // e2.m.e
    public final void b() {
        this.f25039s = true;
    }

    @Override // b2.m
    public long f() {
        return this.f25048j + ((long) this.f25035o);
    }

    @Override // b2.m
    public boolean g() {
        return this.f25040t;
    }

    public final void l(C2793c c2793c) {
        if (v.q(this.f24997d.f1804n)) {
            D1.o oVar = this.f24997d;
            int i10 = oVar.f1787N;
            if ((i10 <= 1 && oVar.f1788O <= 1) || i10 == -1 || oVar.f1788O == -1) {
                return;
            }
            O oF = c2793c.f(0, 4);
            D1.o oVar2 = this.f24997d;
            int i11 = oVar2.f1787N * oVar2.f1788O;
            long j10 = (this.f25001h - this.f25000g) / ((long) i11);
            for (int i12 = 1; i12 < i11; i12++) {
                oF.b(new C(), 0);
                oF.d(((long) i12) * j10, 0, 0, 0, null);
            }
        }
    }

    @Override // e2.m.e
    public final void load() {
        C2793c c2793cI = i();
        if (this.f25038r == 0) {
            c2793cI.b(this.f25036p);
            InterfaceC2796f interfaceC2796f = this.f25037q;
            InterfaceC2796f.b bVarK = k(c2793cI);
            long j10 = this.f24964k;
            long j11 = j10 == -9223372036854775807L ? -9223372036854775807L : j10 - this.f25036p;
            long j12 = this.f24965l;
            interfaceC2796f.b(bVarK, j11, j12 != -9223372036854775807L ? j12 - this.f25036p : -9223372036854775807L);
        }
        try {
            I1.j jVarE = this.f24995b.e(this.f25038r);
            w wVar = this.f25002i;
            C4330j c4330j = new C4330j(wVar, jVarE.f5443g, wVar.f(jVarE));
            do {
                try {
                    if (this.f25039s) {
                        break;
                    }
                } finally {
                    this.f25038r = c4330j.getPosition() - this.f24995b.f5443g;
                }
            } while (this.f25037q.a(c4330j));
            l(c2793cI);
            this.f25038r = c4330j.getPosition() - this.f24995b.f5443g;
            m();
            I1.i.a(this.f25002i);
            this.f25040t = !this.f25039s;
        } catch (Throwable th) {
            m();
            I1.i.a(this.f25002i);
            throw th;
        }
    }

    public void m() {
    }

    public InterfaceC2796f.b k(C2793c c2793c) {
        return c2793c;
    }
}
