package L2;

import F1.a;
import G1.AbstractC0853a;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f8488e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f8489f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String[] f8490g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f8491h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f8492i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f8493j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap f8494k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashMap f8495l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List f8496m;

    public c(String str, String str2, long j10, long j11, g gVar, String[] strArr, String str3, String str4, c cVar) {
        this.f8484a = str;
        this.f8485b = str2;
        this.f8492i = str4;
        this.f8489f = gVar;
        this.f8490g = strArr;
        this.f8486c = str2 != null;
        this.f8487d = j10;
        this.f8488e = j11;
        this.f8491h = (String) AbstractC0853a.e(str3);
        this.f8493j = cVar;
        this.f8494k = new HashMap();
        this.f8495l = new HashMap();
    }

    public static c c(String str, long j10, long j11, g gVar, String[] strArr, String str2, String str3, c cVar) {
        return new c(str, null, j10, j11, gVar, strArr, str2, str3, cVar);
    }

    public static c d(String str) {
        return new c(null, f.b(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static void e(SpannableStringBuilder spannableStringBuilder) {
        for (a aVar : (a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar), "");
        }
        for (int i10 = 0; i10 < spannableStringBuilder.length(); i10++) {
            if (spannableStringBuilder.charAt(i10) == ' ') {
                int i11 = i10 + 1;
                int i12 = i11;
                while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                    i12++;
                }
                int i13 = i12 - i11;
                if (i13 > 0) {
                    spannableStringBuilder.delete(i10, i13 + i10);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i14 = 0; i14 < spannableStringBuilder.length() - 1; i14++) {
            if (spannableStringBuilder.charAt(i14) == '\n') {
                int i15 = i14 + 1;
                if (spannableStringBuilder.charAt(i15) == ' ') {
                    spannableStringBuilder.delete(i15, i14 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i16 = 0; i16 < spannableStringBuilder.length() - 1; i16++) {
            if (spannableStringBuilder.charAt(i16) == ' ') {
                int i17 = i16 + 1;
                if (spannableStringBuilder.charAt(i17) == '\n') {
                    spannableStringBuilder.delete(i16, i17);
                }
            }
        }
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }

    public static SpannableStringBuilder k(String str, Map map) {
        if (!map.containsKey(str)) {
            a.b bVar = new a.b();
            bVar.o(new SpannableStringBuilder());
            map.put(str, bVar);
        }
        return (SpannableStringBuilder) AbstractC0853a.e(((a.b) map.get(str)).e());
    }

    public void a(c cVar) {
        if (this.f8496m == null) {
            this.f8496m = new ArrayList();
        }
        this.f8496m.add(cVar);
    }

    public final void b(Map map, a.b bVar, int i10, int i11, int i12) {
        g gVarF = f.f(this.f8489f, this.f8490g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) bVar.e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            bVar.o(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (gVarF != null) {
            f.a(spannableStringBuilder2, i10, i11, gVarF, this.f8493j, map, i12);
            if ("p".equals(this.f8484a)) {
                if (gVarF.m() != Float.MAX_VALUE) {
                    bVar.m((gVarF.m() * (-90.0f)) / 100.0f);
                }
                if (gVarF.o() != null) {
                    bVar.p(gVarF.o());
                }
                if (gVarF.i() != null) {
                    bVar.j(gVarF.i());
                }
            }
        }
    }

    public c f(int i10) {
        List list = this.f8496m;
        if (list != null) {
            return (c) list.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int g() {
        List list = this.f8496m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List h(long j10, Map map, Map map2, Map map3) {
        List<Pair> arrayList = new ArrayList();
        n(j10, this.f8491h, arrayList);
        TreeMap treeMap = new TreeMap();
        p(j10, false, this.f8491h, treeMap);
        o(j10, map, map2, this.f8491h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                e eVar = (e) AbstractC0853a.e((e) map2.get(pair.first));
                arrayList2.add(new a.b().f(bitmapDecodeByteArray).k(eVar.f8512b).l(0).h(eVar.f8513c, 0).i(eVar.f8515e).n(eVar.f8516f).g(eVar.f8517g).r(eVar.f8520j).a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            e eVar2 = (e) AbstractC0853a.e((e) map2.get(entry.getKey()));
            a.b bVar = (a.b) entry.getValue();
            e((SpannableStringBuilder) AbstractC0853a.e(bVar.e()));
            bVar.h(eVar2.f8513c, eVar2.f8514d);
            bVar.i(eVar2.f8515e);
            bVar.k(eVar2.f8512b);
            bVar.n(eVar2.f8516f);
            bVar.q(eVar2.f8519i, eVar2.f8518h);
            bVar.r(eVar2.f8520j);
            arrayList2.add(bVar.a());
        }
        return arrayList2;
    }

    public final void i(TreeSet treeSet, boolean z10) {
        boolean zEquals = "p".equals(this.f8484a);
        boolean zEquals2 = "div".equals(this.f8484a);
        if (z10 || zEquals || (zEquals2 && this.f8492i != null)) {
            long j10 = this.f8487d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f8488e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f8496m == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f8496m.size(); i10++) {
            ((c) this.f8496m.get(i10)).i(treeSet, z10 || zEquals);
        }
    }

    public long[] j() {
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        return jArr;
    }

    public String[] l() {
        return this.f8490g;
    }

    public boolean m(long j10) {
        long j11 = this.f8487d;
        if (j11 == -9223372036854775807L && this.f8488e == -9223372036854775807L) {
            return true;
        }
        if (j11 <= j10 && this.f8488e == -9223372036854775807L) {
            return true;
        }
        if (j11 != -9223372036854775807L || j10 >= this.f8488e) {
            return j11 <= j10 && j10 < this.f8488e;
        }
        return true;
    }

    public final void n(long j10, String str, List list) {
        if (!"".equals(this.f8491h)) {
            str = this.f8491h;
        }
        if (m(j10) && "div".equals(this.f8484a) && this.f8492i != null) {
            list.add(new Pair(str, this.f8492i));
            return;
        }
        for (int i10 = 0; i10 < g(); i10++) {
            f(i10).n(j10, str, list);
        }
    }

    public final void o(long j10, Map map, Map map2, String str, Map map3) {
        if (m(j10)) {
            String str2 = "".equals(this.f8491h) ? str : this.f8491h;
            Iterator it = this.f8495l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str3 = (String) entry.getKey();
                int iIntValue = this.f8494k.containsKey(str3) ? ((Integer) this.f8494k.get(str3)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    b(map, (a.b) AbstractC0853a.e((a.b) map3.get(str3)), iIntValue, iIntValue2, ((e) AbstractC0853a.e((e) map2.get(str2))).f8520j);
                }
            }
            for (int i10 = 0; i10 < g(); i10++) {
                f(i10).o(j10, map, map2, str2, map3);
            }
        }
    }

    public final void p(long j10, boolean z10, String str, Map map) {
        boolean z11;
        Map map2;
        long j11;
        this.f8494k.clear();
        this.f8495l.clear();
        if (ExternalParsersConfigReaderMetKeys.METADATA_TAG.equals(this.f8484a)) {
            return;
        }
        if (!"".equals(this.f8491h)) {
            str = this.f8491h;
        }
        String str2 = str;
        if (this.f8486c && z10) {
            k(str2, map).append((CharSequence) AbstractC0853a.e(this.f8485b));
            return;
        }
        if ("br".equals(this.f8484a) && z10) {
            k(str2, map).append('\n');
            return;
        }
        if (m(j10)) {
            for (Map.Entry entry : map.entrySet()) {
                this.f8494k.put((String) entry.getKey(), Integer.valueOf(((CharSequence) AbstractC0853a.e(((a.b) entry.getValue()).e())).length()));
            }
            boolean zEquals = "p".equals(this.f8484a);
            int i10 = 0;
            while (i10 < g()) {
                c cVarF = f(i10);
                if (z10 || zEquals) {
                    z11 = true;
                    map2 = map;
                    j11 = j10;
                } else {
                    z11 = false;
                    j11 = j10;
                    map2 = map;
                }
                cVarF.p(j11, z11, str2, map2);
                i10++;
                j10 = j11;
                map = map2;
            }
            Map map3 = map;
            if (zEquals) {
                f.c(k(str2, map3));
            }
            for (Map.Entry entry2 : map3.entrySet()) {
                this.f8495l.put((String) entry2.getKey(), Integer.valueOf(((CharSequence) AbstractC0853a.e(((a.b) entry2.getValue()).e())).length()));
            }
        }
    }
}
