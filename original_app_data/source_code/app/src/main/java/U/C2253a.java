package U;

import B0.c;
import U.C2271t;

/* JADX INFO: renamed from: U.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C2253a extends C2271t.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.a f16500c;

    public C2253a(int i10, int i11, c.a aVar) {
        this.f16498a = i10;
        this.f16499b = i11;
        if (aVar == null) {
            throw new NullPointerException("Null completer");
        }
        this.f16500c = aVar;
    }

    @Override // U.C2271t.b
    public c.a a() {
        return this.f16500c;
    }

    @Override // U.C2271t.b
    public int b() {
        return this.f16498a;
    }

    @Override // U.C2271t.b
    public int c() {
        return this.f16499b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2271t.b) {
            C2271t.b bVar = (C2271t.b) obj;
            if (this.f16498a == bVar.b() && this.f16499b == bVar.c() && this.f16500c.equals(bVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f16500c.hashCode() ^ ((((this.f16498a ^ 1000003) * 1000003) ^ this.f16499b) * 1000003);
    }

    public String toString() {
        return "PendingSnapshot{jpegQuality=" + this.f16498a + ", rotationDegrees=" + this.f16499b + ", completer=" + this.f16500c + "}";
    }
}
