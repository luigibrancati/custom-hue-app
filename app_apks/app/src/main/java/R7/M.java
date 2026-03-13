package R7;

import Q7.l0;
import c8.C3080a;
import c8.C3081b;
import c8.InterfaceC3082c;
import g8.C4160a;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class M implements P7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f14855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC3082c f14857c;

    public M(byte[] bArr, C4160a c4160a, int i10) {
        this.f14857c = d(bArr);
        this.f14855a = c4160a.d();
        this.f14856b = i10;
    }

    public static P7.a c(l0 l0Var) throws GeneralSecurityException {
        if (l0Var.b().c() < 8 || l0Var.b().c() > 12) {
            throw new GeneralSecurityException("invalid salt size");
        }
        return new M(l0Var.f().d(P7.f.a()), l0Var.c(), l0Var.b().c());
    }

    public static InterfaceC3082c d(byte[] bArr) {
        return f8.m.b(C3080a.d(C3081b.b(bArr.length), g8.b.a(bArr, P7.f.a())));
    }

    @Override // P7.a
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] bArrA = f8.p.a(this.f14856b + 12);
        byte[] bArrCopyOf = Arrays.copyOf(bArrA, this.f14856b);
        int i10 = this.f14856b;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrA, i10, i10 + 12);
        byte[] bArrB = new D(e(bArrCopyOf)).b(bArrCopyOfRange, bArr, this.f14855a.length + this.f14856b + bArrCopyOfRange.length, bArr2);
        byte[] bArr3 = this.f14855a;
        System.arraycopy(bArr3, 0, bArrB, 0, bArr3.length);
        System.arraycopy(bArrA, 0, bArrB, this.f14855a.length, bArrA.length);
        return bArrB;
    }

    @Override // P7.a
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f14855a;
        if (length < bArr3.length + this.f14856b + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!Z7.N.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int length2 = this.f14855a.length + this.f14856b;
        D d10 = new D(e(Arrays.copyOfRange(bArr, this.f14855a.length, length2)));
        int i10 = length2 + 12;
        return d10.a(Arrays.copyOfRange(bArr, length2, i10), bArr, i10, bArr2);
    }

    public final byte[] e(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr3 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        if (bArr.length > 12 || bArr.length < 8) {
            throw new GeneralSecurityException("invalid salt size");
        }
        System.arraycopy(bArr, 0, bArr2, 4, bArr.length);
        System.arraycopy(bArr, 0, bArr3, 4, bArr.length);
        byte[] bArr4 = new byte[32];
        System.arraycopy(this.f14857c.a(bArr2, 16), 0, bArr4, 0, 16);
        System.arraycopy(this.f14857c.a(bArr3, 16), 0, bArr4, 16, 16);
        return bArr4;
    }
}
