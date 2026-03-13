package ge;

import ee.l;
import gc.C4206t;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class N implements ee.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ee.e f35668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35669b;

    public /* synthetic */ N(ee.e eVar, AbstractC4854k abstractC4854k) {
        this(eVar);
    }

    @Override // ee.e
    public boolean b() {
        return super.b();
    }

    @Override // ee.e
    public int c(String name) {
        AbstractC4862t.e(name, "name");
        Integer numU = Od.B.u(name);
        if (numU != null) {
            return numU.intValue();
        }
        throw new IllegalArgumentException(name + " is not a valid list index");
    }

    @Override // ee.e
    public int d() {
        return this.f35669b;
    }

    @Override // ee.e
    public String e(int i10) {
        return String.valueOf(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n10 = (N) obj;
        return AbstractC4862t.a(this.f35668a, n10.f35668a) && AbstractC4862t.a(i(), n10.i());
    }

    @Override // ee.e
    public ee.k f() {
        return l.b.f33972a;
    }

    @Override // ee.e
    public List g(int i10) {
        if (i10 >= 0) {
            return C4206t.k();
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + i() + " expects only non-negative indices").toString());
    }

    @Override // ee.e
    public List getAnnotations() {
        return super.getAnnotations();
    }

    @Override // ee.e
    public ee.e h(int i10) {
        if (i10 >= 0) {
            return this.f35668a;
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + i() + " expects only non-negative indices").toString());
    }

    public int hashCode() {
        return (this.f35668a.hashCode() * 31) + i().hashCode();
    }

    @Override // ee.e
    public boolean isInline() {
        return super.isInline();
    }

    @Override // ee.e
    public boolean j(int i10) {
        if (i10 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + i() + " expects only non-negative indices").toString());
    }

    public String toString() {
        return i() + '(' + this.f35668a + ')';
    }

    public N(ee.e eVar) {
        this.f35668a = eVar;
        this.f35669b = 1;
    }
}
