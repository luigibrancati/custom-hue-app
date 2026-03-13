package com.braze.storage;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.support.StringUtils;
import fc.C4015H;
import io.sentry.TraceContext;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONException;
import org.json.JSONObject;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class n3 extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.braze.managers.q0 f28506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v2 f28507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t0 f28508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o3 f28509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f28510f;

    public n3(Context context, com.braze.managers.q0 pushRegistrationDataProvider, v2 sdkEnablementProvider, t0 delayedInitializationProvider, String str, String str2) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(pushRegistrationDataProvider, "pushRegistrationDataProvider");
        AbstractC4862t.e(sdkEnablementProvider, "sdkEnablementProvider");
        AbstractC4862t.e(delayedInitializationProvider, "delayedInitializationProvider");
        this.f28506b = pushRegistrationDataProvider;
        this.f28507c = sdkEnablementProvider;
        this.f28508d = delayedInitializationProvider;
        this.f28509e = new o3(context, str, str2);
        this.f28510f = str;
    }

    public static final String d() {
        return "Could not create custom attributes json object from DataStore.";
    }

    public static final String e() {
        return "No push token available to add to attributes object.";
    }

    public static final String f() {
        return "Couldn't add push token to outbound json";
    }

    public static final String i() {
        return "Failed to add merged custom attributes back to user object.";
    }

    public static final String k() {
        return "Push token cache cleared via sendPushTokenOnNextExport.";
    }

    @Override // com.braze.storage.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void c(com.braze.models.outgoing.l outboundObject, boolean z10) {
        n3 n3Var;
        AbstractC4862t.e(outboundObject, "outboundObject");
        JSONObject jSONObject = outboundObject.f28105a;
        if (z10) {
            DataStoreKey dataStoreKey = DataStoreKey.PUSH_TOKEN;
            if (jSONObject.has(dataStoreKey.getKey())) {
                o3 o3Var = this.f28509e;
                String strOptString = jSONObject.optString("push_token");
                AbstractC4862t.d(strOptString, "optString(...)");
                o3Var.writeData(dataStoreKey, strOptString);
                return;
            }
            return;
        }
        JSONObject jSONObjectH = h();
        JSONObject jSONObjectPlus = JsonUtils.plus(jSONObject, jSONObjectH);
        jSONObjectPlus.remove("push_token");
        JSONObject jSONObjectOptJSONObject = jSONObjectH.optJSONObject("custom");
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("custom");
        try {
        } catch (JSONException e10) {
            n3Var = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) n3Var, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: r5.g2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.n3.i();
                }
            }, 4, (Object) null);
        }
        if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject2 != null) {
            jSONObjectPlus.put("custom", JsonUtils.plus(jSONObjectOptJSONObject2, jSONObjectOptJSONObject));
        } else {
            if (jSONObjectOptJSONObject == null) {
                if (jSONObjectOptJSONObject2 != null) {
                    jSONObjectPlus.put("custom", jSONObjectOptJSONObject2);
                }
                n3Var = this;
                o3 o3Var2 = n3Var.f28509e;
                DataStoreKey dataStoreKey2 = DataStoreKey.SERIALIZED_USER_OBJECT;
                String string = jSONObjectPlus.toString();
                AbstractC4862t.d(string, "toString(...)");
                o3Var2.writeData(dataStoreKey2, string);
            }
            jSONObjectPlus.put("custom", jSONObjectOptJSONObject);
        }
        n3Var = this;
        o3 o3Var22 = n3Var.f28509e;
        DataStoreKey dataStoreKey22 = DataStoreKey.SERIALIZED_USER_OBJECT;
        String string2 = jSONObjectPlus.toString();
        AbstractC4862t.d(string2, "toString(...)");
        o3Var22.writeData(dataStoreKey22, string2);
    }

    public final void b(final JSONObject jSONObject) {
        final String str = "ab_install_attribution";
        AbstractC4862t.e("ab_install_attribution", "key");
        JSONObject jSONObjectH = h();
        try {
            if (jSONObject == null) {
                jSONObjectH.put("ab_install_attribution", JSONObject.NULL);
            } else {
                JSONObject jSONObjectOptJSONObject = jSONObjectH.optJSONObject("ab_install_attribution");
                if (jSONObjectOptJSONObject != null) {
                    jSONObjectH.put("ab_install_attribution", JsonUtils.plus(jSONObjectOptJSONObject, jSONObject));
                } else {
                    jSONObjectH.put("ab_install_attribution", jSONObject);
                }
            }
            c(jSONObjectH);
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: r5.b2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.n3.a(str, jSONObject);
                }
            }, 4, (Object) null);
        }
    }

    public final JSONObject g() {
        JSONObject jSONObjectH = h();
        if (jSONObjectH.has("custom")) {
            try {
                JSONObject jSONObject = jSONObjectH.getJSONObject("custom");
                AbstractC4862t.d(jSONObject, "getJSONObject(...)");
                return jSONObject;
            } catch (JSONException e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: r5.d2
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.storage.n3.d();
                    }
                }, 4, (Object) null);
            }
        }
        return new JSONObject();
    }

    public final JSONObject h() {
        final String string = this.f28509e.readString(DataStoreKey.SERIALIZED_USER_OBJECT, null);
        if (string == null) {
            return new JSONObject();
        }
        try {
            return new JSONObject(string);
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: r5.f2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.n3.a(string);
                }
            }, 4, (Object) null);
            return new JSONObject();
        }
    }

    public final synchronized void j() {
        try {
            try {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.Y1
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.storage.n3.k();
                    }
                }, 6, (Object) null);
                this.f28509e.clearData(DataStoreKey.PUSH_TOKEN);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // com.braze.storage.b
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final com.braze.models.outgoing.l c() {
        StringUtils.ifNonEmpty(this.f28510f, new vc.l() { // from class: r5.h2
            @Override // vc.l
            public final Object invoke(Object obj) {
                return com.braze.storage.n3.a(this.f43675a, (String) obj);
            }
        });
        JSONObject jSONObjectH = h();
        a(jSONObjectH);
        this.f28509e.clearData(DataStoreKey.SERIALIZED_USER_OBJECT);
        return new com.braze.models.outgoing.l(jSONObjectH);
    }

    public static final String d(String str, Object obj) {
        return "Failed to write to user object json from DataStore with key: [" + str + "] value: [" + obj + "]";
    }

    public final boolean c(JSONObject jSONObject) {
        if (!this.f28507c.a() && !this.f28508d.c()) {
            o3 o3Var = this.f28509e;
            DataStoreKey dataStoreKey = DataStoreKey.SERIALIZED_USER_OBJECT;
            String string = jSONObject.toString();
            AbstractC4862t.d(string, "toString(...)");
            o3Var.writeData(dataStoreKey, string);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.e2
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.storage.n3.a(this.f43667a);
            }
        }, 6, (Object) null);
        return false;
    }

    public static final String b(String str, Object obj) {
        return "Could not write to custom attributes json object with key: [" + str + "] value: [" + obj + "]";
    }

    public final boolean c(final String key, final Object obj) {
        Object obj2;
        AbstractC4862t.e(key, "key");
        JSONObject jSONObjectH = h();
        if (obj == null) {
            try {
                obj2 = JSONObject.NULL;
            } catch (JSONException e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: r5.c2
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.storage.n3.d(key, obj);
                    }
                }, 4, (Object) null);
                return false;
            }
        } else {
            obj2 = obj;
        }
        jSONObjectH.put(key, obj2);
        return c(jSONObjectH);
    }

    public static final String a(String str) {
        return "Failed to load user object json from DataStore with json string: " + str;
    }

    public final void a(JSONObject outboundJson) {
        AbstractC4862t.e(outboundJson, "outboundJson");
        try {
            String strB = ((com.braze.managers.z0) this.f28506b).b();
            if (strB == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.i2
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.storage.n3.e();
                    }
                }, 7, (Object) null);
            } else {
                if (AbstractC4862t.a(strB, this.f28509e.readString(DataStoreKey.PUSH_TOKEN, null))) {
                    return;
                }
                outboundJson.put("push_token", strB);
            }
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: r5.Z1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.n3.f();
                }
            }, 4, (Object) null);
        }
    }

    public static final C4015H a(n3 n3Var, String it) {
        AbstractC4862t.e(it, "it");
        n3Var.c(TraceContext.JsonKeys.USER_ID, it);
        return C4015H.f34254a;
    }

    public static final String a(n3 n3Var) {
        return "SDK delayed initialization mode: " + n3Var.f28508d.c() + " and GDPR disabled mode: " + n3Var.f28507c.a() + ". Not writing to user cache.";
    }

    public static final String a(String str, JSONObject jSONObject) {
        return "Failed to write to user object json from DataStore with key: [" + str + "] value: [" + jSONObject + "] ";
    }

    public final boolean a(final String key, final Object obj) {
        Object obj2;
        AbstractC4862t.e(key, "key");
        JSONObject jSONObjectG = g();
        if (obj == null) {
            try {
                obj2 = JSONObject.NULL;
            } catch (JSONException e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: r5.a2
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.storage.n3.b(key, obj);
                    }
                }, 4, (Object) null);
                return false;
            }
        } else {
            obj2 = obj;
        }
        jSONObjectG.put(key, obj2);
        return c("custom", jSONObjectG);
    }
}
