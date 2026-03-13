package com.braze.requests;

import Od.F;
import com.braze.storage.b3;
import com.braze.support.BrazeLogger;
import io.sentry.TraceContext;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONException;
import org.json.JSONObject;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class h extends b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final n f28306k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(b3 serverConfigStorageProvider, String urlBase, String str) {
        super(new com.braze.requests.util.d(urlBase + "dust/config"), str, serverConfigStorageProvider, 8);
        AbstractC4862t.e(serverConfigStorageProvider, "serverConfigStorageProvider");
        AbstractC4862t.e(urlBase, "urlBase");
        this.f28306k = n.f28325o;
    }

    public static final String l() {
        return "Experienced JSONException while creating DUST config request. Returning null.";
    }

    @Override // com.braze.requests.o
    public final boolean a() {
        return false;
    }

    @Override // com.braze.requests.b, com.braze.requests.o
    public final JSONObject b() {
        JSONObject jSONObjectB = super.b();
        if (jSONObjectB == null) {
            return null;
        }
        try {
            String str = this.f28218b;
            if (str != null && !F.k0(str)) {
                jSONObjectB.put(TraceContext.JsonKeys.USER_ID, this.f28218b);
                return jSONObjectB;
            }
            return jSONObjectB;
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) e10, false, new InterfaceC6082a() { // from class: n5.F
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.requests.h.l();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    @Override // com.braze.requests.o
    public final n c() {
        return this.f28306k;
    }
}
