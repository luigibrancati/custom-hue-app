package Ud;

import fc.C4015H;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.AbstractC5160d;

/* JADX INFO: renamed from: Ud.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC2317i {

    /* JADX INFO: renamed from: Ud.i$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f17025j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f17026k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f17027l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f17028m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f17029n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f17030o;

        public a(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f17029n = obj;
            this.f17030o |= Integer.MIN_VALUE;
            return AbstractC2317i.c(null, null, false, this);
        }
    }

    public static final Object b(InterfaceC2314f interfaceC2314f, Td.x xVar, InterfaceC4988e interfaceC4988e) throws Throwable {
        Object objC = c(interfaceC2314f, xVar, true, interfaceC4988e);
        return objC == C5046c.f() ? objC : C4015H.f34254a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
    
        if (r2.emit(r9, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0036, B:24:0x0062, B:28:0x0077, B:30:0x007f, B:20:0x0054, B:23:0x005e), top: B:42:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0091 -> B:14:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(Ud.InterfaceC2314f r6, Td.x r7, boolean r8, lc.InterfaceC4988e r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof Ud.AbstractC2317i.a
            if (r0 == 0) goto L13
            r0 = r9
            Ud.i$a r0 = (Ud.AbstractC2317i.a) r0
            int r1 = r0.f17030o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17030o = r1
            goto L18
        L13:
            Ud.i$a r0 = new Ud.i$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f17029n
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f17030o
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L58
            if (r2 == r4) goto L46
            if (r2 != r3) goto L3e
            boolean r8 = r0.f17028m
            java.lang.Object r6 = r0.f17027l
            Td.i r6 = (Td.i) r6
            java.lang.Object r7 = r0.f17026k
            Td.x r7 = (Td.x) r7
            java.lang.Object r2 = r0.f17025j
            Ud.f r2 = (Ud.InterfaceC2314f) r2
            fc.AbstractC4036s.b(r9)     // Catch: java.lang.Throwable -> L3c
        L39:
            r9 = r6
            r6 = r2
            goto L62
        L3c:
            r6 = move-exception
            goto L9d
        L3e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L46:
            boolean r8 = r0.f17028m
            java.lang.Object r6 = r0.f17027l
            Td.i r6 = (Td.i) r6
            java.lang.Object r7 = r0.f17026k
            Td.x r7 = (Td.x) r7
            java.lang.Object r2 = r0.f17025j
            Ud.f r2 = (Ud.InterfaceC2314f) r2
            fc.AbstractC4036s.b(r9)     // Catch: java.lang.Throwable -> L3c
            goto L77
        L58:
            fc.AbstractC4036s.b(r9)
            Ud.AbstractC2315g.p(r6)
            Td.i r9 = r7.iterator()     // Catch: java.lang.Throwable -> L3c
        L62:
            r0.f17025j = r6     // Catch: java.lang.Throwable -> L3c
            r0.f17026k = r7     // Catch: java.lang.Throwable -> L3c
            r0.f17027l = r9     // Catch: java.lang.Throwable -> L3c
            r0.f17028m = r8     // Catch: java.lang.Throwable -> L3c
            r0.f17030o = r4     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = r9.a(r0)     // Catch: java.lang.Throwable -> L3c
            if (r2 != r1) goto L73
            goto L93
        L73:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L77:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L3c
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L3c
            if (r9 == 0) goto L94
            java.lang.Object r9 = r6.next()     // Catch: java.lang.Throwable -> L3c
            r0.f17025j = r2     // Catch: java.lang.Throwable -> L3c
            r0.f17026k = r7     // Catch: java.lang.Throwable -> L3c
            r0.f17027l = r6     // Catch: java.lang.Throwable -> L3c
            r0.f17028m = r8     // Catch: java.lang.Throwable -> L3c
            r0.f17030o = r3     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r9 = r2.emit(r9, r0)     // Catch: java.lang.Throwable -> L3c
            if (r9 != r1) goto L39
        L93:
            return r1
        L94:
            if (r8 == 0) goto L9a
            r6 = 0
            Td.n.a(r7, r6)
        L9a:
            fc.H r6 = fc.C4015H.f34254a
            return r6
        L9d:
            throw r6     // Catch: java.lang.Throwable -> L9e
        L9e:
            r9 = move-exception
            if (r8 == 0) goto La4
            Td.n.a(r7, r6)
        La4:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Ud.AbstractC2317i.c(Ud.f, Td.x, boolean, lc.e):java.lang.Object");
    }
}
