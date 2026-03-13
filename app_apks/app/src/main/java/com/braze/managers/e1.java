package com.braze.managers;

import fc.AbstractC4036s;
import fc.C4015H;
import lc.InterfaceC4988e;
import mc.C5046c;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends nc.m implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h1 f27860b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(h1 h1Var, InterfaceC4988e interfaceC4988e) {
        super(1, interfaceC4988e);
        this.f27860b = h1Var;
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(InterfaceC4988e interfaceC4988e) {
        return new e1(this.f27860b, interfaceC4988e);
    }

    @Override // vc.l
    public final Object invoke(Object obj) {
        return new e1(this.f27860b, (InterfaceC4988e) obj).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = C5046c.f();
        int i10 = this.f27859a;
        if (i10 == 0) {
            AbstractC4036s.b(obj);
            h1 h1Var = this.f27860b;
            this.f27859a = 1;
            if (h1Var.a() == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
        }
        return C4015H.f34254a;
    }
}
