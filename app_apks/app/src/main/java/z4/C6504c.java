package z4;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: z4.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6504c implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Td.g f48745a = Td.j.b(Integer.MAX_VALUE, null, null, 6, null);

    public final Td.g a() {
        return this.f48745a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC4862t.e(activity, "activity");
        this.f48745a.n(new C6502a(new WeakReference(activity), EnumC6503b.Created));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        AbstractC4862t.e(activity, "activity");
        this.f48745a.n(new C6502a(new WeakReference(activity), EnumC6503b.Destroyed));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC4862t.e(activity, "activity");
        this.f48745a.n(new C6502a(new WeakReference(activity), EnumC6503b.Paused));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        AbstractC4862t.e(activity, "activity");
        this.f48745a.n(new C6502a(new WeakReference(activity), EnumC6503b.Resumed));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        AbstractC4862t.e(activity, "activity");
        AbstractC4862t.e(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        AbstractC4862t.e(activity, "activity");
        this.f48745a.n(new C6502a(new WeakReference(activity), EnumC6503b.Started));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC4862t.e(activity, "activity");
        this.f48745a.n(new C6502a(new WeakReference(activity), EnumC6503b.Stopped));
    }
}
