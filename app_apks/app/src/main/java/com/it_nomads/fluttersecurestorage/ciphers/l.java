package com.it_nomads.fluttersecurestorage.ciphers;

import android.content.Context;
import javax.crypto.Cipher;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public enum l {
    AES_CBC_PKCS7Padding(new n() { // from class: com.it_nomads.fluttersecurestorage.ciphers.k
        @Override // com.it_nomads.fluttersecurestorage.ciphers.n
        public final j a(Context context, a aVar, Cipher cipher) {
            return new o(context, aVar, cipher);
        }
    }, 1),
    AES_GCM_NoPadding(null, 23);

    final int minVersionCode;
    final n storageCipher;

    l(n nVar, int i10) {
        this.storageCipher = nVar;
        this.minVersionCode = i10;
    }

    public static l b(String str) {
        return "AES_GCM_NoPadding_BIOMETRIC".equals(str) ? AES_GCM_NoPadding : valueOf(str);
    }
}
