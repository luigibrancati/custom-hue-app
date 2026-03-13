package gc;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: gc.J, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4186J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f35583b;

    public C4186J(int i10, Object obj) {
        this.f35582a = i10;
        this.f35583b = obj;
    }

    public final int a() {
        return this.f35582a;
    }

    public final Object b() {
        return this.f35583b;
    }

    public final int c() {
        return this.f35582a;
    }

    public final Object d() {
        return this.f35583b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4186J)) {
            return false;
        }
        C4186J c4186j = (C4186J) obj;
        return this.f35582a == c4186j.f35582a && AbstractC4862t.a(this.f35583b, c4186j.f35583b);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f35582a) * 31;
        Object obj = this.f35583b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "IndexedValue(index=" + this.f35582a + ", value=" + this.f35583b + ')';
    }
}
