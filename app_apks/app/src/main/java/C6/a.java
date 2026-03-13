package C6;

import J6.o;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class a implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f1159a;

    public a(Looper looper) {
        this.f1159a = new o(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f1159a.post(runnable);
    }
}
