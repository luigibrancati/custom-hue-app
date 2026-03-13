package F2;

import F2.s;
import android.util.SparseArray;
import i2.J;
import i2.O;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class t implements i2.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i2.r f3690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s.a f3691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray f3692c = new SparseArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3693d;

    public t(i2.r rVar, s.a aVar) {
        this.f3690a = rVar;
        this.f3691b = aVar;
    }

    @Override // i2.r
    public O f(int i10, int i11) {
        if (i11 != 3) {
            this.f3693d = true;
            return this.f3690a.f(i10, i11);
        }
        v vVar = (v) this.f3692c.get(i10);
        if (vVar != null) {
            return vVar;
        }
        v vVar2 = new v(this.f3690a.f(i10, i11), this.f3691b);
        this.f3692c.put(i10, vVar2);
        return vVar2;
    }

    @Override // i2.r
    public void n() {
        this.f3690a.n();
        if (this.f3693d) {
            for (int i10 = 0; i10 < this.f3692c.size(); i10++) {
                ((v) this.f3692c.valueAt(i10)).k(true);
            }
        }
    }

    @Override // i2.r
    public void v(J j10) {
        this.f3690a.v(j10);
    }
}
