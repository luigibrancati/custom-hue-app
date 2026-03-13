package S6;

import T6.InterfaceC2232e;
import U6.M;
import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2232e f15399a;

    public i(InterfaceC2232e interfaceC2232e) {
        this.f15399a = interfaceC2232e;
    }

    public LatLng a(Point point) {
        AbstractC6056k.l(point);
        try {
            return this.f15399a.b3(ObjectWrapper.wrap(point));
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public M b() {
        try {
            return this.f15399a.getVisibleRegion();
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public Point c(LatLng latLng) {
        AbstractC6056k.l(latLng);
        try {
            return (Point) ObjectWrapper.unwrap(this.f15399a.m1(latLng));
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }
}
