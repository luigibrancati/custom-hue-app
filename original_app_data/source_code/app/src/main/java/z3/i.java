package z3;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class i extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f48728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f48730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f48731e;

    public i(Object value, String tag, j verificationMode, g logger) {
        AbstractC4862t.e(value, "value");
        AbstractC4862t.e(tag, "tag");
        AbstractC4862t.e(verificationMode, "verificationMode");
        AbstractC4862t.e(logger, "logger");
        this.f48728b = value;
        this.f48729c = tag;
        this.f48730d = verificationMode;
        this.f48731e = logger;
    }

    @Override // z3.h
    public Object a() {
        return this.f48728b;
    }

    @Override // z3.h
    public h c(String message, vc.l condition) {
        AbstractC4862t.e(message, "message");
        AbstractC4862t.e(condition, "condition");
        return ((Boolean) condition.invoke(this.f48728b)).booleanValue() ? this : new f(this.f48728b, this.f48729c, message, this.f48731e, this.f48730d);
    }
}
