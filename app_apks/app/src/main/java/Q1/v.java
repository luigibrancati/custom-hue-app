package Q1;

import G1.H;
import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f13517a = new SparseArray();

    public H a(int i10) {
        H h10 = (H) this.f13517a.get(i10);
        if (h10 != null) {
            return h10;
        }
        H h11 = new H(9223372036854775806L);
        this.f13517a.put(i10, h11);
        return h11;
    }

    public void b() {
        this.f13517a.clear();
    }
}
