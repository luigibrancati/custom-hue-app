package com.braze.storage;

import android.content.Context;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y2 f28603a;

    public w2(Context context, String userId, String apiKey) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(userId, "userId");
        AbstractC4862t.e(apiKey, "apiKey");
        this.f28603a = new y2(context, userId, apiKey);
    }
}
