package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: androidx.lifecycle.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C2755k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2755k f23463a = new C2755k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f23464b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: androidx.lifecycle.k$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends C2750f {
        @Override // androidx.lifecycle.C2750f, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            AbstractC4862t.e(activity, "activity");
            B.INSTANCE.b(activity);
        }
    }

    public static final void a(Context context) {
        AbstractC4862t.e(context, "context");
        if (f23464b.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        AbstractC4862t.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
    }
}
