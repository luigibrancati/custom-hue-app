package da;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KeyGenParameterSpec f33190b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f33191a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public KeyGenParameterSpec f33192b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public EnumC0405b f33193c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f33194d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f33195e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f33196f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Context f33197g;

        /* JADX INFO: renamed from: da.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class C0402a {

            /* JADX INFO: renamed from: da.b$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
            public static class C0403a {
                public static void a(KeyGenParameterSpec.Builder builder) {
                    builder.setIsStrongBoxBacked(true);
                }
            }

            /* JADX INFO: renamed from: da.b$a$a$b, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
            public static class C0404b {
                public static void a(KeyGenParameterSpec.Builder builder, int i10, int i11) {
                    builder.setUserAuthenticationParameters(i10, i11);
                }
            }

            public static b a(a aVar) {
                EnumC0405b enumC0405b = aVar.f33193c;
                if (enumC0405b == null && aVar.f33192b == null) {
                    throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
                }
                if (enumC0405b == EnumC0405b.AES256_GCM) {
                    KeyGenParameterSpec.Builder keySize = new KeyGenParameterSpec.Builder(aVar.f33191a, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256);
                    if (aVar.f33194d) {
                        keySize.setUserAuthenticationRequired(true);
                        C0404b.a(keySize, aVar.f33195e, 3);
                    }
                    if (aVar.f33196f && aVar.f33197g.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")) {
                        C0403a.a(keySize);
                    }
                    aVar.f33192b = keySize.build();
                }
                KeyGenParameterSpec keyGenParameterSpec = aVar.f33192b;
                if (keyGenParameterSpec != null) {
                    return new b(c.b(keyGenParameterSpec), aVar.f33192b);
                }
                throw new NullPointerException("KeyGenParameterSpec was null after build() check");
            }

            public static String b(KeyGenParameterSpec keyGenParameterSpec) {
                return keyGenParameterSpec.getKeystoreAlias();
            }
        }

        public a(Context context) {
            this(context, "_androidx_security_master_key_");
        }

        public b a() {
            return C0402a.a(this);
        }

        public a b(KeyGenParameterSpec keyGenParameterSpec) {
            if (this.f33193c != null) {
                throw new IllegalArgumentException("KeyGenParamSpec set after setting a KeyScheme");
            }
            if (this.f33191a.equals(C0402a.b(keyGenParameterSpec))) {
                this.f33192b = keyGenParameterSpec;
                return this;
            }
            throw new IllegalArgumentException("KeyGenParamSpec's key alias does not match provided alias (" + this.f33191a + " vs " + C0402a.b(keyGenParameterSpec));
        }

        public a(Context context, String str) {
            this.f33197g = context.getApplicationContext();
            this.f33191a = str;
        }
    }

    /* JADX INFO: renamed from: da.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum EnumC0405b {
        AES256_GCM
    }

    public b(String str, Object obj) {
        this.f33189a = str;
        this.f33190b = (KeyGenParameterSpec) obj;
    }

    public String a() {
        return this.f33189a;
    }

    public boolean b() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore.containsAlias(this.f33189a);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            return false;
        }
    }

    public String toString() {
        return "MasterKey{keyAlias=" + this.f33189a + ", isKeyStoreBacked=" + b() + "}";
    }
}
