package io.flutter.plugins.googlemaps;

import U6.C2295w;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class PolygonController implements PolygonOptionsSink {
    private boolean consumeTapEvents;
    private final float density;
    private final String googleMapsPolygonId;
    private final C2295w polygon;

    public PolygonController(C2295w c2295w, boolean z10, float f10) {
        this.polygon = c2295w;
        this.density = f10;
        this.consumeTapEvents = z10;
        this.googleMapsPolygonId = c2295w.a();
    }

    public boolean consumeTapEvents() {
        return this.consumeTapEvents;
    }

    public String getGoogleMapsPolygonId() {
        return this.googleMapsPolygonId;
    }

    public void remove() {
        this.polygon.b();
    }

    @Override // io.flutter.plugins.googlemaps.PolygonOptionsSink
    public void setConsumeTapEvents(boolean z10) {
        this.consumeTapEvents = z10;
        this.polygon.c(z10);
    }

    @Override // io.flutter.plugins.googlemaps.PolygonOptionsSink
    public void setFillColor(int i10) {
        this.polygon.d(i10);
    }

    @Override // io.flutter.plugins.googlemaps.PolygonOptionsSink
    public void setGeodesic(boolean z10) {
        this.polygon.e(z10);
    }

    @Override // io.flutter.plugins.googlemaps.PolygonOptionsSink
    public void setHoles(List<List<LatLng>> list) {
        this.polygon.f(list);
    }

    @Override // io.flutter.plugins.googlemaps.PolygonOptionsSink
    public void setPoints(List<LatLng> list) {
        this.polygon.g(list);
    }

    @Override // io.flutter.plugins.googlemaps.PolygonOptionsSink
    public void setStrokeColor(int i10) {
        this.polygon.h(i10);
    }

    @Override // io.flutter.plugins.googlemaps.PolygonOptionsSink
    public void setStrokeWidth(float f10) {
        this.polygon.i(f10 * this.density);
    }

    @Override // io.flutter.plugins.googlemaps.PolygonOptionsSink
    public void setVisible(boolean z10) {
        this.polygon.j(z10);
    }

    @Override // io.flutter.plugins.googlemaps.PolygonOptionsSink
    public void setZIndex(float f10) {
        this.polygon.k(f10);
    }
}
