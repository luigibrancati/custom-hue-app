package Od;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Od.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C1829i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.f f12447b;

    public C1829i(String value, Bc.f range) {
        AbstractC4862t.e(value, "value");
        AbstractC4862t.e(range, "range");
        this.f12446a = value;
        this.f12447b = range;
    }

    public final String a() {
        return this.f12446a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1829i)) {
            return false;
        }
        C1829i c1829i = (C1829i) obj;
        return AbstractC4862t.a(this.f12446a, c1829i.f12446a) && AbstractC4862t.a(this.f12447b, c1829i.f12447b);
    }

    public int hashCode() {
        return (this.f12446a.hashCode() * 31) + this.f12447b.hashCode();
    }

    public String toString() {
        return "MatchGroup(value=" + this.f12446a + ", range=" + this.f12447b + ')';
    }
}
