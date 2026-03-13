package com.braze.managers;

import android.content.Context;
import com.amazon.device.messaging.ADM;
import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f27842c = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f27843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f27844b;

    public c(Context context, q0 admRegistrationDataProvider) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(admRegistrationDataProvider, "admRegistrationDataProvider");
        this.f27843a = context;
        this.f27844b = admRegistrationDataProvider;
    }

    public static final String b() {
        return "Registering with ADM server...";
    }

    public final void a() {
        if (((z0) this.f27844b).b() != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.M
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.c.a(this.f25665a);
                }
            }, 6, (Object) null);
            z0 z0Var = (z0) this.f27844b;
            z0Var.a(z0Var.b());
        } else {
            ADM adm = new ADM(this.f27843a);
            if (adm.isSupported()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.N
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.managers.c.b();
                    }
                }, 6, (Object) null);
                adm.startRegister();
            }
        }
    }

    public static final String a(c cVar) {
        return "The device is already registered with the ADM server and is eligible to receive ADM messages.ADM registration id: " + ((z0) cVar.f27844b).b();
    }
}
