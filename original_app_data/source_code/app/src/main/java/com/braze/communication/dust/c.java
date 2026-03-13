package com.braze.communication.dust;

import nc.AbstractC5160d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractC5160d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f27533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f27535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27536d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i iVar, AbstractC5160d abstractC5160d) {
        super(abstractC5160d);
        this.f27535c = iVar;
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) {
        this.f27534b = obj;
        this.f27536d |= Integer.MIN_VALUE;
        return this.f27535c.a(this);
    }
}
