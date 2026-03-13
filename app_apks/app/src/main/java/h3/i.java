package h3;

import b0.C2777a;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class i {
    public static final void a(C2777a map, boolean z10, vc.l fetchBlock) {
        AbstractC4862t.e(map, "map");
        AbstractC4862t.e(fetchBlock, "fetchBlock");
        C2777a c2777a = new C2777a(999);
        int size = map.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (z10) {
                c2777a.put(map.f(i10), map.j(i10));
            } else {
                c2777a.put(map.f(i10), null);
            }
            i10++;
            i11++;
            if (i11 == 999) {
                fetchBlock.invoke(c2777a);
                if (!z10) {
                    map.putAll(c2777a);
                }
                c2777a.clear();
                i11 = 0;
            }
        }
        if (i11 > 0) {
            fetchBlock.invoke(c2777a);
            if (z10) {
                return;
            }
            map.putAll(c2777a);
        }
    }
}
