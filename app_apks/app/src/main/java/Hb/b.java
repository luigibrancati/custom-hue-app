package Hb;

import Yb.i;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements c, Kb.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f5346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f5347b;

    @Override // Kb.b
    public boolean a(c cVar) {
        Lb.b.e(cVar, "disposable is null");
        if (!this.f5347b) {
            synchronized (this) {
                try {
                    if (!this.f5347b) {
                        i iVar = this.f5346a;
                        if (iVar == null) {
                            iVar = new i();
                            this.f5346a = iVar;
                        }
                        iVar.a(cVar);
                        return true;
                    }
                } finally {
                }
            }
        }
        cVar.dispose();
        return false;
    }

    @Override // Kb.b
    public boolean b(c cVar) {
        if (!c(cVar)) {
            return false;
        }
        cVar.dispose();
        return true;
    }

    @Override // Kb.b
    public boolean c(c cVar) {
        Lb.b.e(cVar, "disposables is null");
        if (this.f5347b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f5347b) {
                    return false;
                }
                i iVar = this.f5346a;
                if (iVar != null && iVar.e(cVar)) {
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    public void d(i iVar) {
        if (iVar == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : iVar.b()) {
            if (obj instanceof c) {
                try {
                    ((c) obj).dispose();
                } catch (Throwable th) {
                    Ib.b.b(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new Ib.a(arrayList);
            }
            throw Yb.f.d((Throwable) arrayList.get(0));
        }
    }

    @Override // Hb.c
    public void dispose() {
        if (this.f5347b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f5347b) {
                    return;
                }
                this.f5347b = true;
                i iVar = this.f5346a;
                this.f5346a = null;
                d(iVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Hb.c
    public boolean j() {
        return this.f5347b;
    }
}
