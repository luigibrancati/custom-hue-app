package ra;

import java.util.Arrays;

/* JADX INFO: renamed from: ra.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C5689e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p[] f43876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f43877b;

    public C5689e(p... pVarArr) {
        boolean z10;
        this.f43876a = pVarArr;
        if (pVarArr == null || pVarArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
            for (p pVar : pVarArr) {
                if (!pVar.b()) {
                    break;
                }
            }
            z10 = true;
        }
        this.f43877b = z10;
    }

    public boolean a() {
        return this.f43877b;
    }

    public boolean b(o oVar) {
        p[] pVarArr = this.f43876a;
        if (pVarArr == null || pVarArr.length == 0) {
            return true;
        }
        for (p pVar : pVarArr) {
            if (pVar.a(oVar)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "emulatedFilters=" + Arrays.toString(this.f43876a);
    }
}
