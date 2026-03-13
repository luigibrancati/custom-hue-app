package Uc;

import Lc.InterfaceC1174b;
import Lc.InterfaceC1196y;
import Uc.I;
import gc.C4179C;
import kotlin.jvm.internal.AbstractC4862t;
import sd.AbstractC5823c;

/* JADX INFO: renamed from: Uc.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2304f extends I {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C2304f f16916n = new C2304f();

    /* JADX INFO: renamed from: Uc.f$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends kotlin.jvm.internal.v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f16917a = new a();

        public a() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC1174b it) {
            AbstractC4862t.e(it, "it");
            return Boolean.valueOf(C2304f.f16916n.j(it));
        }
    }

    /* JADX INFO: renamed from: Uc.f$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends kotlin.jvm.internal.v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f16918a = new b();

        public b() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC1174b it) {
            AbstractC4862t.e(it, "it");
            return Boolean.valueOf((it instanceof InterfaceC1196y) && C2304f.f16916n.j(it));
        }
    }

    public static final InterfaceC1196y k(InterfaceC1196y functionDescriptor) {
        AbstractC4862t.e(functionDescriptor, "functionDescriptor");
        C2304f c2304f = f16916n;
        kd.f name = functionDescriptor.getName();
        AbstractC4862t.d(name, "functionDescriptor.name");
        if (c2304f.l(name)) {
            return (InterfaceC1196y) AbstractC5823c.f(functionDescriptor, false, a.f16917a, 1, null);
        }
        return null;
    }

    public static final I.b m(InterfaceC1174b interfaceC1174b) {
        InterfaceC1174b interfaceC1174bF;
        String strD;
        AbstractC4862t.e(interfaceC1174b, "<this>");
        I.a aVar = I.f16886a;
        if (!aVar.d().contains(interfaceC1174b.getName()) || (interfaceC1174bF = AbstractC5823c.f(interfaceC1174b, false, b.f16918a, 1, null)) == null || (strD = dd.w.d(interfaceC1174bF)) == null) {
            return null;
        }
        return aVar.l(strD);
    }

    public final boolean j(InterfaceC1174b interfaceC1174b) {
        return C4179C.Y(I.f16886a.e(), dd.w.d(interfaceC1174b));
    }

    public final boolean l(kd.f fVar) {
        AbstractC4862t.e(fVar, "<this>");
        return I.f16886a.d().contains(fVar);
    }
}
