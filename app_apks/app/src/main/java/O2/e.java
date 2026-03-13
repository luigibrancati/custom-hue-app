package O2;

import F1.a;
import G1.AbstractC0853a;
import G1.C;
import G1.M;
import G1.t;
import O2.e;
import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f10883a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*)?$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f10884b = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f10885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f10886d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Comparator f10887c = new Comparator() { // from class: O2.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((e.b) obj).f10888a.f10891b, ((e.b) obj2).f10888a.f10891b);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f10888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10889b;

        public b(c cVar, int i10) {
            this.f10888a = cVar;
            this.f10889b = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10890a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10891b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f10892c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Set f10893d;

        public c(String str, int i10, String str2, Set set) {
            this.f10891b = i10;
            this.f10890a = str;
            this.f10892c = str2;
            this.f10893d = set;
        }

        public static c a(String str, int i10) {
            String str2;
            String strTrim = str.trim();
            AbstractC0853a.a(!strTrim.isEmpty());
            int iIndexOf = strTrim.indexOf(StringUtils.SPACE);
            if (iIndexOf == -1) {
                str2 = "";
            } else {
                String strTrim2 = strTrim.substring(iIndexOf).trim();
                strTrim = strTrim.substring(0, iIndexOf);
                str2 = strTrim2;
            }
            String[] strArrH1 = M.h1(strTrim, "\\.");
            String str3 = strArrH1[0];
            HashSet hashSet = new HashSet();
            for (int i11 = 1; i11 < strArrH1.length; i11++) {
                hashSet.add(strArrH1[i11]);
            }
            return new c(str3, i10, str2, hashSet);
        }

        public static c b() {
            return new c("", 0, "", Collections.EMPTY_SET);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10894a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final O2.c f10895b;

        public d(int i10, O2.c cVar) {
            this.f10894a = i10;
            this.f10895b = cVar;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return Integer.compare(this.f10894a, dVar.f10894a);
        }
    }

    /* JADX INFO: renamed from: O2.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0155e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f10898c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f10896a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f10897b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f10899d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f10900e = -3.4028235E38f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f10901f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f10902g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f10903h = -3.4028235E38f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f10904i = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f10905j = 1.0f;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f10906k = Integer.MIN_VALUE;

        public static float b(float f10, int i10) {
            if (f10 == -3.4028235E38f || i10 != 0 || (f10 >= 0.0f && f10 <= 1.0f)) {
                return f10 != -3.4028235E38f ? f10 : i10 == 0 ? 1.0f : -3.4028235E38f;
            }
            return 1.0f;
        }

        public static Layout.Alignment c(int i10) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            t.h("WebvttCueParser", "Unknown textAlignment: " + i10);
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        public static float d(int i10, float f10) {
            if (i10 == 0) {
                return 1.0f - f10;
            }
            if (i10 == 1) {
                return f10 <= 0.5f ? f10 * 2.0f : (1.0f - f10) * 2.0f;
            }
            if (i10 == 2) {
                return f10;
            }
            throw new IllegalStateException(String.valueOf(i10));
        }

        public static float e(int i10) {
            if (i10 != 4) {
                return i10 != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        public static int f(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 3) {
                return 2;
            }
            if (i10 != 4) {
                return i10 != 5 ? 1 : 2;
            }
            return 0;
        }

        public O2.d a() {
            return new O2.d(g().a(), this.f10896a, this.f10897b);
        }

        public a.b g() {
            float fE = this.f10903h;
            if (fE == -3.4028235E38f) {
                fE = e(this.f10899d);
            }
            int iF = this.f10904i;
            if (iF == Integer.MIN_VALUE) {
                iF = f(this.f10899d);
            }
            a.b bVarR = new a.b().p(c(this.f10899d)).h(b(this.f10900e, this.f10901f), this.f10901f).i(this.f10902g).k(fE).l(iF).n(Math.min(this.f10905j, d(iF, fE))).r(this.f10906k);
            CharSequence charSequence = this.f10898c;
            if (charSequence != null) {
                bVarR.o(charSequence);
            }
            return bVarR;
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f10885c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f10886d = Collections.unmodifiableMap(map2);
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, Set set, int i10, int i11) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Map map = f10885c;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str)).intValue()), i10, i11, 33);
            } else {
                Map map2 = f10886d;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str)).intValue()), i10, i11, 33);
                }
            }
        }
    }

    public static void b(String str, SpannableStringBuilder spannableStringBuilder) {
        str.getClass();
        switch (str) {
            case "gt":
                spannableStringBuilder.append('>');
                break;
            case "lt":
                spannableStringBuilder.append('<');
                break;
            case "amp":
                spannableStringBuilder.append('&');
                break;
            case "nbsp":
                spannableStringBuilder.append(' ');
                break;
            default:
                t.h("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                break;
        }
    }

    public static void c(SpannableStringBuilder spannableStringBuilder, String str, c cVar, List list, List list2) {
        int iJ = j(list2, str, cVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, b.f10887c);
        int i10 = cVar.f10891b;
        int length = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if ("rt".equals(((b) arrayList.get(i11)).f10888a.f10890a)) {
                b bVar = (b) arrayList.get(i11);
                int iH = h(j(list2, str, bVar.f10888a), iJ, 1);
                int i12 = bVar.f10888a.f10891b - length;
                int i13 = bVar.f10889b - length;
                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i12, i13);
                spannableStringBuilder.delete(i12, i13);
                spannableStringBuilder.setSpan(new F1.f(charSequenceSubSequence.toString(), iH), i10, i12, 33);
                length += charSequenceSubSequence.length();
                i10 = i12;
            }
        }
    }

    public static void d(String str, c cVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i10;
        int length;
        i10 = cVar.f10891b;
        length = spannableStringBuilder.length();
        String str2 = cVar.f10890a;
        str2.getClass();
        switch (str2) {
            case "":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i10, length, 33);
                break;
            case "c":
                a(spannableStringBuilder, cVar.f10893d, i10, length);
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i10, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
                break;
            case "v":
                f(spannableStringBuilder, cVar.f10892c, i10, length);
                break;
            case "ruby":
                c(spannableStringBuilder, str, cVar, list, list2);
                break;
            default:
                return;
        }
        List listI = i(list2, str, cVar);
        for (int i11 = 0; i11 < listI.size(); i11++) {
            e(spannableStringBuilder, ((d) listI.get(i11)).f10895b, i10, length);
        }
    }

    public static void e(SpannableStringBuilder spannableStringBuilder, O2.c cVar, int i10, int i11) {
        if (cVar == null) {
            return;
        }
        if (cVar.i() != -1) {
            F1.g.b(spannableStringBuilder, new StyleSpan(cVar.i()), i10, i11, 33);
        }
        if (cVar.l()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        if (cVar.m()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }
        if (cVar.k()) {
            F1.g.b(spannableStringBuilder, new ForegroundColorSpan(cVar.c()), i10, i11, 33);
        }
        if (cVar.j()) {
            F1.g.b(spannableStringBuilder, new BackgroundColorSpan(cVar.a()), i10, i11, 33);
        }
        if (cVar.d() != null) {
            F1.g.b(spannableStringBuilder, new TypefaceSpan(cVar.d()), i10, i11, 33);
        }
        int iF = cVar.f();
        if (iF == 1) {
            F1.g.b(spannableStringBuilder, new AbsoluteSizeSpan((int) cVar.e(), true), i10, i11, 33);
        } else if (iF == 2) {
            F1.g.b(spannableStringBuilder, new RelativeSizeSpan(cVar.e()), i10, i11, 33);
        } else if (iF == 3) {
            F1.g.b(spannableStringBuilder, new RelativeSizeSpan(cVar.e() / 100.0f), i10, i11, 33);
        }
        if (cVar.b()) {
            spannableStringBuilder.setSpan(new F1.e(), i10, i11, 33);
        }
    }

    public static void f(SpannableStringBuilder spannableStringBuilder, String str, int i10, int i11) {
        spannableStringBuilder.setSpan(new F1.i(str), i10, i11, 33);
    }

    public static int g(String str, int i10) {
        int iIndexOf = str.indexOf(62, i10);
        return iIndexOf == -1 ? str.length() : iIndexOf + 1;
    }

    public static int h(int i10, int i11, int i12) {
        if (i10 != -1) {
            return i10;
        }
        if (i11 != -1) {
            return i11;
        }
        if (i12 != -1) {
            return i12;
        }
        throw new IllegalArgumentException();
    }

    public static List i(List list, String str, c cVar) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            O2.c cVar2 = (O2.c) list.get(i10);
            int iH = cVar2.h(str, cVar.f10890a, cVar.f10893d, cVar.f10892c);
            if (iH > 0) {
                arrayList.add(new d(iH, cVar2));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int j(List list, String str, c cVar) {
        List listI = i(list, str, cVar);
        for (int i10 = 0; i10 < listI.size(); i10++) {
            O2.c cVar2 = ((d) listI.get(i10)).f10895b;
            if (cVar2.g() != -1) {
                return cVar2.g();
            }
        }
        return -1;
    }

    public static String k(String str) {
        String strTrim = str.trim();
        AbstractC0853a.a(!strTrim.isEmpty());
        return M.i1(strTrim, "[ \\.]")[0];
    }

    public static boolean l(String str) {
        str.getClass();
        switch (str) {
            case "b":
            case "c":
            case "i":
            case "u":
            case "v":
            case "rt":
            case "lang":
            case "ruby":
                return true;
            default:
                return false;
        }
    }

    public static F1.a m(CharSequence charSequence) {
        C0155e c0155e = new C0155e();
        c0155e.f10898c = charSequence;
        return c0155e.g().a();
    }

    public static O2.d n(C c10, List list) {
        String strW = c10.w();
        if (strW == null) {
            return null;
        }
        Pattern pattern = f10883a;
        Matcher matcher = pattern.matcher(strW);
        if (matcher.matches()) {
            return o(null, matcher, c10, list);
        }
        String strW2 = c10.w();
        if (strW2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(strW2);
        if (matcher2.matches()) {
            return o(strW.trim(), matcher2, c10, list);
        }
        return null;
    }

    public static O2.d o(String str, Matcher matcher, C c10, List list) {
        C0155e c0155e = new C0155e();
        try {
            c0155e.f10896a = h.d((String) AbstractC0853a.e(matcher.group(1)));
            c0155e.f10897b = h.d((String) AbstractC0853a.e(matcher.group(2)));
            q((String) AbstractC0853a.e(matcher.group(3)), c0155e);
            StringBuilder sb2 = new StringBuilder();
            String strW = c10.w();
            while (!TextUtils.isEmpty(strW)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(strW.trim());
                strW = c10.w();
            }
            c0155e.f10898c = r(str, sb2.toString(), list);
            return c0155e.a();
        } catch (IllegalArgumentException unused) {
            t.h("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    public static a.b p(String str) {
        C0155e c0155e = new C0155e();
        q(str, c0155e);
        return c0155e.g();
    }

    public static void q(String str, C0155e c0155e) {
        Matcher matcher = f10884b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) AbstractC0853a.e(matcher.group(1));
            String str3 = (String) AbstractC0853a.e(matcher.group(2));
            try {
                if (Constants.LINE.equals(str2)) {
                    t(str3, c0155e);
                } else if ("align".equals(str2)) {
                    c0155e.f10899d = w(str3);
                } else if ("position".equals(str2)) {
                    v(str3, c0155e);
                } else if (RRWebVideoEvent.JsonKeys.SIZE.equals(str2)) {
                    c0155e.f10905j = h.c(str3);
                } else if ("vertical".equals(str2)) {
                    c0155e.f10906k = x(str3);
                } else {
                    t.h("WebvttCueParser", "Unknown cue setting " + str2 + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + str3);
                }
            } catch (NumberFormatException unused) {
                t.h("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    public static SpannedString r(String str, String str2, List list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < str2.length()) {
            char cCharAt = str2.charAt(i10);
            if (cCharAt == '&') {
                i10++;
                int iIndexOf = str2.indexOf(59, i10);
                int iIndexOf2 = str2.indexOf(32, i10);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    b(str2.substring(i10, iIndexOf), spannableStringBuilder);
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) StringUtils.SPACE);
                    }
                    i10 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i10++;
            } else {
                int iG = i10 + 1;
                if (iG < str2.length()) {
                    boolean z10 = str2.charAt(iG) == '/';
                    iG = g(str2, iG);
                    int i11 = iG - 2;
                    boolean z11 = str2.charAt(i11) == '/';
                    int i12 = i10 + (z10 ? 2 : 1);
                    if (!z11) {
                        i11 = iG - 1;
                    }
                    String strSubstring = str2.substring(i12, i11);
                    if (!strSubstring.trim().isEmpty()) {
                        String strK = k(strSubstring);
                        if (l(strK)) {
                            if (z10) {
                                while (!arrayDeque.isEmpty()) {
                                    c cVar = (c) arrayDeque.pop();
                                    d(str, cVar, arrayList, spannableStringBuilder, list);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new b(cVar, spannableStringBuilder.length()));
                                    }
                                    if (cVar.f10890a.equals(strK)) {
                                        break;
                                    }
                                }
                            } else if (!z11) {
                                arrayDeque.push(c.a(strSubstring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i10 = iG;
            }
        }
        while (!arrayDeque.isEmpty()) {
            d(str, (c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        d(str, c.b(), Collections.EMPTY_LIST, spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    public static int s(String str) {
        str.getClass();
        switch (str) {
            case "center":
            case "middle":
                return 1;
            case "end":
                return 2;
            case "start":
                return 0;
            default:
                t.h("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    public static void t(String str, C0155e c0155e) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            c0155e.f10902g = s(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            c0155e.f10900e = h.c(str);
            c0155e.f10901f = 0;
        } else {
            c0155e.f10900e = Integer.parseInt(str);
            c0155e.f10901f = 1;
        }
    }

    public static int u(String str) {
        str.getClass();
        switch (str) {
            case "line-left":
            case "start":
                return 0;
            case "center":
            case "middle":
                return 1;
            case "line-right":
            case "end":
                return 2;
            default:
                t.h("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    public static void v(String str, C0155e c0155e) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            c0155e.f10904i = u(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        c0155e.f10903h = h.c(str);
    }

    public static int w(String str) {
        str.getClass();
        switch (str) {
            case "center":
            case "middle":
                return 2;
            case "end":
                return 3;
            case "left":
                return 4;
            case "right":
                return 5;
            case "start":
                return 1;
            default:
                t.h("WebvttCueParser", "Invalid alignment value: " + str);
                return 2;
        }
    }

    public static int x(String str) {
        str.getClass();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        t.h("WebvttCueParser", "Invalid 'vertical' value: " + str);
        return Integer.MIN_VALUE;
    }
}
