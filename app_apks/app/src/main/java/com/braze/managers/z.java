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
public final class z extends nc.m implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f28029a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(g0 g0Var, InterfaceC4988e interfaceC4988e) {
        super(1, interfaceC4988e);
        this.f28029a = g0Var;
    }

    public static final String a() {
        return "Ending subscription after delay";
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(InterfaceC4988e interfaceC4988e) {
        return new z(this.f28029a, interfaceC4988e);
    }

    @Override // vc.l
    public final Object invoke(Object obj) {
        return new z(this.f28029a, (InterfaceC4988e) obj).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C5046c.f();
        AbstractC4036s.b(obj);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.f28029a, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.a4
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.z.a();
            }
        }, 7, (Object) null);
        this.f28029a.a();
        return C4015H.f34254a;
    }
}
