package i2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: i2.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4328h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f36992a = new LinkedHashMap();

    public void a(C4327g c4327g) {
        long[] jArr = c4327g.f36990e;
        if (jArr.length <= 0 || this.f36992a.containsKey(Long.valueOf(jArr[0]))) {
            return;
        }
        this.f36992a.put(Long.valueOf(c4327g.f36990e[0]), c4327g);
    }

    public C4327g b() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (C4327g c4327g : this.f36992a.values()) {
            arrayList.add(c4327g.f36987b);
            arrayList2.add(c4327g.f36988c);
            arrayList3.add(c4327g.f36989d);
            arrayList4.add(c4327g.f36990e);
        }
        return new C4327g(N7.g.f((int[][]) arrayList.toArray(new int[arrayList.size()][])), N7.i.b((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), N7.i.b((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), N7.i.b((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }

    public int c() {
        return this.f36992a.size();
    }
}
