package N6;

import v6.AbstractC6055j;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class H7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F7 f9755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f9756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f9757c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f9758d = null;

    public /* synthetic */ H7(E7 e72, G7 g72) {
        this.f9755a = e72.f9707a;
        this.f9756b = e72.f9708b;
    }

    public final F7 a() {
        return this.f9755a;
    }

    public final Integer b() {
        return this.f9756b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof H7)) {
            return false;
        }
        H7 h72 = (H7) obj;
        return AbstractC6055j.a(this.f9755a, h72.f9755a) && AbstractC6055j.a(this.f9756b, h72.f9756b) && AbstractC6055j.a(null, null) && AbstractC6055j.a(null, null);
    }

    public final int hashCode() {
        return AbstractC6055j.b(this.f9755a, this.f9756b, null, null);
    }
}
