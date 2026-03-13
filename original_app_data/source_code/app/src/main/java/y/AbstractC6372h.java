package y;

import android.hardware.camera2.CameraCaptureSession;
import y.C6370f;

/* JADX INFO: renamed from: y.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6372h implements C6370f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraCaptureSession f48313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f48314b;

    public AbstractC6372h(CameraCaptureSession cameraCaptureSession, Object obj) {
        this.f48313a = (CameraCaptureSession) X0.h.g(cameraCaptureSession);
        this.f48314b = obj;
    }

    @Override // y.C6370f.a
    public CameraCaptureSession a() {
        return this.f48313a;
    }
}
