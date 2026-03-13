package com.braze;

import Rd.M;
import com.braze.support.BrazeLogger;
import fc.AbstractC4036s;
import fc.C4015H;
import lc.InterfaceC4988e;
import mc.C5046c;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class o extends nc.m implements vc.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f28195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f28196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f28197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f28198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Braze f28199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC6082a f28200f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC6082a f28201g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(boolean z10, boolean z11, boolean z12, Braze braze, InterfaceC6082a interfaceC6082a, InterfaceC6082a interfaceC6082a2, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f28196b = z10;
        this.f28197c = z11;
        this.f28198d = z12;
        this.f28199e = braze;
        this.f28200f = interfaceC6082a;
        this.f28201g = interfaceC6082a2;
    }

    public static final String a(InterfaceC6082a interfaceC6082a) {
        return "Early returning because the Braze instance isn't fully initialized. Always use Braze.getInstance(context) to get the latest Braze instance. Please report to Braze if the issue continues. > " + interfaceC6082a.invoke();
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        o oVar = new o(this.f28196b, this.f28197c, this.f28198d, this.f28199e, this.f28200f, this.f28201g, interfaceC4988e);
        oVar.f28195a = obj;
        return oVar;
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((M) obj, (InterfaceC4988e) obj2)).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C5046c.f();
        AbstractC4036s.b(obj);
        M m10 = (M) this.f28195a;
        if (this.f28196b && Braze.INSTANCE.isDisabled()) {
            return C4015H.f34254a;
        }
        if (this.f28197c && Braze.INSTANCE.isDelayedInitializationEnabled()) {
            return C4015H.f34254a;
        }
        if (!this.f28198d || this.f28199e.udm != null) {
            this.f28200f.invoke();
            return C4015H.f34254a;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.f28628W;
        final InterfaceC6082a interfaceC6082a = this.f28201g;
        BrazeLogger.brazelog$default(brazeLogger, (Object) m10, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.r4
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.o.a(interfaceC6082a);
            }
        }, 6, (Object) null);
        return C4015H.f34254a;
    }
}
