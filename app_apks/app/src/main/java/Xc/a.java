package Xc;

import Lc.InterfaceC1179g;
import Lc.InterfaceC1185m;
import Uc.y;
import bd.z;
import fc.C4029l;
import fc.EnumC4031n;
import fc.InterfaceC4028k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: Xc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0244a extends v implements InterfaceC6082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f19455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1179g f19456b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0244a(g gVar, InterfaceC1179g interfaceC1179g) {
            super(0);
            this.f19455a = gVar;
            this.f19456b = interfaceC1179g;
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y invoke() {
            return a.g(this.f19455a, this.f19456b.getAnnotations());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends v implements InterfaceC6082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f19457a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Mc.g f19458b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g gVar, Mc.g gVar2) {
            super(0);
            this.f19457a = gVar;
            this.f19458b = gVar2;
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y invoke() {
            return a.g(this.f19457a, this.f19458b);
        }
    }

    public static final g a(g gVar, InterfaceC1185m interfaceC1185m, z zVar, int i10, InterfaceC4028k interfaceC4028k) {
        return new g(gVar.a(), zVar != null ? new h(gVar, interfaceC1185m, zVar, i10) : gVar.f(), interfaceC4028k);
    }

    public static final g b(g gVar, k typeParameterResolver) {
        AbstractC4862t.e(gVar, "<this>");
        AbstractC4862t.e(typeParameterResolver, "typeParameterResolver");
        return new g(gVar.a(), typeParameterResolver, gVar.c());
    }

    public static final g c(g gVar, InterfaceC1179g containingDeclaration, z zVar, int i10) {
        AbstractC4862t.e(gVar, "<this>");
        AbstractC4862t.e(containingDeclaration, "containingDeclaration");
        return a(gVar, containingDeclaration, zVar, i10, C4029l.a(EnumC4031n.NONE, new C0244a(gVar, containingDeclaration)));
    }

    public static /* synthetic */ g d(g gVar, InterfaceC1179g interfaceC1179g, z zVar, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            zVar = null;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return c(gVar, interfaceC1179g, zVar, i10);
    }

    public static final g e(g gVar, InterfaceC1185m containingDeclaration, z typeParameterOwner, int i10) {
        AbstractC4862t.e(gVar, "<this>");
        AbstractC4862t.e(containingDeclaration, "containingDeclaration");
        AbstractC4862t.e(typeParameterOwner, "typeParameterOwner");
        return a(gVar, containingDeclaration, typeParameterOwner, i10, gVar.c());
    }

    public static /* synthetic */ g f(g gVar, InterfaceC1185m interfaceC1185m, z zVar, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return e(gVar, interfaceC1185m, zVar, i10);
    }

    public static final y g(g gVar, Mc.g additionalAnnotations) {
        AbstractC4862t.e(gVar, "<this>");
        AbstractC4862t.e(additionalAnnotations, "additionalAnnotations");
        return gVar.a().a().c(gVar.b(), additionalAnnotations);
    }

    public static final g h(g gVar, Mc.g additionalAnnotations) {
        AbstractC4862t.e(gVar, "<this>");
        AbstractC4862t.e(additionalAnnotations, "additionalAnnotations");
        return additionalAnnotations.isEmpty() ? gVar : new g(gVar.a(), gVar.f(), C4029l.a(EnumC4031n.NONE, new b(gVar, additionalAnnotations)));
    }

    public static final g i(g gVar, Xc.b components) {
        AbstractC4862t.e(gVar, "<this>");
        AbstractC4862t.e(components, "components");
        return new g(components, gVar.f(), gVar.c());
    }
}
