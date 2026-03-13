package com.braze;

import Rd.M;
import com.braze.storage.n3;
import fc.AbstractC4036s;
import fc.C4015H;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends nc.m implements vc.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeUser f27507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f27508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f27509c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(BrazeUser brazeUser, String str, Object obj, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f27507a = brazeUser;
        this.f27508b = str;
        this.f27509c = obj;
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        return new a0(this.f27507a, this.f27508b, this.f27509c, interfaceC4988e);
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        return ((a0) create((M) obj, (InterfaceC4988e) obj2)).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C5046c.f();
        AbstractC4036s.b(obj);
        n3 n3Var = this.f27507a.userCache;
        String key = this.f27508b;
        Object value = this.f27509c;
        synchronized (n3Var) {
            AbstractC4862t.e(key, "key");
            AbstractC4862t.e(value, "value");
            n3Var.a(key, value);
        }
        return C4015H.f34254a;
    }
}
