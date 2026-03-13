package Ud;

import kotlin.jvm.internal.AbstractC4854k;
import lc.C4993j;
import lc.InterfaceC4988e;
import lc.InterfaceC4992i;
import nc.AbstractC5160d;

/* JADX INFO: renamed from: Ud.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2310b extends C2311c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vc.p f17010e;

    /* JADX INFO: renamed from: Ud.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f17011j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f17012k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f17014m;

        public a(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f17012k = obj;
            this.f17014m |= Integer.MIN_VALUE;
            return C2310b.this.e(null, this);
        }
    }

    public /* synthetic */ C2310b(vc.p pVar, InterfaceC4992i interfaceC4992i, int i10, Td.a aVar, int i11, AbstractC4854k abstractC4854k) {
        this(pVar, (i11 & 2) != 0 ? C4993j.f40088a : interfaceC4992i, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? Td.a.SUSPEND : aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Ud.C2311c, Vd.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(Td.v r5, lc.InterfaceC4988e r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof Ud.C2310b.a
            if (r0 == 0) goto L13
            r0 = r6
            Ud.b$a r0 = (Ud.C2310b.a) r0
            int r1 = r0.f17014m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17014m = r1
            goto L18
        L13:
            Ud.b$a r0 = new Ud.b$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f17012k
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f17014m
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.f17011j
            r5 = r4
            Td.v r5 = (Td.v) r5
            fc.AbstractC4036s.b(r6)
            goto L44
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            fc.AbstractC4036s.b(r6)
            r0.f17011j = r5
            r0.f17014m = r3
            java.lang.Object r4 = super.e(r5, r0)
            if (r4 != r1) goto L44
            return r1
        L44:
            boolean r4 = r5.z()
            if (r4 == 0) goto L4d
            fc.H r4 = fc.C4015H.f34254a
            return r4
        L4d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Ud.C2310b.e(Td.v, lc.e):java.lang.Object");
    }

    @Override // Ud.C2311c, Vd.e
    public Vd.e f(InterfaceC4992i interfaceC4992i, int i10, Td.a aVar) {
        return new C2310b(this.f17010e, interfaceC4992i, i10, aVar);
    }

    public C2310b(vc.p pVar, InterfaceC4992i interfaceC4992i, int i10, Td.a aVar) {
        super(pVar, interfaceC4992i, i10, aVar);
        this.f17010e = pVar;
    }
}
