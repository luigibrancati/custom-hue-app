package Ad;

import Lc.InterfaceC1174b;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1184l;
import Lc.InterfaceC1185m;
import Lc.InterfaceC1196y;
import Lc.a0;
import Oc.C1812f;
import com.google.android.libraries.barhopper.RecognitionOptions;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends C1812f implements b {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final fd.d f330F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final hd.c f331G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final hd.g f332H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final hd.h f333I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final f f334J;

    public /* synthetic */ c(InterfaceC1177e interfaceC1177e, InterfaceC1184l interfaceC1184l, Mc.g gVar, boolean z10, InterfaceC1174b.a aVar, fd.d dVar, hd.c cVar, hd.g gVar2, hd.h hVar, f fVar, a0 a0Var, int i10, AbstractC4854k abstractC4854k) {
        this(interfaceC1177e, interfaceC1184l, gVar, z10, aVar, dVar, cVar, gVar2, hVar, fVar, (i10 & RecognitionOptions.UPC_E) != 0 ? null : a0Var);
    }

    @Override // Oc.p, Lc.InterfaceC1196y
    public boolean B() {
        return false;
    }

    @Override // Ad.g
    public hd.g D() {
        return this.f332H;
    }

    @Override // Ad.g
    public hd.c G() {
        return this.f331G;
    }

    @Override // Ad.g
    public f I() {
        return this.f334J;
    }

    @Override // Oc.p, Lc.C
    public boolean isExternal() {
        return false;
    }

    @Override // Oc.p, Lc.InterfaceC1196y
    public boolean isInline() {
        return false;
    }

    @Override // Oc.p, Lc.InterfaceC1196y
    public boolean isSuspend() {
        return false;
    }

    @Override // Oc.C1812f
    /* JADX INFO: renamed from: s1, reason: merged with bridge method [inline-methods] */
    public c L0(InterfaceC1185m newOwner, InterfaceC1196y interfaceC1196y, InterfaceC1174b.a kind, kd.f fVar, Mc.g annotations, a0 source) {
        AbstractC4862t.e(newOwner, "newOwner");
        AbstractC4862t.e(kind, "kind");
        AbstractC4862t.e(annotations, "annotations");
        AbstractC4862t.e(source, "source");
        c cVar = new c((InterfaceC1177e) newOwner, (InterfaceC1184l) interfaceC1196y, annotations, this.f12257E, kind, e0(), G(), D(), u1(), I(), source);
        cVar.Y0(Q0());
        return cVar;
    }

    @Override // Ad.g
    /* JADX INFO: renamed from: t1, reason: merged with bridge method [inline-methods] */
    public fd.d e0() {
        return this.f330F;
    }

    public hd.h u1() {
        return this.f333I;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public c(Lc.InterfaceC1177e r12, Lc.InterfaceC1184l r13, Mc.g r14, boolean r15, Lc.InterfaceC1174b.a r16, fd.d r17, hd.c r18, hd.g r19, hd.h r20, Ad.f r21, Lc.a0 r22) {
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
            if (r22 != 0) goto L38
            Lc.a0 r0 = Lc.a0.f8746a
            r6 = r0
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r0 = r11
            goto L3f
        L38:
            r6 = r22
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
        L3f:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.f330F = r7
            r11.f331G = r8
            r11.f332H = r9
            r11.f333I = r10
            r1 = r21
            r11.f334J = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Ad.c.<init>(Lc.e, Lc.l, Mc.g, boolean, Lc.b$a, fd.d, hd.c, hd.g, hd.h, Ad.f, Lc.a0):void");
    }
}
