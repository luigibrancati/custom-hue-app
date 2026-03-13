package com.braze.storage;

import ae.InterfaceC2687a;
import fc.AbstractC4036s;
import fc.C4015H;
import java.util.Map;
import lc.InterfaceC4988e;
import mc.C5046c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class q1 extends nc.m implements vc.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC2687a f28544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s1 f28545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f28546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f28547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s1 f28548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f28549f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(s1 s1Var, String str, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f28548e = s1Var;
        this.f28549f = str;
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        return new q1(this.f28548e, this.f28549f, interfaceC4988e);
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        return new q1(this.f28548e, this.f28549f, (InterfaceC4988e) obj2).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        s1 s1Var;
        InterfaceC2687a interfaceC2687a;
        String str;
        Object objF = C5046c.f();
        int i10 = this.f28547d;
        if (i10 == 0) {
            AbstractC4036s.b(obj);
            s1Var = this.f28548e;
            InterfaceC2687a interfaceC2687a2 = s1Var.f28564b;
            String str2 = this.f28549f;
            this.f28544a = interfaceC2687a2;
            this.f28545b = s1Var;
            this.f28546c = str2;
            this.f28547d = 1;
            if (interfaceC2687a2.a(null, this) == objF) {
                return objF;
            }
            interfaceC2687a = interfaceC2687a2;
            str = str2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = this.f28546c;
            s1Var = this.f28545b;
            interfaceC2687a = this.f28544a;
            AbstractC4036s.b(obj);
        }
        try {
            Map mapA = s1Var.a();
            mapA.remove(str);
            s1.a(s1Var, mapA);
            return C4015H.f34254a;
        } finally {
            interfaceC2687a.h(null);
        }
    }
}
