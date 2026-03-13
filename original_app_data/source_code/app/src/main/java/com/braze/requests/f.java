package com.braze.requests;

import Od.F;
import com.braze.storage.b3;
import com.braze.support.BrazeLogger;
import io.sentry.TraceContext;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONException;
import org.json.JSONObject;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f extends b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f28244k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f28245l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f28246m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final n f28247n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b3 serverConfigStorageProvider, String urlBase, long j10, long j11, String str, int i10, c requestInitiatedBy) {
        super(new com.braze.requests.util.d(urlBase + "content_cards/sync"), str, serverConfigStorageProvider, requestInitiatedBy);
        AbstractC4862t.e(serverConfigStorageProvider, "serverConfigStorageProvider");
        AbstractC4862t.e(urlBase, "urlBase");
        AbstractC4862t.e(requestInitiatedBy, "requestInitiatedBy");
        this.f28244k = j10;
        this.f28245l = j11;
        this.f28246m = i10;
        this.f28247n = n.f28314d;
    }

    public static final String l() {
        return "Experienced JSONException while creating Content Cards request. Returning null.";
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
            jSONObjectB.put("last_full_sync_at", this.f28245l);
            jSONObjectB.put("last_card_updated_at", this.f28244k);
            String str = this.f28218b;
            if (str != null && !F.k0(str)) {
                jSONObjectB.put(TraceContext.JsonKeys.USER_ID, this.f28218b);
                return jSONObjectB;
            }
            return jSONObjectB;
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) e10, false, new InterfaceC6082a() { // from class: n5.B
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.requests.f.l();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    @Override // com.braze.requests.o
    public final n c() {
        return this.f28247n;
    }

    @Override // com.braze.requests.b, com.braze.requests.o
    public final void a(HashMap existingHeaders) {
        AbstractC4862t.e(existingHeaders, "existingHeaders");
        super.a(existingHeaders);
        existingHeaders.put("X-Braze-DataRequest", "true");
        existingHeaders.put("X-Braze-ContentCardsRequest", "true");
        existingHeaders.put("BRAZE-SYNC-RETRY-COUNT", String.valueOf(this.f28246m));
    }
}
