package b8;

import U7.b;
import a8.InterfaceC2655g;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements InterfaceC2655g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b.EnumC0207b f25460b = b.EnumC0207b.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8.i f25461a;

    public i(a8.i iVar) throws GeneralSecurityException {
        if (!f25460b.b()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f25461a = iVar;
    }
}
