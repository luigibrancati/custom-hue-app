package w7;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import b7.C2878l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2878l f46311a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, Handler handler, C2878l c2878l) {
        super(handler);
        this.f46311a = c2878l;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        this.f46311a.e(null);
    }
}
