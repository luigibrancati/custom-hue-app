package com.braze.requests.framework;

import oc.AbstractC5277b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f28288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f28289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f28290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f28291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f28292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ i[] f28293f;

    static {
        i iVar = new i("PENDING_START", 0);
        f28288a = iVar;
        i iVar2 = new i("PENDING_RETRY", 1);
        f28289b = iVar2;
        i iVar3 = new i("IN_FLIGHT", 2);
        f28290c = iVar3;
        i iVar4 = new i("BATCHED", 3);
        f28291d = iVar4;
        i iVar5 = new i("COMPLETE", 4);
        f28292e = iVar5;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5};
        f28293f = iVarArr;
        AbstractC5277b.a(iVarArr);
    }

    public i(String str, int i10) {
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f28293f.clone();
    }

    public final boolean a() {
        return this == f28288a || this == f28289b;
    }
}
