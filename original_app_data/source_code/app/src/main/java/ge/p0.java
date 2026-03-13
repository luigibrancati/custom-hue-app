package ge;

import fc.C4025h;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class p0 implements ee.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ee.d f35736b;

    public p0(String serialName, ee.d kind) {
        AbstractC4862t.e(serialName, "serialName");
        AbstractC4862t.e(kind, "kind");
        this.f35735a = serialName;
        this.f35736b = kind;
    }

    private final Void a() {
        throw new IllegalStateException("Primitive descriptor " + i() + " does not have elements");
    }

    @Override // ee.e
    public boolean b() {
        return super.b();
    }

    @Override // ee.e
    public int c(String name) {
        AbstractC4862t.e(name, "name");
        a();
        throw new C4025h();
    }

    @Override // ee.e
    public int d() {
        return 0;
    }

    @Override // ee.e
    public String e(int i10) {
        a();
        throw new C4025h();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return AbstractC4862t.a(i(), p0Var.i()) && AbstractC4862t.a(f(), p0Var.f());
    }

    @Override // ee.e
    public List g(int i10) {
        a();
        throw new C4025h();
    }

    @Override // ee.e
    public List getAnnotations() {
        return super.getAnnotations();
    }

    @Override // ee.e
    public ee.e h(int i10) {
        a();
        throw new C4025h();
    }

    public int hashCode() {
        return i().hashCode() + (f().hashCode() * 31);
    }

    @Override // ee.e
    public String i() {
        return this.f35735a;
    }

    @Override // ee.e
    public boolean isInline() {
        return super.isInline();
    }

    @Override // ee.e
    public boolean j(int i10) {
        a();
        throw new C4025h();
    }

    @Override // ee.e
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public ee.d f() {
        return this.f35736b;
    }

    public String toString() {
        return "PrimitiveDescriptor(" + i() + ')';
    }
}
