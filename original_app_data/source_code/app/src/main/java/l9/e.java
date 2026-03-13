package l9;

import android.util.Log;
import b7.InterfaceC2871e;
import b7.InterfaceC2873g;
import b7.InterfaceC2874h;
import b7.InterfaceC2877k;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f39938d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Executor f39939e = new X2.g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f39940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f39941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Task f39942c = null;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b implements InterfaceC2874h, InterfaceC2873g, InterfaceC2871e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CountDownLatch f39943a;

        public b() {
            this.f39943a = new CountDownLatch(1);
        }

        @Override // b7.InterfaceC2871e
        public void a() {
            this.f39943a.countDown();
        }

        public boolean b(long j10, TimeUnit timeUnit) {
            return this.f39943a.await(j10, timeUnit);
        }

        @Override // b7.InterfaceC2873g
        public void c(Exception exc) {
            this.f39943a.countDown();
        }

        @Override // b7.InterfaceC2874h
        public void onSuccess(Object obj) {
            this.f39943a.countDown();
        }
    }

    public e(Executor executor, p pVar) {
        this.f39940a = executor;
        this.f39941b = pVar;
    }

    public static /* synthetic */ Task a(e eVar, boolean z10, com.google.firebase.remoteconfig.internal.b bVar, Void r32) {
        if (z10) {
            eVar.k(bVar);
        } else {
            eVar.getClass();
        }
        return Tasks.e(bVar);
    }

    public static Object c(Task task, long j10, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        b bVar = new b();
        Executor executor = f39939e;
        task.i(executor, bVar);
        task.f(executor, bVar);
        task.a(executor, bVar);
        if (!bVar.b(j10, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (task.q()) {
            return task.m();
        }
        throw new ExecutionException(task.l());
    }

    public static synchronized e h(Executor executor, p pVar) {
        String strB;
        Map map;
        try {
            strB = pVar.b();
            map = f39938d;
            if (!map.containsKey(strB)) {
                map.put(strB, new e(executor, pVar));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (e) map.get(strB);
    }

    public void d() {
        synchronized (this) {
            this.f39942c = Tasks.e(null);
        }
        this.f39941b.a();
    }

    public synchronized Task e() {
        try {
            Task task = this.f39942c;
            if (task == null || (task.p() && !this.f39942c.q())) {
                Executor executor = this.f39940a;
                final p pVar = this.f39941b;
                Objects.requireNonNull(pVar);
                this.f39942c = Tasks.b(executor, new Callable() { // from class: l9.b
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return pVar.d();
                    }
                });
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f39942c;
    }

    public com.google.firebase.remoteconfig.internal.b f() {
        return g(5L);
    }

    public com.google.firebase.remoteconfig.internal.b g(long j10) {
        synchronized (this) {
            try {
                Task task = this.f39942c;
                if (task != null && task.q()) {
                    return (com.google.firebase.remoteconfig.internal.b) this.f39942c.m();
                }
                try {
                    return (com.google.firebase.remoteconfig.internal.b) c(e(), j10, TimeUnit.SECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException e10) {
                    Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e10);
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Task i(com.google.firebase.remoteconfig.internal.b bVar) {
        return j(bVar, true);
    }

    public Task j(final com.google.firebase.remoteconfig.internal.b bVar, final boolean z10) {
        return Tasks.b(this.f39940a, new Callable() { // from class: l9.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f39933a.f39941b.e(bVar);
            }
        }).s(this.f39940a, new InterfaceC2877k() { // from class: l9.d
            @Override // b7.InterfaceC2877k
            public final Task a(Object obj) {
                return e.a(this.f39935a, z10, bVar, (Void) obj);
            }
        });
    }

    public final synchronized void k(com.google.firebase.remoteconfig.internal.b bVar) {
        this.f39942c = Tasks.e(bVar);
    }
}
