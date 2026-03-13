package Ud;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vc.l f17033a = new vc.l() { // from class: Ud.l
        @Override // vc.l
        public final Object invoke(Object obj) {
            return n.d(obj);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final vc.p f17034b = new vc.p() { // from class: Ud.m
        @Override // vc.p
        public final Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(n.c(obj, obj2));
        }
    };

    public static final boolean c(Object obj, Object obj2) {
        return AbstractC4862t.a(obj, obj2);
    }

    public static final InterfaceC2313e e(InterfaceC2313e interfaceC2313e) {
        return interfaceC2313e instanceof E ? interfaceC2313e : f(interfaceC2313e, f17033a, f17034b);
    }

    public static final InterfaceC2313e f(InterfaceC2313e interfaceC2313e, vc.l lVar, vc.p pVar) {
        if (interfaceC2313e instanceof C2312d) {
            C2312d c2312d = (C2312d) interfaceC2313e;
            if (c2312d.f17017b == lVar && c2312d.f17018c == pVar) {
                return interfaceC2313e;
            }
        }
        return new C2312d(interfaceC2313e, lVar, pVar);
    }

    public static final Object d(Object obj) {
        return obj;
    }
}
