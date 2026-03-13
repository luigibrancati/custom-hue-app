package Kb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements Hb.c, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f7786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f7787b;

    @Override // Kb.b
    public boolean a(Hb.c cVar) {
        Lb.b.e(cVar, "d is null");
        if (!this.f7787b) {
            synchronized (this) {
                try {
                    if (!this.f7787b) {
                        List linkedList = this.f7786a;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f7786a = linkedList;
                        }
                        linkedList.add(cVar);
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
    public boolean b(Hb.c cVar) {
        if (!c(cVar)) {
            return false;
        }
        cVar.dispose();
        return true;
    }

    @Override // Kb.b
    public boolean c(Hb.c cVar) {
        Lb.b.e(cVar, "Disposable item is null");
        if (this.f7787b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f7787b) {
                    return false;
                }
                List list = this.f7786a;
                if (list != null && list.remove(cVar)) {
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    public void d(List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            try {
                ((Hb.c) it.next()).dispose();
            } catch (Throwable th) {
                Ib.b.b(th);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(th);
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
        if (this.f7787b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f7787b) {
                    return;
                }
                this.f7787b = true;
                List list = this.f7786a;
                this.f7786a = null;
                d(list);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Hb.c
    public boolean j() {
        return this.f7787b;
    }
}
