package cd;

import Cd.E;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1180h;
import Uc.B;
import gc.C4179C;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: cd.r, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3116r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Mc.g f26576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C3099c f26577b;

    /* JADX INFO: renamed from: cd.r$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26578a;

        static {
            int[] iArr = new int[EnumC3104h.values().length];
            try {
                iArr[EnumC3104h.NULLABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3104h.NOT_NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f26578a = iArr;
        }
    }

    static {
        kd.c ENHANCED_NULLABILITY_ANNOTATION = B.f16859u;
        AbstractC4862t.d(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        f26576a = new C3099c(ENHANCED_NULLABILITY_ANNOTATION);
        kd.c ENHANCED_MUTABILITY_ANNOTATION = B.f16860v;
        AbstractC4862t.d(ENHANCED_MUTABILITY_ANNOTATION, "ENHANCED_MUTABILITY_ANNOTATION");
        f26577b = new C3099c(ENHANCED_MUTABILITY_ANNOTATION);
    }

    public static final Mc.g e(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? new Mc.k(C4179C.V0(list)) : (Mc.g) C4179C.F0(list);
        }
        throw new IllegalStateException("At least one Annotations object expected");
    }

    public static final InterfaceC1180h f(InterfaceC1180h interfaceC1180h, C3101e c3101e, EnumC3113o enumC3113o) {
        Kc.d dVar = Kc.d.f7812a;
        if (!AbstractC3114p.a(enumC3113o) || !(interfaceC1180h instanceof InterfaceC1177e)) {
            return null;
        }
        if (c3101e.c() == EnumC3102f.READ_ONLY && enumC3113o == EnumC3113o.FLEXIBLE_LOWER) {
            InterfaceC1177e interfaceC1177e = (InterfaceC1177e) interfaceC1180h;
            if (dVar.c(interfaceC1177e)) {
                return dVar.a(interfaceC1177e);
            }
        }
        if (c3101e.c() == EnumC3102f.MUTABLE && enumC3113o == EnumC3113o.FLEXIBLE_UPPER) {
            InterfaceC1177e interfaceC1177e2 = (InterfaceC1177e) interfaceC1180h;
            if (dVar.d(interfaceC1177e2)) {
                return dVar.b(interfaceC1177e2);
            }
        }
        return null;
    }

    public static final Mc.g g() {
        return f26576a;
    }

    public static final Boolean h(C3101e c3101e, EnumC3113o enumC3113o) {
        if (!AbstractC3114p.a(enumC3113o)) {
            return null;
        }
        EnumC3104h enumC3104hD = c3101e.d();
        int i10 = enumC3104hD == null ? -1 : a.f26578a[enumC3104hD.ordinal()];
        if (i10 == 1) {
            return Boolean.TRUE;
        }
        if (i10 != 2) {
            return null;
        }
        return Boolean.FALSE;
    }

    public static final boolean i(E e10) {
        AbstractC4862t.e(e10, "<this>");
        return AbstractC3117s.c(Dd.o.f2691a, e10);
    }
}
