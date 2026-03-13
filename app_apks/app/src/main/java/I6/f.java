package I6;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class f extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Looper f5664a;

    public f() {
        this.f5664a = Looper.getMainLooper();
    }

    public f(Looper looper) {
        super(looper);
        this.f5664a = Looper.getMainLooper();
    }

    public f(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f5664a = Looper.getMainLooper();
    }
}
