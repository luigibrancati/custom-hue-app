package com.braze.models.outgoing;

import Od.F;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DeviceKey;
import com.braze.models.IPutIntoJson;
import com.braze.models.m;
import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONException;
import org.json.JSONObject;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class h implements IPutIntoJson, m {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final g f28083n = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BrazeConfigurationProvider f28084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f28086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f28087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f28088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f28089f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f28090g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f28091h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Boolean f28092i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f28093j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Boolean f28094k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f28095l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f28096m;

    public h(BrazeConfigurationProvider configurationProvider, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, String str7, Boolean bool3) {
        AbstractC4862t.e(configurationProvider, "configurationProvider");
        this.f28084a = configurationProvider;
        this.f28085b = str;
        this.f28086c = str2;
        this.f28087d = str3;
        this.f28088e = str4;
        this.f28089f = str5;
        this.f28090g = str6;
        this.f28091h = bool;
        this.f28092i = bool2;
        this.f28093j = str7;
        this.f28094k = bool3;
        this.f28096m = true;
    }

    public static final String c() {
        return "Caught exception creating device Json.";
    }

    @Override // com.braze.models.m
    public final boolean isEmpty() {
        return getKey().length() == 0;
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut */
    public final JSONObject getKey() {
        JSONObject jSONObject = new JSONObject();
        try {
            g gVar = f28083n;
            gVar.a(this.f28084a, jSONObject, DeviceKey.ANDROID_VERSION, this.f28085b);
            gVar.a(this.f28084a, jSONObject, DeviceKey.CARRIER, this.f28086c);
            gVar.a(this.f28084a, jSONObject, DeviceKey.BRAND, this.f28087d);
            gVar.a(this.f28084a, jSONObject, DeviceKey.MODEL, this.f28088e);
            gVar.a(this.f28084a, jSONObject, DeviceKey.LOCALE, this.f28089f);
            if (this.f28096m) {
                gVar.a(this.f28084a, jSONObject, DeviceKey.NOTIFICATIONS_ENABLED, this.f28091h);
            }
            gVar.a(this.f28084a, jSONObject, DeviceKey.IS_BACKGROUND_RESTRICTED, this.f28092i);
            gVar.a(this.f28084a, jSONObject, DeviceKey.GOOGLE_ADVERTISING_ID, this.f28093j);
            Boolean bool = this.f28094k;
            if (bool != null) {
                gVar.a(this.f28084a, jSONObject, DeviceKey.AD_TRACKING_ENABLED, bool);
            }
            String str = this.f28090g;
            if (str != null && !F.k0(str)) {
                gVar.a(this.f28084a, jSONObject, DeviceKey.TIMEZONE, this.f28090g);
            }
            return jSONObject;
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: h5.j
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.models.outgoing.h.c();
                }
            }, 4, (Object) null);
            return jSONObject;
        }
    }
}
