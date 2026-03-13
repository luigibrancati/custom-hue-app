package com.braze.storage;

import lc.InterfaceC4988e;
import nc.AbstractC5160d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends AbstractC5160d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f28405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f28407c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var, InterfaceC4988e interfaceC4988e) {
        super(interfaceC4988e);
        this.f28407c = d0Var;
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) {
        this.f28405a = obj;
        this.f28406b |= Integer.MIN_VALUE;
        return this.f28407c.emit(null, this);
    }
}
