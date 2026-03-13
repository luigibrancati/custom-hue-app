package Q3;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Q3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1856a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13666b;

    public C1856a(String workSpecId, String prerequisiteId) {
        AbstractC4862t.e(workSpecId, "workSpecId");
        AbstractC4862t.e(prerequisiteId, "prerequisiteId");
        this.f13665a = workSpecId;
        this.f13666b = prerequisiteId;
    }

    public final String a() {
        return this.f13666b;
    }

    public final String b() {
        return this.f13665a;
    }
}
