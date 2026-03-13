package Lc;

import fc.AbstractC4040w;
import fc.C4032o;
import fc.C4034q;
import gc.C4207u;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h0 {
    public /* synthetic */ h0(AbstractC4854k abstractC4854k) {
        this();
    }

    public abstract List a();

    public final h0 b(vc.l transform) {
        AbstractC4862t.e(transform, "transform");
        if (this instanceof C1197z) {
            C1197z c1197z = (C1197z) this;
            return new C1197z(c1197z.c(), (Gd.k) transform.invoke(c1197z.d()));
        }
        if (!(this instanceof H)) {
            throw new C4032o();
        }
        List<C4034q> listA = a();
        ArrayList arrayList = new ArrayList(C4207u.v(listA, 10));
        for (C4034q c4034q : listA) {
            arrayList.add(AbstractC4040w.a((kd.f) c4034q.a(), transform.invoke((Gd.k) c4034q.b())));
        }
        return new H(arrayList);
    }

    public h0() {
    }
}
