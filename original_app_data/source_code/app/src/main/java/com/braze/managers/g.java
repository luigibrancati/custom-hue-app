package com.braze.managers;

import Rd.AbstractC2132i;
import android.graphics.Rect;
import android.view.View;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import fc.C4015H;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static void a(final String placementId, final View view, boolean z10) {
        AbstractC4862t.e(placementId, "placementId");
        AbstractC4862t.e(view, "view");
        ReentrantLock reentrantLock = j.f27893k;
        reentrantLock.lock();
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) j.f27890h, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.W
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.g.a(placementId, view);
                }
            }, 7, (Object) null);
            Iterator it = j.f27894l.iterator();
            while (it.hasNext()) {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                g gVar = j.f27890h;
                BrazeLogger.Priority priority = BrazeLogger.Priority.f28627V;
                BrazeLogger.brazelog$default(brazeLogger, (Object) gVar, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.X
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.managers.g.a();
                    }
                }, 6, (Object) null);
                final d dVar = (d) it.next();
                if (AbstractC4862t.a(dVar.f27848b.get(), view)) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) gVar, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.Y
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return com.braze.managers.g.a(dVar, placementId);
                        }
                    }, 6, (Object) null);
                    it.remove();
                }
            }
            j.f27894l.add(new d(placementId, new WeakReference(view), z10));
            d();
            C4015H c4015h = C4015H.f34254a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static void b() {
        ReentrantLock reentrantLock = j.f27893k;
        reentrantLock.lock();
        try {
            for (final d dVar : j.f27894l) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) j.f27890h, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.b0
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.managers.g.c(dVar);
                    }
                }, 6, (Object) null);
                dVar.f27849c = false;
            }
            C4015H c4015h = C4015H.f34254a;
            reentrantLock.unlock();
            d();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String c(d dVar) {
        return "Resetting impression for " + dVar.a();
    }

    public static void d() {
        if (j.f27892j != null) {
            return;
        }
        j.f27892j = BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, 200L, null, new f(null), 2, null);
    }

    public static final String b(List list) {
        return "Setting banner placement list to " + list;
    }

    public static final String b(d dVar) {
        return "Banner is not shown " + dVar.a() + " because view is null";
    }

    public final boolean a(final d dVar) {
        View view = (View) dVar.f27848b.get();
        if (view == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.Z
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.g.b(dVar);
                }
            }, 7, (Object) null);
            return true;
        }
        final String str = dVar.f27847a;
        if (view.isShown()) {
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect) && rect.width() != 0 && rect.height() != 0) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.a0
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.managers.g.a(str);
                    }
                }, 7, (Object) null);
                AbstractC2132i.d(BrazeCoroutineScope.INSTANCE, null, null, new e(view, str, dVar, null), 3, null);
            }
        }
        return false;
    }

    public final void a(final List placementIds) {
        AbstractC4862t.e(placementIds, "placementIds");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.V
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.g.b(placementIds);
            }
        }, 7, (Object) null);
        ReentrantLock reentrantLock = j.f27895m;
        reentrantLock.lock();
        try {
            ArrayList arrayList = j.f27896n;
            arrayList.clear();
            arrayList.addAll(placementIds);
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String a(String str, View view) {
        return "Adding monitor for " + str + " for BannerView " + view;
    }

    public static final String a() {
        return "Checking existing monitor list for view reuse.";
    }

    public static final String a(d dVar, String str) {
        return "Removing banner from monitor list " + dVar.a() + " because view is now used by " + str;
    }

    public static final String a(String str) {
        return "Banner is shown " + str + ".";
    }
}
