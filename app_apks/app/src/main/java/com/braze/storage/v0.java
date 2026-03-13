package com.braze.storage;

import Od.F;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DeviceKey;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.support.StringUtils;
import fc.C4015H;
import fc.C4032o;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONException;
import org.json.JSONObject;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final u0 f28587f = new u0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BrazeConfigurationProvider f28588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SharedPreferences f28589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SharedPreferences f28590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.braze.models.outgoing.h f28591e;

    public v0(Context context, String str, String str2) throws NoSuchAlgorithmException {
        AbstractC4862t.e(context, "context");
        this.f28588b = new BrazeConfigurationProvider(context);
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.storage.device_cache.v3" + StringUtils.getCacheFileSuffix(context, str, str2), 0);
        AbstractC4862t.d(sharedPreferences, "getSharedPreferences(...)");
        this.f28589c = sharedPreferences;
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("com.braze.storage.device_cache.metadata" + StringUtils.getCacheFileSuffix(context, str, str2), 0);
        AbstractC4862t.d(sharedPreferences2, "getSharedPreferences(...)");
        this.f28590d = sharedPreferences2;
    }

    public static final String a(boolean z10, boolean z11) {
        return "Exporting the full device due to either: shouldShouldFullDeviceOnNextExport: " + z10 + ", shouldReportPushPermissionsAsGranted: " + z11;
    }

    public static final String d() {
        return "Caught exception confirming and unlocking device cache.";
    }

    public static final String f() {
        return "Sending full device on next export but keeping cache intact.";
    }

    public static final String h() {
        return "Caught exception confirming and unlocking JSON objects.";
    }

    public static final String i() {
        return "Failed to generate diff between the cached and live device. Returning the live device.";
    }

    public static final String j() {
        return "Remote Notification Enabled changed to true. Updating user subscription.";
    }

    public final void e() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.j3
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.storage.v0.f();
            }
        }, 6, (Object) null);
        this.f28590d.edit().putBoolean("sfone", true).apply();
    }

    @Override // com.braze.storage.b
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final com.braze.models.outgoing.h c() {
        JSONObject jsonObject;
        String str = "{}";
        JSONObject jSONObject = new JSONObject();
        com.braze.models.outgoing.h hVar = this.f28591e;
        JSONObject key = hVar != null ? hVar.getKey() : new JSONObject();
        try {
            String string = this.f28589c.getString("cached_device", "{}");
            if (string != null) {
                str = string;
            }
            jSONObject = new JSONObject(str);
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: r5.l3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.v0.h();
                }
            }, 4, (Object) null);
        }
        u0 u0Var = f28587f;
        SharedPreferences sharedPreferences = this.f28590d;
        int i10 = Build.VERSION.SDK_INT;
        final boolean zA = u0Var.a(jSONObject, key, sharedPreferences.getInt("ldov", i10), i10);
        final boolean z10 = this.f28590d.getBoolean("sfone", false);
        if (z10 || zA) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.m3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.v0.a(z10, zA);
                }
            }, 7, (Object) null);
            jsonObject = u0Var.a(new JSONObject(), key);
        } else {
            jsonObject = u0Var.a(jSONObject, key);
        }
        if (jsonObject == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.n3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.v0.i();
                }
            }, 7, (Object) null);
            return this.f28591e;
        }
        BrazeConfigurationProvider configurationProvider = this.f28588b;
        AbstractC4862t.e(configurationProvider, "configurationProvider");
        AbstractC4862t.e(jsonObject, "jsonObject");
        AbstractC4862t.e(configurationProvider, "configurationProvider");
        String optionalString = null;
        String optionalString2 = null;
        String str2 = null;
        String optionalString3 = null;
        String optionalString4 = null;
        String optionalString5 = null;
        Boolean boolValueOf = null;
        Boolean boolValueOf2 = null;
        String optionalString6 = null;
        Boolean boolValueOf3 = null;
        for (DeviceKey deviceKey : DeviceKey.getEntries()) {
            String key2 = deviceKey.getKey();
            switch (com.braze.models.outgoing.f.f28082a[deviceKey.ordinal()]) {
                case 1:
                    optionalString5 = JsonUtils.getOptionalString(jsonObject, key2);
                    break;
                case 2:
                    optionalString2 = JsonUtils.getOptionalString(jsonObject, key2);
                    break;
                case 3:
                    optionalString = JsonUtils.getOptionalString(jsonObject, key2);
                    break;
                case 4:
                    optionalString4 = JsonUtils.getOptionalString(jsonObject, key2);
                    break;
                case 5:
                    String optionalString7 = JsonUtils.getOptionalString(jsonObject, key2);
                    if (optionalString7 != null && !F.k0(optionalString7)) {
                        str2 = optionalString7;
                    }
                    break;
                case 6:
                    optionalString3 = JsonUtils.getOptionalString(jsonObject, key2);
                    break;
                case 7:
                    if (jsonObject.has(key2)) {
                        boolValueOf = Boolean.valueOf(jsonObject.optBoolean(key2, true));
                    }
                    C4015H c4015h = C4015H.f34254a;
                    break;
                case 8:
                    if (jsonObject.has(key2)) {
                        boolValueOf2 = Boolean.valueOf(jsonObject.optBoolean(key2, false));
                    }
                    C4015H c4015h2 = C4015H.f34254a;
                    break;
                case 9:
                    optionalString6 = JsonUtils.getOptionalString(jsonObject, key2);
                    break;
                case 10:
                    if (jsonObject.has(key2)) {
                        boolValueOf3 = Boolean.valueOf(jsonObject.optBoolean(key2));
                    }
                    C4015H c4015h3 = C4015H.f34254a;
                    break;
                default:
                    throw new C4032o();
            }
        }
        com.braze.models.outgoing.h hVar2 = new com.braze.models.outgoing.h(configurationProvider, optionalString, optionalString2, str2, optionalString3, optionalString4, optionalString5, boolValueOf, boolValueOf2, optionalString6, boolValueOf3);
        if (zA) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.o3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.v0.j();
                }
            }, 6, (Object) null);
            hVar2.f28095l = true;
        }
        return hVar2;
    }

    @Override // com.braze.storage.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void c(com.braze.models.outgoing.h outboundObject, boolean z10) {
        String str = "{}";
        AbstractC4862t.e(outboundObject, "outboundObject");
        if (z10) {
            try {
                String string = this.f28589c.getString("cached_device", "{}");
                if (string != null) {
                    str = string;
                }
                this.f28589c.edit().putString("cached_device", JsonUtils.mergeJsonObjects(new JSONObject(str), outboundObject.getKey()).toString()).apply();
                this.f28590d.edit().putBoolean("sfone", false).putInt("ldov", Build.VERSION.SDK_INT).apply();
            } catch (JSONException e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: r5.k3
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.storage.v0.d();
                    }
                }, 4, (Object) null);
            }
        }
    }
}
