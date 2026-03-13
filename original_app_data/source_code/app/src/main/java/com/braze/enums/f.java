package com.braze.enums;

import oc.AbstractC5277b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f27659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f27660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ f[] f27661c;

    static {
        f fVar = new f("OPEN_SESSION", 0);
        f27659a = fVar;
        f fVar2 = new f("NO_SESSION", 1);
        f27660b = fVar2;
        f[] fVarArr = {fVar, fVar2};
        f27661c = fVarArr;
        AbstractC5277b.a(fVarArr);
    }

    public f(String str, int i10) {
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f27661c.clone();
    }
}
