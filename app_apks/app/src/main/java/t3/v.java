package t3;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import t3.k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class v extends k {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f44725Y;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public k[] f44728l0;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public ArrayList f44723W = new ArrayList();

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f44724X = true;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public boolean f44726Z = false;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f44727k0 = 0;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f44729a;

        public a(k kVar) {
            this.f44729a = kVar;
        }

        @Override // t3.r, t3.k.h
        public void i(k kVar) {
            this.f44729a.l0();
            kVar.h0(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b extends r {
        public b() {
        }

        @Override // t3.r, t3.k.h
        public void a(k kVar) {
            v.this.f44723W.remove(kVar);
            if (v.this.Q()) {
                return;
            }
            v.this.c0(k.i.f44710c, false);
            v vVar = v.this;
            vVar.f44651B = true;
            vVar.c0(k.i.f44709b, false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c extends r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public v f44732a;

        public c(v vVar) {
            this.f44732a = vVar;
        }

        @Override // t3.r, t3.k.h
        public void i(k kVar) {
            v vVar = this.f44732a;
            int i10 = vVar.f44725Y - 1;
            vVar.f44725Y = i10;
            if (i10 == 0) {
                vVar.f44726Z = false;
                vVar.y();
            }
            kVar.h0(this);
        }

        @Override // t3.r, t3.k.h
        public void l(k kVar) {
            v vVar = this.f44732a;
            if (vVar.f44726Z) {
                return;
            }
            vVar.t0();
            this.f44732a.f44726Z = true;
        }
    }

    public k A0(int i10) {
        if (i10 < 0 || i10 >= this.f44723W.size()) {
            return null;
        }
        return (k) this.f44723W.get(i10);
    }

    public int B0() {
        return this.f44723W.size();
    }

    public final int C0(long j10) {
        for (int i10 = 1; i10 < this.f44723W.size(); i10++) {
            if (((k) this.f44723W.get(i10)).f44661Q > j10) {
                return i10 - 1;
            }
        }
        return this.f44723W.size() - 1;
    }

    @Override // t3.k
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public v h0(k.h hVar) {
        return (v) super.h0(hVar);
    }

    @Override // t3.k
    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public v i0(View view) {
        for (int i10 = 0; i10 < this.f44723W.size(); i10++) {
            ((k) this.f44723W.get(i10)).i0(view);
        }
        return (v) super.i0(view);
    }

    public final void F0(k[] kVarArr) {
        Arrays.fill(kVarArr, (Object) null);
        this.f44728l0 = kVarArr;
    }

    @Override // t3.k
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public v n0(long j10) {
        ArrayList arrayList;
        super.n0(j10);
        if (this.f44664c >= 0 && (arrayList = this.f44723W) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((k) this.f44723W.get(i10)).n0(j10);
            }
        }
        return this;
    }

    @Override // t3.k
    /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] */
    public v p0(TimeInterpolator timeInterpolator) {
        this.f44727k0 |= 1;
        ArrayList arrayList = this.f44723W;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((k) this.f44723W.get(i10)).p0(timeInterpolator);
            }
        }
        return (v) super.p0(timeInterpolator);
    }

    public v I0(int i10) {
        if (i10 == 0) {
            this.f44724X = true;
            return this;
        }
        if (i10 == 1) {
            this.f44724X = false;
            return this;
        }
        throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i10);
    }

    @Override // t3.k
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public v s0(long j10) {
        return (v) super.s0(j10);
    }

    public final void L0() {
        c cVar = new c(this);
        Iterator it = this.f44723W.iterator();
        while (it.hasNext()) {
            ((k) it.next()).g(cVar);
        }
        this.f44725Y = this.f44723W.size();
    }

    public final k[] N0() {
        k[] kVarArr = this.f44728l0;
        this.f44728l0 = null;
        if (kVarArr == null) {
            kVarArr = new k[this.f44723W.size()];
        }
        return (k[]) this.f44723W.toArray(kVarArr);
    }

    @Override // t3.k
    public boolean Q() {
        for (int i10 = 0; i10 < this.f44723W.size(); i10++) {
            if (((k) this.f44723W.get(i10)).Q()) {
                return true;
            }
        }
        return false;
    }

    @Override // t3.k
    public boolean R() {
        int size = this.f44723W.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!((k) this.f44723W.get(i10)).R()) {
                return false;
            }
        }
        return true;
    }

    @Override // t3.k
    public void cancel() {
        super.cancel();
        k[] kVarArrN0 = N0();
        int size = this.f44723W.size();
        for (int i10 = 0; i10 < size; i10++) {
            kVarArrN0[i10].cancel();
        }
        F0(kVarArrN0);
    }

    @Override // t3.k
    public void d0(View view) {
        super.d0(view);
        int size = this.f44723W.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((k) this.f44723W.get(i10)).d0(view);
        }
    }

    @Override // t3.k
    public void f0() {
        this.f44659J = 0L;
        b bVar = new b();
        for (int i10 = 0; i10 < this.f44723W.size(); i10++) {
            k kVar = (k) this.f44723W.get(i10);
            kVar.g(bVar);
            kVar.f0();
            long jN = kVar.N();
            if (this.f44724X) {
                this.f44659J = Math.max(this.f44659J, jN);
            } else {
                long j10 = this.f44659J;
                kVar.f44661Q = j10;
                this.f44659J = j10 + jN;
            }
        }
    }

    @Override // t3.k
    public void j0(View view) {
        super.j0(view);
        k[] kVarArrN0 = N0();
        int size = this.f44723W.size();
        for (int i10 = 0; i10 < size; i10++) {
            kVarArrN0[i10].j0(view);
        }
        F0(kVarArrN0);
    }

    @Override // t3.k
    public void l0() {
        if (this.f44723W.isEmpty()) {
            t0();
            y();
            return;
        }
        L0();
        if (this.f44724X) {
            Iterator it = this.f44723W.iterator();
            while (it.hasNext()) {
                ((k) it.next()).l0();
            }
            return;
        }
        for (int i10 = 1; i10 < this.f44723W.size(); i10++) {
            ((k) this.f44723W.get(i10 - 1)).g(new a((k) this.f44723W.get(i10)));
        }
        k kVar = (k) this.f44723W.get(0);
        if (kVar != null) {
            kVar.l0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    @Override // t3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m0(long r20, long r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r3 = r22
            long r5 = r0.N()
            t3.v r7 = r0.f44679r
            r8 = 0
            if (r7 == 0) goto L22
            int r7 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r7 >= 0) goto L18
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 < 0) goto Lc2
        L18:
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L22
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L22
            goto Lc2
        L22:
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r10 = 0
            r11 = 1
            if (r7 >= 0) goto L2a
            r12 = r11
            goto L2b
        L2a:
            r12 = r10
        L2b:
            int r13 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r13 < 0) goto L33
            int r14 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r14 < 0) goto L3b
        L33:
            int r14 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r14 > 0) goto L42
            int r14 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r14 <= 0) goto L42
        L3b:
            r0.f44651B = r10
            t3.k$i r14 = t3.k.i.f44708a
            r0.c0(r14, r12)
        L42:
            boolean r14 = r0.f44724X
            if (r14 == 0) goto L5f
        L46:
            java.util.ArrayList r7 = r0.f44723W
            int r7 = r7.size()
            if (r10 >= r7) goto L5c
            java.util.ArrayList r7 = r0.f44723W
            java.lang.Object r7 = r7.get(r10)
            t3.k r7 = (t3.k) r7
            r7.m0(r1, r3)
            int r10 = r10 + 1
            goto L46
        L5c:
            r16 = r8
            goto La7
        L5f:
            int r10 = r0.C0(r3)
            if (r7 < 0) goto L8a
        L65:
            java.util.ArrayList r7 = r0.f44723W
            int r7 = r7.size()
            if (r10 >= r7) goto L5c
            java.util.ArrayList r7 = r0.f44723W
            java.lang.Object r7 = r7.get(r10)
            t3.k r7 = (t3.k) r7
            long r14 = r7.f44661Q
            r16 = r8
            long r8 = r1 - r14
            int r18 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r18 >= 0) goto L80
            goto La7
        L80:
            long r14 = r3 - r14
            r7.m0(r8, r14)
            int r10 = r10 + 1
            r8 = r16
            goto L65
        L8a:
            r16 = r8
        L8c:
            if (r10 < 0) goto La7
            java.util.ArrayList r7 = r0.f44723W
            java.lang.Object r7 = r7.get(r10)
            t3.k r7 = (t3.k) r7
            long r8 = r7.f44661Q
            long r14 = r1 - r8
            long r8 = r3 - r8
            r7.m0(r14, r8)
            int r7 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r7 < 0) goto La4
            goto La7
        La4:
            int r10 = r10 + (-1)
            goto L8c
        La7:
            t3.v r7 = r0.f44679r
            if (r7 == 0) goto Lc2
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto Lb3
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 <= 0) goto Lb9
        Lb3:
            if (r13 >= 0) goto Lc2
            int r2 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r2 < 0) goto Lc2
        Lb9:
            if (r1 <= 0) goto Lbd
            r0.f44651B = r11
        Lbd:
            t3.k$i r1 = t3.k.i.f44709b
            r0.c0(r1, r12)
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.v.m0(long, long):void");
    }

    @Override // t3.k
    public void o(x xVar) {
        if (T(xVar.f44735b)) {
            for (k kVar : this.f44723W) {
                if (kVar.T(xVar.f44735b)) {
                    kVar.o(xVar);
                    xVar.f44736c.add(kVar);
                }
            }
        }
    }

    @Override // t3.k
    public void o0(k.e eVar) {
        super.o0(eVar);
        this.f44727k0 |= 8;
        int size = this.f44723W.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((k) this.f44723W.get(i10)).o0(eVar);
        }
    }

    @Override // t3.k
    public void q(x xVar) {
        super.q(xVar);
        int size = this.f44723W.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((k) this.f44723W.get(i10)).q(xVar);
        }
    }

    @Override // t3.k
    public void q0(AbstractC5838g abstractC5838g) {
        super.q0(abstractC5838g);
        this.f44727k0 |= 4;
        if (this.f44723W != null) {
            for (int i10 = 0; i10 < this.f44723W.size(); i10++) {
                ((k) this.f44723W.get(i10)).q0(abstractC5838g);
            }
        }
    }

    @Override // t3.k
    public void r(x xVar) {
        if (T(xVar.f44735b)) {
            for (k kVar : this.f44723W) {
                if (kVar.T(xVar.f44735b)) {
                    kVar.r(xVar);
                    xVar.f44736c.add(kVar);
                }
            }
        }
    }

    @Override // t3.k
    public void r0(t tVar) {
        super.r0(tVar);
        this.f44727k0 |= 2;
        int size = this.f44723W.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((k) this.f44723W.get(i10)).r0(tVar);
        }
    }

    @Override // t3.k
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public k clone() {
        v vVar = (v) super.clone();
        vVar.f44723W = new ArrayList();
        int size = this.f44723W.size();
        for (int i10 = 0; i10 < size; i10++) {
            vVar.z0(((k) this.f44723W.get(i10)).clone());
        }
        return vVar;
    }

    @Override // t3.k
    public String u0(String str) {
        String strU0 = super.u0(str);
        for (int i10 = 0; i10 < this.f44723W.size(); i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strU0);
            sb2.append("\n");
            sb2.append(((k) this.f44723W.get(i10)).u0(str + "  "));
            strU0 = sb2.toString();
        }
        return strU0;
    }

    @Override // t3.k
    public void w(ViewGroup viewGroup, y yVar, y yVar2, ArrayList arrayList, ArrayList arrayList2) {
        long jI = I();
        int size = this.f44723W.size();
        for (int i10 = 0; i10 < size; i10++) {
            k kVar = (k) this.f44723W.get(i10);
            if (jI > 0 && (this.f44724X || i10 == 0)) {
                long jI2 = kVar.I();
                if (jI2 > 0) {
                    kVar.s0(jI2 + jI);
                } else {
                    kVar.s0(jI);
                }
            }
            kVar.w(viewGroup, yVar, yVar2, arrayList, arrayList2);
        }
    }

    @Override // t3.k
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public v g(k.h hVar) {
        return (v) super.g(hVar);
    }

    @Override // t3.k
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public v i(View view) {
        for (int i10 = 0; i10 < this.f44723W.size(); i10++) {
            ((k) this.f44723W.get(i10)).i(view);
        }
        return (v) super.i(view);
    }

    public v y0(k kVar) {
        z0(kVar);
        long j10 = this.f44664c;
        if (j10 >= 0) {
            kVar.n0(j10);
        }
        if ((this.f44727k0 & 1) != 0) {
            kVar.p0(B());
        }
        if ((this.f44727k0 & 2) != 0) {
            kVar.r0(F());
        }
        if ((this.f44727k0 & 4) != 0) {
            kVar.q0(E());
        }
        if ((this.f44727k0 & 8) != 0) {
            kVar.o0(A());
        }
        return this;
    }

    public final void z0(k kVar) {
        this.f44723W.add(kVar);
        kVar.f44679r = this;
    }
}
