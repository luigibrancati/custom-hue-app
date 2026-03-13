package b7;

import com.google.android.gms.tasks.Task;

/* JADX INFO: renamed from: b7.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2870d extends IllegalStateException {
    public C2870d(String str, Throwable th) {
        super(str, th);
    }

    public static IllegalStateException a(Task task) {
        if (!task.p()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception excL = task.l();
        return new C2870d("Complete with: ".concat(excL != null ? "failure" : task.q() ? "result ".concat(String.valueOf(task.m())) : task.o() ? "cancellation" : "unknown issue"), excL);
    }
}
