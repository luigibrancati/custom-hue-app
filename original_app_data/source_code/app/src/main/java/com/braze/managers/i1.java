package com.braze.managers;

import Rd.AbstractC2130h;
import Rd.M;
import com.braze.storage.n3;
import com.braze.support.BrazeLogger;
import fc.AbstractC4036s;
import fc.C4015H;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends nc.m implements vc.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f27888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j1 f27889b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(j1 j1Var, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f27889b = j1Var;
    }

    public static final String a() {
        return "User cache was locked, waiting.";
    }

    public static final String b() {
        return "User cache notified. Continuing UserDependencyManager shutdown";
    }

    public static final String c() {
        return "Device cache was locked, waiting.";
    }

    public static final String d() {
        return "Device cache notified. Continuing UserDependencyManager shutdown";
    }

    public static final String e() {
        return "Exception while shutting down dispatch manager. Continuing.";
    }

    public static final String f() {
        return "Exception while stopping data sync. Continuing.";
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        i1 i1Var = new i1(this.f27889b, interfaceC4988e);
        i1Var.f27888a = obj;
        return i1Var;
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        i1 i1Var = new i1(this.f27889b, (InterfaceC4988e) obj2);
        i1Var.f27888a = (M) obj;
        return i1Var.invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C5046c.f();
        AbstractC4036s.b(obj);
        M m10 = (M) this.f27888a;
        try {
            if (this.f27889b.d().f28394a.b() == 0) {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.brazelog$default(brazeLogger, (Object) m10, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.O0
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.managers.i1.a();
                    }
                }, 6, (Object) null);
                n3 n3VarD = this.f27889b.d();
                n3VarD.getClass();
                AbstractC2130h.b(null, new com.braze.storage.a(n3VarD, null), 1, null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) m10, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.P0
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.managers.i1.b();
                    }
                }, 7, (Object) null);
            }
            com.braze.storage.v0 v0Var = this.f27889b.f27924m;
            if (v0Var == null) {
                AbstractC4862t.p("deviceCache");
                v0Var = null;
            }
            if (v0Var.f28394a.b() == 0) {
                BrazeLogger brazeLogger2 = BrazeLogger.INSTANCE;
                BrazeLogger.brazelog$default(brazeLogger2, (Object) m10, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.Q0
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.managers.i1.c();
                    }
                }, 6, (Object) null);
                com.braze.storage.v0 v0Var2 = this.f27889b.f27924m;
                if (v0Var2 == null) {
                    AbstractC4862t.p("deviceCache");
                    v0Var2 = null;
                }
                v0Var2.getClass();
                AbstractC2130h.b(null, new com.braze.storage.a(v0Var2, null), 1, null);
                BrazeLogger.brazelog$default(brazeLogger2, (Object) m10, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.R0
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.managers.i1.d();
                    }
                }, 7, (Object) null);
            }
            this.f27889b.f27910F.g();
            this.f27889b.f27925n.c();
            this.f27889b.f27930s.m();
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) m10, BrazeLogger.Priority.f28628W, (Throwable) e10, false, new InterfaceC6082a() { // from class: c5.S0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.i1.e();
                }
            }, 4, (Object) null);
        }
        try {
            this.f27889b.f27929r.f();
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) m10, BrazeLogger.Priority.f28628W, (Throwable) e11, false, new InterfaceC6082a() { // from class: c5.T0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.i1.f();
                }
            }, 4, (Object) null);
        }
        return C4015H.f34254a;
    }
}
