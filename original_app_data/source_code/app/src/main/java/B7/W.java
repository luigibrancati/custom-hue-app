package B7;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class W implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f708b = "com.google.android.play.core.splitinstall.protocol.ISplitInstallService";

    public W(IBinder iBinder, String str) {
        this.f707a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f707a;
    }
}
