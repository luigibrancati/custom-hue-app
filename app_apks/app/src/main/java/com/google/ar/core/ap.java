package com.google.ar.core;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.view.Surface;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
final class ap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CameraDevice f31185a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f31186b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SurfaceTexture f31187c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Surface f31188d = null;

    private ap() {
    }

    public final CameraDevice a() {
        return this.f31185a;
    }

    public final void b(CameraDevice cameraDevice) {
        this.f31185a = cameraDevice;
    }

    public final void c(String str, List list) {
        this.f31186b.put(str, list);
    }

    public final SurfaceTexture d() {
        return this.f31187c;
    }

    public final void e(SurfaceTexture surfaceTexture) {
        this.f31187c = surfaceTexture;
    }

    public final Surface f() {
        return this.f31188d;
    }

    public final void g(Surface surface) {
        this.f31188d = surface;
    }

    public /* synthetic */ ap(byte[] bArr) {
    }
}
