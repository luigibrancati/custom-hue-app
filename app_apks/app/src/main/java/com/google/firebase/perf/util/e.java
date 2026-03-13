package com.google.firebase.perf.util;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class e implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f31850a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f31851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f31852c;

    public e(View view, Runnable runnable) {
        this.f31851b = new AtomicReference(view);
        this.f31852c = runnable;
    }

    public static /* synthetic */ void a(e eVar, View view) {
        eVar.getClass();
        view.getViewTreeObserver().removeOnDrawListener(eVar);
    }

    public static void b(View view, Runnable runnable) {
        view.getViewTreeObserver().addOnDrawListener(new e(view, runnable));
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        final View view = (View) this.f31851b.getAndSet(null);
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.google.firebase.perf.util.d
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                e.a(this.f31848a, view);
            }
        });
        this.f31850a.postAtFrontOfQueue(this.f31852c);
    }
}
