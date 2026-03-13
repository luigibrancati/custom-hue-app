package androidx.work;

import I3.AbstractC0890u;
import I3.M;
import android.content.Context;
import androidx.work.a;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements p3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f24710a = AbstractC0890u.i("WrkMgrInitializer");

    @Override // p3.b
    public List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // p3.b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public M b(Context context) {
        AbstractC0890u.e().a(f24710a, "Initializing WorkManager with default configuration.");
        M.g(context, new a.C0318a().a());
        return M.e(context);
    }
}
