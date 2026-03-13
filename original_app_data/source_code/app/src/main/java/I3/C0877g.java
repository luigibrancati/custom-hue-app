package I3;

import android.content.Context;
import androidx.work.WorkerParameters;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: I3.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C0877g extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0877g f5617a = new C0877g();

    @Override // I3.Q
    public /* bridge */ /* synthetic */ androidx.work.c a(Context context, String str, WorkerParameters workerParameters) {
        return (androidx.work.c) e(context, str, workerParameters);
    }

    public Void e(Context appContext, String workerClassName, WorkerParameters workerParameters) {
        AbstractC4862t.e(appContext, "appContext");
        AbstractC4862t.e(workerClassName, "workerClassName");
        AbstractC4862t.e(workerParameters, "workerParameters");
        return null;
    }
}
