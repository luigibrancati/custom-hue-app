package J2;

import F1.a;
import F2.e;
import F2.s;
import G1.AbstractC0853a;
import G1.C;
import G1.InterfaceC0864l;
import G1.M;
import G1.t;
import J2.c;
import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.metadata.TikaCoreProperties;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b implements s {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f5910g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f5912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C f5913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map f5914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f5915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f5916f;

    public b() {
        this(null);
    }

    public static int d(long j10, List list, List list2) {
        int i10;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i10 = 0;
                break;
            }
            if (((Long) list.get(size)).longValue() == j10) {
                return size;
            }
            if (((Long) list.get(size)).longValue() < j10) {
                i10 = size + 1;
                break;
            }
            size--;
        }
        list.add(i10, Long.valueOf(j10));
        list2.add(i10, i10 == 0 ? new ArrayList() : new ArrayList((Collection) list2.get(i10 - 1)));
        return i10;
    }

    public static float e(int i10) {
        if (i10 == 0) {
            return 0.05f;
        }
        if (i10 != 1) {
            return i10 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    public static F1.a f(String str, int i10, c cVar, c.b bVar, float f10, float f11) {
        SpannableString spannableString = new SpannableString(str);
        a.b bVarT = new a.b().o(spannableString).t(i10);
        if (cVar != null) {
            if (cVar.f5919c != null) {
                spannableString.setSpan(new ForegroundColorSpan(cVar.f5919c.intValue()), 0, spannableString.length(), 33);
            }
            if (cVar.f5926j == 3 && cVar.f5920d != null) {
                spannableString.setSpan(new BackgroundColorSpan(cVar.f5920d.intValue()), 0, spannableString.length(), 33);
            }
            float f12 = cVar.f5921e;
            if (f12 != -3.4028235E38f && f11 != -3.4028235E38f) {
                bVarT.q(f12 / f11, 1);
            }
            boolean z10 = cVar.f5922f;
            if (z10 && cVar.f5923g) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z10) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (cVar.f5923g) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (cVar.f5924h) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (cVar.f5925i) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i11 = bVar.f5942a;
        if (i11 == -1) {
            i11 = cVar != null ? cVar.f5918b : -1;
        }
        bVarT.p(p(i11)).l(o(i11)).i(n(i11));
        PointF pointF = bVar.f5943b;
        if (pointF == null || f11 == -3.4028235E38f || f10 == -3.4028235E38f) {
            bVarT.k(e(bVarT.d()));
            bVarT.h(e(bVarT.c()), 0);
        } else {
            bVarT.k(pointF.x / f10);
            bVarT.h(bVar.f5943b.y / f11, 0);
        }
        return bVarT.a();
    }

    public static Map l(C c10, Charset charset) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c.a aVarA = null;
        while (true) {
            String strX = c10.x(charset);
            if (strX == null || (c10.a() != 0 && c10.l(charset) == 91)) {
                break;
            }
            if (strX.startsWith("Format:")) {
                aVarA = c.a.a(strX);
            } else if (strX.startsWith("Style:")) {
                if (aVarA == null) {
                    t.h("SsaParser", "Skipping 'Style:' line before 'Format:' line: " + strX);
                } else {
                    c cVarB = c.b(strX, aVarA);
                    if (cVarB != null) {
                        linkedHashMap.put(cVarB.f5917a, cVarB);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static long m(String str) {
        Matcher matcher = f5910g.matcher(str.trim());
        if (matcher.matches()) {
            return (Long.parseLong((String) M.i(matcher.group(1))) * 3600000000L) + (Long.parseLong((String) M.i(matcher.group(2))) * 60000000) + (Long.parseLong((String) M.i(matcher.group(3))) * 1000000) + (Long.parseLong((String) M.i(matcher.group(4))) * 10000);
        }
        return -9223372036854775807L;
    }

    public static int n(int i10) {
        switch (i10) {
            case -1:
                break;
            case 0:
            default:
                t.h("SsaParser", "Unknown alignment: " + i10);
                break;
            case 1:
            case 2:
            case 3:
                break;
            case 4:
            case 5:
            case 6:
                break;
            case 7:
            case 8:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    public static int o(int i10) {
        switch (i10) {
            case -1:
                break;
            case 0:
            default:
                t.h("SsaParser", "Unknown alignment: " + i10);
                break;
            case 1:
            case 4:
            case 7:
                break;
            case 2:
            case 5:
            case 8:
                break;
            case 3:
            case 6:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    public static Layout.Alignment p(int i10) {
        switch (i10) {
            case -1:
                return null;
            case 0:
            default:
                t.h("SsaParser", "Unknown alignment: " + i10);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    @Override // F2.s
    public int b() {
        return 1;
    }

    @Override // F2.s
    public void c(byte[] bArr, int i10, int i11, s.b bVar, InterfaceC0864l interfaceC0864l) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f5913c.Y(bArr, i10 + i11);
        this.f5913c.a0(i10);
        Charset charsetG = g(this.f5913c);
        if (!this.f5911a) {
            j(this.f5913c, charsetG);
        }
        i(this.f5913c, arrayList, arrayList2, charsetG);
        ArrayList arrayList3 = (bVar.f3688a == -9223372036854775807L || !bVar.f3689b) ? null : new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            List list = (List) arrayList.get(i12);
            if (!list.isEmpty() || i12 == 0) {
                if (i12 == arrayList.size() - 1) {
                    throw new IllegalStateException();
                }
                long jLongValue = ((Long) arrayList2.get(i12)).longValue();
                long jLongValue2 = ((Long) arrayList2.get(i12 + 1)).longValue();
                e eVar = new e(list, jLongValue, jLongValue2 - jLongValue);
                long j10 = bVar.f3688a;
                if (j10 == -9223372036854775807L || jLongValue2 >= j10) {
                    interfaceC0864l.accept(eVar);
                } else if (arrayList3 != null) {
                    arrayList3.add(eVar);
                }
            }
        }
        if (arrayList3 != null) {
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                interfaceC0864l.accept((e) it.next());
            }
        }
    }

    public final Charset g(C c10) {
        Charset charsetV = c10.V();
        return charsetV != null ? charsetV : StandardCharsets.UTF_8;
    }

    public final void h(String str, a aVar, List list, List list2) {
        int i10;
        int i11;
        AbstractC0853a.a(str.startsWith("Dialogue:"));
        String[] strArrSplit = str.substring(9).split(",", aVar.f5909f);
        if (strArrSplit.length != aVar.f5909f) {
            t.h("SsaParser", "Skipping dialogue line with fewer columns than format: " + str);
            return;
        }
        int i12 = aVar.f5904a;
        if (i12 != -1) {
            try {
                i10 = Integer.parseInt(strArrSplit[i12].trim());
            } catch (RuntimeException unused) {
                t.h("SsaParser", "Fail to parse layer: " + strArrSplit[aVar.f5904a]);
                i10 = 0;
            }
        } else {
            i10 = 0;
        }
        int i13 = i10;
        long jM = m(strArrSplit[aVar.f5905b]);
        if (jM == -9223372036854775807L) {
            t.h("SsaParser", "Skipping invalid timing: " + str);
            return;
        }
        long jM2 = m(strArrSplit[aVar.f5906c]);
        if (jM2 == -9223372036854775807L || jM2 <= jM) {
            t.h("SsaParser", "Skipping invalid timing: " + str);
            return;
        }
        Map map = this.f5914d;
        c cVar = (map == null || (i11 = aVar.f5907d) == -1) ? null : (c) map.get(strArrSplit[i11].trim());
        String str2 = strArrSplit[aVar.f5908e];
        F1.a aVarF = f(c.b.d(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), i13, cVar, c.b.b(str2), this.f5915e, this.f5916f);
        int iD = d(jM2, list2, list);
        for (int iD2 = d(jM, list2, list); iD2 < iD; iD2++) {
            ((List) list.get(iD2)).add(aVarF);
        }
    }

    public final void i(C c10, List list, List list2, Charset charset) {
        a aVarA = this.f5911a ? this.f5912b : null;
        while (true) {
            String strX = c10.x(charset);
            if (strX == null) {
                return;
            }
            if (strX.startsWith("Format:")) {
                aVarA = a.a(strX);
            } else if (strX.startsWith("Dialogue:")) {
                if (aVarA == null) {
                    t.h("SsaParser", "Skipping dialogue line before complete format: " + strX);
                } else {
                    h(strX, aVarA, list, list2);
                }
            }
        }
    }

    public final void j(C c10, Charset charset) {
        while (true) {
            String strX = c10.x(charset);
            if (strX == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strX)) {
                k(c10, charset);
            } else if ("[V4+ Styles]".equalsIgnoreCase(strX)) {
                this.f5914d = l(c10, charset);
            } else if ("[V4 Styles]".equalsIgnoreCase(strX)) {
                t.f("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strX)) {
                return;
            }
        }
    }

    public final void k(C c10, Charset charset) {
        while (true) {
            String strX = c10.x(charset);
            if (strX == null) {
                return;
            }
            if (c10.a() != 0 && c10.l(charset) == 91) {
                return;
            }
            String[] strArrSplit = strX.split(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
            if (strArrSplit.length == 2) {
                String strE = J7.c.e(strArrSplit[0].trim());
                strE.getClass();
                if (strE.equals("playresx")) {
                    this.f5915e = Float.parseFloat(strArrSplit[1].trim());
                } else if (strE.equals("playresy")) {
                    try {
                        this.f5916f = Float.parseFloat(strArrSplit[1].trim());
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
    }

    public b(List list) {
        this.f5915e = -3.4028235E38f;
        this.f5916f = -3.4028235E38f;
        this.f5913c = new C();
        if (list == null || list.isEmpty()) {
            this.f5911a = false;
            this.f5912b = null;
            return;
        }
        this.f5911a = true;
        String strH = M.H((byte[]) list.get(0));
        AbstractC0853a.a(strH.startsWith("Format:"));
        this.f5912b = (a) AbstractC0853a.e(a.a(strH));
        j(new C((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }
}
