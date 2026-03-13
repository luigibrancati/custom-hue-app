package K6;

import b7.C2878l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import u6.C5971q;

/* JADX INFO: renamed from: K6.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC1059y extends IStatusCallback.Stub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f7567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2878l f7568b;

    public BinderC1059y(Object obj, C2878l c2878l) {
        this.f7567a = obj;
        this.f7568b = c2878l;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void D4(Status status) {
        C5971q.b(status, this.f7567a, this.f7568b);
    }
}
