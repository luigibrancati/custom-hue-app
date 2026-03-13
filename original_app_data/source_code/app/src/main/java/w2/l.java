package w2;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class l extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f46126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f46127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f46128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f46129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f46130f;

    public l(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f46126b = i10;
        this.f46127c = i11;
        this.f46128d = i12;
        this.f46129e = iArr;
        this.f46130f = iArr2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f46126b == lVar.f46126b && this.f46127c == lVar.f46127c && this.f46128d == lVar.f46128d && Arrays.equals(this.f46129e, lVar.f46129e) && Arrays.equals(this.f46130f, lVar.f46130f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f46126b) * 31) + this.f46127c) * 31) + this.f46128d) * 31) + Arrays.hashCode(this.f46129e)) * 31) + Arrays.hashCode(this.f46130f);
    }
}
