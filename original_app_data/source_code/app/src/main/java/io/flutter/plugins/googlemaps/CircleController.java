package io.flutter.plugins.googlemaps;

import U6.C2280g;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class CircleController implements CircleOptionsSink {
    private final C2280g circle;
    private boolean consumeTapEvents;
    private final float density;
    private final String googleMapsCircleId;

    public CircleController(C2280g c2280g, boolean z10, float f10) {
        this.circle = c2280g;
        this.consumeTapEvents = z10;
        this.density = f10;
        this.googleMapsCircleId = c2280g.a();
    }

    public boolean consumeTapEvents() {
        return this.consumeTapEvents;
    }

    public String getGoogleMapsCircleId() {
        return this.googleMapsCircleId;
    }

    public void remove() {
        this.circle.b();
    }

    @Override // io.flutter.plugins.googlemaps.CircleOptionsSink
    public void setCenter(LatLng latLng) {
        this.circle.c(latLng);
    }

    @Override // io.flutter.plugins.googlemaps.CircleOptionsSink
    public void setConsumeTapEvents(boolean z10) {
        this.consumeTapEvents = z10;
        this.circle.d(z10);
    }

    @Override // io.flutter.plugins.googlemaps.CircleOptionsSink
    public void setFillColor(int i10) {
        this.circle.e(i10);
    }

    @Override // io.flutter.plugins.googlemaps.CircleOptionsSink
    public void setRadius(double d10) {
        this.circle.f(d10);
    }

    @Override // io.flutter.plugins.googlemaps.CircleOptionsSink
    public void setStrokeColor(int i10) {
        this.circle.g(i10);
    }

    @Override // io.flutter.plugins.googlemaps.CircleOptionsSink
    public void setStrokeWidth(float f10) {
        this.circle.h(f10 * this.density);
    }

    @Override // io.flutter.plugins.googlemaps.CircleOptionsSink
    public void setVisible(boolean z10) {
        this.circle.i(z10);
    }

    @Override // io.flutter.plugins.googlemaps.CircleOptionsSink
    public void setZIndex(float f10) {
        this.circle.j(f10);
    }
}
