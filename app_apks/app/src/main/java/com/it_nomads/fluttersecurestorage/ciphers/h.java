package com.it_nomads.fluttersecurestorage.ciphers;

import android.content.Context;
import android.content.res.Configuration;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.math.BigInteger;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Calendar;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class h implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32402a = e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f32403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ca.b f32404c;

    public h(Context context, ca.b bVar) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException, CertificateException {
        this.f32403b = context;
        this.f32404c = bVar;
        g(context);
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.a
    public byte[] a(Key key) throws Exception {
        PublicKey publicKeyJ = j();
        Cipher cipherK = k();
        cipherK.init(3, publicKeyJ, h());
        return cipherK.wrap(key);
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.a
    public void b() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        keyStore.deleteEntry(this.f32402a);
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.a
    public Cipher c(Context context) {
        return null;
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.a
    public Key d(byte[] bArr, String str) throws Exception {
        PrivateKey privateKeyI = i();
        Cipher cipherK = k();
        cipherK.init(4, privateKeyI, h());
        return cipherK.unwrap(bArr, str, 3);
    }

    public String e() {
        return this.f32403b.getPackageName() + ".FlutterSecureStoragePluginKey";
    }

    public final void f(Context context) {
        Locale locale = Locale.getDefault();
        try {
            m(Locale.ENGLISH);
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, 25);
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            keyPairGenerator.initialize(l(context, calendar, calendar2));
            keyPairGenerator.generateKeyPair();
        } finally {
            m(locale);
        }
    }

    public final void g(Context context) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException, CertificateException {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        Key key = keyStore.getKey(this.f32402a, null);
        Certificate certificate = keyStore.getCertificate(this.f32402a);
        if (key == null || certificate == null) {
            f(context);
        }
    }

    public AlgorithmParameterSpec h() {
        return null;
    }

    public final PrivateKey i() throws Exception {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        Key key = keyStore.getKey(this.f32402a, null);
        if (key != null) {
            if (key instanceof PrivateKey) {
                return (PrivateKey) key;
            }
            throw new Exception("Not an instance of a PrivateKey");
        }
        throw new Exception("No key found under alias: " + this.f32402a);
    }

    public final PublicKey j() throws Exception {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        Certificate certificate = keyStore.getCertificate(this.f32402a);
        if (certificate == null) {
            throw new Exception("No certificate found under alias: " + this.f32402a);
        }
        PublicKey publicKey = certificate.getPublicKey();
        if (publicKey != null) {
            return publicKey;
        }
        throw new Exception("No key found under alias: " + this.f32402a);
    }

    public Cipher k() {
        return Cipher.getInstance("RSA/ECB/PKCS1Padding", "AndroidKeyStoreBCWorkaround");
    }

    public AlgorithmParameterSpec l(Context context, Calendar calendar, Calendar calendar2) {
        return new KeyGenParameterSpec.Builder(this.f32402a, 3).setCertificateSubject(new X500Principal("CN=" + this.f32402a)).setDigests("SHA-256").setBlockModes("ECB").setEncryptionPaddings("PKCS1Padding").setCertificateSerialNumber(BigInteger.valueOf(1L)).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
    }

    public final void m(Locale locale) {
        Locale.setDefault(locale);
        Configuration configuration = this.f32403b.getResources().getConfiguration();
        configuration.setLocale(locale);
        this.f32403b.createConfigurationContext(configuration);
    }
}
