package com.braze.triggers.managers;

import com.braze.support.BrazeLogger;
import fc.AbstractC4036s;
import fc.C4015H;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.m;
import vc.InterfaceC6082a;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d extends m implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f28727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.braze.triggers.actions.a f28728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.braze.triggers.events.b f28729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f28730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f28731e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, com.braze.triggers.actions.a aVar, com.braze.triggers.events.b bVar, long j10, long j11, InterfaceC4988e interfaceC4988e) {
        super(1, interfaceC4988e);
        this.f28727a = fVar;
        this.f28728b = aVar;
        this.f28729c = bVar;
        this.f28730d = j10;
        this.f28731e = j11;
    }

    public static final String a(long j10) {
        return "Performing triggered action after a delay of " + j10 + " ms.";
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(InterfaceC4988e interfaceC4988e) {
        return new d(this.f28727a, this.f28728b, this.f28729c, this.f28730d, this.f28731e, interfaceC4988e);
    }

    @Override // vc.l
    public final Object invoke(Object obj) {
        return ((d) create((InterfaceC4988e) obj)).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C5046c.f();
        AbstractC4036s.b(obj);
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        f fVar = this.f28727a;
        final long j10 = this.f28731e;
        BrazeLogger.brazelog$default(brazeLogger, (Object) fVar, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.F
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.triggers.managers.d.a(j10);
            }
        }, 7, (Object) null);
        com.braze.triggers.actions.a aVar = this.f28728b;
        f fVar2 = this.f28727a;
        aVar.a(fVar2.f28738a, fVar2.f28740c, this.f28729c, this.f28730d);
        return C4015H.f34254a;
    }
}
