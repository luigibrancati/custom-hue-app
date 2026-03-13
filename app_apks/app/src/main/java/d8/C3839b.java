package d8;

import P7.f;
import U7.b;
import Z7.AbstractC2592b;
import c8.C3080a;
import c8.InterfaceC3082c;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: d8.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3839b implements InterfaceC3082c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b.EnumC0207b f33163c = b.EnumC0207b.ALGORITHM_NOT_FIPS;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Key f33164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f33165b;

    public C3839b(byte[] bArr, Provider provider) throws GeneralSecurityException {
        if (!f33163c.b()) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode, as BoringCrypto module is not available");
        }
        this.f33164a = new SecretKeySpec(bArr, "AES");
        this.f33165b = provider;
    }

    public static InterfaceC3082c b(C3080a c3080a) throws GeneralSecurityException {
        Provider providerA = AbstractC2592b.a();
        if (providerA == null) {
            throw new GeneralSecurityException("Conscrypt not available");
        }
        Mac.getInstance("AESCMAC", providerA);
        return new C3839b(c3080a.e().d(f.a()), providerA);
    }

    @Override // c8.InterfaceC3082c
    public byte[] a(byte[] bArr, int i10) throws NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (i10 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength must not be larger than 16");
        }
        Mac mac = Mac.getInstance("AESCMAC", this.f33165b);
        mac.init(this.f33164a);
        byte[] bArrDoFinal = mac.doFinal(bArr);
        return i10 == bArrDoFinal.length ? bArrDoFinal : Arrays.copyOf(bArrDoFinal, i10);
    }
}
