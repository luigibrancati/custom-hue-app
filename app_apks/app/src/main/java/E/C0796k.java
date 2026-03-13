package E;

import E.V0;
import android.view.Surface;

/* JADX INFO: renamed from: E.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C0796k extends V0.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Surface f3000b;

    public C0796k(int i10, Surface surface) {
        this.f2999a = i10;
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.f3000b = surface;
    }

    @Override // E.V0.g
    public int a() {
        return this.f2999a;
    }

    @Override // E.V0.g
    public Surface b() {
        return this.f3000b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof V0.g) {
            V0.g gVar = (V0.g) obj;
            if (this.f2999a == gVar.a() && this.f3000b.equals(gVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f3000b.hashCode() ^ ((this.f2999a ^ 1000003) * 1000003);
    }

    public String toString() {
        return "Result{resultCode=" + this.f2999a + ", surface=" + this.f3000b + "}";
    }
}
