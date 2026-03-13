package ge;

import ee.l;
import fc.C4025h;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class W implements ee.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final W f35685a = new W();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ee.k f35686b = l.d.f33974a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f35687c = "kotlin.Nothing";

    public final Void a() {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
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
        return this == obj;
    }

    @Override // ee.e
    public ee.k f() {
        return f35686b;
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
        return f35687c;
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

    public String toString() {
        return "NothingSerialDescriptor";
    }
}
