package com.braze.requests;

import gc.C4207u;
import gc.P;
import java.util.LinkedHashMap;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f28312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f28313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f28314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n f28315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n f28316f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final n f28317g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final n f28318h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final n f28319i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final n f28320j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final n f28321k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final n f28322l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final n f28323m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final n f28324n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final n f28325o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ n[] f28326p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28327a;

    static {
        n nVar = new n("CONTENT_CARD_SYNC", 0, "content_cards/sync");
        f28314d = nVar;
        n nVar2 = new n("FEATURE_FLAG_SYNC", 1, "feature_flags/sync");
        f28315e = nVar2;
        n nVar3 = new n("V3_DATA", 2, "data");
        f28316f = nVar3;
        n nVar4 = new n("TEMPLATE_REQUEST", 3, "template");
        f28317g = nVar4;
        n nVar5 = new n("PUSH_DELIVERY_EVENTS", 4, "push/delivery_events");
        f28318h = nVar5;
        n nVar6 = new n("GEOFENCE_REFRESH", 5, "geofence/request");
        f28319i = nVar6;
        n nVar7 = new n("GEOFENCE_REPORT", 6, "geofence/report");
        f28320j = nVar7;
        n nVar8 = new n("PUSH_REDELIVER", 7, "push/redeliver");
        f28321k = nVar8;
        n nVar9 = new n("BANNERS_SYNC", 8, "banners/sync");
        f28322l = nVar9;
        n nVar10 = new n("SDK_DEBUGGER_INIT", 9, "debugger/init");
        f28323m = nVar10;
        n nVar11 = new n("SDK_DEBUGGER_LOG", 10, "debugger/log");
        f28324n = nVar11;
        n nVar12 = new n("DUST_CONFIG", 11, "dust/config");
        f28325o = nVar12;
        n[] nVarArr = {nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7, nVar8, nVar9, nVar10, nVar11, nVar12};
        f28326p = nVarArr;
        InterfaceC5276a interfaceC5276aA = AbstractC5277b.a(nVarArr);
        f28312b = new m();
        LinkedHashMap linkedHashMap = new LinkedHashMap(Bc.k.e(P.e(C4207u.v(interfaceC5276aA, 10)), 16));
        for (Object obj : interfaceC5276aA) {
            linkedHashMap.put(((n) obj).f28327a, obj);
        }
        f28313c = linkedHashMap;
    }

    public n(String str, int i10, String str2) {
        this.f28327a = str2;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f28326p.clone();
    }
}
