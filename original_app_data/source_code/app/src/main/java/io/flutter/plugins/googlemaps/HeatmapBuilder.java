package io.flutter.plugins.googlemaps;

import J9.b;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class HeatmapBuilder implements HeatmapOptionsSink {
    private final b.a heatmapOptions = new b.a();

    public J9.b build() {
        return this.heatmapOptions.a();
    }

    @Override // io.flutter.plugins.googlemaps.HeatmapOptionsSink
    public void setGradient(J9.a aVar) {
        this.heatmapOptions.g(aVar);
    }

    @Override // io.flutter.plugins.googlemaps.HeatmapOptionsSink
    public void setMaxIntensity(double d10) {
        this.heatmapOptions.h(d10);
    }

    @Override // io.flutter.plugins.googlemaps.HeatmapOptionsSink
    public void setOpacity(double d10) {
        this.heatmapOptions.i(d10);
    }

    @Override // io.flutter.plugins.googlemaps.HeatmapOptionsSink
    public void setRadius(int i10) {
        this.heatmapOptions.j(i10);
    }

    @Override // io.flutter.plugins.googlemaps.HeatmapOptionsSink
    public void setWeightedData(List<J9.c> list) {
        this.heatmapOptions.k(list);
    }
}
