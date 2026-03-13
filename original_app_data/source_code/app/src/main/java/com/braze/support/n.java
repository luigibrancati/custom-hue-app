package com.braze.support;

import com.braze.models.FeatureFlag;
import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONObject;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f28643a = new n();

    public static final String b(JSONObject jSONObject) {
        return "Failed to deserialize feature flag Json: " + jSONObject;
    }

    public final FeatureFlag a(final JSONObject featureFlagObject) {
        AbstractC4862t.e(featureFlagObject, "featureFlagObject");
        try {
            String string = featureFlagObject.getString("id");
            AbstractC4862t.d(string, "getString(...)");
            boolean z10 = featureFlagObject.getBoolean("enabled");
            JSONObject jSONObjectOptJSONObject = featureFlagObject.optJSONObject("properties");
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            return new FeatureFlag(string, z10, jSONObjectOptJSONObject, JsonUtils.getOptionalString(featureFlagObject, "fts"));
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: s5.Z0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.support.n.b(featureFlagObject);
                }
            }, 4, (Object) null);
            return null;
        }
    }
}
