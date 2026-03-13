package K;

import E.C0785e0;
import K.X;

/* JADX INFO: renamed from: K.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C0964f extends X.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0785e0 f6610b;

    public C0964f(int i10, C0785e0 c0785e0) {
        this.f6609a = i10;
        if (c0785e0 == null) {
            throw new NullPointerException("Null imageCaptureException");
        }
        this.f6610b = c0785e0;
    }

    @Override // K.X.a
    public C0785e0 a() {
        return this.f6610b;
    }

    @Override // K.X.a
    public int b() {
        return this.f6609a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof X.a) {
            X.a aVar = (X.a) obj;
            if (this.f6609a == aVar.b() && this.f6610b.equals(aVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f6610b.hashCode() ^ ((this.f6609a ^ 1000003) * 1000003);
    }

    public String toString() {
        return "CaptureError{requestId=" + this.f6609a + ", imageCaptureException=" + this.f6610b + "}";
    }
}
