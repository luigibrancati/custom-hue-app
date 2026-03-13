package S6;

import T6.InterfaceC2228a;
import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: S6.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2196b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static InterfaceC2228a f15388a;

    public static C2195a a(CameraPosition cameraPosition) {
        AbstractC6056k.m(cameraPosition, "cameraPosition must not be null");
        try {
            return new C2195a(l().u2(cameraPosition));
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public static C2195a b(LatLng latLng) {
        AbstractC6056k.m(latLng, "latLng must not be null");
        try {
            return new C2195a(l().w4(latLng));
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public static C2195a c(LatLngBounds latLngBounds, int i10) {
        AbstractC6056k.m(latLngBounds, "bounds must not be null");
        try {
            return new C2195a(l().m0(latLngBounds, i10));
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public static C2195a d(LatLng latLng, float f10) {
        AbstractC6056k.m(latLng, "latLng must not be null");
        try {
            return new C2195a(l().w3(latLng, f10));
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public static C2195a e(float f10, float f11) {
        try {
            return new C2195a(l().x3(f10, f11));
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public static C2195a f(float f10) {
        try {
            return new C2195a(l().s0(f10));
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public static C2195a g(float f10, Point point) {
        AbstractC6056k.m(point, "focus must not be null");
        try {
            return new C2195a(l().g5(f10, point.x, point.y));
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public static C2195a h() {
        try {
            return new C2195a(l().z1());
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public static C2195a i() {
        try {
            return new C2195a(l().T5());
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public static C2195a j(float f10) {
        try {
            return new C2195a(l().j3(f10));
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public static void k(InterfaceC2228a interfaceC2228a) {
        f15388a = (InterfaceC2228a) AbstractC6056k.l(interfaceC2228a);
    }

    public static InterfaceC2228a l() {
        return (InterfaceC2228a) AbstractC6056k.m(f15388a, "CameraUpdateFactory is not initialized");
    }
}
