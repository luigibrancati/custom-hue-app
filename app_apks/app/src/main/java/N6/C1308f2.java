package N6;

import v6.AbstractC6055j;

/* JADX INFO: renamed from: N6.f2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1308f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z7 f10243a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f10245c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ba f10247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AbstractC1487t0 f10248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AbstractC1487t0 f10249g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f10244b = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final H7 f10246d = null;

    public /* synthetic */ C1308f2(C1282d2 c1282d2, AbstractC1295e2 abstractC1295e2) {
        this.f10243a = c1282d2.f10207a;
        this.f10245c = c1282d2.f10208b;
        this.f10247e = c1282d2.f10209c;
        this.f10248f = c1282d2.f10210d;
        this.f10249g = c1282d2.f10211e;
    }

    public final AbstractC1487t0 a() {
        return this.f10248f;
    }

    public final AbstractC1487t0 b() {
        return this.f10249g;
    }

    public final Z7 c() {
        return this.f10243a;
    }

    public final Ba d() {
        return this.f10247e;
    }

    public final Boolean e() {
        return this.f10245c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1308f2)) {
            return false;
        }
        C1308f2 c1308f2 = (C1308f2) obj;
        return AbstractC6055j.a(this.f10243a, c1308f2.f10243a) && AbstractC6055j.a(null, null) && AbstractC6055j.a(this.f10245c, c1308f2.f10245c) && AbstractC6055j.a(null, null) && AbstractC6055j.a(this.f10247e, c1308f2.f10247e) && AbstractC6055j.a(this.f10248f, c1308f2.f10248f) && AbstractC6055j.a(this.f10249g, c1308f2.f10249g);
    }

    public final int hashCode() {
        return AbstractC6055j.b(this.f10243a, null, this.f10245c, null, this.f10247e, this.f10248f, this.f10249g);
    }
}
