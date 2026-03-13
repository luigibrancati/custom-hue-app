package com.google.firebase.messaging;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import b0.C2777a;
import com.google.firebase.messaging.AbstractC3682d;
import io.sentry.ProfilingTraceData;
import java.util.Map;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class T extends AbstractC6157a {
    public static final Parcelable.Creator<T> CREATOR = new U();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bundle f31634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f31635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f31636c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bundle f31637a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f31638b;

        public b(String str) {
            Bundle bundle = new Bundle();
            this.f31637a = bundle;
            this.f31638b = new C2777a();
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("google.to", str);
                return;
            }
            throw new IllegalArgumentException("Invalid to: " + str);
        }

        public T a() {
            Bundle bundle = new Bundle();
            for (Map.Entry entry : this.f31638b.entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
            bundle.putAll(this.f31637a);
            this.f31637a.remove("from");
            return new T(bundle);
        }

        public b b(String str) {
            this.f31637a.putString("collapse_key", str);
            return this;
        }

        public b c(Map map) {
            this.f31638b.clear();
            this.f31638b.putAll(map);
            return this;
        }

        public b d(String str) {
            this.f31637a.putString("google.message_id", str);
            return this;
        }

        public b e(String str) {
            this.f31637a.putString("message_type", str);
            return this;
        }

        public b f(int i10) {
            this.f31637a.putString("google.ttl", String.valueOf(i10));
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f31639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f31640b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String[] f31641c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f31642d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f31643e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String[] f31644f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f31645g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f31646h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String f31647i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f31648j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final String f31649k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final String f31650l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final String f31651m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Uri f31652n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final String f31653o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final Integer f31654p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final Integer f31655q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final Integer f31656r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int[] f31657s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final Long f31658t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final boolean f31659u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final boolean f31660v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final boolean f31661w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final boolean f31662x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final boolean f31663y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final long[] f31664z;

        public static String[] j(M m10, String str) {
            Object[] objArrG = m10.g(str);
            if (objArrG == null) {
                return null;
            }
            String[] strArr = new String[objArrG.length];
            for (int i10 = 0; i10 < objArrG.length; i10++) {
                strArr[i10] = String.valueOf(objArrG[i10]);
            }
            return strArr;
        }

        public String a() {
            return this.f31642d;
        }

        public String[] b() {
            return this.f31644f;
        }

        public String c() {
            return this.f31643e;
        }

        public String d() {
            return this.f31651m;
        }

        public String e() {
            return this.f31650l;
        }

        public String f() {
            return this.f31649k;
        }

        public String g() {
            return this.f31645g;
        }

        public Uri h() {
            String str = this.f31646h;
            if (str != null) {
                return Uri.parse(str);
            }
            return null;
        }

        public Uri i() {
            return this.f31652n;
        }

        public Integer k() {
            return this.f31656r;
        }

        public Integer l() {
            return this.f31654p;
        }

        public String m() {
            return this.f31647i;
        }

        public String n() {
            return this.f31648j;
        }

        public String o() {
            return this.f31653o;
        }

        public String p() {
            return this.f31639a;
        }

        public String[] q() {
            return this.f31641c;
        }

        public String r() {
            return this.f31640b;
        }

        public Integer s() {
            return this.f31655q;
        }

        public c(M m10) {
            this.f31639a = m10.p("gcm.n.title");
            this.f31640b = m10.h("gcm.n.title");
            this.f31641c = j(m10, "gcm.n.title");
            this.f31642d = m10.p("gcm.n.body");
            this.f31643e = m10.h("gcm.n.body");
            this.f31644f = j(m10, "gcm.n.body");
            this.f31645g = m10.p("gcm.n.icon");
            this.f31647i = m10.o();
            this.f31648j = m10.p("gcm.n.tag");
            this.f31649k = m10.p("gcm.n.color");
            this.f31650l = m10.p("gcm.n.click_action");
            this.f31651m = m10.p("gcm.n.android_channel_id");
            this.f31652n = m10.f();
            this.f31646h = m10.p("gcm.n.image");
            this.f31653o = m10.p("gcm.n.ticker");
            this.f31654p = m10.b("gcm.n.notification_priority");
            this.f31655q = m10.b("gcm.n.visibility");
            this.f31656r = m10.b("gcm.n.notification_count");
            this.f31659u = m10.a("gcm.n.sticky");
            this.f31660v = m10.a("gcm.n.local_only");
            this.f31661w = m10.a("gcm.n.default_sound");
            this.f31662x = m10.a("gcm.n.default_vibrate_timings");
            this.f31663y = m10.a("gcm.n.default_light_settings");
            this.f31658t = m10.j("gcm.n.event_time");
            this.f31657s = m10.e();
            this.f31664z = m10.q();
        }
    }

    public T(Bundle bundle) {
        this.f31634a = bundle;
    }

    public String d() {
        return this.f31634a.getString("collapse_key");
    }

    public Map e() {
        if (this.f31635b == null) {
            this.f31635b = AbstractC3682d.a.a(this.f31634a);
        }
        return this.f31635b;
    }

    public String f() {
        return this.f31634a.getString("from");
    }

    public String h() {
        String string = this.f31634a.getString("google.message_id");
        return string == null ? this.f31634a.getString("message_id") : string;
    }

    public final int k(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return ProfilingTraceData.TRUNCATION_REASON_NORMAL.equals(str) ? 2 : 0;
    }

    public String l() {
        return this.f31634a.getString("message_type");
    }

    public c n() {
        if (this.f31636c == null && M.t(this.f31634a)) {
            this.f31636c = new c(new M(this.f31634a));
        }
        return this.f31636c;
    }

    public int r() {
        String string = this.f31634a.getString("google.original_priority");
        if (string == null) {
            string = this.f31634a.getString("google.priority");
        }
        return k(string);
    }

    public long t() {
        Object obj = this.f31634a.get("google.sent_time");
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (!(obj instanceof String)) {
            return 0L;
        }
        try {
            return Long.parseLong((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid sent time: " + obj);
            return 0L;
        }
    }

    public String v() {
        return this.f31634a.getString("google.to");
    }

    public int w() {
        Object obj = this.f31634a.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
            return 0;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        U.c(this, parcel, i10);
    }

    public void x(Intent intent) {
        intent.putExtras(this.f31634a);
    }
}
