package com.braze.storage;

import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class o1 {
    public static String a(com.braze.models.k event) throws JSONException {
        AbstractC4862t.e(event, "event");
        int i10 = com.braze.models.outgoing.event.push.c.f28081j;
        String strA = com.braze.models.outgoing.event.push.b.a(event);
        return ((com.braze.models.outgoing.event.b) event).d() + strA;
    }
}
