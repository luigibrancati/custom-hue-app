package u8;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
import r8.InterfaceC5672a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class F implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f45261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C8.j f45262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f45263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC5672a f45264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f45265e = new AtomicBoolean(false);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        void a(C8.j jVar, Thread thread, Throwable th);
    }

    public F(a aVar, C8.j jVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, InterfaceC5672a interfaceC5672a) {
        this.f45261a = aVar;
        this.f45262b = jVar;
        this.f45263c = uncaughtExceptionHandler;
        this.f45264d = interfaceC5672a;
    }

    public boolean a() {
        return this.f45265e.get();
    }

    public final boolean b(Thread thread, Throwable th) {
        if (thread == null) {
            r8.g.f().d("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (th == null) {
            r8.g.f().d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (!this.f45264d.b()) {
            return true;
        }
        r8.g.f().b("Crashlytics will not record uncaught exception; native crash exists for session.");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void uncaughtException(java.lang.Thread r8, java.lang.Throwable r9) {
        /*
            r7 = this;
            java.lang.String r0 = "Completed exception processing, but no default exception handler."
            java.lang.String r1 = "Completed exception processing. Invoking default exception handler."
            java.util.concurrent.atomic.AtomicBoolean r2 = r7.f45265e
            r3 = 1
            r2.set(r3)
            r2 = 0
            boolean r4 = r7.b(r8, r9)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            if (r4 == 0) goto L1d
            u8.F$a r4 = r7.f45261a     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            C8.j r5 = r7.f45262b     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            r4.a(r5, r8, r9)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            goto L26
        L19:
            r4 = move-exception
            goto L55
        L1b:
            r4 = move-exception
            goto L47
        L1d:
            r8.g r4 = r8.g.f()     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            java.lang.String r5 = "Uncaught exception will not be recorded by Crashlytics."
            r4.b(r5)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
        L26:
            java.lang.Thread$UncaughtExceptionHandler r4 = r7.f45263c
            if (r4 == 0) goto L37
        L2a:
            r8.g r0 = r8.g.f()
            r0.b(r1)
            java.lang.Thread$UncaughtExceptionHandler r0 = r7.f45263c
            r0.uncaughtException(r8, r9)
            goto L41
        L37:
            r8.g r8 = r8.g.f()
            r8.b(r0)
            java.lang.System.exit(r3)
        L41:
            java.util.concurrent.atomic.AtomicBoolean r7 = r7.f45265e
            r7.set(r2)
            return
        L47:
            r8.g r5 = r8.g.f()     // Catch: java.lang.Throwable -> L19
            java.lang.String r6 = "An error occurred in the uncaught exception handler"
            r5.e(r6, r4)     // Catch: java.lang.Throwable -> L19
            java.lang.Thread$UncaughtExceptionHandler r4 = r7.f45263c
            if (r4 == 0) goto L37
            goto L2a
        L55:
            java.lang.Thread$UncaughtExceptionHandler r5 = r7.f45263c
            if (r5 == 0) goto L66
            r8.g r0 = r8.g.f()
            r0.b(r1)
            java.lang.Thread$UncaughtExceptionHandler r0 = r7.f45263c
            r0.uncaughtException(r8, r9)
            goto L70
        L66:
            r8.g r8 = r8.g.f()
            r8.b(r0)
            java.lang.System.exit(r3)
        L70:
            java.util.concurrent.atomic.AtomicBoolean r7 = r7.f45265e
            r7.set(r2)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: u8.F.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
