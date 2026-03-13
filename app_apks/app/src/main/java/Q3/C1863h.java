package Q3;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Q3.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1863h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f13694b;

    public C1863h(String key, Long l10) {
        AbstractC4862t.e(key, "key");
        this.f13693a = key;
        this.f13694b = l10;
    }

    public final String a() {
        return this.f13693a;
    }

    public final Long b() {
        return this.f13694b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1863h)) {
            return false;
        }
        C1863h c1863h = (C1863h) obj;
        return AbstractC4862t.a(this.f13693a, c1863h.f13693a) && AbstractC4862t.a(this.f13694b, c1863h.f13694b);
    }

    public int hashCode() {
        int iHashCode = this.f13693a.hashCode() * 31;
        Long l10 = this.f13694b;
        return iHashCode + (l10 == null ? 0 : l10.hashCode());
    }

    public String toString() {
        return "Preference(key=" + this.f13693a + ", value=" + this.f13694b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1863h(String key, boolean z10) {
        this(key, Long.valueOf(z10 ? 1L : 0L));
        AbstractC4862t.e(key, "key");
    }
}
