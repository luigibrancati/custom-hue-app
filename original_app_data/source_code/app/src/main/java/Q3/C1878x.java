package Q3;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Q3.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1878x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13752b;

    public C1878x(String name, String workSpecId) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(workSpecId, "workSpecId");
        this.f13751a = name;
        this.f13752b = workSpecId;
    }

    public final String a() {
        return this.f13751a;
    }

    public final String b() {
        return this.f13752b;
    }
}
