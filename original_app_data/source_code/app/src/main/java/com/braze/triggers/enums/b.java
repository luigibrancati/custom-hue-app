package com.braze.triggers.enums;

import oc.AbstractC5277b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f28707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f28708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f28709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b[] f28710d;

    static {
        b bVar = new b("ZIP", 0);
        f28707a = bVar;
        b bVar2 = new b("IMAGE", 1);
        f28708b = bVar2;
        b bVar3 = new b("FILE", 2);
        f28709c = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        f28710d = bVarArr;
        AbstractC5277b.a(bVarArr);
    }

    public b(String str, int i10) {
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f28710d.clone();
    }
}
