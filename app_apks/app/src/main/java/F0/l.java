package F0;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class l extends e {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public ArrayList f3578w0 = new ArrayList();

    public void H0() {
        ArrayList arrayList = this.f3578w0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = (e) this.f3578w0.get(i10);
            if (eVar instanceof l) {
                ((l) eVar).H0();
            }
        }
    }

    public void I0(e eVar) {
        this.f3578w0.remove(eVar);
        eVar.t0(null);
    }

    public void J0() {
        this.f3578w0.clear();
    }

    @Override // F0.e
    public void W() {
        this.f3578w0.clear();
        super.W();
    }

    @Override // F0.e
    public void X(E0.c cVar) {
        super.X(cVar);
        int size = this.f3578w0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((e) this.f3578w0.get(i10)).X(cVar);
        }
    }

    public void b(e eVar) {
        this.f3578w0.add(eVar);
        if (eVar.E() != null) {
            ((l) eVar.E()).I0(eVar);
        }
        eVar.t0(this);
    }
}
