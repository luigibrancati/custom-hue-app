package Ud;

import fc.C4015H;
import gc.C4204q;
import lc.InterfaceC4988e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f17102a = Wd.F.b("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, Integer.MAX_VALUE);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends nc.m implements vc.q {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f17103j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f17104k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f17105l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ vc.p f17106m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(vc.p pVar, InterfaceC4988e interfaceC4988e) {
            super(3, interfaceC4988e);
            this.f17106m = pVar;
        }

        @Override // vc.q
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2314f interfaceC2314f, Object obj, InterfaceC4988e interfaceC4988e) {
            a aVar = new a(this.f17106m, interfaceC4988e);
            aVar.f17104k = interfaceC2314f;
            aVar.f17105l = obj;
            return aVar.invokeSuspend(C4015H.f34254a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        
            if (r1.emit(r6, r5) == r0) goto L15;
         */
        @Override // nc.AbstractC5157a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = mc.C5046c.f()
                int r1 = r5.f17103j
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                fc.AbstractC4036s.b(r6)
                goto L45
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L1a:
                java.lang.Object r1 = r5.f17104k
                Ud.f r1 = (Ud.InterfaceC2314f) r1
                fc.AbstractC4036s.b(r6)
                goto L39
            L22:
                fc.AbstractC4036s.b(r6)
                java.lang.Object r6 = r5.f17104k
                r1 = r6
                Ud.f r1 = (Ud.InterfaceC2314f) r1
                java.lang.Object r6 = r5.f17105l
                vc.p r4 = r5.f17106m
                r5.f17104k = r1
                r5.f17103j = r3
                java.lang.Object r6 = r4.invoke(r6, r5)
                if (r6 != r0) goto L39
                goto L44
            L39:
                r3 = 0
                r5.f17104k = r3
                r5.f17103j = r2
                java.lang.Object r5 = r1.emit(r6, r5)
                if (r5 != r0) goto L45
            L44:
                return r0
            L45:
                fc.H r5 = fc.C4015H.f34254a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: Ud.r.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final InterfaceC2313e a(InterfaceC2313e interfaceC2313e, vc.p pVar) {
        return AbstractC2315g.D(interfaceC2313e, new a(pVar, null));
    }

    public static final InterfaceC2313e b(Iterable iterable) {
        return new Vd.j(iterable, null, 0, null, 14, null);
    }

    public static final InterfaceC2313e c(InterfaceC2313e... interfaceC2313eArr) {
        return AbstractC2315g.w(C4204q.I(interfaceC2313eArr));
    }

    public static final InterfaceC2313e d(InterfaceC2313e interfaceC2313e, vc.q qVar) {
        return new Vd.i(qVar, interfaceC2313e, null, 0, null, 28, null);
    }
}
