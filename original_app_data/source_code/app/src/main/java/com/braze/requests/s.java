package com.braze.requests;

import Od.F;
import com.braze.storage.b3;
import com.braze.support.BrazeLogger;
import io.sentry.TraceContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class s extends b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f28331k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f28332l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f28333m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final n f28334n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(b3 serverConfigStorageProvider, String urlBase, String str, ArrayList campaignIds, long j10, List dedupeIds) {
        super(new com.braze.requests.util.d(urlBase + "push/redeliver"), str, serverConfigStorageProvider, 8);
        AbstractC4862t.e(serverConfigStorageProvider, "serverConfigStorageProvider");
        AbstractC4862t.e(urlBase, "urlBase");
        AbstractC4862t.e(campaignIds, "campaignIds");
        AbstractC4862t.e(dedupeIds, "dedupeIds");
        this.f28331k = campaignIds;
        this.f28332l = j10;
        this.f28333m = dedupeIds;
        this.f28334n = n.f28321k;
    }

    public static final String l() {
        return "Experienced JSONException while creating PushMaxSendRequest. Returning null.";
    }

    public static final String m() {
        return "PushMaxSendRequest executed successfully.";
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
            }
            jSONObjectB.put("campaign_ids", new JSONArray((Collection) this.f28331k));
            jSONObjectB.put("last_sync_at", this.f28332l);
            if (!this.f28333m.isEmpty()) {
                jSONObjectB.put("dedupe_ids", new JSONArray((Collection) this.f28333m));
            }
            return jSONObjectB;
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) e10, false, new InterfaceC6082a() { // from class: n5.O
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.requests.s.l();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    @Override // com.braze.requests.o
    public final n c() {
        return this.f28334n;
    }

    @Override // com.braze.requests.b, com.braze.requests.p
    public final void a(com.braze.events.e internalPublisher, com.braze.events.e externalPublisher, com.braze.models.response.g apiResponse) {
        AbstractC4862t.e(internalPublisher, "internalPublisher");
        AbstractC4862t.e(externalPublisher, "externalPublisher");
        AbstractC4862t.e(apiResponse, "apiResponse");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: n5.N
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.requests.s.m();
            }
        }, 7, (Object) null);
        long j10 = apiResponse.f28137o;
        if (j10 != -1) {
            ((com.braze.events.d) internalPublisher).b(new com.braze.events.internal.p(j10), com.braze.events.internal.p.class);
        }
    }
}
