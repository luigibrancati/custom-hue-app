package f8;

import U7.b;
import c8.InterfaceC3082c;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements InterfaceC3082c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b.EnumC0207b f34215e = b.EnumC0207b.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadLocal f34216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f34217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Key f34218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f34219d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends ThreadLocal {
        public a() {
        }

        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Mac initialValue() {
            try {
                Mac mac = (Mac) i.f34203c.a(n.this.f34217b);
                mac.init(n.this.f34218c);
                return mac;
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public n(String str, Key key) throws GeneralSecurityException {
        a aVar = new a();
        this.f34216a = aVar;
        if (!f34215e.b()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f34217b = str;
        this.f34218c = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        str.getClass();
        switch (str) {
            case "HMACSHA1":
                this.f34219d = 20;
                break;
            case "HMACSHA224":
                this.f34219d = 28;
                break;
            case "HMACSHA256":
                this.f34219d = 32;
                break;
            case "HMACSHA384":
                this.f34219d = 48;
                break;
            case "HMACSHA512":
                this.f34219d = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: " + str);
        }
        aVar.get();
    }

    @Override // c8.InterfaceC3082c
    public byte[] a(byte[] bArr, int i10) throws InvalidAlgorithmParameterException {
        if (i10 > this.f34219d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ((Mac) this.f34216a.get()).update(bArr);
        return Arrays.copyOf(((Mac) this.f34216a.get()).doFinal(), i10);
    }
}
