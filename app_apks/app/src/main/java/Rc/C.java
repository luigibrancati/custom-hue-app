package Rc;

import Rc.z;
import bd.InterfaceC2907C;
import gc.C4204q;
import gc.C4206t;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C extends z implements InterfaceC2907C {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WildcardType f15050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Collection f15051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f15052d;

    public C(WildcardType reflectType) {
        AbstractC4862t.e(reflectType, "reflectType");
        this.f15050b = reflectType;
        this.f15051c = C4206t.k();
    }

    @Override // bd.InterfaceC2912d
    public boolean D() {
        return this.f15052d;
    }

    @Override // bd.InterfaceC2907C
    public boolean L() {
        AbstractC4862t.d(Q().getUpperBounds(), "reflectType.upperBounds");
        return !AbstractC4862t.a(C4204q.V(r1), Object.class);
    }

    @Override // bd.InterfaceC2907C
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public z w() {
        Type[] upperBounds = Q().getUpperBounds();
        Type[] lowerBounds = Q().getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + Q());
        }
        if (lowerBounds.length == 1) {
            z.a aVar = z.f15104a;
            AbstractC4862t.d(lowerBounds, "lowerBounds");
            Object objY0 = C4204q.y0(lowerBounds);
            AbstractC4862t.d(objY0, "lowerBounds.single()");
            return aVar.a((Type) objY0);
        }
        if (upperBounds.length == 1) {
            AbstractC4862t.d(upperBounds, "upperBounds");
            Type ub2 = (Type) C4204q.y0(upperBounds);
            if (!AbstractC4862t.a(ub2, Object.class)) {
                z.a aVar2 = z.f15104a;
                AbstractC4862t.d(ub2, "ub");
                return aVar2.a(ub2);
            }
        }
        return null;
    }

    @Override // Rc.z
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public WildcardType Q() {
        return this.f15050b;
    }

    @Override // bd.InterfaceC2912d
    public Collection getAnnotations() {
        return this.f15051c;
    }
}
