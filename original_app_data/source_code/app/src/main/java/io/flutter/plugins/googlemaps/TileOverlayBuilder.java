package io.flutter.plugins.googlemaps;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class TileOverlayBuilder implements TileOverlaySink {
    private final U6.K tileOverlayOptions = new U6.K();

    public U6.K build() {
        return this.tileOverlayOptions;
    }

    @Override // io.flutter.plugins.googlemaps.TileOverlaySink
    public void setFadeIn(boolean z10) {
        this.tileOverlayOptions.d(z10);
    }

    @Override // io.flutter.plugins.googlemaps.TileOverlaySink
    public void setTileProvider(U6.L l10) {
        this.tileOverlayOptions.l(l10);
    }

    @Override // io.flutter.plugins.googlemaps.TileOverlaySink
    public void setTransparency(float f10) {
        this.tileOverlayOptions.n(f10);
    }

    @Override // io.flutter.plugins.googlemaps.TileOverlaySink
    public void setVisible(boolean z10) {
        this.tileOverlayOptions.r(z10);
    }

    @Override // io.flutter.plugins.googlemaps.TileOverlaySink
    public void setZIndex(float f10) {
        this.tileOverlayOptions.t(f10);
    }
}
