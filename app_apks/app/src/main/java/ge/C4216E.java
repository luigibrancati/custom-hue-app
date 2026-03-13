package ge;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: ge.E, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4216E extends C4240i0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f35643m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4216E(String name, InterfaceC4215D generatedSerializer) {
        super(name, generatedSerializer, 1);
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(generatedSerializer, "generatedSerializer");
        this.f35643m = true;
    }

    @Override // ge.C4240i0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4216E)) {
            return false;
        }
        ee.e eVar = (ee.e) obj;
        if (!AbstractC4862t.a(i(), eVar.i())) {
            return false;
        }
        C4216E c4216e = (C4216E) obj;
        if (!c4216e.isInline() || !Arrays.equals(t(), c4216e.t()) || d() != eVar.d()) {
            return false;
        }
        int iD = d();
        for (int i10 = 0; i10 < iD; i10++) {
            if (!AbstractC4862t.a(h(i10).i(), eVar.h(i10).i()) || !AbstractC4862t.a(h(i10).f(), eVar.h(i10).f())) {
                return false;
            }
        }
        return true;
    }

    @Override // ge.C4240i0
    public int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // ge.C4240i0, ee.e
    public boolean isInline() {
        return this.f35643m;
    }
}
