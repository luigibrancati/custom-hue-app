package io.sentry;

import io.sentry.util.AutoClosableReentrantLock;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SentryCrashLastRunState {
    private static final SentryCrashLastRunState INSTANCE = new SentryCrashLastRunState();
    private Boolean crashedLastRun;
    private final AutoClosableReentrantLock crashedLastRunLock = new AutoClosableReentrantLock();
    private boolean readCrashedLastRun;

    private SentryCrashLastRunState() {
    }

    public static SentryCrashLastRunState getInstance() {
        return INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Boolean isCrashedLastRun(java.lang.String r6, boolean r7) {
        /*
            r5 = this;
            io.sentry.util.AutoClosableReentrantLock r0 = r5.crashedLastRunLock
            io.sentry.ISentryLifecycleToken r0 = r0.acquire()
            boolean r1 = r5.readCrashedLastRun     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L14
            java.lang.Boolean r5 = r5.crashedLastRun     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L11
            r0.close()
        L11:
            return r5
        L12:
            r5 = move-exception
            goto L54
        L14:
            if (r6 != 0) goto L1d
            r5 = 0
            if (r0 == 0) goto L1c
            r0.close()
        L1c:
            return r5
        L1d:
            r1 = 1
            r5.readCrashedLastRun = r1     // Catch: java.lang.Throwable -> L12
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L12
            java.lang.String r3 = "last_crash"
            r2.<init>(r6, r3)     // Catch: java.lang.Throwable -> L12
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L12
            java.lang.String r4 = ".sentry-native/last_crash"
            r3.<init>(r6, r4)     // Catch: java.lang.Throwable -> L12
            r6 = 0
            boolean r4 = r2.exists()     // Catch: java.lang.Throwable -> L45
            if (r4 == 0) goto L39
            r2.delete()     // Catch: java.lang.Throwable -> L46
            goto L46
        L39:
            boolean r2 = r3.exists()     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L45
            if (r7 == 0) goto L46
            r3.delete()     // Catch: java.lang.Throwable -> L46
            goto L46
        L45:
            r1 = r6
        L46:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L12
            r5.crashedLastRun = r6     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L51
            r0.close()
        L51:
            java.lang.Boolean r5 = r5.crashedLastRun
            return r5
        L54:
            if (r0 == 0) goto L5e
            r0.close()     // Catch: java.lang.Throwable -> L5a
            goto L5e
        L5a:
            r6 = move-exception
            r5.addSuppressed(r6)
        L5e:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.SentryCrashLastRunState.isCrashedLastRun(java.lang.String, boolean):java.lang.Boolean");
    }

    public void reset() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.crashedLastRunLock.acquire();
        try {
            this.readCrashedLastRun = false;
            this.crashedLastRun = null;
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } catch (Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void setCrashedLastRun(boolean z10) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.crashedLastRunLock.acquire();
        try {
            if (!this.readCrashedLastRun) {
                this.crashedLastRun = Boolean.valueOf(z10);
                this.readCrashedLastRun = true;
            }
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } catch (Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
