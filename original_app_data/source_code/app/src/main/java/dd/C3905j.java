package dd;

import Cd.E;
import Cd.F;
import Cd.M;
import id.AbstractC4376a;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: dd.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C3905j implements yd.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3905j f33432a = new C3905j();

    @Override // yd.s
    public E a(fd.q proto, String flexibleId, M lowerBound, M upperBound) {
        AbstractC4862t.e(proto, "proto");
        AbstractC4862t.e(flexibleId, "flexibleId");
        AbstractC4862t.e(lowerBound, "lowerBound");
        AbstractC4862t.e(upperBound, "upperBound");
        return !AbstractC4862t.a(flexibleId, "kotlin.jvm.PlatformType") ? Ed.k.d(Ed.j.ERROR_FLEXIBLE_TYPE, flexibleId, lowerBound.toString(), upperBound.toString()) : proto.r(AbstractC4376a.f37384g) ? new Zc.h(lowerBound, upperBound) : F.d(lowerBound, upperBound);
    }
}
