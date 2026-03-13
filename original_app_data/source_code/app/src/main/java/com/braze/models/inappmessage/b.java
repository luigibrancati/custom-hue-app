package com.braze.models.inappmessage;

import Od.F;
import Rd.M;
import com.braze.managers.m0;
import com.braze.managers.r;
import com.braze.support.BrazeLogger;
import fc.AbstractC4036s;
import fc.C4015H;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.m;
import vc.InterfaceC6082a;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b extends m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f28058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f28059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f28060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m0 f28061d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, String str2, m0 m0Var, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f28059b = str;
        this.f28060c = str2;
        this.f28061d = m0Var;
    }

    public static final String a() {
        return "Logging click on in-app message";
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        b bVar = new b(this.f28059b, this.f28060c, this.f28061d, interfaceC4988e);
        bVar.f28058a = obj;
        return bVar;
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((M) obj, (InterfaceC4988e) obj2)).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C5046c.f();
        AbstractC4036s.b(obj);
        M m10 = (M) this.f28058a;
        String str = this.f28059b;
        if (str == null || F.k0(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) m10, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: g5.B
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.models.inappmessage.b.a();
                }
            }, 6, (Object) null);
            com.braze.models.k kVarK = com.braze.models.outgoing.event.b.f28071g.k(this.f28060c);
            if (kVarK != null) {
                ((r) this.f28061d).a(kVarK);
            }
        } else {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.f28627V;
            final String str2 = this.f28059b;
            BrazeLogger.brazelog$default(brazeLogger, (Object) m10, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: g5.A
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.models.inappmessage.b.a(str2);
                }
            }, 6, (Object) null);
            com.braze.models.k kVarI = com.braze.models.outgoing.event.b.f28071g.i(this.f28060c, this.f28059b);
            if (kVarI != null) {
                ((r) this.f28061d).a(kVarI);
            }
        }
        return C4015H.f34254a;
    }

    public static final String a(String str) {
        return "Logging click on in-app message with button id: " + str;
    }
}
