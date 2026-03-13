package com.braze.triggers.config;

import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONException;
import org.json.JSONObject;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28693a;

    public b(JSONObject json) {
        AbstractC4862t.e(json, "json");
        this.f28693a = json.optInt("re_eligibility", -1);
    }

    public static final String c() {
        return "Could not convert ReEligibilityConfig to JSON";
    }

    public final Integer d() {
        int i10 = this.f28693a;
        if (i10 > 0) {
            return Integer.valueOf(i10);
        }
        return null;
    }

    public final boolean e() {
        return this.f28693a == -1;
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut */
    public final JSONObject getPropertiesJSONObject() {
        try {
            return new JSONObject().put("re_eligibility", this.f28693a);
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: v5.a
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.triggers.config.b.c();
                }
            }, 4, (Object) null);
            return null;
        }
    }
}
