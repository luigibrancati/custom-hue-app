package N6;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class La implements Ia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9814a;

    public La(Context context, Ka ka2) {
        ArrayList arrayList = new ArrayList();
        this.f9814a = arrayList;
        if (ka2.c()) {
            arrayList.add(new C1252ab(context, ka2));
        }
    }

    @Override // N6.Ia
    public final void a(Ha ha2) {
        Iterator it = this.f9814a.iterator();
        while (it.hasNext()) {
            ((Ia) it.next()).a(ha2);
        }
    }
}
