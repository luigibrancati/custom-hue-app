package X6;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class F4 implements Application.ActivityLifecycleCallbacks, D4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ R4 f18302a;

    public F4(R4 r42) {
        Objects.requireNonNull(r42);
        this.f18302a = r42;
    }

    @Override // X6.D4
    public final void a(com.google.android.gms.internal.measurement.C0 c02) {
        C2416j3 c2416j3 = this.f18302a.f18400a;
        c2416j3.I().x(c02);
        C2443m6 c2443m6Z = c2416j3.z();
        C2416j3 c2416j32 = c2443m6Z.f18400a;
        c2416j32.b().t(new RunnableC2379e6(c2443m6Z, c2416j32.e().c()));
    }

    @Override // X6.D4
    public final void b(com.google.android.gms.internal.measurement.C0 c02) {
        this.f18302a.f18400a.I().z(c02);
    }

    @Override // X6.D4
    public final void c(com.google.android.gms.internal.measurement.C0 c02, Bundle bundle) {
        this.f18302a.f18400a.I().y(c02, bundle);
    }

    @Override // X6.D4
    public final void d(com.google.android.gms.internal.measurement.C0 c02) {
        C2416j3 c2416j3 = this.f18302a.f18400a;
        C2443m6 c2443m6Z = c2416j3.z();
        C2416j3 c2416j32 = c2443m6Z.f18400a;
        c2416j32.b().t(new RunnableC2371d6(c2443m6Z, c2416j32.e().c()));
        c2416j3.I().w(c02);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0081  */
    @Override // X6.D4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(com.google.android.gms.internal.measurement.C0 r8, android.os.Bundle r9) throws java.lang.Throwable {
        /*
            r7 = this;
            X6.R4 r0 = r7.f18302a     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            X6.j3 r1 = r0.f18400a     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            X6.z2 r2 = r1.a()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            X6.x2 r2 = r2.w()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            java.lang.String r3 = "onActivityCreated"
            r2.a(r3)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            android.content.Intent r2 = r8.f29148c     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r2 == 0) goto L95
            android.net.Uri r3 = r2.getData()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r3 == 0) goto L2c
            boolean r4 = r3.isHierarchical()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r4 != 0) goto L22
            goto L2c
        L22:
            r4 = r3
            goto L44
        L24:
            r0 = move-exception
            r2 = r7
            goto Lb5
        L28:
            r0 = move-exception
            r2 = r7
            goto L9f
        L2c:
            android.os.Bundle r3 = r2.getExtras()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            r4 = 0
            if (r3 == 0) goto L44
            java.lang.String r5 = "com.android.vending.referral_url"
            java.lang.String r3 = r3.getString(r5)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r5 != 0) goto L44
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            goto L22
        L44:
            if (r4 == 0) goto L95
            boolean r3 = r4.isHierarchical()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r3 != 0) goto L4d
            goto L95
        L4d:
            r1.C()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            java.lang.String r0 = "android.intent.extra.REFERRER_NAME"
            java.lang.String r0 = r2.getStringExtra(r0)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            java.lang.String r2 = "android-app://com.google.android.googlequicksearchbox/https/www.google.com"
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r2 != 0) goto L73
            java.lang.String r2 = "https://www.google.com"
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r2 != 0) goto L73
            java.lang.String r2 = "android-app://com.google.appcrawler"
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r0 == 0) goto L6f
            goto L73
        L6f:
            java.lang.String r0 = "auto"
        L71:
            r5 = r0
            goto L76
        L73:
            java.lang.String r0 = "gs"
            goto L71
        L76:
            java.lang.String r0 = "referrer"
            java.lang.String r6 = r4.getQueryParameter(r0)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r9 != 0) goto L81
            r0 = 1
        L7f:
            r3 = r0
            goto L83
        L81:
            r0 = 0
            goto L7f
        L83:
            X6.f3 r0 = r1.b()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            X6.E4 r1 = new X6.E4     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L91 java.lang.RuntimeException -> L93
            r0.t(r1)     // Catch: java.lang.Throwable -> L91 java.lang.RuntimeException -> L93
            goto Lb0
        L91:
            r0 = move-exception
            goto Lb5
        L93:
            r0 = move-exception
            goto L9f
        L95:
            X6.j3 r7 = r0.f18400a
        L97:
            X6.k5 r7 = r7.I()
            r7.v(r8, r9)
            return
        L9f:
            X6.R4 r7 = r2.f18302a     // Catch: java.lang.Throwable -> L91
            X6.j3 r7 = r7.f18400a     // Catch: java.lang.Throwable -> L91
            X6.z2 r7 = r7.a()     // Catch: java.lang.Throwable -> L91
            X6.x2 r7 = r7.o()     // Catch: java.lang.Throwable -> L91
            java.lang.String r1 = "Throwable caught in onActivityCreated"
            r7.b(r1, r0)     // Catch: java.lang.Throwable -> L91
        Lb0:
            X6.R4 r7 = r2.f18302a
            X6.j3 r7 = r7.f18400a
            goto L97
        Lb5:
            X6.R4 r7 = r2.f18302a
            X6.j3 r7 = r7.f18400a
            X6.k5 r7 = r7.I()
            r7.v(r8, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.F4.e(com.google.android.gms.internal.measurement.C0, android.os.Bundle):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) throws Throwable {
        e(com.google.android.gms.internal.measurement.C0.d(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        b(com.google.android.gms.internal.measurement.C0.d(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(com.google.android.gms.internal.measurement.C0.d(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        d(com.google.android.gms.internal.measurement.C0.d(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        c(com.google.android.gms.internal.measurement.C0.d(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
