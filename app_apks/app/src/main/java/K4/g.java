package K4;

import io.sentry.HttpStatusCodeRange;
import kotlin.jvm.internal.AbstractC4854k;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    private final Bc.f range;
    public static final g SUCCESS = new g("SUCCESS", 0, 200, new Bc.f(200, 299));
    public static final g BAD_REQUEST = new g("BAD_REQUEST", 1, 400, null, 2, null);
    public static final g TIMEOUT = new g("TIMEOUT", 2, 408, null, 2, null);
    public static final g PAYLOAD_TOO_LARGE = new g("PAYLOAD_TOO_LARGE", 3, 413, null, 2, null);
    public static final g TOO_MANY_REQUESTS = new g("TOO_MANY_REQUESTS", 4, 429, null, 2, null);
    public static final g FAILED = new g("FAILED", 5, 500, new Bc.f(500, HttpStatusCodeRange.DEFAULT_MAX));

    static {
        g[] gVarArrA = a();
        $VALUES = gVarArrA;
        $ENTRIES = AbstractC5277b.a(gVarArrA);
    }

    public g(String str, int i10, int i11, Bc.f fVar) {
        this.range = fVar;
    }

    public static final /* synthetic */ g[] a() {
        return new g[]{SUCCESS, BAD_REQUEST, TIMEOUT, PAYLOAD_TOO_LARGE, TOO_MANY_REQUESTS, FAILED};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    public final Bc.f b() {
        return this.range;
    }

    public final int j() {
        return this.range.c();
    }

    public /* synthetic */ g(String str, int i10, int i11, Bc.f fVar, int i12, AbstractC4854k abstractC4854k) {
        this(str, i10, i11, (i12 & 2) != 0 ? new Bc.f(i11, i11) : fVar);
    }
}
