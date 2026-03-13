package g1;

import lc.InterfaceC4988e;
import nc.AbstractC5160d;

/* JADX INFO: renamed from: g1.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4116z {

    /* JADX INFO: renamed from: g1.z$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f35120j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f35121k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f35122l;

        public a(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f35121k = obj;
            this.f35122l |= Integer.MIN_VALUE;
            return AbstractC4116z.b(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(java.io.File r4, vc.l r5, lc.InterfaceC4988e r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof g1.AbstractC4116z.a
            if (r0 == 0) goto L13
            r0 = r6
            g1.z$a r0 = (g1.AbstractC4116z.a) r0
            int r1 = r0.f35122l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35122l = r1
            goto L18
        L13:
            g1.z$a r0 = new g1.z$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f35121k
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f35122l
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f35120j
            java.io.File r4 = (java.io.File) r4
            fc.AbstractC4036s.b(r6)     // Catch: java.io.IOException -> L2d
            return r6
        L2d:
            r5 = move-exception
            goto L46
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            fc.AbstractC4036s.b(r6)
            r0.f35120j = r4     // Catch: java.io.IOException -> L2d
            r0.f35122l = r3     // Catch: java.io.IOException -> L2d
            java.lang.Object r4 = r5.invoke(r0)     // Catch: java.io.IOException -> L2d
            if (r4 != r1) goto L45
            return r1
        L45:
            return r4
        L46:
            boolean r6 = r5 instanceof g1.C4094d
            if (r6 == 0) goto L4b
            throw r5
        L4b:
            g1.s r6 = g1.C4109s.f35089a
            java.io.IOException r4 = r6.a(r4, r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.AbstractC4116z.b(java.io.File, vc.l, lc.e):java.lang.Object");
    }
}
