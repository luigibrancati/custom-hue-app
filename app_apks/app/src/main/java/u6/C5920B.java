package u6;

import s6.C5785d;
import v6.AbstractC6055j;

/* JADX INFO: renamed from: u6.B, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5920B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5946b f45093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5785d f45094b;

    public /* synthetic */ C5920B(C5946b c5946b, C5785d c5785d, byte[] bArr) {
        this.f45093a = c5946b;
        this.f45094b = c5785d;
    }

    public final /* synthetic */ C5946b a() {
        return this.f45093a;
    }

    public final /* synthetic */ C5785d b() {
        return this.f45094b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5920B) {
            C5920B c5920b = (C5920B) obj;
            if (AbstractC6055j.a(this.f45093a, c5920b.f45093a) && AbstractC6055j.a(this.f45094b, c5920b.f45094b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC6055j.b(this.f45093a, this.f45094b);
    }

    public final String toString() {
        return AbstractC6055j.c(this).a("key", this.f45093a).a("feature", this.f45094b).toString();
    }
}
