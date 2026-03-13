package G0;

import F0.e;
import G0.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public F0.f f4186a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public F0.f f4189d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4187b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4188c = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f4190e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f4191f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b.InterfaceC0066b f4192g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b.a f4193h = new b.a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f4194i = new ArrayList();

    public e(F0.f fVar) {
        this.f4186a = fVar;
        this.f4189d = fVar;
    }

    public final void a(f fVar, int i10, int i11, f fVar2, ArrayList arrayList, k kVar) {
        e eVar;
        int i12;
        f fVar3;
        ArrayList arrayList2;
        m mVar = fVar.f4198d;
        if (mVar.f4223c == null) {
            F0.f fVar4 = this.f4186a;
            if (mVar == fVar4.f3490e || mVar == fVar4.f3492f) {
                return;
            }
            if (kVar == null) {
                kVar = new k(mVar, i11);
                arrayList.add(kVar);
            }
            k kVar2 = kVar;
            mVar.f4223c = kVar2;
            kVar2.a(mVar);
            for (d dVar : mVar.f4228h.f4205k) {
                if (dVar instanceof f) {
                    eVar = this;
                    i12 = i10;
                    fVar3 = fVar2;
                    arrayList2 = arrayList;
                    eVar.a((f) dVar, i12, 0, fVar3, arrayList2, kVar2);
                } else {
                    eVar = this;
                    i12 = i10;
                    fVar3 = fVar2;
                    arrayList2 = arrayList;
                }
                this = eVar;
                i10 = i12;
                fVar2 = fVar3;
                arrayList = arrayList2;
            }
            e eVar2 = this;
            int i13 = i10;
            f fVar5 = fVar2;
            ArrayList arrayList3 = arrayList;
            for (d dVar2 : mVar.f4229i.f4205k) {
                if (dVar2 instanceof f) {
                    eVar2.a((f) dVar2, i13, 1, fVar5, arrayList3, kVar2);
                }
            }
            if (i13 == 1 && (mVar instanceof l)) {
                for (d dVar3 : ((l) mVar).f4218k.f4205k) {
                    if (dVar3 instanceof f) {
                        eVar2.a((f) dVar3, i13, 2, fVar5, arrayList3, kVar2);
                    }
                }
            }
            for (f fVar6 : mVar.f4228h.f4206l) {
                if (fVar6 == fVar5) {
                    kVar2.f4212b = true;
                }
                eVar2.a(fVar6, i13, 0, fVar5, arrayList3, kVar2);
            }
            for (f fVar7 : mVar.f4229i.f4206l) {
                if (fVar7 == fVar5) {
                    kVar2.f4212b = true;
                }
                eVar2.a(fVar7, i13, 1, fVar5, arrayList3, kVar2);
            }
            if (i13 == 1 && (mVar instanceof l)) {
                Iterator it = ((l) mVar).f4218k.f4206l.iterator();
                while (it.hasNext()) {
                    eVar2.a((f) it.next(), i13, 2, fVar5, arrayList3, kVar2);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x0284 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0008 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(F0.f r20) {
        /*
            Method dump skipped, instruction units count: 837
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: G0.e.b(F0.f):boolean");
    }

    public void c() {
        d(this.f4190e);
        this.f4194i.clear();
        k.f4210h = 0;
        i(this.f4186a.f3490e, 0, this.f4194i);
        i(this.f4186a.f3492f, 1, this.f4194i);
        this.f4187b = false;
    }

    public void d(ArrayList arrayList) {
        arrayList.clear();
        this.f4189d.f3490e.f();
        this.f4189d.f3492f.f();
        arrayList.add(this.f4189d.f3490e);
        arrayList.add(this.f4189d.f3492f);
        HashSet hashSet = null;
        for (F0.e eVar : this.f4189d.f3578w0) {
            if (eVar instanceof F0.g) {
                arrayList.add(new h(eVar));
            } else {
                if (eVar.T()) {
                    if (eVar.f3486c == null) {
                        eVar.f3486c = new c(eVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f3486c);
                } else {
                    arrayList.add(eVar.f3490e);
                }
                if (eVar.V()) {
                    if (eVar.f3488d == null) {
                        eVar.f3488d = new c(eVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f3488d);
                } else {
                    arrayList.add(eVar.f3492f);
                }
                if (eVar instanceof F0.i) {
                    arrayList.add(new i(eVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((m) it.next()).f();
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            m mVar = (m) it2.next();
            if (mVar.f4222b != this.f4189d) {
                mVar.d();
            }
        }
    }

    public final int e(F0.f fVar, int i10) {
        int size = this.f4194i.size();
        long jMax = 0;
        for (int i11 = 0; i11 < size; i11++) {
            jMax = Math.max(jMax, ((k) this.f4194i.get(i11)).b(fVar, i10));
        }
        return (int) jMax;
    }

    public boolean f(boolean z10) {
        boolean z11;
        boolean z12 = false;
        if (this.f4187b || this.f4188c) {
            for (F0.e eVar : this.f4186a.f3578w0) {
                eVar.f3482a = false;
                eVar.f3490e.r();
                eVar.f3492f.q();
            }
            F0.f fVar = this.f4186a;
            fVar.f3482a = false;
            fVar.f3490e.r();
            this.f4186a.f3492f.q();
            this.f4188c = false;
        }
        if (b(this.f4189d)) {
            return false;
        }
        this.f4186a.C0(0);
        this.f4186a.D0(0);
        e.b bVarQ = this.f4186a.q(0);
        e.b bVarQ2 = this.f4186a.q(1);
        if (this.f4187b) {
            c();
        }
        int iO = this.f4186a.O();
        int iP = this.f4186a.P();
        this.f4186a.f3490e.f4228h.d(iO);
        this.f4186a.f3492f.f4228h.d(iP);
        m();
        e.b bVar = e.b.WRAP_CONTENT;
        if (bVarQ == bVar || bVarQ2 == bVar) {
            if (z10) {
                Iterator it = this.f4190e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (!((m) it.next()).m()) {
                        z10 = false;
                        break;
                    }
                }
            }
            if (z10 && bVarQ == e.b.WRAP_CONTENT) {
                this.f4186a.i0(e.b.FIXED);
                F0.f fVar2 = this.f4186a;
                fVar2.B0(e(fVar2, 0));
                F0.f fVar3 = this.f4186a;
                fVar3.f3490e.f4225e.d(fVar3.N());
            }
            if (z10 && bVarQ2 == e.b.WRAP_CONTENT) {
                this.f4186a.x0(e.b.FIXED);
                F0.f fVar4 = this.f4186a;
                fVar4.e0(e(fVar4, 1));
                F0.f fVar5 = this.f4186a;
                fVar5.f3492f.f4225e.d(fVar5.t());
            }
        }
        F0.f fVar6 = this.f4186a;
        e.b bVar2 = fVar6.f3468M[0];
        e.b bVar3 = e.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == e.b.MATCH_PARENT) {
            int iN = fVar6.N() + iO;
            this.f4186a.f3490e.f4229i.d(iN);
            this.f4186a.f3490e.f4225e.d(iN - iO);
            m();
            F0.f fVar7 = this.f4186a;
            e.b bVar4 = fVar7.f3468M[1];
            if (bVar4 == bVar3 || bVar4 == e.b.MATCH_PARENT) {
                int iT = fVar7.t() + iP;
                this.f4186a.f3492f.f4229i.d(iT);
                this.f4186a.f3492f.f4225e.d(iT - iP);
            }
            m();
            z11 = true;
        } else {
            z11 = false;
        }
        for (m mVar : this.f4190e) {
            if (mVar.f4222b != this.f4186a || mVar.f4227g) {
                mVar.e();
            }
        }
        Iterator it2 = this.f4190e.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z12 = true;
                break;
            }
            m mVar2 = (m) it2.next();
            if (z11 || mVar2.f4222b != this.f4186a) {
                if (!mVar2.f4228h.f4204j || ((!mVar2.f4229i.f4204j && !(mVar2 instanceof h)) || (!mVar2.f4225e.f4204j && !(mVar2 instanceof c) && !(mVar2 instanceof h)))) {
                    break;
                }
            }
        }
        this.f4186a.i0(bVarQ);
        this.f4186a.x0(bVarQ2);
        return z12;
    }

    public boolean g(boolean z10) {
        if (this.f4187b) {
            for (F0.e eVar : this.f4186a.f3578w0) {
                eVar.f3482a = false;
                j jVar = eVar.f3490e;
                jVar.f4225e.f4204j = false;
                jVar.f4227g = false;
                jVar.r();
                l lVar = eVar.f3492f;
                lVar.f4225e.f4204j = false;
                lVar.f4227g = false;
                lVar.q();
            }
            F0.f fVar = this.f4186a;
            fVar.f3482a = false;
            j jVar2 = fVar.f3490e;
            jVar2.f4225e.f4204j = false;
            jVar2.f4227g = false;
            jVar2.r();
            l lVar2 = this.f4186a.f3492f;
            lVar2.f4225e.f4204j = false;
            lVar2.f4227g = false;
            lVar2.q();
            c();
        }
        if (b(this.f4189d)) {
            return false;
        }
        this.f4186a.C0(0);
        this.f4186a.D0(0);
        this.f4186a.f3490e.f4228h.d(0);
        this.f4186a.f3492f.f4228h.d(0);
        return true;
    }

    public boolean h(boolean z10, int i10) {
        boolean z11;
        e.b bVar;
        boolean z12 = false;
        e.b bVarQ = this.f4186a.q(0);
        e.b bVarQ2 = this.f4186a.q(1);
        int iO = this.f4186a.O();
        int iP = this.f4186a.P();
        if (z10 && (bVarQ == (bVar = e.b.WRAP_CONTENT) || bVarQ2 == bVar)) {
            Iterator it = this.f4190e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                m mVar = (m) it.next();
                if (mVar.f4226f == i10 && !mVar.m()) {
                    z10 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z10 && bVarQ == e.b.WRAP_CONTENT) {
                    this.f4186a.i0(e.b.FIXED);
                    F0.f fVar = this.f4186a;
                    fVar.B0(e(fVar, 0));
                    F0.f fVar2 = this.f4186a;
                    fVar2.f3490e.f4225e.d(fVar2.N());
                }
            } else if (z10 && bVarQ2 == e.b.WRAP_CONTENT) {
                this.f4186a.x0(e.b.FIXED);
                F0.f fVar3 = this.f4186a;
                fVar3.e0(e(fVar3, 1));
                F0.f fVar4 = this.f4186a;
                fVar4.f3492f.f4225e.d(fVar4.t());
            }
        }
        if (i10 == 0) {
            F0.f fVar5 = this.f4186a;
            e.b bVar2 = fVar5.f3468M[0];
            if (bVar2 == e.b.FIXED || bVar2 == e.b.MATCH_PARENT) {
                int iN = fVar5.N() + iO;
                this.f4186a.f3490e.f4229i.d(iN);
                this.f4186a.f3490e.f4225e.d(iN - iO);
                z11 = true;
            }
            z11 = false;
        } else {
            F0.f fVar6 = this.f4186a;
            e.b bVar3 = fVar6.f3468M[1];
            if (bVar3 == e.b.FIXED || bVar3 == e.b.MATCH_PARENT) {
                int iT = fVar6.t() + iP;
                this.f4186a.f3492f.f4229i.d(iT);
                this.f4186a.f3492f.f4225e.d(iT - iP);
                z11 = true;
            }
            z11 = false;
        }
        m();
        for (m mVar2 : this.f4190e) {
            if (mVar2.f4226f == i10 && (mVar2.f4222b != this.f4186a || mVar2.f4227g)) {
                mVar2.e();
            }
        }
        Iterator it2 = this.f4190e.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z12 = true;
                break;
            }
            m mVar3 = (m) it2.next();
            if (mVar3.f4226f == i10 && (z11 || mVar3.f4222b != this.f4186a)) {
                if (!mVar3.f4228h.f4204j || !mVar3.f4229i.f4204j || (!(mVar3 instanceof c) && !mVar3.f4225e.f4204j)) {
                    break;
                }
            }
        }
        this.f4186a.i0(bVarQ);
        this.f4186a.x0(bVarQ2);
        return z12;
    }

    public final void i(m mVar, int i10, ArrayList arrayList) {
        for (d dVar : mVar.f4228h.f4205k) {
            if (dVar instanceof f) {
                a((f) dVar, i10, 0, mVar.f4229i, arrayList, null);
            } else if (dVar instanceof m) {
                a(((m) dVar).f4228h, i10, 0, mVar.f4229i, arrayList, null);
            }
        }
        for (d dVar2 : mVar.f4229i.f4205k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i10, 1, mVar.f4228h, arrayList, null);
            } else if (dVar2 instanceof m) {
                a(((m) dVar2).f4229i, i10, 1, mVar.f4228h, arrayList, null);
            }
        }
        int i11 = i10;
        if (i11 == 1) {
            for (d dVar3 : ((l) mVar).f4218k.f4205k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i11, 2, null, arrayList, null);
                }
                i11 = i10;
            }
        }
    }

    public void j() {
        this.f4187b = true;
    }

    public void k() {
        this.f4188c = true;
    }

    public final void l(F0.e eVar, e.b bVar, int i10, e.b bVar2, int i11) {
        b.a aVar = this.f4193h;
        aVar.f4174a = bVar;
        aVar.f4175b = bVar2;
        aVar.f4176c = i10;
        aVar.f4177d = i11;
        this.f4192g.b(eVar, aVar);
        eVar.B0(this.f4193h.f4178e);
        eVar.e0(this.f4193h.f4179f);
        eVar.d0(this.f4193h.f4181h);
        eVar.Y(this.f4193h.f4180g);
    }

    public void m() {
        e eVar;
        g gVar;
        for (F0.e eVar2 : this.f4186a.f3578w0) {
            if (!eVar2.f3482a) {
                e.b[] bVarArr = eVar2.f3468M;
                boolean z10 = false;
                e.b bVar = bVarArr[0];
                e.b bVar2 = bVarArr[1];
                int i10 = eVar2.f3504l;
                int i11 = eVar2.f3506m;
                e.b bVar3 = e.b.WRAP_CONTENT;
                boolean z11 = bVar == bVar3 || (bVar == e.b.MATCH_CONSTRAINT && i10 == 1);
                if (bVar2 == bVar3 || (bVar2 == e.b.MATCH_CONSTRAINT && i11 == 1)) {
                    z10 = true;
                }
                g gVar2 = eVar2.f3490e.f4225e;
                boolean z12 = gVar2.f4204j;
                g gVar3 = eVar2.f3492f.f4225e;
                boolean z13 = gVar3.f4204j;
                if (z12 && z13) {
                    e.b bVar4 = e.b.FIXED;
                    eVar = this;
                    eVar.l(eVar2, bVar4, gVar2.f4201g, bVar4, gVar3.f4201g);
                    eVar2.f3482a = true;
                } else if (z12 && z10) {
                    eVar = this;
                    eVar.l(eVar2, e.b.FIXED, gVar2.f4201g, bVar3, gVar3.f4201g);
                    if (bVar2 == e.b.MATCH_CONSTRAINT) {
                        eVar2.f3492f.f4225e.f4207m = eVar2.t();
                    } else {
                        eVar2.f3492f.f4225e.d(eVar2.t());
                        eVar2.f3482a = true;
                    }
                } else {
                    eVar = this;
                    if (z13 && z11) {
                        eVar.l(eVar2, bVar3, gVar2.f4201g, e.b.FIXED, gVar3.f4201g);
                        if (bVar == e.b.MATCH_CONSTRAINT) {
                            eVar2.f3490e.f4225e.f4207m = eVar2.N();
                        } else {
                            eVar2.f3490e.f4225e.d(eVar2.N());
                            eVar2.f3482a = true;
                        }
                    }
                }
                if (eVar2.f3482a && (gVar = eVar2.f3492f.f4219l) != null) {
                    gVar.d(eVar2.l());
                }
                this = eVar;
            }
        }
    }

    public void n(b.InterfaceC0066b interfaceC0066b) {
        this.f4192g = interfaceC0066b;
    }
}
