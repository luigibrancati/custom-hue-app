package cd;

import gc.C4206t;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: cd.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C3109k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3115q f26555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f26556b;

    public C3109k() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final List a() {
        return this.f26556b;
    }

    public final C3115q b() {
        return this.f26555a;
    }

    public C3109k(C3115q c3115q, List parametersInfo) {
        AbstractC4862t.e(parametersInfo, "parametersInfo");
        this.f26555a = c3115q;
        this.f26556b = parametersInfo;
    }

    public /* synthetic */ C3109k(C3115q c3115q, List list, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? null : c3115q, (i10 & 2) != 0 ? C4206t.k() : list);
    }
}
