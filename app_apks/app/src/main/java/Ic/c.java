package Ic;

import Ic.j;
import gc.C4179C;
import gc.C4207u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f5683a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f5684b;

    static {
        Set<h> set = h.NUMBER_TYPES;
        ArrayList arrayList = new ArrayList(C4207u.v(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(j.c((h) it.next()));
        }
        kd.c cVarL = j.a.f5795h.l();
        AbstractC4862t.d(cVarL, "string.toSafe()");
        List listD0 = C4179C.D0(arrayList, cVarL);
        kd.c cVarL2 = j.a.f5799j.l();
        AbstractC4862t.d(cVarL2, "_boolean.toSafe()");
        List listD02 = C4179C.D0(listD0, cVarL2);
        kd.c cVarL3 = j.a.f5817s.l();
        AbstractC4862t.d(cVarL3, "_enum.toSafe()");
        List listD03 = C4179C.D0(listD02, cVarL3);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = listD03.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(kd.b.m((kd.c) it2.next()));
        }
        f5684b = linkedHashSet;
    }

    public final Set a() {
        return f5684b;
    }

    public final Set b() {
        return f5684b;
    }
}
