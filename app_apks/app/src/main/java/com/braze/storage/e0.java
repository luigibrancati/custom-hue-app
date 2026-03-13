package com.braze.storage;

import Ud.InterfaceC2313e;
import Ud.InterfaceC2314f;
import fc.C4015H;
import k1.AbstractC4785h;
import lc.InterfaceC4988e;
import mc.C5046c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements InterfaceC2313e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2313e f28422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC4785h.a f28423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28424c;

    public e0(InterfaceC2313e interfaceC2313e, AbstractC4785h.a aVar, Object obj) {
        this.f28422a = interfaceC2313e;
        this.f28423b = aVar;
        this.f28424c = obj;
    }

    @Override // Ud.InterfaceC2313e
    public final Object collect(InterfaceC2314f interfaceC2314f, InterfaceC4988e interfaceC4988e) {
        Object objCollect = this.f28422a.collect(new d0(interfaceC2314f, this.f28423b, this.f28424c), interfaceC4988e);
        return objCollect == C5046c.f() ? objCollect : C4015H.f34254a;
    }
}
