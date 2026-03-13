package J4;

import com.google.android.libraries.barhopper.RecognitionOptions;
import io.sentry.ProfilingTraceData;
import io.sentry.TraceContext;
import io.sentry.clientreport.DiscardedEvent;
import io.sentry.protocol.App;
import io.sentry.protocol.Geo;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f6229a = new o();

    public final JSONObject a(E4.a event) throws JSONException {
        AbstractC4862t.e(event, "event");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event_type", event.F0());
        p.a(jSONObject, TraceContext.JsonKeys.USER_ID, event.N());
        p.a(jSONObject, "device_id", event.l());
        p.a(jSONObject, "time", event.M());
        p.a(jSONObject, "event_properties", f(n.e(event.E0())));
        p.a(jSONObject, "user_properties", f(n.e(event.I0())));
        p.a(jSONObject, "groups", f(n.e(event.H0())));
        p.a(jSONObject, "group_properties", f(n.e(event.G0())));
        p.a(jSONObject, App.JsonKeys.APP_VERSION, event.d());
        p.a(jSONObject, "platform", event.E());
        p.a(jSONObject, "os_name", event.A());
        p.a(jSONObject, "os_version", event.B());
        p.a(jSONObject, "device_brand", event.k());
        p.a(jSONObject, ProfilingTraceData.JsonKeys.DEVICE_MANUFACTURER, event.m());
        p.a(jSONObject, ProfilingTraceData.JsonKeys.DEVICE_MODEL, event.n());
        p.a(jSONObject, "carrier", event.g());
        p.a(jSONObject, "country", event.i());
        p.a(jSONObject, Geo.JsonKeys.REGION, event.I());
        p.a(jSONObject, Geo.JsonKeys.CITY, event.h());
        p.a(jSONObject, "dma", event.o());
        p.a(jSONObject, "language", event.w());
        p.a(jSONObject, "price", event.F());
        p.a(jSONObject, DiscardedEvent.JsonKeys.QUANTITY, event.H());
        p.a(jSONObject, "revenue", event.J());
        p.a(jSONObject, "productId", event.G());
        p.a(jSONObject, "revenueType", event.K());
        p.a(jSONObject, "currency", event.j());
        p.a(jSONObject, "location_lat", event.y());
        p.a(jSONObject, "location_lng", event.z());
        p.a(jSONObject, "ip", event.v());
        p.a(jSONObject, ProfilingTraceData.JsonKeys.RELEASE, event.O());
        p.a(jSONObject, "idfa", event.r());
        p.a(jSONObject, "idfv", event.s());
        p.a(jSONObject, "adid", event.a());
        p.a(jSONObject, "android_id", event.b());
        p.a(jSONObject, "event_id", event.p());
        p.a(jSONObject, "session_id", event.L());
        p.a(jSONObject, "insert_id", event.u());
        p.a(jSONObject, "library", event.x());
        p.a(jSONObject, "partner_id", event.C());
        p.a(jSONObject, "android_app_set_id", event.c());
        E4.g gVarD = event.D();
        if (gVarD != null) {
            jSONObject.put("plan", gVarD.b());
        }
        E4.f fVarT = event.t();
        if (fVarT != null) {
            jSONObject.put("ingestion_metadata", fVarT.b());
        }
        return jSONObject;
    }

    public final String b(E4.a event) {
        AbstractC4862t.e(event, "event");
        String string = a(event).toString();
        AbstractC4862t.d(string, "toString(...)");
        return string;
    }

    public final String c(List events) {
        AbstractC4862t.e(events, "events");
        if (events.isEmpty()) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = events.iterator();
        while (it.hasNext()) {
            jSONArray.put(a((E4.a) it.next()));
        }
        String string = jSONArray.toString();
        AbstractC4862t.d(string, "toString(...)");
        return string;
    }

    public final String d(String str) {
        if (str.length() <= 1024) {
            return str;
        }
        String strSubstring = str.substring(0, RecognitionOptions.UPC_E);
        AbstractC4862t.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final JSONArray e(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return new JSONArray();
        }
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = jSONArray.get(i10);
            if (AbstractC4862t.a(obj.getClass(), String.class)) {
                AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.String");
                jSONArray.put(i10, d((String) obj));
            } else if (AbstractC4862t.a(obj.getClass(), JSONObject.class)) {
                AbstractC4862t.c(obj, "null cannot be cast to non-null type org.json.JSONObject");
                jSONArray.put(i10, f((JSONObject) obj));
            } else if (AbstractC4862t.a(obj.getClass(), JSONArray.class)) {
                AbstractC4862t.c(obj, "null cannot be cast to non-null type org.json.JSONArray");
                jSONArray.put(i10, e((JSONArray) obj));
            }
        }
        return jSONArray;
    }

    public final JSONObject f(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        if (jSONObject.length() > 1024) {
            throw new IllegalArgumentException("Too many properties (more than 1024) in JSON");
        }
        Iterator<String> itKeys = jSONObject.keys();
        AbstractC4862t.d(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            AbstractC4862t.c(next, "null cannot be cast to non-null type kotlin.String");
            String str = next;
            try {
                Object obj = jSONObject.get(str);
                if (AbstractC4862t.a(obj.getClass(), String.class)) {
                    AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.String");
                    jSONObject.put(str, d((String) obj));
                } else if (AbstractC4862t.a(obj.getClass(), JSONObject.class)) {
                    AbstractC4862t.c(obj, "null cannot be cast to non-null type org.json.JSONObject");
                    jSONObject.put(str, f((JSONObject) obj));
                } else if (AbstractC4862t.a(obj.getClass(), JSONArray.class)) {
                    AbstractC4862t.c(obj, "null cannot be cast to non-null type org.json.JSONArray");
                    jSONObject.put(str, e((JSONArray) obj));
                }
            } catch (JSONException unused) {
                throw new IllegalArgumentException("JSON parsing error. Too long (> 1024 chars) or invalid JSON");
            }
        }
        return jSONObject;
    }
}
