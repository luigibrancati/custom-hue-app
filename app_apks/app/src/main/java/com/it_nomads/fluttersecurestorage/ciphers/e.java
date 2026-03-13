package com.it_nomads.fluttersecurestorage.ciphers;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public enum e {
    RSA_ECB_PKCS1Padding(new f() { // from class: com.it_nomads.fluttersecurestorage.ciphers.b
        @Override // com.it_nomads.fluttersecurestorage.ciphers.f
        public final a a(Context context, ca.b bVar) {
            return new h(context, bVar);
        }
    }, 1),
    RSA_ECB_OAEPwithSHA_256andMGF1Padding(new f() { // from class: com.it_nomads.fluttersecurestorage.ciphers.c
        @Override // com.it_nomads.fluttersecurestorage.ciphers.f
        public final a a(Context context, ca.b bVar) {
            return new i(context, bVar);
        }
    }, 23),
    AES_GCM_NoPadding(new f() { // from class: com.it_nomads.fluttersecurestorage.ciphers.d
        @Override // com.it_nomads.fluttersecurestorage.ciphers.f
        public final a a(Context context, ca.b bVar) {
            return new g(context, bVar);
        }
    }, 23);

    final f keyCipher;
    final int minVersionCode;

    e(f fVar, int i10) {
        this.keyCipher = fVar;
        this.minVersionCode = i10;
    }

    public static e b(String str) {
        return "AES_GCM_NoPadding_BIOMETRIC".equals(str) ? AES_GCM_NoPadding : valueOf(str);
    }
}
