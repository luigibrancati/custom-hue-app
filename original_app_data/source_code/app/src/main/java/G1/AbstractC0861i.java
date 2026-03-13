package G1;

import D1.C0748f;
import K7.AbstractC1081v;
import android.util.Pair;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.ar.core.ImageMetadata;
import com.google.protobuf.DescriptorProtos$FileOptions;
import io.flutter.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.pipes.PipesConfigBase;

/* JADX INFO: renamed from: G1.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0861i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f4293a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f4294b = {"", "A", "B", "C"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f4295c = Pattern.compile("^\\D?(\\d+)$");

    public static boolean A(byte[] bArr, int i10) {
        if (bArr.length - i10 <= f4293a.length) {
            return false;
        }
        int i11 = 0;
        while (true) {
            byte[] bArr2 = f4293a;
            if (i11 >= bArr2.length) {
                return true;
            }
            if (bArr[i10 + i11] != bArr2[i11]) {
                return false;
            }
            i11++;
        }
    }

    public static int B(int i10) {
        int i11 = 17;
        if (i10 != 17) {
            i11 = 20;
            if (i10 != 20) {
                i11 = 23;
                if (i10 != 23) {
                    i11 = 29;
                    if (i10 != 29) {
                        i11 = 39;
                        if (i10 != 39) {
                            i11 = 42;
                            if (i10 != 42) {
                                switch (i10) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i11;
    }

    public static Pair C(byte[] bArr) {
        C c10 = new C(bArr);
        c10.a0(9);
        int iL = c10.L();
        c10.a0(20);
        return Pair.create(Integer.valueOf(c10.P()), Integer.valueOf(iL));
    }

    public static boolean D(List list) {
        return list.size() == 1 && ((byte[]) list.get(0)).length == 1 && ((byte[]) list.get(0))[0] == 1;
    }

    public static byte[][] E(byte[] bArr) {
        if (!A(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iN = 0;
        do {
            arrayList.add(Integer.valueOf(iN));
            iN = n(bArr, iN + f4293a.length);
        } while (iN != -1);
        byte[][] bArr2 = new byte[arrayList.size()][];
        int i10 = 0;
        while (i10 < arrayList.size()) {
            int iIntValue = ((Integer) arrayList.get(i10)).intValue();
            int iIntValue2 = (i10 < arrayList.size() + (-1) ? ((Integer) arrayList.get(i10 + 1)).intValue() : bArr.length) - iIntValue;
            byte[] bArr3 = new byte[iIntValue2];
            System.arraycopy(bArr, iIntValue, bArr3, 0, iIntValue2);
            bArr2[i10] = bArr3;
            i10++;
        }
        return bArr2;
    }

    public static int F(int i10) {
        if (i10 == 10) {
            return 1;
        }
        if (i10 == 11) {
            return 2;
        }
        if (i10 == 20) {
            return 4;
        }
        if (i10 == 21) {
            return 8;
        }
        if (i10 == 30) {
            return 16;
        }
        if (i10 == 31) {
            return 32;
        }
        if (i10 == 40) {
            return 64;
        }
        if (i10 == 41) {
            return 128;
        }
        if (i10 == 50) {
            return 256;
        }
        if (i10 == 51) {
            return 512;
        }
        switch (i10) {
            case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                return RecognitionOptions.PDF417;
            case 61:
                return RecognitionOptions.AZTEC;
            case 62:
                return 8192;
            default:
                return -1;
        }
    }

    public static int G(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? -1 : 8;
        }
        return 4;
    }

    public static int a(int i10, int i11) {
        if (i10 == 0) {
            return i11 == 0 ? 257 : -1;
        }
        if (i10 == 1) {
            if (i11 == 0) {
                return 513;
            }
            return i11 == 1 ? 514 : -1;
        }
        if (i10 != 2) {
            return -1;
        }
        if (i11 == 1) {
            return 1026;
        }
        return i11 == 2 ? 1028 : -1;
    }

    public static int b(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 == 2) {
            return 4;
        }
        if (i10 != 3) {
            return i10 != 4 ? -1 : 16;
        }
        return 8;
    }

    public static int c(int i10) {
        switch (i10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return RecognitionOptions.UPC_E;
            case 11:
                return RecognitionOptions.PDF417;
            case 12:
                return RecognitionOptions.AZTEC;
            case 13:
                return 8192;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return ImageMetadata.LENS_APERTURE;
            case 20:
                return ImageMetadata.SHADING_MODE;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    public static int d(int i10) {
        switch (i10) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i10) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i10) {
                            case Build.API_LEVELS.API_30 /* 30 */:
                                return 256;
                            case 31:
                                return 512;
                            case 32:
                                return RecognitionOptions.UPC_E;
                            default:
                                switch (i10) {
                                    case DescriptorProtos$FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                                        return RecognitionOptions.PDF417;
                                    case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                                        return RecognitionOptions.AZTEC;
                                    case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                                        return 8192;
                                    default:
                                        switch (i10) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    public static int e(int i10) {
        if (i10 == 66) {
            return 1;
        }
        if (i10 == 77) {
            return 2;
        }
        if (i10 == 88) {
            return 4;
        }
        if (i10 == 100) {
            return 8;
        }
        if (i10 == 110) {
            return 16;
        }
        if (i10 != 122) {
            return i10 != 244 ? -1 : 64;
        }
        return 32;
    }

    public static String f(int i10, int i11, int i12) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static List g(boolean z10) {
        return Collections.singletonList(z10 ? new byte[]{1} : new byte[]{0});
    }

    public static String h(int i10, boolean z10, int i11, int i12, int[] iArr, int i13) {
        StringBuilder sb2 = new StringBuilder(M.G("hvc1.%s%d.%X.%c%d", f4294b[i10], Integer.valueOf(i11), Integer.valueOf(i12), Character.valueOf(z10 ? 'H' : 'L'), Integer.valueOf(i13)));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i14 = 0; i14 < length; i14++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i14])));
        }
        return sb2.toString();
    }

    public static String i(byte[] bArr) {
        C c10 = new C(bArr);
        c10.c0();
        c10.b0(4);
        int iL = c10.L();
        int iL2 = c10.L();
        c10.b0(1);
        c10.c0();
        c10.c0();
        String strI = c10.I(4);
        if (strI.equals("mp4a")) {
            c10.c0();
            c10.b0(2);
            B b10 = new B();
            b10.m(c10);
            int iH = b10.h(5);
            if (iH == 31) {
                iH = b10.h(6) + 32;
            }
            strI = strI + ".40." + iH;
        }
        return M.G("iamf.%03X.%03X.%s", Integer.valueOf(iL), Integer.valueOf(iL2), strI);
    }

    public static byte[] j(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = f4293a;
        byte[] bArr3 = new byte[bArr2.length + i11];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i10, bArr3, bArr2.length, i11);
        return bArr3;
    }

    public static AbstractC1081v k(byte b10, byte b11, byte b12, byte b13) {
        return AbstractC1081v.A(new byte[]{1, 1, b10, 2, 1, b11, 3, 1, b12, 4, 1, b13});
    }

    public static Integer l(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }

    public static Integer m(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }

    public static int n(byte[] bArr, int i10) {
        int length = bArr.length - f4293a.length;
        while (i10 <= length) {
            if (A(bArr, i10)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static Pair o(String str, String[] strArr) {
        int iB;
        if (strArr.length != 3) {
            t.h("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(D1.v.h(Integer.parseInt(strArr[1], 16))) && (iB = B(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair(Integer.valueOf(iB), 0);
            }
        } catch (NumberFormatException unused) {
            t.h("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    public static Pair p(String str, String[] strArr) {
        if (strArr.length != 4) {
            t.h("CodecSpecificDataUtil", "Ignoring malformed AC-4 codec string: " + str);
            return null;
        }
        try {
            int i10 = Integer.parseInt(strArr[1]);
            int i11 = Integer.parseInt(strArr[2]);
            int i12 = Integer.parseInt(strArr[3]);
            int iA = a(i10, i11);
            if (iA == -1) {
                t.h("CodecSpecificDataUtil", "Unknown AC-4 profile: " + i10 + "." + i11);
                return null;
            }
            int iB = b(i12);
            if (iB != -1) {
                return new Pair(Integer.valueOf(iA), Integer.valueOf(iB));
            }
            t.h("CodecSpecificDataUtil", "Unknown AC-4 level: " + i12);
            return null;
        } catch (NumberFormatException unused) {
            t.h("CodecSpecificDataUtil", "Ignoring malformed AC-4 codec string: " + str);
            return null;
        }
    }

    public static Pair q(String str, String[] strArr, C0748f c0748f) {
        int i10;
        if (strArr.length < 4) {
            t.h("CodecSpecificDataUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
        try {
            int i11 = Integer.parseInt(strArr[1]);
            int i12 = Integer.parseInt(strArr[2].substring(0, 2));
            int i13 = Integer.parseInt(strArr[3]);
            if (i11 != 0) {
                t.h("CodecSpecificDataUtil", "Unknown AV1 profile: " + i11);
                return null;
            }
            if (i13 != 8 && i13 != 10) {
                t.h("CodecSpecificDataUtil", "Unknown AV1 bit depth: " + i13);
                return null;
            }
            int i14 = i13 != 8 ? (c0748f == null || !(c0748f.f1700d != null || (i10 = c0748f.f1699c) == 7 || i10 == 6)) ? 2 : RecognitionOptions.AZTEC : 1;
            int iC = c(i12);
            if (iC != -1) {
                return new Pair(Integer.valueOf(i14), Integer.valueOf(iC));
            }
            t.h("CodecSpecificDataUtil", "Unknown AV1 level: " + i12);
            return null;
        } catch (NumberFormatException unused) {
            t.h("CodecSpecificDataUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
    }

    public static Pair r(String str, String[] strArr) {
        int i10;
        int i11;
        if (strArr.length < 2) {
            t.h("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i11 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                i10 = Integer.parseInt(strArr[1].substring(4), 16);
            } else {
                if (strArr.length < 3) {
                    t.h("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str);
                    return null;
                }
                int i12 = Integer.parseInt(strArr[1]);
                i10 = Integer.parseInt(strArr[2]);
                i11 = i12;
            }
            int iE = e(i11);
            if (iE == -1) {
                t.h("CodecSpecificDataUtil", "Unknown AVC profile: " + i11);
                return null;
            }
            int iD = d(i10);
            if (iD != -1) {
                return new Pair(Integer.valueOf(iE), Integer.valueOf(iD));
            }
            t.h("CodecSpecificDataUtil", "Unknown AVC level: " + i10);
            return null;
        } catch (NumberFormatException unused) {
            t.h("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
    }

    public static Pair s(D1.o oVar) {
        String str = oVar.f1801k;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        if ("video/dolby-vision".equals(oVar.f1805o)) {
            return t(oVar.f1801k, strArrSplit);
        }
        String str2 = strArrSplit[0];
        str2.getClass();
        switch (str2) {
            case "ac-4":
                return p(oVar.f1801k, strArrSplit);
            case "av01":
                return q(oVar.f1801k, strArrSplit, oVar.f1778E);
            case "avc1":
            case "avc2":
                return r(oVar.f1801k, strArrSplit);
            case "hev1":
            case "hvc1":
                return v(oVar.f1801k, strArrSplit, oVar.f1778E);
            case "iamf":
                return w(oVar.f1801k, strArrSplit);
            case "mp4a":
                return o(oVar.f1801k, strArrSplit);
            case "s263":
                return u(oVar.f1801k, strArrSplit);
            case "vp09":
                return y(oVar.f1801k, strArrSplit);
            default:
                return null;
        }
    }

    public static Pair t(String str, String[] strArr) {
        if (strArr.length < 3) {
            t.h("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        Matcher matcher = f4295c.matcher(strArr[1]);
        if (!matcher.matches()) {
            t.h("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        String strGroup = matcher.group(1);
        Integer numM = m(strGroup);
        if (numM == null) {
            t.h("CodecSpecificDataUtil", "Unknown Dolby Vision profile string: " + strGroup);
            return null;
        }
        String str2 = strArr[2];
        Integer numL = l(str2);
        if (numL != null) {
            return new Pair(numM, numL);
        }
        t.h("CodecSpecificDataUtil", "Unknown Dolby Vision level string: " + str2);
        return null;
    }

    public static Pair u(String str, String[] strArr) {
        Pair pair = new Pair(1, 1);
        if (strArr.length < 3) {
            t.h("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: " + str);
            return pair;
        }
        try {
            return new Pair(Integer.valueOf(Integer.parseInt(strArr[1])), Integer.valueOf(Integer.parseInt(strArr[2])));
        } catch (NumberFormatException unused) {
            t.h("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: " + str);
            return pair;
        }
    }

    public static Pair v(String str, String[] strArr, C0748f c0748f) {
        if (strArr.length < 4) {
            t.h("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        int i10 = 1;
        Matcher matcher = f4295c.matcher(strArr[1]);
        if (!matcher.matches()) {
            t.h("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        String strGroup = matcher.group(1);
        if (!"1".equals(strGroup)) {
            i10 = 6;
            if ("2".equals(strGroup)) {
                i10 = (c0748f == null || c0748f.f1699c != 6) ? 2 : RecognitionOptions.AZTEC;
            } else if (!"6".equals(strGroup)) {
                t.h("CodecSpecificDataUtil", "Unknown HEVC profile string: " + strGroup);
                return null;
            }
        }
        String str2 = strArr[3];
        Integer numZ = z(str2);
        if (numZ != null) {
            return new Pair(Integer.valueOf(i10), numZ);
        }
        t.h("CodecSpecificDataUtil", "Unknown HEVC level string: " + str2);
        return null;
    }

    public static Pair w(String str, String[] strArr) {
        int i10 = 4;
        if (strArr.length < 4) {
            t.h("CodecSpecificDataUtil", "Ignoring malformed IAMF codec string: " + str);
            return null;
        }
        try {
            int i11 = 1 << (Integer.parseInt(strArr[1]) + 16);
            String str2 = strArr[3];
            str2.getClass();
            switch (str2) {
                case "Opus":
                    i10 = 1;
                    break;
                case "fLaC":
                    break;
                case "ipcm":
                    i10 = 8;
                    break;
                case "mp4a":
                    i10 = 2;
                    break;
                default:
                    t.h("CodecSpecificDataUtil", "Ignoring unknown codec identifier for IAMF auxiliary profile: " + strArr[3]);
                    return null;
            }
            return new Pair(Integer.valueOf(16777216 | i11 | i10), 0);
        } catch (NumberFormatException e10) {
            t.i("CodecSpecificDataUtil", "Ignoring malformed primary profile in IAMF codec string: " + strArr[1], e10);
            return null;
        }
    }

    public static Pair x(byte[] bArr) {
        boolean z10;
        C c10 = new C(bArr);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = i11 + 3;
            if (i12 >= bArr.length) {
                z10 = false;
                break;
            }
            if (c10.O() == 1 && (bArr[i12] & 240) == 32) {
                z10 = true;
                break;
            }
            c10.a0(c10.g() - 2);
            i11++;
        }
        AbstractC0853a.b(z10, "Invalid input: VOL not found.");
        B b10 = new B(bArr);
        b10.r((i11 + 4) * 8);
        b10.r(1);
        b10.r(8);
        if (b10.g()) {
            b10.r(4);
            b10.r(3);
        }
        if (b10.h(4) == 15) {
            b10.r(8);
            b10.r(8);
        }
        if (b10.g()) {
            b10.r(2);
            b10.r(1);
            if (b10.g()) {
                b10.r(79);
            }
        }
        AbstractC0853a.b(b10.h(2) == 0, "Only supports rectangular video object layer shape.");
        AbstractC0853a.a(b10.g());
        int iH = b10.h(16);
        AbstractC0853a.a(b10.g());
        if (b10.g()) {
            AbstractC0853a.a(iH > 0);
            for (int i13 = iH - 1; i13 > 0; i13 >>= 1) {
                i10++;
            }
            b10.r(i10);
        }
        AbstractC0853a.a(b10.g());
        int iH2 = b10.h(13);
        AbstractC0853a.a(b10.g());
        int iH3 = b10.h(13);
        AbstractC0853a.a(b10.g());
        b10.r(1);
        return Pair.create(Integer.valueOf(iH2), Integer.valueOf(iH3));
    }

    public static Pair y(String str, String[] strArr) {
        if (strArr.length < 3) {
            t.h("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
        try {
            int i10 = Integer.parseInt(strArr[1]);
            int i11 = Integer.parseInt(strArr[2]);
            int iG = G(i10);
            if (iG == -1) {
                t.h("CodecSpecificDataUtil", "Unknown VP9 profile: " + i10);
                return null;
            }
            int iF = F(i11);
            if (iF != -1) {
                return new Pair(Integer.valueOf(iG), Integer.valueOf(iF));
            }
            t.h("CodecSpecificDataUtil", "Unknown VP9 level: " + i11);
            return null;
        } catch (NumberFormatException unused) {
            t.h("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
    }

    public static Integer z(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }
}
