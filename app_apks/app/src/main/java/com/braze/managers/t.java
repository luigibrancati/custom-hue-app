package com.braze.managers;

import Rd.M;
import android.content.BroadcastReceiver;
import com.braze.support.BrazeLogger;
import fc.AbstractC4036s;
import fc.C4015H;
import java.util.concurrent.locks.ReentrantLock;
import lc.InterfaceC4988e;
import mc.C5046c;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class t extends nc.m implements vc.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f27991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f27992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BroadcastReceiver.PendingResult f27993c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(w wVar, BroadcastReceiver.PendingResult pendingResult, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f27992b = wVar;
        this.f27993c = pendingResult;
    }

    public static final String a() {
        return "Failed to log throwable during seal session.";
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        t tVar = new t(this.f27992b, this.f27993c, interfaceC4988e);
        tVar.f27991a = obj;
        return tVar;
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((M) obj, (InterfaceC4988e) obj2)).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C5046c.f();
        AbstractC4036s.b(obj);
        M m10 = (M) this.f27991a;
        w wVar = this.f27992b;
        ReentrantLock reentrantLock = wVar.f28012h;
        reentrantLock.lock();
        try {
            try {
                wVar.j();
            } catch (Exception e10) {
                try {
                    wVar.f28007c.b(e10, Throwable.class);
                } catch (Exception e11) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) m10, BrazeLogger.Priority.f28625E, (Throwable) e11, false, new InterfaceC6082a() { // from class: c5.o3
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return com.braze.managers.t.a();
                        }
                    }, 4, (Object) null);
                }
            }
            C4015H c4015h = C4015H.f34254a;
            reentrantLock.unlock();
            this.f27993c.finish();
            return c4015h;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
