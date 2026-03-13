package net.openid.appauth;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ke.p;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends b {
        public a(String str, boolean z10) {
            super(str, Boolean.valueOf(z10));
        }

        @Override // net.openid.appauth.f.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean a(String str) {
            return Boolean.valueOf(Boolean.parseBoolean(str));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f40984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f40985b;

        public b(String str, Object obj) {
            this.f40984a = str;
            this.f40985b = obj;
        }

        public abstract Object a(String str);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f40986a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f40987b;

        public c(String str, List list) {
            this.f40986a = str;
            this.f40987b = list;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends b {
        public d(String str, String str2) {
            super(str, str2);
        }

        public d(String str) {
            this(str, null);
        }

        @Override // net.openid.appauth.f.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String a(String str) {
            return str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends c {
        public e(String str) {
            super(str, null);
        }

        public e(String str, List list) {
            super(str, list);
        }
    }

    /* JADX INFO: renamed from: net.openid.appauth.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0546f extends b {
        public C0546f(String str, Uri uri) {
            super(str, uri);
        }

        @Override // net.openid.appauth.f.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Uri a(String str) {
            return Uri.parse(str);
        }

        public C0546f(String str) {
            this(str, null);
        }
    }

    public static Object a(JSONObject jSONObject, b bVar) {
        try {
            return !jSONObject.has(bVar.f40984a) ? bVar.f40985b : bVar.a(jSONObject.getString(bVar.f40984a));
        } catch (JSONException e10) {
            throw new IllegalStateException("unexpected JSONException", e10);
        }
    }

    public static JSONObject b(JSONObject jSONObject, String str) throws JSONException {
        p.e(jSONObject, "json must not be null");
        p.e(str, "field must not be null");
        if (!jSONObject.has(str)) {
            return null;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject != null) {
            return jSONObjectOptJSONObject;
        }
        throw new JSONException("field \"" + str + "\" is mapped to a null value");
    }

    public static Long c(JSONObject jSONObject, String str) {
        p.e(jSONObject, "json must not be null");
        p.e(str, "field must not be null");
        if (jSONObject.has(str) && !jSONObject.isNull(str)) {
            try {
                return Long.valueOf(jSONObject.getLong(str));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public static String d(JSONObject jSONObject, String str) throws JSONException {
        p.e(jSONObject, "json must not be null");
        p.e(str, "field must not be null");
        if (!jSONObject.has(str)) {
            throw new JSONException("field \"" + str + "\" not found in json object");
        }
        String string = jSONObject.getString(str);
        if (string != null) {
            return string;
        }
        throw new JSONException("field \"" + str + "\" is mapped to a null value");
    }

    public static String e(JSONObject jSONObject, String str) throws JSONException {
        p.e(jSONObject, "json must not be null");
        p.e(str, "field must not be null");
        if (!jSONObject.has(str)) {
            return null;
        }
        String string = jSONObject.getString(str);
        if (string != null) {
            return string;
        }
        throw new JSONException("field \"" + str + "\" is mapped to a null value");
    }

    public static List f(JSONObject jSONObject, String str) throws JSONException {
        p.e(jSONObject, "json must not be null");
        p.e(str, "field must not be null");
        if (jSONObject.has(str)) {
            return t(jSONObject.getJSONArray(str));
        }
        throw new JSONException("field \"" + str + "\" not found in json object");
    }

    public static Map g(JSONObject jSONObject, String str) throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        p.e(jSONObject, "json must not be null");
        p.e(str, "field must not be null");
        if (jSONObject.has(str)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                linkedHashMap.put(next, (String) p.e(jSONObject2.getString(next), "additional parameter values must not be null"));
            }
        }
        return linkedHashMap;
    }

    public static Uri h(JSONObject jSONObject, String str) throws JSONException {
        p.e(jSONObject, "json must not be null");
        p.e(str, "field must not be null");
        String string = jSONObject.getString(str);
        if (string != null) {
            return Uri.parse(string);
        }
        throw new JSONException("field \"" + str + "\" is mapped to a null value");
    }

    public static Uri i(JSONObject jSONObject, String str) throws JSONException {
        p.e(jSONObject, "json must not be null");
        p.e(str, "field must not be null");
        if (!jSONObject.has(str)) {
            return null;
        }
        String string = jSONObject.getString(str);
        if (string != null) {
            return Uri.parse(string);
        }
        throw new JSONException("field \"" + str + "\" is mapped to a null value");
    }

    public static JSONObject j(Map map) {
        p.d(map);
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            p.e((String) entry.getKey(), "map entries must not have null keys");
            p.e((String) entry.getValue(), "map entries must not have null values");
            l(jSONObject, (String) entry.getKey(), (String) entry.getValue());
        }
        return jSONObject;
    }

    public static void k(JSONObject jSONObject, String str, int i10) {
        p.e(jSONObject, "json must not be null");
        p.e(str, "field must not be null");
        p.e(Integer.valueOf(i10), "value must not be null");
        try {
            jSONObject.put(str, i10);
        } catch (JSONException unused) {
            throw new IllegalStateException("JSONException thrown in violation of contract, ex");
        }
    }

    public static void l(JSONObject jSONObject, String str, String str2) {
        p.e(jSONObject, "json must not be null");
        p.e(str, "field must not be null");
        p.e(str2, "value must not be null");
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e10) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e10);
        }
    }

    public static void m(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        p.e(jSONObject, "json must not be null");
        p.e(str, "field must not be null");
        p.e(jSONObject2, "value must not be null");
        try {
            jSONObject.put(str, jSONObject2);
        } catch (JSONException e10) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e10);
        }
    }

    public static void n(JSONObject jSONObject, String str, Uri uri) {
        p.e(jSONObject, "json must not be null");
        p.e(str, "field must not be null");
        if (uri == null) {
            return;
        }
        try {
            jSONObject.put(str, uri.toString());
        } catch (JSONException e10) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e10);
        }
    }

    public static void o(JSONObject jSONObject, String str, Long l10) {
        p.e(jSONObject, "json must not be null");
        p.e(str, "field must not be null");
        if (l10 == null) {
            return;
        }
        try {
            jSONObject.put(str, l10);
        } catch (JSONException e10) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e10);
        }
    }

    public static void p(JSONObject jSONObject, String str, String str2) {
        p.e(jSONObject, "json must not be null");
        p.e(str, "field must not be null");
        if (str2 == null) {
            return;
        }
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e10) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e10);
        }
    }

    public static void q(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        p.e(jSONObject, "json must not be null");
        p.e(str, "field must not be null");
        if (jSONObject2 == null) {
            return;
        }
        try {
            jSONObject.put(str, jSONObject2);
        } catch (JSONException e10) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e10);
        }
    }

    public static List r(JSONArray jSONArray) throws JSONException {
        p.e(jSONArray, "jsonArray must not be null");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object objS = jSONArray.get(i10);
            if (objS instanceof JSONArray) {
                objS = r((JSONArray) objS);
            } else if (objS instanceof JSONObject) {
                objS = s((JSONObject) objS);
            }
            arrayList.add(objS);
        }
        return arrayList;
    }

    public static Map s(JSONObject jSONObject) throws JSONException {
        p.e(jSONObject, "json must not be null");
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objS = jSONObject.get(next);
            if (objS instanceof JSONArray) {
                objS = r((JSONArray) objS);
            } else if (objS instanceof JSONObject) {
                objS = s((JSONObject) objS);
            }
            map.put(next, objS);
        }
        return map;
    }

    public static List t(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                arrayList.add(p.d(jSONArray.get(i10)).toString());
            }
        }
        return arrayList;
    }
}
