package com.braze.managers;

import com.braze.support.BrazeLogger;
import fc.AbstractC4036s;
import fc.C4015H;
import lc.InterfaceC4988e;
import mc.C5046c;
import vc.InterfaceC6082a;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends nc.m implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f27839a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(g0 g0Var, InterfaceC4988e interfaceC4988e) {
        super(1, interfaceC4988e);
        this.f27839a = g0Var;
    }

    public static final String a() {
        return "DDR delay elapsed, reconnecting";
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(InterfaceC4988e interfaceC4988e) {
        return new b0(this.f27839a, interfaceC4988e);
    }

    @Override // vc.l
    public final Object invoke(Object obj) {
        return new b0(this.f27839a, (InterfaceC4988e) obj).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C5046c.f();
        AbstractC4036s.b(obj);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.f27839a, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.L
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.b0.a();
            }
        }, 7, (Object) null);
        this.f27839a.a(false);
        return C4015H.f34254a;
    }
}
