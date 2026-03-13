package Dd;

import Cd.E;
import Lc.F;
import gc.C4207u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final F f2667a = new F("KotlinTypeRefiner");

    public static final F a() {
        return f2667a;
    }

    public static final List b(g gVar, Iterable types) {
        AbstractC4862t.e(gVar, "<this>");
        AbstractC4862t.e(types, "types");
        ArrayList arrayList = new ArrayList(C4207u.v(types, 10));
        Iterator it = types.iterator();
        while (it.hasNext()) {
            arrayList.add(gVar.a((E) it.next()));
        }
        return arrayList;
    }
}
