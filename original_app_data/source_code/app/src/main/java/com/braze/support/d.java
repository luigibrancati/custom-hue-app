package com.braze.support;

import Od.F;
import com.braze.enums.BrazeDateFormat;
import com.braze.support.BrazeLogger;
import gc.C4206t;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f28633a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f28634b = C4206t.n("$add", "$remove", "$update", "$identifier_key", "$identifier_value", "$new_object");

    public static final boolean a(final String str, Set blocklistedAttributes) {
        AbstractC4862t.e(blocklistedAttributes, "blocklistedAttributes");
        if (str == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f28633a, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.P0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.support.d.c();
                }
            }, 6, (Object) null);
            return false;
        }
        if (!blocklistedAttributes.contains(str)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f28633a, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.Q0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.support.d.b(str);
            }
        }, 6, (Object) null);
        return false;
    }

    public static final String b(String str) {
        return "Custom attribute key cannot be blocklisted attribute: " + str + ".";
    }

    public static final String c() {
        return "Custom attribute key cannot be null.";
    }

    public static final String d() {
        return "Custom attribute value cannot be null.";
    }

    public static final String b() {
        return "JSON Object nested too deep (limit 50). Returning null.";
    }

    public static final boolean c(String str) {
        if (str != null) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f28633a, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.O0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.support.d.d();
            }
        }, 6, (Object) null);
        return false;
    }

    public static final String d(Object obj) {
        return "JSON Object size (" + ((JSONObject) obj).toString().length() + " bytes) exceeds 76800";
    }

    public static final String b(Object obj) {
        return "Could not add unsupported custom attribute type with value: " + obj;
    }

    public static final String c(Object obj) {
        return "Error parsing date " + obj;
    }

    public final JSONObject a(JSONObject jSONObject, int i10) throws JSONException {
        if (i10 > 50) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.V0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.support.d.b();
                }
            }, 7, (Object) null);
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        AbstractC4862t.d(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            final String next = itKeys.next();
            String strEnsureBrazeFieldLength = ValidationUtils.ensureBrazeFieldLength(next);
            d dVar = f28633a;
            if ((F.k0(strEnsureBrazeFieldLength) | F.V(strEnsureBrazeFieldLength, "$", false, 2, null) | F.V(strEnsureBrazeFieldLength, ".", false, 2, null)) & (!f28634b.contains(strEnsureBrazeFieldLength))) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dVar, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.W0
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.support.d.a(next);
                    }
                }, 6, (Object) null);
            }
            if (!F.k0(strEnsureBrazeFieldLength)) {
                if (jSONObject.isNull(next)) {
                    jSONObject2.put(next, JSONObject.NULL);
                } else {
                    Object obj = jSONObject.get(next);
                    AbstractC4862t.d(obj, "get(...)");
                    Object objA = dVar.a(obj, i10);
                    if (objA == null) {
                        return null;
                    }
                    jSONObject2.put(strEnsureBrazeFieldLength, objA);
                }
            }
        }
        return jSONObject2;
    }

    public static final String a(String str) {
        return "Nested Custom Attribute Key '" + str + "' is invalid.";
    }

    public final JSONArray a(JSONArray jSONArray, int i10) throws JSONException {
        if (i10 > 50) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.X0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.support.d.a();
                }
            }, 7, (Object) null);
            return null;
        }
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            Object obj = jSONArray.get(i11);
            AbstractC4862t.d(obj, "get(...)");
            Object objA = a(obj, i10);
            if (objA == null) {
                return null;
            }
            jSONArray2.put(objA);
        }
        return jSONArray2;
    }

    public static final String a() {
        return "JSON Object nested too deep (limit 50). Returning null.";
    }

    public final Object a(final Object value, int i10) {
        AbstractC4862t.e(value, "value");
        if ((value instanceof Boolean) || (value instanceof Integer) || (value instanceof Float) || (value instanceof Long) || (value instanceof Double)) {
            return value;
        }
        if (value instanceof String) {
            return ValidationUtils.ensureBrazeFieldLength((String) value);
        }
        if (value instanceof Date) {
            try {
                return DateTimeUtils.formatDate$default((Date) value, BrazeDateFormat.LONG, null, 2, null);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: s5.R0
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.support.d.c(value);
                    }
                }, 4, (Object) null);
                return null;
            }
        }
        if (value instanceof JSONObject) {
            if (i10 == 0 && ((JSONObject) value).toString().length() > 76800) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.S0
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.support.d.d(value);
                    }
                }, 6, (Object) null);
                return null;
            }
            return a((JSONObject) value, i10 + 1);
        }
        if (value instanceof JSONArray) {
            if (i10 == 0 && ((JSONArray) value).toString().length() > 76800) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.T0
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.support.d.a(value);
                    }
                }, 6, (Object) null);
                return null;
            }
            return a((JSONArray) value, i10 + 1);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.U0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.support.d.b(value);
            }
        }, 6, (Object) null);
        return null;
    }

    public static final String a(Object obj) {
        return "JSON Array size (" + ((JSONArray) obj).toString().length() + " bytes) exceeds 76800";
    }
}
