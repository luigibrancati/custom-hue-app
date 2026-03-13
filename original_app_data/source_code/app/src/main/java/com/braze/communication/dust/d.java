package com.braze.communication.dust;

import Rd.M;
import Td.v;
import fc.C4015H;
import java.io.BufferedReader;
import lc.InterfaceC4988e;
import nc.m;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d extends m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BufferedReader f27539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f27540d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(BufferedReader bufferedReader, v vVar, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f27539c = bufferedReader;
        this.f27540d = vVar;
    }

    public static final String a() {
        return "Caught unexpected exception in dust stream producer";
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        d dVar = new d(this.f27539c, this.f27540d, interfaceC4988e);
        dVar.f27538b = obj;
        return dVar;
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((M) obj, (InterfaceC4988e) obj2)).invokeSuspend(C4015H.f34254a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    @Override // nc.AbstractC5157a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            java.lang.Object r0 = mc.C5046c.f()
            int r1 = r12.f27537a
            r2 = 1
            if (r1 == 0) goto L1f
            if (r1 != r2) goto L17
            java.lang.Object r12 = r12.f27538b
            Rd.M r12 = (Rd.M) r12
            fc.AbstractC4036s.b(r13)     // Catch: java.lang.Exception -> L13
            goto L6e
        L13:
            r0 = move-exception
            r13 = r0
            r3 = r13
            goto L43
        L17:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L1f:
            fc.AbstractC4036s.b(r13)
            java.lang.Object r13 = r12.f27538b
            Rd.M r13 = (Rd.M) r13
            java.io.BufferedReader r1 = r12.f27539c     // Catch: java.lang.Exception -> L31
            java.lang.String r1 = r1.readLine()     // Catch: java.lang.Exception -> L31
            if (r1 != 0) goto L34
            fc.H r12 = fc.C4015H.f34254a     // Catch: java.lang.Exception -> L31
            return r12
        L31:
            r0 = move-exception
            r12 = r0
            goto L41
        L34:
            Td.v r3 = r12.f27540d     // Catch: java.lang.Exception -> L31
            r12.f27538b = r13     // Catch: java.lang.Exception -> L31
            r12.f27537a = r2     // Catch: java.lang.Exception -> L31
            java.lang.Object r12 = r3.p(r1, r12)     // Catch: java.lang.Exception -> L31
            if (r12 != r0) goto L6e
            return r0
        L41:
            r3 = r12
            r12 = r13
        L43:
            boolean r12 = Rd.N.f(r12)
            if (r12 == 0) goto L5c
            com.braze.support.BrazeLogger r0 = com.braze.support.BrazeLogger.INSTANCE
            java.lang.String r1 = com.braze.communication.dust.i.f27556d
            com.braze.support.BrazeLogger$Priority r2 = com.braze.support.BrazeLogger.Priority.f28624D
            U4.a r5 = new U4.a
            r5.<init>()
            r6 = 8
            r7 = 0
            r4 = 0
            com.braze.support.BrazeLogger.brazelog$default(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L6e
        L5c:
            com.braze.support.BrazeLogger r4 = com.braze.support.BrazeLogger.INSTANCE
            java.lang.String r5 = com.braze.communication.dust.i.f27556d
            U4.b r9 = new U4.b
            r9.<init>()
            r10 = 14
            r11 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            com.braze.support.BrazeLogger.brazelog$default(r4, r5, r6, r7, r8, r9, r10, r11)
        L6e:
            fc.H r12 = fc.C4015H.f34254a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.communication.dust.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public static final String a(Exception exc) {
        return "Stream producer job cancelled " + exc;
    }
}
