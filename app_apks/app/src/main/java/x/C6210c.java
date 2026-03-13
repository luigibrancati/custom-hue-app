package x;

import java.util.List;
import x.T1;

/* JADX INFO: renamed from: x.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6210c extends T1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f46896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f46897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f46898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f46899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f46900e;

    public C6210c(List list, List list2, int i10, int i11, int i12) {
        this.f46896a = list;
        this.f46897b = list2;
        this.f46898c = i10;
        this.f46899d = i11;
        this.f46900e = i12;
    }

    @Override // x.T1.b
    public List a() {
        return this.f46896a;
    }

    @Override // x.T1.b
    public List b() {
        return this.f46897b;
    }

    @Override // x.T1.b
    public int c() {
        return this.f46900e;
    }

    @Override // x.T1.b
    public int d() {
        return this.f46898c;
    }

    @Override // x.T1.b
    public int e() {
        return this.f46899d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof T1.b) {
            T1.b bVar = (T1.b) obj;
            List list = this.f46896a;
            if (list != null ? list.equals(bVar.a()) : bVar.a() == null) {
                List list2 = this.f46897b;
                if (list2 != null ? list2.equals(bVar.b()) : bVar.b() == null) {
                    if (this.f46898c == bVar.d() && this.f46899d == bVar.e() && this.f46900e == bVar.c()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        List list = this.f46896a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        List list2 = this.f46897b;
        return this.f46900e ^ ((((((iHashCode ^ (list2 != null ? list2.hashCode() : 0)) * 1000003) ^ this.f46898c) * 1000003) ^ this.f46899d) * 1000003);
    }

    public String toString() {
        return "BestSizesAndMaxFpsForConfigs{bestSizes=" + this.f46896a + ", bestSizesForStreamUseCase=" + this.f46897b + ", maxFpsForBestSizes=" + this.f46898c + ", maxFpsForStreamUseCase=" + this.f46899d + ", maxFpsForAllSizes=" + this.f46900e + "}";
    }
}
