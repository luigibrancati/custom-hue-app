package com.braze.managers;

import android.content.Context;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.models.IBrazeLocation;
import com.braze.support.BrazeLogger;
import fc.C4015H;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class p implements p0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o f27959d = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f27960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BrazeConfigurationProvider f27961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.braze.location.b f27962c;

    public p(Context context, r brazeManager, BrazeConfigurationProvider appConfigurationProvider) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(brazeManager, "brazeManager");
        AbstractC4862t.e(appConfigurationProvider, "appConfigurationProvider");
        this.f27960a = brazeManager;
        this.f27961b = appConfigurationProvider;
        this.f27962c = new com.braze.location.b(context, f27959d.a(appConfigurationProvider), appConfigurationProvider);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.v2
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.p.c();
            }
        }, 6, (Object) null);
    }

    public static final String a() {
        return "Automatic location collection enabled via sdk configuration.";
    }

    public static final String b() {
        return "Automatic location collection disabled via sdk configuration.";
    }

    public static final String c() {
        return "***Location API not found. Please include android-sdk-location module***";
    }

    public static final String e() {
        return "Failed to log location recorded event.";
    }

    public static final String g() {
        return "Automatic location collection is disabled. Not requesting location update.";
    }

    public final boolean d() {
        if (this.f27961b.isAutomaticLocationCollectionEnabled()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.w2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.p.a();
                }
            }, 6, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.x2
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.p.b();
            }
        }, 6, (Object) null);
        return true;
    }

    public final boolean f() {
        if (d()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.t2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.p.g();
                }
            }, 6, (Object) null);
            return false;
        }
        com.braze.location.b bVar = this.f27962c;
        l locationUpdateCallback = new l() { // from class: c5.u2
            @Override // vc.l
            public final Object invoke(Object obj) {
                return com.braze.managers.p.a(this.f25783a, (IBrazeLocation) obj);
            }
        };
        bVar.getClass();
        AbstractC4862t.e(locationUpdateCallback, "locationUpdateCallback");
        return false;
    }

    public static final String b(IBrazeLocation iBrazeLocation) {
        return "Invoked manualSetUserLocation for " + iBrazeLocation;
    }

    public final boolean a(final IBrazeLocation location) {
        p pVar;
        AbstractC4862t.e(location, "location");
        try {
            pVar = this;
            try {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) pVar, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.y2
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.managers.p.b(location);
                    }
                }, 6, (Object) null);
                com.braze.models.k kVarA = com.braze.models.outgoing.event.b.f28071g.a(location);
                if (kVarA == null) {
                    return true;
                }
                pVar = this;
                pVar.f27960a.a(kVarA);
                return true;
            } catch (Exception e10) {
                e = e10;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) pVar, BrazeLogger.Priority.f28625E, (Throwable) e, false, new InterfaceC6082a() { // from class: c5.z2
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.managers.p.e();
                    }
                }, 4, (Object) null);
                return false;
            }
        } catch (Exception e11) {
            e = e11;
            pVar = this;
        }
    }

    public static final C4015H a(p pVar, IBrazeLocation it) {
        AbstractC4862t.e(it, "it");
        pVar.a(it);
        return C4015H.f34254a;
    }
}
