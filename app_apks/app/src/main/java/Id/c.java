package Id;

import Cd.E;
import Dd.e;
import Lc.f0;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f5845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E f5846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final E f5847c;

    public c(f0 typeParameter, E inProjection, E outProjection) {
        AbstractC4862t.e(typeParameter, "typeParameter");
        AbstractC4862t.e(inProjection, "inProjection");
        AbstractC4862t.e(outProjection, "outProjection");
        this.f5845a = typeParameter;
        this.f5846b = inProjection;
        this.f5847c = outProjection;
    }

    public final E a() {
        return this.f5846b;
    }

    public final E b() {
        return this.f5847c;
    }

    public final f0 c() {
        return this.f5845a;
    }

    public final boolean d() {
        return e.f2664a.b(this.f5846b, this.f5847c);
    }
}
