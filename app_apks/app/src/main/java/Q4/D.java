package Q4;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class D extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f13764c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(String errorCode, String str, Object obj) {
        super(str);
        AbstractC4862t.e(errorCode, "errorCode");
        this.f13762a = errorCode;
        this.f13763b = str;
        this.f13764c = obj;
    }

    public final String a() {
        return this.f13762a;
    }

    public final Object b() {
        return this.f13764c;
    }

    public final String c() {
        return this.f13763b;
    }
}
