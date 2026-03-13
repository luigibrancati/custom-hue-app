package com.braze.managers;

import com.braze.support.BrazeLogger;
import fc.AbstractC4036s;
import fc.C4015H;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import lc.InterfaceC4988e;
import mc.C5046c;
import vc.InterfaceC6082a;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f extends nc.m implements l {
    public f(InterfaceC4988e interfaceC4988e) {
        super(1, interfaceC4988e);
    }

    public static final String a(d dVar) {
        return "Removing banner from monitor list " + dVar.a();
    }

    public static final String b(d dVar) {
        return "Error checking banner visibility for " + dVar.a() + ".Removing banner from visibility monitoring.";
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(InterfaceC4988e interfaceC4988e) {
        return new f(interfaceC4988e);
    }

    @Override // vc.l
    public final Object invoke(Object obj) {
        return new f((InterfaceC4988e) obj).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C5046c.f();
        AbstractC4036s.b(obj);
        ReentrantLock reentrantLock = j.f27893k;
        reentrantLock.lock();
        try {
            j.f27892j = null;
            Iterator it = j.f27894l.iterator();
            while (it.hasNext()) {
                final d dVar = (d) it.next();
                try {
                    if (!dVar.f27849c) {
                        g gVar = j.f27890h;
                        if (gVar.a(dVar)) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) gVar, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.T
                                @Override // vc.InterfaceC6082a
                                public final Object invoke() {
                                    return com.braze.managers.f.a(dVar);
                                }
                            }, 7, (Object) null);
                            it.remove();
                        }
                    }
                } catch (Exception e10) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) j.f27890h, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: c5.U
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return com.braze.managers.f.b(dVar);
                        }
                    }, 4, (Object) null);
                    it.remove();
                }
            }
            ArrayList arrayList = j.f27894l;
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!((d) it2.next()).f27849c) {
                        g gVar2 = j.f27890h;
                        g.d();
                        break;
                    }
                }
            }
            C4015H c4015h = C4015H.f34254a;
            reentrantLock.unlock();
            return c4015h;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
