package u6;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.ActivityC2740v;
import androidx.fragment.app.ComponentCallbacksC2736q;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: u6.k0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5965k0 extends ComponentCallbacksC2736q implements InterfaceC5958h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f45196b = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5963j0 f45197a = new C5963j0();

    public static C5965k0 l(ActivityC2740v activityC2740v) {
        C5965k0 c5965k0;
        androidx.fragment.app.J supportFragmentManager = activityC2740v.getSupportFragmentManager();
        WeakHashMap weakHashMap = f45196b;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activityC2740v);
        if (weakReference != null && (c5965k0 = (C5965k0) weakReference.get()) != null) {
            return c5965k0;
        }
        try {
            C5965k0 c5965k02 = (C5965k0) supportFragmentManager.l0("SLifecycleFragmentImpl");
            if (c5965k02 == null || c5965k02.isRemoving()) {
                c5965k02 = new C5965k0();
                supportFragmentManager.p().d(c5965k02, "SLifecycleFragmentImpl").g();
            }
            weakHashMap.put(activityC2740v, new WeakReference(c5965k02));
            return c5965k02;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e10);
        }
    }

    @Override // u6.InterfaceC5958h
    public final void a(String str, AbstractC5956g abstractC5956g) {
        this.f45197a.b(str, abstractC5956g);
    }

    @Override // u6.InterfaceC5958h
    public final AbstractC5956g b(String str, Class cls) {
        return this.f45197a.a(str, cls);
    }

    @Override // u6.InterfaceC5958h
    public final Activity c() {
        return getActivity();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC2736q
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        this.f45197a.j(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC2736q
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        this.f45197a.f(i10, i11, intent);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC2736q
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f45197a.c(bundle);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC2736q
    public final void onDestroy() {
        super.onDestroy();
        this.f45197a.i();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC2736q
    public final void onResume() {
        super.onResume();
        this.f45197a.e();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC2736q
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f45197a.g(bundle);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC2736q
    public final void onStart() {
        super.onStart();
        this.f45197a.d();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC2736q
    public final void onStop() {
        super.onStop();
        this.f45197a.h();
    }
}
