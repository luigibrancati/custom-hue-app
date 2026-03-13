package com.braze.models;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface k extends IPutIntoJson {
    default String a() {
        String string = ((com.braze.models.outgoing.event.b) this).getJsonKey().toString();
        AbstractC4862t.d(string, "toString(...)");
        return string;
    }
}
