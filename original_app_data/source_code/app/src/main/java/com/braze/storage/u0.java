package com.braze.storage;

import com.braze.enums.DeviceKey;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONException;
import org.json.JSONObject;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class u0 {
    public static final String b() {
        return "shouldReportPushPermissionsAsGranted: Returning true given that push is permissible now and notifications enabled transitioned to true.";
    }

    public static final String c() {
        return "shouldReportPushPermissionsAsGranted: Returning true since notifications enabled is true and device has upgraded to Tiramisu or beyond.";
    }

    public static final String d() {
        return "Returning false for shouldReportPushPermissionsAsGranted.";
    }

    public final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject2.opt(next);
            Object objOpt2 = jSONObject.opt(next);
            if (objOpt != null) {
                try {
                    if (objOpt instanceof JSONObject) {
                        if (objOpt2 == null || !JsonUtils.areJsonObjectsEqual((JSONObject) objOpt, (JSONObject) objOpt2)) {
                            jSONObject3.put(next, objOpt);
                        }
                    } else if (!AbstractC4862t.a(objOpt, objOpt2)) {
                        jSONObject3.put(next, objOpt);
                    }
                } catch (JSONException e10) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: r5.h3
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return com.braze.storage.u0.a();
                        }
                    }, 4, (Object) null);
                    return null;
                }
            }
        }
        return jSONObject3;
    }

    public static final String a() {
        return "Caught json exception while creating the diff. Returning null";
    }

    public final boolean a(JSONObject cachedDeviceJson, JSONObject liveDeviceJson, int i10, int i11) {
        AbstractC4862t.e(cachedDeviceJson, "cachedDeviceJson");
        AbstractC4862t.e(liveDeviceJson, "liveDeviceJson");
        boolean z10 = i11 >= 33;
        boolean z11 = i10 < 33 && z10;
        DeviceKey deviceKey = DeviceKey.NOTIFICATIONS_ENABLED;
        boolean zOptBoolean = liveDeviceJson.optBoolean(deviceKey.getKey(), false);
        boolean z12 = zOptBoolean && !cachedDeviceJson.optBoolean(deviceKey.getKey(), false);
        if (z10 && z12) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.e3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.u0.b();
                }
            }, 7, (Object) null);
            return true;
        }
        if (zOptBoolean && z11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.f3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.u0.c();
                }
            }, 7, (Object) null);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.g3
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.storage.u0.d();
            }
        }, 6, (Object) null);
        return false;
    }
}
