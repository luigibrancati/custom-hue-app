package E;

import gc.C4206t;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: E.o0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C0805o0 extends F0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f3007i;

    public /* synthetic */ C0805o0(List list, X0 x02, List list2, int i10, AbstractC4854k abstractC4854k) {
        this(list, (i10 & 2) != 0 ? null : x02, (i10 & 4) != 0 ? C4206t.k() : list2);
    }

    @Override // E.F0
    public boolean m() {
        return this.f3007i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0805o0(List useCases, X0 x02, List effects) {
        super(useCases, x02, effects, null, null, null, 56, null);
        AbstractC4862t.e(useCases, "useCases");
        AbstractC4862t.e(effects, "effects");
        this.f3007i = true;
    }
}
