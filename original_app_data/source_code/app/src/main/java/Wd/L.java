package Wd;

import Rd.V0;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4992i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final E f17903a = new E("NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final vc.p f17904b = new vc.p() { // from class: Wd.I
        @Override // vc.p
        public final Object invoke(Object obj, Object obj2) {
            return L.d(obj, (InterfaceC4992i.b) obj2);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final vc.p f17905c = new vc.p() { // from class: Wd.J
        @Override // vc.p
        public final Object invoke(Object obj, Object obj2) {
            return L.e((V0) obj, (InterfaceC4992i.b) obj2);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final vc.p f17906d = new vc.p() { // from class: Wd.K
        @Override // vc.p
        public final Object invoke(Object obj, Object obj2) {
            return L.h((S) obj, (InterfaceC4992i.b) obj2);
        }
    };

    public static final Object d(Object obj, InterfaceC4992i.b bVar) {
        if (!(bVar instanceof V0)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int iIntValue = num != null ? num.intValue() : 1;
        return iIntValue == 0 ? bVar : Integer.valueOf(iIntValue + 1);
    }

    public static final V0 e(V0 v02, InterfaceC4992i.b bVar) {
        if (v02 != null) {
            return v02;
        }
        if (bVar instanceof V0) {
            return (V0) bVar;
        }
        return null;
    }

    public static final void f(InterfaceC4992i interfaceC4992i, Object obj) {
        if (obj == f17903a) {
            return;
        }
        if (obj instanceof S) {
            ((S) obj).b(interfaceC4992i);
            return;
        }
        Object objFold = interfaceC4992i.fold(null, f17905c);
        AbstractC4862t.c(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((V0) objFold).Y(interfaceC4992i, obj);
    }

    public static final Object g(InterfaceC4992i interfaceC4992i) {
        Object objFold = interfaceC4992i.fold(0, f17904b);
        AbstractC4862t.b(objFold);
        return objFold;
    }

    public static final S h(S s10, InterfaceC4992i.b bVar) {
        if (bVar instanceof V0) {
            V0 v02 = (V0) bVar;
            s10.a(v02, v02.m(s10.f17913a));
        }
        return s10;
    }

    public static final Object i(InterfaceC4992i interfaceC4992i, Object obj) {
        if (obj == null) {
            obj = g(interfaceC4992i);
        }
        if (obj == 0) {
            return f17903a;
        }
        if (obj instanceof Integer) {
            return interfaceC4992i.fold(new S(interfaceC4992i, ((Number) obj).intValue()), f17906d);
        }
        AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((V0) obj).m(interfaceC4992i);
    }
}
