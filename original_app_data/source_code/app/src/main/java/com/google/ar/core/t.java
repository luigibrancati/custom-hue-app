package com.google.ar.core;

import android.animation.ValueAnimator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
final class t implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f31220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f31221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f31222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ InstallActivity f31223d;

    public t(InstallActivity installActivity, int i10, int i11, int i12) {
        this.f31220a = i10;
        this.f31221b = i11;
        this.f31222c = i12;
        Objects.requireNonNull(installActivity);
        this.f31223d = installActivity;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = 1.0f - valueAnimator.getAnimatedFraction();
        float animatedFraction2 = this.f31221b * valueAnimator.getAnimatedFraction();
        InstallActivity installActivity = this.f31223d;
        installActivity.getWindow().setLayout((int) ((this.f31220a * animatedFraction) + animatedFraction2), (int) ((this.f31222c * animatedFraction) + animatedFraction2));
        installActivity.getWindow().getDecorView().refreshDrawableState();
    }
}
