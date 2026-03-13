package Lc;

import java.util.Collection;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface d0 {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f8751a = new a();

        @Override // Lc.d0
        public Collection a(Cd.e0 currentTypeConstructor, Collection superTypes, vc.l neighbors, vc.l reportLoop) {
            AbstractC4862t.e(currentTypeConstructor, "currentTypeConstructor");
            AbstractC4862t.e(superTypes, "superTypes");
            AbstractC4862t.e(neighbors, "neighbors");
            AbstractC4862t.e(reportLoop, "reportLoop");
            return superTypes;
        }
    }

    Collection a(Cd.e0 e0Var, Collection collection, vc.l lVar, vc.l lVar2);
}
