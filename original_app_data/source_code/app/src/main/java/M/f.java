package M;

import E.AbstractC0807p0;
import android.location.Location;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.apache.tika.utils.StringUtils;
import q1.C5477a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f8814c = "f";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f8815d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f8816e = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ThreadLocal f8817f = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f8818g = i();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final List f8819h = Arrays.asList("ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5477a f8820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8821b = false;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("HH:mm:ss", Locale.US);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d {

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final double f8822a;

            public a(double d10) {
                this.f8822a = d10;
            }

            public double a() {
                return this.f8822a / 2.23694d;
            }
        }

        public static a a(double d10) {
            return new a(d10 * 0.621371d);
        }

        public static a b(double d10) {
            return new a(d10 * 1.15078d);
        }

        public static a c(double d10) {
            return new a(d10);
        }
    }

    public f(C5477a c5477a) {
        this.f8820a = c5477a;
    }

    public static Date a(String str) {
        return ((SimpleDateFormat) f8815d.get()).parse(str);
    }

    public static Date b(String str) {
        return ((SimpleDateFormat) f8817f.get()).parse(str);
    }

    public static Date c(String str) {
        return ((SimpleDateFormat) f8816e.get()).parse(str);
    }

    public static f e(File file) {
        return f(file.toString());
    }

    public static f f(String str) {
        return new f(new C5477a(str));
    }

    public static f g(androidx.camera.core.d dVar) {
        ByteBuffer byteBufferE = dVar.n0()[0].e();
        byteBufferE.rewind();
        byte[] bArr = new byte[byteBufferE.capacity()];
        byteBufferE.get(bArr);
        return h(new ByteArrayInputStream(bArr));
    }

    public static f h(InputStream inputStream) {
        return new f(new C5477a(inputStream));
    }

    public static List i() {
        return Arrays.asList("ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "TransferFunction", "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", "RelatedSoundFile", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation", "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "ISO", "JpgFromRaw", "Xmp", "NewSubfileType", "SubfileType");
    }

    public void d(f fVar) {
        ArrayList<String> arrayList = new ArrayList(f8818g);
        arrayList.removeAll(f8819h);
        for (String str : arrayList) {
            String strJ = this.f8820a.j(str);
            String strJ2 = fVar.f8820a.j(str);
            if (strJ != null && !strJ.equals(strJ2)) {
                fVar.f8820a.f0(str, strJ);
            }
        }
    }

    public String j() {
        return this.f8820a.j("ImageDescription");
    }

    public int k() {
        return this.f8820a.l("ImageLength", 0);
    }

    public Location l() {
        double dA;
        String strJ = this.f8820a.j("GPSProcessingMethod");
        double[] dArrP = this.f8820a.p();
        double dI = this.f8820a.i(0.0d);
        double dK = this.f8820a.k("GPSSpeed", 0.0d);
        String strJ2 = this.f8820a.j("GPSSpeedRef");
        if (strJ2 == null) {
            strJ2 = "K";
        }
        long jT = t(this.f8820a.j("GPSDateStamp"), this.f8820a.j("GPSTimeStamp"));
        if (dArrP == null) {
            return null;
        }
        if (strJ == null) {
            strJ = f8814c;
        }
        Location location = new Location(strJ);
        location.setLatitude(dArrP[0]);
        location.setLongitude(dArrP[1]);
        if (dI != 0.0d) {
            location.setAltitude(dI);
        }
        if (dK != 0.0d) {
            int iHashCode = strJ2.hashCode();
            if (iHashCode == 75) {
                strJ2.equals("K");
            } else if (iHashCode != 77) {
                if (iHashCode == 78 && strJ2.equals("N")) {
                    dA = d.b(dK).a();
                }
                location.setSpeed((float) dA);
            } else {
                if (strJ2.equals("M")) {
                    dA = d.c(dK).a();
                }
                location.setSpeed((float) dA);
            }
            dA = d.a(dK).a();
            location.setSpeed((float) dA);
        }
        if (jT != -1) {
            location.setTime(jT);
        }
        return location;
    }

    public int m() {
        return this.f8820a.l("Orientation", 0);
    }

    public int n() {
        switch (m()) {
            case 3:
            case 4:
                return 180;
            case 5:
                return 270;
            case 6:
            case 7:
                return 90;
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public long o() {
        long jS = s(this.f8820a.j("DateTimeOriginal"));
        if (jS == -1) {
            return -1L;
        }
        String strJ = this.f8820a.j("SubSecTimeOriginal");
        if (strJ == null) {
            return jS;
        }
        try {
            long j10 = Long.parseLong(strJ);
            while (j10 > 1000) {
                j10 /= 10;
            }
            return jS + j10;
        } catch (NumberFormatException unused) {
            return jS;
        }
    }

    public int p() {
        return this.f8820a.l("ImageWidth", 0);
    }

    public boolean q() {
        return m() == 2;
    }

    public boolean r() {
        int iM = m();
        return iM == 4 || iM == 5 || iM == 7;
    }

    public final long s(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return b(str).getTime();
        } catch (ParseException unused) {
            return -1L;
        }
    }

    public final long t(String str, String str2) {
        if (str == null && str2 == null) {
            return -1L;
        }
        if (str2 == null) {
            try {
                return a(str).getTime();
            } catch (ParseException unused) {
                return -1L;
            }
        }
        if (str == null) {
            try {
                return c(str2).getTime();
            } catch (ParseException unused2) {
                return -1L;
            }
        }
        return s(str + StringUtils.SPACE + str2);
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", Integer.valueOf(p()), Integer.valueOf(k()), Integer.valueOf(n()), Boolean.valueOf(r()), Boolean.valueOf(q()), l(), Long.valueOf(o()), j());
    }

    public void u(int i10) {
        if (i10 % 90 != 0) {
            AbstractC0807p0.l(f8814c, String.format(Locale.US, "Can only rotate in right angles (eg. 0, 90, 180, 270). %d is unsupported.", Integer.valueOf(i10)));
            this.f8820a.f0("Orientation", String.valueOf(0));
            return;
        }
        int i11 = i10 % 360;
        int iM = m();
        while (i11 < 0) {
            i11 += 90;
            switch (iM) {
                case 2:
                    iM = 5;
                    break;
                case 3:
                case 8:
                    iM = 6;
                    break;
                case 4:
                    iM = 7;
                    break;
                case 5:
                    iM = 4;
                    break;
                case 6:
                    iM = 1;
                    break;
                case 7:
                    iM = 2;
                    break;
                default:
                    iM = 8;
                    break;
            }
        }
        while (i11 > 0) {
            i11 -= 90;
            switch (iM) {
                case 2:
                    iM = 7;
                    break;
                case 3:
                    iM = 8;
                    break;
                case 4:
                    iM = 5;
                    break;
                case 5:
                    iM = 2;
                    break;
                case 6:
                    iM = 3;
                    break;
                case 7:
                    iM = 4;
                    break;
                case 8:
                    iM = 1;
                    break;
                default:
                    iM = 6;
                    break;
            }
        }
        this.f8820a.f0("Orientation", String.valueOf(iM));
    }
}
