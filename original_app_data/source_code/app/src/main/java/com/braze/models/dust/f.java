package com.braze.models.dust;

import oc.AbstractC5277b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f28047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f28048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f28049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f28050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ f[] f28051e;

    static {
        f fVar = new f("UNKNOWN", 0, "");
        f28047a = fVar;
        f fVar2 = new f("CONTENT_CARD_REFRESH", 1, "ccr");
        f28048b = fVar2;
        f fVar3 = new f("TIME_TO_LIVE", 2, "ttl");
        f28049c = fVar3;
        f fVar4 = new f("DISCONNECT_AND_RETRY", 3, "ddr");
        f28050d = fVar4;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4};
        f28051e = fVarArr;
        AbstractC5277b.a(fVarArr);
    }

    public f(String str, int i10, String str2) {
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f28051e.clone();
    }
}
