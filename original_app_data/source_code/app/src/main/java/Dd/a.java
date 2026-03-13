package Dd;

import Cd.d0;
import Dd.f;
import Dd.g;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static final d0 a(boolean z10, boolean z11, b typeSystemContext, f kotlinTypePreparator, g kotlinTypeRefiner) {
        AbstractC4862t.e(typeSystemContext, "typeSystemContext");
        AbstractC4862t.e(kotlinTypePreparator, "kotlinTypePreparator");
        AbstractC4862t.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new d0(z10, z11, true, typeSystemContext, kotlinTypePreparator, kotlinTypeRefiner);
    }

    public static /* synthetic */ d0 b(boolean z10, boolean z11, b bVar, f fVar, g gVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            bVar = o.f2691a;
        }
        if ((i10 & 8) != 0) {
            fVar = f.a.f2665a;
        }
        if ((i10 & 16) != 0) {
            gVar = g.a.f2666a;
        }
        return a(z10, z11, bVar, fVar, gVar);
    }
}
