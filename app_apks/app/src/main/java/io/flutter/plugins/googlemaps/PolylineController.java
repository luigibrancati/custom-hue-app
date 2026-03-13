package io.flutter.plugins.googlemaps;

import U6.C2279f;
import U6.C2292t;
import U6.C2297y;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class PolylineController implements PolylineOptionsSink {
    private boolean consumeTapEvents;
    private final float density;
    private final String googleMapsPolylineId;
    private final C2297y polyline;

    public PolylineController(C2297y c2297y, boolean z10, float f10) {
        this.polyline = c2297y;
        this.consumeTapEvents = z10;
        this.density = f10;
        this.googleMapsPolylineId = c2297y.a();
    }

    public boolean consumeTapEvents() {
        return this.consumeTapEvents;
    }

    public String getGoogleMapsPolylineId() {
        return this.googleMapsPolylineId;
    }

    public void remove() {
        this.polyline.b();
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setColor(int i10) {
        this.polyline.d(i10);
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setConsumeTapEvents(boolean z10) {
        this.consumeTapEvents = z10;
        this.polyline.c(z10);
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setEndCap(C2279f c2279f) {
        this.polyline.e(c2279f);
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setGeodesic(boolean z10) {
        this.polyline.f(z10);
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setJointType(int i10) {
        this.polyline.g(i10);
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setPattern(List<C2292t> list) {
        this.polyline.h(list);
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setPoints(List<LatLng> list) {
        this.polyline.i(list);
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setStartCap(C2279f c2279f) {
        this.polyline.j(c2279f);
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setVisible(boolean z10) {
        this.polyline.k(z10);
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setWidth(float f10) {
        this.polyline.l(f10 * this.density);
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setZIndex(float f10) {
        this.polyline.m(f10);
    }
}
