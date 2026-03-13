package I3;

import androidx.work.WorkerParameters;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WorkerParameters f5583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f5584c;

    public P(String workerClassName, WorkerParameters workerParameters, Throwable throwable) {
        AbstractC4862t.e(workerClassName, "workerClassName");
        AbstractC4862t.e(workerParameters, "workerParameters");
        AbstractC4862t.e(throwable, "throwable");
        this.f5582a = workerClassName;
        this.f5583b = workerParameters;
        this.f5584c = throwable;
    }
}
