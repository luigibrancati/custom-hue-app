package com.braze.support;

import com.braze.models.BrazeGeofence;
import com.braze.support.BrazeLogger;
import fc.C4015H;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f28644a = new o();

    public static final ArrayList a(JSONArray geofenceJson) {
        AbstractC4862t.e(geofenceJson, "geofenceJson");
        ArrayList arrayList = new ArrayList();
        int length = geofenceJson.length();
        for (int i10 = 0; i10 < length; i10++) {
            final JSONObject jSONObjectOptJSONObject = geofenceJson.optJSONObject(i10);
            if (jSONObjectOptJSONObject == null) {
                try {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f28644a, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.a1
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return com.braze.support.o.a();
                        }
                    }, 6, (Object) null);
                    C4015H c4015h = C4015H.f34254a;
                } catch (JSONException e10) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f28644a, BrazeLogger.Priority.f28628W, (Throwable) e10, false, new InterfaceC6082a() { // from class: s5.c1
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return com.braze.support.o.a(jSONObjectOptJSONObject);
                        }
                    }, 4, (Object) null);
                    C4015H c4015h2 = C4015H.f34254a;
                } catch (Exception e11) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f28644a, BrazeLogger.Priority.f28625E, (Throwable) e11, false, new InterfaceC6082a() { // from class: s5.b1
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return com.braze.support.o.b(jSONObjectOptJSONObject);
                        }
                    }, 4, (Object) null);
                    C4015H c4015h3 = C4015H.f34254a;
                }
            } else {
                arrayList.add(new BrazeGeofence(jSONObjectOptJSONObject));
            }
        }
        return arrayList;
    }

    public static final String b(JSONObject jSONObject) {
        return "Failed to deserialize geofence Json:" + jSONObject;
    }

    public static final String a() {
        return "Received null or blank geofence Json. Not parsing.";
    }

    public static final String a(JSONObject jSONObject) {
        return "Failed to deserialize geofence Json due to JSONException: " + jSONObject;
    }
}
