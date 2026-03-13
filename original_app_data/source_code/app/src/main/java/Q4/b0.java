package Q4;

import android.app.Notification;
import android.content.Context;
import lc.InterfaceC4988e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface b0 {
    static /* synthetic */ Object e(b0 b0Var, Task task, g0 g0Var, double d10, long j10, InterfaceC4988e interfaceC4988e, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateNotification");
        }
        if ((i10 & 4) != 0) {
            d10 = 2.0d;
        }
        return b0Var.l(task, g0Var, d10, (i10 & 8) != 0 ? -1000L : j10, interfaceC4988e);
    }

    double a();

    boolean b();

    boolean c();

    boolean d();

    void f(long j10, long j11);

    String g(String str);

    boolean h();

    void i(boolean z10);

    void j(double d10);

    void k(boolean z10);

    Object l(Task task, g0 g0Var, double d10, long j10, InterfaceC4988e interfaceC4988e);

    void m(String str);

    int n();

    NotificationConfig o();

    Task p();

    double q();

    long r(String str, long j10);

    Object s(int i10, Notification notification, int i11, InterfaceC4988e interfaceC4988e);

    Context t();

    void u(NotificationConfig notificationConfig);

    void v(Task task);

    void w(int i10);

    void x(double d10);

    String y();
}
