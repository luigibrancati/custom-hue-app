package Cd;

import Lc.InterfaceC1177e;
import Lc.InterfaceC1180h;
import Lc.InterfaceC1185m;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import sd.AbstractC5823c;

/* JADX INFO: renamed from: Cd.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0719b extends AbstractC0723f implements e0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0719b(Bd.n nVar) {
        super(nVar);
        if (nVar == null) {
            t(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void t(int r9) {
        /*
            r0 = 4
            r1 = 3
            r2 = 1
            if (r9 == r2) goto Lc
            if (r9 == r1) goto Lc
            if (r9 == r0) goto Lc
            java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Le
        Lc:
            java.lang.String r3 = "@NotNull method %s.%s must not return null"
        Le:
            r4 = 2
            if (r9 == r2) goto L17
            if (r9 == r1) goto L17
            if (r9 == r0) goto L17
            r5 = r1
            goto L18
        L17:
            r5 = r4
        L18:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor"
            r7 = 0
            if (r9 == r2) goto L2f
            if (r9 == r4) goto L2a
            if (r9 == r1) goto L2f
            if (r9 == r0) goto L2f
            java.lang.String r8 = "storageManager"
            r5[r7] = r8
            goto L31
        L2a:
            java.lang.String r8 = "classifier"
            r5[r7] = r8
            goto L31
        L2f:
            r5[r7] = r6
        L31:
            if (r9 == r2) goto L3f
            if (r9 == r1) goto L3a
            if (r9 == r0) goto L3a
            r5[r2] = r6
            goto L43
        L3a:
            java.lang.String r6 = "getAdditionalNeighboursInSupertypeGraph"
            r5[r2] = r6
            goto L43
        L3f:
            java.lang.String r6 = "getBuiltIns"
            r5[r2] = r6
        L43:
            if (r9 == r2) goto L54
            if (r9 == r4) goto L50
            if (r9 == r1) goto L54
            if (r9 == r0) goto L54
            java.lang.String r6 = "<init>"
            r5[r4] = r6
            goto L54
        L50:
            java.lang.String r6 = "isSameClassifier"
            r5[r4] = r6
        L54:
            java.lang.String r3 = java.lang.String.format(r3, r5)
            if (r9 == r2) goto L64
            if (r9 == r1) goto L64
            if (r9 == r0) goto L64
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r3)
            goto L69
        L64:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
        L69:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Cd.AbstractC0719b.t(int):void");
    }

    @Override // Cd.AbstractC0729l
    public boolean c(InterfaceC1180h interfaceC1180h) {
        if (interfaceC1180h == null) {
            t(2);
        }
        return (interfaceC1180h instanceof InterfaceC1177e) && a(u(), interfaceC1180h);
    }

    @Override // Cd.AbstractC0723f
    public E g() {
        if (Ic.g.t0(u())) {
            return null;
        }
        return n().i();
    }

    @Override // Cd.AbstractC0723f
    public Collection h(boolean z10) {
        InterfaceC1185m interfaceC1185mB = u().b();
        if (!(interfaceC1185mB instanceof InterfaceC1177e)) {
            List list = Collections.EMPTY_LIST;
            if (list == null) {
                t(3);
            }
            return list;
        }
        Md.e eVar = new Md.e();
        InterfaceC1177e interfaceC1177e = (InterfaceC1177e) interfaceC1185mB;
        eVar.add(interfaceC1177e.p());
        InterfaceC1177e interfaceC1177eM0 = interfaceC1177e.m0();
        if (z10 && interfaceC1177eM0 != null) {
            eVar.add(interfaceC1177eM0.p());
        }
        return eVar;
    }

    @Override // Cd.e0
    public Ic.g n() {
        Ic.g gVarJ = AbstractC5823c.j(u());
        if (gVarJ == null) {
            t(1);
        }
        return gVarJ;
    }

    public abstract InterfaceC1177e u();
}
