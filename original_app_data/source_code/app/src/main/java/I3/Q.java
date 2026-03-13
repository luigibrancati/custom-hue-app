package I3;

import android.content.Context;
import androidx.work.WorkerParameters;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class Q {
    public static final androidx.work.c c(Context context, String str, WorkerParameters workerParameters) {
        try {
            Object objNewInstance = d(str).getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            AbstractC4862t.b(objNewInstance);
            return (androidx.work.c) objNewInstance;
        } catch (Throwable th) {
            AbstractC0890u.e().d(S.f5585a, "Could not instantiate " + str, th);
            throw th;
        }
    }

    public static final Class d(String str) {
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str).asSubclass(androidx.work.c.class);
            AbstractC4862t.b(clsAsSubclass);
            return clsAsSubclass;
        } catch (Throwable th) {
            AbstractC0890u.e().d(S.f5585a, "Invalid class: " + str, th);
            throw th;
        }
    }

    public abstract androidx.work.c a(Context context, String str, WorkerParameters workerParameters);

    public final androidx.work.c b(Context appContext, String workerClassName, WorkerParameters workerParameters) {
        AbstractC4862t.e(appContext, "appContext");
        AbstractC4862t.e(workerClassName, "workerClassName");
        AbstractC4862t.e(workerParameters, "workerParameters");
        androidx.work.c cVarA = a(appContext, workerClassName, workerParameters);
        if (cVarA == null) {
            cVarA = c(appContext, workerClassName, workerParameters);
        }
        if (!cVarA.E()) {
            return cVarA;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + workerClassName + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
