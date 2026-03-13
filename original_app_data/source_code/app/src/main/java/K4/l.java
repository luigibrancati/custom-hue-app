package K4;

import J4.p;
import gc.C4179C;
import gc.C4204q;
import gc.U;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class l extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set f7473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Set f7474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Set f7475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Set f7476f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f7477g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Set f7478h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(JSONObject response) throws JSONException {
        super(g.TOO_MANY_REQUESTS, null);
        AbstractC4862t.e(response, "response");
        this.f7473c = U.d();
        this.f7474d = U.d();
        this.f7475e = U.d();
        this.f7476f = U.d();
        this.f7477g = p.c(response, "error", "");
        this.f7478h = U.d();
        if (response.has("exceeded_daily_quota_users")) {
            Set setKeySet = response.getJSONObject("exceeded_daily_quota_users").keySet();
            AbstractC4862t.d(setKeySet, "keySet(...)");
            this.f7473c = setKeySet;
        }
        if (response.has("exceeded_daily_quota_devices")) {
            Set setKeySet2 = response.getJSONObject("exceeded_daily_quota_devices").keySet();
            AbstractC4862t.d(setKeySet2, "keySet(...)");
            this.f7474d = setKeySet2;
        }
        if (response.has("throttled_events")) {
            JSONArray jSONArray = response.getJSONArray("throttled_events");
            AbstractC4862t.d(jSONArray, "getJSONArray(...)");
            this.f7478h = C4204q.a1(p.i(jSONArray));
        }
        if (response.has("throttled_users")) {
            Set setKeySet3 = response.getJSONObject("throttled_users").keySet();
            AbstractC4862t.d(setKeySet3, "keySet(...)");
            this.f7476f = setKeySet3;
        }
        if (response.has("throttled_devices")) {
            Set setKeySet4 = response.getJSONObject("throttled_devices").keySet();
            AbstractC4862t.d(setKeySet4, "keySet(...)");
            this.f7475e = setKeySet4;
        }
    }

    public final String b() {
        return this.f7477g;
    }

    public final Set c() {
        return this.f7478h;
    }

    public final boolean d(E4.a event) {
        AbstractC4862t.e(event, "event");
        if (event.N() == null || !C4179C.Y(this.f7473c, event.N())) {
            return event.l() != null && C4179C.Y(this.f7474d, event.l());
        }
        return true;
    }
}
