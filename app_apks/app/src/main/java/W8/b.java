package W8;

import android.content.Context;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import h8.C4288f;
import h8.o;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class b {
    public b(C4288f c4288f, o oVar, Executor executor) {
        Context contextM = c4288f.m();
        Y8.a.g().O(contextM);
        X8.a aVarB = X8.a.b();
        aVarB.i(contextM);
        aVarB.j(new f());
        if (oVar != null) {
            AppStartTrace appStartTraceK = AppStartTrace.k();
            appStartTraceK.t(contextM);
            executor.execute(new AppStartTrace.c(appStartTraceK));
        }
        SessionManager.getInstance().initializeGaugeCollection();
    }
}
