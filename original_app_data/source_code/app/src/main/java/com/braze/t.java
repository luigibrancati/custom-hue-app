package com.braze;

import Rd.AbstractC2132i;
import Rd.M;
import Rd.U;
import fc.AbstractC4036s;
import fc.C4015H;
import lc.InterfaceC4988e;
import mc.C5046c;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class t extends nc.m implements vc.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f28652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f28654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f28655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Braze f28656f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vc.p f28657g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC6082a f28658h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(boolean z10, Object obj, boolean z11, boolean z12, Braze braze, vc.p pVar, InterfaceC6082a interfaceC6082a, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f28652b = z10;
        this.f28653c = obj;
        this.f28654d = z11;
        this.f28655e = z12;
        this.f28656f = braze;
        this.f28657g = pVar;
        this.f28658h = interfaceC6082a;
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        return new t(this.f28652b, this.f28653c, this.f28654d, this.f28655e, this.f28656f, this.f28657g, this.f28658h, interfaceC4988e);
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((M) obj, (InterfaceC4988e) obj2)).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = C5046c.f();
        int i10 = this.f28651a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            return obj;
        }
        AbstractC4036s.b(obj);
        U uB = AbstractC2132i.b(com.braze.coroutine.f.f27586a, null, null, new s(this.f28652b, this.f28653c, this.f28654d, this.f28655e, this.f28656f, this.f28657g, this.f28658h, null), 3, null);
        this.f28651a = 1;
        Object objI = uB.i(this);
        return objI == objF ? objF : objI;
    }
}
