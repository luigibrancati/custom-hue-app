package com.braze.storage;

import Rd.AbstractC2132i;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import fc.C4015H;
import gc.U;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f28600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.braze.events.d f28601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f28602c;

    public w1(j storage, com.braze.events.d eventPublisher) {
        AbstractC4862t.e(storage, "storage");
        AbstractC4862t.e(eventPublisher, "eventPublisher");
        this.f28600a = storage;
        this.f28601b = eventPublisher;
    }

    public static final String a() {
        return "Storage provider is closed. Not getting all events.";
    }

    public static final String b() {
        return "Failed to get all events from storage.";
    }

    public static final String d() {
        return "Failed to log storage exception";
    }

    public final Collection c() {
        if (this.f28602c) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.t3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.w1.a();
                }
            }, 6, (Object) null);
            return U.d();
        }
        try {
            return this.f28600a.b();
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: r5.u3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.w1.b();
                }
            }, 4, (Object) null);
            a(e10);
            return U.d();
        }
    }

    public final void a(final com.braze.models.k event) {
        AbstractC4862t.e(event, "event");
        a("add event " + event, new InterfaceC6082a() { // from class: r5.w3
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.storage.w1.a(this.f43727a, event);
            }
        });
    }

    public static final C4015H a(w1 w1Var, com.braze.models.k kVar) {
        w1Var.f28600a.a(kVar);
        return C4015H.f34254a;
    }

    public final void a(final Set events) {
        AbstractC4862t.e(events, "events");
        a("delete events " + events, new InterfaceC6082a() { // from class: r5.y3
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.storage.w1.a(this.f43735a, events);
            }
        });
    }

    public static final C4015H a(w1 w1Var, Set set) {
        w1Var.f28600a.a(set);
        return C4015H.f34254a;
    }

    public final void a(Exception exc) {
        try {
            this.f28601b.b(new com.braze.exceptions.b("A storage exception has occurred!", exc), com.braze.exceptions.b.class);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: r5.v3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.w1.d();
                }
            }, 4, (Object) null);
        }
    }

    public final void a(final String str, InterfaceC6082a interfaceC6082a) {
        if (!this.f28602c) {
            AbstractC2132i.d(BrazeCoroutineScope.INSTANCE, null, null, new v1(interfaceC6082a, this, str, null), 3, null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.x3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.w1.a(str);
                }
            }, 6, (Object) null);
        }
    }

    public static final String a(String str) {
        return "Storage provider is closed. Failed to " + str;
    }
}
