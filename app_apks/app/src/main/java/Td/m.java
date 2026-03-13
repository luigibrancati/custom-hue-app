package Td;

import Wd.B;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class m extends B {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f16413e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f16414f;

    public m(long j10, m mVar, e eVar, int i10) {
        super(j10, mVar, i10);
        this.f16413e = eVar;
        this.f16414f = new AtomicReferenceArray(f.f16386b * 2);
    }

    public final Object A(int i10) {
        return z().get(i10 * 2);
    }

    public final Object B(int i10) {
        return z().get((i10 * 2) + 1);
    }

    public final void C(int i10, boolean z10) {
        if (z10) {
            y().n1((this.f17897c * ((long) f.f16386b)) + ((long) i10));
        }
        t();
    }

    public final Object D(int i10) {
        Object objA = A(i10);
        w(i10);
        return objA;
    }

    public final void E(int i10, Object obj) {
        z().set(i10 * 2, obj);
    }

    public final void F(int i10, Object obj) {
        z().set((i10 * 2) + 1, obj);
    }

    public final void G(int i10, Object obj) {
        E(i10, obj);
    }

    @Override // Wd.B
    public int r() {
        return f.f16386b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
    
        w(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0065, code lost:
    
        if (r0 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0067, code lost:
    
        r3 = y().f16370b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006d, code lost:
    
        if (r3 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006f, code lost:
    
        Wd.x.a(r3, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0072, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return;
     */
    @Override // Wd.B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void s(int r4, java.lang.Throwable r5, lc.InterfaceC4992i r6) {
        /*
            r3 = this;
            int r5 = Td.f.f16386b
            if (r4 < r5) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r4 = r4 - r5
        La:
            java.lang.Object r5 = r3.A(r4)
        Le:
            java.lang.Object r1 = r3.B(r4)
            boolean r2 = r1 instanceof Rd.e1
            if (r2 != 0) goto L73
            boolean r2 = r1 instanceof Td.z
            if (r2 == 0) goto L1b
            goto L73
        L1b:
            Wd.E r2 = Td.f.j()
            if (r1 == r2) goto L62
            Wd.E r2 = Td.f.i()
            if (r1 != r2) goto L28
            goto L62
        L28:
            Wd.E r2 = Td.f.p()
            if (r1 == r2) goto Le
            Wd.E r2 = Td.f.q()
            if (r1 != r2) goto L35
            goto Le
        L35:
            Wd.E r3 = Td.f.f()
            if (r1 == r3) goto L99
            Wd.E r3 = Td.f.f16388d
            if (r1 != r3) goto L40
            goto L99
        L40:
            Wd.E r3 = Td.f.z()
            if (r1 != r3) goto L47
            goto L99
        L47:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "unexpected state: "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L62:
            r3.w(r4)
            if (r0 == 0) goto L99
            Td.e r3 = r3.y()
            vc.l r3 = r3.f16370b
            if (r3 == 0) goto L99
            Wd.x.a(r3, r5, r6)
            return
        L73:
            if (r0 == 0) goto L7a
            Wd.E r2 = Td.f.j()
            goto L7e
        L7a:
            Wd.E r2 = Td.f.i()
        L7e:
            boolean r1 = r3.v(r4, r1, r2)
            if (r1 == 0) goto Le
            r3.w(r4)
            r1 = r0 ^ 1
            r3.C(r4, r1)
            if (r0 == 0) goto L99
            Td.e r3 = r3.y()
            vc.l r3 = r3.f16370b
            if (r3 == 0) goto L99
            Wd.x.a(r3, r5, r6)
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Td.m.s(int, java.lang.Throwable, lc.i):void");
    }

    public final boolean v(int i10, Object obj, Object obj2) {
        return l.a(z(), (i10 * 2) + 1, obj, obj2);
    }

    public final void w(int i10) {
        E(i10, null);
    }

    public final Object x(int i10, Object obj) {
        return z().getAndSet((i10 * 2) + 1, obj);
    }

    public final e y() {
        e eVar = this.f16413e;
        AbstractC4862t.b(eVar);
        return eVar;
    }

    public final /* synthetic */ AtomicReferenceArray z() {
        return this.f16414f;
    }
}
