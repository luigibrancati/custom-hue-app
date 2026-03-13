package jd;

import id.AbstractC4376a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: jd.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4767h {
    public static final List a(List list) {
        AbstractC4862t.e(list, "<this>");
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC4376a.e.c cVar = (AbstractC4376a.e.c) it.next();
            int iZ = cVar.z();
            for (int i10 = 0; i10 < iZ; i10++) {
                arrayList.add(cVar);
            }
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
