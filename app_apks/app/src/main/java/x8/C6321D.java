package x8;

import x8.G;

/* JADX INFO: renamed from: x8.D, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6321D extends G.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f47528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f47529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f47530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f47531f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f47532g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f47533h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f47534i;

    public C6321D(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f47526a = i10;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f47527b = str;
        this.f47528c = i11;
        this.f47529d = j10;
        this.f47530e = j11;
        this.f47531f = z10;
        this.f47532g = i12;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.f47533h = str2;
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.f47534i = str3;
    }

    @Override // x8.G.b
    public int a() {
        return this.f47526a;
    }

    @Override // x8.G.b
    public int b() {
        return this.f47528c;
    }

    @Override // x8.G.b
    public long d() {
        return this.f47530e;
    }

    @Override // x8.G.b
    public boolean e() {
        return this.f47531f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof G.b) {
            G.b bVar = (G.b) obj;
            if (this.f47526a == bVar.a() && this.f47527b.equals(bVar.g()) && this.f47528c == bVar.b() && this.f47529d == bVar.j() && this.f47530e == bVar.d() && this.f47531f == bVar.e() && this.f47532g == bVar.i() && this.f47533h.equals(bVar.f()) && this.f47534i.equals(bVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // x8.G.b
    public String f() {
        return this.f47533h;
    }

    @Override // x8.G.b
    public String g() {
        return this.f47527b;
    }

    @Override // x8.G.b
    public String h() {
        return this.f47534i;
    }

    public int hashCode() {
        int iHashCode = (((((this.f47526a ^ 1000003) * 1000003) ^ this.f47527b.hashCode()) * 1000003) ^ this.f47528c) * 1000003;
        long j10 = this.f47529d;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f47530e;
        return this.f47534i.hashCode() ^ ((((((((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f47531f ? 1231 : 1237)) * 1000003) ^ this.f47532g) * 1000003) ^ this.f47533h.hashCode()) * 1000003);
    }

    @Override // x8.G.b
    public int i() {
        return this.f47532g;
    }

    @Override // x8.G.b
    public long j() {
        return this.f47529d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f47526a + ", model=" + this.f47527b + ", availableProcessors=" + this.f47528c + ", totalRam=" + this.f47529d + ", diskSpace=" + this.f47530e + ", isEmulator=" + this.f47531f + ", state=" + this.f47532g + ", manufacturer=" + this.f47533h + ", modelClass=" + this.f47534i + "}";
    }
}
