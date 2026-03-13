package com.it_nomads.fluttersecurestorage.ciphers;

import android.content.Context;
import java.security.Key;
import javax.crypto.Cipher;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public interface a {
    byte[] a(Key key);

    void b();

    Cipher c(Context context);

    Key d(byte[] bArr, String str);
}
