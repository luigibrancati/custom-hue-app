package Q7;

import com.google.crypto.tink.shaded.protobuf.AbstractC3661h;
import com.google.crypto.tink.shaded.protobuf.C3669p;
import e8.C3950A;
import e8.y;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class I implements P7.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f14005d = new byte[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Set f14006e = g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P7.v f14008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final P7.a f14009c;

    public I(C3950A c3950a, P7.a aVar) {
        if (f(c3950a.U())) {
            this.f14007a = c3950a.U();
            this.f14008b = e(c3950a);
            this.f14009c = aVar;
        } else {
            throw new IllegalArgumentException("Unsupported DEK key type: " + c3950a.U() + ". Only Tink AEAD key types are supported.");
        }
    }

    public static P7.a d(AbstractC1908c abstractC1908c, P7.a aVar) throws GeneralSecurityException {
        try {
            return new I(C3950A.Y(P7.y.b(abstractC1908c), C3669p.b()), aVar);
        } catch (com.google.crypto.tink.shaded.protobuf.A e10) {
            throw new GeneralSecurityException(e10);
        }
    }

    public static boolean f(String str) {
        return f14006e.contains(str);
    }

    public static Set g() {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        return Collections.unmodifiableSet(hashSet);
    }

    @Override // P7.a
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        P7.g gVarC = Z7.q.f().c(this.f14008b, null);
        byte[] bArrA = this.f14009c.a(((Z7.G) Z7.x.c().n(gVarC, Z7.G.class, P7.f.a())).g().y(), f14005d);
        if (bArrA.length <= 4096) {
            return c(bArrA, ((P7.a) Z7.u.b().a(gVarC, P7.a.class)).a(bArr, bArr2));
        }
        throw new GeneralSecurityException("length of encrypted DEK too large");
    }

    @Override // P7.a
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i10 = byteBufferWrap.getInt();
            if (i10 <= 0 || i10 > 4096 || i10 > bArr.length - 4) {
                throw new GeneralSecurityException("length of encrypted DEK too large");
            }
            byte[] bArr3 = new byte[i10];
            byteBufferWrap.get(bArr3, 0, i10);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            return ((P7.a) Z7.u.b().a(Z7.x.c().f(Z7.G.b(this.f14007a, AbstractC3661h.h(this.f14009c.b(bArr3, f14005d)), y.c.SYMMETRIC, e8.I.RAW, null), P7.f.a()), P7.a.class)).b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e10) {
            throw new GeneralSecurityException("invalid ciphertext", e10);
        }
    }

    public final byte[] c(byte[] bArr, byte[] bArr2) {
        return ByteBuffer.allocate(bArr.length + 4 + bArr2.length).putInt(bArr.length).put(bArr).put(bArr2).array();
    }

    public final P7.v e(C3950A c3950a) {
        return P7.y.a(((C3950A) C3950A.X(c3950a).t(e8.I.RAW).i()).g());
    }
}
