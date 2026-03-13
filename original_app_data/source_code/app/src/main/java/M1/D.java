package M1;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class D implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f9022a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f9022a.post(runnable);
    }
}
