package com.braze.enums;

import oc.AbstractC5277b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f27654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f27655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f27656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f27657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ e[] f27658e;

    static {
        e eVar = new e("NONE", 0);
        f27654a = eVar;
        e eVar2 = new e("BAD", 1);
        f27655b = eVar2;
        e eVar3 = new e("GOOD", 2);
        f27656c = eVar3;
        e eVar4 = new e("GREAT", 3);
        f27657d = eVar4;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4};
        f27658e = eVarArr;
        AbstractC5277b.a(eVarArr);
    }

    public e(String str, int i10) {
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f27658e.clone();
    }
}
