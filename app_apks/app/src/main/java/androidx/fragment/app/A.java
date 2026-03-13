package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class A extends AbstractC2742x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f22997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f22998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f22999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final J f23001e;

    public A(Activity activity, Context context, Handler handler, int i10) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(handler, "handler");
        this.f22997a = activity;
        this.f22998b = context;
        this.f22999c = handler;
        this.f23000d = i10;
        this.f23001e = new K();
    }

    public final Activity e() {
        return this.f22997a;
    }

    public final Context f() {
        return this.f22998b;
    }

    public final J g() {
        return this.f23001e;
    }

    public final Handler h() {
        return this.f22999c;
    }

    public abstract void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract Object j();

    public abstract LayoutInflater k();

    public void l(ComponentCallbacksC2736q fragment, String[] permissions, int i10) {
        AbstractC4862t.e(fragment, "fragment");
        AbstractC4862t.e(permissions, "permissions");
    }

    public abstract boolean m(String str);

    public void n(ComponentCallbacksC2736q fragment, Intent intent, int i10, Bundle bundle) {
        AbstractC4862t.e(fragment, "fragment");
        AbstractC4862t.e(intent, "intent");
        if (i10 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        L0.a.p(this.f22998b, intent, bundle);
    }

    public void o(ComponentCallbacksC2736q fragment, IntentSender intent, int i10, Intent intent2, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        AbstractC4862t.e(fragment, "fragment");
        AbstractC4862t.e(intent, "intent");
        if (i10 != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        Activity activity = this.f22997a;
        if (activity == null) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        androidx.core.app.a.A(activity, intent, i10, intent2, i11, i12, i13, bundle);
    }

    public abstract void p();

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public A(ActivityC2740v activity) {
        this(activity, activity, new Handler(), 0);
        AbstractC4862t.e(activity, "activity");
    }
}
