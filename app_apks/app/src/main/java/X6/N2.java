package X6;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import n6.C5134a;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class N2 extends M3 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final Pair f18421A = new Pair("", 0L);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SharedPreferences f18422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SharedPreferences f18423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public L2 f18424e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final K2 f18425f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final K2 f18426g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final M2 f18427h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f18428i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f18429j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f18430k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final K2 f18431l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final I2 f18432m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final M2 f18433n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final J2 f18434o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final I2 f18435p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final K2 f18436q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final K2 f18437r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f18438s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final I2 f18439t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final I2 f18440u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final K2 f18441v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final M2 f18442w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final M2 f18443x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final K2 f18444y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final J2 f18445z;

    public N2(C2416j3 c2416j3) {
        super(c2416j3);
        this.f18431l = new K2(this, "session_timeout", 1800000L);
        this.f18432m = new I2(this, "start_new_session", true);
        this.f18436q = new K2(this, "last_pause_time", 0L);
        this.f18437r = new K2(this, "session_id", 0L);
        this.f18433n = new M2(this, "non_personalized_ads", null);
        this.f18434o = new J2(this, "last_received_uri_timestamps_by_source", null);
        this.f18435p = new I2(this, "allow_remote_dynamite", false);
        this.f18425f = new K2(this, "first_open_time", 0L);
        this.f18426g = new K2(this, "app_install_time", 0L);
        this.f18427h = new M2(this, "app_instance_id", null);
        this.f18439t = new I2(this, "app_backgrounded", false);
        this.f18440u = new I2(this, "deep_link_retrieval_complete", false);
        this.f18441v = new K2(this, "deep_link_retrieval_attempts", 0L);
        this.f18442w = new M2(this, "firebase_feature_rollouts", null);
        this.f18443x = new M2(this, "deferred_attribution_cache", null);
        this.f18444y = new K2(this, "deferred_attribution_cache_timestamp", 0L);
        this.f18445z = new J2(this, "default_event_parameters", null);
    }

    public final boolean A(long j10) {
        return j10 - this.f18431l.a() > this.f18436q.a();
    }

    @Override // X6.M3
    public final boolean i() {
        return true;
    }

    @Override // X6.M3
    public final void j() {
        C2416j3 c2416j3 = this.f18400a;
        SharedPreferences sharedPreferences = c2416j3.d().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f18422c = sharedPreferences;
        boolean z10 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f18438s = z10;
        if (!z10) {
            SharedPreferences.Editor editorEdit = this.f18422c.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        c2416j3.w();
        this.f18424e = new L2(this, "health_monitor", Math.max(0L, ((Long) AbstractC2383f2.f18878d.b(null)).longValue()), null);
    }

    public final Pair o(String str) {
        h();
        if (!w().o(R3.AD_STORAGE)) {
            return new Pair("", Boolean.FALSE);
        }
        C2416j3 c2416j3 = this.f18400a;
        long jC = c2416j3.e().c();
        String str2 = this.f18428i;
        if (str2 != null && jC < this.f18430k) {
            return new Pair(str2, Boolean.valueOf(this.f18429j));
        }
        this.f18430k = jC + c2416j3.w().D(str, AbstractC2383f2.f18872b);
        C5134a.b(true);
        try {
            C5134a.C0536a c0536aA = C5134a.a(c2416j3.d());
            this.f18428i = "";
            String strA = c0536aA.a();
            if (strA != null) {
                this.f18428i = strA;
            }
            this.f18429j = c0536aA.b();
        } catch (Exception e10) {
            this.f18400a.a().v().b("Unable to get advertising id", e10);
            this.f18428i = "";
        }
        C5134a.b(false);
        return new Pair(this.f18428i, Boolean.valueOf(this.f18429j));
    }

    public final SharedPreferences p() {
        h();
        l();
        AbstractC6056k.l(this.f18422c);
        return this.f18422c;
    }

    public final SharedPreferences q() {
        h();
        l();
        if (this.f18423d == null) {
            C2416j3 c2416j3 = this.f18400a;
            String strValueOf = String.valueOf(c2416j3.d().getPackageName());
            C2526x2 c2526x2W = c2416j3.a().w();
            String strConcat = strValueOf.concat("_preferences");
            c2526x2W.b("Default prefs file", strConcat);
            this.f18423d = c2416j3.d().getSharedPreferences(strConcat, 0);
        }
        return this.f18423d;
    }

    public final SparseArray r() {
        Bundle bundleA = this.f18434o.a();
        int[] intArray = bundleA.getIntArray("uriSources");
        long[] longArray = bundleA.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            this.f18400a.a().o().a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i10 = 0; i10 < intArray.length; i10++) {
            sparseArray.put(intArray[i10], Long.valueOf(longArray[i10]));
        }
        return sparseArray;
    }

    public final void s(Boolean bool) {
        h();
        SharedPreferences.Editor editorEdit = p().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
    }

    public final Boolean t() {
        h();
        if (p().contains("measurement_enabled")) {
            return Boolean.valueOf(p().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    public final A u() {
        h();
        return A.g(p().getString("dma_consent_settings", null));
    }

    public final boolean v(int i10) {
        return S3.u(i10, p().getInt("consent_source", 100));
    }

    public final S3 w() {
        h();
        return S3.f(p().getString("consent_settings", "G1"), p().getInt("consent_source", 100));
    }

    public final boolean x(C2451n6 c2451n6) {
        h();
        String string = p().getString("stored_tcf_param", "");
        String strA = c2451n6.a();
        if (strA.equals(string)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = p().edit();
        editorEdit.putString("stored_tcf_param", strA);
        editorEdit.apply();
        return true;
    }

    public final void y(boolean z10) {
        h();
        this.f18400a.a().w().b("App measurement setting deferred collection", Boolean.valueOf(z10));
        SharedPreferences.Editor editorEdit = p().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z10);
        editorEdit.apply();
    }

    public final boolean z() {
        SharedPreferences sharedPreferences = this.f18422c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }
}
