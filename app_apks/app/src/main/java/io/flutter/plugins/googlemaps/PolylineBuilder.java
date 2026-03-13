package io.flutter.plugins.googlemaps;

import U6.C2279f;
import U6.C2292t;
import U6.C2298z;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class PolylineBuilder implements PolylineOptionsSink {
    private boolean consumeTapEvents;
    private final float density;
    private final C2298z polylineOptions = new C2298z();

    public PolylineBuilder(float f10) {
        this.density = f10;
    }

    public C2298z build() {
        return this.polylineOptions;
    }

    public boolean consumeTapEvents() {
        return this.consumeTapEvents;
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setColor(int i10) {
        this.polylineOptions.f(i10);
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setConsumeTapEvents(boolean z10) {
        this.consumeTapEvents = z10;
        this.polylineOptions.e(z10);
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setEndCap(C2279f c2279f) {
        this.polylineOptions.h(c2279f);
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setGeodesic(boolean z10) {
        this.polylineOptions.k(z10);
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setJointType(int i10) {
        this.polylineOptions.E(i10);
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setPattern(List<C2292t> list) {
        this.polylineOptions.H(list);
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setPoints(List<LatLng> list) {
        this.polylineOptions.d(list);
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setStartCap(C2279f c2279f) {
        this.polylineOptions.I(c2279f);
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setVisible(boolean z10) {
        this.polylineOptions.J(z10);
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setWidth(float f10) {
        this.polylineOptions.L(f10 * this.density);
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setZIndex(float f10) {
        this.polylineOptions.M(f10);
    }
}
