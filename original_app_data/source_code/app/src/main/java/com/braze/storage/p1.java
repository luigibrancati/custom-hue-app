package com.braze.storage;

import Rd.M;
import ae.InterfaceC2687a;
import fc.AbstractC4036s;
import fc.C4015H;
import java.util.Map;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.AbstractC5158b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class p1 extends nc.m implements vc.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC2687a f28534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s1 f28535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f28536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f28537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f28538e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s1 f28539f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f28540g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f28541h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(s1 s1Var, String str, long j10, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f28539f = s1Var;
        this.f28540g = str;
        this.f28541h = j10;
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        return new p1(this.f28539f, this.f28540g, this.f28541h, interfaceC4988e);
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        return ((p1) create((M) obj, (InterfaceC4988e) obj2)).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        s1 s1Var;
        InterfaceC2687a interfaceC2687a;
        String str;
        long j10;
        Object objF = C5046c.f();
        int i10 = this.f28538e;
        if (i10 == 0) {
            AbstractC4036s.b(obj);
            s1Var = this.f28539f;
            InterfaceC2687a interfaceC2687a2 = s1Var.f28564b;
            String str2 = this.f28540g;
            long j11 = this.f28541h;
            this.f28534a = interfaceC2687a2;
            this.f28535b = s1Var;
            this.f28536c = str2;
            this.f28537d = j11;
            this.f28538e = 1;
            if (interfaceC2687a2.a(null, this) == objF) {
                return objF;
            }
            interfaceC2687a = interfaceC2687a2;
            str = str2;
            j10 = j11;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = this.f28537d;
            str = this.f28536c;
            s1Var = this.f28535b;
            interfaceC2687a = this.f28534a;
            AbstractC4036s.b(obj);
        }
        try {
            Map mapA = s1Var.a();
            mapA.put(str, AbstractC5158b.d(j10));
            s1.a(s1Var, mapA);
            return C4015H.f34254a;
        } finally {
            interfaceC2687a.h(null);
        }
    }
}
