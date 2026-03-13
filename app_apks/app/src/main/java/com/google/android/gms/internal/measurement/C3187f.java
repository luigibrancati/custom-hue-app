package com.google.android.gms.internal.measurement;

import io.sentry.SentryEnvelopeItemHeader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3187f implements Iterable, InterfaceC3277p, InterfaceC3241l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SortedMap f29455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f29456b;

    public C3187f() {
        this.f29455a = new TreeMap();
        this.f29456b = new TreeMap();
    }

    public final void A() {
        this.f29455a.clear();
    }

    public final void B(int i10, InterfaceC3277p interfaceC3277p) {
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 21);
            sb2.append("Invalid value index: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i10 >= s()) {
            w(i10, interfaceC3277p);
            return;
        }
        SortedMap sortedMap = this.f29455a;
        for (int iIntValue = ((Integer) sortedMap.lastKey()).intValue(); iIntValue >= i10; iIntValue--) {
            Integer numValueOf = Integer.valueOf(iIntValue);
            InterfaceC3277p interfaceC3277p2 = (InterfaceC3277p) sortedMap.get(numValueOf);
            if (interfaceC3277p2 != null) {
                w(iIntValue + 1, interfaceC3277p2);
                sortedMap.remove(numValueOf);
            }
        }
        w(i10, interfaceC3277p);
    }

    public final void E(int i10) {
        SortedMap sortedMap = this.f29455a;
        int iIntValue = ((Integer) sortedMap.lastKey()).intValue();
        if (i10 > iIntValue || i10 < 0) {
            return;
        }
        sortedMap.remove(Integer.valueOf(i10));
        if (i10 == iIntValue) {
            int i11 = i10 - 1;
            Integer numValueOf = Integer.valueOf(i11);
            if (sortedMap.containsKey(numValueOf) || i11 < 0) {
                return;
            }
            sortedMap.put(numValueOf, InterfaceC3277p.f29567U);
            return;
        }
        while (true) {
            i10++;
            if (i10 > ((Integer) sortedMap.lastKey()).intValue()) {
                return;
            }
            Integer numValueOf2 = Integer.valueOf(i10);
            InterfaceC3277p interfaceC3277p = (InterfaceC3277p) sortedMap.get(numValueOf2);
            if (interfaceC3277p != null) {
                sortedMap.put(Integer.valueOf(i10 - 1), interfaceC3277p);
                sortedMap.remove(numValueOf2);
            }
        }
    }

    public final String H(String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (!this.f29455a.isEmpty()) {
            int i10 = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i10 >= s()) {
                    break;
                }
                InterfaceC3277p interfaceC3277pV = v(i10);
                sb2.append(str2);
                if (!(interfaceC3277pV instanceof C3321u) && !(interfaceC3277pV instanceof C3259n)) {
                    sb2.append(interfaceC3277pV.b());
                }
                i10++;
            }
            sb2.delete(0, str2.length());
        }
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    public final String b() {
        return H(",");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    public final Double c() {
        SortedMap sortedMap = this.f29455a;
        return sortedMap.size() == 1 ? v(0).c() : sortedMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    public final Boolean d() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    public final Iterator e() {
        return new C3169d(this, this.f29455a.keySet().iterator(), this.f29456b.keySet().iterator());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3187f)) {
            return false;
        }
        C3187f c3187f = (C3187f) obj;
        if (s() != c3187f.s()) {
            return false;
        }
        SortedMap sortedMap = this.f29455a;
        if (sortedMap.isEmpty()) {
            return c3187f.f29455a.isEmpty();
        }
        for (int iIntValue = ((Integer) sortedMap.firstKey()).intValue(); iIntValue <= ((Integer) sortedMap.lastKey()).intValue(); iIntValue++) {
            if (!v(iIntValue).equals(c3187f.v(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3241l
    public final InterfaceC3277p h(String str) {
        InterfaceC3277p interfaceC3277p;
        return SentryEnvelopeItemHeader.JsonKeys.LENGTH.equals(str) ? new C3214i(Double.valueOf(s())) : (!n(str) || (interfaceC3277p = (InterfaceC3277p) this.f29456b.get(str)) == null) ? InterfaceC3277p.f29567U : interfaceC3277p;
    }

    public final int hashCode() {
        return this.f29455a.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C3178e(this);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3241l
    public final void k(String str, InterfaceC3277p interfaceC3277p) {
        Map map = this.f29456b;
        if (interfaceC3277p == null) {
            map.remove(str);
        } else {
            map.put(str, interfaceC3277p);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3241l
    public final boolean n(String str) {
        return SentryEnvelopeItemHeader.JsonKeys.LENGTH.equals(str) || this.f29456b.containsKey(str);
    }

    public final List p() {
        ArrayList arrayList = new ArrayList(s());
        for (int i10 = 0; i10 < s(); i10++) {
            arrayList.add(v(i10));
        }
        return arrayList;
    }

    public final Iterator r() {
        return this.f29455a.keySet().iterator();
    }

    public final int s() {
        SortedMap sortedMap = this.f29455a;
        if (sortedMap.isEmpty()) {
            return 0;
        }
        return ((Integer) sortedMap.lastKey()).intValue() + 1;
    }

    public final int t() {
        return this.f29455a.size();
    }

    public final String toString() {
        return H(",");
    }

    public final InterfaceC3277p v(int i10) {
        InterfaceC3277p interfaceC3277p;
        if (i10 < s()) {
            return (!x(i10) || (interfaceC3277p = (InterfaceC3277p) this.f29455a.get(Integer.valueOf(i10))) == null) ? InterfaceC3277p.f29567U : interfaceC3277p;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final void w(int i10, InterfaceC3277p interfaceC3277p) {
        if (i10 > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 21);
            sb2.append("Out of bounds index: ");
            sb2.append(i10);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (interfaceC3277p == null) {
            this.f29455a.remove(Integer.valueOf(i10));
        } else {
            this.f29455a.put(Integer.valueOf(i10), interfaceC3277p);
        }
    }

    public final boolean x(int i10) {
        if (i10 >= 0) {
            SortedMap sortedMap = this.f29455a;
            if (i10 <= ((Integer) sortedMap.lastKey()).intValue()) {
                return sortedMap.containsKey(Integer.valueOf(i10));
            }
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 21);
        sb2.append("Out of bounds index: ");
        sb2.append(i10);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    public final InterfaceC3277p y() {
        C3187f c3187f = new C3187f();
        for (Map.Entry entry : this.f29455a.entrySet()) {
            if (entry.getValue() instanceof InterfaceC3241l) {
                c3187f.f29455a.put((Integer) entry.getKey(), (InterfaceC3277p) entry.getValue());
            } else {
                c3187f.f29455a.put((Integer) entry.getKey(), ((InterfaceC3277p) entry.getValue()).y());
            }
        }
        return c3187f;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    public final InterfaceC3277p z(String str, T1 t12, List list) {
        return ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) ? C.a(str, this, t12, list) : InterfaceC3241l.f(this, new C3312t(str), t12, list);
    }

    public C3187f(List list) {
        this();
        if (list != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                w(i10, (InterfaceC3277p) list.get(i10));
            }
        }
    }
}
