package com.braze.models.outgoing.event.push;

import com.braze.models.k;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static String a(k event) throws JSONException {
        AbstractC4862t.e(event, "event");
        String string = ((com.braze.models.outgoing.event.b) event).f28074b.getString("cid");
        AbstractC4862t.d(string, "getString(...)");
        return string;
    }
}
