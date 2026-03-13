package Wd;

import Rd.AbstractC2135j0;
import Rd.X0;
import Rd.Y;
import fc.C4015H;
import lc.InterfaceC4992i;

/* JADX INFO: renamed from: Wd.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2330j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final E f17929a = new E("UNDEFINED");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final E f17930b = new E("REUSABLE_CLAIMED");

    /* JADX WARN: Removed duplicated region for block: B:27:0x008e A[Catch: all -> 0x0067, DONT_GENERATE, TryCatch #0 {all -> 0x0067, blocks: (B:11:0x003e, B:13:0x004c, B:15:0x0052, B:28:0x0091, B:18:0x0069, B:20:0x0079, B:25:0x0088, B:27:0x008e, B:33:0x009e, B:36:0x00a7, B:35:0x00a4, B:23:0x007f), top: B:45:0x003e, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(lc.InterfaceC4988e r6, java.lang.Object r7) {
        /*
            boolean r0 = r6 instanceof Wd.C2329i
            if (r0 == 0) goto Lb2
            Wd.i r6 = (Wd.C2329i) r6
            java.lang.Object r0 = Rd.C.b(r7)
            Rd.I r1 = r6.f17925d
            lc.i r2 = r6.getContext()
            boolean r1 = d(r1, r2)
            r2 = 1
            if (r1 == 0) goto L26
            r6.f17927f = r0
            r6.f15160c = r2
            Rd.I r7 = r6.f17925d
            lc.i r0 = r6.getContext()
            c(r7, r0, r6)
            goto Lac
        L26:
            Rd.X0 r1 = Rd.X0.f15153a
            Rd.j0 r1 = r1.b()
            boolean r3 = r1.f1()
            if (r3 == 0) goto L3b
            r6.f17927f = r0
            r6.f15160c = r2
            r1.W0(r6)
            goto Lac
        L3b:
            r1.d1(r2)
            lc.i r3 = r6.getContext()     // Catch: java.lang.Throwable -> L67
            Rd.z0$b r4 = Rd.InterfaceC2166z0.f15218M     // Catch: java.lang.Throwable -> L67
            lc.i$b r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L67
            Rd.z0 r3 = (Rd.InterfaceC2166z0) r3     // Catch: java.lang.Throwable -> L67
            if (r3 == 0) goto L69
            boolean r4 = r3.c()     // Catch: java.lang.Throwable -> L67
            if (r4 != 0) goto L69
            java.util.concurrent.CancellationException r7 = r3.h()     // Catch: java.lang.Throwable -> L67
            r6.a(r0, r7)     // Catch: java.lang.Throwable -> L67
            fc.r$a r0 = fc.C4035r.f34274b     // Catch: java.lang.Throwable -> L67
            java.lang.Object r7 = fc.AbstractC4036s.a(r7)     // Catch: java.lang.Throwable -> L67
            java.lang.Object r7 = fc.C4035r.b(r7)     // Catch: java.lang.Throwable -> L67
            r6.resumeWith(r7)     // Catch: java.lang.Throwable -> L67
            goto L91
        L67:
            r7 = move-exception
            goto La8
        L69:
            lc.e r0 = r6.f17926e     // Catch: java.lang.Throwable -> L67
            java.lang.Object r3 = r6.f17928g     // Catch: java.lang.Throwable -> L67
            lc.i r4 = r0.getContext()     // Catch: java.lang.Throwable -> L67
            java.lang.Object r3 = Wd.L.i(r4, r3)     // Catch: java.lang.Throwable -> L67
            Wd.E r5 = Wd.L.f17903a     // Catch: java.lang.Throwable -> L67
            if (r3 == r5) goto L7e
            Rd.c1 r0 = Rd.G.m(r0, r4, r3)     // Catch: java.lang.Throwable -> L67
            goto L7f
        L7e:
            r0 = 0
        L7f:
            lc.e r5 = r6.f17926e     // Catch: java.lang.Throwable -> L9b
            r5.resumeWith(r7)     // Catch: java.lang.Throwable -> L9b
            fc.H r7 = fc.C4015H.f34254a     // Catch: java.lang.Throwable -> L9b
            if (r0 == 0) goto L8e
            boolean r7 = r0.U0()     // Catch: java.lang.Throwable -> L67
            if (r7 == 0) goto L91
        L8e:
            Wd.L.f(r4, r3)     // Catch: java.lang.Throwable -> L67
        L91:
            boolean r7 = r1.i1()     // Catch: java.lang.Throwable -> L67
            if (r7 != 0) goto L91
        L97:
            r1.J0(r2)
            goto Lac
        L9b:
            r7 = move-exception
            if (r0 == 0) goto La4
            boolean r0 = r0.U0()     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto La7
        La4:
            Wd.L.f(r4, r3)     // Catch: java.lang.Throwable -> L67
        La7:
            throw r7     // Catch: java.lang.Throwable -> L67
        La8:
            r6.h(r7)     // Catch: java.lang.Throwable -> Lad
            goto L97
        Lac:
            return
        Lad:
            r6 = move-exception
            r1.J0(r2)
            throw r6
        Lb2:
            r6.resumeWith(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Wd.AbstractC2330j.b(lc.e, java.lang.Object):void");
    }

    public static final void c(Rd.I i10, InterfaceC4992i interfaceC4992i, Runnable runnable) {
        try {
            i10.k0(interfaceC4992i, runnable);
        } catch (Throwable th) {
            throw new Y(th, i10, interfaceC4992i);
        }
    }

    public static final boolean d(Rd.I i10, InterfaceC4992i interfaceC4992i) throws Y {
        try {
            return i10.v0(interfaceC4992i);
        } catch (Throwable th) {
            throw new Y(th, i10, interfaceC4992i);
        }
    }

    public static final boolean e(C2329i c2329i) {
        C4015H c4015h = C4015H.f34254a;
        AbstractC2135j0 abstractC2135j0B = X0.f15153a.b();
        if (abstractC2135j0B.g1()) {
            return false;
        }
        if (abstractC2135j0B.f1()) {
            c2329i.f17927f = c4015h;
            c2329i.f15160c = 1;
            abstractC2135j0B.W0(c2329i);
            return true;
        }
        abstractC2135j0B.d1(true);
        try {
            c2329i.run();
            do {
            } while (abstractC2135j0B.i1());
        } finally {
            try {
            } finally {
            }
        }
        return false;
    }
}
