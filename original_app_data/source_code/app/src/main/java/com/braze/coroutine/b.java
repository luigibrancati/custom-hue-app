package com.braze.coroutine;

import Rd.M;
import fc.C4015H;
import lc.InterfaceC4988e;
import nc.m;
import vc.l;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b extends m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Number f27583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f27584d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Number number, l lVar, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f27583c = number;
        this.f27584d = lVar;
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        b bVar = new b(this.f27583c, this.f27584d, interfaceC4988e);
        bVar.f27582b = obj;
        return bVar;
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((M) obj, (InterfaceC4988e) obj2)).invokeSuspend(C4015H.f34254a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r7.invoke(r6) == r0) goto L17;
     */
    @Override // nc.AbstractC5157a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.Object r0 = mc.C5046c.f()
            int r1 = r6.f27581a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            fc.AbstractC4036s.b(r7)
            goto L4f
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L1a:
            java.lang.Object r1 = r6.f27582b
            Rd.M r1 = (Rd.M) r1
            fc.AbstractC4036s.b(r7)
            goto L3b
        L22:
            fc.AbstractC4036s.b(r7)
            java.lang.Object r7 = r6.f27582b
            r1 = r7
            Rd.M r1 = (Rd.M) r1
            java.lang.Number r7 = r6.f27583c
            long r4 = r7.longValue()
            r6.f27582b = r1
            r6.f27581a = r3
            java.lang.Object r7 = Rd.X.a(r4, r6)
            if (r7 != r0) goto L3b
            goto L4e
        L3b:
            boolean r7 = Rd.N.f(r1)
            if (r7 == 0) goto L4f
            vc.l r7 = r6.f27584d
            r1 = 0
            r6.f27582b = r1
            r6.f27581a = r2
            java.lang.Object r6 = r7.invoke(r6)
            if (r6 != r0) goto L4f
        L4e:
            return r0
        L4f:
            fc.H r6 = fc.C4015H.f34254a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.coroutine.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
