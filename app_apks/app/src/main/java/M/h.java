package M;

import E.AbstractC0807p0;
import L.EnumC1131x;
import android.os.Build;
import android.util.Pair;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f8831c = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j[] f8832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j[] f8833e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j[] f8834f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j[] f8835g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final j[] f8836h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final j[][] f8837i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final HashSet f8838j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f8839k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ByteOrder f8841b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8842a;

        static {
            int[] iArr = new int[EnumC1131x.values().length];
            f8842a = iArr;
            try {
                iArr[EnumC1131x.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8842a[EnumC1131x.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8842a[EnumC1131x.FIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Pattern f8843c = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Pattern f8844d = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Pattern f8845e = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final List f8846f = Collections.list(new a());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f8847a = Collections.list(new C0134b());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ByteOrder f8848b;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements Enumeration {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f8849a = 0;

            @Override // java.util.Enumeration
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public HashMap nextElement() {
                HashMap map = new HashMap();
                for (j jVar : h.f8837i[this.f8849a]) {
                    map.put(jVar.f8862b, jVar);
                }
                this.f8849a++;
                return map;
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f8849a < h.f8837i.length;
            }
        }

        /* JADX INFO: renamed from: M.h$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class C0134b implements Enumeration {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f8850a = 0;

            public C0134b() {
            }

            @Override // java.util.Enumeration
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map nextElement() {
                this.f8850a++;
                return new HashMap();
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f8850a < h.f8837i.length;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class c implements Enumeration {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Enumeration f8852a;

            public c() {
                this.f8852a = Collections.enumeration(b.this.f8847a);
            }

            @Override // java.util.Enumeration
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map nextElement() {
                return new HashMap((Map) this.f8852a.nextElement());
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f8852a.hasMoreElements();
            }
        }

        public b(ByteOrder byteOrder) {
            this.f8848b = byteOrder;
        }

        public static Pair b(String str) {
            if (str.contains(",")) {
                String[] strArrSplit = str.split(",", -1);
                Pair pairB = b(strArrSplit[0]);
                if (((Integer) pairB.first).intValue() == 2) {
                    return pairB;
                }
                for (int i10 = 1; i10 < strArrSplit.length; i10++) {
                    Pair pairB2 = b(strArrSplit[i10]);
                    int iIntValue = (((Integer) pairB2.first).equals(pairB.first) || ((Integer) pairB2.second).equals(pairB.first)) ? ((Integer) pairB.first).intValue() : -1;
                    int iIntValue2 = (((Integer) pairB.second).intValue() == -1 || !(((Integer) pairB2.first).equals(pairB.second) || ((Integer) pairB2.second).equals(pairB.second))) ? -1 : ((Integer) pairB.second).intValue();
                    if (iIntValue == -1 && iIntValue2 == -1) {
                        return new Pair(2, -1);
                    }
                    if (iIntValue == -1) {
                        pairB = new Pair(Integer.valueOf(iIntValue2), -1);
                    } else if (iIntValue2 == -1) {
                        pairB = new Pair(Integer.valueOf(iIntValue), -1);
                    }
                }
                return pairB;
            }
            if (!str.contains("/")) {
                try {
                    try {
                        long j10 = Long.parseLong(str);
                        return (j10 < 0 || j10 > 65535) ? j10 < 0 ? new Pair(9, -1) : new Pair(4, -1) : new Pair(3, 4);
                    } catch (NumberFormatException unused) {
                        Double.parseDouble(str);
                        return new Pair(12, -1);
                    }
                } catch (NumberFormatException unused2) {
                    return new Pair(2, -1);
                }
            }
            String[] strArrSplit2 = str.split("/", -1);
            if (strArrSplit2.length == 2) {
                try {
                    long j11 = (long) Double.parseDouble(strArrSplit2[0]);
                    long j12 = (long) Double.parseDouble(strArrSplit2[1]);
                    if (j11 >= 0 && j12 >= 0) {
                        if (j11 <= 2147483647L && j12 <= 2147483647L) {
                            return new Pair(10, 5);
                        }
                        return new Pair(5, -1);
                    }
                    return new Pair(10, -1);
                } catch (NumberFormatException unused3) {
                }
            }
            return new Pair(2, -1);
        }

        public h a() {
            ArrayList list = Collections.list(new c());
            if (!((Map) list.get(1)).isEmpty()) {
                d("ExposureProgram", String.valueOf(0), list);
                d("ExifVersion", "0230", list);
                d("ComponentsConfiguration", h.f8839k, list);
                d("MeteringMode", String.valueOf(0), list);
                d("LightSource", String.valueOf(0), list);
                d("FlashpixVersion", "0100", list);
                d("FocalPlaneResolutionUnit", String.valueOf(2), list);
                d("FileSource", String.valueOf(3), list);
                d("SceneType", String.valueOf(1), list);
                d("CustomRendered", String.valueOf(0), list);
                d("SceneCaptureType", String.valueOf(0), list);
                d("Contrast", String.valueOf(0), list);
                d("Saturation", String.valueOf(0), list);
                d("Sharpness", String.valueOf(0), list);
            }
            if (!((Map) list.get(2)).isEmpty()) {
                d("GPSVersionID", "2300", list);
                d("GPSSpeedRef", "K", list);
                d("GPSTrackRef", "T", list);
                d("GPSImgDirectionRef", "T", list);
                d("GPSDestBearingRef", "T", list);
                d("GPSDestDistanceRef", "K", list);
            }
            return new h(this.f8848b, list);
        }

        public b c(String str, String str2) {
            e(str, str2, this.f8847a);
            return this;
        }

        public final void d(String str, String str2, List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Map) it.next()).containsKey(str)) {
                    return;
                }
            }
            e(str, str2, list);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
            	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:217)
            	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:68)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
            */
        public final void e(java.lang.String r18, java.lang.String r19, java.util.List r20) {
            /*
                Method dump skipped, instruction units count: 784
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: M.h.b.e(java.lang.String, java.lang.String, java.util.List):void");
        }

        public b f(long j10) {
            return c("ExposureTime", String.valueOf(j10 / TimeUnit.SECONDS.toNanos(1L)));
        }

        public b g(EnumC1131x enumC1131x) {
            int i10;
            if (enumC1131x == EnumC1131x.UNKNOWN) {
                return this;
            }
            int i11 = a.f8842a[enumC1131x.ordinal()];
            if (i11 == 1) {
                i10 = 0;
            } else if (i11 == 2) {
                i10 = 32;
            } else {
                if (i11 != 3) {
                    AbstractC0807p0.l("ExifData", "Unknown flash state: " + enumC1131x);
                    return this;
                }
                i10 = 1;
            }
            if ((i10 & 1) == 1) {
                c("LightSource", String.valueOf(4));
            }
            return c("Flash", String.valueOf(i10));
        }

        public b h(float f10) {
            return c("FocalLength", new l((long) (f10 * 1000.0f), 1000L).toString());
        }

        public b i(int i10) {
            return c("ImageLength", String.valueOf(i10));
        }

        public b j(int i10) {
            return c("ImageWidth", String.valueOf(i10));
        }

        public b k(int i10) {
            return c("SensitivityType", String.valueOf(3)).c("PhotographicSensitivity", String.valueOf(Math.min(65535, i10)));
        }

        public b l(float f10) {
            return c("FNumber", String.valueOf(f10));
        }

        public b m(int i10) {
            int i11;
            if (i10 == 0) {
                i11 = 1;
            } else if (i10 == 90) {
                i11 = 6;
            } else if (i10 == 180) {
                i11 = 3;
            } else if (i10 != 270) {
                AbstractC0807p0.l("ExifData", "Unexpected orientation value: " + i10 + ". Must be one of 0, 90, 180, 270.");
                i11 = 0;
            } else {
                i11 = 8;
            }
            return c("Orientation", String.valueOf(i11));
        }

        public b n(c cVar) {
            int iOrdinal = cVar.ordinal();
            return c("WhiteBalance", iOrdinal != 0 ? iOrdinal != 1 ? null : String.valueOf(1) : String.valueOf(0));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum c {
        AUTO,
        MANUAL
    }

    static {
        j[] jVarArr = {new j("ImageWidth", 256, 3, 4), new j("ImageLength", 257, 3, 4), new j("Make", 271, 2), new j("Model", 272, 2), new j("Orientation", 274, 3), new j("XResolution", 282, 5), new j("YResolution", 283, 5), new j("ResolutionUnit", 296, 3), new j("Software", 305, 2), new j("DateTime", 306, 2), new j("YCbCrPositioning", 531, 3), new j("SubIFDPointer", 330, 4), new j("ExifIFDPointer", 34665, 4), new j("GPSInfoIFDPointer", 34853, 4)};
        f8832d = jVarArr;
        j[] jVarArr2 = {new j("ExposureTime", 33434, 5), new j("FNumber", 33437, 5), new j("ExposureProgram", 34850, 3), new j("PhotographicSensitivity", 34855, 3), new j("SensitivityType", 34864, 3), new j("ExifVersion", 36864, 2), new j("DateTimeOriginal", 36867, 2), new j("DateTimeDigitized", 36868, 2), new j("ComponentsConfiguration", 37121, 7), new j("ShutterSpeedValue", 37377, 10), new j("ApertureValue", 37378, 5), new j("BrightnessValue", 37379, 10), new j("ExposureBiasValue", 37380, 10), new j("MaxApertureValue", 37381, 5), new j("MeteringMode", 37383, 3), new j("LightSource", 37384, 3), new j("Flash", 37385, 3), new j("FocalLength", 37386, 5), new j("SubSecTime", 37520, 2), new j("SubSecTimeOriginal", 37521, 2), new j("SubSecTimeDigitized", 37522, 2), new j("FlashpixVersion", 40960, 7), new j("ColorSpace", 40961, 3), new j("PixelXDimension", 40962, 3, 4), new j("PixelYDimension", 40963, 3, 4), new j("InteroperabilityIFDPointer", 40965, 4), new j("FocalPlaneResolutionUnit", 41488, 3), new j("SensingMethod", 41495, 3), new j("FileSource", 41728, 7), new j("SceneType", 41729, 7), new j("CustomRendered", 41985, 3), new j("ExposureMode", 41986, 3), new j("WhiteBalance", 41987, 3), new j("SceneCaptureType", 41990, 3), new j("Contrast", 41992, 3), new j("Saturation", 41993, 3), new j("Sharpness", 41994, 3)};
        f8833e = jVarArr2;
        j[] jVarArr3 = {new j("GPSVersionID", 0, 1), new j("GPSLatitudeRef", 1, 2), new j("GPSLatitude", 2, 5, 10), new j("GPSLongitudeRef", 3, 2), new j("GPSLongitude", 4, 5, 10), new j("GPSAltitudeRef", 5, 1), new j("GPSAltitude", 6, 5), new j("GPSTimeStamp", 7, 5), new j("GPSSpeedRef", 12, 2), new j("GPSTrackRef", 14, 2), new j("GPSImgDirectionRef", 16, 2), new j("GPSDestBearingRef", 23, 2), new j("GPSDestDistanceRef", 25, 2)};
        f8834f = jVarArr3;
        f8835g = new j[]{new j("SubIFDPointer", 330, 4), new j("ExifIFDPointer", 34665, 4), new j("GPSInfoIFDPointer", 34853, 4), new j("InteroperabilityIFDPointer", 40965, 4)};
        j[] jVarArr4 = {new j("InteroperabilityIndex", 1, 2)};
        f8836h = jVarArr4;
        f8837i = new j[][]{jVarArr, jVarArr2, jVarArr3, jVarArr4};
        f8838j = new HashSet(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));
        f8839k = new String(new byte[]{1, 2, 3, 0}, StandardCharsets.UTF_8);
    }

    public h(ByteOrder byteOrder, List list) {
        X0.h.j(list.size() == f8837i.length, "Malformed attributes list. Number of IFDs mismatch.");
        this.f8841b = byteOrder;
        this.f8840a = list;
    }

    public static b b() {
        return new b(ByteOrder.BIG_ENDIAN).c("Orientation", String.valueOf(1)).c("XResolution", "72/1").c("YResolution", "72/1").c("ResolutionUnit", String.valueOf(2)).c("YCbCrPositioning", String.valueOf(1)).c("Make", Build.MANUFACTURER).c("Model", Build.MODEL);
    }

    public static h c(androidx.camera.core.d dVar, int i10) {
        b bVarB = b();
        if (dVar.L0() != null) {
            dVar.L0().a(bVarB);
        }
        bVarB.m(i10);
        return bVarB.j(dVar.getWidth()).i(dVar.getHeight()).a();
    }

    public Map d(int i10) {
        X0.h.d(i10, 0, f8837i.length, "Invalid IFD index: " + i10 + ". Index should be between [0, EXIF_TAGS.length] ");
        return (Map) this.f8840a.get(i10);
    }

    public ByteOrder e() {
        return this.f8841b;
    }
}
