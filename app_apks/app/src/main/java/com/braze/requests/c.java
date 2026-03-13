package com.braze.requests;

import oc.AbstractC5277b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f28227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f28228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f28229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f28230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ c[] f28231f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28232a;

    static {
        c cVar = new c("SESSION_START", 0, "ss");
        f28227b = cVar;
        c cVar2 = new c("DUST_INITIATED", 1, "di");
        f28228c = cVar2;
        c cVar3 = new c("CLIENT_INITIATED", 2, "ci");
        f28229d = cVar3;
        c cVar4 = new c("UNKNOWN", 3, "unknown");
        f28230e = cVar4;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4};
        f28231f = cVarArr;
        AbstractC5277b.a(cVarArr);
    }

    public c(String str, int i10, String str2) {
        this.f28232a = str2;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f28231f.clone();
    }
}
