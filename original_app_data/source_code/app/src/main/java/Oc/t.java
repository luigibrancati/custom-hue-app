package Oc;

import Cd.l0;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1180h;
import Lc.InterfaceC1185m;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vd.InterfaceC6099h;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class t implements InterfaceC1177e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f12361a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final InterfaceC6099h a(InterfaceC1177e interfaceC1177e, l0 typeSubstitution, Dd.g kotlinTypeRefiner) {
            InterfaceC6099h interfaceC6099hG0;
            AbstractC4862t.e(interfaceC1177e, "<this>");
            AbstractC4862t.e(typeSubstitution, "typeSubstitution");
            AbstractC4862t.e(kotlinTypeRefiner, "kotlinTypeRefiner");
            t tVar = interfaceC1177e instanceof t ? (t) interfaceC1177e : null;
            if (tVar != null && (interfaceC6099hG0 = tVar.g0(typeSubstitution, kotlinTypeRefiner)) != null) {
                return interfaceC6099hG0;
            }
            InterfaceC6099h interfaceC6099hH = interfaceC1177e.H(typeSubstitution);
            AbstractC4862t.d(interfaceC6099hH, "this.getMemberScope(\n   …ubstitution\n            )");
            return interfaceC6099hH;
        }

        public final InterfaceC6099h b(InterfaceC1177e interfaceC1177e, Dd.g kotlinTypeRefiner) {
            InterfaceC6099h interfaceC6099hD0;
            AbstractC4862t.e(interfaceC1177e, "<this>");
            AbstractC4862t.e(kotlinTypeRefiner, "kotlinTypeRefiner");
            t tVar = interfaceC1177e instanceof t ? (t) interfaceC1177e : null;
            if (tVar != null && (interfaceC6099hD0 = tVar.D0(kotlinTypeRefiner)) != null) {
                return interfaceC6099hD0;
            }
            InterfaceC6099h interfaceC6099hU = interfaceC1177e.U();
            AbstractC4862t.d(interfaceC6099hU, "this.unsubstitutedMemberScope");
            return interfaceC6099hU;
        }

        public a() {
        }
    }

    public abstract InterfaceC6099h D0(Dd.g gVar);

    @Override // Lc.InterfaceC1177e, Lc.InterfaceC1185m
    public /* bridge */ /* synthetic */ InterfaceC1180h a() {
        return a();
    }

    public abstract InterfaceC6099h g0(l0 l0Var, Dd.g gVar);

    @Override // Lc.InterfaceC1185m
    public /* bridge */ /* synthetic */ InterfaceC1185m a() {
        return a();
    }
}
