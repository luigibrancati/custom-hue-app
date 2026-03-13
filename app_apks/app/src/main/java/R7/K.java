package R7;

import Z7.C2596f;
import Z7.C2601k;
import g8.C4160a;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class K implements P7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P7.a f14852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f14853b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14854a;

        static {
            int[] iArr = new int[e8.I.values().length];
            f14854a = iArr;
            try {
                iArr[e8.I.RAW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14854a[e8.I.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14854a[e8.I.CRUNCHY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14854a[e8.I.TINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public K(P7.a aVar, byte[] bArr) {
        this.f14852a = aVar;
        if (bArr.length != 0 && bArr.length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.f14853b = bArr;
    }

    public static P7.a c(P7.a aVar, C4160a c4160a) {
        return new K(aVar, c4160a.d());
    }

    public static P7.a d(C2601k c2601k) throws GeneralSecurityException {
        byte[] bArrD;
        Z7.G gE = c2601k.e(P7.f.a());
        P7.a aVar = (P7.a) C2596f.d().a(gE.f(), P7.a.class).d(gE.g());
        e8.I iE = gE.e();
        int i10 = a.f14854a[iE.ordinal()];
        if (i10 == 1) {
            bArrD = Z7.y.f20395a.d();
        } else if (i10 == 2 || i10 == 3) {
            bArrD = Z7.y.a(c2601k.a().intValue()).d();
        } else {
            if (i10 != 4) {
                throw new GeneralSecurityException("unknown output prefix type " + iE);
            }
            bArrD = Z7.y.b(c2601k.a().intValue()).d();
        }
        return new K(aVar, bArrD);
    }

    @Override // P7.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f14853b;
        return bArr3.length == 0 ? this.f14852a.a(bArr, bArr2) : f8.f.a(bArr3, this.f14852a.a(bArr, bArr2));
    }

    @Override // P7.a
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f14853b;
        if (bArr3.length == 0) {
            return this.f14852a.b(bArr, bArr2);
        }
        if (Z7.N.e(bArr3, bArr)) {
            return this.f14852a.b(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
