package com.it_nomads.fluttersecurestorage.ciphers;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.util.Calendar;
import javax.crypto.Cipher;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class i extends h {
    public i(Context context, ca.b bVar) {
        super(context, bVar);
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.h
    public String e() {
        return this.f32403b.getPackageName() + ".FlutterSecureStoragePluginKeyOAEP";
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.h
    public AlgorithmParameterSpec h() {
        return new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA1, PSource.PSpecified.DEFAULT);
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.h
    public Cipher k() {
        return Cipher.getInstance("RSA/ECB/OAEPPadding", "AndroidKeyStoreBCWorkaround");
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.h
    public AlgorithmParameterSpec l(Context context, Calendar calendar, Calendar calendar2) {
        return new KeyGenParameterSpec.Builder(this.f32402a, 3).setCertificateSubject(new X500Principal("CN=" + this.f32402a)).setDigests("SHA-256").setBlockModes("ECB").setEncryptionPaddings("OAEPPadding").setCertificateSerialNumber(BigInteger.valueOf(1L)).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
    }
}
