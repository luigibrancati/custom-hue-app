package com.braze.managers;

import com.braze.storage.w1;
import com.braze.support.BrazeLogger;
import gc.C4179C;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f27873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f27874b;

    public h0(w1 brazeEventStorageProvider) {
        AbstractC4862t.e(brazeEventStorageProvider, "brazeEventStorageProvider");
        this.f27873a = brazeEventStorageProvider;
    }

    public static final String b(com.braze.models.k kVar) {
        return "Storage manager is closed. Not adding event: " + kVar;
    }

    public final void a(final com.braze.models.k event) {
        AbstractC4862t.e(event, "event");
        if (this.f27874b) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.B0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.h0.b(event);
                }
            }, 6, (Object) null);
        } else {
            this.f27873a.a(event);
        }
    }

    public static final String b() {
        return "Started offline event recovery task.";
    }

    public final void a(final LinkedHashSet events) {
        AbstractC4862t.e(events, "events");
        if (this.f27874b) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.C0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.h0.a(events);
                }
            }, 6, (Object) null);
        } else {
            this.f27873a.a(events);
        }
    }

    public static final String a(Set set) {
        return "Storage manager is closed. Not deleting events: " + set;
    }

    public final void a(com.braze.events.d internalEventPublisher) {
        AbstractC4862t.e(internalEventPublisher, "internalEventPublisher");
        if (this.f27874b) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.y0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.h0.a();
                }
            }, 6, (Object) null);
            return;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.z0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.h0.b();
            }
        }, 7, (Object) null);
        final List events = C4179C.V0(this.f27873a.c());
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.A0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.h0.a(events);
            }
        }, 6, (Object) null);
        AbstractC4862t.e(events, "events");
        internalEventPublisher.b(new com.braze.events.internal.dispatchmanager.c(com.braze.events.internal.dispatchmanager.b.f27714b, events, null, null, 12), com.braze.events.internal.dispatchmanager.c.class);
    }

    public static final String a() {
        return "Storage manager is closed. Not starting offline recovery.";
    }

    public static final String a(List list) {
        return "Adding events to dispatch from storage: " + list;
    }
}
