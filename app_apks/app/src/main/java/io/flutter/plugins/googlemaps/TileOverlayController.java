package io.flutter.plugins.googlemaps;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class TileOverlayController implements TileOverlaySink {
    private final U6.J tileOverlay;

    public TileOverlayController(U6.J j10) {
        this.tileOverlay = j10;
    }

    public void clearTileCache() {
        this.tileOverlay.a();
    }

    public U6.J getTileOverlay() {
        return this.tileOverlay;
    }

    public void remove() {
        this.tileOverlay.f();
    }

    @Override // io.flutter.plugins.googlemaps.TileOverlaySink
    public void setFadeIn(boolean z10) {
        this.tileOverlay.g(z10);
    }

    @Override // io.flutter.plugins.googlemaps.TileOverlaySink
    public void setTransparency(float f10) {
        this.tileOverlay.h(f10);
    }

    @Override // io.flutter.plugins.googlemaps.TileOverlaySink
    public void setVisible(boolean z10) {
        this.tileOverlay.i(z10);
    }

    @Override // io.flutter.plugins.googlemaps.TileOverlaySink
    public void setZIndex(float f10) {
        this.tileOverlay.j(f10);
    }

    @Override // io.flutter.plugins.googlemaps.TileOverlaySink
    public void setTileProvider(U6.L l10) {
    }
}
