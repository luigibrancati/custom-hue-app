package com.braze.requests.util;

import android.content.Context;
import com.braze.storage.j1;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1 f28339a;

    public a(Context context) {
        AbstractC4862t.e(context, "context");
        this.f28339a = new j1(context);
    }

    public static String a(String str) {
        return "uri-at-" + str.hashCode();
    }

    public static String b(String str) {
        return "uri-" + str.hashCode();
    }
}
