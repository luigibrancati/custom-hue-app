package X6;

import android.app.Application;
import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.AbstractC3228j4;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: X6.j3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2416j3 implements N3 {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static volatile C2416j3 f19001E;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f19002A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f19003B;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final long f19005D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f19006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f19007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2380f f19008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2436m f19009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final N2 f19010e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C2542z2 f19011f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C2384f3 f19012g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C2443m6 f19013h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a7 f19014i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C2486s2 f19015j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final B6.e f19016k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C2426k5 f19017l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final R4 f19018m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final E0 f19019n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final W4 f19020o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f19021p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C2471q2 f19022q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public U5 f19023r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C f19024s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C2447n2 f19025t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Y4 f19026u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Boolean f19028w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f19029x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile Boolean f19030y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile boolean f19031z;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f19027v = false;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final AtomicInteger f19004C = new AtomicInteger(0);

    public C2416j3(Z3 z32) {
        AbstractC6056k.l(z32);
        Context context = z32.f18669a;
        C2380f c2380f = new C2380f(context);
        this.f19008c = c2380f;
        Y1.f18654a = c2380f;
        this.f19006a = context;
        this.f19007b = z32.f18673e;
        this.f19030y = z32.f18670b;
        this.f19021p = z32.f18675g;
        this.f19031z = true;
        AbstractC3228j4.b(context);
        B6.e eVarD = B6.h.d();
        this.f19016k = eVarD;
        Long l10 = z32.f18674f;
        this.f19005D = l10 != null ? l10.longValue() : eVarD.a();
        this.f19009d = new C2436m(this);
        N2 n22 = new N2(this);
        n22.m();
        this.f19010e = n22;
        C2542z2 c2542z2 = new C2542z2(this);
        c2542z2.m();
        this.f19011f = c2542z2;
        a7 a7Var = new a7(this);
        a7Var.m();
        this.f19014i = a7Var;
        this.f19015j = new C2486s2(new Y3(z32, this));
        this.f19019n = new E0(this);
        C2426k5 c2426k5 = new C2426k5(this);
        c2426k5.k();
        this.f19017l = c2426k5;
        R4 r42 = new R4(this);
        r42.k();
        this.f19018m = r42;
        C2443m6 c2443m6 = new C2443m6(this);
        c2443m6.k();
        this.f19013h = c2443m6;
        W4 w42 = new W4(this);
        w42.m();
        this.f19020o = w42;
        C2384f3 c2384f3 = new C2384f3(this);
        c2384f3.m();
        this.f19012g = c2384f3;
        com.google.android.gms.internal.measurement.A0 a02 = z32.f18672d;
        boolean z10 = a02 == null || a02.f29137b == 0;
        if (context.getApplicationContext() instanceof Application) {
            t(r42);
            if (r42.f18400a.f19006a.getApplicationContext() instanceof Application) {
                Application application = (Application) r42.f18400a.f19006a.getApplicationContext();
                if (r42.f18490c == null) {
                    r42.f18490c = new F4(r42);
                }
                if (z10) {
                    application.unregisterActivityLifecycleCallbacks(r42.f18490c);
                    application.registerActivityLifecycleCallbacks(r42.f18490c);
                    C2542z2 c2542z22 = r42.f18400a.f19011f;
                    u(c2542z22);
                    c2542z22.w().a("Registered activity lifecycle callback");
                }
            }
        } else {
            u(c2542z2);
            c2542z2.r().a("Application context is not an Application");
        }
        c2384f3.t(new RunnableC2400h3(this, z32));
    }

    public static C2416j3 O(Context context, com.google.android.gms.internal.measurement.A0 a02, Long l10) {
        Bundle bundle;
        if (a02 != null) {
            Bundle bundle2 = a02.f29139d;
            a02 = new com.google.android.gms.internal.measurement.A0(a02.f29136a, a02.f29137b, a02.f29138c, bundle2, null);
        }
        AbstractC6056k.l(context);
        AbstractC6056k.l(context.getApplicationContext());
        if (f19001E == null) {
            synchronized (C2416j3.class) {
                try {
                    if (f19001E == null) {
                        f19001E = new C2416j3(new Z3(context, a02, l10));
                    }
                } finally {
                }
            }
        } else if (a02 != null && (bundle = a02.f29139d) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            AbstractC6056k.l(f19001E);
            f19001E.f19030y = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        AbstractC6056k.l(f19001E);
        return f19001E;
    }

    public static final void q() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    public static final void r(G1 g12) {
        if (g12 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void s(L3 l32) {
        if (l32 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void t(AbstractC2399h2 abstractC2399h2) {
        if (abstractC2399h2 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!abstractC2399h2.i()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC2399h2.getClass())));
        }
    }

    public static final void u(M3 m32) {
        if (m32 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!m32.k()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(m32.getClass())));
        }
    }

    public final C2384f3 A() {
        return this.f19012g;
    }

    public final R4 B() {
        R4 r42 = this.f19018m;
        t(r42);
        return r42;
    }

    public final a7 C() {
        a7 a7Var = this.f19014i;
        s(a7Var);
        return a7Var;
    }

    public final C2486s2 D() {
        return this.f19015j;
    }

    public final C2471q2 E() {
        t(this.f19022q);
        return this.f19022q;
    }

    public final W4 F() {
        W4 w42 = this.f19020o;
        u(w42);
        return w42;
    }

    public final boolean G() {
        return this.f19007b;
    }

    public final String H() {
        return this.f19021p;
    }

    public final C2426k5 I() {
        C2426k5 c2426k5 = this.f19017l;
        t(c2426k5);
        return c2426k5;
    }

    public final U5 J() {
        t(this.f19023r);
        return this.f19023r;
    }

    public final C K() {
        u(this.f19024s);
        return this.f19024s;
    }

    public final C2447n2 L() {
        t(this.f19025t);
        return this.f19025t;
    }

    public final E0 M() {
        E0 e02 = this.f19019n;
        r(e02);
        return e02;
    }

    public final Y4 N() {
        r(this.f19026u);
        return this.f19026u;
    }

    public final void P(boolean z10) {
        this.f19030y = Boolean.valueOf(z10);
    }

    @Override // X6.N3
    public final C2542z2 a() {
        C2542z2 c2542z2 = this.f19011f;
        u(c2542z2);
        return c2542z2;
    }

    @Override // X6.N3
    public final C2384f3 b() {
        C2384f3 c2384f3 = this.f19012g;
        u(c2384f3);
        return c2384f3;
    }

    @Override // X6.N3
    public final C2380f c() {
        return this.f19008c;
    }

    @Override // X6.N3
    public final Context d() {
        return this.f19006a;
    }

    @Override // X6.N3
    public final B6.e e() {
        return this.f19016k;
    }

    public final boolean f() {
        return this.f19030y != null && this.f19030y.booleanValue();
    }

    public final boolean g() {
        return h() == 0;
    }

    public final int h() {
        C2384f3 c2384f3 = this.f19012g;
        u(c2384f3);
        c2384f3.h();
        C2436m c2436m = this.f19009d;
        if (c2436m.L()) {
            return 1;
        }
        u(c2384f3);
        c2384f3.h();
        if (!this.f19031z) {
            return 8;
        }
        N2 n22 = this.f19010e;
        s(n22);
        Boolean boolT = n22.t();
        if (boolT != null) {
            return boolT.booleanValue() ? 0 : 3;
        }
        C2380f c2380f = c2436m.f18400a.f19008c;
        Boolean boolJ = c2436m.J("firebase_analytics_collection_enabled");
        return boolJ != null ? boolJ.booleanValue() ? 0 : 4 : (this.f19030y == null || this.f19030y.booleanValue()) ? 0 : 7;
    }

    public final void i(boolean z10) {
        C2384f3 c2384f3 = this.f19012g;
        u(c2384f3);
        c2384f3.h();
        this.f19031z = z10;
    }

    public final boolean j() {
        C2384f3 c2384f3 = this.f19012g;
        u(c2384f3);
        c2384f3.h();
        return this.f19031z;
    }

    public final void k() {
        this.f19002A++;
    }

    public final void l() {
        this.f19004C.incrementAndGet();
    }

    public final boolean m() {
        if (!this.f19027v) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        C2384f3 c2384f3 = this.f19012g;
        u(c2384f3);
        c2384f3.h();
        Boolean bool = this.f19028w;
        if (bool == null || this.f19029x == 0 || (!bool.booleanValue() && Math.abs(this.f19016k.c() - this.f19029x) > 1000)) {
            this.f19029x = this.f19016k.c();
            a7 a7Var = this.f19014i;
            s(a7Var);
            boolean z10 = false;
            if (a7Var.M("android.permission.INTERNET")) {
                s(a7Var);
                if (a7Var.M("android.permission.ACCESS_NETWORK_STATE")) {
                    Context context = this.f19006a;
                    if (D6.d.a(context).f() || this.f19009d.m() || (a7.j0(context) && a7.E(context, false))) {
                        z10 = true;
                    }
                }
            }
            Boolean boolValueOf = Boolean.valueOf(z10);
            this.f19028w = boolValueOf;
            if (boolValueOf.booleanValue()) {
                s(a7Var);
                this.f19028w = Boolean.valueOf(a7Var.o(L().r()));
            }
        }
        return this.f19028w.booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean n() {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.C2416j3.n():boolean");
    }

    public final /* synthetic */ void o(String str, int i10, Throwable th, byte[] bArr, Map map) {
        int i11;
        if (i10 != 200 && i10 != 204) {
            i11 = 304;
            if (i10 != 304) {
                i11 = i10;
            }
            C2542z2 c2542z2 = this.f19011f;
            u(c2542z2);
            c2542z2.r().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i11), th);
        }
        i11 = i10;
        if (th == null) {
            N2 n22 = this.f19010e;
            s(n22);
            n22.f18440u.b(true);
            if (bArr == null || bArr.length == 0) {
                C2542z2 c2542z22 = this.f19011f;
                u(c2542z22);
                c2542z22.v().a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String strOptString = jSONObject.optString("deeplink", "");
                if (TextUtils.isEmpty(strOptString)) {
                    C2542z2 c2542z23 = this.f19011f;
                    u(c2542z23);
                    c2542z23.v().a("Deferred Deep Link is empty.");
                    return;
                }
                String strOptString2 = jSONObject.optString("gclid", "");
                String strOptString3 = jSONObject.optString("gbraid", "");
                String strOptString4 = jSONObject.optString("gad_source", "");
                double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                Bundle bundle = new Bundle();
                a7 a7Var = this.f19014i;
                s(a7Var);
                C2416j3 c2416j3 = a7Var.f18400a;
                if (!TextUtils.isEmpty(strOptString)) {
                    Context context = c2416j3.f19006a;
                    List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0);
                    if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
                        if (!TextUtils.isEmpty(strOptString3)) {
                            bundle.putString("gbraid", strOptString3);
                        }
                        if (!TextUtils.isEmpty(strOptString4)) {
                            bundle.putString("gad_source", strOptString4);
                        }
                        bundle.putString("gclid", strOptString2);
                        bundle.putString("_cis", "ddp");
                        this.f19018m.t("auto", "_cmp", bundle);
                        s(a7Var);
                        if (TextUtils.isEmpty(strOptString)) {
                            return;
                        }
                        try {
                            SharedPreferences.Editor editorEdit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                            editorEdit.putString("deeplink", strOptString);
                            editorEdit.putLong("timestamp", Double.doubleToRawLongBits(dOptDouble));
                            if (editorEdit.commit()) {
                                Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                Context context2 = a7Var.f18400a.f19006a;
                                if (Build.VERSION.SDK_INT < 34) {
                                    context2.sendBroadcast(intent);
                                    return;
                                } else {
                                    context2.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                    return;
                                }
                            }
                            return;
                        } catch (RuntimeException e10) {
                            C2542z2 c2542z24 = a7Var.f18400a.f19011f;
                            u(c2542z24);
                            c2542z24.o().b("Failed to persist Deferred Deep Link. exception", e10);
                            return;
                        }
                    }
                }
                C2542z2 c2542z25 = this.f19011f;
                u(c2542z25);
                c2542z25.r().d("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                return;
            } catch (JSONException e11) {
                C2542z2 c2542z26 = this.f19011f;
                u(c2542z26);
                c2542z26.o().b("Failed to parse the Deferred Deep Link response. exception", e11);
                return;
            }
        }
        C2542z2 c2542z27 = this.f19011f;
        u(c2542z27);
        c2542z27.r().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i11), th);
    }

    public final /* synthetic */ void p(Z3 z32) {
        C2384f3 c2384f3 = this.f19012g;
        u(c2384f3);
        c2384f3.h();
        C2436m c2436m = this.f19009d;
        c2436m.u();
        C c10 = new C(this);
        c10.m();
        this.f19024s = c10;
        com.google.android.gms.internal.measurement.A0 a02 = z32.f18672d;
        C2447n2 c2447n2 = new C2447n2(this, z32.f18671c, a02 == null ? 0L : a02.f29136a);
        c2447n2.k();
        this.f19025t = c2447n2;
        C2471q2 c2471q2 = new C2471q2(this);
        c2471q2.k();
        this.f19022q = c2471q2;
        U5 u52 = new U5(this);
        u52.k();
        this.f19023r = u52;
        a7 a7Var = this.f19014i;
        a7Var.n();
        this.f19010e.n();
        this.f19025t.l();
        Y4 y42 = new Y4(this);
        y42.k();
        this.f19026u = y42;
        y42.l();
        C2542z2 c2542z2 = this.f19011f;
        u(c2542z2);
        C2526x2 c2526x2U = c2542z2.u();
        c2436m.A();
        c2526x2U.b("App measurement initialized, version", 133005L);
        u(c2542z2);
        c2542z2.u().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String strQ = c2447n2.q();
        s(a7Var);
        if (a7Var.P(strQ, c2436m.R())) {
            u(c2542z2);
            c2542z2.u().a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
        } else {
            u(c2542z2);
            c2542z2.u().a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strQ)));
        }
        u(c2542z2);
        c2542z2.v().a("Debug-level message logging enabled");
        int i10 = this.f19002A;
        AtomicInteger atomicInteger = this.f19004C;
        if (i10 != atomicInteger.get()) {
            u(c2542z2);
            c2542z2.o().c("Not all components initialized", Integer.valueOf(this.f19002A), Integer.valueOf(atomicInteger.get()));
        }
        this.f19027v = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(com.google.android.gms.internal.measurement.A0 r14) {
        /*
            Method dump skipped, instruction units count: 1043
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.C2416j3.v(com.google.android.gms.internal.measurement.A0):void");
    }

    public final C2436m w() {
        return this.f19009d;
    }

    public final N2 x() {
        N2 n22 = this.f19010e;
        s(n22);
        return n22;
    }

    public final C2542z2 y() {
        C2542z2 c2542z2 = this.f19011f;
        if (c2542z2 == null || !c2542z2.k()) {
            return null;
        }
        return c2542z2;
    }

    public final C2443m6 z() {
        C2443m6 c2443m6 = this.f19013h;
        t(c2443m6);
        return c2443m6;
    }
}
