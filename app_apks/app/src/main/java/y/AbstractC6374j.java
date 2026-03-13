package y;

import android.hardware.camera2.CameraCharacteristics;
import y.C6378n;

/* JADX INFO: renamed from: y.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6374j implements C6378n.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraCharacteristics f48315a;

    public AbstractC6374j(CameraCharacteristics cameraCharacteristics) {
        this.f48315a = cameraCharacteristics;
    }

    @Override // y.C6378n.a
    public CameraCharacteristics a() {
        return this.f48315a;
    }

    @Override // y.C6378n.a
    public Object b(CameraCharacteristics.Key key) {
        return this.f48315a.get(key);
    }
}
