package J4;

import E4.f;
import E4.g;
import fc.C4034q;
import gc.C4179C;
import gc.M;
import gc.Q;
import io.sentry.ProfilingTraceData;
import io.sentry.TraceContext;
import io.sentry.clientreport.DiscardedEvent;
import io.sentry.protocol.App;
import io.sentry.protocol.Geo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    public static final void a(JSONObject jSONObject, String key, Object obj) throws JSONException {
        AbstractC4862t.e(jSONObject, "<this>");
        AbstractC4862t.e(key, "key");
        if (obj != null) {
            jSONObject.put(key, obj);
        }
    }

    public static final Set b(JSONObject jSONObject) throws JSONException {
        AbstractC4862t.e(jSONObject, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject.keys();
        AbstractC4862t.d(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            JSONArray jSONArray = jSONObject.getJSONArray(itKeys.next());
            AbstractC4862t.d(jSONArray, "getJSONArray(...)");
            for (int i10 : i(jSONArray)) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        return C4179C.Z0(arrayList);
    }

    public static final String c(JSONObject jSONObject, String key, String defaultValue) throws JSONException {
        AbstractC4862t.e(jSONObject, "<this>");
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(defaultValue, "defaultValue");
        if (!jSONObject.has(key)) {
            return defaultValue;
        }
        String string = jSONObject.getString(key);
        AbstractC4862t.d(string, "getString(...)");
        return string;
    }

    public static final JSONObject d(JSONObject jSONObject, String key, JSONObject jSONObject2) {
        AbstractC4862t.e(jSONObject, "<this>");
        AbstractC4862t.e(key, "key");
        return jSONObject.has(key) ? jSONObject.getJSONObject(key) : jSONObject2;
    }

    public static final String e(JSONObject jSONObject, String key, String str) {
        AbstractC4862t.e(jSONObject, "<this>");
        AbstractC4862t.e(key, "key");
        return jSONObject.has(key) ? jSONObject.getString(key) : str;
    }

    public static final C4034q f(JSONArray jSONArray) throws JSONException {
        AbstractC4862t.e(jSONArray, "<this>");
        int length = jSONArray.length() / 2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = Bc.k.p(0, jSONArray.length()).iterator();
        while (it.hasNext()) {
            int iNextInt = ((M) it).nextInt();
            if (iNextInt < length) {
                JSONObject jSONObject = jSONArray.getJSONObject(iNextInt);
                AbstractC4862t.d(jSONObject, "getJSONObject(...)");
                arrayList.add(jSONObject);
            } else {
                JSONObject jSONObject2 = jSONArray.getJSONObject(iNextInt);
                AbstractC4862t.d(jSONObject2, "getJSONObject(...)");
                arrayList2.add(jSONObject2);
            }
        }
        return new C4034q(arrayList, arrayList2);
    }

    public static final E4.a g(JSONObject jSONObject) throws JSONException {
        E4.g gVarA;
        Map mapG;
        Map mapG2;
        Map mapG3;
        Map mapG4;
        AbstractC4862t.e(jSONObject, "<this>");
        E4.a aVar = new E4.a();
        String string = jSONObject.getString("event_type");
        AbstractC4862t.d(string, "getString(...)");
        aVar.M0(string);
        E4.f fVarA = null;
        aVar.C0(e(jSONObject, TraceContext.JsonKeys.USER_ID, null));
        aVar.a0(e(jSONObject, "device_id", null));
        aVar.B0(jSONObject.has("time") ? Long.valueOf(jSONObject.getLong("time")) : null);
        JSONObject jSONObjectD = d(jSONObject, "event_properties", null);
        aVar.L0((jSONObjectD == null || (mapG4 = n.g(jSONObjectD)) == null) ? null : Q.w(mapG4));
        JSONObject jSONObjectD2 = d(jSONObject, "user_properties", null);
        aVar.P0((jSONObjectD2 == null || (mapG3 = n.g(jSONObjectD2)) == null) ? null : Q.w(mapG3));
        JSONObject jSONObjectD3 = d(jSONObject, "groups", null);
        aVar.O0((jSONObjectD3 == null || (mapG2 = n.g(jSONObjectD3)) == null) ? null : Q.w(mapG2));
        JSONObject jSONObjectD4 = d(jSONObject, "group_properties", null);
        aVar.N0((jSONObjectD4 == null || (mapG = n.g(jSONObjectD4)) == null) ? null : Q.w(mapG));
        aVar.S(e(jSONObject, App.JsonKeys.APP_VERSION, null));
        aVar.t0(e(jSONObject, "platform", null));
        aVar.p0(e(jSONObject, "os_name", null));
        aVar.q0(e(jSONObject, "os_version", null));
        aVar.Z(e(jSONObject, "device_brand", null));
        aVar.b0(e(jSONObject, ProfilingTraceData.JsonKeys.DEVICE_MANUFACTURER, null));
        aVar.c0(e(jSONObject, ProfilingTraceData.JsonKeys.DEVICE_MODEL, null));
        aVar.V(e(jSONObject, "carrier", null));
        aVar.X(e(jSONObject, "country", null));
        aVar.x0(e(jSONObject, Geo.JsonKeys.REGION, null));
        aVar.W(e(jSONObject, Geo.JsonKeys.CITY, null));
        aVar.d0(e(jSONObject, "dma", null));
        aVar.l0(e(jSONObject, "language", null));
        aVar.u0(jSONObject.has("price") ? Double.valueOf(jSONObject.getDouble("price")) : null);
        aVar.w0(jSONObject.has(DiscardedEvent.JsonKeys.QUANTITY) ? Integer.valueOf(jSONObject.getInt(DiscardedEvent.JsonKeys.QUANTITY)) : null);
        aVar.y0(jSONObject.has("revenue") ? Double.valueOf(jSONObject.getDouble("revenue")) : null);
        aVar.v0(e(jSONObject, "productId", null));
        aVar.z0(e(jSONObject, "revenueType", null));
        aVar.n0(jSONObject.has("location_lat") ? Double.valueOf(jSONObject.getDouble("location_lat")) : null);
        aVar.o0(jSONObject.has("location_lng") ? Double.valueOf(jSONObject.getDouble("location_lng")) : null);
        aVar.k0(e(jSONObject, "ip", null));
        aVar.g0(e(jSONObject, "idfa", null));
        aVar.h0(e(jSONObject, "idfv", null));
        aVar.P(e(jSONObject, "adid", null));
        aVar.Q(e(jSONObject, "android_id", null));
        aVar.R(jSONObject.optString("android_app_set_id", null));
        aVar.e0(jSONObject.has("event_id") ? Long.valueOf(jSONObject.getLong("event_id")) : null);
        aVar.A0(jSONObject.has("session_id") ? Long.valueOf(jSONObject.getLong("session_id")) : null);
        aVar.j0(e(jSONObject, "insert_id", null));
        aVar.m0(jSONObject.has("library") ? jSONObject.getString("library") : null);
        aVar.r0(e(jSONObject, "partner_id", null));
        if (jSONObject.has("plan")) {
            g.a aVar2 = E4.g.f3313e;
            JSONObject jSONObject2 = jSONObject.getJSONObject("plan");
            AbstractC4862t.d(jSONObject2, "getJSONObject(...)");
            gVarA = aVar2.a(jSONObject2);
        } else {
            gVarA = null;
        }
        aVar.s0(gVarA);
        if (jSONObject.has("ingestion_metadata")) {
            f.a aVar3 = E4.f.f3310c;
            JSONObject jSONObject3 = jSONObject.getJSONObject("ingestion_metadata");
            AbstractC4862t.d(jSONObject3, "getJSONObject(...)");
            fVarA = aVar3.a(jSONObject3);
        }
        aVar.i0(fVarA);
        return aVar;
    }

    public static final List h(JSONArray jSONArray) throws JSONException {
        AbstractC4862t.e(jSONArray, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = Bc.k.p(0, jSONArray.length()).iterator();
        while (it.hasNext()) {
            JSONObject jSONObject = jSONArray.getJSONObject(((M) it).nextInt());
            AbstractC4862t.d(jSONObject, "getJSONObject(...)");
            arrayList.add(g(jSONObject));
        }
        return arrayList;
    }

    public static final int[] i(JSONArray jSONArray) {
        AbstractC4862t.e(jSONArray, "<this>");
        int length = jSONArray.length();
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = jSONArray.optInt(i10);
        }
        return iArr;
    }

    public static final List j(JSONArray jSONArray) throws JSONException {
        AbstractC4862t.e(jSONArray, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = Bc.k.p(0, jSONArray.length()).iterator();
        while (it.hasNext()) {
            JSONObject jSONObject = jSONArray.getJSONObject(((M) it).nextInt());
            AbstractC4862t.d(jSONObject, "getJSONObject(...)");
            arrayList.add(jSONObject);
        }
        return arrayList;
    }
}
