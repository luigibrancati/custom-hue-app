package O1;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f10804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f10805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f10806e;

    public g(String str, long j10, List list, List list2) {
        this(str, j10, list, list2, null);
    }

    public int a(int i10) {
        int size = this.f10804c.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((a) this.f10804c.get(i11)).f10757b == i10) {
                return i11;
            }
        }
        return -1;
    }

    public g(String str, long j10, List list, List list2, e eVar) {
        this.f10802a = str;
        this.f10803b = j10;
        this.f10804c = Collections.unmodifiableList(list);
        this.f10805d = Collections.unmodifiableList(list2);
        this.f10806e = eVar;
    }
}
