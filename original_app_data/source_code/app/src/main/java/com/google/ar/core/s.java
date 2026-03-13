package com.google.ar.core;

import android.view.View;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
final class s implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ InstallActivity f31218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f31219b;

    public s(InstallActivity installActivity, int i10, byte[] bArr) {
        this.f31219b = i10;
        Objects.requireNonNull(installActivity);
        this.f31218a = installActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f31219b != 0) {
            this.f31218a.c(new UnavailableUserDeclinedInstallationException());
        } else {
            InstallActivity installActivity = this.f31218a;
            installActivity.b();
            installActivity.d();
        }
    }

    public s(InstallActivity installActivity, int i10) {
        this.f31219b = i10;
        Objects.requireNonNull(installActivity);
        this.f31218a = installActivity;
    }
}
