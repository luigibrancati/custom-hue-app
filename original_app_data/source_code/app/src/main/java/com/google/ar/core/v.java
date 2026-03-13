package com.google.ar.core;

import com.google.ar.core.ArCoreApk;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f31225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ InstallActivity f31226b;

    public v(InstallActivity installActivity) {
        Objects.requireNonNull(installActivity);
        this.f31226b = installActivity;
        this.f31225a = false;
    }

    public final void a(w wVar) {
        InstallActivity installActivity = this.f31226b;
        synchronized (installActivity) {
            try {
                if (this.f31225a) {
                    return;
                }
                installActivity.f(wVar);
                ArCoreApk.UserMessageType userMessageType = ArCoreApk.UserMessageType.APPLICATION;
                ArCoreApk.Availability availability = ArCoreApk.Availability.UNKNOWN_ERROR;
                int iOrdinal = wVar.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        installActivity.c(new UnavailableUserDeclinedInstallationException());
                    } else if (iOrdinal == 2) {
                        if (!installActivity.g() && k.a().f31196b) {
                            installActivity.e();
                        }
                        installActivity.c(null);
                    }
                    this.f31225a = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Exception exc) {
        InstallActivity installActivity = this.f31226b;
        synchronized (installActivity) {
            try {
                if (this.f31225a) {
                    return;
                }
                this.f31225a = true;
                installActivity.f(w.CANCELLED);
                installActivity.c(exc);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
