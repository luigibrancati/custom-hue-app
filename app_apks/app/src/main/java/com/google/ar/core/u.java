package com.google.ar.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
final class u extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ InstallActivity f31224a;

    public u(InstallActivity installActivity) {
        Objects.requireNonNull(installActivity);
        this.f31224a = installActivity;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f31224a.a();
    }
}
