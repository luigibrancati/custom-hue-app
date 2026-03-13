package G0;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class c extends m {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f4184k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4185l;

    public c(F0.e eVar, int i10) {
        super(eVar);
        this.f4184k = new ArrayList();
        this.f4226f = i10;
        q();
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x01e0 A[PHI: r2 r23 r24 r25
      0x01e0: PHI (r2v29 int) = (r2v25 int), (r2v34 int) binds: [B:120:0x01de, B:111:0x01b8] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r23v1 int) = (r23v0 int), (r23v4 int) binds: [B:120:0x01de, B:111:0x01b8] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r24v1 int) = (r24v0 int), (r24v4 int) binds: [B:120:0x01de, B:111:0x01b8] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r25v2 int) = (r25v1 int), (r25v4 int) binds: [B:120:0x01de, B:111:0x01b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01e4 A[PHI: r23 r24 r25
      0x01e4: PHI (r23v3 int) = (r23v0 int), (r23v4 int) binds: [B:120:0x01de, B:111:0x01b8] A[DONT_GENERATE, DONT_INLINE]
      0x01e4: PHI (r24v3 int) = (r24v0 int), (r24v4 int) binds: [B:120:0x01de, B:111:0x01b8] A[DONT_GENERATE, DONT_INLINE]
      0x01e4: PHI (r25v3 int) = (r25v1 int), (r25v4 int) binds: [B:120:0x01de, B:111:0x01b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0162  */
    @Override // G0.m, G0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(G0.d r27) {
        /*
            Method dump skipped, instruction units count: 1084
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: G0.c.a(G0.d):void");
    }

    @Override // G0.m
    public void d() {
        Iterator it = this.f4184k.iterator();
        while (it.hasNext()) {
            ((m) it.next()).d();
        }
        int size = this.f4184k.size();
        if (size < 1) {
            return;
        }
        F0.e eVar = ((m) this.f4184k.get(0)).f4222b;
        F0.e eVar2 = ((m) this.f4184k.get(size - 1)).f4222b;
        if (this.f4226f == 0) {
            F0.d dVar = eVar.f3457B;
            F0.d dVar2 = eVar2.f3459D;
            f fVarI = i(dVar, 0);
            int iB = dVar.b();
            F0.e eVarR = r();
            if (eVarR != null) {
                iB = eVarR.f3457B.b();
            }
            if (fVarI != null) {
                b(this.f4228h, fVarI, iB);
            }
            f fVarI2 = i(dVar2, 0);
            int iB2 = dVar2.b();
            F0.e eVarS = s();
            if (eVarS != null) {
                iB2 = eVarS.f3459D.b();
            }
            if (fVarI2 != null) {
                b(this.f4229i, fVarI2, -iB2);
            }
        } else {
            F0.d dVar3 = eVar.f3458C;
            F0.d dVar4 = eVar2.f3460E;
            f fVarI3 = i(dVar3, 1);
            int iB3 = dVar3.b();
            F0.e eVarR2 = r();
            if (eVarR2 != null) {
                iB3 = eVarR2.f3458C.b();
            }
            if (fVarI3 != null) {
                b(this.f4228h, fVarI3, iB3);
            }
            f fVarI4 = i(dVar4, 1);
            int iB4 = dVar4.b();
            F0.e eVarS2 = s();
            if (eVarS2 != null) {
                iB4 = eVarS2.f3460E.b();
            }
            if (fVarI4 != null) {
                b(this.f4229i, fVarI4, -iB4);
            }
        }
        this.f4228h.f4195a = this;
        this.f4229i.f4195a = this;
    }

    @Override // G0.m
    public void e() {
        for (int i10 = 0; i10 < this.f4184k.size(); i10++) {
            ((m) this.f4184k.get(i10)).e();
        }
    }

    @Override // G0.m
    public void f() {
        this.f4223c = null;
        Iterator it = this.f4184k.iterator();
        while (it.hasNext()) {
            ((m) it.next()).f();
        }
    }

    @Override // G0.m
    public long j() {
        int size = this.f4184k.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = (m) this.f4184k.get(i10);
            j10 = j10 + ((long) mVar.f4228h.f4200f) + mVar.j() + ((long) mVar.f4229i.f4200f);
        }
        return j10;
    }

    @Override // G0.m
    public boolean m() {
        int size = this.f4184k.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!((m) this.f4184k.get(i10)).m()) {
                return false;
            }
        }
        return true;
    }

    public final void q() {
        F0.e eVar;
        F0.e eVar2 = this.f4222b;
        F0.e eVarF = eVar2.F(this.f4226f);
        while (true) {
            F0.e eVar3 = eVarF;
            eVar = eVar2;
            eVar2 = eVar3;
            if (eVar2 == null) {
                break;
            } else {
                eVarF = eVar2.F(this.f4226f);
            }
        }
        this.f4222b = eVar;
        this.f4184k.add(eVar.H(this.f4226f));
        F0.e eVarD = eVar.D(this.f4226f);
        while (eVarD != null) {
            this.f4184k.add(eVarD.H(this.f4226f));
            eVarD = eVarD.D(this.f4226f);
        }
        for (m mVar : this.f4184k) {
            int i10 = this.f4226f;
            if (i10 == 0) {
                mVar.f4222b.f3486c = this;
            } else if (i10 == 1) {
                mVar.f4222b.f3488d = this;
            }
        }
        if (this.f4226f == 0 && ((F0.f) this.f4222b.E()).W0() && this.f4184k.size() > 1) {
            ArrayList arrayList = this.f4184k;
            this.f4222b = ((m) arrayList.get(arrayList.size() - 1)).f4222b;
        }
        this.f4185l = this.f4226f == 0 ? this.f4222b.v() : this.f4222b.J();
    }

    public final F0.e r() {
        for (int i10 = 0; i10 < this.f4184k.size(); i10++) {
            m mVar = (m) this.f4184k.get(i10);
            if (mVar.f4222b.M() != 8) {
                return mVar.f4222b;
            }
        }
        return null;
    }

    public final F0.e s() {
        for (int size = this.f4184k.size() - 1; size >= 0; size--) {
            m mVar = (m) this.f4184k.get(size);
            if (mVar.f4222b.M() != 8) {
                return mVar.f4222b;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ChainRun ");
        sb2.append(this.f4226f == 0 ? "horizontal : " : "vertical : ");
        String string = sb2.toString();
        Iterator it = this.f4184k.iterator();
        while (it.hasNext()) {
            String str = string + "<";
            string = (str + ((m) it.next())) + "> ";
        }
        return string;
    }
}
