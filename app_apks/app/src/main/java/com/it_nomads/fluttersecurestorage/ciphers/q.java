package com.it_nomads.fluttersecurestorage.ciphers;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class q implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cipher f32418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SecureRandom f32419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Key f32420c;

    public q(Context context, a aVar, Cipher cipher) {
        SecureRandom secureRandom = new SecureRandom();
        this.f32419b = secureRandom;
        SharedPreferences sharedPreferences = context.getSharedPreferences("FlutterSecureKeyStorage", 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        String string = sharedPreferences.getString("AESVGhpcyBpcyB0aGUga2V5IGZvciBhIHNlY3VyZSBzdG9yYWdlIEFFUyBLZXkK", null);
        this.f32418a = d();
        if (string != null) {
            this.f32420c = aVar.d(Base64.decode(string, 0), "AES");
            return;
        }
        byte[] bArr = new byte[16];
        secureRandom.nextBytes(bArr);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f32420c = secretKeySpec;
        editorEdit.putString("AESVGhpcyBpcyB0aGUga2V5IGZvciBhIHNlY3VyZSBzdG9yYWdlIEFFUyBLZXkK", Base64.encodeToString(aVar.a(secretKeySpec), 0));
        editorEdit.apply();
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.j
    public byte[] a(byte[] bArr) throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException, InvalidAlgorithmParameterException {
        int iE = e();
        byte[] bArr2 = new byte[iE];
        this.f32419b.nextBytes(bArr2);
        this.f32418a.init(1, this.f32420c, f(bArr2));
        byte[] bArrDoFinal = this.f32418a.doFinal(bArr);
        byte[] bArr3 = new byte[bArrDoFinal.length + iE];
        System.arraycopy(bArr2, 0, bArr3, 0, iE);
        System.arraycopy(bArrDoFinal, 0, bArr3, iE, bArrDoFinal.length);
        return bArr3;
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.j
    public byte[] b(byte[] bArr) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int iE = e();
        byte[] bArr2 = new byte[iE];
        System.arraycopy(bArr, 0, bArr2, 0, iE);
        AlgorithmParameterSpec algorithmParameterSpecF = f(bArr2);
        int length = bArr.length - e();
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, iE, bArr3, 0, length);
        this.f32418a.init(2, this.f32420c, algorithmParameterSpecF);
        return this.f32418a.doFinal(bArr3);
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.j
    public void c(Context context) {
        context.getSharedPreferences("FlutterSecureKeyStorage", 0).edit().remove("AESVGhpcyBpcyB0aGUga2V5IGZvciBhIHNlY3VyZSBzdG9yYWdlIEFFUyBLZXkK").apply();
    }

    public Cipher d() {
        return Cipher.getInstance("AES/GCM/NoPadding");
    }

    public int e() {
        return 12;
    }

    public AlgorithmParameterSpec f(byte[] bArr) {
        return new GCMParameterSpec(128, bArr);
    }
}
