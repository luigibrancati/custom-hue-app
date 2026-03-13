package C8;

import C8.d;
import io.sentry.cache.EnvelopeCache;
import org.json.JSONObject;
import u8.G;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class m implements i {
    public static d.a b(JSONObject jSONObject) {
        return new d.a(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false), jSONObject.optBoolean("collect_build_ids", false));
    }

    public static d.b c(JSONObject jSONObject) {
        return new d.b(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    public static long d(G g10, long j10, JSONObject jSONObject) {
        return jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : g10.getCurrentTimeMillis() + (j10 * 1000);
    }

    @Override // C8.i
    public d a(G g10, JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("settings_version", 0);
        int iOptInt2 = jSONObject.optInt("cache_duration", 3600);
        return new d(d(g10, iOptInt2, jSONObject), jSONObject.has(EnvelopeCache.PREFIX_CURRENT_SESSION_FILE) ? c(jSONObject.getJSONObject(EnvelopeCache.PREFIX_CURRENT_SESSION_FILE)) : c(new JSONObject()), b(jSONObject.getJSONObject("features")), iOptInt, iOptInt2, jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d), jSONObject.optDouble("on_demand_backoff_base", 1.2d), jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60));
    }
}
