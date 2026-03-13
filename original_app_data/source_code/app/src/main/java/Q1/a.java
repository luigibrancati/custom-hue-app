package Q1;

import G1.AbstractC0853a;
import I1.x;
import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class a implements I1.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I1.f f13326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f13327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f13328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CipherInputStream f13329d;

    public a(I1.f fVar, byte[] bArr, byte[] bArr2) {
        this.f13326a = fVar;
        this.f13327b = bArr;
        this.f13328c = bArr2;
    }

    @Override // I1.f
    public void close() {
        if (this.f13329d != null) {
            this.f13329d = null;
            this.f13326a.close();
        }
    }

    @Override // I1.f
    public final long f(I1.j jVar) {
        try {
            Cipher cipherL = l();
            try {
                cipherL.init(2, new SecretKeySpec(this.f13327b, "AES"), new IvParameterSpec(this.f13328c));
                I1.h hVar = new I1.h(this.f13326a, jVar);
                this.f13329d = new CipherInputStream(hVar, cipherL);
                hVar.b();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                throw new RuntimeException(e10);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // I1.f
    public final Map g() {
        return this.f13326a.g();
    }

    @Override // I1.f
    public final Uri getUri() {
        return this.f13326a.getUri();
    }

    @Override // I1.f
    public final void h(x xVar) {
        AbstractC0853a.e(xVar);
        this.f13326a.h(xVar);
    }

    public Cipher l() {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    @Override // D1.InterfaceC0749g
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        AbstractC0853a.e(this.f13329d);
        int i12 = this.f13329d.read(bArr, i10, i11);
        if (i12 < 0) {
            return -1;
        }
        return i12;
    }
}
