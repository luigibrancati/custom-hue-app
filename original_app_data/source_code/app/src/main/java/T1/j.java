package T1;

import G1.M;
import T1.B;
import T1.C2226b;
import T1.m;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class j implements m.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f15939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J7.t f15940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J7.t f15941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15943f;

    @Deprecated
    public j() {
        this.f15942e = 0;
        this.f15943f = false;
        this.f15939b = null;
        this.f15940c = null;
        this.f15941d = null;
    }

    @Override // T1.m.b
    public m b(m.a aVar) {
        J7.t tVar;
        int i10 = this.f15942e;
        if (i10 != 1 && (i10 != 0 || !c())) {
            return new B.b().b(aVar);
        }
        int iK = D1.v.k(aVar.f15951c.f1805o);
        G1.t.f("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + M.t0(iK));
        J7.t tVar2 = this.f15940c;
        C2226b.C0197b c0197b = (tVar2 == null || (tVar = this.f15941d) == null) ? new C2226b.C0197b(iK) : new C2226b.C0197b(tVar2, tVar);
        c0197b.f(this.f15943f);
        return c0197b.b(aVar);
    }

    public final boolean c() {
        return true;
    }

    public j(Context context) {
        this(context, null, null);
    }

    public j(Context context, J7.t tVar, J7.t tVar2) {
        this.f15939b = context;
        this.f15942e = 0;
        this.f15943f = false;
        this.f15940c = tVar;
        this.f15941d = tVar2;
    }
}
