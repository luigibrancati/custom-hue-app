package S3;

import R3.u;
import Rd.AbstractC2152s0;
import Rd.I;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f15312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I f15313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f15314c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f15315d = new a();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Executor {
        public a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            c.this.f15314c.post(runnable);
        }
    }

    public c(Executor executor) {
        u uVar = new u(executor);
        this.f15312a = uVar;
        this.f15313b = AbstractC2152s0.b(uVar);
    }

    @Override // S3.b
    public Executor a() {
        return this.f15315d;
    }

    @Override // S3.b
    public I b() {
        return this.f15313b;
    }

    @Override // S3.b
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public u c() {
        return this.f15312a;
    }
}
