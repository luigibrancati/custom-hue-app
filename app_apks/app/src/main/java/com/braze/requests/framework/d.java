package com.braze.requests.framework;

import Rd.M;
import fc.C4015H;
import lc.InterfaceC4988e;
import nc.m;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d extends m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f28259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f28260c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f28260c = gVar;
    }

    public static final String a() {
        return "A maximum of 5 invalid api key errors reached. Device data will remain unaffected, but future requests will not be made.";
    }

    public static final String b() {
        return "Caught exception during request sweep";
    }

    public static final String c() {
        return "Request sweeper job has finished.";
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        d dVar = new d(this.f28260c, interfaceC4988e);
        dVar.f28259b = obj;
        return dVar;
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        d dVar = new d(this.f28260c, (InterfaceC4988e) obj2);
        dVar.f28259b = (M) obj;
        return dVar.invokeSuspend(C4015H.f34254a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00b4 -> B:12:0x0031). Please report as a decompilation issue!!! */
    @Override // nc.AbstractC5157a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.requests.framework.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
