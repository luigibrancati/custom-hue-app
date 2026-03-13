package u6;

import t6.C5843a;
import v6.AbstractC6055j;

/* JADX INFO: renamed from: u6.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5946b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5843a f45139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5843a.d f45140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f45141d;

    public C5946b(C5843a c5843a, C5843a.d dVar, String str) {
        this.f45139b = c5843a;
        this.f45140c = dVar;
        this.f45141d = str;
        this.f45138a = AbstractC6055j.b(c5843a, dVar, str);
    }

    public static C5946b a(C5843a c5843a, C5843a.d dVar, String str) {
        return new C5946b(c5843a, dVar, str);
    }

    public final String b() {
        return this.f45139b.b();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5946b)) {
            return false;
        }
        C5946b c5946b = (C5946b) obj;
        return AbstractC6055j.a(this.f45139b, c5946b.f45139b) && AbstractC6055j.a(this.f45140c, c5946b.f45140c) && AbstractC6055j.a(this.f45141d, c5946b.f45141d);
    }

    public final int hashCode() {
        return this.f45138a;
    }
}
