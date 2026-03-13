package com.it_nomads.fluttersecurestorage.ciphers;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class g implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f32400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ca.b f32401c;

    public g(Context context, ca.b bVar) throws Exception {
        this.f32400b = context;
        this.f32401c = bVar;
        String strE = e(context);
        this.f32399a = strE;
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        if (keyStore.getKey(strE, null) == null) {
            f();
        }
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.a
    public byte[] a(Key key) {
        throw new UnsupportedOperationException("AES symmetric keys in AndroidKeyStore cannot wrap other keys");
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.a
    public void b() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        keyStore.deleteEntry(this.f32399a);
        this.f32400b.getSharedPreferences("FlutterSecureKeyStorage", 0).edit().remove("KeyStoreIV1").apply();
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.a
    public Cipher c(Context context) throws Exception {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        Key key = keyStore.getKey(this.f32399a, null);
        if (key != null) {
            return g(context, key);
        }
        f();
        return g(context, keyStore.getKey(this.f32399a, null));
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.a
    public Key d(byte[] bArr, String str) {
        throw new UnsupportedOperationException("AES symmetric keys in AndroidKeyStore cannot unwrap other keys");
    }

    public String e(Context context) {
        return context.getPackageName() + ".FlutterSecureStoragePluginKey";
    }

    public void f() throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        boolean zH = h();
        if (this.f32401c.c() && !zH) {
            throw new Exception("BIOMETRIC_UNAVAILABLE: Biometric enforcement enabled but device has no PIN, pattern, password, or biometric enrolled. Cannot generate secure key.");
        }
        if (!zH) {
            Log.w("AESCipher23", "Device has no PIN/biometric security. Generating key without user authentication requirement (enforceBiometrics=false).");
        }
        KeyGenParameterSpec.Builder keySize = new KeyGenParameterSpec.Builder(this.f32399a, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256);
        if (zH) {
            keySize.setUserAuthenticationRequired(true);
            keySize.setUserAuthenticationParameters(0, 3);
            keySize.setInvalidatedByBiometricEnrollment(true);
        } else {
            keySize.setUserAuthenticationRequired(false);
        }
        keySize.setUnlockedDeviceRequired(true);
        if (i()) {
            keySize.setIsStrongBoxBacked(true);
            Log.d("AESCipher23", "StrongBox is available and enabled for biometric key");
        } else {
            Log.w("AESCipher23", "StrongBox requested but not available on this device. Using standard TEE.");
        }
        try {
            keyGenerator.init(keySize.build());
            keyGenerator.generateKey();
        } catch (Exception e10) {
            if (!i()) {
                throw e10;
            }
            Log.w("AESCipher23", " Key generation failed with StrongBox. Retrying without StrongBox.", e10);
            KeyGenParameterSpec.Builder unlockedDeviceRequired = new KeyGenParameterSpec.Builder(this.f32399a, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).setUnlockedDeviceRequired(true);
            if (zH) {
                unlockedDeviceRequired.setUserAuthenticationRequired(true);
                unlockedDeviceRequired.setUserAuthenticationParameters(0, 3);
                unlockedDeviceRequired.setInvalidatedByBiometricEnrollment(true);
            }
            keyGenerator.init(unlockedDeviceRequired.build());
            keyGenerator.generateKey();
            Log.d("AESCipher23", "Key generation succeeded without StrongBox");
        }
    }

    public Cipher g(Context context, Key key) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        SharedPreferences sharedPreferences = context.getSharedPreferences("FlutterSecureKeyStorage", 0);
        String string = sharedPreferences.getString("KeyStoreIV1", null);
        if (string != null) {
            cipher.init(2, key, new GCMParameterSpec(128, Base64.decode(string, 0)));
            return cipher;
        }
        cipher.init(1, key);
        byte[] iv = cipher.getIV();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString("KeyStoreIV1", Base64.encodeToString(iv, 0));
        editorEdit.apply();
        return cipher;
    }

    public boolean h() {
        KeyguardManager keyguardManager = (KeyguardManager) this.f32400b.getSystemService("keyguard");
        return keyguardManager != null && keyguardManager.isDeviceSecure();
    }

    public boolean i() {
        return this.f32400b.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore");
    }
}
