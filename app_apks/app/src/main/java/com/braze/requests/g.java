package com.braze.requests;

import Od.F;
import com.braze.enums.BrazeSdkMetadata;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DeviceKey;
import com.braze.enums.SdkFlavor;
import com.braze.events.internal.c0;
import com.braze.events.internal.d0;
import com.braze.models.outgoing.l;
import com.braze.storage.b3;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import gc.C4179C;
import gc.C4207u;
import io.sentry.protocol.App;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class g extends b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public com.braze.models.outgoing.k f28298k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SdkFlavor f28299l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public l f28300m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public com.braze.models.b f28301n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public EnumSet f28302o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f28303p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f28304q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n f28305r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(b3 serverConfigStorageProvider, String urlBase, com.braze.models.outgoing.k outboundRespondWith) {
        super(new com.braze.requests.util.d(urlBase + "data"), (String) null, serverConfigStorageProvider, 10);
        AbstractC4862t.e(serverConfigStorageProvider, "serverConfigStorageProvider");
        AbstractC4862t.e(urlBase, "urlBase");
        AbstractC4862t.e(outboundRespondWith, "outboundRespondWith");
        this.f28298k = outboundRespondWith;
        this.f28305r = n.f28316f;
    }

    public static final String d() {
        return "Remote notifications enabled field set on request, but push token field not set. Not sending remote notifications enabled field.";
    }

    public static final String l() {
        return "Experienced JSONException while retrieving parameters. Returning empty object.";
    }

    public static final String m() {
        return "Trigger dispatch completed. Alerting subscribers.";
    }

    @Override // com.braze.requests.o
    public final boolean a() {
        ArrayList<com.braze.models.m> arrayList = new ArrayList();
        arrayList.add(this.f28225i);
        arrayList.add(this.f28300m);
        arrayList.add(this.f28301n);
        arrayList.add(this.f28298k);
        if (!arrayList.isEmpty()) {
            for (com.braze.models.m mVar : arrayList) {
                if (mVar != null && !mVar.isEmpty()) {
                    return false;
                }
            }
        }
        ArrayList<com.braze.models.m> arrayList2 = new ArrayList();
        arrayList2.add(this.f28225i);
        for (com.braze.models.m mVar2 : arrayList2) {
            if (mVar2 != null && !mVar2.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.braze.requests.b, com.braze.requests.o
    public final JSONObject b() {
        l lVar;
        com.braze.models.outgoing.h hVar = this.f28225i;
        if (hVar == null || !hVar.getPropertiesJSONObject().has(DeviceKey.NOTIFICATIONS_ENABLED.getKey()) || ((lVar = this.f28300m) != null && lVar.f28105a.has(DataStoreKey.PUSH_TOKEN.getKey()))) {
            com.braze.models.outgoing.h hVar2 = this.f28225i;
            if (hVar2 != null) {
                hVar2.f28096m = true;
            }
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: n5.C
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.requests.g.d();
                }
            }, 7, (Object) null);
            com.braze.models.outgoing.h hVar3 = this.f28225i;
            if (hVar3 != null) {
                hVar3.f28096m = false;
            }
        }
        JSONObject jSONObjectB = super.b();
        if (jSONObjectB == null) {
            return null;
        }
        try {
            String str = this.f28303p;
            if (str != null) {
                jSONObjectB.put(App.JsonKeys.APP_VERSION, str);
            }
            String str2 = this.f28304q;
            if (str2 != null && !F.k0(str2)) {
                jSONObjectB.put("app_version_code", this.f28304q);
            }
            l lVar2 = this.f28300m;
            if (lVar2 != null && !lVar2.isEmpty()) {
                JSONArray jsonArrayForJsonPut = lVar2.f28106b;
                AbstractC4862t.d(jsonArrayForJsonPut, "jsonArrayForJsonPut");
                jSONObjectB.put("attributes", jsonArrayForJsonPut);
            }
            com.braze.models.b bVar = this.f28301n;
            if (bVar != null && !bVar.f28035b) {
                jSONObjectB.put("events", JsonUtils.constructJsonArray(bVar.f28034a));
            }
            SdkFlavor sdkFlavor = this.f28299l;
            if (sdkFlavor != null) {
                jSONObjectB.put("sdk_flavor", sdkFlavor.getPropertiesJSONObject());
            }
            EnumSet set = this.f28302o;
            if (set != null) {
                BrazeSdkMetadata.Companion.getClass();
                AbstractC4862t.e(set, "set");
                ArrayList arrayList = new ArrayList(C4207u.v(set, 10));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(((BrazeSdkMetadata) it.next()).jsonKey);
                }
                jSONObjectB.put("sdk_metadata", new JSONArray((Collection) C4179C.I0(arrayList)));
            }
            jSONObjectB.put("respond_with", this.f28298k.getPropertiesJSONObject());
            return jSONObjectB;
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) e10, false, new InterfaceC6082a() { // from class: n5.D
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.requests.g.l();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    @Override // com.braze.requests.o
    public final n c() {
        return this.f28305r;
    }

    @Override // com.braze.requests.b, com.braze.requests.p
    public final void a(com.braze.events.d internalPublisher) {
        AbstractC4862t.e(internalPublisher, "internalPublisher");
        if (this.f28298k.c()) {
            internalPublisher.b(new d0(this), d0.class);
        }
    }

    @Override // com.braze.requests.b, com.braze.requests.p
    public final void a(com.braze.events.e internalPublisher) {
        AbstractC4862t.e(internalPublisher, "internalPublisher");
        if (this.f28298k.c()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: n5.E
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.requests.g.m();
                }
            }, 7, (Object) null);
            ((com.braze.events.d) internalPublisher).b(new c0(this), c0.class);
        }
    }

    @Override // com.braze.requests.b, com.braze.requests.o
    public final void a(HashMap existingHeaders) {
        AbstractC4862t.e(existingHeaders, "existingHeaders");
        super.a(existingHeaders);
        if (!this.f28298k.isEmpty() && this.f28298k.c()) {
            existingHeaders.put("X-Braze-TriggersRequest", "true");
            existingHeaders.put("X-Braze-DataRequest", "true");
        }
    }
}
