package b8;

import P7.u;
import Z7.C2596f;
import Z7.C2601k;
import Z7.G;
import Z7.y;
import e8.I;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class o implements u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f25469d = {0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f25470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I f25471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f25472c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25473a;

        static {
            int[] iArr = new int[I.values().length];
            f25473a = iArr;
            try {
                iArr[I.RAW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25473a[I.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25473a[I.CRUNCHY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25473a[I.TINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public o(u uVar, I i10, byte[] bArr) {
        this.f25470a = uVar;
        this.f25471b = i10;
        this.f25472c = bArr;
    }

    public static u c(C2601k c2601k) throws GeneralSecurityException {
        byte[] bArrD;
        G gE = c2601k.e(P7.f.a());
        u uVar = (u) C2596f.d().a(gE.f(), u.class).d(gE.g());
        I iE = gE.e();
        int i10 = a.f25473a[iE.ordinal()];
        if (i10 == 1) {
            bArrD = y.f20395a.d();
        } else if (i10 == 2 || i10 == 3) {
            bArrD = y.a(c2601k.a().intValue()).d();
        } else {
            if (i10 != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrD = y.b(c2601k.a().intValue()).d();
        }
        return new o(uVar, iE, bArrD);
    }

    @Override // P7.u
    public void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 10) {
            throw new GeneralSecurityException("tag too short");
        }
        if (this.f25471b.equals(I.LEGACY)) {
            bArr2 = f8.f.a(bArr2, f25469d);
        }
        byte[] bArr3 = new byte[0];
        if (!this.f25471b.equals(I.RAW)) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            bArr = Arrays.copyOfRange(bArr, 5, bArr.length);
            bArr3 = bArrCopyOf;
        }
        if (!Arrays.equals(this.f25472c, bArr3)) {
            throw new GeneralSecurityException("wrong prefix");
        }
        this.f25470a.a(bArr, bArr2);
    }

    @Override // P7.u
    public byte[] b(byte[] bArr) throws GeneralSecurityException {
        if (this.f25471b.equals(I.LEGACY)) {
            bArr = f8.f.a(bArr, f25469d);
        }
        return f8.f.a(this.f25472c, this.f25470a.b(bArr));
    }
}
