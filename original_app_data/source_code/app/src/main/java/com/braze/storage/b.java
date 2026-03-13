package com.braze.storage;

import ae.InterfaceC2694h;
import com.braze.support.BrazeLogger;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2694h f28394a = ae.l.b(1, 0, 2, null);

    public static final String b(b bVar) {
        return "Cache locked successfully for export: " + bVar;
    }

    public final synchronized Object a() {
        Object objC;
        try {
            if (this.f28394a.c()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.T0
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.storage.b.b(this.f43625a);
                    }
                }, 7, (Object) null);
                objC = c();
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.U0
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.storage.b.b();
                    }
                }, 7, (Object) null);
                objC = null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return objC;
    }

    public abstract Object c();

    public abstract void c(Object obj, boolean z10);

    public static final String b() {
        return "Received call to export dirty object, but the cache was already locked.";
    }

    public static final String b(Object obj, boolean z10) {
        return "Tried to confirm outboundObject [" + obj + "] with success [" + z10 + "], but the cache wasn't locked, so not doing anything.";
    }

    public final synchronized void a(final Object obj, final boolean z10) {
        if (this.f28394a.b() != 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.R0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.b.b(obj, z10);
                }
            }, 6, (Object) null);
            return;
        }
        c(obj, z10);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.S0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.storage.b.a(this.f43622a);
            }
        }, 6, (Object) null);
        this.f28394a.release();
    }

    public static final String a(b bVar) {
        return "Notifying confirmAndUnlock listeners for cache: " + bVar;
    }
}
