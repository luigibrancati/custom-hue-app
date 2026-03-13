package L3;

import android.app.job.JobInfo;
import android.net.NetworkRequest;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final void a(JobInfo.Builder builder, NetworkRequest networkRequest) {
        AbstractC4862t.e(builder, "builder");
        builder.setRequiredNetwork(networkRequest);
    }
}
