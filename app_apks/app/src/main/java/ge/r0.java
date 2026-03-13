package ge;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class r0 implements ee.e, InterfaceC4245l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ee.e f35740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f35741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f35742c;

    public r0(ee.e original) {
        AbstractC4862t.e(original, "original");
        this.f35740a = original;
        this.f35741b = original.i() + '?';
        this.f35742c = AbstractC4230d0.a(original);
    }

    @Override // ge.InterfaceC4245l
    public Set a() {
        return this.f35742c;
    }

    @Override // ee.e
    public boolean b() {
        return true;
    }

    @Override // ee.e
    public int c(String name) {
        AbstractC4862t.e(name, "name");
        return this.f35740a.c(name);
    }

    @Override // ee.e
    public int d() {
        return this.f35740a.d();
    }

    @Override // ee.e
    public String e(int i10) {
        return this.f35740a.e(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0) && AbstractC4862t.a(this.f35740a, ((r0) obj).f35740a);
    }

    @Override // ee.e
    public ee.k f() {
        return this.f35740a.f();
    }

    @Override // ee.e
    public List g(int i10) {
        return this.f35740a.g(i10);
    }

    @Override // ee.e
    public List getAnnotations() {
        return this.f35740a.getAnnotations();
    }

    @Override // ee.e
    public ee.e h(int i10) {
        return this.f35740a.h(i10);
    }

    public int hashCode() {
        return this.f35740a.hashCode() * 31;
    }

    @Override // ee.e
    public String i() {
        return this.f35741b;
    }

    @Override // ee.e
    public boolean isInline() {
        return this.f35740a.isInline();
    }

    @Override // ee.e
    public boolean j(int i10) {
        return this.f35740a.j(i10);
    }

    public final ee.e k() {
        return this.f35740a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f35740a);
        sb2.append('?');
        return sb2.toString();
    }
}
