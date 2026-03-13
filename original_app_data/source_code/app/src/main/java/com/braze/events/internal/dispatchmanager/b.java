package com.braze.events.internal.dispatchmanager;

import oc.AbstractC5277b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f27713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f27714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f27715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f27716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b[] f27717e;

    static {
        b bVar = new b("ADD_PENDING_BRAZE_EVENT", 0);
        f27713a = bVar;
        b bVar2 = new b("ADD_BRAZE_EVENTS", 1);
        f27714b = bVar2;
        b bVar3 = new b("FLUSH_PENDING_BRAZE_EVENTS", 2);
        f27715c = bVar3;
        b bVar4 = new b("ADD_REQUEST", 3);
        f27716d = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        f27717e = bVarArr;
        AbstractC5277b.a(bVarArr);
    }

    public b(String str, int i10) {
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f27717e.clone();
    }
}
