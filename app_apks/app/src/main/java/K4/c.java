package K4;

import J4.p;
import Od.F;
import gc.C4179C;
import gc.C4204q;
import gc.U;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Set f7453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Set f7454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Set f7455f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Set f7456g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(JSONObject response) throws JSONException {
        super(g.BAD_REQUEST, null);
        AbstractC4862t.e(response, "response");
        this.f7452c = p.c(response, "error", "");
        this.f7453d = U.d();
        this.f7454e = U.d();
        this.f7455f = U.d();
        this.f7456g = U.d();
        if (response.has("events_with_invalid_fields")) {
            JSONObject jSONObject = response.getJSONObject("events_with_invalid_fields");
            AbstractC4862t.d(jSONObject, "getJSONObject(...)");
            this.f7453d = p.b(jSONObject);
        }
        if (response.has("events_with_missing_fields")) {
            JSONObject jSONObject2 = response.getJSONObject("events_with_missing_fields");
            AbstractC4862t.d(jSONObject2, "getJSONObject(...)");
            this.f7454e = p.b(jSONObject2);
        }
        if (response.has("silenced_devices")) {
            Object jSONArray = response.getJSONArray("silenced_devices");
            AbstractC4862t.d(jSONArray, "getJSONArray(...)");
            Set setZ0 = C4179C.Z0((Iterable) jSONArray);
            AbstractC4862t.c(setZ0, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            this.f7456g = setZ0;
        }
        if (response.has("silenced_events")) {
            JSONArray jSONArray2 = response.getJSONArray("silenced_events");
            AbstractC4862t.d(jSONArray2, "getJSONArray(...)");
            this.f7455f = C4204q.a1(p.i(jSONArray2));
        }
    }

    public final String b() {
        return this.f7452c;
    }

    public final Set c() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.f7453d);
        linkedHashSet.addAll(this.f7454e);
        linkedHashSet.addAll(this.f7455f);
        return linkedHashSet;
    }

    public final boolean d(E4.a event) {
        AbstractC4862t.e(event, "event");
        String strL = event.l();
        if (strL != null) {
            return this.f7456g.contains(strL);
        }
        return false;
    }

    public final boolean e() {
        String lowerCase = this.f7452c.toLowerCase(Locale.ROOT);
        AbstractC4862t.d(lowerCase, "toLowerCase(...)");
        return F.V(lowerCase, "invalid api key", false, 2, null);
    }
}
