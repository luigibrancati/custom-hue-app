package U6;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class T implements L {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L6.r f16664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ K f16665c;

    public T(K k10) {
        Objects.requireNonNull(k10);
        this.f16665c = k10;
        this.f16664b = k10.f16652a;
    }

    @Override // U6.L
    public final I getTile(int i10, int i11, int i12) {
        try {
            return this.f16664b.z2(i10, i11, i12);
        } catch (RemoteException unused) {
            return null;
        }
    }
}
