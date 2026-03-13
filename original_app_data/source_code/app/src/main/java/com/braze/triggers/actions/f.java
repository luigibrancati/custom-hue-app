package com.braze.triggers.actions;

import Bc.k;
import Nd.t;
import android.content.Context;
import com.braze.managers.r;
import com.braze.requests.y;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import fc.C4032o;
import gc.C4179C;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f extends h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r f28665g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f28666h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f28667i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f28668j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(final JSONObject json, r brazeManager) throws JSONException {
        super(json);
        AbstractC4862t.e(json, "json");
        AbstractC4862t.e(brazeManager, "brazeManager");
        this.f28667i = new ArrayList();
        this.f28668j = -1L;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: u5.i
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.triggers.actions.f.a(json);
            }
        }, 7, (Object) null);
        this.f28665g = brazeManager;
        JSONObject jSONObject = json.getJSONObject("data");
        this.f28666h = jSONObject.getString("trigger_id");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("prefetch_image_urls");
        if (jSONArrayOptJSONArray != null) {
            a(jSONArrayOptJSONArray, com.braze.triggers.enums.b.f28708b);
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("prefetch_zip_urls");
        if (jSONArrayOptJSONArray2 != null) {
            a(jSONArrayOptJSONArray2, com.braze.triggers.enums.b.f28707a);
        }
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("prefetch_file_urls");
        if (jSONArrayOptJSONArray3 != null) {
            a(jSONArrayOptJSONArray3, com.braze.triggers.enums.b.f28709c);
        }
    }

    public static final String a(JSONObject jSONObject) {
        return "Parsing templated triggered action with JSON: " + JsonUtils.getPrettyPrintedString(jSONObject);
    }

    public static final String e() {
        return "Could not convert TemplatedTriggeredAction to JSON";
    }

    @Override // com.braze.triggers.actions.a
    public final ArrayList b() {
        return new ArrayList(this.f28667i);
    }

    public final String f() {
        return this.f28666h;
    }

    @Override // com.braze.triggers.actions.g, com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut */
    public final JSONObject getKey() {
        try {
            JSONObject key = super.getKey();
            if (key == null) {
                return null;
            }
            key.put("type", "templated_iam");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("trigger_id", this.f28666h);
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            JSONArray jSONArray3 = new JSONArray();
            for (com.braze.triggers.utils.a aVar : this.f28667i) {
                int iOrdinal = aVar.f28757a.ordinal();
                if (iOrdinal == 0) {
                    jSONArray2.put(aVar.f28758b);
                } else if (iOrdinal == 1) {
                    jSONArray.put(aVar.f28758b);
                } else {
                    if (iOrdinal != 2) {
                        throw new C4032o();
                    }
                    jSONArray3.put(aVar.f28758b);
                }
            }
            jSONObject.put("prefetch_image_urls", jSONArray);
            jSONObject.put("prefetch_zip_urls", jSONArray2);
            jSONObject.put("prefetch_file_urls", jSONArray3);
            key.put("data", jSONObject);
            return key;
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: u5.k
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.triggers.actions.f.e();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    public final long g() {
        return this.f28668j;
    }

    @Override // com.braze.triggers.actions.a
    public final void a(Context context, com.braze.events.e internalEventPublisher, com.braze.triggers.events.b triggerEvent, long j10) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(internalEventPublisher, "internalEventPublisher");
        AbstractC4862t.e(triggerEvent, "triggerEvent");
        this.f28668j = j10;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: u5.j
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.triggers.actions.f.a(this.f45077a);
            }
        }, 7, (Object) null);
        r rVar = this.f28665g;
        rVar.getClass();
        AbstractC4862t.e(this, "templatedTriggeredAction");
        AbstractC4862t.e(triggerEvent, "triggerEvent");
        rVar.a(new y(rVar.f27971f, rVar.f27970e.getBaseUrlForRequests(), this, triggerEvent, rVar.f27967b));
    }

    public static final String a(f fVar) {
        return "Posting templating request after delay of " + fVar.d().d() + " seconds.";
    }

    public final void a(JSONArray jSONArray, com.braze.triggers.enums.b bVar) {
        Iterator it = t.I(t.y(C4179C.X(k.p(0, jSONArray.length())), new d(jSONArray)), new e(jSONArray)).iterator();
        while (it.hasNext()) {
            this.f28667i.add(new com.braze.triggers.utils.a(bVar, (String) it.next()));
        }
    }
}
