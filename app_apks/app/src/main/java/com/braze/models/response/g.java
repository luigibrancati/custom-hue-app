package com.braze.models.response;

import com.braze.managers.d1;
import com.braze.managers.h1;
import com.braze.managers.r;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.requests.o;
import com.braze.requests.w;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONArray;
import org.json.JSONObject;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class g extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f28125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f28126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f28127e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f28128f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InAppMessageBase f28129g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f28130h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m f28131i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f28132j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final JSONArray f28133k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f28134l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f28135m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f28136n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f28137o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final JSONObject f28138p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d1 f28139q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(o request, com.braze.communication.d connectionResult, r brazeManager) {
        c cVar;
        m mVar;
        super(request, connectionResult);
        AbstractC4862t.e(request, "request");
        AbstractC4862t.e(connectionResult, "connectionResult");
        AbstractC4862t.e(brazeManager, "brazeManager");
        JSONObject jsonObject = connectionResult.f27523c;
        jsonObject = jsonObject == null ? new JSONObject() : jsonObject;
        this.f28125c = jsonObject;
        AbstractC4862t.e(jsonObject, "jsonObject");
        AbstractC4862t.e(request, "request");
        String optionalString = JsonUtils.getOptionalString(jsonObject, "error");
        JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject("auth_error");
        d hVar = jSONObjectOptJSONObject != null ? new h(request, jSONObjectOptJSONObject.optInt("error_code", -1), JsonUtils.getOptionalString(jSONObjectOptJSONObject, "reason"), optionalString) : AbstractC4862t.a(optionalString, "invalid_api_key") ? new e(optionalString, request) : optionalString != null ? new b(optionalString, request) : null;
        this.f28126d = hVar;
        AbstractC4862t.e(jsonObject, "jsonObject");
        AbstractC4862t.e(request, "request");
        JSONObject jSONObjectOptJSONObject2 = jsonObject.optJSONObject("optional_auth_error");
        this.f28127e = jSONObjectOptJSONObject2 != null ? new i(request, jSONObjectOptJSONObject2.optInt("error_code", -1), JsonUtils.getOptionalString(jSONObjectOptJSONObject2, "reason")) : null;
        this.f28133k = jsonObject.optJSONArray("feature_flags");
        this.f28137o = jsonObject.optLong("last_sync_at", -1L);
        this.f28138p = jsonObject.optJSONObject("banners");
        if (hVar == null && (request instanceof com.braze.requests.f)) {
            try {
                cVar = new c(jsonObject);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) e10, false, new InterfaceC6082a() { // from class: k5.a
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.models.response.g.a(this.f39256a);
                    }
                }, 4, (Object) null);
                cVar = null;
            }
        } else {
            cVar = null;
        }
        this.f28128f = cVar;
        ArrayList arrayListA = com.braze.triggers.utils.c.f28761a.a(this.f28125c.optJSONArray("triggers"), brazeManager);
        this.f28130h = arrayListA;
        if (arrayListA != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: k5.b
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.models.response.g.b(this.f39257a);
                }
            }, 6, (Object) null);
        }
        final JSONObject jSONObjectOptJSONObject3 = this.f28125c.optJSONObject("config");
        if (jSONObjectOptJSONObject3 != null) {
            try {
                mVar = new m(jSONObjectOptJSONObject3);
                try {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: k5.c
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return com.braze.models.response.g.a(jSONObjectOptJSONObject3);
                        }
                    }, 6, (Object) null);
                } catch (Exception e11) {
                    e = e11;
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) e, false, new InterfaceC6082a() { // from class: k5.d
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return com.braze.models.response.g.b(jSONObjectOptJSONObject3);
                        }
                    }, 4, (Object) null);
                }
            } catch (Exception e12) {
                e = e12;
                mVar = null;
            }
        } else {
            mVar = null;
        }
        this.f28131i = mVar;
        this.f28129g = com.braze.triggers.utils.c.a(this.f28125c.optJSONObject("templated_message"), brazeManager);
        JSONArray jSONArrayOptJSONArray = this.f28125c.optJSONArray("geofences");
        this.f28132j = jSONArrayOptJSONArray != null ? com.braze.support.o.a(jSONArrayOptJSONArray) : null;
        if (request instanceof com.braze.requests.h) {
            this.f28134l = JsonUtils.getOptionalString(this.f28125c, "mite");
            this.f28135m = JsonUtils.getOptionalString(this.f28125c, "host");
            this.f28136n = JsonUtils.getOptionalString(this.f28125c, "auth");
        } else {
            this.f28134l = null;
            this.f28135m = null;
            this.f28136n = null;
        }
        this.f28139q = request instanceof w ? h1.f27875k.a(this.f28125c, true) : null;
    }

    public static final String a(g gVar) {
        return "Encountered Exception processing Content Cards response: " + gVar.f28125c;
    }

    public static final String b(g gVar) {
        return "Found " + gVar.f28130h.size() + " triggered actions in server response.";
    }

    public static final String a(JSONObject jSONObject) {
        return "Got server config: " + JsonUtils.getPrettyPrintedString(jSONObject);
    }

    public static final String b(JSONObject jSONObject) {
        return "Encountered Exception processing server config: " + jSONObject;
    }
}
