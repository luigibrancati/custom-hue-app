package io.flutter.plugins.googlemaps;

import U6.C2281h;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class CircleBuilder implements CircleOptionsSink {
    private final C2281h circleOptions = new C2281h();
    private boolean consumeTapEvents;
    private final float density;

    public CircleBuilder(float f10) {
        this.density = f10;
    }

    public C2281h build() {
        return this.circleOptions;
    }

    public boolean consumeTapEvents() {
        return this.consumeTapEvents;
    }

    @Override // io.flutter.plugins.googlemaps.CircleOptionsSink
    public void setCenter(LatLng latLng) {
        this.circleOptions.d(latLng);
    }

    @Override // io.flutter.plugins.googlemaps.CircleOptionsSink
    public void setConsumeTapEvents(boolean z10) {
        this.consumeTapEvents = z10;
        this.circleOptions.e(z10);
    }

    @Override // io.flutter.plugins.googlemaps.CircleOptionsSink
    public void setFillColor(int i10) {
        this.circleOptions.f(i10);
    }

    @Override // io.flutter.plugins.googlemaps.CircleOptionsSink
    public void setRadius(double d10) {
        this.circleOptions.y(d10);
    }

    @Override // io.flutter.plugins.googlemaps.CircleOptionsSink
    public void setStrokeColor(int i10) {
        this.circleOptions.z(i10);
    }

    @Override // io.flutter.plugins.googlemaps.CircleOptionsSink
    public void setStrokeWidth(float f10) {
        this.circleOptions.A(f10 * this.density);
    }

    @Override // io.flutter.plugins.googlemaps.CircleOptionsSink
    public void setVisible(boolean z10) {
        this.circleOptions.B(z10);
    }

    @Override // io.flutter.plugins.googlemaps.CircleOptionsSink
    public void setZIndex(float f10) {
        this.circleOptions.E(f10);
    }
}
