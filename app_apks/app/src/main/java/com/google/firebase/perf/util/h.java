package com.google.firebase.perf.util;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class h implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f31856a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f31857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f31858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Runnable f31859d;

    public h(View view, Runnable runnable, Runnable runnable2) {
        this.f31857b = new AtomicReference(view);
        this.f31858c = runnable;
        this.f31859d = runnable2;
    }

    public static void a(View view, Runnable runnable, Runnable runnable2) {
        view.getViewTreeObserver().addOnPreDrawListener(new h(view, runnable, runnable2));
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        View view = (View) this.f31857b.getAndSet(null);
        if (view == null) {
            return true;
        }
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f31856a.post(this.f31858c);
        this.f31856a.postAtFrontOfQueue(this.f31859d);
        return true;
    }
}
