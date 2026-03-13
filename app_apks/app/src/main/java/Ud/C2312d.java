package Ud;

import fc.C4015H;
import kotlin.jvm.internal.L;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.AbstractC5160d;

/* JADX INFO: renamed from: Ud.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2312d implements InterfaceC2313e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2313e f17016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vc.l f17017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vc.p f17018c;

    /* JADX INFO: renamed from: Ud.d$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements InterfaceC2314f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ L f17020b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2314f f17021c;

        /* JADX INFO: renamed from: Ud.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0214a extends AbstractC5160d {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public /* synthetic */ Object f17022j;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public int f17024l;

            public C0214a(InterfaceC4988e interfaceC4988e) {
                super(interfaceC4988e);
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) {
                this.f17022j = obj;
                this.f17024l |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(L l10, InterfaceC2314f interfaceC2314f) {
            this.f17020b = l10;
            this.f17021c = interfaceC2314f;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // Ud.InterfaceC2314f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r6, lc.InterfaceC4988e r7) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r7 instanceof Ud.C2312d.a.C0214a
                if (r0 == 0) goto L13
                r0 = r7
                Ud.d$a$a r0 = (Ud.C2312d.a.C0214a) r0
                int r1 = r0.f17024l
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f17024l = r1
                goto L18
            L13:
                Ud.d$a$a r0 = new Ud.d$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f17022j
                java.lang.Object r1 = mc.C5046c.f()
                int r2 = r0.f17024l
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                fc.AbstractC4036s.b(r7)
                goto L67
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                fc.AbstractC4036s.b(r7)
                Ud.d r7 = Ud.C2312d.this
                vc.l r7 = r7.f17017b
                java.lang.Object r7 = r7.invoke(r6)
                kotlin.jvm.internal.L r2 = r5.f17020b
                java.lang.Object r2 = r2.f39776a
                Wd.E r4 = Vd.t.f17583a
                if (r2 == r4) goto L58
                Ud.d r4 = Ud.C2312d.this
                vc.p r4 = r4.f17018c
                java.lang.Object r2 = r4.invoke(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L55
                goto L58
            L55:
                fc.H r5 = fc.C4015H.f34254a
                return r5
            L58:
                kotlin.jvm.internal.L r2 = r5.f17020b
                r2.f39776a = r7
                Ud.f r5 = r5.f17021c
                r0.f17024l = r3
                java.lang.Object r5 = r5.emit(r6, r0)
                if (r5 != r1) goto L67
                return r1
            L67:
                fc.H r5 = fc.C4015H.f34254a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: Ud.C2312d.a.emit(java.lang.Object, lc.e):java.lang.Object");
        }
    }

    public C2312d(InterfaceC2313e interfaceC2313e, vc.l lVar, vc.p pVar) {
        this.f17016a = interfaceC2313e;
        this.f17017b = lVar;
        this.f17018c = pVar;
    }

    @Override // Ud.InterfaceC2313e
    public Object collect(InterfaceC2314f interfaceC2314f, InterfaceC4988e interfaceC4988e) {
        L l10 = new L();
        l10.f39776a = Vd.t.f17583a;
        Object objCollect = this.f17016a.collect(new a(l10, interfaceC2314f), interfaceC4988e);
        return objCollect == C5046c.f() ? objCollect : C4015H.f34254a;
    }
}
