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
public final class q extends nc.m implements vc.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f28210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f28211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Braze f28212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f28213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vc.p f28214f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC6082a f28215g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(boolean z10, Braze braze, Object obj, vc.p pVar, InterfaceC6082a interfaceC6082a, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f28211c = z10;
        this.f28212d = braze;
        this.f28213e = obj;
        this.f28214f = pVar;
        this.f28215g = interfaceC6082a;
    }

    public static final String a(InterfaceC6082a interfaceC6082a) {
        return "Early returning because the Braze instance isn't fully initialized. Always use Braze.getInstance(context) to get the latest Braze instance. Please report to Braze if the issue continues. > " + interfaceC6082a.invoke();
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        q qVar = new q(this.f28211c, this.f28212d, this.f28213e, this.f28214f, this.f28215g, interfaceC4988e);
        qVar.f28210b = obj;
        return qVar;
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((M) obj, (InterfaceC4988e) obj2)).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = C5046c.f();
        int i10 = this.f28209a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            return obj;
        }
        AbstractC4036s.b(obj);
        M m10 = (M) this.f28210b;
        if (!this.f28211c || this.f28212d.udm != null) {
            vc.p pVar = this.f28214f;
            this.f28209a = 1;
            Object objInvoke = pVar.invoke(m10, this);
            return objInvoke == objF ? objF : objInvoke;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.f28628W;
        final InterfaceC6082a interfaceC6082a = this.f28215g;
        BrazeLogger.brazelog$default(brazeLogger, (Object) m10, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.s4
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.q.a(interfaceC6082a);
            }
        }, 6, (Object) null);
        return this.f28213e;
    }
}
