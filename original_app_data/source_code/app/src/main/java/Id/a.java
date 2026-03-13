package Id;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5842b;

    public a(Object obj, Object obj2) {
        this.f5841a = obj;
        this.f5842b = obj2;
    }

    public final Object a() {
        return this.f5841a;
    }

    public final Object b() {
        return this.f5842b;
    }

    public final Object c() {
        return this.f5841a;
    }

    public final Object d() {
        return this.f5842b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC4862t.a(this.f5841a, aVar.f5841a) && AbstractC4862t.a(this.f5842b, aVar.f5842b);
    }

    public int hashCode() {
        Object obj = this.f5841a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f5842b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "ApproximationBounds(lower=" + this.f5841a + ", upper=" + this.f5842b + ')';
    }
}
