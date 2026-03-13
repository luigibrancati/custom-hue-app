package K6;

import android.location.Location;
import b7.C2878l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.location.zzy;
import u6.C5971q;

/* JADX INFO: renamed from: K6.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC1060z extends zzy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2878l f7569a;

    public BinderC1060z(C2878l c2878l) {
        this.f7569a = c2878l;
    }

    @Override // K6.q0
    public final void R0(Status status, Location location) {
        C5971q.b(status, location, this.f7569a);
    }
}
