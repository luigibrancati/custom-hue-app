package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Date f31914h = new Date(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public JSONObject f31915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public JSONObject f31916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Date f31917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public JSONArray f31918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public JSONObject f31919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f31920f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public JSONArray f31921g;

    /* JADX INFO: renamed from: com.google.firebase.remoteconfig.internal.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class C0373b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public JSONObject f31922a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Date f31923b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public JSONArray f31924c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public JSONObject f31925d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f31926e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public JSONArray f31927f;

        public b a() {
            return new b(this.f31922a, this.f31923b, this.f31924c, this.f31925d, this.f31926e, this.f31927f);
        }

        public C0373b b(Map map) {
            this.f31922a = new JSONObject(map);
            return this;
        }

        public C0373b c(JSONObject jSONObject) {
            try {
                this.f31922a = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public C0373b d(JSONArray jSONArray) {
            try {
                this.f31924c = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public C0373b e(Date date) {
            this.f31923b = date;
            return this;
        }

        public C0373b f(JSONObject jSONObject) {
            try {
                this.f31925d = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public C0373b g(JSONArray jSONArray) {
            try {
                this.f31927f = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public C0373b h(long j10) {
            this.f31926e = j10;
            return this;
        }

        public C0373b() {
            this.f31922a = new JSONObject();
            this.f31923b = b.f31914h;
            this.f31924c = new JSONArray();
            this.f31925d = new JSONObject();
            this.f31926e = 0L;
            this.f31927f = new JSONArray();
        }
    }

    public static b b(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        return new b(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), jSONArrayOptJSONArray);
    }

    public static b d(JSONObject jSONObject) {
        return b(new JSONObject(jSONObject.toString()));
    }

    public static C0373b l() {
        return new C0373b();
    }

    public final Map c() throws JSONException {
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < j().length(); i10++) {
            JSONObject jSONObject = j().getJSONObject(i10);
            String string = jSONObject.getString("rolloutId");
            String string2 = jSONObject.getString("variantId");
            JSONArray jSONArray = jSONObject.getJSONArray("affectedParameterKeys");
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                String string3 = jSONArray.getString(i11);
                if (!map.containsKey(string3)) {
                    map.put(string3, new HashMap());
                }
                Map map2 = (Map) map.get(string3);
                if (map2 != null) {
                    map2.put(string, string2);
                }
            }
        }
        return map;
    }

    public JSONArray e() {
        return this.f31918d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f31915a.toString().equals(((b) obj).toString());
        }
        return false;
    }

    public Set f(b bVar) throws JSONException {
        JSONObject jSONObjectG = d(bVar.f31915a).g();
        Map mapC = c();
        Map mapC2 = bVar.c();
        HashSet hashSet = new HashSet();
        Iterator<String> itKeys = g().keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!bVar.g().has(next)) {
                hashSet.add(next);
            } else if (!g().get(next).equals(bVar.g().get(next))) {
                hashSet.add(next);
            } else if ((i().has(next) && !bVar.i().has(next)) || (!i().has(next) && bVar.i().has(next))) {
                hashSet.add(next);
            } else if (i().has(next) && bVar.i().has(next) && !i().getJSONObject(next).toString().equals(bVar.i().getJSONObject(next).toString())) {
                hashSet.add(next);
            } else if (mapC.containsKey(next) != mapC2.containsKey(next)) {
                hashSet.add(next);
            } else if (mapC.containsKey(next) && mapC2.containsKey(next) && !((Map) mapC.get(next)).equals(mapC2.get(next))) {
                hashSet.add(next);
            } else {
                jSONObjectG.remove(next);
            }
        }
        Iterator<String> itKeys2 = jSONObjectG.keys();
        while (itKeys2.hasNext()) {
            hashSet.add(itKeys2.next());
        }
        return hashSet;
    }

    public JSONObject g() {
        return this.f31916b;
    }

    public Date h() {
        return this.f31917c;
    }

    public int hashCode() {
        return this.f31915a.hashCode();
    }

    public JSONObject i() {
        return this.f31919e;
    }

    public JSONArray j() {
        return this.f31921g;
    }

    public long k() {
        return this.f31920f;
    }

    public String toString() {
        return this.f31915a.toString();
    }

    public b(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j10, JSONArray jSONArray2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j10);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.f31916b = jSONObject;
        this.f31917c = date;
        this.f31918d = jSONArray;
        this.f31919e = jSONObject2;
        this.f31920f = j10;
        this.f31921g = jSONArray2;
        this.f31915a = jSONObject3;
    }
}
