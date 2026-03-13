package O;

import B0.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class p implements O7.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f10733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f10734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicInteger f10736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final O7.e f10737e = B0.c.a(new a());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c.a f10738f;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements c.InterfaceC0018c {
        public a() {
        }

        @Override // B0.c.InterfaceC0018c
        public Object a(c.a aVar) {
            X0.h.j(p.this.f10738f == null, "The result can only set once!");
            p.this.f10738f = aVar;
            return "ListFuture[" + this + "]";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            p pVar = p.this;
            pVar.f10734b = null;
            pVar.f10733a = null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f10741a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ O7.e f10742b;

        public c(int i10, O7.e eVar) {
            this.f10741a = i10;
            this.f10742b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.g(this.f10741a, this.f10742b);
        }
    }

    public p(List list, boolean z10, Executor executor) {
        this.f10733a = (List) X0.h.g(list);
        this.f10734b = new ArrayList(list.size());
        this.f10735c = z10;
        this.f10736d = new AtomicInteger(list.size());
        f(executor);
    }

    @Override // O7.e
    public void b(Runnable runnable, Executor executor) {
        this.f10737e.b(runnable, executor);
    }

    public final void c() throws InterruptedException {
        List<O7.e> list = this.f10733a;
        if (list == null || isDone()) {
            return;
        }
        for (O7.e eVar : list) {
            while (!eVar.isDone()) {
                try {
                    eVar.get();
                } catch (Error e10) {
                    throw e10;
                } catch (InterruptedException e11) {
                    throw e11;
                } catch (Throwable unused) {
                    if (this.f10735c) {
                        return;
                    }
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        List list = this.f10733a;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((O7.e) it.next()).cancel(z10);
            }
        }
        return this.f10737e.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public List get() throws InterruptedException {
        c();
        return (List) this.f10737e.get();
    }

    @Override // java.util.concurrent.Future
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public List get(long j10, TimeUnit timeUnit) {
        return (List) this.f10737e.get(j10, timeUnit);
    }

    public final void f(Executor executor) {
        b(new b(), N.a.a());
        if (this.f10733a.isEmpty()) {
            this.f10738f.c(new ArrayList(this.f10734b));
            return;
        }
        for (int i10 = 0; i10 < this.f10733a.size(); i10++) {
            this.f10734b.add(null);
        }
        List list = this.f10733a;
        for (int i11 = 0; i11 < list.size(); i11++) {
            O7.e eVar = (O7.e) list.get(i11);
            eVar.b(new c(i11, eVar), executor);
        }
    }

    public void g(int i10, Future future) {
        c.a aVar;
        ArrayList arrayList;
        List list = this.f10734b;
        if (isDone() || list == null) {
            X0.h.j(this.f10735c, "Future was done before all dependencies completed");
            return;
        }
        try {
            try {
                try {
                    try {
                        try {
                            X0.h.j(future.isDone(), "Tried to set value from future which is not done");
                            list.set(i10, n.m(future));
                            int iDecrementAndGet = this.f10736d.decrementAndGet();
                            X0.h.j(iDecrementAndGet >= 0, "Less than 0 remaining futures");
                            if (iDecrementAndGet == 0) {
                                List list2 = this.f10734b;
                                if (list2 != null) {
                                    this.f10738f.c(new ArrayList(list2));
                                } else {
                                    X0.h.i(isDone());
                                }
                            }
                        } catch (RuntimeException e10) {
                            if (this.f10735c) {
                                this.f10738f.f(e10);
                            }
                            int iDecrementAndGet2 = this.f10736d.decrementAndGet();
                            X0.h.j(iDecrementAndGet2 >= 0, "Less than 0 remaining futures");
                            if (iDecrementAndGet2 == 0) {
                                List list3 = this.f10734b;
                                if (list3 != null) {
                                    aVar = this.f10738f;
                                    arrayList = new ArrayList(list3);
                                    aVar.c(arrayList);
                                    return;
                                }
                                X0.h.i(isDone());
                            }
                        }
                    } catch (Error e11) {
                        this.f10738f.f(e11);
                        int iDecrementAndGet3 = this.f10736d.decrementAndGet();
                        X0.h.j(iDecrementAndGet3 >= 0, "Less than 0 remaining futures");
                        if (iDecrementAndGet3 == 0) {
                            List list4 = this.f10734b;
                            if (list4 != null) {
                                aVar = this.f10738f;
                                arrayList = new ArrayList(list4);
                                aVar.c(arrayList);
                                return;
                            }
                            X0.h.i(isDone());
                        }
                    }
                } catch (CancellationException unused) {
                    if (this.f10735c) {
                        cancel(false);
                    }
                    int iDecrementAndGet4 = this.f10736d.decrementAndGet();
                    X0.h.j(iDecrementAndGet4 >= 0, "Less than 0 remaining futures");
                    if (iDecrementAndGet4 == 0) {
                        List list5 = this.f10734b;
                        if (list5 != null) {
                            aVar = this.f10738f;
                            arrayList = new ArrayList(list5);
                            aVar.c(arrayList);
                            return;
                        }
                        X0.h.i(isDone());
                    }
                }
            } catch (ExecutionException e12) {
                if (this.f10735c) {
                    this.f10738f.f(e12.getCause());
                }
                int iDecrementAndGet5 = this.f10736d.decrementAndGet();
                X0.h.j(iDecrementAndGet5 >= 0, "Less than 0 remaining futures");
                if (iDecrementAndGet5 == 0) {
                    List list6 = this.f10734b;
                    if (list6 != null) {
                        aVar = this.f10738f;
                        arrayList = new ArrayList(list6);
                        aVar.c(arrayList);
                        return;
                    }
                    X0.h.i(isDone());
                }
            }
        } catch (Throwable th) {
            int iDecrementAndGet6 = this.f10736d.decrementAndGet();
            X0.h.j(iDecrementAndGet6 >= 0, "Less than 0 remaining futures");
            if (iDecrementAndGet6 == 0) {
                List list7 = this.f10734b;
                if (list7 != null) {
                    this.f10738f.c(new ArrayList(list7));
                } else {
                    X0.h.i(isDone());
                }
            }
            throw th;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f10737e.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f10737e.isDone();
    }
}
