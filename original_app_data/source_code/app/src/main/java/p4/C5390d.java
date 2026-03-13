package p4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import vc.l;

/* JADX INFO: renamed from: p4.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5390d implements InterfaceC5389c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f42189b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f42188a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayBlockingQueue f42190c = new ArrayBlockingQueue(512);

    @Override // p4.InterfaceC5389c
    public void a(l lVar) {
        ArrayList arrayList;
        synchronized (this.f42188a) {
            this.f42189b = lVar;
            arrayList = new ArrayList();
            this.f42190c.drainTo(arrayList);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            android.support.v4.media.session.a.a(it.next());
            if (lVar != null) {
                lVar.invoke(null);
            }
        }
    }
}
