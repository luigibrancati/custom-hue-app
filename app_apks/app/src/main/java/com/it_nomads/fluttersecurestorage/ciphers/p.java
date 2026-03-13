package com.it_nomads.fluttersecurestorage.ciphers;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class p implements j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Key f32417c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SecureRandom f32416b = new SecureRandom();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cipher f32415a = e();

    public p(Context context, a aVar, Cipher cipher) {
        this.f32417c = f(context, cipher);
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.j
    public byte[] a(byte[] bArr) throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArrD = d(12);
        this.f32415a.init(1, this.f32417c, new GCMParameterSpec(128, bArrD));
        byte[] bArrDoFinal = this.f32415a.doFinal(bArr);
        byte[] bArr2 = new byte[bArrD.length + bArrDoFinal.length];
        System.arraycopy(bArrD, 0, bArr2, 0, bArrD.length);
        System.arraycopy(bArrDoFinal, 0, bArr2, bArrD.length, bArrDoFinal.length);
        return bArr2;
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.j
    public byte[] b(byte[] bArr) throws InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArr2 = new byte[12];
        System.arraycopy(bArr, 0, bArr2, 0, 12);
        int length = bArr.length - 12;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, 12, bArr3, 0, length);
        this.f32415a.init(2, this.f32417c, new GCMParameterSpec(128, bArr2));
        return this.f32415a.doFinal(bArr3);
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.j
    public void c(Context context) {
        context.getSharedPreferences("FlutterSecureKeyStorage", 0).edit().remove("BVGhpcyBpcyB0aGUga2V5IGZvciBhIHNlY3VyZSBzdG9yYWdlIEFFUyBLZXkK").apply();
    }

    public byte[] d(int i10) {
        byte[] bArr = new byte[i10];
        this.f32416b.nextBytes(bArr);
        return bArr;
    }

    public Cipher e() {
        return Cipher.getInstance("AES/GCM/NoPadding");
    }

    public final SecretKey f(Context context, Cipher cipher) throws BadPaddingException, IllegalBlockSizeException {
        if (cipher == null) {
            cipher = e();
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("FlutterSecureKeyStorage", 0);
        String string = sharedPreferences.getString("BVGhpcyBpcyB0aGUga2V5IGZvciBhIHNlY3VyZSBzdG9yYWdlIEFFUyBLZXkK", null);
        if (string != null) {
            return new SecretKeySpec(cipher.doFinal(Base64.decode(string, 0)), "AES");
        }
        byte[] bArrD = d(32);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArrD, "AES");
        byte[] bArrDoFinal = cipher.doFinal(bArrD);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString("BVGhpcyBpcyB0aGUga2V5IGZvciBhIHNlY3VyZSBzdG9yYWdlIEFFUyBLZXkK", Base64.encodeToString(bArrDoFinal, 0));
        editorEdit.apply();
        return secretKeySpec;
    }
}
