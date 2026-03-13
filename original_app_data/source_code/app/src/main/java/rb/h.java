package rb;

import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Ab.f f43958c;

    public h() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Ab.f f() {
        Ab.f fVar = this.f43958c;
        AbstractC4862t.b(fVar);
        return fVar;
    }

    public final void g(Ab.f value) {
        AbstractC4862t.e(value, "value");
        this.f43958c = value;
    }

    public h(Ab.f fVar) {
        this.f43958c = fVar;
    }

    public /* synthetic */ h(Ab.f fVar, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? null : fVar);
    }
}
