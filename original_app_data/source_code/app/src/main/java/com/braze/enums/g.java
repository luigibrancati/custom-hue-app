package com.braze.enums;

import com.braze.models.IPutIntoJson;
import fc.C4032o;
import oc.AbstractC5277b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class g implements IPutIntoJson {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f27662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f27663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ g[] f27664c;

    static {
        g gVar = new g("SUBSCRIBED", 0);
        f27662a = gVar;
        g gVar2 = new g("UNSUBSCRIBED", 1);
        f27663b = gVar2;
        g[] gVarArr = {gVar, gVar2};
        f27664c = gVarArr;
        AbstractC5277b.a(gVarArr);
    }

    public g(String str, int i10) {
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f27664c.clone();
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut */
    public final Object getJsonKey() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "subscribed";
        }
        if (iOrdinal == 1) {
            return "unsubscribed";
        }
        throw new C4032o();
    }
}
