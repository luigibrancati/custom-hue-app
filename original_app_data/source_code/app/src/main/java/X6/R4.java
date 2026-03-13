package X6;

import K7.AbstractC1081v;
import K7.AbstractC1083x;
import K7.AbstractC1085z;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import b0.C2777a;
import com.google.android.gms.internal.measurement.C3213h7;
import com.google.android.gms.internal.measurement.EnumC3255m4;
import com.google.android.gms.internal.measurement.EnumC3264n4;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.sentry.protocol.App;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class R4 extends AbstractC2399h2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public F4 f18490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public W3 f18491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f18492e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f18493f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference f18494g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f18495h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f18496i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f18497j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public AbstractC2539z f18498k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AbstractC2539z f18499l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public PriorityQueue f18500m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f18501n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public S3 f18502o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AtomicLong f18503p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f18504q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i7 f18505r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f18506s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public AbstractC2539z f18507t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public SharedPreferences.OnSharedPreferenceChangeListener f18508u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public AbstractC2539z f18509v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Z6 f18510w;

    public R4(C2416j3 c2416j3) {
        super(c2416j3);
        this.f18492e = new CopyOnWriteArraySet();
        this.f18495h = new Object();
        this.f18496i = false;
        this.f18497j = 1;
        this.f18506s = true;
        this.f18510w = new C2504u4(this);
        this.f18494g = new AtomicReference();
        this.f18502o = S3.f18556c;
        this.f18504q = -1L;
        this.f18503p = new AtomicLong(0L);
        this.f18505r = new i7(c2416j3);
    }

    public final void A(String str, String str2, long j10, Object obj) {
        this.f18400a.b().t(new RunnableC2433l4(this, str, str2, obj, j10));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(java.lang.String r10, java.lang.String r11, java.lang.Object r12, long r13) {
        /*
            r9 = this;
            v6.AbstractC6056k.f(r10)
            v6.AbstractC6056k.f(r11)
            r9.h()
            r9.j()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L74
            boolean r0 = r12 instanceof java.lang.String
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L53
            r0 = r12
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L53
            java.util.Locale r11 = java.util.Locale.ENGLISH
            java.lang.String r11 = r0.toLowerCase(r11)
            r12 = 1
            java.lang.String r0 = "false"
            boolean r11 = r0.equals(r11)
            r2 = 1
            if (r12 == r11) goto L37
            r11 = 0
            goto L38
        L37:
            r11 = r2
        L38:
            X6.j3 r4 = r9.f18400a
            java.lang.Long r12 = java.lang.Long.valueOf(r11)
            X6.N2 r11 = r4.x()
            X6.M2 r11 = r11.f18433n
            long r4 = r12.longValue()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L4e
            java.lang.String r0 = "true"
        L4e:
            r11.b(r0)
        L51:
            r11 = r1
            goto L63
        L53:
            if (r12 != 0) goto L63
            X6.j3 r11 = r9.f18400a
            X6.N2 r11 = r11.x()
            X6.M2 r11 = r11.f18433n
            java.lang.String r0 = "unset"
            r11.b(r0)
            goto L51
        L63:
            X6.j3 r0 = r9.f18400a
            X6.z2 r0 = r0.a()
            X6.x2 r0 = r0.w()
            java.lang.String r1 = "Setting user property(FE)"
            java.lang.String r2 = "non_personalized_ads(_npa)"
            r0.c(r1, r2, r12)
        L74:
            r4 = r11
            r7 = r12
            X6.j3 r11 = r9.f18400a
            boolean r12 = r11.g()
            if (r12 != 0) goto L8e
            X6.j3 r9 = r9.f18400a
            X6.z2 r9 = r9.a()
            X6.x2 r9 = r9.w()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.a(r10)
            return
        L8e:
            boolean r11 = r11.m()
            if (r11 != 0) goto L95
            return
        L95:
            X6.j3 r9 = r9.f18400a
            X6.W6 r3 = new X6.W6
            r8 = r10
            r5 = r13
            r3.<init>(r4, r5, r7, r8)
            X6.U5 r9 = r9.J()
            r9.o(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.R4.B(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final Map C(String str, String str2, boolean z10) {
        C2416j3 c2416j3 = this.f18400a;
        if (c2416j3.b().p()) {
            c2416j3.a().o().a("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        c2416j3.c();
        if (C2380f.a()) {
            c2416j3.a().o().a("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f18400a.b().u(atomicReference, 5000L, "get user properties", new RunnableC2488s4(this, atomicReference, null, str, str2, z10));
        List<W6> list = (List) atomicReference.get();
        if (list == null) {
            c2416j3.a().o().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z10));
            return Collections.EMPTY_MAP;
        }
        C2777a c2777a = new C2777a(list.size());
        for (W6 w62 : list) {
            Object objD = w62.d();
            if (objD != null) {
                c2777a.put(w62.f18640b, objD);
            }
        }
        return c2777a;
    }

    public final String D() {
        return (String) this.f18494g.get();
    }

    public final void E(String str) {
        this.f18494g.set(str);
    }

    public final void F() {
        h();
        C2416j3 c2416j3 = this.f18400a;
        if (c2416j3.x().f18440u.a()) {
            c2416j3.a().v().a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long jA = c2416j3.x().f18441v.a();
        c2416j3.x().f18441v.b(1 + jA);
        c2416j3.w();
        if (jA >= 5) {
            c2416j3.a().r().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            c2416j3.x().f18440u.b(true);
        } else {
            if (this.f18507t == null) {
                this.f18507t = new C2449n4(this, this.f18400a);
            }
            this.f18507t.b(0L);
        }
    }

    public final void G(long j10) {
        this.f18494g.set(null);
        this.f18400a.b().t(new RunnableC2457o4(this, j10));
    }

    public final void H() {
        h();
        j();
        if (this.f18400a.m()) {
            C2416j3 c2416j3 = this.f18400a;
            C2436m c2436mW = c2416j3.w();
            c2436mW.f18400a.c();
            Boolean boolJ = c2436mW.J("google_analytics_deferred_deep_link_enabled");
            if (boolJ != null && boolJ.booleanValue()) {
                c2416j3.a().v().a("Deferred Deep Link feature enabled.");
                c2416j3.b().t(new Runnable() { // from class: X6.P4
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f18472a.F();
                    }
                });
            }
            this.f18400a.J().s();
            this.f18506s = false;
            N2 n2X = c2416j3.x();
            n2X.h();
            String string = n2X.p().getString("previous_os_version", null);
            n2X.f18400a.K().l();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = n2X.p().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            c2416j3.K().l();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            t("auto", "_ou", bundle);
        }
    }

    public final void I(W3 w32) {
        W3 w33;
        h();
        j();
        if (w32 != null && w32 != (w33 = this.f18491d)) {
            AbstractC6056k.q(w33 == null, "EventInterceptor already set.");
        }
        this.f18491d = w32;
    }

    public final void J(X3 x32) {
        j();
        AbstractC6056k.l(x32);
        if (this.f18492e.add(x32)) {
            return;
        }
        this.f18400a.a().r().a("OnEventListener already registered");
    }

    public final void K(X3 x32) {
        j();
        AbstractC6056k.l(x32);
        if (this.f18492e.remove(x32)) {
            return;
        }
        this.f18400a.a().r().a("OnEventListener had not been registered");
    }

    public final int L(String str) {
        AbstractC6056k.f(str);
        this.f18400a.w();
        return 25;
    }

    public final void M(Bundle bundle) {
        N(bundle, this.f18400a.e().a());
    }

    public final void N(Bundle bundle, long j10) {
        AbstractC6056k.l(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.f18400a.a().r().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        AbstractC6056k.l(bundle2);
        O3.b(bundle2, "app_id", String.class, null);
        O3.b(bundle2, "origin", String.class, null);
        O3.b(bundle2, "name", String.class, null);
        O3.b(bundle2, "value", Object.class, null);
        O3.b(bundle2, "trigger_event_name", String.class, null);
        O3.b(bundle2, "trigger_timeout", Long.class, 0L);
        O3.b(bundle2, "timed_out_event_name", String.class, null);
        O3.b(bundle2, "timed_out_event_params", Bundle.class, null);
        O3.b(bundle2, "triggered_event_name", String.class, null);
        O3.b(bundle2, "triggered_event_params", Bundle.class, null);
        O3.b(bundle2, "time_to_live", Long.class, 0L);
        O3.b(bundle2, "expired_event_name", String.class, null);
        O3.b(bundle2, "expired_event_params", Bundle.class, null);
        AbstractC6056k.f(bundle2.getString("name"));
        AbstractC6056k.f(bundle2.getString("origin"));
        AbstractC6056k.l(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j10);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        C2416j3 c2416j3 = this.f18400a;
        if (c2416j3.C().y0(string) != 0) {
            c2416j3.a().o().b("Invalid conditional user property name", c2416j3.D().c(string));
            return;
        }
        if (c2416j3.C().y(string, obj) != 0) {
            c2416j3.a().o().c("Invalid conditional user property value", c2416j3.D().c(string), obj);
            return;
        }
        Object objZ = c2416j3.C().z(string, obj);
        if (objZ == null) {
            c2416j3.a().o().c("Unable to normalize conditional user property value", c2416j3.D().c(string), obj);
            return;
        }
        O3.a(bundle2, objZ);
        long j11 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
            c2416j3.w();
            if (j11 > 15552000000L || j11 < 1) {
                c2416j3.a().o().c("Invalid conditional user property timeout", c2416j3.D().c(string), Long.valueOf(j11));
                return;
            }
        }
        long j12 = bundle2.getLong("time_to_live");
        c2416j3.w();
        if (j12 > 15552000000L || j12 < 1) {
            c2416j3.a().o().c("Invalid conditional user property time to live", c2416j3.D().c(string), Long.valueOf(j12));
        } else {
            c2416j3.b().t(new RunnableC2465p4(this, bundle2));
        }
    }

    public final void O(String str, String str2, Bundle bundle) {
        C2416j3 c2416j3 = this.f18400a;
        long jA = c2416j3.e().a();
        AbstractC6056k.f(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jA);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        c2416j3.b().t(new RunnableC2473q4(this, bundle2));
    }

    public final ArrayList P(String str, String str2) {
        C2416j3 c2416j3 = this.f18400a;
        if (c2416j3.b().p()) {
            c2416j3.a().o().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        c2416j3.c();
        if (C2380f.a()) {
            c2416j3.a().o().a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f18400a.b().u(atomicReference, 5000L, "get conditional user properties", new RunnableC2480r4(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return a7.h0(list);
        }
        c2416j3.a().o().b("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    public final String Q() {
        C2362c5 c2362c5U = this.f18400a.I().u();
        if (c2362c5U != null) {
            return c2362c5U.f18731a;
        }
        return null;
    }

    public final String R() {
        C2362c5 c2362c5U = this.f18400a.I().u();
        if (c2362c5U != null) {
            return c2362c5U.f18732b;
        }
        return null;
    }

    public final String S() {
        try {
            return AbstractC2354b5.a(this.f18400a.d(), "google_app_id", this.f18400a.H());
        } catch (IllegalStateException e10) {
            this.f18400a.a().o().b("getGoogleAppId failed with exception", e10);
            return null;
        }
    }

    public final /* synthetic */ void T(SharedPreferences sharedPreferences, String str) {
        C2416j3 c2416j3 = this.f18400a;
        if (!c2416j3.w().H(null, AbstractC2383f2.f18871a1)) {
            if (Objects.equals(str, "IABTCF_TCString")) {
                c2416j3.a().w().a("IABTCF_TCString change picked up in listener.");
                ((AbstractC2539z) AbstractC6056k.l(this.f18509v)).b(500L);
                return;
            }
            return;
        }
        if (Objects.equals(str, "IABTCF_TCString") || Objects.equals(str, "IABTCF_gdprApplies") || Objects.equals(str, "IABTCF_EnableAdvertiserConsentMode")) {
            c2416j3.a().w().a("IABTCF_TCString change picked up in listener.");
            ((AbstractC2539z) AbstractC6056k.l(this.f18509v)).b(500L);
        }
    }

    public final /* synthetic */ void U(Bundle bundle) {
        Bundle bundle2;
        int i10;
        if (bundle.isEmpty()) {
            bundle2 = bundle;
        } else {
            C2416j3 c2416j3 = this.f18400a;
            bundle2 = new Bundle(c2416j3.x().f18445z.a());
            Iterator<String> it = bundle.keySet().iterator();
            while (true) {
                i10 = 0;
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                Object obj = bundle.get(next);
                if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                    if (c2416j3.C().B0(obj)) {
                        c2416j3.C().B(this.f18510w, null, 27, null, null, 0);
                    }
                    c2416j3.a().t().c("Invalid default event parameter type. Name, value", next, obj);
                } else if (a7.N(next)) {
                    c2416j3.a().t().b("Invalid default event parameter name. Name", next);
                } else if (obj == null) {
                    bundle2.remove(next);
                } else if (c2416j3.C().C0("param", next, c2416j3.w().x(null, false), obj)) {
                    c2416j3.C().A(bundle2, next, obj);
                }
            }
            c2416j3.C();
            int iV = c2416j3.w().v();
            if (bundle2.size() > iV) {
                for (String str : new TreeSet(bundle2.keySet())) {
                    i10++;
                    if (i10 > iV) {
                        bundle2.remove(str);
                    }
                }
                c2416j3.C().B(this.f18510w, null, 26, null, null, 0);
                c2416j3.a().t().a("Too many default event parameters set. Discarding beyond event parameter limit");
            }
        }
        C2416j3 c2416j32 = this.f18400a;
        c2416j32.x().f18445z.b(bundle2);
        if (!bundle.isEmpty() || c2416j32.w().H(null, AbstractC2383f2.f18864X0)) {
            this.f18400a.J().v(bundle2);
        }
    }

    public final /* synthetic */ void V(int i10) {
        if (this.f18498k == null) {
            this.f18498k = new C2377e4(this, this.f18400a);
        }
        this.f18498k.b(((long) i10) * 1000);
    }

    public final /* synthetic */ void W(Boolean bool, boolean z10) {
        f0(bool, true);
    }

    public final /* synthetic */ void X(S3 s32, long j10, boolean z10, boolean z11) {
        h();
        j();
        C2416j3 c2416j3 = this.f18400a;
        S3 s3W = c2416j3.x().w();
        if (j10 <= this.f18504q && S3.u(s3W.b(), s32.b())) {
            c2416j3.a().u().b("Dropped out-of-date consent setting, proposed settings", s32);
            return;
        }
        N2 n2X = c2416j3.x();
        C2416j3 c2416j32 = n2X.f18400a;
        n2X.h();
        int iB = s32.b();
        if (!n2X.v(iB)) {
            c2416j3.a().u().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(s32.b()));
            return;
        }
        C2416j3 c2416j33 = this.f18400a;
        SharedPreferences.Editor editorEdit = n2X.p().edit();
        editorEdit.putString("consent_settings", s32.l());
        editorEdit.putInt("consent_source", iB);
        editorEdit.apply();
        c2416j3.a().w().b("Setting storage consent(FE)", s32);
        this.f18504q = j10;
        if (c2416j33.J().D()) {
            c2416j33.J().Z(z10);
        } else {
            c2416j33.J().Y(z10);
        }
        if (z11) {
            c2416j33.J().q(new AtomicReference());
        }
    }

    public final /* synthetic */ void Z(boolean z10) {
        this.f18496i = false;
    }

    public final /* synthetic */ int a0() {
        return this.f18497j;
    }

    public final /* synthetic */ void b0(int i10) {
        this.f18497j = i10;
    }

    public final /* synthetic */ AbstractC2539z c0() {
        return this.f18507t;
    }

    public final /* synthetic */ int d0(Throwable th) {
        String message = th.getMessage();
        this.f18501n = false;
        if (message == null) {
            return 2;
        }
        if (!(th instanceof IllegalStateException) && !message.contains("garbage collected") && !th.getClass().getSimpleName().equals("ServiceUnavailableException")) {
            return (!(th instanceof SecurityException) || message.endsWith("READ_DEVICE_CONFIG")) ? 2 : 3;
        }
        if (!message.contains("Background")) {
            return 1;
        }
        this.f18501n = true;
        return 1;
    }

    public final Z4 e0(final C2522w6 c2522w6) {
        try {
            URL url = new URI(c2522w6.f19294c).toURL();
            final AtomicReference atomicReference = new AtomicReference();
            String strS = this.f18400a.L().s();
            C2416j3 c2416j3 = this.f18400a;
            C2526x2 c2526x2W = c2416j3.a().w();
            Long lValueOf = Long.valueOf(c2522w6.f19292a);
            c2526x2W.d("[sgtm] Uploading data from app. row_id, url, uncompressed size", lValueOf, c2522w6.f19294c, Integer.valueOf(c2522w6.f19293b.length));
            if (!TextUtils.isEmpty(c2522w6.f19298g)) {
                c2416j3.a().w().c("[sgtm] Uploading data from app. row_id", lValueOf, c2522w6.f19298g);
            }
            HashMap map = new HashMap();
            Bundle bundle = c2522w6.f19295d;
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (!TextUtils.isEmpty(string)) {
                    map.put(str, string);
                }
            }
            W4 w4F = c2416j3.F();
            byte[] bArr = c2522w6.f19293b;
            T4 t42 = new T4() { // from class: X6.G4
                /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
                /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
                @Override // X6.T4
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final /* synthetic */ void a(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map r11) {
                    /*
                        r6 = this;
                        X6.R4 r7 = r6.f18319a
                        r7.h()
                        X6.w6 r10 = r3
                        r11 = 200(0xc8, float:2.8E-43)
                        if (r8 == r11) goto L14
                        r11 = 204(0xcc, float:2.86E-43)
                        if (r8 == r11) goto L14
                        r11 = 304(0x130, float:4.26E-43)
                        if (r8 != r11) goto L2e
                        r8 = r11
                    L14:
                        if (r9 != 0) goto L2e
                        X6.j3 r8 = r7.f18400a
                        X6.z2 r8 = r8.a()
                        X6.x2 r8 = r8.w()
                        long r0 = r10.f19292a
                        java.lang.Long r9 = java.lang.Long.valueOf(r0)
                        java.lang.String r11 = "[sgtm] Upload succeeded for row_id"
                        r8.b(r11, r9)
                        X6.Z4 r8 = X6.Z4.SUCCESS
                        goto L69
                    L2e:
                        X6.j3 r11 = r7.f18400a
                        X6.z2 r11 = r11.a()
                        X6.x2 r11 = r11.r()
                        long r0 = r10.f19292a
                        java.lang.Long r0 = java.lang.Long.valueOf(r0)
                        java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
                        java.lang.String r2 = "[sgtm] Upload failed for row_id. response, exception"
                        r11.d(r2, r0, r1, r9)
                        X6.e2 r9 = X6.AbstractC2383f2.f18921u
                        r11 = 0
                        java.lang.Object r9 = r9.b(r11)
                        java.lang.String r9 = (java.lang.String) r9
                        java.lang.String r11 = ","
                        java.lang.String[] r9 = r9.split(r11)
                        java.util.List r9 = java.util.Arrays.asList(r9)
                        java.lang.String r8 = java.lang.String.valueOf(r8)
                        boolean r8 = r9.contains(r8)
                        if (r8 == 0) goto L67
                        X6.Z4 r8 = X6.Z4.BACKOFF
                        goto L69
                    L67:
                        X6.Z4 r8 = X6.Z4.FAILURE
                    L69:
                        java.util.concurrent.atomic.AtomicReference r6 = r2
                        X6.j3 r9 = r7.f18400a
                        X6.U5 r9 = r9.J()
                        X6.g r0 = new X6.g
                        long r1 = r10.f19292a
                        int r3 = r8.zza()
                        long r4 = r10.f19297f
                        r0.<init>(r1, r3, r4)
                        r9.k0(r0)
                        X6.j3 r7 = r7.f18400a
                        X6.z2 r7 = r7.a()
                        X6.x2 r7 = r7.w()
                        java.lang.Long r9 = java.lang.Long.valueOf(r1)
                        java.lang.String r10 = "[sgtm] Updated status for row_id"
                        r7.c(r10, r9, r8)
                        monitor-enter(r6)
                        r6.set(r8)     // Catch: java.lang.Throwable -> L9d
                        r6.notifyAll()     // Catch: java.lang.Throwable -> L9d
                        monitor-exit(r6)     // Catch: java.lang.Throwable -> L9d
                        return
                    L9d:
                        r0 = move-exception
                        r7 = r0
                        monitor-exit(r6)     // Catch: java.lang.Throwable -> L9d
                        throw r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X6.G4.a(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
                }
            };
            w4F.l();
            AbstractC6056k.l(url);
            AbstractC6056k.l(bArr);
            AbstractC6056k.l(t42);
            w4F.f18400a.b().w(new V4(w4F, strS, url, bArr, map, t42));
            try {
                C2416j3 c2416j32 = c2416j3.C().f18400a;
                long jA = c2416j32.e().a() + 60000;
                synchronized (atomicReference) {
                    for (long jA2 = 60000; atomicReference.get() == null && jA2 > 0; jA2 = jA - c2416j32.e().a()) {
                        try {
                            atomicReference.wait(jA2);
                        } finally {
                        }
                    }
                }
            } catch (InterruptedException unused) {
                this.f18400a.a().r().a("[sgtm] Interrupted waiting for uploading batch");
            }
            return atomicReference.get() == null ? Z4.UNKNOWN : (Z4) atomicReference.get();
        } catch (MalformedURLException | URISyntaxException e10) {
            this.f18400a.a().o().d("[sgtm] Bad upload url for row_id", c2522w6.f19294c, Long.valueOf(c2522w6.f19292a), e10);
            return Z4.FAILURE;
        }
    }

    public final void f0(Boolean bool, boolean z10) {
        h();
        j();
        C2416j3 c2416j3 = this.f18400a;
        c2416j3.a().v().b("Setting app measurement enabled (FE)", bool);
        c2416j3.x().s(bool);
        if (z10) {
            N2 n2X = c2416j3.x();
            C2416j3 c2416j32 = n2X.f18400a;
            n2X.h();
            SharedPreferences.Editor editorEdit = n2X.p().edit();
            if (bool != null) {
                editorEdit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit.remove("measurement_enabled_from_api");
            }
            editorEdit.apply();
        }
        if (this.f18400a.j() || !(bool == null || bool.booleanValue())) {
            Y();
        }
    }

    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public final void Y() {
        R4 r42;
        h();
        C2416j3 c2416j3 = this.f18400a;
        String strA = c2416j3.x().f18433n.a();
        if (strA == null) {
            r42 = this;
        } else if ("unset".equals(strA)) {
            r42 = this;
            r42.B(App.TYPE, "_npa", null, c2416j3.e().a());
        } else {
            r42 = this;
            r42.B(App.TYPE, "_npa", Long.valueOf(true != "true".equals(strA) ? 0L : 1L), c2416j3.e().a());
        }
        if (!r42.f18400a.g() || !r42.f18506s) {
            c2416j3.a().v().a("Updating Scion state (FE)");
            r42.f18400a.J().X();
        } else {
            c2416j3.a().v().a("Recording app launch after enabling measurement for the first time (FE)");
            r42.H();
            r42.f18400a.z().f19105e.a();
            c2416j3.b().t(new RunnableC2393g4(r42));
        }
    }

    public final void h0() {
        C2416j3 c2416j3 = this.f18400a;
        if (!(c2416j3.d().getApplicationContext() instanceof Application) || this.f18490c == null) {
            return;
        }
        ((Application) c2416j3.d().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f18490c);
    }

    public final Boolean i0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.f18400a.b().u(atomicReference, 15000L, "boolean test flag value", new RunnableC2441m4(this, atomicReference));
    }

    public final String j0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.f18400a.b().u(atomicReference, 15000L, "String test flag value", new RunnableC2512v4(this, atomicReference));
    }

    public final Long k0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.f18400a.b().u(atomicReference, 15000L, "long test flag value", new RunnableC2520w4(this, atomicReference));
    }

    public final Integer l0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.f18400a.b().u(atomicReference, 15000L, "int test flag value", new RunnableC2528x4(this, atomicReference));
    }

    @Override // X6.AbstractC2399h2
    public final boolean m() {
        return false;
    }

    public final Double m0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.f18400a.b().u(atomicReference, 15000L, "double test flag value", new RunnableC2536y4(this, atomicReference));
    }

    public final void n0(Boolean bool) {
        j();
        this.f18400a.b().t(new RunnableC2544z4(this, bool));
    }

    public final void o(S3 s32) {
        h();
        boolean z10 = (s32.o(R3.ANALYTICS_STORAGE) && s32.o(R3.AD_STORAGE)) || this.f18400a.J().C();
        C2416j3 c2416j3 = this.f18400a;
        if (z10 != c2416j3.j()) {
            c2416j3.i(z10);
            N2 n2X = this.f18400a.x();
            C2416j3 c2416j32 = n2X.f18400a;
            n2X.h();
            Boolean boolValueOf = n2X.p().contains("measurement_enabled_from_api") ? Boolean.valueOf(n2X.p().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z10 || boolValueOf == null || boolValueOf.booleanValue()) {
                f0(Boolean.valueOf(z10), false);
            }
        }
    }

    public final void o0(Bundle bundle, int i10, long j10) {
        Object obj;
        String string;
        j();
        S3 s32 = S3.f18556c;
        R3[] r3ArrB = Q3.STORAGE.b();
        int length = r3ArrB.length;
        int i11 = 0;
        while (true) {
            obj = null;
            if (i11 >= length) {
                break;
            }
            String str = r3ArrB[i11].zze;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                if (string.equals("granted")) {
                    obj = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    obj = Boolean.FALSE;
                }
                if (obj == null) {
                    obj = string;
                    break;
                }
            }
            i11++;
        }
        if (obj != null) {
            C2416j3 c2416j3 = this.f18400a;
            c2416j3.a().t().b("Ignoring invalid consent setting", obj);
            c2416j3.a().t().a("Valid consent values are 'granted', 'denied'");
        }
        boolean zP = this.f18400a.b().p();
        S3 s3E = S3.e(bundle, i10);
        if (s3E.c()) {
            q0(s3E, zP);
        }
        A aH = A.h(bundle, i10);
        if (aH.d()) {
            p0(aH, zP);
        }
        Boolean boolI = A.i(bundle);
        if (boolI != null) {
            String str2 = i10 == -30 ? "tcf" : App.TYPE;
            if (zP) {
                B(str2, "allow_personalized_ads", boolI.toString(), j10);
            } else {
                z(str2, "allow_personalized_ads", boolI.toString(), false, j10);
            }
        }
    }

    public final void p(String str, String str2, Bundle bundle) {
        q(str, str2, bundle, true, true, this.f18400a.e().a());
    }

    public final void p0(A a10, boolean z10) {
        A4 a42 = new A4(this, a10);
        if (!z10) {
            this.f18400a.b().t(a42);
        } else {
            h();
            a42.run();
        }
    }

    public final void q(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        if (Objects.equals(str2, "screen_view")) {
            this.f18400a.I().s(bundle2, j10);
            return;
        }
        boolean z12 = true;
        if (z11 && this.f18491d != null && !a7.N(str2)) {
            z12 = false;
        }
        boolean z13 = z12;
        if (str == null) {
            str = App.TYPE;
        }
        x(str, str2, j10, bundle2, z11, z13, z10, null);
    }

    public final void q0(S3 s32, boolean z10) {
        boolean z11;
        boolean zR;
        boolean z12;
        S3 s33;
        j();
        int iB = s32.b();
        if (iB != -10) {
            P3 p3P = s32.p();
            P3 p32 = P3.UNINITIALIZED;
            if (p3P == p32 && s32.q() == p32) {
                this.f18400a.a().t().a("Ignoring empty consent settings");
                return;
            }
        }
        synchronized (this.f18495h) {
            try {
                z11 = false;
                if (S3.u(iB, this.f18502o.b())) {
                    zR = s32.r(this.f18502o);
                    R3 r32 = R3.ANALYTICS_STORAGE;
                    if (s32.o(r32) && !this.f18502o.o(r32)) {
                        z11 = true;
                    }
                    s32 = s32.t(this.f18502o);
                    this.f18502o = s32;
                    z12 = z11;
                    z11 = true;
                } else {
                    zR = false;
                    z12 = false;
                }
                s33 = s32;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z11) {
            this.f18400a.a().u().b("Ignoring lower-priority consent settings, proposed settings", s33);
            return;
        }
        long andIncrement = this.f18503p.getAndIncrement();
        if (zR) {
            this.f18494g.set(null);
            B4 b42 = new B4(this, s33, andIncrement, z12);
            if (!z10) {
                this.f18400a.b().v(b42);
                return;
            } else {
                h();
                b42.run();
                return;
            }
        }
        C4 c42 = new C4(this, s33, andIncrement, z12);
        if (z10) {
            h();
            c42.run();
        } else if (iB == 30 || iB == -10) {
            this.f18400a.b().v(c42);
        } else {
            this.f18400a.b().t(c42);
        }
    }

    public final void r() {
        C2416j3 c2416j3;
        C2451n6 c2451n6;
        C2451n6 c2451n62;
        EnumC3264n4 enumC3264n4;
        h();
        C2416j3 c2416j32 = this.f18400a;
        c2416j32.a().v().a("Handle tcf update.");
        SharedPreferences sharedPreferencesQ = c2416j32.x().q();
        HashMap map = new HashMap();
        C2375e2 c2375e2 = AbstractC2383f2.f18871a1;
        if (((Boolean) c2375e2.b(null)).booleanValue()) {
            AbstractC1081v abstractC1081v = AbstractC2467p6.f19159a;
            EnumC3255m4 enumC3255m4 = EnumC3255m4.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
            EnumC2459o6 enumC2459o6 = EnumC2459o6.CONSENT;
            Map.Entry entry = Map.entry(enumC3255m4, enumC2459o6);
            int i10 = 2;
            EnumC3255m4 enumC3255m42 = EnumC3255m4.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
            int i11 = 1;
            EnumC2459o6 enumC2459o62 = EnumC2459o6.FLEXIBLE_LEGITIMATE_INTEREST;
            c2416j3 = c2416j32;
            AbstractC1083x abstractC1083xN = AbstractC1083x.n(entry, Map.entry(enumC3255m42, enumC2459o62), Map.entry(EnumC3255m4.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE, enumC2459o6), Map.entry(EnumC3255m4.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS, enumC2459o6), Map.entry(EnumC3255m4.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE, enumC2459o62), Map.entry(EnumC3255m4.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS, enumC2459o62), Map.entry(EnumC3255m4.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS, enumC2459o62));
            AbstractC1085z abstractC1085zZ = AbstractC1085z.z("CH");
            char[] cArr = new char[5];
            boolean zContains = sharedPreferencesQ.contains("IABTCF_TCString");
            int iB = AbstractC2467p6.b(sharedPreferencesQ, "IABTCF_CmpSdkID");
            int iB2 = AbstractC2467p6.b(sharedPreferencesQ, "IABTCF_PolicyVersion");
            int iB3 = AbstractC2467p6.b(sharedPreferencesQ, "IABTCF_gdprApplies");
            int iB4 = AbstractC2467p6.b(sharedPreferencesQ, "IABTCF_PurposeOneTreatment");
            int iB5 = AbstractC2467p6.b(sharedPreferencesQ, "IABTCF_EnableAdvertiserConsentMode");
            String strA = AbstractC2467p6.a(sharedPreferencesQ, "IABTCF_PublisherCC");
            AbstractC1083x.a aVarA = AbstractC1083x.a();
            K7.Y it = abstractC1083xN.keySet().iterator();
            while (it.hasNext()) {
                EnumC3255m4 enumC3255m43 = (EnumC3255m4) it.next();
                int iZza = enumC3255m43.zza();
                StringBuilder sb2 = new StringBuilder(String.valueOf(iZza).length() + 28);
                sb2.append("IABTCF_PublisherRestrictions");
                sb2.append(iZza);
                String strA2 = AbstractC2467p6.a(sharedPreferencesQ, sb2.toString());
                if (TextUtils.isEmpty(strA2) || strA2.length() < 755) {
                    enumC3264n4 = EnumC3264n4.PURPOSE_RESTRICTION_UNDEFINED;
                } else {
                    int iDigit = Character.digit(strA2.charAt(754), 10);
                    enumC3264n4 = (iDigit < 0 || iDigit > EnumC3264n4.values().length || iDigit == 0) ? EnumC3264n4.PURPOSE_RESTRICTION_NOT_ALLOWED : iDigit != i11 ? iDigit != i10 ? EnumC3264n4.PURPOSE_RESTRICTION_UNDEFINED : EnumC3264n4.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST : EnumC3264n4.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                }
                aVarA.f(enumC3255m43, enumC3264n4);
                i10 = 2;
                i11 = 1;
            }
            AbstractC1083x abstractC1083xC = aVarA.c();
            String strA3 = AbstractC2467p6.a(sharedPreferencesQ, "IABTCF_PurposeConsents");
            String strA4 = AbstractC2467p6.a(sharedPreferencesQ, "IABTCF_VendorConsents");
            boolean z10 = !TextUtils.isEmpty(strA4) && strA4.length() >= 755 && strA4.charAt(754) == '1';
            String strA5 = AbstractC2467p6.a(sharedPreferencesQ, "IABTCF_PurposeLegitimateInterests");
            String strA6 = AbstractC2467p6.a(sharedPreferencesQ, "IABTCF_VendorLegitimateInterests");
            boolean z11 = !TextUtils.isEmpty(strA6) && strA6.length() >= 755 && strA6.charAt(754) == '1';
            cArr[0] = '2';
            c2451n6 = new C2451n6(AbstractC2467p6.d(abstractC1083xN, abstractC1083xC, abstractC1085zZ, cArr, iB, iB5, iB3, iB2, iB4, strA, strA3, strA5, z10, z11, zContains));
        } else {
            c2416j3 = c2416j32;
            String strA7 = AbstractC2467p6.a(sharedPreferencesQ, "IABTCF_VendorConsents");
            if (!"".equals(strA7) && strA7.length() > 754) {
                map.put("GoogleConsent", String.valueOf(strA7.charAt(754)));
            }
            int iB6 = AbstractC2467p6.b(sharedPreferencesQ, "IABTCF_gdprApplies");
            if (iB6 != -1) {
                map.put("gdprApplies", String.valueOf(iB6));
            }
            int iB7 = AbstractC2467p6.b(sharedPreferencesQ, "IABTCF_EnableAdvertiserConsentMode");
            if (iB7 != -1) {
                map.put("EnableAdvertiserConsentMode", String.valueOf(iB7));
            }
            int iB8 = AbstractC2467p6.b(sharedPreferencesQ, "IABTCF_PolicyVersion");
            if (iB8 != -1) {
                map.put("PolicyVersion", String.valueOf(iB8));
            }
            String strA8 = AbstractC2467p6.a(sharedPreferencesQ, "IABTCF_PurposeConsents");
            if (!"".equals(strA8)) {
                map.put("PurposeConsents", strA8);
            }
            int iB9 = AbstractC2467p6.b(sharedPreferencesQ, "IABTCF_CmpSdkID");
            if (iB9 != -1) {
                map.put("CmpSdkID", String.valueOf(iB9));
            }
            c2451n6 = new C2451n6(map);
        }
        c2416j3.a().w().b("Tcf preferences read", c2451n6);
        if (!c2416j3.w().H(null, c2375e2)) {
            if (c2416j3.x().x(c2451n6)) {
                Bundle bundleB = c2451n6.b();
                c2416j3.a().w().b("Consent generated from Tcf", bundleB);
                if (bundleB != Bundle.EMPTY) {
                    o0(bundleB, -30, c2416j3.e().a());
                }
                Bundle bundle = new Bundle();
                bundle.putString("_tcfd", c2451n6.e());
                t("auto", "_tcf", bundle);
                return;
            }
            return;
        }
        N2 n2X = c2416j3.x();
        n2X.h();
        String string = n2X.p().getString("stored_tcf_param", "");
        HashMap map2 = new HashMap();
        if (TextUtils.isEmpty(string)) {
            c2451n62 = new C2451n6(map2);
        } else {
            for (String str : string.split(";")) {
                String[] strArrSplit = str.split("=");
                if (strArrSplit.length >= 2 && AbstractC2467p6.f19159a.contains(strArrSplit[0])) {
                    map2.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            c2451n62 = new C2451n6(map2);
        }
        if (c2416j3.x().x(c2451n6)) {
            Bundle bundleB2 = c2451n6.b();
            c2416j3.a().w().b("Consent generated from Tcf", bundleB2);
            if (bundleB2 != Bundle.EMPTY) {
                o0(bundleB2, -30, c2416j3.e().a());
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_tcfm", c2451n6.d(c2451n62));
            bundle2.putString("_tcfd2", c2451n6.c());
            bundle2.putString("_tcfd", c2451n6.e());
            t("auto", "_tcf", bundle2);
        }
    }

    public final void r0(Runnable runnable) {
        j();
        C2416j3 c2416j3 = this.f18400a;
        if (c2416j3.b().p()) {
            c2416j3.a().o().a("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        if (c2416j3.b().q()) {
            c2416j3.a().o().a("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        c2416j3.c();
        if (C2380f.a()) {
            c2416j3.a().o().a("Cannot retrieve and upload batches from main thread");
            return;
        }
        c2416j3.a().w().a("[sgtm] Started client-side batch upload work.");
        boolean z10 = false;
        int size = 0;
        int i10 = 0;
        while (!z10) {
            c2416j3.a().w().a("[sgtm] Getting upload batches from service (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            c2416j3.b().u(atomicReference, 10000L, "[sgtm] Getting upload batches", new Runnable() { // from class: X6.Q4
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f18481a.f18400a.J().j0(atomicReference, C2538y6.d(EnumC2346a5.SGTM_CLIENT));
                }
            });
            A6 a62 = (A6) atomicReference.get();
            if (a62 == null) {
                break;
            }
            List list = a62.f18156a;
            if (!list.isEmpty()) {
                c2416j3.a().w().b("[sgtm] Retrieved upload batches. count", Integer.valueOf(list.size()));
                size += list.size();
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = false;
                        break;
                    }
                    Z4 z4E0 = e0((C2522w6) it.next());
                    if (z4E0 == Z4.SUCCESS) {
                        i10++;
                    } else if (z4E0 == Z4.BACKOFF) {
                        z10 = true;
                        break;
                    }
                }
            } else {
                break;
            }
        }
        c2416j3.a().w().c("[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(size), Integer.valueOf(i10));
        runnable.run();
    }

    public final void s() {
        h();
        C2416j3 c2416j3 = this.f18400a;
        c2416j3.a().v().a("Register tcfPrefChangeListener.");
        if (this.f18508u == null) {
            this.f18509v = new C2417j4(this, this.f18400a);
            this.f18508u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: X6.M4
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    this.f18415a.T(sharedPreferences, str);
                }
            };
        }
        c2416j3.x().q().registerOnSharedPreferenceChangeListener(this.f18508u);
    }

    public final void s0(long j10) {
        h();
        if (this.f18499l == null) {
            this.f18499l = new C2353b4(this, this.f18400a);
        }
        this.f18499l.b(j10);
    }

    public final void t(String str, String str2, Bundle bundle) {
        h();
        u(str, str2, this.f18400a.e().a(), bundle);
    }

    public final void t0() {
        h();
        AbstractC2539z abstractC2539z = this.f18499l;
        if (abstractC2539z != null) {
            abstractC2539z.d();
        }
    }

    public final void u(String str, String str2, long j10, Bundle bundle) {
        h();
        boolean z10 = true;
        if (this.f18491d != null && !a7.N(str2)) {
            z10 = false;
        }
        v(str, str2, j10, bundle, true, z10, true, null);
    }

    public final void u0() {
        C3213h7.a();
        C2416j3 c2416j3 = this.f18400a;
        if (c2416j3.w().H(null, AbstractC2383f2.f18852R0)) {
            if (c2416j3.b().p()) {
                c2416j3.a().o().a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            c2416j3.c();
            if (C2380f.a()) {
                c2416j3.a().o().a("Cannot get trigger URIs from main thread");
                return;
            }
            j();
            c2416j3.a().w().a("Getting trigger URIs (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            c2416j3.b().u(atomicReference, 10000L, "get trigger URIs", new Runnable() { // from class: X6.I4
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    R4 r42 = this.f18357a;
                    r42.f18400a.J().i0(atomicReference, r42.f18400a.x().f18434o.a());
                }
            });
            final List list = (List) atomicReference.get();
            if (list == null) {
                c2416j3.a().q().a("Timed out waiting for get trigger URIs");
            } else {
                c2416j3.b().t(new Runnable() { // from class: X6.J4
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        R4 r42 = this.f18372a;
                        r42.h();
                        List<C2482r6> list2 = list;
                        SparseArray sparseArrayR = r42.f18400a.x().r();
                        for (C2482r6 c2482r6 : list2) {
                            int i10 = c2482r6.f19194c;
                            if (!sparseArrayR.contains(i10) || ((Long) sparseArrayR.get(i10)).longValue() < c2482r6.f19193b) {
                                r42.w0().add(c2482r6);
                            }
                        }
                        r42.x0();
                    }
                });
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        boolean z13;
        int i10;
        C2416j3 c2416j3;
        long j11;
        long j12;
        String str4;
        long j13;
        Bundle[] bundleArr;
        String str5 = str;
        AbstractC6056k.f(str5);
        AbstractC6056k.l(bundle);
        h();
        j();
        C2416j3 c2416j32 = this.f18400a;
        if (!c2416j32.g()) {
            this.f18400a.a().v().a("Event not sent since app measurement is disabled");
            return;
        }
        List listW = this.f18400a.L().w();
        if (listW != null && !listW.contains(str2)) {
            this.f18400a.a().v().c("Dropping non-safelisted event. event name, origin", str2, str5);
            return;
        }
        if (!this.f18493f) {
            this.f18493f = true;
            try {
                try {
                    (!c2416j32.G() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.f18400a.d().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, this.f18400a.d());
                } catch (Exception e10) {
                    this.f18400a.a().r().b("Failed to invoke Tag Manager's initialize() method", e10);
                }
            } catch (ClassNotFoundException unused) {
                this.f18400a.a().u().a("Tag Manager is not found and thus will not be used");
            }
        }
        C2416j3 c2416j33 = this.f18400a;
        if (!c2416j33.w().H(null, AbstractC2383f2.f18889g1) && "_cmp".equals(str2) && bundle.containsKey("gclid")) {
            c2416j33.c();
            B("auto", "_lgclid", bundle.getString("gclid"), c2416j33.e().a());
        }
        R4 r42 = this;
        c2416j33.c();
        if (z10 && a7.U(str2)) {
            c2416j33.C().w(bundle, c2416j33.x().f18445z.a());
        }
        if (!z12) {
            c2416j33.c();
            if (!"_iap".equals(str2)) {
                C2416j3 c2416j34 = r42.f18400a;
                a7 a7VarC = c2416j34.C();
                int i11 = 2;
                if (a7VarC.t0("event", str2)) {
                    if (a7VarC.v0("event", T3.f18567a, T3.f18568b, str2)) {
                        a7VarC.f18400a.w();
                        if (a7VarC.w0("event", 40, str2)) {
                            i11 = 0;
                        }
                    } else {
                        i11 = 13;
                    }
                }
                if (i11 != 0) {
                    c2416j33.a().q().b("Invalid public event name. Event will not be logged (FE)", c2416j33.D().a(str2));
                    a7 a7VarC2 = c2416j34.C();
                    c2416j34.w();
                    c2416j34.C().B(r42.f18510w, null, i11, "_ev", a7VarC2.q(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
            }
        }
        c2416j33.c();
        C2416j3 c2416j35 = r42.f18400a;
        C2362c5 c2362c5Q = c2416j35.I().q(false);
        if (c2362c5Q != null && !bundle.containsKey("_sc")) {
            c2362c5Q.f18734d = true;
        }
        a7.k0(c2362c5Q, bundle, z10 && !z12);
        boolean zEquals = "am".equals(str5);
        boolean zN = a7.N(str2);
        if (!z10 || r42.f18491d == null || zN) {
            z13 = zEquals;
        } else {
            if (!zEquals) {
                c2416j33.a().v().c("Passing event to registered event handler (FE)", c2416j33.D().a(str2), c2416j33.D().e(bundle));
                AbstractC6056k.l(r42.f18491d);
                r42.f18491d.a(str5, str2, bundle, j10);
                return;
            }
            z13 = true;
        }
        C2416j3 c2416j36 = r42.f18400a;
        if (c2416j36.m()) {
            int iX0 = c2416j33.C().x0(str2);
            if (iX0 != 0) {
                c2416j33.a().q().b("Invalid event name. Event will not be logged (FE)", c2416j33.D().a(str2));
                a7 a7VarC3 = c2416j33.C();
                c2416j33.w();
                c2416j36.C().B(r42.f18510w, str3, iX0, "_ev", a7VarC3.q(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
            Bundle bundleT = c2416j33.C().t(str3, str2, bundle, B6.f.b("_o", "_sn", "_sc", "_si"), z12);
            AbstractC6056k.l(bundleT);
            c2416j33.c();
            if (c2416j35.I().q(false) == null || !Constants.FIREBASE_APPLICATION_EXCEPTION.equals(str2)) {
                i10 = 0;
                c2416j3 = c2416j35;
                j11 = 0;
            } else {
                C2427k6 c2427k6 = c2416j35.z().f19106f;
                j11 = 0;
                long jC = c2427k6.f19071d.f18400a.e().c();
                i10 = 0;
                c2416j3 = c2416j35;
                long j14 = jC - c2427k6.f19069b;
                c2427k6.f19069b = jC;
                if (j14 > 0) {
                    c2416j33.C().Z(bundleT, j14);
                }
            }
            if (!"auto".equals(str5) && "_ssr".equals(str2)) {
                a7 a7VarC4 = c2416j33.C();
                String string = bundleT.getString("_ffr");
                if (B6.n.a(string)) {
                    string = null;
                } else if (string != null) {
                    string = string.trim();
                }
                C2416j3 c2416j37 = a7VarC4.f18400a;
                if (Objects.equals(string, c2416j37.x().f18442w.a())) {
                    c2416j37.a().v().a("Not logging duplicate session_start_with_rollout event");
                    return;
                }
                c2416j37.x().f18442w.b(string);
            } else if (Constants.FIREBASE_APPLICATION_EXCEPTION.equals(str2)) {
                String strA = c2416j33.C().f18400a.x().f18442w.a();
                if (!TextUtils.isEmpty(strA)) {
                    bundleT.putString("_ffr", strA);
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(bundleT);
            boolean zP = c2416j33.w().H(null, AbstractC2383f2.f18860V0) ? c2416j3.z().p() : c2416j33.x().f18439t.a();
            if (c2416j33.x().f18436q.a() > j11 && c2416j33.x().A(j10) && zP) {
                c2416j33.a().w().a("Current session is expired, remove the session number, ID, and engagement time");
                long jA = c2416j33.e().a();
                str4 = Constants.FIREBASE_APPLICATION_EXCEPTION;
                j12 = j11;
                B("auto", "_sid", null, jA);
                B("auto", "_sno", null, c2416j33.e().a());
                B("auto", "_se", null, c2416j33.e().a());
                r42 = this;
                c2416j33.x().f18437r.b(j12);
            } else {
                j12 = j11;
                str4 = Constants.FIREBASE_APPLICATION_EXCEPTION;
            }
            if (bundleT.getLong("extend_session", j12) == 1) {
                c2416j33.a().w().a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                j13 = j10;
                c2416j36.z().f19105e.b(j13, true);
            } else {
                j13 = j10;
            }
            ArrayList arrayList2 = new ArrayList(bundleT.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            for (int i12 = i10; i12 < size; i12++) {
                String str6 = (String) arrayList2.get(i12);
                if (str6 != null) {
                    c2416j33.C();
                    Object obj = bundleT.get(str6);
                    if (obj instanceof Bundle) {
                        bundleArr = new Bundle[1];
                        bundleArr[i10] = (Bundle) obj;
                    } else if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList3 = (ArrayList) obj;
                        bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        bundleT.putParcelableArray(str6, bundleArr);
                    }
                }
            }
            int i13 = i10;
            while (i13 < arrayList.size()) {
                Bundle bundleQ = (Bundle) arrayList.get(i13);
                String str7 = i13 != 0 ? "_ep" : str2;
                bundleQ.putString("_o", str5);
                if (z11) {
                    bundleQ = c2416j33.C().Q(bundleQ, null);
                }
                Bundle bundle2 = bundleQ;
                c2416j3.J().c0(new I(str7, new G(bundle2), str5, j13), str3);
                if (!z13) {
                    Iterator it = r42.f18492e.iterator();
                    while (it.hasNext()) {
                        ((X3) it.next()).a(str, str2, new Bundle(bundle2), j10);
                    }
                }
                i13++;
                str5 = str;
                j13 = j10;
            }
            c2416j33.c();
            if (c2416j3.I().q(i10) == null || !str4.equals(str2)) {
                return;
            }
            c2416j3.z().f19106f.d(true, true, c2416j33.e().c());
        }
    }

    public final boolean v0() {
        return this.f18501n;
    }

    public final void w(String str, String str2, Bundle bundle, String str3) {
        C2416j3.q();
        x("auto", str2, this.f18400a.e().a(), bundle, false, true, true, str3);
    }

    public final PriorityQueue w0() {
        if (this.f18500m == null) {
            this.f18500m = new PriorityQueue(Comparator.comparing(new Function() { // from class: X6.K4
                @Override // java.util.function.Function
                public final /* synthetic */ Object apply(Object obj) {
                    return Long.valueOf(((C2482r6) obj).f19193b);
                }
            }, new Comparator() { // from class: X6.L4
                @Override // java.util.Comparator
                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
                }
            }));
        }
        return this.f18500m;
    }

    public final void x(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        String[] strArr = a7.f18699i;
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i10 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i10 < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i10];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i10] = new Bundle((Bundle) parcelable);
                        }
                        i10++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i10 < list.size()) {
                        Object obj2 = list.get(i10);
                        if (obj2 instanceof Bundle) {
                            list.set(i10, new Bundle((Bundle) obj2));
                        }
                        i10++;
                    }
                }
            }
        }
        this.f18400a.b().t(new RunnableC2425k4(this, str, str2, j10, bundle2, z10, z11, z12, str3));
    }

    public final void x0() {
        C2482r6 c2482r6;
        h();
        this.f18501n = false;
        if (w0().isEmpty() || this.f18496i || (c2482r6 = (C2482r6) w0().poll()) == null) {
            return;
        }
        C2416j3 c2416j3 = this.f18400a;
        W2.a aVarH = c2416j3.C().H();
        if (aVarH != null) {
            this.f18496i = true;
            C2526x2 c2526x2W = c2416j3.a().w();
            String str = c2482r6.f19192a;
            c2526x2W.b("Registering trigger URI", str);
            O7.e eVarC = aVarH.c(Uri.parse(str));
            if (eVarC != null) {
                O7.c.a(eVarC, new C2369d4(this, c2482r6), new ExecutorC2361c4(this));
            } else {
                this.f18496i = false;
                w0().add(c2482r6);
            }
        }
    }

    public final void y(String str, String str2, Object obj, boolean z10) {
        z("auto", "_ldl", obj, true, this.f18400a.e().a());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(java.lang.String r11, java.lang.String r12, java.lang.Object r13, boolean r14, long r15) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.R4.z(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }
}
