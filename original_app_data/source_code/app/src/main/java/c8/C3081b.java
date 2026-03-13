package c8;

import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: renamed from: c8.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3081b extends AbstractC3084e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26372a;

    public C3081b(int i10) {
        this.f26372a = i10;
    }

    public static C3081b b(int i10) throws InvalidAlgorithmParameterException {
        if (i10 == 16 || i10 == 32) {
            return new C3081b(i10);
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", Integer.valueOf(i10 * 8)));
    }

    @Override // P7.v
    public boolean a() {
        return false;
    }

    public int c() {
        return this.f26372a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C3081b) && ((C3081b) obj).c() == c();
    }

    public int hashCode() {
        return Objects.hash(C3081b.class, Integer.valueOf(this.f26372a));
    }

    public String toString() {
        return "AesCmac PRF Parameters (" + this.f26372a + "-byte key)";
    }
}
