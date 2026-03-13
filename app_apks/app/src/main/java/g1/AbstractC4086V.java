package g1;

import Rd.AbstractC2161x;
import Rd.InterfaceC2157v;
import ae.AbstractC2693g;
import ae.InterfaceC2687a;
import fc.C4015H;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.AbstractC5160d;

/* JADX INFO: renamed from: g1.V, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4086V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2687a f34874a = AbstractC2693g.b(false, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2157v f34875b = AbstractC2161x.b(null, 1, null);

    /* JADX INFO: renamed from: g1.V$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f34876j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f34877k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f34879m;

        public a(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f34877k = obj;
            this.f34879m |= Integer.MIN_VALUE;
            return AbstractC4086V.this.c(this);
        }
    }

    public final Object a(InterfaceC4988e interfaceC4988e) {
        Object objI = this.f34875b.i(interfaceC4988e);
        return objI == C5046c.f() ? objI : C4015H.f34254a;
    }

    public abstract Object b(InterfaceC4988e interfaceC4988e);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(lc.InterfaceC4988e r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof g1.AbstractC4086V.a
            if (r0 == 0) goto L13
            r0 = r7
            g1.V$a r0 = (g1.AbstractC4086V.a) r0
            int r1 = r0.f34879m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34879m = r1
            goto L18
        L13:
            g1.V$a r0 = new g1.V$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f34877k
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f34879m
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r0 = r0.f34876j
            ae.a r0 = (ae.InterfaceC2687a) r0
            fc.AbstractC4036s.b(r7)     // Catch: java.lang.Throwable -> L31
            goto L7c
        L31:
            r6 = move-exception
            goto L87
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            java.lang.Object r2 = r0.f34876j
            ae.a r2 = (ae.InterfaceC2687a) r2
            fc.AbstractC4036s.b(r7)
            r7 = r2
            goto L5f
        L44:
            fc.AbstractC4036s.b(r7)
            Rd.v r7 = r6.f34875b
            boolean r7 = r7.F()
            if (r7 == 0) goto L52
            fc.H r6 = fc.C4015H.f34254a
            return r6
        L52:
            ae.a r7 = r6.f34874a
            r0.f34876j = r7
            r0.f34879m = r4
            java.lang.Object r2 = r7.a(r5, r0)
            if (r2 != r1) goto L5f
            goto L7a
        L5f:
            Rd.v r2 = r6.f34875b     // Catch: java.lang.Throwable -> L6d
            boolean r2 = r2.F()     // Catch: java.lang.Throwable -> L6d
            if (r2 == 0) goto L70
            fc.H r6 = fc.C4015H.f34254a     // Catch: java.lang.Throwable -> L6d
            r7.h(r5)
            return r6
        L6d:
            r6 = move-exception
            r0 = r7
            goto L87
        L70:
            r0.f34876j = r7     // Catch: java.lang.Throwable -> L6d
            r0.f34879m = r3     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r0 = r6.b(r0)     // Catch: java.lang.Throwable -> L6d
            if (r0 != r1) goto L7b
        L7a:
            return r1
        L7b:
            r0 = r7
        L7c:
            Rd.v r6 = r6.f34875b     // Catch: java.lang.Throwable -> L31
            fc.H r7 = fc.C4015H.f34254a     // Catch: java.lang.Throwable -> L31
            r6.C(r7)     // Catch: java.lang.Throwable -> L31
            r0.h(r5)
            return r7
        L87:
            r0.h(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.AbstractC4086V.c(lc.e):java.lang.Object");
    }
}
