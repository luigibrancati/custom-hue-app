package com.braze;

import Rd.AbstractC2130h;
import Rd.M;
import fc.AbstractC4036s;
import fc.C4015H;
import lc.InterfaceC4988e;
import mc.C5046c;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class s extends nc.m implements vc.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f28374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f28376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f28377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Braze f28378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vc.p f28379f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC6082a f28380g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(boolean z10, Object obj, boolean z11, boolean z12, Braze braze, vc.p pVar, InterfaceC6082a interfaceC6082a, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f28374a = z10;
        this.f28375b = obj;
        this.f28376c = z11;
        this.f28377d = z12;
        this.f28378e = braze;
        this.f28379f = pVar;
        this.f28380g = interfaceC6082a;
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        return new s(this.f28374a, this.f28375b, this.f28376c, this.f28377d, this.f28378e, this.f28379f, this.f28380g, interfaceC4988e);
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((M) obj, (InterfaceC4988e) obj2)).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C5046c.f();
        AbstractC4036s.b(obj);
        return (this.f28374a && Braze.INSTANCE.isDisabled()) ? this.f28375b : (this.f28376c && Braze.INSTANCE.isDelayedInitializationEnabled()) ? this.f28375b : AbstractC2130h.b(null, new q(this.f28377d, this.f28378e, this.f28375b, this.f28379f, this.f28380g, null), 1, null);
    }
}
