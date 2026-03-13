package G1;

import K7.AbstractC1081v;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: G1.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0859g {
    public static AbstractC1081v a(J7.f fVar, List list) {
        AbstractC1081v.a aVarR = AbstractC1081v.r();
        for (int i10 = 0; i10 < list.size(); i10++) {
            aVarR.a(fVar.apply((Bundle) AbstractC0853a.e((Bundle) list.get(i10))));
        }
        return aVarR.k();
    }

    public static ArrayList b(Collection collection, J7.f fVar) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) fVar.apply(it.next()));
        }
        return arrayList;
    }
}
