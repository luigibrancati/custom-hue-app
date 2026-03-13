package com.braze.managers;

import com.braze.support.BrazeLogger;
import fc.AbstractC4036s;
import fc.C4015H;
import lc.InterfaceC4988e;
import mc.C5046c;
import vc.InterfaceC6082a;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends nc.m implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f27845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f27846b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(g0 g0Var, long j10, InterfaceC4988e interfaceC4988e) {
        super(1, interfaceC4988e);
        this.f27845a = g0Var;
        this.f27846b = j10;
    }

    public static final String a(long j10) {
        return "TTL of " + j10 + " expired, reconnecting";
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(InterfaceC4988e interfaceC4988e) {
        return new c0(this.f27845a, this.f27846b, interfaceC4988e);
    }

    @Override // vc.l
    public final Object invoke(Object obj) {
        return new c0(this.f27845a, this.f27846b, (InterfaceC4988e) obj).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C5046c.f();
        AbstractC4036s.b(obj);
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        g0 g0Var = this.f27845a;
        final long j10 = this.f27846b;
        BrazeLogger.brazelog$default(brazeLogger, (Object) g0Var, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.O
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.c0.a(j10);
            }
        }, 7, (Object) null);
        ((com.braze.communication.dust.i) this.f27845a.f27864c).b();
        this.f27845a.a(false);
        return C4015H.f34254a;
    }
}
