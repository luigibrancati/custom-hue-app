package com.braze.triggers.events;

import com.braze.models.k;
import com.braze.models.outgoing.BrazeProperties;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f extends j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f28714f;

    public f(String str, BrazeProperties brazeProperties, k kVar) {
        super(brazeProperties, kVar);
        this.f28714f = str;
    }

    @Override // com.braze.triggers.events.b
    public final String a() {
        return "purchase";
    }
}
