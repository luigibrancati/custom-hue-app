package W7;

import Z7.C2596f;
import Z7.C2601k;
import Z7.G;
import Z7.N;
import Z7.y;
import e8.I;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class f implements P7.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P7.e f17846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I f17847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f17848c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17849a;

        static {
            int[] iArr = new int[I.values().length];
            f17849a = iArr;
            try {
                iArr[I.RAW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17849a[I.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17849a[I.CRUNCHY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17849a[I.TINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public f(P7.e eVar, I i10, byte[] bArr) {
        this.f17846a = eVar;
        this.f17847b = i10;
        this.f17848c = bArr;
    }

    public static P7.e c(C2601k c2601k) throws GeneralSecurityException {
        byte[] bArrD;
        G gE = c2601k.e(P7.f.a());
        P7.e eVar = (P7.e) C2596f.d().a(gE.f(), P7.e.class).d(gE.g());
        I iE = gE.e();
        int i10 = a.f17849a[iE.ordinal()];
        if (i10 == 1) {
            bArrD = y.f20395a.d();
        } else if (i10 == 2 || i10 == 3) {
            bArrD = y.a(c2601k.a().intValue()).d();
        } else {
            if (i10 != 4) {
                throw new GeneralSecurityException("unknown output prefix type " + iE.getNumber());
            }
            bArrD = y.b(c2601k.a().intValue()).d();
        }
        return new f(eVar, iE, bArrD);
    }

    @Override // P7.e
    public byte[] a(byte[] bArr, byte[] bArr2) {
        return this.f17847b == I.RAW ? this.f17846a.a(bArr, bArr2) : f8.f.a(this.f17848c, this.f17846a.a(bArr, bArr2));
    }

    @Override // P7.e
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (this.f17847b == I.RAW) {
            return this.f17846a.b(bArr, bArr2);
        }
        if (N.e(this.f17848c, bArr)) {
            return this.f17846a.b(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
