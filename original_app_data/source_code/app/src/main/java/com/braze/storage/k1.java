package com.braze.storage;

import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h3 f28474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.braze.events.d f28475b;

    public k1(h3 sessionStorageManager, com.braze.events.d eventPublisher) {
        AbstractC4862t.e(sessionStorageManager, "sessionStorageManager");
        AbstractC4862t.e(eventPublisher, "eventPublisher");
        this.f28474a = sessionStorageManager;
        this.f28475b = eventPublisher;
    }

    public static final String a() {
        return "Failed to get the active session from the storage.";
    }

    public static final String b() {
        return "Failed to delete the sealed session from the storage.";
    }

    public static final String d() {
        return "Error occured while publishing exception.";
    }

    public static final String e() {
        return "Failed to upsert active session in the storage.";
    }

    public final com.braze.models.p c() {
        try {
            return this.f28474a.c();
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: r5.I1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.k1.a();
                }
            }, 4, (Object) null);
            this.a(this.f28475b, e10);
            return null;
        }
    }

    public final void a(com.braze.models.p session) {
        AbstractC4862t.e(session, "session");
        try {
            this.f28474a.a(session);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: r5.H1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.k1.e();
                }
            }, 4, (Object) null);
            a(this.f28475b, e10);
        }
    }

    public final void a(String sessionId) {
        AbstractC4862t.e(sessionId, "sessionId");
        try {
            this.f28474a.a(sessionId);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: r5.G1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.k1.b();
                }
            }, 4, (Object) null);
            a(this.f28475b, e10);
        }
    }

    public final void a(com.braze.events.d eventPublisher, Exception throwable) {
        AbstractC4862t.e(eventPublisher, "eventPublisher");
        AbstractC4862t.e(throwable, "throwable");
        try {
            eventPublisher.b(new com.braze.exceptions.b("A storage exception has occurred. Please view the stack trace for more details.", throwable), com.braze.exceptions.b.class);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: r5.J1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.k1.d();
                }
            }, 4, (Object) null);
        }
    }
}
