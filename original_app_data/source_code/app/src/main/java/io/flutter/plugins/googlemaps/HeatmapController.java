package io.flutter.plugins.googlemaps;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class HeatmapController implements HeatmapOptionsSink {
    private final J9.b heatmap;
    private final U6.J heatmapTileOverlay;

    public HeatmapController(J9.b bVar, U6.J j10) {
        this.heatmap = bVar;
        this.heatmapTileOverlay = j10;
    }

    public void clearTileCache() {
        this.heatmapTileOverlay.a();
    }

    public void remove() {
        this.heatmapTileOverlay.f();
    }

    @Override // io.flutter.plugins.googlemaps.HeatmapOptionsSink
    public void setGradient(J9.a aVar) {
        this.heatmap.b(aVar);
    }

    @Override // io.flutter.plugins.googlemaps.HeatmapOptionsSink
    public void setMaxIntensity(double d10) {
        this.heatmap.c(d10);
    }

    @Override // io.flutter.plugins.googlemaps.HeatmapOptionsSink
    public void setOpacity(double d10) {
        this.heatmap.d(d10);
    }

    @Override // io.flutter.plugins.googlemaps.HeatmapOptionsSink
    public void setRadius(int i10) {
        this.heatmap.e(i10);
    }

    @Override // io.flutter.plugins.googlemaps.HeatmapOptionsSink
    public void setWeightedData(List<J9.c> list) {
        this.heatmap.f(list);
    }
}
