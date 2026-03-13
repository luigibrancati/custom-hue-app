package com.braze;

import Rd.M;
import com.braze.storage.n3;
import com.braze.support.BrazeLogger;
import fc.AbstractC4036s;
import fc.C4015H;
import lc.InterfaceC4988e;
import mc.C5046c;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends nc.m implements vc.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f27786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BrazeUser f27787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f27788c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(BrazeUser brazeUser, String str, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f27787b = brazeUser;
        this.f27788c = str;
    }

    public static final String a(String str) {
        return "Successfully set LINE ID: " + str + ".";
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        j0 j0Var = new j0(this.f27787b, this.f27788c, interfaceC4988e);
        j0Var.f27786a = obj;
        return j0Var;
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        return ((j0) create((M) obj, (InterfaceC4988e) obj2)).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C5046c.f();
        AbstractC4036s.b(obj);
        M m10 = (M) this.f27786a;
        n3 n3Var = this.f27787b.userCache;
        String str = this.f27788c;
        synchronized (n3Var) {
            n3Var.c("native_line_id", str);
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.f28628W;
        final String str2 = this.f27788c;
        BrazeLogger.brazelog$default(brazeLogger, (Object) m10, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.q4
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.j0.a(str2);
            }
        }, 6, (Object) null);
        return C4015H.f34254a;
    }
}
