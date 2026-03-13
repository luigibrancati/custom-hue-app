package S6;

import T6.InterfaceC2234g;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2234g f15400a;

    public j(InterfaceC2234g interfaceC2234g) {
        this.f15400a = interfaceC2234g;
    }

    public boolean a() {
        try {
            return this.f15400a.isCompassEnabled();
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public boolean b() {
        try {
            return this.f15400a.isMapToolbarEnabled();
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public boolean c() {
        try {
            return this.f15400a.isMyLocationButtonEnabled();
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public boolean d() {
        try {
            return this.f15400a.j4();
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public boolean e() {
        try {
            return this.f15400a.d6();
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public boolean f() {
        try {
            return this.f15400a.s4();
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public boolean g() {
        try {
            return this.f15400a.F3();
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public boolean h() {
        try {
            return this.f15400a.v4();
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public void i(boolean z10) {
        try {
            this.f15400a.setCompassEnabled(z10);
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public void j(boolean z10) {
        try {
            this.f15400a.setMapToolbarEnabled(z10);
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public void k(boolean z10) {
        try {
            this.f15400a.setMyLocationButtonEnabled(z10);
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public void l(boolean z10) {
        try {
            this.f15400a.setRotateGesturesEnabled(z10);
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public void m(boolean z10) {
        try {
            this.f15400a.setScrollGesturesEnabled(z10);
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public void n(boolean z10) {
        try {
            this.f15400a.setTiltGesturesEnabled(z10);
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public void o(boolean z10) {
        try {
            this.f15400a.setZoomControlsEnabled(z10);
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public void p(boolean z10) {
        try {
            this.f15400a.setZoomGesturesEnabled(z10);
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }
}
