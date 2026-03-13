package w2;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f46097b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f46097b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f46121a.equals(bVar.f46121a) && Arrays.equals(this.f46097b, bVar.f46097b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f46121a.hashCode()) * 31) + Arrays.hashCode(this.f46097b);
    }
}
