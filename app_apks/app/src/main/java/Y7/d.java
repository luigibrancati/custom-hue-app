package Y7;

import P7.r;
import f8.p;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f19821b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19822a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f19823a = null;

        public a() {
            if (!d.e()) {
                throw new IllegalStateException("need Android Keystore on Android M or newer");
            }
        }
    }

    public d() {
        this(new a());
    }

    public static boolean d(String str) {
        synchronized (f19821b) {
            try {
                String strB = f8.r.b("android-keystore://", str);
                if (b.e(strB)) {
                    return false;
                }
                b.a(strB);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean e() {
        return true;
    }

    public static P7.a f(P7.a aVar) throws KeyStoreException {
        byte[] bArrA = p.a(10);
        byte[] bArr = new byte[0];
        if (Arrays.equals(bArrA, aVar.b(aVar.a(bArrA, bArr), bArr))) {
            return aVar;
        }
        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
    }

    @Override // P7.r
    public boolean a(String str) {
        String str2 = this.f19822a;
        if (str2 == null || !str2.equals(str)) {
            return this.f19822a == null && str.toLowerCase(Locale.US).startsWith("android-keystore://");
        }
        return true;
    }

    @Override // P7.r
    public P7.a b(String str) throws GeneralSecurityException {
        P7.a aVarF;
        String str2 = this.f19822a;
        if (str2 != null && !str2.equals(str)) {
            throw new GeneralSecurityException(String.format("this client is bound to %s, cannot load keys bound to %s", this.f19822a, str));
        }
        try {
            synchronized (f19821b) {
                aVarF = f(new c(f8.r.b("android-keystore://", str)));
            }
            return aVarF;
        } catch (IOException e10) {
            throw new GeneralSecurityException(e10);
        }
    }

    public d(a aVar) {
        this.f19822a = aVar.f19823a;
    }
}
