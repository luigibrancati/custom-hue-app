package N;

import X0.h;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f9504b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Deque f9503a = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f9505c = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f9506d = c.IDLE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f9507e = 0;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f9508a;

        public a(Runnable runnable) {
            this.f9508a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9508a.run();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class b implements Runnable {
        public b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
        
            if (r1 == false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
        
            r3.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
        
            E.AbstractC0807p0.d("SequentialExecutor", "Exception while executing runnable " + r3, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
        
            return;
         */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0034 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a() {
            /*
                r9 = this;
                r0 = 0
                r1 = r0
            L2:
                N.g r2 = N.g.this     // Catch: java.lang.Throwable -> L49
                java.util.Deque r2 = r2.f9503a     // Catch: java.lang.Throwable -> L49
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L49
                if (r0 != 0) goto L28
                N.g r0 = N.g.this     // Catch: java.lang.Throwable -> L1c
                N.g$c r3 = r0.f9506d     // Catch: java.lang.Throwable -> L1c
                N.g$c r4 = N.g.c.RUNNING     // Catch: java.lang.Throwable -> L1c
                if (r3 != r4) goto L1e
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                if (r1 == 0) goto L3e
            L14:
                java.lang.Thread r9 = java.lang.Thread.currentThread()
                r9.interrupt()
                goto L3e
            L1c:
                r9 = move-exception
                goto L63
            L1e:
                long r5 = r0.f9507e     // Catch: java.lang.Throwable -> L1c
                r7 = 1
                long r5 = r5 + r7
                r0.f9507e = r5     // Catch: java.lang.Throwable -> L1c
                r0.f9506d = r4     // Catch: java.lang.Throwable -> L1c
                r0 = 1
            L28:
                N.g r3 = N.g.this     // Catch: java.lang.Throwable -> L1c
                java.util.Deque r3 = r3.f9503a     // Catch: java.lang.Throwable -> L1c
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L1c
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L1c
                if (r3 != 0) goto L3f
                N.g r9 = N.g.this     // Catch: java.lang.Throwable -> L1c
                N.g$c r0 = N.g.c.IDLE     // Catch: java.lang.Throwable -> L1c
                r9.f9506d = r0     // Catch: java.lang.Throwable -> L1c
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                if (r1 == 0) goto L3e
                goto L14
            L3e:
                return
            L3f:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L49
                r1 = r1 | r2
                r3.run()     // Catch: java.lang.Throwable -> L49 java.lang.RuntimeException -> L4b
                goto L2
            L49:
                r9 = move-exception
                goto L65
            L4b:
                r2 = move-exception
                java.lang.String r4 = "SequentialExecutor"
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
                r5.<init>()     // Catch: java.lang.Throwable -> L49
                java.lang.String r6 = "Exception while executing runnable "
                r5.append(r6)     // Catch: java.lang.Throwable -> L49
                r5.append(r3)     // Catch: java.lang.Throwable -> L49
                java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L49
                E.AbstractC0807p0.d(r4, r3, r2)     // Catch: java.lang.Throwable -> L49
                goto L2
            L63:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                throw r9     // Catch: java.lang.Throwable -> L49
            L65:
                if (r1 == 0) goto L6e
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L6e:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: N.g.b.a():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a();
            } catch (Error e10) {
                synchronized (g.this.f9503a) {
                    g.this.f9506d = c.IDLE;
                    throw e10;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    public g(Executor executor) {
        this.f9504b = (Executor) h.g(executor);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x005f  */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void execute(java.lang.Runnable r8) {
        /*
            r7 = this;
            X0.h.g(r8)
            java.util.Deque r0 = r7.f9503a
            monitor-enter(r0)
            N.g$c r1 = r7.f9506d     // Catch: java.lang.Throwable -> L6b
            N.g$c r2 = N.g.c.RUNNING     // Catch: java.lang.Throwable -> L6b
            if (r1 == r2) goto L6d
            N.g$c r2 = N.g.c.QUEUED     // Catch: java.lang.Throwable -> L6b
            if (r1 != r2) goto L11
            goto L6d
        L11:
            long r3 = r7.f9507e     // Catch: java.lang.Throwable -> L6b
            N.g$a r1 = new N.g$a     // Catch: java.lang.Throwable -> L6b
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L6b
            java.util.Deque r8 = r7.f9503a     // Catch: java.lang.Throwable -> L6b
            r8.add(r1)     // Catch: java.lang.Throwable -> L6b
            N.g$c r8 = N.g.c.QUEUING     // Catch: java.lang.Throwable -> L6b
            r7.f9506d = r8     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            java.util.concurrent.Executor r0 = r7.f9504b     // Catch: java.lang.Throwable -> L44
            N.g$b r5 = r7.f9505c     // Catch: java.lang.Throwable -> L44
            r0.execute(r5)     // Catch: java.lang.Throwable -> L44
            N.g$c r0 = r7.f9506d
            if (r0 == r8) goto L2e
            return
        L2e:
            java.util.Deque r0 = r7.f9503a
            monitor-enter(r0)
            long r5 = r7.f9507e     // Catch: java.lang.Throwable -> L3e
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L40
            N.g$c r1 = r7.f9506d     // Catch: java.lang.Throwable -> L3e
            if (r1 != r8) goto L40
            r7.f9506d = r2     // Catch: java.lang.Throwable -> L3e
            goto L40
        L3e:
            r7 = move-exception
            goto L42
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            return
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r7
        L44:
            r8 = move-exception
            java.util.Deque r2 = r7.f9503a
            monitor-enter(r2)
            N.g$c r0 = r7.f9506d     // Catch: java.lang.Throwable -> L53
            N.g$c r3 = N.g.c.IDLE     // Catch: java.lang.Throwable -> L53
            if (r0 == r3) goto L55
            N.g$c r3 = N.g.c.QUEUING     // Catch: java.lang.Throwable -> L53
            if (r0 != r3) goto L5f
            goto L55
        L53:
            r7 = move-exception
            goto L69
        L55:
            java.util.Deque r7 = r7.f9503a     // Catch: java.lang.Throwable -> L53
            boolean r7 = r7.removeLastOccurrence(r1)     // Catch: java.lang.Throwable -> L53
            if (r7 == 0) goto L5f
            r7 = 1
            goto L60
        L5f:
            r7 = 0
        L60:
            boolean r0 = r8 instanceof java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> L53
            if (r0 == 0) goto L68
            if (r7 != 0) goto L68
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L53
            return
        L68:
            throw r8     // Catch: java.lang.Throwable -> L53
        L69:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L53
            throw r7
        L6b:
            r7 = move-exception
            goto L74
        L6d:
            java.util.Deque r7 = r7.f9503a     // Catch: java.lang.Throwable -> L6b
            r7.add(r8)     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            return
        L74:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: N.g.execute(java.lang.Runnable):void");
    }
}
