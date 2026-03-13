package com.braze.models;

import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONObject;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final String b() {
        return "Received null inner banner object. Not parsing.";
    }

    public final Banner a(final JSONObject jSONObject) {
        if (jSONObject == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: d5.g
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.models.a.a();
                }
            }, 6, (Object) null);
            return null;
        }
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("banner");
            if (jSONObjectOptJSONObject == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: d5.h
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.models.a.b();
                    }
                }, 6, (Object) null);
                return null;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("properties");
            if (jSONObjectOptJSONObject2 == null) {
                jSONObjectOptJSONObject2 = new JSONObject();
            }
            String string = jSONObjectOptJSONObject.getString("id");
            AbstractC4862t.d(string, "getString(...)");
            String string2 = jSONObjectOptJSONObject.getString("placement_id");
            AbstractC4862t.d(string2, "getString(...)");
            String string3 = jSONObjectOptJSONObject.getString("html");
            AbstractC4862t.d(string3, "getString(...)");
            return new Banner(string, string2, string3, jSONObjectOptJSONObject.getBoolean("is_control"), jSONObjectOptJSONObject.getLong("expires_at"), jSONObjectOptJSONObject.getBoolean("is_test_send"), jSONObjectOptJSONObject2);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: d5.i
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.models.a.b(jSONObject);
                }
            }, 4, (Object) null);
            return null;
        }
    }

    public static final String b(JSONObject jSONObject) {
        return "Failed to deserialize banner Json: " + jSONObject;
    }

    public static final String a() {
        return "Received null banner object. Not parsing.";
    }
}
