package J2;

import G1.AbstractC0853a;
import G1.M;
import G1.t;
import N7.g;
import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import io.flutter.embedding.android.KeyboardMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f5919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f5920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f5921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f5922f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f5923g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f5924h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f5925i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f5926j;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f5928b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f5929c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f5930d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f5931e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f5932f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f5933g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f5934h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f5935i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f5936j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f5937k;

        public a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
            this.f5927a = i10;
            this.f5928b = i11;
            this.f5929c = i12;
            this.f5930d = i13;
            this.f5931e = i14;
            this.f5932f = i15;
            this.f5933g = i16;
            this.f5934h = i17;
            this.f5935i = i18;
            this.f5936j = i19;
            this.f5937k = i20;
        }

        public static a a(String str) {
            String[] strArrSplit = TextUtils.split(str.substring(7), ",");
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            for (int i20 = 0; i20 < strArrSplit.length; i20++) {
                String strE = J7.c.e(strArrSplit[i20].trim());
                strE.getClass();
                switch (strE) {
                    case "italic":
                        i16 = i20;
                        break;
                    case "underline":
                        i17 = i20;
                        break;
                    case "strikeout":
                        i18 = i20;
                        break;
                    case "primarycolour":
                        i12 = i20;
                        break;
                    case "bold":
                        i15 = i20;
                        break;
                    case "name":
                        i10 = i20;
                        break;
                    case "fontsize":
                        i14 = i20;
                        break;
                    case "borderstyle":
                        i19 = i20;
                        break;
                    case "alignment":
                        i11 = i20;
                        break;
                    case "outlinecolour":
                        i13 = i20;
                        break;
                }
            }
            if (i10 != -1) {
                return new a(i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, strArrSplit.length);
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Pattern f5938c = Pattern.compile("\\{([^}]*)\\}");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Pattern f5939d = Pattern.compile(M.G("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Pattern f5940e = Pattern.compile(M.G("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Pattern f5941f = Pattern.compile("\\\\an(\\d+)");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5942a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PointF f5943b;

        public b(int i10, PointF pointF) {
            this.f5942a = i10;
            this.f5943b = pointF;
        }

        public static int a(String str) {
            Matcher matcher = f5941f.matcher(str);
            if (matcher.find()) {
                return c.e((String) AbstractC0853a.e(matcher.group(1)));
            }
            return -1;
        }

        public static b b(String str) {
            Matcher matcher = f5938c.matcher(str);
            PointF pointF = null;
            int i10 = -1;
            while (matcher.find()) {
                String str2 = (String) AbstractC0853a.e(matcher.group(1));
                try {
                    PointF pointFC = c(str2);
                    if (pointFC != null) {
                        pointF = pointFC;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int iA = a(str2);
                    if (iA != -1) {
                        i10 = iA;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new b(i10, pointF);
        }

        public static PointF c(String str) {
            String strGroup;
            String strGroup2;
            Matcher matcher = f5939d.matcher(str);
            Matcher matcher2 = f5940e.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    t.f("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                strGroup = matcher.group(1);
                strGroup2 = matcher.group(2);
            } else {
                if (!zFind2) {
                    return null;
                }
                strGroup = matcher2.group(1);
                strGroup2 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) AbstractC0853a.e(strGroup)).trim()), Float.parseFloat(((String) AbstractC0853a.e(strGroup2)).trim()));
        }

        public static String d(String str) {
            return f5938c.matcher(str).replaceAll("");
        }
    }

    public c(String str, int i10, Integer num, Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.f5917a = str;
        this.f5918b = i10;
        this.f5919c = num;
        this.f5920d = num2;
        this.f5921e = f10;
        this.f5922f = z10;
        this.f5923g = z11;
        this.f5924h = z12;
        this.f5925i = z13;
        this.f5926j = i11;
    }

    public static c b(String str, a aVar) {
        boolean z10;
        boolean z11;
        AbstractC0853a.a(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i10 = aVar.f5937k;
        if (length != i10) {
            t.h("SsaStyle", M.G("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i10), Integer.valueOf(strArrSplit.length), str));
            return null;
        }
        try {
            String strTrim = strArrSplit[aVar.f5927a].trim();
            int i11 = aVar.f5928b;
            int iE = i11 != -1 ? e(strArrSplit[i11].trim()) : -1;
            int i12 = aVar.f5929c;
            Integer numH = i12 != -1 ? h(strArrSplit[i12].trim()) : null;
            int i13 = aVar.f5930d;
            Integer numH2 = i13 != -1 ? h(strArrSplit[i13].trim()) : null;
            int i14 = aVar.f5931e;
            float fI = i14 != -1 ? i(strArrSplit[i14].trim()) : -3.4028235E38f;
            int i15 = aVar.f5932f;
            boolean z12 = false;
            boolean z13 = true;
            if (i15 == -1 || !f(strArrSplit[i15].trim())) {
                z10 = false;
            } else {
                z10 = false;
                z12 = true;
            }
            int i16 = aVar.f5933g;
            if (i16 == -1 || !f(strArrSplit[i16].trim())) {
                z11 = true;
                z13 = z10;
            } else {
                z11 = true;
            }
            int i17 = aVar.f5934h;
            if (i17 == -1 || !f(strArrSplit[i17].trim())) {
                z11 = false;
            }
            int i18 = aVar.f5935i;
            boolean z14 = i18 != -1 && f(strArrSplit[i18].trim());
            int i19 = aVar.f5936j;
            return new c(strTrim, iE, numH, numH2, fI, z12, z13, z11, z14, i19 != -1 ? g(strArrSplit[i19].trim()) : -1);
        } catch (RuntimeException e10) {
            t.i("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e10);
            return null;
        }
    }

    public static boolean c(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    public static boolean d(int i10) {
        return i10 == 1 || i10 == 3;
    }

    public static int e(String str) {
        try {
            int i10 = Integer.parseInt(str.trim());
            if (c(i10)) {
                return i10;
            }
        } catch (NumberFormatException unused) {
        }
        t.h("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    public static boolean f(String str) {
        try {
            int i10 = Integer.parseInt(str);
            return i10 == 1 || i10 == -1;
        } catch (NumberFormatException e10) {
            t.i("SsaStyle", "Failed to parse boolean value: '" + str + "'", e10);
            return false;
        }
    }

    public static int g(String str) {
        try {
            int i10 = Integer.parseInt(str.trim());
            if (d(i10)) {
                return i10;
            }
        } catch (NumberFormatException unused) {
        }
        t.h("SsaStyle", "Ignoring unknown BorderStyle: " + str);
        return -1;
    }

    public static Integer h(String str) {
        try {
            long j10 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            AbstractC0853a.a(j10 <= KeyboardMap.kValueMask);
            return Integer.valueOf(Color.argb(g.e(((j10 >> 24) & 255) ^ 255), g.e(j10 & 255), g.e((j10 >> 8) & 255), g.e((j10 >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            t.i("SsaStyle", "Failed to parse color expression: '" + str + "'", e10);
            return null;
        }
    }

    public static float i(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e10) {
            t.i("SsaStyle", "Failed to parse font size: '" + str + "'", e10);
            return -3.4028235E38f;
        }
    }
}
