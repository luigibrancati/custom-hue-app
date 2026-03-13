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
public final class p extends nc.m implements vc.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f28202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f28203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f28204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Braze f28205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC6082a f28206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC6082a f28207f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(boolean z10, boolean z11, boolean z12, Braze braze, InterfaceC6082a interfaceC6082a, InterfaceC6082a interfaceC6082a2, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f28202a = z10;
        this.f28203b = z11;
        this.f28204c = z12;
        this.f28205d = braze;
        this.f28206e = interfaceC6082a;
        this.f28207f = interfaceC6082a2;
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        return new p(this.f28202a, this.f28203b, this.f28204c, this.f28205d, this.f28206e, this.f28207f, interfaceC4988e);
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((M) obj, (InterfaceC4988e) obj2)).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C5046c.f();
        AbstractC4036s.b(obj);
        AbstractC2130h.b(null, new o(this.f28202a, this.f28203b, this.f28204c, this.f28205d, this.f28206e, this.f28207f, null), 1, null);
        return C4015H.f34254a;
    }
}
