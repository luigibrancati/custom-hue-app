package x;

import B0.c;
import E.InterfaceC0802n;
import L.InterfaceC1099g0;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import w.C6107a;
import x.r2;
import y.C6378n;
import z.C6482b;

/* JADX INFO: renamed from: x.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6204a implements r2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C6378n f46859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Range f46860b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c.a f46862d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f46864f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f46861c = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f46863e = 1.0f;

    public C6204a(C6378n c6378n) {
        this.f46864f = false;
        this.f46859a = c6378n;
        this.f46860b = (Range) c6378n.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        this.f46864f = c6378n.i();
    }

    @Override // x.r2.b
    public void a(TotalCaptureResult totalCaptureResult) {
        if (this.f46862d != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Float f10 = request == null ? null : (Float) request.get(CaptureRequest.CONTROL_ZOOM_RATIO);
            if (f10 == null) {
                return;
            }
            if (this.f46863e == f10.floatValue()) {
                this.f46862d.c(null);
                this.f46862d = null;
            }
        }
    }

    @Override // x.r2.b
    public float b() {
        return ((Float) this.f46860b.getLower()).floatValue();
    }

    @Override // x.r2.b
    public void c(float f10, c.a aVar) {
        this.f46861c = f10;
        c.a aVar2 = this.f46862d;
        if (aVar2 != null) {
            aVar2.f(new InterfaceC0802n.a("There is a new zoomRatio being set"));
        }
        this.f46863e = this.f46861c;
        this.f46862d = aVar;
    }

    @Override // x.r2.b
    public void d(C6107a.C0631a c0631a) {
        CaptureRequest.Key key = CaptureRequest.CONTROL_ZOOM_RATIO;
        Float fValueOf = Float.valueOf(this.f46861c);
        InterfaceC1099g0.c cVar = InterfaceC1099g0.c.REQUIRED;
        c0631a.g(key, fValueOf, cVar);
        if (this.f46864f) {
            C6482b.a(c0631a, cVar);
        }
    }

    @Override // x.r2.b
    public void e() {
        this.f46861c = 1.0f;
        c.a aVar = this.f46862d;
        if (aVar != null) {
            aVar.f(new InterfaceC0802n.a("Camera is not active."));
            this.f46862d = null;
        }
    }

    @Override // x.r2.b
    public float f() {
        return ((Float) this.f46860b.getUpper()).floatValue();
    }

    @Override // x.r2.b
    public Rect g() {
        return (Rect) X0.h.g((Rect) this.f46859a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }
}
