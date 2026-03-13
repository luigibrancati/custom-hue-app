package com.braze.dispatch;

import Rd.M;
import fc.C4015H;
import lc.InterfaceC4988e;
import nc.m;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e extends m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f27594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f27596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f27597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f27598e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, long j10, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f27597d = fVar;
        this.f27598e = j10;
    }

    public static final String a() {
        return "Requesting data flush from automatic sync policy";
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        e eVar = new e(this.f27597d, this.f27598e, interfaceC4988e);
        eVar.f27596c = obj;
        return eVar;
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((M) obj, (InterfaceC4988e) obj2)).invokeSuspend(C4015H.f34254a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if (Rd.X.a(r3, r13) == r0) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0063 -> B:20:0x0066). Please report as a decompilation issue!!! */
    @Override // nc.AbstractC5157a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            java.lang.Object r0 = mc.C5046c.f()
            int r1 = r13.f27595b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2a
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            long r3 = r13.f27594a
            java.lang.Object r1 = r13.f27596c
            Rd.M r1 = (Rd.M) r1
            fc.AbstractC4036s.b(r14)
            goto L66
        L18:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L20:
            long r3 = r13.f27594a
            java.lang.Object r1 = r13.f27596c
            Rd.M r1 = (Rd.M) r1
            fc.AbstractC4036s.b(r14)
            goto L46
        L2a:
            fc.AbstractC4036s.b(r14)
            java.lang.Object r14 = r13.f27596c
            r1 = r14
            Rd.M r1 = (Rd.M) r1
            com.braze.dispatch.f r14 = r13.f27597d
            long r4 = r14.f27605g
            long r6 = r13.f27598e
            r13.f27596c = r1
            r13.f27594a = r4
            r13.f27595b = r3
            java.lang.Object r14 = Rd.X.a(r6, r13)
            if (r14 != r0) goto L45
            goto L65
        L45:
            r3 = r4
        L46:
            com.braze.Braze$Companion r14 = com.braze.Braze.INSTANCE
            com.braze.dispatch.f r5 = r13.f27597d
            android.content.Context r5 = r5.f27600a
            com.braze.Braze r14 = r14.getInstance(r5)
            r14.requestImmediateDataFlush()
        L53:
            boolean r14 = Rd.N.f(r1)
            if (r14 == 0) goto L87
            r13.f27596c = r1
            r13.f27594a = r3
            r13.f27595b = r2
            java.lang.Object r14 = Rd.X.a(r3, r13)
            if (r14 != r0) goto L66
        L65:
            return r0
        L66:
            com.braze.support.BrazeLogger r5 = com.braze.support.BrazeLogger.INSTANCE
            java.lang.String r6 = com.braze.dispatch.f.f27599m
            com.braze.support.BrazeLogger$Priority r7 = com.braze.support.BrazeLogger.Priority.f28627V
            X4.a r10 = new X4.a
            r10.<init>()
            r11 = 12
            r12 = 0
            r8 = 0
            r9 = 0
            com.braze.support.BrazeLogger.brazelog$default(r5, r6, r7, r8, r9, r10, r11, r12)
            com.braze.Braze$Companion r14 = com.braze.Braze.INSTANCE
            com.braze.dispatch.f r5 = r13.f27597d
            android.content.Context r5 = r5.f27600a
            com.braze.Braze r14 = r14.getInstance(r5)
            r14.requestImmediateDataFlush()
            goto L53
        L87:
            fc.H r13 = fc.C4015H.f34254a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.dispatch.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
