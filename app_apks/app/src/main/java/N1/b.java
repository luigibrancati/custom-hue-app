package N1;

import G1.M;
import K7.A;
import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f9559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f9560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f9561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Random f9562d;

    public b() {
        this(new Random());
    }

    public static void b(Object obj, long j10, Map map) {
        if (map.containsKey(obj)) {
            j10 = Math.max(j10, ((Long) M.i((Long) map.get(obj))).longValue());
        }
        map.put(obj, Long.valueOf(j10));
    }

    public static int d(O1.b bVar, O1.b bVar2) {
        int iCompare = Integer.compare(bVar.f10764c, bVar2.f10764c);
        return iCompare != 0 ? iCompare : bVar.f10763b.compareTo(bVar2.f10763b);
    }

    public static int f(List list) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < list.size(); i10++) {
            hashSet.add(Integer.valueOf(((O1.b) list.get(i10)).f10764c));
        }
        return hashSet.size();
    }

    public static void h(long j10, Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j10) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            map.remove(arrayList.get(i10));
        }
    }

    public final List c(List list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        h(jElapsedRealtime, this.f9559a);
        h(jElapsedRealtime, this.f9560b);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            O1.b bVar = (O1.b) list.get(i10);
            if (!this.f9559a.containsKey(bVar.f10763b) && !this.f9560b.containsKey(Integer.valueOf(bVar.f10764c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public void e(O1.b bVar, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j10;
        b(bVar.f10763b, jElapsedRealtime, this.f9559a);
        int i10 = bVar.f10764c;
        if (i10 != Integer.MIN_VALUE) {
            b(Integer.valueOf(i10), jElapsedRealtime, this.f9560b);
        }
    }

    public int g(List list) {
        HashSet hashSet = new HashSet();
        List listC = c(list);
        for (int i10 = 0; i10 < listC.size(); i10++) {
            hashSet.add(Integer.valueOf(((O1.b) listC.get(i10)).f10764c));
        }
        return hashSet.size();
    }

    public void i() {
        this.f9559a.clear();
        this.f9560b.clear();
        this.f9561c.clear();
    }

    public O1.b j(List list) {
        List listC = c(list);
        if (listC.size() < 2) {
            return (O1.b) A.c(listC, null);
        }
        Collections.sort(listC, new Comparator() { // from class: N1.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return b.d((O1.b) obj, (O1.b) obj2);
            }
        });
        ArrayList arrayList = new ArrayList();
        int i10 = ((O1.b) listC.get(0)).f10764c;
        int i11 = 0;
        while (true) {
            if (i11 >= listC.size()) {
                break;
            }
            O1.b bVar = (O1.b) listC.get(i11);
            if (i10 == bVar.f10764c) {
                arrayList.add(new Pair(bVar.f10763b, Integer.valueOf(bVar.f10765d)));
                i11++;
            } else if (arrayList.size() == 1) {
                return (O1.b) listC.get(0);
            }
        }
        O1.b bVar2 = (O1.b) this.f9561c.get(arrayList);
        if (bVar2 != null) {
            return bVar2;
        }
        O1.b bVarK = k(listC.subList(0, arrayList.size()));
        this.f9561c.put(arrayList, bVarK);
        return bVarK;
    }

    public final O1.b k(List list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += ((O1.b) list.get(i11)).f10765d;
        }
        int iNextInt = this.f9562d.nextInt(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            O1.b bVar = (O1.b) list.get(i13);
            i12 += bVar.f10765d;
            if (iNextInt < i12) {
                return bVar;
            }
        }
        return (O1.b) A.d(list);
    }

    public b(Random random) {
        this.f9561c = new HashMap();
        this.f9562d = random;
        this.f9559a = new HashMap();
        this.f9560b = new HashMap();
    }
}
