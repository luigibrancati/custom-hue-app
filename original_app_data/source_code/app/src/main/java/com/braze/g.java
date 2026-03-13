package com.braze;

import Rd.M;
import com.braze.managers.j1;
import com.braze.support.BrazeLogger;
import fc.AbstractC4036s;
import fc.C4015H;
import lc.InterfaceC4988e;
import mc.C5046c;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class g extends nc.m implements vc.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f27756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Braze f27757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f27758c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Braze braze, String str, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f27757b = braze;
        this.f27758c = str;
    }

    public static final String a(String str) {
        return "Getting Banner for " + str;
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        g gVar = new g(this.f27757b, this.f27758c, interfaceC4988e);
        gVar.f27756a = obj;
        return gVar;
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((M) obj, (InterfaceC4988e) obj2)).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C5046c.f();
        AbstractC4036s.b(obj);
        M m10 = (M) this.f27756a;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        final String str = this.f27758c;
        BrazeLogger.brazelog$default(brazeLogger, (Object) m10, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.p4
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.g.a(str);
            }
        }, 7, (Object) null);
        return ((j1) this.f27757b.getUdm$android_sdk_base_release()).f27907C.a(this.f27758c);
    }
}
