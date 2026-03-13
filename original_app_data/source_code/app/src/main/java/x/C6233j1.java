package x;

import B0.c;
import E.InterfaceC0802n;
import L.InterfaceC1099g0;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import w.C6107a;
import x.r2;
import y.C6378n;

/* JADX INFO: renamed from: x.j1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6233j1 implements r2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C6378n f47028a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c.a f47030c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Rect f47029b = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Rect f47031d = null;

    public C6233j1(C6378n c6378n) {
        this.f47028a = c6378n;
    }

    public static Rect h(Rect rect, float f10) {
        float fWidth = rect.width() / f10;
        float fHeight = rect.height() / f10;
        float fWidth2 = (rect.width() - fWidth) / 2.0f;
        float fHeight2 = (rect.height() - fHeight) / 2.0f;
        return new Rect((int) fWidth2, (int) fHeight2, (int) (fWidth2 + fWidth), (int) (fHeight2 + fHeight));
    }

    @Override // x.r2.b
    public void a(TotalCaptureResult totalCaptureResult) {
        if (this.f47030c != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Rect rect = request == null ? null : (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            Rect rect2 = this.f47031d;
            if (rect2 == null || !rect2.equals(rect)) {
                return;
            }
            this.f47030c.c(null);
            this.f47030c = null;
            this.f47031d = null;
        }
    }

    @Override // x.r2.b
    public float b() {
        return 1.0f;
    }

    @Override // x.r2.b
    public void c(float f10, c.a aVar) {
        this.f47029b = h(i(), f10);
        c.a aVar2 = this.f47030c;
        if (aVar2 != null) {
            aVar2.f(new InterfaceC0802n.a("There is a new zoomRatio being set"));
        }
        this.f47031d = this.f47029b;
        this.f47030c = aVar;
    }

    @Override // x.r2.b
    public void d(C6107a.C0631a c0631a) {
        Rect rect = this.f47029b;
        if (rect != null) {
            c0631a.g(CaptureRequest.SCALER_CROP_REGION, rect, InterfaceC1099g0.c.REQUIRED);
        }
    }

    @Override // x.r2.b
    public void e() {
        this.f47031d = null;
        this.f47029b = null;
        c.a aVar = this.f47030c;
        if (aVar != null) {
            aVar.f(new InterfaceC0802n.a("Camera is not active."));
            this.f47030c = null;
        }
    }

    @Override // x.r2.b
    public float f() {
        Float f10 = (Float) this.f47028a.a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f10 == null) {
            return 1.0f;
        }
        return f10.floatValue() < b() ? b() : f10.floatValue();
    }

    @Override // x.r2.b
    public Rect g() {
        Rect rect = this.f47029b;
        return rect != null ? rect : i();
    }

    public final Rect i() {
        return (Rect) X0.h.g((Rect) this.f47028a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }
}
