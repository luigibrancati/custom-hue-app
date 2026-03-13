package O2;

import F2.k;
import G1.AbstractC0853a;
import G1.M;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f10911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f10912c;

    public j(List list) {
        this.f10910a = Collections.unmodifiableList(new ArrayList(list));
        this.f10911b = new long[list.size() * 2];
        for (int i10 = 0; i10 < list.size(); i10++) {
            d dVar = (d) list.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f10911b;
            jArr[i11] = dVar.f10881b;
            jArr[i11 + 1] = dVar.f10882c;
        }
        long[] jArr2 = this.f10911b;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f10912c = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // F2.k
    public int a(long j10) {
        int iD = M.d(this.f10912c, j10, false, false);
        if (iD < this.f10912c.length) {
            return iD;
        }
        return -1;
    }

    @Override // F2.k
    public List b(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.f10910a.size(); i10++) {
            long[] jArr = this.f10911b;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                d dVar = (d) this.f10910a.get(i10);
                F1.a aVar = dVar.f10880a;
                if (aVar.f3604e == -3.4028235E38f) {
                    arrayList2.add(dVar);
                } else {
                    arrayList.add(aVar);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: O2.i
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((d) obj).f10881b, ((d) obj2).f10881b);
            }
        });
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            arrayList.add(((d) arrayList2.get(i12)).f10880a.a().h((-1) - i12, 1).a());
        }
        return arrayList;
    }

    @Override // F2.k
    public long j(int i10) {
        AbstractC0853a.a(i10 >= 0);
        AbstractC0853a.a(i10 < this.f10912c.length);
        return this.f10912c[i10];
    }

    @Override // F2.k
    public int p() {
        return this.f10912c.length;
    }
}
