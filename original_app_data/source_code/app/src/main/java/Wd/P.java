package Wd;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class P {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f17911b = AtomicIntegerFieldUpdater.newUpdater(P.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Q[] f17912a;

    public final void a(Q q10) {
        q10.a(this);
        Q[] qArrG = g();
        int iC = c();
        k(iC + 1);
        qArrG[iC] = q10;
        q10.setIndex(iC);
        m(iC);
    }

    public final Q b() {
        Q[] qArr = this.f17912a;
        if (qArr != null) {
            return qArr[0];
        }
        return null;
    }

    public final int c() {
        return f17911b.get(this);
    }

    public final boolean e() {
        return c() == 0;
    }

    public final Q f() {
        Q qB;
        synchronized (this) {
            qB = b();
        }
        return qB;
    }

    public final Q[] g() {
        Q[] qArr = this.f17912a;
        if (qArr == null) {
            Q[] qArr2 = new Q[4];
            this.f17912a = qArr2;
            return qArr2;
        }
        if (c() < qArr.length) {
            return qArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(qArr, c() * 2);
        AbstractC4862t.d(objArrCopyOf, "copyOf(...)");
        Q[] qArr3 = (Q[]) objArrCopyOf;
        this.f17912a = qArr3;
        return qArr3;
    }

    public final boolean h(Q q10) {
        boolean z10;
        synchronized (this) {
            if (q10.getHeap() == null) {
                z10 = false;
            } else {
                i(q10.getIndex());
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final Wd.Q i(int r6) {
        /*
            r5 = this;
            Wd.Q[] r0 = r5.f17912a
            kotlin.jvm.internal.AbstractC4862t.b(r0)
            int r1 = r5.c()
            r2 = -1
            int r1 = r1 + r2
            r5.k(r1)
            int r1 = r5.c()
            if (r6 >= r1) goto L3d
            int r1 = r5.c()
            r5.n(r6, r1)
            int r1 = r6 + (-1)
            int r1 = r1 / 2
            if (r6 <= 0) goto L3a
            r3 = r0[r6]
            kotlin.jvm.internal.AbstractC4862t.b(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r0[r1]
            kotlin.jvm.internal.AbstractC4862t.b(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L3a
            r5.n(r6, r1)
            r5.m(r1)
            goto L3d
        L3a:
            r5.l(r6)
        L3d:
            int r6 = r5.c()
            r6 = r0[r6]
            kotlin.jvm.internal.AbstractC4862t.b(r6)
            r1 = 0
            r6.a(r1)
            r6.setIndex(r2)
            int r5 = r5.c()
            r0[r5] = r1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Wd.P.i(int):Wd.Q");
    }

    public final Q j() {
        Q qI;
        synchronized (this) {
            qI = c() > 0 ? i(0) : null;
        }
        return qI;
    }

    public final void k(int i10) {
        f17911b.set(this, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(int r6) {
        /*
            r5 = this;
        L0:
            int r0 = r6 * 2
            int r1 = r0 + 1
            int r2 = r5.c()
            if (r1 < r2) goto Lb
            goto L3e
        Lb:
            Wd.Q[] r2 = r5.f17912a
            kotlin.jvm.internal.AbstractC4862t.b(r2)
            int r0 = r0 + 2
            int r3 = r5.c()
            if (r0 >= r3) goto L2b
            r3 = r2[r0]
            kotlin.jvm.internal.AbstractC4862t.b(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r2[r1]
            kotlin.jvm.internal.AbstractC4862t.b(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L2b
            goto L2c
        L2b:
            r0 = r1
        L2c:
            r1 = r2[r6]
            kotlin.jvm.internal.AbstractC4862t.b(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            r2 = r2[r0]
            kotlin.jvm.internal.AbstractC4862t.b(r2)
            int r1 = r1.compareTo(r2)
            if (r1 > 0) goto L3f
        L3e:
            return
        L3f:
            r5.n(r6, r0)
            r6 = r0
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: Wd.P.l(int):void");
    }

    public final void m(int i10) {
        while (i10 > 0) {
            Q[] qArr = this.f17912a;
            AbstractC4862t.b(qArr);
            int i11 = (i10 - 1) / 2;
            Q q10 = qArr[i11];
            AbstractC4862t.b(q10);
            Q q11 = qArr[i10];
            AbstractC4862t.b(q11);
            if (((Comparable) q10).compareTo(q11) <= 0) {
                return;
            }
            n(i10, i11);
            i10 = i11;
        }
    }

    public final void n(int i10, int i11) {
        Q[] qArr = this.f17912a;
        AbstractC4862t.b(qArr);
        Q q10 = qArr[i11];
        AbstractC4862t.b(q10);
        Q q11 = qArr[i10];
        AbstractC4862t.b(q11);
        qArr[i10] = q10;
        qArr[i11] = q11;
        q10.setIndex(i10);
        q11.setIndex(i11);
    }
}
