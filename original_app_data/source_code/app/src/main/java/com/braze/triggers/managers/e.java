package com.braze.triggers.managers;

import fc.AbstractC4036s;
import fc.C4015H;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.m;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e extends m implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.braze.triggers.actions.a f28732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f28733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.braze.triggers.events.b f28734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f28735d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.braze.triggers.actions.a aVar, f fVar, com.braze.triggers.events.b bVar, long j10, InterfaceC4988e interfaceC4988e) {
        super(1, interfaceC4988e);
        this.f28732a = aVar;
        this.f28733b = fVar;
        this.f28734c = bVar;
        this.f28735d = j10;
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(InterfaceC4988e interfaceC4988e) {
        return new e(this.f28732a, this.f28733b, this.f28734c, this.f28735d, interfaceC4988e);
    }

    @Override // vc.l
    public final Object invoke(Object obj) {
        return ((e) create((InterfaceC4988e) obj)).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C5046c.f();
        AbstractC4036s.b(obj);
        com.braze.triggers.actions.a aVar = this.f28732a;
        f fVar = this.f28733b;
        aVar.a(fVar.f28738a, fVar.f28740c, this.f28734c, this.f28735d);
        return C4015H.f34254a;
    }
}
