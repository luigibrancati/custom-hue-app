package d2;

import D1.G;
import G1.AbstractC0853a;
import K1.g1;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g1[] f32980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r[] f32981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final G f32982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f32983e;

    public y(g1[] g1VarArr, r[] rVarArr, G g10, Object obj) {
        AbstractC0853a.a(g1VarArr.length == rVarArr.length);
        this.f32980b = g1VarArr;
        this.f32981c = (r[]) rVarArr.clone();
        this.f32982d = g10;
        this.f32983e = obj;
        this.f32979a = g1VarArr.length;
    }

    public boolean a(y yVar) {
        if (yVar == null || yVar.f32981c.length != this.f32981c.length) {
            return false;
        }
        for (int i10 = 0; i10 < this.f32981c.length; i10++) {
            if (!b(yVar, i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean b(y yVar, int i10) {
        return yVar != null && Objects.equals(this.f32980b[i10], yVar.f32980b[i10]) && Objects.equals(this.f32981c[i10], yVar.f32981c[i10]);
    }

    public boolean c(int i10) {
        return this.f32980b[i10] != null;
    }
}
