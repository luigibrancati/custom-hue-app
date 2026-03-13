package com.it_nomads.fluttersecurestorage.ciphers;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import javax.crypto.Cipher;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f32405f = e.RSA_ECB_PKCS1Padding;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l f32406g = l.AES_CBC_PKCS7Padding;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f32407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f32408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f32409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f32410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ca.b f32411e;

    public m(SharedPreferences sharedPreferences, String str, String str2, ca.b bVar) {
        this.f32411e = bVar;
        String string = sharedPreferences.getString("FlutterSecureSAlgorithmKey", null);
        String string2 = sharedPreferences.getString("FlutterSecureSAlgorithmStorage", null);
        if (string == null || string2 == null) {
            this.f32407a = f32405f;
            this.f32408b = f32406g;
        } else {
            this.f32407a = e.b(string);
            this.f32408b = l.b(string2);
        }
        l lVarB = l.b(str2);
        int i10 = lVarB.minVersionCode;
        int i11 = Build.VERSION.SDK_INT;
        this.f32410d = i10 > i11 ? f32406g : lVarB;
        e eVarB = e.b(str);
        this.f32409c = eVarB.minVersionCode > i11 ? f32405f : eVarB;
        if (string == null || string2 == null) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            i(editorEdit);
            editorEdit.apply();
        }
    }

    public boolean a() {
        return this.f32407a != this.f32409c;
    }

    public final j b(Context context, a aVar, Cipher cipher, l lVar) throws Exception {
        if (lVar == l.AES_GCM_NoPadding) {
            return g(aVar) ? new p(context, aVar, cipher) : new q(context, aVar, cipher);
        }
        n nVar = lVar.storageCipher;
        if (nVar != null) {
            return nVar.a(context, aVar, cipher);
        }
        throw new Exception("No implementation available for algorithm: " + lVar.name());
    }

    public a c(Context context) {
        return this.f32409c.keyCipher.a(context, this.f32411e);
    }

    public j d(Context context, Cipher cipher) {
        return b(context, this.f32409c.keyCipher.a(context, this.f32411e), cipher, this.f32410d);
    }

    public a e(Context context) {
        return this.f32407a.keyCipher.a(context, this.f32411e);
    }

    public j f(Context context, Cipher cipher) {
        return b(context, this.f32407a.keyCipher.a(context, this.f32411e), cipher, this.f32408b);
    }

    public final boolean g(a aVar) {
        return aVar instanceof g;
    }

    public boolean h() {
        return (this.f32407a == this.f32409c && this.f32408b == this.f32410d) ? false : true;
    }

    public void i(SharedPreferences.Editor editor) {
        editor.putString("FlutterSecureSAlgorithmKey", this.f32409c.name());
        editor.putString("FlutterSecureSAlgorithmStorage", this.f32410d.name());
    }
}
