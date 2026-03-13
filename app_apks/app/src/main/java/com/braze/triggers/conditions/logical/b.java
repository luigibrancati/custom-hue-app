package com.braze.triggers.conditions.logical;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements com.braze.triggers.conditions.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f28691b = BrazeLogger.getBrazeLogTag((Class<?>) b.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f28692a;

    public b(ArrayList arrayList) {
        this.f28692a = arrayList;
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut */
    public final JSONArray getJsonObject() {
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator it = this.f28692a.iterator();
            while (it.hasNext()) {
                jSONArray.put(((com.braze.triggers.conditions.c) it.next()).getJsonObject());
            }
            return jSONArray;
        } catch (Exception e10) {
            BrazeLogger.e(f28691b, "Caught exception creating Json.", e10);
            return jSONArray;
        }
    }
}
