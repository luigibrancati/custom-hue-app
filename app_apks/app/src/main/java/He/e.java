package He;

import java.io.IOException;
import java.io.InputStream;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f5358a = {71, 73};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f5359b = {137, 80};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f5360c = {255, 216};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f5361d = {66, 77};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f5362e = {77, 77};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f5363f = {73, 73};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f5364g = {80, 55};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f5365h = {56, 66};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f5366i = {80, 49};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f5367j = {80, 52};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f5368k = {80, 50};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f5369l = {80, 53};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f5370m = {80, 51};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f5371n = {80, 54};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f5372o = {151, 74};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f5373p = {66, 50};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int[] f5374q = {105, 99};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[] f5375r = {177, 104};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int[] f5376s = {35, 63};

    public static /* synthetic */ boolean b(Ie.a aVar, String str) {
        String strA = aVar.a();
        if (strA == null || strA.trim().length() == 0) {
            return false;
        }
        return str != null && str.trim().length() > 0 && strA.substring(strA.lastIndexOf(46) + 1).equalsIgnoreCase(str);
    }

    public static boolean c(int[] iArr, int[] iArr2) {
        if (iArr.length == 2 || iArr2.length == 2) {
            return iArr[0] == iArr2[0] && iArr[1] == iArr2[1];
        }
        throw new IllegalArgumentException("Invalid Byte Pair.");
    }

    public static a d(final Ie.a aVar) throws IOException {
        if (aVar == null) {
            return b.UNKNOWN;
        }
        InputStream inputStreamB = aVar.b();
        try {
            int i10 = inputStreamB.read();
            int i11 = inputStreamB.read();
            if (i10 < 0 || i11 < 0) {
                throw new IllegalArgumentException("Couldn't read magic numbers to guess format.");
            }
            int[] iArr = {i10 & 255, i11 & 255};
            if (c(f5358a, iArr)) {
                b bVar = b.GIF;
                inputStreamB.close();
                return bVar;
            }
            if (c(f5359b, iArr)) {
                b bVar2 = b.PNG;
                inputStreamB.close();
                return bVar2;
            }
            if (c(f5360c, iArr)) {
                b bVar3 = b.JPEG;
                inputStreamB.close();
                return bVar3;
            }
            if (c(f5361d, iArr)) {
                b bVar4 = b.BMP;
                inputStreamB.close();
                return bVar4;
            }
            if (c(f5362e, iArr)) {
                b bVar5 = b.TIFF;
                inputStreamB.close();
                return bVar5;
            }
            if (c(f5363f, iArr)) {
                b bVar6 = b.TIFF;
                inputStreamB.close();
                return bVar6;
            }
            if (c(f5365h, iArr)) {
                b bVar7 = b.PSD;
                inputStreamB.close();
                return bVar7;
            }
            if (c(f5364g, iArr)) {
                b bVar8 = b.PAM;
                inputStreamB.close();
                return bVar8;
            }
            if (c(f5366i, iArr)) {
                b bVar9 = b.PBM;
                inputStreamB.close();
                return bVar9;
            }
            if (c(f5367j, iArr)) {
                b bVar10 = b.PBM;
                inputStreamB.close();
                return bVar10;
            }
            if (c(f5368k, iArr)) {
                b bVar11 = b.PGM;
                inputStreamB.close();
                return bVar11;
            }
            if (c(f5369l, iArr)) {
                b bVar12 = b.PGM;
                inputStreamB.close();
                return bVar12;
            }
            if (c(f5370m, iArr)) {
                b bVar13 = b.PPM;
                inputStreamB.close();
                return bVar13;
            }
            if (c(f5371n, iArr)) {
                b bVar14 = b.PPM;
                inputStreamB.close();
                return bVar14;
            }
            if (c(f5372o, iArr)) {
                int i12 = inputStreamB.read();
                int i13 = inputStreamB.read();
                if (i12 < 0 || i13 < 0) {
                    throw new IllegalArgumentException("Couldn't read magic numbers to guess format.");
                }
                if (c(f5373p, new int[]{i12 & 255, i13 & 255})) {
                    b bVar15 = b.JBIG2;
                    inputStreamB.close();
                    return bVar15;
                }
            } else {
                if (c(f5374q, iArr)) {
                    b bVar16 = b.ICNS;
                    inputStreamB.close();
                    return bVar16;
                }
                if (c(f5375r, iArr)) {
                    b bVar17 = b.DCX;
                    inputStreamB.close();
                    return bVar17;
                }
                if (c(f5376s, iArr)) {
                    b bVar18 = b.RGBE;
                    inputStreamB.close();
                    return bVar18;
                }
            }
            a aVar2 = (a) Stream.of((Object[]) b.values()).filter(new Predicate() { // from class: He.c
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return Stream.of((Object[]) ((b) obj).b()).anyMatch(new Predicate() { // from class: He.d
                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj2) {
                            return e.b(aVar, (String) obj2);
                        }
                    });
                }
            }).findFirst().orElse(b.UNKNOWN);
            inputStreamB.close();
            return aVar2;
        } catch (Throwable th) {
            if (inputStreamB != null) {
                try {
                    inputStreamB.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static a e(byte[] bArr) {
        return d(new Ie.b(bArr));
    }
}
