package Z7;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f20336a = new a();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SecureRandom initialValue() {
            return I.c();
        }
    }

    public static SecureRandom b() {
        Provider providerA = AbstractC2592b.a();
        if (providerA != null) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", providerA);
            } catch (GeneralSecurityException unused) {
            }
        }
        Provider providerB = AbstractC2592b.b();
        if (providerB != null) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", providerB);
            } catch (GeneralSecurityException unused2) {
            }
        }
        return new SecureRandom();
    }

    public static SecureRandom c() {
        SecureRandom secureRandomB = b();
        secureRandomB.nextLong();
        return secureRandomB;
    }

    public static byte[] d(int i10) {
        byte[] bArr = new byte[i10];
        ((SecureRandom) f20336a.get()).nextBytes(bArr);
        return bArr;
    }
}
