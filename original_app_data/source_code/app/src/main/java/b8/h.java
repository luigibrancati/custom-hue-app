package b8;

import U7.b;
import Z7.AbstractC2592b;
import a8.C2649a;
import a8.InterfaceC2655g;
import java.security.GeneralSecurityException;
import java.security.Provider;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements InterfaceC2655g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b.EnumC0207b f25458b = b.EnumC0207b.ALGORITHM_NOT_FIPS;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2649a f25459a;

    public h(C2649a c2649a) {
        this.f25459a = c2649a;
    }

    public static InterfaceC2655g a(C2649a c2649a) throws GeneralSecurityException {
        if (!f25458b.b()) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        Provider providerA = AbstractC2592b.a();
        if (providerA != null) {
            try {
                return g.a(c2649a, providerA);
            } catch (GeneralSecurityException unused) {
            }
        }
        return new h(c2649a);
    }
}
