package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class A implements InterfaceC4851h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f39770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39771b;

    public A(Class jClass, String moduleName) {
        AbstractC4862t.e(jClass, "jClass");
        AbstractC4862t.e(moduleName, "moduleName");
        this.f39770a = jClass;
        this.f39771b = moduleName;
    }

    @Override // kotlin.jvm.internal.InterfaceC4851h
    public Class d() {
        return this.f39770a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof A) && AbstractC4862t.a(d(), ((A) obj).d());
    }

    public int hashCode() {
        return d().hashCode();
    }

    public String toString() {
        return d().toString() + " (Kotlin reflection is not available)";
    }
}
