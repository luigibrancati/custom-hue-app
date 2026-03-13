package E3;

import C3.s;
import android.content.Context;
import gc.C4206t;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class c implements D3.a {
    public static final void d(X0.a aVar) {
        aVar.accept(new s(C4206t.k()));
    }

    @Override // D3.a
    public void a(X0.a callback) {
        AbstractC4862t.e(callback, "callback");
    }

    @Override // D3.a
    public void b(Context context, Executor executor, final X0.a callback) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(executor, "executor");
        AbstractC4862t.e(callback, "callback");
        executor.execute(new Runnable() { // from class: E3.b
            @Override // java.lang.Runnable
            public final void run() {
                c.d(callback);
            }
        });
    }
}
