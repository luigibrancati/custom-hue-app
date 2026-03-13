package io.flutter.embedding.engine;

import android.view.Surface;
import androidx.annotation.Keep;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Keep
public class FlutterOverlaySurface {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f37566id;
    private final Surface surface;

    public FlutterOverlaySurface(int i10, Surface surface) {
        this.f37566id = i10;
        this.surface = surface;
    }

    public int getId() {
        return this.f37566id;
    }

    public Surface getSurface() {
        return this.surface;
    }
}
