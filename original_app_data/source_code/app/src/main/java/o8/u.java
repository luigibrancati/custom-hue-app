package o8;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class u implements L8.d, L8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f41293a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Queue f41294b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f41295c;

    public u(Executor executor) {
        this.f41295c = executor;
    }

    @Override // L8.d
    public synchronized void a(Class cls, Executor executor, L8.b bVar) {
        try {
            D.b(cls);
            D.b(bVar);
            D.b(executor);
            if (!this.f41293a.containsKey(cls)) {
                this.f41293a.put(cls, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f41293a.get(cls)).put(bVar, executor);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // L8.d
    public void b(Class cls, L8.b bVar) {
        a(cls, this.f41295c, bVar);
    }

    @Override // L8.d
    public synchronized void c(Class cls, L8.b bVar) {
        D.b(cls);
        D.b(bVar);
        if (this.f41293a.containsKey(cls)) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f41293a.get(cls);
            concurrentHashMap.remove(bVar);
            if (concurrentHashMap.isEmpty()) {
                this.f41293a.remove(cls);
            }
        }
    }

    @Override // L8.c
    public void d(final L8.a aVar) {
        D.b(aVar);
        synchronized (this) {
            try {
                Queue queue = this.f41294b;
                if (queue != null) {
                    queue.add(aVar);
                    return;
                }
                for (final Map.Entry entry : g(aVar)) {
                    ((Executor) entry.getValue()).execute(new Runnable() { // from class: o8.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((L8.b) entry.getKey()).a(aVar);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f() {
        Queue queue;
        synchronized (this) {
            try {
                queue = this.f41294b;
                if (queue != null) {
                    this.f41294b = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (queue != null) {
            Iterator it = queue.iterator();
            while (it.hasNext()) {
                d((L8.a) it.next());
            }
        }
    }

    public final synchronized Set g(L8.a aVar) {
        Map map;
        try {
            map = (Map) this.f41293a.get(aVar.b());
        } catch (Throwable th) {
            throw th;
        }
        return map == null ? Collections.EMPTY_SET : map.entrySet();
    }
}
