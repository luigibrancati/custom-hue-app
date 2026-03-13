package com.braze.models.response;

import Nd.t;
import Od.F;
import com.braze.managers.d1;
import com.braze.managers.h1;
import com.braze.storage.b3;
import com.braze.support.BrazeLogger;
import gc.C4179C;
import gc.C4206t;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f28151A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Long f28152B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f28153C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public long f28154D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public long f28155E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Map f28156F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f28157G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f28158H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f28159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Set f28160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set f28161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Set f28162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f28163e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f28164f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f28165g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f28166h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f28167i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f28168j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f28169k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f28170l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f28171m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f28172n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f28173o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f28174p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f28175q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f28176r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f28177s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f28178t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f28179u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f28180v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f28181w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f28182x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f28183y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f28184z;

    public m() {
        int i10 = b3.f28398f;
        int i11 = b3.f28399g;
        this.f28159a = 0L;
        this.f28160b = null;
        this.f28161c = null;
        this.f28162d = null;
        this.f28163e = -1;
        this.f28164f = -1;
        this.f28165g = -1;
        this.f28166h = false;
        this.f28167i = false;
        this.f28168j = false;
        this.f28169k = -1L;
        this.f28170l = false;
        this.f28171m = false;
        this.f28172n = -1;
        this.f28173o = false;
        this.f28174p = 86400L;
        this.f28175q = true;
        this.f28176r = 30;
        this.f28177s = 30;
        this.f28178t = false;
        this.f28179u = false;
        this.f28180v = -1L;
        this.f28181w = i10;
        this.f28182x = i11;
        this.f28183y = 3;
        this.f28184z = false;
        this.f28151A = null;
        this.f28152B = null;
        this.f28153C = 0L;
        this.f28154D = 0L;
        this.f28155E = 0L;
        this.f28156F = null;
        this.f28157G = false;
        this.f28158H = 0;
    }

    public static final String g() {
        return "Caught error parsing global rate limit config.";
    }

    public static final String k(JSONObject jSONObject) {
        return "sdkDebuggerObject contains invalid values. Disabling SDK debugging. " + jSONObject;
    }

    public final void a(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("banners");
        if (jSONObjectOptJSONObject != null) {
            try {
                this.f28157G = jSONObjectOptJSONObject.getBoolean("enabled");
                int i10 = jSONObjectOptJSONObject.getInt("max_placements");
                this.f28158H = i10;
                if (!this.f28157G || i10 > 0) {
                    return;
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: k5.m
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return com.braze.models.response.m.a(this.f39261a);
                        }
                    }, 7, (Object) null);
                }
            } catch (JSONException e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: k5.n
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.models.response.m.a();
                    }
                }, 4, (Object) null);
            }
            this.f28157G = false;
            this.f28158H = 0;
        }
    }

    public final void b(JSONObject jSONObject) {
        m mVar;
        boolean z10;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("content_cards");
        if (jSONObjectOptJSONObject != null) {
            try {
                z10 = jSONObjectOptJSONObject.getBoolean("enabled");
                mVar = this;
            } catch (JSONException e10) {
                mVar = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mVar, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: k5.k
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.models.response.m.b();
                    }
                }, 4, (Object) null);
                z10 = false;
            }
            mVar.f28168j = z10;
        }
    }

    public final void c(JSONObject jSONObject) {
        m mVar;
        boolean z10;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("dust");
        if (jSONObjectOptJSONObject != null) {
            try {
                z10 = jSONObjectOptJSONObject.getBoolean("enabled");
                mVar = this;
            } catch (JSONException e10) {
                mVar = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mVar, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: k5.l
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.models.response.m.c();
                    }
                }, 4, (Object) null);
                z10 = false;
            }
            mVar.f28178t = z10;
            mVar.f28179u = jSONObjectOptJSONObject.optBoolean("should_block_cc_refresh", false);
        }
    }

    public final void d(JSONObject jSONObject) {
        m mVar;
        boolean z10;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ephemeral_events");
        if (jSONObjectOptJSONObject != null) {
            try {
                z10 = jSONObjectOptJSONObject.getBoolean("enabled");
                mVar = this;
            } catch (JSONException e10) {
                mVar = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mVar, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: k5.f
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.models.response.m.d();
                    }
                }, 4, (Object) null);
                z10 = false;
            }
            mVar.f28170l = z10;
        }
    }

    public final void e(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("feature_flags");
        if (jSONObjectOptJSONObject != null) {
            try {
                this.f28171m = jSONObjectOptJSONObject.optBoolean("enabled");
                this.f28172n = jSONObjectOptJSONObject.getInt("refresh_rate_limit");
            } catch (JSONException e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: k5.j
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.models.response.m.e();
                    }
                }, 4, (Object) null);
                this.f28171m = false;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f28159a == mVar.f28159a && AbstractC4862t.a(this.f28160b, mVar.f28160b) && AbstractC4862t.a(this.f28161c, mVar.f28161c) && AbstractC4862t.a(this.f28162d, mVar.f28162d) && this.f28163e == mVar.f28163e && this.f28164f == mVar.f28164f && this.f28165g == mVar.f28165g && this.f28166h == mVar.f28166h && this.f28167i == mVar.f28167i && this.f28168j == mVar.f28168j && this.f28169k == mVar.f28169k && this.f28170l == mVar.f28170l && this.f28171m == mVar.f28171m && this.f28172n == mVar.f28172n && this.f28173o == mVar.f28173o && this.f28174p == mVar.f28174p && this.f28175q == mVar.f28175q && this.f28176r == mVar.f28176r && this.f28177s == mVar.f28177s && this.f28178t == mVar.f28178t && this.f28179u == mVar.f28179u && this.f28180v == mVar.f28180v && this.f28181w == mVar.f28181w && this.f28182x == mVar.f28182x && this.f28183y == mVar.f28183y && this.f28184z == mVar.f28184z && AbstractC4862t.a(this.f28151A, mVar.f28151A) && AbstractC4862t.a(this.f28152B, mVar.f28152B) && this.f28153C == mVar.f28153C && this.f28154D == mVar.f28154D && this.f28155E == mVar.f28155E && AbstractC4862t.a(this.f28156F, mVar.f28156F) && this.f28157G == mVar.f28157G && this.f28158H == mVar.f28158H;
    }

    public final void f(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("geofences");
        if (jSONObjectOptJSONObject != null) {
            try {
                this.f28163e = jSONObjectOptJSONObject.getInt("min_time_since_last_request");
                this.f28164f = jSONObjectOptJSONObject.getInt("min_time_since_last_report");
                this.f28167i = jSONObjectOptJSONObject.getBoolean("enabled");
                this.f28166h = true;
                this.f28165g = jSONObjectOptJSONObject.optInt("max_num_to_register", 20);
            } catch (JSONException e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: k5.i
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.models.response.m.f();
                    }
                }, 4, (Object) null);
                this.f28163e = -1;
                this.f28164f = -1;
                this.f28165g = -1;
                this.f28167i = false;
                this.f28166h = false;
            }
        }
    }

    public final void h(JSONObject jSONObject) {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("global_request_rate_limit");
            if (jSONObjectOptJSONObject != null) {
                if (!jSONObjectOptJSONObject.getBoolean("enabled")) {
                    this.f28175q = false;
                    return;
                }
                int i10 = jSONObjectOptJSONObject.getInt("refill_rate");
                int i11 = jSONObjectOptJSONObject.getInt("capacity");
                if (i11 < 10) {
                    this.f28175q = false;
                } else {
                    if (i10 <= 0) {
                        return;
                    }
                    this.f28175q = true;
                    this.f28177s = i11;
                    this.f28176r = i10;
                    g(jSONObjectOptJSONObject);
                }
            }
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: k5.o
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.models.response.m.g();
                }
            }, 4, (Object) null);
            this.f28175q = false;
            this.f28156F = null;
        }
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f28159a) * 31;
        Set set = this.f28160b;
        int iHashCode2 = (iHashCode + (set == null ? 0 : set.hashCode())) * 31;
        Set set2 = this.f28161c;
        int iHashCode3 = (iHashCode2 + (set2 == null ? 0 : set2.hashCode())) * 31;
        Set set3 = this.f28162d;
        int iHashCode4 = (Boolean.hashCode(this.f28184z) + ((Integer.hashCode(this.f28183y) + ((Integer.hashCode(this.f28182x) + ((Integer.hashCode(this.f28181w) + ((Long.hashCode(this.f28180v) + ((Boolean.hashCode(this.f28179u) + ((Boolean.hashCode(this.f28178t) + ((Integer.hashCode(this.f28177s) + ((Integer.hashCode(this.f28176r) + ((Boolean.hashCode(this.f28175q) + ((Long.hashCode(this.f28174p) + ((Boolean.hashCode(this.f28173o) + ((Integer.hashCode(this.f28172n) + ((Boolean.hashCode(this.f28171m) + ((Boolean.hashCode(this.f28170l) + ((Long.hashCode(this.f28169k) + ((Boolean.hashCode(this.f28168j) + ((Boolean.hashCode(this.f28167i) + ((Boolean.hashCode(this.f28166h) + ((Integer.hashCode(this.f28165g) + ((Integer.hashCode(this.f28164f) + ((Integer.hashCode(this.f28163e) + ((iHashCode3 + (set3 == null ? 0 : set3.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.f28151A;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Long l10 = this.f28152B;
        int iHashCode6 = (Long.hashCode(this.f28155E) + ((Long.hashCode(this.f28154D) + ((Long.hashCode(this.f28153C) + ((iHashCode5 + (l10 == null ? 0 : l10.hashCode())) * 31)) * 31)) * 31)) * 31;
        Map map = this.f28156F;
        int iHashCode7 = map != null ? map.hashCode() : 0;
        return Integer.hashCode(this.f28158H) + ((Boolean.hashCode(this.f28157G) + ((iHashCode6 + iHashCode7) * 31)) * 31);
    }

    public final void i(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("push_max");
        if (jSONObjectOptJSONObject != null) {
            try {
                this.f28173o = jSONObjectOptJSONObject.optBoolean("enabled");
                this.f28174p = jSONObjectOptJSONObject.optLong("redeliver_buffer", 86400L);
                this.f28180v = jSONObjectOptJSONObject.optLong("redeliver_dedupe_buffer", -1L);
            } catch (JSONException e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: k5.h
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.models.response.m.h();
                    }
                }, 4, (Object) null);
                this.f28173o = false;
                this.f28174p = 0L;
                this.f28180v = -1L;
            }
        }
    }

    public final void j(JSONObject jSONObject) {
        final JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("sdk_debugger");
        if (jSONObjectOptJSONObject == null) {
            return;
        }
        try {
            d1 d1VarA = h1.f27875k.a(jSONObjectOptJSONObject, false);
            if (d1VarA.f27850a) {
                this.f28184z = true;
                this.f28151A = d1VarA.f27852c;
                Long l10 = d1VarA.f27851b;
                if (l10 != null) {
                    this.f28152B = Long.valueOf(l10.longValue());
                }
                this.f28153C = d1VarA.f27853d;
                this.f28154D = d1VarA.f27854e;
                this.f28155E = d1VarA.f27855f;
            }
            String str = this.f28151A;
            if (str != null && !F.k0(str) && this.f28153C > 0 && this.f28154D > 0 && this.f28155E > 0) {
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: k5.e
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.models.response.m.k(jSONObjectOptJSONObject);
                }
            }, 7, (Object) null);
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: k5.g
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.models.response.m.i();
                }
            }, 4, (Object) null);
        }
        this.f28184z = false;
        this.f28151A = null;
        this.f28153C = 0L;
        this.f28154D = 0L;
        this.f28155E = 0L;
    }

    public final String toString() {
        return "ServerConfig(configTime=" + this.f28159a + ", blocklistedEvents=" + this.f28160b + ", blocklistedAttributes=" + this.f28161c + ", blocklistedPurchases=" + this.f28162d + ", minTimeSinceLastRequest=" + this.f28163e + ", minTimeSinceLastReport=" + this.f28164f + ", maxNumToRegister=" + this.f28165g + ", geofencesEnabledSet=" + this.f28166h + ", geofencesEnabled=" + this.f28167i + ", isContentCardsFeatureEnabled=" + this.f28168j + ", messagingSessionTimeout=" + this.f28169k + ", ephemeralEventsEnabled=" + this.f28170l + ", featureFlagsEnabled=" + this.f28171m + ", featureFlagsRefreshRateLimit=" + this.f28172n + ", pushMaxEnabled=" + this.f28173o + ", pushMaxRedeliverBuffer=" + this.f28174p + ", globalRequestRateLimitEnabled=" + this.f28175q + ", globalRequestRateLimitBucketRefillRate=" + this.f28176r + ", globalRequestRateLimitBucketCapacity=" + this.f28177s + ", isDustFeatureEnabled=" + this.f28178t + ", dustShouldBlockCcRefresh=" + this.f28179u + ", pushMaxRedeliverDedupeBuffer=" + this.f28180v + ", defaultBackoffMinSleepMs=" + this.f28181w + ", defaultBackoffMaxSleepMs=" + this.f28182x + ", defaultBackoffScaleFactor=" + this.f28183y + ", sdkDebuggerEnabled=" + this.f28184z + ", sdkDebuggerAuthCode=" + this.f28151A + ", sdkDebuggerExpirationTime=" + this.f28152B + ", sdkDebuggerFlushIntervalBytes=" + this.f28153C + ", sdkDebuggerFlushIntervalSeconds=" + this.f28154D + ", sdkDebuggerMaxPayloadBytes=" + this.f28155E + ", globalRequestRateLimitOverrides=" + this.f28156F + ", bannersEnabled=" + this.f28157G + ", maxBannerPlacements=" + this.f28158H + ")";
    }

    public final void g(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("endpoint_overrides");
        if (jSONObjectOptJSONObject != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            AbstractC4862t.d(itKeys, "keys(...)");
            while (itKeys.hasNext()) {
                String destinationSuffix = itKeys.next();
                com.braze.requests.m mVar = com.braze.requests.n.f28312b;
                AbstractC4862t.b(destinationSuffix);
                mVar.getClass();
                AbstractC4862t.e(destinationSuffix, "destinationSuffix");
                com.braze.requests.n nVar = (com.braze.requests.n) com.braze.requests.n.f28313c.get(destinationSuffix);
                if (nVar != null) {
                    JSONObject jSONObject2 = jSONObjectOptJSONObject.getJSONObject(destinationSuffix);
                    int i10 = jSONObject2.getInt("capacity");
                    int i11 = jSONObject2.getInt("refill_rate");
                    if (i10 > 0 && i11 > 0) {
                        linkedHashMap.put(nVar, new j(i10, i11));
                    }
                }
            }
            if (linkedHashMap.isEmpty()) {
                return;
            }
            this.f28156F = linkedHashMap;
        }
    }

    public static final String b() {
        return "Error getting required content cards fields. Using defaults.";
    }

    public static final String d() {
        return "Error getting required ephemeral events fields. Using defaults.";
    }

    public static final String c() {
        return "Error getting required DUST enabled field. Using default of false.";
    }

    public static final String e() {
        return "Error getting required feature flag fields. Disabling feature flags.";
    }

    public static final String a(m mVar) {
        return "Banners enabled but maxBannerPlacement is " + mVar.f28158H + ". Not enabling banners.";
    }

    public static final String a() {
        return "Error getting required banner configuration fields. Disabling banners.";
    }

    public static HashSet a(JSONObject jSONObject, String str) {
        Iterator it;
        HashSet hashSet = new HashSet();
        if (jSONObject.has(str)) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
            if (jSONArrayOptJSONArray == null) {
                it = C4206t.k().iterator();
            } else {
                it = t.I(t.y(C4179C.X(Bc.k.p(0, jSONArrayOptJSONArray.length())), new k(jSONArrayOptJSONArray)), new l(jSONArrayOptJSONArray)).iterator();
            }
            while (it.hasNext()) {
                hashSet.add((String) it.next());
            }
        }
        return hashSet;
    }

    public static final String i() {
        return "Error getting required SDK debugging fields. Disabling SDK debugging.";
    }

    public static final String f() {
        return "Error getting required geofence fields. Using defaults.";
    }

    public static final String h() {
        return "Error getting required push max fields. Disabling push max.";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(JSONObject configJson) {
        this();
        AbstractC4862t.e(configJson, "configJson");
        this.f28159a = configJson.optLong("time", 0L);
        this.f28169k = configJson.optLong("messaging_session_timeout", -1L);
        this.f28160b = a(configJson, "events_blacklist");
        this.f28161c = a(configJson, "attributes_blacklist");
        this.f28162d = a(configJson, "purchases_blacklist");
        b(configJson);
        f(configJson);
        d(configJson);
        e(configJson);
        i(configJson);
        h(configJson);
        c(configJson);
        JSONObject jSONObjectOptJSONObject = configJson.optJSONObject("request_backoff");
        if (jSONObjectOptJSONObject != null) {
            this.f28181w = jSONObjectOptJSONObject.optInt("min_sleep_duration_ms", this.f28181w);
            this.f28182x = jSONObjectOptJSONObject.optInt("max_sleep_duration_ms", this.f28182x);
            this.f28183y = jSONObjectOptJSONObject.optInt("scale_factor", this.f28183y);
        }
        j(configJson);
        a(configJson);
    }
}
