package J;

import E.AbstractC0807p0;
import E.C0781c0;
import E.C0822x0;
import E.F0;
import E.W0;
import I.d;
import I.e;
import J.b;
import L.I;
import P.f;
import gc.C4179C;
import gc.C4206t;
import gc.V;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0099a f5850b = new C0099a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I f5851a;

    /* JADX INFO: renamed from: J.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0099a {
        public /* synthetic */ C0099a(AbstractC4854k abstractC4854k) {
            this();
        }

        public C0099a() {
        }
    }

    public a(I cameraInfoInternal) {
        AbstractC4862t.e(cameraInfoInternal, "cameraInfoInternal");
        this.f5851a = cameraInfoInternal;
    }

    public static /* synthetic */ b c(a aVar, F0 f02, List list, int i10, List list2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        if ((i11 & 8) != 0) {
            list2 = C4206t.k();
        }
        return aVar.b(f02, list, i10, list2);
    }

    @Override // J.c
    public b a(F0 sessionConfig) {
        boolean z10;
        AbstractC4862t.e(sessionConfig, "sessionConfig");
        List<W0> listK = sessionConfig.k();
        Set<G.b> setH = sessionConfig.h();
        List listG = sessionConfig.g();
        if (setH.isEmpty() && listG.isEmpty()) {
            throw new IllegalArgumentException("Must have at least one required or preferred feature");
        }
        boolean z11 = false;
        if (listK == null || !listK.isEmpty()) {
            Iterator it = listK.iterator();
            while (it.hasNext()) {
                if (((W0) it.next()) instanceof C0781c0) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
        } else {
            z10 = false;
        }
        if (listK == null || !listK.isEmpty()) {
            for (W0 w02 : listK) {
                if ((w02 instanceof C0822x0) || f.c0(w02)) {
                    z11 = true;
                    break;
                }
            }
        }
        for (W0 w03 : listK) {
            if (H.c.Companion.b(w03) == H.c.UNDEFINED) {
                return new b.c(w03);
            }
        }
        for (G.b bVar : setH) {
            if (bVar instanceof d) {
                if (!z10) {
                    return new b.d(H.c.IMAGE_CAPTURE.toString(), bVar);
                }
            } else if ((bVar instanceof I.a) || (bVar instanceof I.c) || (bVar instanceof e)) {
                if (!z11) {
                    return new b.d(H.c.PREVIEW + " or " + H.c.VIDEO_CAPTURE, bVar);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listG) {
            if (((G.b) obj) instanceof d ? z10 : true) {
                arrayList.add(obj);
            }
        }
        return c(this, sessionConfig, arrayList, 0, null, 12, null);
    }

    public final b b(F0 f02, List list, int i10, List list2) {
        if (i10 < list.size()) {
            int i11 = i10 + 1;
            b bVarB = b(f02, list, i11, C4179C.D0(list2, list.get(i10)));
            return bVarB instanceof b.a ? bVarB : b(f02, list, i11, list2);
        }
        Set setK = V.k(f02.h(), list2);
        AbstractC0807p0.a("DefaultFeatureGroupResolver", "getFeatureListResolvedByPriority: features = " + setK + ", useCases = " + f02.k());
        return this.f5851a.j(new H.b(setK), f02) ? new b.a(new H.b(setK)) : b.C0100b.f5853a;
    }
}
