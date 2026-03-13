package R7;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: R7.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2089k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f14887a = new a();

    /* JADX INFO: renamed from: R7.k$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return (Cipher) f8.i.f34202b.a("AES/GCM/NoPadding");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public static AlgorithmParameterSpec a(byte[] bArr) {
        return b(bArr, 0, bArr.length);
    }

    public static AlgorithmParameterSpec b(byte[] bArr, int i10, int i11) {
        Integer numC = Z7.N.c();
        return (numC == null || numC.intValue() > 19) ? new GCMParameterSpec(128, bArr, i10, i11) : new IvParameterSpec(bArr, i10, i11);
    }

    public static SecretKey c(byte[] bArr) throws InvalidAlgorithmParameterException {
        f8.r.a(bArr.length);
        return new SecretKeySpec(bArr, "AES");
    }

    public static Cipher d() {
        return (Cipher) f14887a.get();
    }
}
