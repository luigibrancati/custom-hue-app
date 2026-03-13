package com.braze.triggers.actions;

import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class g implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.braze.triggers.config.c f28670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f28671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.braze.triggers.utils.b f28672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f28673e;

    public g(JSONObject json) throws JSONException {
        AbstractC4862t.e(json, "json");
        ArrayList arrayList = new ArrayList();
        this.f28673e = arrayList;
        this.f28669a = json.getString("id");
        this.f28670b = new com.braze.triggers.config.c(json);
        JSONArray jSONArray = json.getJSONArray("trigger_condition");
        if (jSONArray.length() > 0) {
            com.braze.triggers.utils.c cVar = com.braze.triggers.utils.c.f28761a;
            AbstractC4862t.b(jSONArray);
            arrayList.addAll(com.braze.triggers.utils.c.a(jSONArray));
        }
        this.f28671c = json.optBoolean("prefetch", true);
    }

    public static final String a(g gVar, com.braze.triggers.events.b bVar) {
        return "Triggered action " + gVar.f28669a + " not eligible to be triggered by " + bVar.a() + " event. Current device time outside triggered action time window.";
    }

    public final boolean b(final com.braze.triggers.events.b event) {
        AbstractC4862t.e(event, "event");
        if ((this.f28670b.f28694a != -1 && DateTimeUtils.nowInSeconds() <= this.f28670b.f28694a) || (this.f28670b.f28695b != -1 && DateTimeUtils.nowInSeconds() >= this.f28670b.f28695b)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: u5.l
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.triggers.actions.g.a(this.f45078a, event);
                }
            }, 7, (Object) null);
            return false;
        }
        Iterator it = this.f28673e.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (((com.braze.triggers.conditions.d) it.next()).a(event)) {
                break;
            }
            i10++;
        }
        return i10 != -1;
    }

    public final String c() {
        return this.f28669a;
    }

    public final com.braze.triggers.config.c d() {
        return this.f28670b;
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut */
    public JSONObject getJsonKey() {
        try {
            JSONObject jsonKey = this.f28670b.getJsonKey();
            if (jsonKey == null) {
                return null;
            }
            jsonKey.put("id", this.f28669a);
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f28673e.iterator();
            while (it.hasNext()) {
                jSONArray.put(((com.braze.triggers.conditions.d) it.next()).getJsonKey());
            }
            jsonKey.put("trigger_condition", jSONArray);
            jsonKey.put("prefetch", this.f28671c);
            return jsonKey;
        } catch (JSONException unused) {
            return null;
        }
    }
}
