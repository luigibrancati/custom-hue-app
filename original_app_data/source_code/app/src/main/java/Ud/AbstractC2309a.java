package Ud;

import lc.InterfaceC4988e;
import nc.AbstractC5160d;

/* JADX INFO: renamed from: Ud.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2309a implements InterfaceC2313e {

    /* JADX INFO: renamed from: Ud.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0213a extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f17006j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f17007k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f17009m;

        public C0213a(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f17007k = obj;
            this.f17009m |= Integer.MIN_VALUE;
            return AbstractC2309a.this.collect(null, this);
        }
    }

    public abstract Object b(InterfaceC2314f interfaceC2314f, InterfaceC4988e interfaceC4988e);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Ud.InterfaceC2313e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object collect(Ud.InterfaceC2314f r5, lc.InterfaceC4988e r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof Ud.AbstractC2309a.C0213a
            if (r0 == 0) goto L13
            r0 = r6
            Ud.a$a r0 = (Ud.AbstractC2309a.C0213a) r0
            int r1 = r0.f17009m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17009m = r1
            goto L18
        L13:
            Ud.a$a r0 = new Ud.a$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f17007k
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f17009m
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f17006j
            Vd.v r4 = (Vd.v) r4
            fc.AbstractC4036s.b(r6)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r5 = move-exception
            goto L57
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            fc.AbstractC4036s.b(r6)
            Vd.v r6 = new Vd.v
            lc.i r2 = r0.getContext()
            r6.<init>(r5, r2)
            r0.f17006j = r6     // Catch: java.lang.Throwable -> L55
            r0.f17009m = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r4 = r4.b(r6, r0)     // Catch: java.lang.Throwable -> L55
            if (r4 != r1) goto L4e
            return r1
        L4e:
            r4 = r6
        L4f:
            r4.releaseIntercepted()
            fc.H r4 = fc.C4015H.f34254a
            return r4
        L55:
            r5 = move-exception
            r4 = r6
        L57:
            r4.releaseIntercepted()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Ud.AbstractC2309a.collect(Ud.f, lc.e):java.lang.Object");
    }
}
