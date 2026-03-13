package g8;

import f8.k;
import java.util.Arrays;

/* JADX INFO: renamed from: g8.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C4160a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f35533a;

    public C4160a(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        this.f35533a = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
    }

    public static C4160a a(byte[] bArr) {
        if (bArr != null) {
            return b(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public static C4160a b(byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            throw new NullPointerException("data must be non-null");
        }
        if (i10 + i11 > bArr.length) {
            i11 = bArr.length - i10;
        }
        return new C4160a(bArr, i10, i11);
    }

    public int c() {
        return this.f35533a.length;
    }

    public byte[] d() {
        byte[] bArr = this.f35533a;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4160a) {
            return Arrays.equals(((C4160a) obj).f35533a, this.f35533a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f35533a);
    }

    public String toString() {
        return "Bytes(" + k.b(this.f35533a) + ")";
    }
}
