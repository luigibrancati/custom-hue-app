package X6;

import b0.C2777a;
import com.google.android.gms.internal.measurement.C3173d3;
import com.google.android.gms.internal.measurement.C3182e3;
import com.google.android.gms.internal.measurement.C3191f3;
import com.google.android.gms.internal.measurement.C3200g3;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class j7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f19036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C3182e3 f19038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public BitSet f19039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public BitSet f19040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f19041f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map f19042g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C2372e f19043h;

    public /* synthetic */ j7(C2372e c2372e, String str, C3182e3 c3182e3, BitSet bitSet, BitSet bitSet2, Map map, Map map2, byte[] bArr) {
        Objects.requireNonNull(c2372e);
        this.f19043h = c2372e;
        this.f19036a = str;
        this.f19039d = bitSet;
        this.f19040e = bitSet2;
        this.f19041f = map;
        this.f19042g = new C2777a();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f19042g.put(num, arrayList);
        }
        this.f19037b = false;
        this.f19038c = c3182e3;
    }

    public final void a(AbstractC2356c abstractC2356c) {
        int iA = abstractC2356c.a();
        if (abstractC2356c.f18721c != null) {
            this.f19040e.set(iA, true);
        }
        Boolean bool = abstractC2356c.f18722d;
        if (bool != null) {
            this.f19039d.set(iA, bool.booleanValue());
        }
        if (abstractC2356c.f18723e != null) {
            Map map = this.f19041f;
            Integer numValueOf = Integer.valueOf(iA);
            Long l10 = (Long) map.get(numValueOf);
            long jLongValue = abstractC2356c.f18723e.longValue() / 1000;
            if (l10 == null || jLongValue > l10.longValue()) {
                this.f19041f.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (abstractC2356c.f18724f != null) {
            Map map2 = this.f19042g;
            Integer numValueOf2 = Integer.valueOf(iA);
            List arrayList = (List) map2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f19042g.put(numValueOf2, arrayList);
            }
            if (abstractC2356c.b()) {
                arrayList.clear();
            }
            com.google.android.gms.internal.measurement.L6.a();
            C2416j3 c2416j3 = this.f19043h.f18400a;
            C2436m c2436mW = c2416j3.w();
            String str = this.f19036a;
            C2375e2 c2375e2 = AbstractC2383f2.f18830G0;
            if (c2436mW.H(str, c2375e2) && abstractC2356c.c()) {
                arrayList.clear();
            }
            com.google.android.gms.internal.measurement.L6.a();
            if (!c2416j3.w().H(this.f19036a, c2375e2)) {
                arrayList.add(Long.valueOf(abstractC2356c.f18724f.longValue() / 1000));
                return;
            }
            Long lValueOf = Long.valueOf(abstractC2356c.f18724f.longValue() / 1000);
            if (arrayList.contains(lValueOf)) {
                return;
            }
            arrayList.add(lValueOf);
        }
    }

    public final com.google.android.gms.internal.measurement.B2 b(int i10) {
        ArrayList arrayList;
        List list;
        com.google.android.gms.internal.measurement.A2 a2K = com.google.android.gms.internal.measurement.B2.K();
        a2K.z(i10);
        a2K.C(this.f19037b);
        C3182e3 c3182e3 = this.f19038c;
        if (c3182e3 != null) {
            a2K.B(c3182e3);
        }
        C3173d3 c3173d3L = C3182e3.L();
        c3173d3L.B(V6.Q(this.f19039d));
        c3173d3L.z(V6.Q(this.f19040e));
        Map map = this.f19041f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer num : this.f19041f.keySet()) {
                int iIntValue = num.intValue();
                Long l10 = (Long) this.f19041f.get(num);
                if (l10 != null) {
                    com.google.android.gms.internal.measurement.K2 k2H = com.google.android.gms.internal.measurement.L2.H();
                    k2H.z(iIntValue);
                    k2H.A(l10.longValue());
                    arrayList2.add((com.google.android.gms.internal.measurement.L2) k2H.w());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            c3173d3L.D(arrayList);
        }
        Map map2 = this.f19042g;
        if (map2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num2 : this.f19042g.keySet()) {
                C3191f3 c3191f3I = C3200g3.I();
                c3191f3I.z(num2.intValue());
                List list2 = (List) this.f19042g.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    c3191f3I.A(list2);
                }
                arrayList3.add((C3200g3) c3191f3I.w());
            }
            list = arrayList3;
        }
        c3173d3L.F(list);
        a2K.A(c3173d3L);
        return (com.google.android.gms.internal.measurement.B2) a2K.w();
    }

    public final /* synthetic */ BitSet c() {
        return this.f19039d;
    }

    public /* synthetic */ j7(C2372e c2372e, String str, byte[] bArr) {
        Objects.requireNonNull(c2372e);
        this.f19043h = c2372e;
        this.f19036a = str;
        this.f19037b = true;
        this.f19039d = new BitSet();
        this.f19040e = new BitSet();
        this.f19041f = new C2777a();
        this.f19042g = new C2777a();
    }
}
