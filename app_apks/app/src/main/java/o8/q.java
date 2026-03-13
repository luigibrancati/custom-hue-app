package o8;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E f41287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f41289c;

    public q(Class cls, int i10, int i11) {
        this(E.b(cls), i10, i11);
    }

    public static q a(Class cls) {
        return new q(cls, 0, 2);
    }

    public static String b(int i10) {
        if (i10 == 0) {
            return "direct";
        }
        if (i10 == 1) {
            return "provider";
        }
        if (i10 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i10);
    }

    public static q h(Class cls) {
        return new q(cls, 0, 0);
    }

    public static q i(Class cls) {
        return new q(cls, 0, 1);
    }

    public static q j(E e10) {
        return new q(e10, 0, 1);
    }

    public static q k(Class cls) {
        return new q(cls, 1, 0);
    }

    public static q l(E e10) {
        return new q(e10, 1, 0);
    }

    public static q m(Class cls) {
        return new q(cls, 1, 1);
    }

    public static q n(E e10) {
        return new q(e10, 1, 1);
    }

    public static q o(Class cls) {
        return new q(cls, 2, 0);
    }

    public E c() {
        return this.f41287a;
    }

    public boolean d() {
        return this.f41289c == 2;
    }

    public boolean e() {
        return this.f41289c == 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f41287a.equals(qVar.f41287a) && this.f41288b == qVar.f41288b && this.f41289c == qVar.f41289c) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        return this.f41288b == 1;
    }

    public boolean g() {
        return this.f41288b == 2;
    }

    public int hashCode() {
        return this.f41289c ^ ((((this.f41287a.hashCode() ^ 1000003) * 1000003) ^ this.f41288b) * 1000003);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f41287a);
        sb2.append(", type=");
        int i10 = this.f41288b;
        sb2.append(i10 == 1 ? "required" : i10 == 0 ? "optional" : "set");
        sb2.append(", injection=");
        sb2.append(b(this.f41289c));
        sb2.append("}");
        return sb2.toString();
    }

    public q(E e10, int i10, int i11) {
        this.f41287a = (E) D.c(e10, "Null dependency anInterface.");
        this.f41288b = i10;
        this.f41289c = i11;
    }
}
