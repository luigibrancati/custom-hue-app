package f8;

import P7.u;
import a8.C2649a;
import a8.C2654f;
import a8.n;
import c8.C3080a;
import c8.C3081b;
import c8.InterfaceC3082c;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class o implements u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f34221e = {0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3082c f34222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f34224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f34225d;

    public o(InterfaceC3082c interfaceC3082c, int i10) throws InvalidAlgorithmParameterException {
        this.f34222a = interfaceC3082c;
        this.f34223b = i10;
        this.f34224c = new byte[0];
        this.f34225d = new byte[0];
        if (i10 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        interfaceC3082c.a(new byte[0], i10);
    }

    public static u c(C2649a c2649a) {
        return new o(c2649a);
    }

    public static u d(a8.i iVar) {
        return new o(iVar);
    }

    public static InterfaceC3082c e(C2649a c2649a) {
        return m.b(C3080a.d(C3081b.b(c2649a.b().d()), c2649a.f()));
    }

    @Override // P7.u
    public void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!f.b(b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // P7.u
    public byte[] b(byte[] bArr) {
        byte[] bArr2 = this.f34225d;
        return bArr2.length > 0 ? f.a(this.f34224c, this.f34222a.a(f.a(bArr, bArr2), this.f34223b)) : f.a(this.f34224c, this.f34222a.a(bArr, this.f34223b));
    }

    public o(C2649a c2649a) {
        this.f34222a = e(c2649a);
        this.f34223b = c2649a.b().c();
        this.f34224c = c2649a.c().d();
        if (c2649a.b().f().equals(C2654f.c.f21136d)) {
            byte[] bArr = f34221e;
            this.f34225d = Arrays.copyOf(bArr, bArr.length);
        } else {
            this.f34225d = new byte[0];
        }
    }

    public o(a8.i iVar) {
        this.f34222a = new n("HMAC" + iVar.b().d(), new SecretKeySpec(iVar.f().d(P7.f.a()), "HMAC"));
        this.f34223b = iVar.b().c();
        this.f34224c = iVar.c().d();
        if (iVar.b().g().equals(n.d.f21171d)) {
            byte[] bArr = f34221e;
            this.f34225d = Arrays.copyOf(bArr, bArr.length);
        } else {
            this.f34225d = new byte[0];
        }
    }
}
