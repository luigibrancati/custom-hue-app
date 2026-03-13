package io.flutter.plugins.googlemaps;

import U6.C2276c;
import U6.C2288o;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class GroundOverlayBuilder implements GroundOverlaySink {
    private final C2288o groundOverlayOptions = new C2288o();

    public C2288o build() {
        return this.groundOverlayOptions;
    }

    @Override // io.flutter.plugins.googlemaps.GroundOverlaySink
    public void setAnchor(float f10, float f11) {
        this.groundOverlayOptions.d(f10, f11);
    }

    @Override // io.flutter.plugins.googlemaps.GroundOverlaySink
    public void setBearing(float f10) {
        this.groundOverlayOptions.e(f10);
    }

    @Override // io.flutter.plugins.googlemaps.GroundOverlaySink
    public void setClickable(boolean z10) {
        this.groundOverlayOptions.f(z10);
    }

    @Override // io.flutter.plugins.googlemaps.GroundOverlaySink
    public void setImage(C2276c c2276c) {
        this.groundOverlayOptions.y(c2276c);
    }

    @Override // io.flutter.plugins.googlemaps.GroundOverlaySink
    public void setPosition(LatLng latLng, Float f10, Float f11) {
        if (f11 != null) {
            this.groundOverlayOptions.E(latLng, f10.floatValue(), f11.floatValue());
        } else {
            this.groundOverlayOptions.B(latLng, f10.floatValue());
        }
    }

    @Override // io.flutter.plugins.googlemaps.GroundOverlaySink
    public void setPositionFromBounds(LatLngBounds latLngBounds) {
        this.groundOverlayOptions.H(latLngBounds);
    }

    @Override // io.flutter.plugins.googlemaps.GroundOverlaySink
    public void setTransparency(float f10) {
        this.groundOverlayOptions.I(f10);
    }

    @Override // io.flutter.plugins.googlemaps.GroundOverlaySink
    public void setVisible(boolean z10) {
        this.groundOverlayOptions.J(z10);
    }

    @Override // io.flutter.plugins.googlemaps.GroundOverlaySink
    public void setZIndex(float f10) {
        this.groundOverlayOptions.L(f10);
    }
}
