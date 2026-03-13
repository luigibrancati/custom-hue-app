package T1;

import D1.C0748f;
import G1.AbstractC0853a;
import G1.M;
import K1.C1005k;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f15962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f15963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f15964f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f15965g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f15966h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f15967i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f15968j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f15969k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f15970l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f15973o = -3.4028235E38f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f15971m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f15972n = -1;

    public p(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f15959a = (String) AbstractC0853a.e(str);
        this.f15960b = str2;
        this.f15961c = str3;
        this.f15962d = codecCapabilities;
        this.f15966h = z10;
        this.f15967i = z11;
        this.f15968j = z12;
        this.f15963e = z13;
        this.f15964f = z14;
        this.f15965g = z15;
        this.f15969k = z16;
        this.f15970l = D1.v.t(str2);
    }

    public static boolean A() {
        String str = Build.MANUFACTURER;
        return str.equals("Xiaomi") || str.equals("OPPO") || str.equals("realme") || str.equals("motorola") || str.equals("LENOVO");
    }

    public static boolean B(String str) {
        return false;
    }

    public static boolean C(String str, int i10) {
        if (!"video/hevc".equals(str) || 2 != i10) {
            return false;
        }
        String str2 = Build.DEVICE;
        return "sailfish".equals(str2) || "marlin".equals(str2);
    }

    public static boolean D(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(Build.DEVICE)) ? false : true;
    }

    public static p E(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return new p(str, str2, str3, codecCapabilities, z10, z11, z12, (z13 || codecCapabilities == null || !i(codecCapabilities) || B(str)) ? false : true, codecCapabilities != null && u(codecCapabilities), z14 || (codecCapabilities != null && t(codecCapabilities)), n(codecCapabilities));
    }

    public static int a(String str, String str2, int i10) {
        if (i10 > 1 || i10 > 0 || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2)) {
            return i10;
        }
        int i11 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
        G1.t.h("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i10 + " to " + i11 + "]");
        return i11;
    }

    public static Point b(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(M.k(i10, widthAlignment) * widthAlignment, M.k(i11, heightAlignment) * heightAlignment);
    }

    public static boolean d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Point pointB = b(videoCapabilities, i10, i11);
        int i12 = pointB.x;
        int i13 = pointB.y;
        if (d10 == -1.0d || d10 < 1.0d) {
            return videoCapabilities.isSizeSupported(i12, i13);
        }
        double dFloor = Math.floor(d10);
        if (!videoCapabilities.areSizeAndRateSupported(i12, i13, dFloor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i12, i13);
        return achievableFrameRatesFor == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
    }

    public static boolean i(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    public static boolean n(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return Build.VERSION.SDK_INT >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface") && !A();
    }

    public static boolean t(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    public static boolean u(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    public static boolean y(String str) {
        return "audio/opus".equals(str);
    }

    public static boolean z(String str) {
        return Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    public Point c(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f15962d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return b(videoCapabilities, i10, i11);
    }

    public C1005k e(D1.o oVar, D1.o oVar2) {
        D1.o oVar3;
        D1.o oVar4;
        int i10;
        int i11 = !Objects.equals(oVar.f1805o, oVar2.f1805o) ? 8 : 0;
        if (this.f15970l) {
            if (oVar.f1774A != oVar2.f1774A) {
                i11 |= RecognitionOptions.UPC_E;
            }
            boolean z10 = (oVar.f1812v == oVar2.f1812v && oVar.f1813w == oVar2.f1813w) ? false : true;
            if (!this.f15963e && z10) {
                i11 |= 512;
            }
            if ((!C0748f.h(oVar.f1778E) || !C0748f.h(oVar2.f1778E)) && !Objects.equals(oVar.f1778E, oVar2.f1778E)) {
                i11 |= RecognitionOptions.PDF417;
            }
            if (z(this.f15959a) && !oVar.f(oVar2)) {
                i11 |= 2;
            }
            int i12 = oVar.f1814x;
            if (i12 != -1 && (i10 = oVar.f1815y) != -1 && i12 == oVar2.f1814x && i10 == oVar2.f1815y && z10) {
                i11 |= 2;
            }
            if (i11 == 0) {
                return new C1005k(this.f15959a, oVar, oVar2, oVar.f(oVar2) ? 3 : 2, 0);
            }
            oVar3 = oVar;
            oVar4 = oVar2;
        } else {
            oVar3 = oVar;
            oVar4 = oVar2;
            if (oVar3.f1780G != oVar4.f1780G) {
                i11 |= RecognitionOptions.AZTEC;
            }
            if (oVar3.f1781H != oVar4.f1781H) {
                i11 |= 8192;
            }
            if (oVar3.f1782I != oVar4.f1782I) {
                i11 |= 16384;
            }
            if (i11 == 0 && "audio/mp4a-latm".equals(this.f15960b)) {
                Pair pairI = z.i(oVar3);
                Pair pairI2 = z.i(oVar4);
                if (pairI != null && pairI2 != null) {
                    int iIntValue = ((Integer) pairI.first).intValue();
                    int iIntValue2 = ((Integer) pairI2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new C1005k(this.f15959a, oVar3, oVar4, 3, 0);
                    }
                }
            }
            if (!oVar3.f(oVar4)) {
                i11 |= 32;
            }
            if (y(this.f15960b)) {
                i11 |= 2;
            }
            if (i11 == 0) {
                return new C1005k(this.f15959a, oVar3, oVar4, 1, 0);
            }
        }
        return new C1005k(this.f15959a, oVar3, oVar4, 0, i11);
    }

    public final float f(int i10, int i11) {
        float f10 = 1024.0f;
        if (v(i10, i11, 1024.0f)) {
            return 1024.0f;
        }
        float f11 = 0.0f;
        while (true) {
            float f12 = f10 - f11;
            if (Math.abs(f12) <= 5.0f) {
                return f11;
            }
            float f13 = (f12 / 2.0f) + f11;
            if (v(i10, i11, f13)) {
                f11 = f13;
            } else {
                f10 = f13;
            }
        }
    }

    public float g(int i10, int i11) {
        if (!this.f15970l) {
            return -3.4028235E38f;
        }
        float f10 = this.f15973o;
        if (f10 != -3.4028235E38f && this.f15971m == i10 && this.f15972n == i11) {
            return f10;
        }
        float f11 = f(i10, i11);
        this.f15973o = f11;
        this.f15971m = i10;
        this.f15972n = i11;
        return f11;
    }

    public MediaCodecInfo.CodecProfileLevel[] h() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f15962d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean j(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f15962d;
        if (codecCapabilities == null) {
            x("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            x("channelCount.aCaps");
            return false;
        }
        if (a(this.f15959a, this.f15960b, audioCapabilities.getMaxInputChannelCount()) >= i10) {
            return true;
        }
        x("channelCount.support, " + i10);
        return false;
    }

    public boolean k(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f15962d;
        if (codecCapabilities == null) {
            x("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            x("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i10)) {
            return true;
        }
        x("sampleRate.support, " + i10);
        return false;
    }

    public final boolean l(D1.o oVar, boolean z10) {
        Pair pairI = z.i(oVar);
        String str = oVar.f1805o;
        if (str != null && str.equals("video/mv-hevc")) {
            String strU = D1.v.u(this.f15961c);
            if (strU.equals("video/mv-hevc")) {
                return true;
            }
            if (strU.equals("video/hevc")) {
                pairI = z.q(oVar);
            }
        }
        if (pairI == null) {
            return true;
        }
        int iIntValue = ((Integer) pairI.first).intValue();
        int iIntValue2 = ((Integer) pairI.second).intValue();
        if ("video/dolby-vision".equals(oVar.f1805o)) {
            String str2 = this.f15960b;
            str2.getClass();
            switch (str2) {
                case "video/av01":
                case "video/hevc":
                    iIntValue2 = 0;
                    iIntValue = 2;
                    break;
                case "video/avc":
                    iIntValue = 8;
                    iIntValue2 = 0;
                    break;
            }
        }
        if (!this.f15970l && iIntValue != 42) {
            return true;
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : h()) {
            if (codecProfileLevel.profile == iIntValue && ((codecProfileLevel.level >= iIntValue2 || !z10) && !C(this.f15960b, iIntValue))) {
                return true;
            }
        }
        x("codec.profileLevel, " + oVar.f1801k + ", " + this.f15961c);
        return false;
    }

    public final boolean m(D1.o oVar) {
        return (Objects.equals(oVar.f1805o, "audio/flac") && oVar.f1782I == 22 && Build.VERSION.SDK_INT < 34 && this.f15959a.equals("c2.android.flac.decoder")) ? false : true;
    }

    public boolean o(D1.o oVar) {
        return r(oVar) && l(oVar, false) && m(oVar);
    }

    public boolean p(D1.o oVar) {
        int i10;
        int i11;
        if (!r(oVar) || !l(oVar, true) || !m(oVar)) {
            return false;
        }
        if (!this.f15970l) {
            int i12 = oVar.f1781H;
            return (i12 == -1 || k(i12)) && ((i10 = oVar.f1780G) == -1 || j(i10));
        }
        int i13 = oVar.f1812v;
        if (i13 <= 0 || (i11 = oVar.f1813w) <= 0) {
            return true;
        }
        return v(i13, i11, oVar.f1816z);
    }

    public boolean q() {
        if ("video/x-vnd.on2.vp9".equals(this.f15960b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : h()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean r(D1.o oVar) {
        return this.f15960b.equals(oVar.f1805o) || this.f15960b.equals(z.f(oVar));
    }

    public boolean s(D1.o oVar) {
        if (this.f15970l) {
            return this.f15963e;
        }
        Pair pairI = z.i(oVar);
        return pairI != null && ((Integer) pairI.first).intValue() == 42;
    }

    public String toString() {
        return this.f15959a;
    }

    public boolean v(int i10, int i11, double d10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f15962d;
        if (codecCapabilities == null) {
            x("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            x("sizeAndRate.vCaps");
            return false;
        }
        int iC = q.c(videoCapabilities, i10, i11, d10);
        if (iC == 2) {
            return true;
        }
        if (iC == 1) {
            x("sizeAndRate.cover, " + i10 + "x" + i11 + "@" + d10);
            return false;
        }
        if (!d(videoCapabilities, i10, i11, d10)) {
            if (i10 >= i11 || !D(this.f15959a) || !d(videoCapabilities, i11, i10, d10)) {
                x("sizeAndRate.support, " + i10 + "x" + i11 + "@" + d10);
                return false;
            }
            w("sizeAndRate.rotated, " + i10 + "x" + i11 + "@" + d10);
        }
        return true;
    }

    public final void w(String str) {
        G1.t.b("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f15959a + ", " + this.f15960b + "] [" + M.f4266e + "]");
    }

    public final void x(String str) {
        G1.t.b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f15959a + ", " + this.f15960b + "] [" + M.f4266e + "]");
    }
}
