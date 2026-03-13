package ge;

import ee.k;
import ee.l;
import fc.C4029l;
import fc.InterfaceC4028k;
import gc.C4179C;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: renamed from: ge.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4259x extends C4240i0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ee.k f35764m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final InterfaceC4028k f35765n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4259x(final String name, final int i10) {
        super(name, null, i10, 2, null);
        AbstractC4862t.e(name, "name");
        this.f35764m = k.b.f33970a;
        this.f35765n = C4029l.b(new InterfaceC6082a() { // from class: ge.w
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return C4259x.x(i10, name, this);
            }
        });
    }

    public static final ee.e[] x(int i10, String str, C4259x c4259x) {
        ee.e[] eVarArr = new ee.e[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            eVarArr[i11] = ee.j.e(str + '.' + c4259x.e(i11), l.d.f33974a, new ee.e[0], null, 8, null);
        }
        return eVarArr;
    }

    @Override // ge.C4240i0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ee.e)) {
            return false;
        }
        ee.e eVar = (ee.e) obj;
        return eVar.f() == k.b.f33970a && AbstractC4862t.a(i(), eVar.i()) && AbstractC4862t.a(AbstractC4230d0.a(this), AbstractC4230d0.a(eVar));
    }

    @Override // ge.C4240i0, ee.e
    public ee.k f() {
        return this.f35764m;
    }

    @Override // ge.C4240i0, ee.e
    public ee.e h(int i10) {
        return y()[i10];
    }

    @Override // ge.C4240i0
    public int hashCode() {
        int iHashCode = i().hashCode();
        int iHashCode2 = 1;
        for (String str : ee.h.b(this)) {
            int i10 = iHashCode2 * 31;
            iHashCode2 = i10 + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // ge.C4240i0
    public String toString() {
        return C4179C.q0(ee.h.b(this), ", ", i() + '(', ")", 0, null, null, 56, null);
    }

    public final ee.e[] y() {
        return (ee.e[]) this.f35765n.getValue();
    }
}
