package L;

import B0.c;
import L.AbstractC1109l0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: L.o0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1115o0 {

    /* JADX INFO: renamed from: L.o0$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements O.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f8159a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c.a f8160b;

        public a(boolean z10, c.a aVar) {
            this.f8159a = z10;
            this.f8160b = aVar;
        }

        @Override // O.c
        public void a(Throwable th) {
            if (th instanceof TimeoutException) {
                this.f8160b.f(th);
            } else {
                this.f8160b.c(Collections.EMPTY_LIST);
            }
        }

        @Override // O.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List list) {
            X0.h.g(list);
            ArrayList arrayList = new ArrayList(list);
            if (this.f8159a) {
                arrayList.removeAll(Collections.singleton(null));
            }
            this.f8160b.c(arrayList);
        }
    }

    public static /* synthetic */ Object a(final O7.e eVar, Executor executor, boolean z10, Collection collection, c.a aVar) {
        aVar.a(new Runnable() { // from class: L.m0
            @Override // java.lang.Runnable
            public final void run() {
                eVar.cancel(true);
            }
        }, executor);
        O.n.j(eVar, new a(z10, aVar), executor);
        return "surfaceList[" + collection + "]";
    }

    public static void c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((AbstractC1109l0) it.next()).e();
        }
    }

    public static void d(List list) throws AbstractC1109l0.a {
        if (list.isEmpty()) {
            return;
        }
        int i10 = 0;
        do {
            try {
                ((AbstractC1109l0) list.get(i10)).l();
                i10++;
            } catch (AbstractC1109l0.a e10) {
                for (int i11 = i10 - 1; i11 >= 0; i11--) {
                    ((AbstractC1109l0) list.get(i11)).e();
                }
                throw e10;
            }
        } while (i10 < list.size());
    }

    public static O7.e e(final Collection collection, final boolean z10, long j10, final Executor executor, ScheduledExecutorService scheduledExecutorService) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(O.n.s(((AbstractC1109l0) it.next()).j()));
        }
        final O7.e eVarQ = O.n.q(j10, scheduledExecutorService, O.n.w(arrayList));
        return B0.c.a(new c.InterfaceC0018c() { // from class: L.n0
            @Override // B0.c.InterfaceC0018c
            public final Object a(c.a aVar) {
                return AbstractC1115o0.a(eVarQ, executor, z10, collection, aVar);
            }
        });
    }
}
