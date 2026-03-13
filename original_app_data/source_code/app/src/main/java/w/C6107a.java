package w;

import D.l;
import E.K;
import L.InterfaceC1099g0;
import L.L0;
import L.M0;
import L.R0;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;

/* JADX INFO: renamed from: w.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6107a extends l {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final InterfaceC1099g0.a f46062Q = InterfaceC1099g0.a.a("camera2.captureRequest.templateType", Integer.TYPE);

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final InterfaceC1099g0.a f46063R = InterfaceC1099g0.a.a("camera2.cameraCaptureSession.streamUseCase", Long.TYPE);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final InterfaceC1099g0.a f46064S = InterfaceC1099g0.a.a("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class);

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final InterfaceC1099g0.a f46065T = InterfaceC1099g0.a.a("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class);

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final InterfaceC1099g0.a f46066U = InterfaceC1099g0.a.a("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class);

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final InterfaceC1099g0.a f46067V = InterfaceC1099g0.a.a("camera2.captureRequest.tag", Object.class);

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final InterfaceC1099g0.a f46068W = InterfaceC1099g0.a.a("camera2.cameraCaptureSession.physicalCameraId", String.class);

    /* JADX INFO: renamed from: w.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0631a implements K {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final M0 f46069a = M0.g0();

        @Override // E.K
        public L0 a() {
            return this.f46069a;
        }

        public C6107a c() {
            return new C6107a(R0.f0(this.f46069a));
        }

        public C0631a d(InterfaceC1099g0 interfaceC1099g0) {
            e(interfaceC1099g0, InterfaceC1099g0.c.OPTIONAL);
            return this;
        }

        public C0631a e(InterfaceC1099g0 interfaceC1099g0, InterfaceC1099g0.c cVar) {
            for (InterfaceC1099g0.a aVar : interfaceC1099g0.b()) {
                this.f46069a.Y(aVar, cVar, interfaceC1099g0.a(aVar));
            }
            return this;
        }

        public C0631a f(CaptureRequest.Key key, Object obj) {
            this.f46069a.H(C6107a.d0(key), obj);
            return this;
        }

        public C0631a g(CaptureRequest.Key key, Object obj, InterfaceC1099g0.c cVar) {
            this.f46069a.Y(C6107a.d0(key), cVar, obj);
            return this;
        }
    }

    public C6107a(InterfaceC1099g0 interfaceC1099g0) {
        super(interfaceC1099g0);
    }

    public static InterfaceC1099g0.a d0(CaptureRequest.Key key) {
        return InterfaceC1099g0.a.b("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }

    public l e0() {
        return l.a.e(getConfig()).d();
    }

    public int f0(int i10) {
        return ((Integer) getConfig().c(f46062Q, Integer.valueOf(i10))).intValue();
    }

    public CameraDevice.StateCallback g0(CameraDevice.StateCallback stateCallback) {
        return (CameraDevice.StateCallback) getConfig().c(f46064S, stateCallback);
    }

    public String h0(String str) {
        return (String) getConfig().c(f46068W, str);
    }

    public CameraCaptureSession.CaptureCallback i0(CameraCaptureSession.CaptureCallback captureCallback) {
        return (CameraCaptureSession.CaptureCallback) getConfig().c(f46066U, captureCallback);
    }

    public CameraCaptureSession.StateCallback j0(CameraCaptureSession.StateCallback stateCallback) {
        return (CameraCaptureSession.StateCallback) getConfig().c(f46065T, stateCallback);
    }

    public long k0(long j10) {
        return ((Long) getConfig().c(f46063R, Long.valueOf(j10))).longValue();
    }
}
