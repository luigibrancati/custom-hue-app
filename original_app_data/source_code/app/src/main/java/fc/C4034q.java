package fc;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: fc.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4034q implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f34272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f34273b;

    public C4034q(Object obj, Object obj2) {
        this.f34272a = obj;
        this.f34273b = obj2;
    }

    public static /* synthetic */ C4034q d(C4034q c4034q, Object obj, Object obj2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = c4034q.f34272a;
        }
        if ((i10 & 2) != 0) {
            obj2 = c4034q.f34273b;
        }
        return c4034q.c(obj, obj2);
    }

    public final Object a() {
        return this.f34272a;
    }

    public final Object b() {
        return this.f34273b;
    }

    public final C4034q c(Object obj, Object obj2) {
        return new C4034q(obj, obj2);
    }

    public final Object e() {
        return this.f34272a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4034q)) {
            return false;
        }
        C4034q c4034q = (C4034q) obj;
        return AbstractC4862t.a(this.f34272a, c4034q.f34272a) && AbstractC4862t.a(this.f34273b, c4034q.f34273b);
    }

    public final Object f() {
        return this.f34273b;
    }

    public int hashCode() {
        Object obj = this.f34272a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f34273b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f34272a + ", " + this.f34273b + ')';
    }
}
