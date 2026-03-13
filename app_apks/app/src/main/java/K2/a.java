package K2;

import F2.e;
import F2.s;
import G1.AbstractC0853a;
import G1.C;
import G1.InterfaceC0864l;
import G1.t;
import K7.AbstractC1081v;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a implements s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f7408d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f7409e = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f7410a = new StringBuilder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f7411b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C f7412c = new C();

    private Charset e(C c10) {
        Charset charsetV = c10.V();
        return charsetV != null ? charsetV : StandardCharsets.UTF_8;
    }

    public static float f(int i10) {
        if (i10 == 0) {
            return 0.08f;
        }
        if (i10 == 1) {
            return 0.5f;
        }
        if (i10 == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    public static long g(Matcher matcher, int i10) {
        String strGroup = matcher.group(i10 + 1);
        long j10 = (strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L) + (Long.parseLong((String) AbstractC0853a.e(matcher.group(i10 + 2))) * 60000) + (Long.parseLong((String) AbstractC0853a.e(matcher.group(i10 + 3))) * 1000);
        String strGroup2 = matcher.group(i10 + 4);
        if (strGroup2 != null) {
            j10 += Long.parseLong(strGroup2);
        }
        return j10 * 1000;
    }

    @Override // F2.s
    public int b() {
        return 1;
    }

    @Override // F2.s
    public void c(byte[] bArr, int i10, int i11, s.b bVar, InterfaceC0864l interfaceC0864l) {
        long j10;
        String strX;
        String str;
        this.f7412c.Y(bArr, i10 + i11);
        this.f7412c.a0(i10);
        Charset charsetE = e(this.f7412c);
        long j11 = -9223372036854775807L;
        ArrayList arrayList = (bVar.f3688a == -9223372036854775807L || !bVar.f3689b) ? null : new ArrayList();
        while (true) {
            String strX2 = this.f7412c.x(charsetE);
            if (strX2 == null) {
                break;
            }
            if (!strX2.isEmpty()) {
                try {
                    Integer.parseInt(strX2);
                    strX = this.f7412c.x(charsetE);
                } catch (NumberFormatException unused) {
                    j10 = j11;
                    t.h("SubripParser", "Skipping invalid index: " + strX2);
                }
                if (strX == null) {
                    t.h("SubripParser", "Unexpected end");
                    break;
                }
                Matcher matcher = f7408d.matcher(strX);
                if (matcher.matches()) {
                    long jG = g(matcher, 1);
                    long jG2 = g(matcher, 6);
                    int i12 = 0;
                    this.f7410a.setLength(0);
                    this.f7411b.clear();
                    String strX3 = this.f7412c.x(charsetE);
                    while (!TextUtils.isEmpty(strX3)) {
                        if (this.f7410a.length() > 0) {
                            this.f7410a.append("<br>");
                        }
                        this.f7410a.append(h(strX3, this.f7411b));
                        strX3 = this.f7412c.x(charsetE);
                    }
                    Spanned spannedFromHtml = Html.fromHtml(this.f7410a.toString());
                    while (true) {
                        if (i12 >= this.f7411b.size()) {
                            str = null;
                            break;
                        }
                        str = (String) this.f7411b.get(i12);
                        if (str.matches("\\{\\\\an[1-9]\\}")) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                    j10 = j11;
                    long j12 = bVar.f3688a;
                    if (j12 == j10 || jG2 >= j12) {
                        interfaceC0864l.accept(new e(AbstractC1081v.A(d(spannedFromHtml, str)), jG, jG2 - jG));
                    } else if (arrayList != null) {
                        arrayList.add(new e(AbstractC1081v.A(d(spannedFromHtml, str)), jG, jG2 - jG));
                    }
                } else {
                    j10 = j11;
                    t.h("SubripParser", "Skipping invalid timing: " + strX);
                }
                j11 = j10;
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                interfaceC0864l.accept((e) it.next());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final F1.a d(android.text.Spanned r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.a.d(android.text.Spanned, java.lang.String):F1.a");
    }

    public final String h(String str, ArrayList arrayList) {
        String strTrim = str.trim();
        StringBuilder sb2 = new StringBuilder(strTrim);
        Matcher matcher = f7409e.matcher(strTrim);
        int i10 = 0;
        while (matcher.find()) {
            String strGroup = matcher.group();
            arrayList.add(strGroup);
            int iStart = matcher.start() - i10;
            int length = strGroup.length();
            sb2.replace(iStart, iStart + length, "");
            i10 += length;
        }
        return sb2.toString();
    }
}
