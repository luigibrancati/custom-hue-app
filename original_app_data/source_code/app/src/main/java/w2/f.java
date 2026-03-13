package w2;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f46114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f46115e;

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f46112b = str;
        this.f46113c = str2;
        this.f46114d = str3;
        this.f46115e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f46112b, fVar.f46112b) && Objects.equals(this.f46113c, fVar.f46113c) && Objects.equals(this.f46114d, fVar.f46114d) && Arrays.equals(this.f46115e, fVar.f46115e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f46112b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f46113c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f46114d;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f46115e);
    }

    @Override // w2.i
    public String toString() {
        return this.f46121a + ": mimeType=" + this.f46112b + ", filename=" + this.f46113c + ", description=" + this.f46114d;
    }
}
