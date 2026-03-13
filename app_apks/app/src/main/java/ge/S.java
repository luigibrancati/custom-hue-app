package ge;

import ee.l;
import gc.C4206t;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class S implements ee.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ee.e f35678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ee.e f35679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f35680d;

    public /* synthetic */ S(String str, ee.e eVar, ee.e eVar2, AbstractC4854k abstractC4854k) {
        this(str, eVar, eVar2);
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
        throw new IllegalArgumentException(name + " is not a valid map index");
    }

    @Override // ee.e
    public int d() {
        return this.f35680d;
    }

    @Override // ee.e
    public String e(int i10) {
        return String.valueOf(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s10 = (S) obj;
        return AbstractC4862t.a(i(), s10.i()) && AbstractC4862t.a(this.f35678b, s10.f35678b) && AbstractC4862t.a(this.f35679c, s10.f35679c);
    }

    @Override // ee.e
    public ee.k f() {
        return l.c.f33973a;
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
            int i11 = i10 % 2;
            if (i11 == 0) {
                return this.f35678b;
            }
            if (i11 == 1) {
                return this.f35679c;
            }
            throw new IllegalStateException("Unreached");
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + i() + " expects only non-negative indices").toString());
    }

    public int hashCode() {
        return (((i().hashCode() * 31) + this.f35678b.hashCode()) * 31) + this.f35679c.hashCode();
    }

    @Override // ee.e
    public String i() {
        return this.f35677a;
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
        return i() + '(' + this.f35678b + ", " + this.f35679c + ')';
    }

    public S(String str, ee.e eVar, ee.e eVar2) {
        this.f35677a = str;
        this.f35678b = eVar;
        this.f35679c = eVar2;
        this.f35680d = 2;
    }
}
