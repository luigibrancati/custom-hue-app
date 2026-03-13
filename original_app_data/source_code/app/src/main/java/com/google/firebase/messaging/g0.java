package com.google.firebase.messaging;

import android.content.Context;
import android.util.Log;
import b0.C2777a;
import b7.C2878l;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class g0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f31742i = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f31743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L f31744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final G f31745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f31746d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f31748f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e0 f31750h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f31747e = new C2777a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f31749g = false;

    public g0(FirebaseMessaging firebaseMessaging, L l10, e0 e0Var, G g10, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f31746d = firebaseMessaging;
        this.f31744b = l10;
        this.f31750h = e0Var;
        this.f31745c = g10;
        this.f31743a = context;
        this.f31748f = scheduledExecutorService;
    }

    public static /* synthetic */ g0 a(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, L l10, G g10) {
        return new g0(firebaseMessaging, l10, e0.b(context, scheduledExecutorService), g10, context, scheduledExecutorService);
    }

    public static void c(Task task) throws IOException {
        try {
            Tasks.a(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e10) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e10);
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e11);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static Task f(final FirebaseMessaging firebaseMessaging, final L l10, final G g10, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return Tasks.b(scheduledExecutorService, new Callable() { // from class: com.google.firebase.messaging.f0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return g0.a(context, scheduledExecutorService, firebaseMessaging, l10, g10);
            }
        });
    }

    public static boolean h() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    public final void b(d0 d0Var, C2878l c2878l) {
        ArrayDeque arrayDeque;
        synchronized (this.f31747e) {
            try {
                String strE = d0Var.e();
                if (this.f31747e.containsKey(strE)) {
                    arrayDeque = (ArrayDeque) this.f31747e.get(strE);
                } else {
                    ArrayDeque arrayDeque2 = new ArrayDeque();
                    this.f31747e.put(strE, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(c2878l);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(String str) throws IOException {
        c(this.f31745c.m(this.f31746d.blockingGetToken(), str));
    }

    public final void e(String str) throws IOException {
        c(this.f31745c.n(this.f31746d.blockingGetToken(), str));
    }

    public boolean g() {
        return this.f31750h.c() != null;
    }

    public synchronized boolean i() {
        return this.f31749g;
    }

    public final void j(d0 d0Var) {
        synchronized (this.f31747e) {
            try {
                String strE = d0Var.e();
                if (this.f31747e.containsKey(strE)) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.f31747e.get(strE);
                    C2878l c2878l = (C2878l) arrayDeque.poll();
                    if (c2878l != null) {
                        c2878l.c(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.f31747e.remove(strE);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean k(d0 d0Var) throws IOException {
        try {
            String strB = d0Var.b();
            int iHashCode = strB.hashCode();
            if (iHashCode != 83) {
                if (iHashCode == 85 && strB.equals("U")) {
                    e(d0Var.c());
                    if (!h()) {
                        return true;
                    }
                    Log.d("FirebaseMessaging", "Unsubscribe from topic: " + d0Var.c() + " succeeded.");
                    return true;
                }
            } else if (strB.equals("S")) {
                d(d0Var.c());
                if (!h()) {
                    return true;
                }
                Log.d("FirebaseMessaging", "Subscribe to topic: " + d0Var.c() + " succeeded.");
                return true;
            }
            if (!h()) {
                return true;
            }
            Log.d("FirebaseMessaging", "Unknown topic operation" + d0Var + ".");
            return true;
        } catch (IOException e10) {
            if (!"SERVICE_NOT_AVAILABLE".equals(e10.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e10.getMessage()) && !"TOO_MANY_SUBSCRIBERS".equals(e10.getMessage())) {
                if (e10.getMessage() != null) {
                    throw e10;
                }
                Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                return false;
            }
            Log.e("FirebaseMessaging", "Topic operation failed: " + e10.getMessage() + ". Will retry Topic operation.");
            return false;
        }
    }

    public void l(Runnable runnable, long j10) {
        this.f31748f.schedule(runnable, j10, TimeUnit.SECONDS);
    }

    public Task m(d0 d0Var) {
        this.f31750h.a(d0Var);
        C2878l c2878l = new C2878l();
        b(d0Var, c2878l);
        return c2878l.a();
    }

    public synchronized void n(boolean z10) {
        this.f31749g = z10;
    }

    public final void o() {
        if (i()) {
            return;
        }
        s(0L);
    }

    public void p() {
        if (g()) {
            o();
        }
    }

    public Task q(String str) {
        Task taskM = m(d0.f(str));
        p();
        return taskM;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        if (h() == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
    
        android.util.Log.d("FirebaseMessaging", "topic sync succeeded");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean r() {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            com.google.firebase.messaging.e0 r0 = r2.f31750h     // Catch: java.lang.Throwable -> L17
            com.google.firebase.messaging.d0 r0 = r0.c()     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L1c
            boolean r0 = h()     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L19
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r0 = move-exception
            goto L2e
        L19:
            r0 = 1
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            return r0
        L1c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            boolean r1 = r2.k(r0)
            if (r1 != 0) goto L25
            r2 = 0
            return r2
        L25:
            com.google.firebase.messaging.e0 r1 = r2.f31750h
            r1.e(r0)
            r2.j(r0)
            goto L0
        L2e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.g0.r():boolean");
    }

    public void s(long j10) {
        l(new h0(this, this.f31743a, this.f31744b, Math.min(Math.max(30L, 2 * j10), f31742i)), j10);
        n(true);
    }

    public Task t(String str) {
        Task taskM = m(d0.g(str));
        p();
        return taskM;
    }
}
