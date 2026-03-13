package io.flutter.plugins.videoplayer.platformview;

import K1.InterfaceC1032y;
import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import io.flutter.plugin.platform.PlatformView;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class PlatformVideoView implements PlatformView {
    private final SurfaceView surfaceView;

    public PlatformVideoView(Context context, InterfaceC1032y interfaceC1032y) {
        SurfaceView surfaceView = new SurfaceView(context);
        this.surfaceView = surfaceView;
        interfaceC1032y.k0(surfaceView);
    }

    private void setupSurfaceWithCallback(final InterfaceC1032y interfaceC1032y) {
        this.surfaceView.getHolder().addCallback(new SurfaceHolder.Callback() { // from class: io.flutter.plugins.videoplayer.platformview.PlatformVideoView.1
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                interfaceC1032y.f0(surfaceHolder.getSurface());
                interfaceC1032y.seekTo(1L);
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                interfaceC1032y.f0(null);
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            }
        });
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void dispose() {
        this.surfaceView.getHolder().getSurface().release();
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public View getView() {
        return this.surfaceView;
    }
}
