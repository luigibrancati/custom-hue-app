package b7;

import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: renamed from: b7.H, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2859H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f25398a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Queue f25399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25400c;

    public final void a(InterfaceC2858G interfaceC2858G) {
        synchronized (this.f25398a) {
            try {
                if (this.f25399b == null) {
                    this.f25399b = new ArrayDeque();
                }
                this.f25399b.add(interfaceC2858G);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Task task) {
        InterfaceC2858G interfaceC2858G;
        synchronized (this.f25398a) {
            if (this.f25399b != null && !this.f25400c) {
                this.f25400c = true;
                while (true) {
                    synchronized (this.f25398a) {
                        try {
                            interfaceC2858G = (InterfaceC2858G) this.f25399b.poll();
                            if (interfaceC2858G == null) {
                                this.f25400c = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    interfaceC2858G.b(task);
                }
            }
        }
    }
}
