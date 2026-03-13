package K6;

import R6.AbstractC2070e;
import android.app.PendingIntent;
import b7.C2878l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.location.zzs;
import u6.C5971q;

/* JADX INFO: renamed from: K6.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC1058x extends zzs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2878l f7566a;

    public BinderC1058x(C2878l c2878l) {
        this.f7566a = c2878l;
    }

    @Override // K6.m0
    public final void F6(int i10, String[] strArr) {
        C5971q.a(new Status(AbstractC2070e.b(i10)), this.f7566a);
    }

    @Override // K6.m0
    public final void I0(int i10, String[] strArr) {
        C5971q.a(new Status(AbstractC2070e.b(i10)), this.f7566a);
    }

    @Override // K6.m0
    public final void f3(int i10, PendingIntent pendingIntent) {
        C5971q.a(new Status(AbstractC2070e.b(i10)), this.f7566a);
    }
}
