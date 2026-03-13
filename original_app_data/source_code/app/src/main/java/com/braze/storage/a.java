package com.braze.storage;

import ae.InterfaceC2694h;
import fc.AbstractC4036s;
import fc.C4015H;
import lc.InterfaceC4988e;
import mc.C5046c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a extends nc.m implements vc.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC2694h f28381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f28383c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f28383c = bVar;
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        return new a(this.f28383c, interfaceC4988e);
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        return new a(this.f28383c, (InterfaceC4988e) obj2).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC2694h interfaceC2694h;
        Object objF = C5046c.f();
        int i10 = this.f28382b;
        if (i10 == 0) {
            AbstractC4036s.b(obj);
            InterfaceC2694h interfaceC2694h2 = this.f28383c.f28394a;
            this.f28381a = interfaceC2694h2;
            this.f28382b = 1;
            if (interfaceC2694h2.d(this) == objF) {
                return objF;
            }
            interfaceC2694h = interfaceC2694h2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC2694h = this.f28381a;
            AbstractC4036s.b(obj);
        }
        try {
            return C4015H.f34254a;
        } finally {
            interfaceC2694h.release();
        }
    }
}
