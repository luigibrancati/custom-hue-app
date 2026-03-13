package com.braze.managers;

import Rd.X;
import com.braze.Braze;
import com.braze.support.BrazeLogger;
import fc.AbstractC4036s;
import fc.C4015H;
import lc.InterfaceC4988e;
import mc.C5046c;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class v extends nc.m implements vc.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f27998b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f27998b = wVar;
    }

    public static final String a() {
        return "Requesting data flush on internal session close flush timer.";
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        return new v(this.f27998b, interfaceC4988e);
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        return new v(this.f27998b, (InterfaceC4988e) obj2).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = C5046c.f();
        int i10 = this.f27997a;
        if (i10 == 0) {
            AbstractC4036s.b(obj);
            long j10 = w.f28003o;
            this.f27997a = 1;
            if (X.a(j10, this) == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, w.f28002n, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.q3
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.v.a();
            }
        }, 14, (Object) null);
        Braze.INSTANCE.getInstance(this.f27998b.f28005a).requestImmediateDataFlush();
        return C4015H.f34254a;
    }
}
