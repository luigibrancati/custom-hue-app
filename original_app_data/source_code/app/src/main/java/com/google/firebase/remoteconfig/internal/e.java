package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import android.util.Log;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import k9.s;
import k9.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Date f31966f = new Date(-1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Date f31967g = new Date(-1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f31968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f31969b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f31970c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f31971d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f31972e = new Object();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f31973a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Date f31974b;

        public a(int i10, Date date) {
            this.f31973a = i10;
            this.f31974b = date;
        }

        public Date a() {
            return this.f31974b;
        }

        public int b() {
            return this.f31973a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f31975a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Date f31976b;

        public b(int i10, Date date) {
            this.f31975a = i10;
            this.f31976b = date;
        }

        public Date a() {
            return this.f31976b;
        }

        public int b() {
            return this.f31975a;
        }
    }

    public e(SharedPreferences sharedPreferences) {
        this.f31968a = sharedPreferences;
    }

    public a a() {
        a aVar;
        synchronized (this.f31970c) {
            aVar = new a(this.f31968a.getInt("num_failed_fetches", 0), new Date(this.f31968a.getLong("backoff_end_time_in_millis", -1L)));
        }
        return aVar;
    }

    public Map b() {
        try {
            JSONObject jSONObject = new JSONObject(this.f31968a.getString("customSignals", "{}"));
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.optString(next));
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public long c() {
        return this.f31968a.getLong("fetch_timeout_in_seconds", 60L);
    }

    public s d() {
        f fVarA;
        synchronized (this.f31969b) {
            long j10 = this.f31968a.getLong("last_fetch_time_in_millis", -1L);
            int i10 = this.f31968a.getInt("last_fetch_status", 0);
            fVarA = f.d().c(i10).d(j10).b(new u.b().d(this.f31968a.getLong("fetch_timeout_in_seconds", 60L)).e(this.f31968a.getLong("minimum_fetch_interval_in_seconds", c.f31928j)).c()).a();
        }
        return fVarA;
    }

    public String e() {
        return this.f31968a.getString("last_fetch_etag", null);
    }

    public Date f() {
        return new Date(this.f31968a.getLong("last_fetch_time_in_millis", -1L));
    }

    public long g() {
        return this.f31968a.getLong("last_template_version", 0L);
    }

    public long h() {
        return this.f31968a.getLong("minimum_fetch_interval_in_seconds", c.f31928j);
    }

    public b i() {
        b bVar;
        synchronized (this.f31971d) {
            bVar = new b(this.f31968a.getInt("num_failed_realtime_streams", 0), new Date(this.f31968a.getLong("realtime_backoff_end_time_in_millis", -1L)));
        }
        return bVar;
    }

    public void j() {
        l(0, f31967g);
    }

    public void k() {
        r(0, f31967g);
    }

    public void l(int i10, Date date) {
        synchronized (this.f31970c) {
            this.f31968a.edit().putInt("num_failed_fetches", i10).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public void m(u uVar) {
        synchronized (this.f31969b) {
            this.f31968a.edit().putLong("fetch_timeout_in_seconds", uVar.a()).putLong("minimum_fetch_interval_in_seconds", uVar.b()).commit();
        }
    }

    public void n(Map map) {
        synchronized (this.f31972e) {
            try {
                Map mapB = b();
                boolean z10 = false;
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    if (str.length() <= 250 && (str2 == null || str2.length() <= 500)) {
                        boolean z11 = true;
                        if (str2 != null) {
                            z10 |= !Objects.equals(mapB.put(str, str2), str2);
                        } else {
                            if (mapB.remove(str) == null) {
                                z11 = false;
                            }
                            z10 |= z11;
                        }
                    }
                    Log.w("FirebaseRemoteConfig", String.format("Invalid custom signal: Custom signal keys must be %d characters or less, and values must be %d characters or less.", 250, 500));
                    return;
                }
                if (z10) {
                    if (mapB.size() > 100) {
                        Log.w("FirebaseRemoteConfig", String.format("Invalid custom signal: Too many custom signals provided. The maximum allowed is %d.", 100));
                        return;
                    }
                    this.f31968a.edit().putString("customSignals", new JSONObject(mapB).toString()).commit();
                    Log.d("FirebaseRemoteConfig", "Keys of updated custom signals: " + b().keySet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void o(String str) {
        synchronized (this.f31969b) {
            this.f31968a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    public void p(long j10) {
        synchronized (this.f31969b) {
            this.f31968a.edit().putLong("last_template_version", j10).apply();
        }
    }

    public void q(Date date) {
        synchronized (this.f31971d) {
            this.f31968a.edit().putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public void r(int i10, Date date) {
        synchronized (this.f31971d) {
            this.f31968a.edit().putInt("num_failed_realtime_streams", i10).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public void s() {
        synchronized (this.f31969b) {
            this.f31968a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    public void t(Date date) {
        synchronized (this.f31969b) {
            this.f31968a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }

    public void u() {
        synchronized (this.f31969b) {
            this.f31968a.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}
