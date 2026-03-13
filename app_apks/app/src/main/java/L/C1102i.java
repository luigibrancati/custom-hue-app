package L;

import L.InterfaceC1099g0;

/* JADX INFO: renamed from: L.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1102i extends InterfaceC1099g0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f8087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f8088c;

    public C1102i(String str, Class cls, Object obj) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.f8086a = str;
        if (cls == null) {
            throw new NullPointerException("Null valueClass");
        }
        this.f8087b = cls;
        this.f8088c = obj;
    }

    @Override // L.InterfaceC1099g0.a
    public String c() {
        return this.f8086a;
    }

    @Override // L.InterfaceC1099g0.a
    public Object d() {
        return this.f8088c;
    }

    @Override // L.InterfaceC1099g0.a
    public Class e() {
        return this.f8087b;
    }

    public boolean equals(Object obj) {
        Object obj2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC1099g0.a) {
            InterfaceC1099g0.a aVar = (InterfaceC1099g0.a) obj;
            if (this.f8086a.equals(aVar.c()) && this.f8087b.equals(aVar.e()) && ((obj2 = this.f8088c) != null ? obj2.equals(aVar.d()) : aVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f8086a.hashCode() ^ 1000003) * 1000003) ^ this.f8087b.hashCode()) * 1000003;
        Object obj = this.f8088c;
        return (obj == null ? 0 : obj.hashCode()) ^ iHashCode;
    }

    public String toString() {
        return "Option{id=" + this.f8086a + ", valueClass=" + this.f8087b + ", token=" + this.f8088c + "}";
    }
}
