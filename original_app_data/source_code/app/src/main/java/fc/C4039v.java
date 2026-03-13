package fc;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: fc.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4039v implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f34285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f34286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f34287c;

    public C4039v(Object obj, Object obj2, Object obj3) {
        this.f34285a = obj;
        this.f34286b = obj2;
        this.f34287c = obj3;
    }

    public final Object a() {
        return this.f34285a;
    }

    public final Object b() {
        return this.f34286b;
    }

    public final Object c() {
        return this.f34287c;
    }

    public final Object d() {
        return this.f34285a;
    }

    public final Object e() {
        return this.f34286b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4039v)) {
            return false;
        }
        C4039v c4039v = (C4039v) obj;
        return AbstractC4862t.a(this.f34285a, c4039v.f34285a) && AbstractC4862t.a(this.f34286b, c4039v.f34286b) && AbstractC4862t.a(this.f34287c, c4039v.f34287c);
    }

    public final Object f() {
        return this.f34287c;
    }

    public int hashCode() {
        Object obj = this.f34285a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f34286b;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f34287c;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f34285a + ", " + this.f34286b + ", " + this.f34287c + ')';
    }
}
