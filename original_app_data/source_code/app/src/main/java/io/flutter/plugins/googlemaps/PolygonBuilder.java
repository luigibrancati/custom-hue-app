package io.flutter.plugins.googlemaps;

import U6.C2296x;
import com.google.android.gms.maps.model.LatLng;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class PolygonBuilder implements PolygonOptionsSink {
    private boolean consumeTapEvents;
    private final float density;
    private final C2296x polygonOptions = new C2296x();

    public PolygonBuilder(float f10) {
        this.density = f10;
    }

    public C2296x build() {
        return this.polygonOptions;
    }

    public boolean consumeTapEvents() {
        return this.consumeTapEvents;
    }

    @Override // io.flutter.plugins.googlemaps.PolygonOptionsSink
    public void setConsumeTapEvents(boolean z10) {
        this.consumeTapEvents = z10;
        this.polygonOptions.f(z10);
    }

    @Override // io.flutter.plugins.googlemaps.PolygonOptionsSink
    public void setFillColor(int i10) {
        this.polygonOptions.h(i10);
    }

    @Override // io.flutter.plugins.googlemaps.PolygonOptionsSink
    public void setGeodesic(boolean z10) {
        this.polygonOptions.k(z10);
    }

    @Override // io.flutter.plugins.googlemaps.PolygonOptionsSink
    public void setHoles(List<List<LatLng>> list) {
        Iterator<List<LatLng>> it = list.iterator();
        while (it.hasNext()) {
            this.polygonOptions.e(it.next());
        }
    }

    @Override // io.flutter.plugins.googlemaps.PolygonOptionsSink
    public void setPoints(List<LatLng> list) {
        this.polygonOptions.d(list);
    }

    @Override // io.flutter.plugins.googlemaps.PolygonOptionsSink
    public void setStrokeColor(int i10) {
        this.polygonOptions.B(i10);
    }

    @Override // io.flutter.plugins.googlemaps.PolygonOptionsSink
    public void setStrokeWidth(float f10) {
        this.polygonOptions.E(f10 * this.density);
    }

    @Override // io.flutter.plugins.googlemaps.PolygonOptionsSink
    public void setVisible(boolean z10) {
        this.polygonOptions.H(z10);
    }

    @Override // io.flutter.plugins.googlemaps.PolygonOptionsSink
    public void setZIndex(float f10) {
        this.polygonOptions.I(f10);
    }
}
