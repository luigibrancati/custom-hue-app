package com.braze.storage;

import Rd.M;
import com.braze.support.BrazeLogger;
import fc.AbstractC4036s;
import fc.C4015H;
import lc.InterfaceC4988e;
import mc.C5046c;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class v1 extends nc.m implements vc.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f28592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC6082a f28593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w1 f28594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f28595d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(InterfaceC6082a interfaceC6082a, w1 w1Var, String str, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f28593b = interfaceC6082a;
        this.f28594c = w1Var;
        this.f28595d = str;
    }

    public static final String a(String str) {
        return "Failed to " + str;
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        v1 v1Var = new v1(this.f28593b, this.f28594c, this.f28595d, interfaceC4988e);
        v1Var.f28592a = obj;
        return v1Var;
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        return ((v1) create((M) obj, (InterfaceC4988e) obj2)).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C5046c.f();
        AbstractC4036s.b(obj);
        M m10 = (M) this.f28592a;
        try {
            this.f28593b.invoke();
        } catch (Exception e10) {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.f28625E;
            final String str = this.f28595d;
            BrazeLogger.brazelog$default(brazeLogger, (Object) m10, priority, (Throwable) e10, false, new InterfaceC6082a() { // from class: r5.p3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.v1.a(str);
                }
            }, 4, (Object) null);
            this.f28594c.a(e10);
        }
        return C4015H.f34254a;
    }
}
