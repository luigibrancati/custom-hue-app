package b8;

import U7.b;
import a8.C2649a;
import a8.C2654f;
import a8.InterfaceC2655g;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements InterfaceC2655g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b.EnumC0207b f25453e = b.EnumC0207b.ALGORITHM_NOT_FIPS;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f25454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2654f f25455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SecretKeySpec f25456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Provider f25457d;

    public g(C2649a c2649a, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            throw new IllegalArgumentException("conscrypt is null");
        }
        if (!f25453e.b()) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        try {
            Mac.getInstance("AESCMAC", provider);
            this.f25457d = provider;
            this.f25454a = c2649a.c().d();
            this.f25455b = c2649a.b();
            this.f25456c = b(c2649a);
        } catch (NoSuchAlgorithmException e10) {
            throw new GeneralSecurityException("AES-CMAC not available.", e10);
        }
    }

    public static InterfaceC2655g a(C2649a c2649a, Provider provider) {
        return new g(c2649a, provider);
    }

    public static SecretKeySpec b(C2649a c2649a) {
        return new SecretKeySpec(c2649a.f().d(P7.f.a()), "AES");
    }
}
