package Ad;

import Lc.AbstractC1192u;
import Lc.D;
import Lc.InterfaceC1174b;
import Lc.InterfaceC1185m;
import Lc.U;
import Lc.a0;
import Oc.C;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends C implements b {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final fd.n f438C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final hd.c f439D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final hd.g f440E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final hd.h f441F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final f f442G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(InterfaceC1185m containingDeclaration, U u10, Mc.g annotations, D modality, AbstractC1192u visibility, boolean z10, kd.f name, InterfaceC1174b.a kind, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, fd.n proto, hd.c nameResolver, hd.g typeTable, hd.h versionRequirementTable, f fVar) {
        super(containingDeclaration, u10, annotations, modality, visibility, z10, name, kind, a0.f8746a, z11, z12, z15, false, z13, z14);
        AbstractC4862t.e(containingDeclaration, "containingDeclaration");
        AbstractC4862t.e(annotations, "annotations");
        AbstractC4862t.e(modality, "modality");
        AbstractC4862t.e(visibility, "visibility");
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(kind, "kind");
        AbstractC4862t.e(proto, "proto");
        AbstractC4862t.e(nameResolver, "nameResolver");
        AbstractC4862t.e(typeTable, "typeTable");
        AbstractC4862t.e(versionRequirementTable, "versionRequirementTable");
        this.f438C = proto;
        this.f439D = nameResolver;
        this.f440E = typeTable;
        this.f441F = versionRequirementTable;
        this.f442G = fVar;
    }

    @Override // Ad.g
    public hd.g D() {
        return this.f440E;
    }

    @Override // Ad.g
    public hd.c G() {
        return this.f439D;
    }

    @Override // Ad.g
    public f I() {
        return this.f442G;
    }

    @Override // Oc.C
    public C P0(InterfaceC1185m newOwner, D newModality, AbstractC1192u newVisibility, U u10, InterfaceC1174b.a kind, kd.f newName, a0 source) {
        AbstractC4862t.e(newOwner, "newOwner");
        AbstractC4862t.e(newModality, "newModality");
        AbstractC4862t.e(newVisibility, "newVisibility");
        AbstractC4862t.e(kind, "kind");
        AbstractC4862t.e(newName, "newName");
        AbstractC4862t.e(source, "source");
        return new j(newOwner, u10, getAnnotations(), newModality, newVisibility, L(), newName, kind, v0(), a0(), isExternal(), A(), k0(), e0(), G(), D(), g1(), I());
    }

    @Override // Ad.g
    /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
    public fd.n e0() {
        return this.f438C;
    }

    public hd.h g1() {
        return this.f441F;
    }

    @Override // Oc.C, Lc.C
    public boolean isExternal() {
        Boolean boolD = hd.b.f36526D.d(e0().V());
        AbstractC4862t.d(boolD, "IS_EXTERNAL_PROPERTY.get(proto.flags)");
        return boolD.booleanValue();
    }
}
