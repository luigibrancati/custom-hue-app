package com.braze.configuration;

import oc.AbstractC5277b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f27571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f27572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f27573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f27574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f27575f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f27576g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ d[] f27577h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27578a;

    static {
        d dVar = new d("INTEGER", 0, "integer");
        f27571b = dVar;
        d dVar2 = new d("COLOR", 1, "color");
        f27572c = dVar2;
        d dVar3 = new d("BOOLEAN", 2, "bool");
        f27573d = dVar3;
        d dVar4 = new d("STRING", 3, "string");
        f27574e = dVar4;
        d dVar5 = new d("DRAWABLE_IDENTIFIER", 4, "drawable");
        f27575f = dVar5;
        d dVar6 = new d("STRING_ARRAY", 5, "array");
        f27576g = dVar6;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6};
        f27577h = dVarArr;
        AbstractC5277b.a(dVarArr);
    }

    public d(String str, int i10, String str2) {
        this.f27578a = str2;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f27577h.clone();
    }
}
