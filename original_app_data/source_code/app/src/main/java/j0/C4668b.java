package j0;

import fc.C4015H;
import java.util.List;

/* JADX INFO: renamed from: j0.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4668b extends d {
    public C4668b(long j10, h hVar) {
        super(j10, hVar, null, new vc.l() { // from class: j0.a
            @Override // vc.l
            public final Object invoke(Object obj) {
                return C4668b.l(obj);
            }
        });
    }

    public static final C4015H l(Object obj) {
        synchronized (m.k()) {
            List list = m.f38905j;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((vc.l) list.get(i10)).invoke(obj);
            }
        }
        return C4015H.f34254a;
    }

    @Override // j0.d, j0.e
    public void a() {
        synchronized (m.k()) {
            f();
            C4015H c4015h = C4015H.f34254a;
        }
    }
}
