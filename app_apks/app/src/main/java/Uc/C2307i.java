package Uc;

import Lc.InterfaceC1174b;
import gc.C4179C;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC4862t;
import sd.AbstractC5823c;

/* JADX INFO: renamed from: Uc.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2307i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2307i f16924a = new C2307i();

    /* JADX INFO: renamed from: Uc.i$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends kotlin.jvm.internal.v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f16925a = new a();

        public a() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC1174b it) {
            AbstractC4862t.e(it, "it");
            return Boolean.valueOf(C2307i.f16924a.b(it));
        }
    }

    public final String a(InterfaceC1174b interfaceC1174b) {
        kd.f fVar;
        AbstractC4862t.e(interfaceC1174b, "<this>");
        Ic.g.f0(interfaceC1174b);
        InterfaceC1174b interfaceC1174bF = AbstractC5823c.f(AbstractC5823c.s(interfaceC1174b), false, a.f16925a, 1, null);
        if (interfaceC1174bF == null || (fVar = (kd.f) C2305g.f16919a.a().get(AbstractC5823c.l(interfaceC1174bF))) == null) {
            return null;
        }
        return fVar.b();
    }

    public final boolean b(InterfaceC1174b callableMemberDescriptor) {
        AbstractC4862t.e(callableMemberDescriptor, "callableMemberDescriptor");
        if (C2305g.f16919a.d().contains(callableMemberDescriptor.getName())) {
            return c(callableMemberDescriptor);
        }
        return false;
    }

    public final boolean c(InterfaceC1174b interfaceC1174b) {
        if (C4179C.Y(C2305g.f16919a.c(), AbstractC5823c.h(interfaceC1174b)) && interfaceC1174b.i().isEmpty()) {
            return true;
        }
        if (!Ic.g.f0(interfaceC1174b)) {
            return false;
        }
        Collection<InterfaceC1174b> overriddenDescriptors = interfaceC1174b.d();
        AbstractC4862t.d(overriddenDescriptors, "overriddenDescriptors");
        if (overriddenDescriptors.isEmpty()) {
            return false;
        }
        for (InterfaceC1174b it : overriddenDescriptors) {
            C2307i c2307i = f16924a;
            AbstractC4862t.d(it, "it");
            if (c2307i.b(it)) {
                return true;
            }
        }
        return false;
    }
}
