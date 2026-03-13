package com.braze.communication.dust;

import Rd.M;
import Td.x;
import kotlin.jvm.internal.L;
import nc.AbstractC5160d;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC5160d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f27524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public M f27525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public x f27526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l f27527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public L f27528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public L f27529f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f27530g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i f27531h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f27532i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i iVar, AbstractC5160d abstractC5160d) {
        super(abstractC5160d);
        this.f27531h = iVar;
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) {
        this.f27530g = obj;
        this.f27532i |= Integer.MIN_VALUE;
        return this.f27531h.a(null, null, null, this);
    }
}
