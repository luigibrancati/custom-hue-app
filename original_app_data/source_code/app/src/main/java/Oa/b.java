package Oa;

import Oa.a;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f12098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f12099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f12100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int[] f12101d;

    static {
        int[] iArr = new int[a.c.values().length];
        f12098a = iArr;
        a.c cVar = a.c.STOPPED;
        iArr[cVar.ordinal()] = 1;
        int[] iArr2 = new int[a.c.values().length];
        f12099b = iArr2;
        a.c cVar2 = a.c.ACTIVATED;
        iArr2[cVar2.ordinal()] = 1;
        a.c cVar3 = a.c.STARTED;
        iArr2[cVar3.ordinal()] = 2;
        iArr2[cVar.ordinal()] = 3;
        int[] iArr3 = new int[a.c.values().length];
        f12100c = iArr3;
        iArr3[cVar3.ordinal()] = 1;
        iArr3[cVar2.ordinal()] = 2;
        iArr3[cVar.ordinal()] = 3;
        int[] iArr4 = new int[a.c.values().length];
        f12101d = iArr4;
        iArr4[cVar2.ordinal()] = 1;
        iArr4[cVar3.ordinal()] = 2;
        iArr4[cVar.ordinal()] = 3;
    }
}
