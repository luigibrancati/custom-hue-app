package u6;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: u6.b0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5947b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45142a;

    public AbstractC5947b0(int i10) {
        this.f45142a = i10;
    }

    public static /* synthetic */ Status e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public abstract void a(Status status);

    public abstract void b(Exception exc);

    public abstract void c(C5973s c5973s, boolean z10);

    public abstract void d(C5919A c5919a);
}
