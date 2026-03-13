package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.AbstractC2754j;
import androidx.lifecycle.C2759o;
import androidx.lifecycle.InterfaceC2752h;
import androidx.lifecycle.O;
import i3.C4345f;
import i3.C4347h;
import i3.InterfaceC4348i;
import y1.AbstractC6382a;
import y1.C6383b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class W implements InterfaceC2752h, InterfaceC4348i, androidx.lifecycle.Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComponentCallbacksC2736q f23181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.P f23182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f23183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public O.c f23184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C2759o f23185e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C4347h f23186f = null;

    public W(ComponentCallbacksC2736q componentCallbacksC2736q, androidx.lifecycle.P p10, Runnable runnable) {
        this.f23181a = componentCallbacksC2736q;
        this.f23182b = p10;
        this.f23183c = runnable;
    }

    public void a(AbstractC2754j.a aVar) {
        this.f23185e.h(aVar);
    }

    public void b() {
        if (this.f23185e == null) {
            this.f23185e = new C2759o(this);
            C4347h c4347hA = C4347h.a(this);
            this.f23186f = c4347hA;
            c4347hA.c();
            this.f23183c.run();
        }
    }

    public boolean c() {
        return this.f23185e != null;
    }

    public void d(Bundle bundle) {
        this.f23186f.d(bundle);
    }

    public void e(Bundle bundle) {
        this.f23186f.e(bundle);
    }

    public void f(AbstractC2754j.b bVar) {
        this.f23185e.m(bVar);
    }

    @Override // androidx.lifecycle.InterfaceC2752h
    public AbstractC6382a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.f23181a.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        C6383b c6383b = new C6383b();
        if (application != null) {
            c6383b.c(O.a.f23425h, application);
        }
        c6383b.c(androidx.lifecycle.F.f23397a, this.f23181a);
        c6383b.c(androidx.lifecycle.F.f23398b, this);
        if (this.f23181a.getArguments() != null) {
            c6383b.c(androidx.lifecycle.F.f23399c, this.f23181a.getArguments());
        }
        return c6383b;
    }

    @Override // androidx.lifecycle.InterfaceC2752h
    public O.c getDefaultViewModelProviderFactory() {
        Application application;
        O.c defaultViewModelProviderFactory = this.f23181a.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.f23181a.mDefaultFactory)) {
            this.f23184d = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f23184d == null) {
            Context applicationContext = this.f23181a.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            ComponentCallbacksC2736q componentCallbacksC2736q = this.f23181a;
            this.f23184d = new androidx.lifecycle.J(application, componentCallbacksC2736q, componentCallbacksC2736q.getArguments());
        }
        return this.f23184d;
    }

    @Override // androidx.lifecycle.InterfaceC2758n
    public AbstractC2754j getLifecycle() {
        b();
        return this.f23185e;
    }

    @Override // i3.InterfaceC4348i
    public C4345f getSavedStateRegistry() {
        b();
        return this.f23186f.b();
    }

    @Override // androidx.lifecycle.Q
    public androidx.lifecycle.P getViewModelStore() {
        b();
        return this.f23182b;
    }
}
