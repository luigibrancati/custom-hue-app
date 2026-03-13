package Ad;

import Lc.InterfaceC1174b;
import Lc.InterfaceC1185m;
import Lc.InterfaceC1196y;
import Lc.Z;
import Lc.a0;
import Oc.G;
import Oc.p;
import com.google.android.libraries.barhopper.RecognitionOptions;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends G implements b {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final fd.i f443E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final hd.c f444F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final hd.g f445G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final hd.h f446H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final f f447I;

    public /* synthetic */ k(InterfaceC1185m interfaceC1185m, Z z10, Mc.g gVar, kd.f fVar, InterfaceC1174b.a aVar, fd.i iVar, hd.c cVar, hd.g gVar2, hd.h hVar, f fVar2, a0 a0Var, int i10, AbstractC4854k abstractC4854k) {
        this(interfaceC1185m, z10, gVar, fVar, aVar, iVar, cVar, gVar2, hVar, fVar2, (i10 & RecognitionOptions.UPC_E) != 0 ? null : a0Var);
    }

    @Override // Ad.g
    public hd.g D() {
        return this.f445G;
    }

    @Override // Ad.g
    public hd.c G() {
        return this.f444F;
    }

    @Override // Ad.g
    public f I() {
        return this.f447I;
    }

    @Override // Oc.G, Oc.p
    public p L0(InterfaceC1185m newOwner, InterfaceC1196y interfaceC1196y, InterfaceC1174b.a kind, kd.f fVar, Mc.g annotations, a0 source) {
        kd.f fVar2;
        AbstractC4862t.e(newOwner, "newOwner");
        AbstractC4862t.e(kind, "kind");
        AbstractC4862t.e(annotations, "annotations");
        AbstractC4862t.e(source, "source");
        Z z10 = (Z) interfaceC1196y;
        if (fVar == null) {
            kd.f name = getName();
            AbstractC4862t.d(name, "name");
            fVar2 = name;
        } else {
            fVar2 = fVar;
        }
        k kVar = new k(newOwner, z10, annotations, fVar2, kind, e0(), G(), D(), q1(), I(), source);
        kVar.Y0(Q0());
        return kVar;
    }

    @Override // Ad.g
    /* JADX INFO: renamed from: p1, reason: merged with bridge method [inline-methods] */
    public fd.i e0() {
        return this.f443E;
    }

    public hd.h q1() {
        return this.f446H;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public k(Lc.InterfaceC1185m r12, Lc.Z r13, Mc.g r14, kd.f r15, Lc.InterfaceC1174b.a r16, fd.i r17, hd.c r18, hd.g r19, hd.h r20, Ad.f r21, Lc.a0 r22) {
        /*
            r11 = this;
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            java.lang.String r0 = "containingDeclaration"
            kotlin.jvm.internal.AbstractC4862t.e(r12, r0)
            java.lang.String r0 = "annotations"
            kotlin.jvm.internal.AbstractC4862t.e(r14, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.AbstractC4862t.e(r15, r0)
            java.lang.String r0 = "kind"
            r5 = r16
            kotlin.jvm.internal.AbstractC4862t.e(r5, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.AbstractC4862t.e(r7, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.AbstractC4862t.e(r8, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.AbstractC4862t.e(r9, r0)
            java.lang.String r0 = "versionRequirementTable"
            kotlin.jvm.internal.AbstractC4862t.e(r10, r0)
            if (r22 != 0) goto L3d
            Lc.a0 r0 = Lc.a0.f8746a
            r6 = r0
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r0 = r11
            goto L44
        L3d:
            r6 = r22
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
        L44:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.f443E = r7
            r11.f444F = r8
            r11.f445G = r9
            r11.f446H = r10
            r1 = r21
            r11.f447I = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Ad.k.<init>(Lc.m, Lc.Z, Mc.g, kd.f, Lc.b$a, fd.i, hd.c, hd.g, hd.h, Ad.f, Lc.a0):void");
    }
}
