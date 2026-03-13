package v8;

import b7.C2868b;
import b7.C2878l;
import b7.InterfaceC2869c;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: v8.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6073b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Executor f45893a = new X2.g();

    public static /* synthetic */ Task a(C2878l c2878l, AtomicBoolean atomicBoolean, C2868b c2868b, Task task) {
        if (task.q()) {
            c2878l.e(task.m());
        } else if (task.l() != null) {
            c2878l.d(task.l());
        } else if (atomicBoolean.getAndSet(true)) {
            c2868b.a();
        }
        return Tasks.e(null);
    }

    public static Task b(Task task, Task task2) {
        final C2868b c2868b = new C2868b();
        final C2878l c2878l = new C2878l(c2868b.b());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        InterfaceC2869c interfaceC2869c = new InterfaceC2869c() { // from class: v8.a
            @Override // b7.InterfaceC2869c
            public final Object a(Task task3) {
                return AbstractC6073b.a(c2878l, atomicBoolean, c2868b, task3);
            }
        };
        Executor executor = f45893a;
        task.k(executor, interfaceC2869c);
        task2.k(executor, interfaceC2869c);
        return c2878l.a();
    }
}
