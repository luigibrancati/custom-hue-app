package io.flutter.plugins.googlemaps;

import U6.C2276c;
import U6.C2287n;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class GroundOverlayController implements GroundOverlaySink {
    private final String googleMapsGroundOverlayId;
    private final C2287n groundOverlay;
    private final boolean isCreatedWithBounds;

    public GroundOverlayController(C2287n c2287n, boolean z10) {
        this.groundOverlay = c2287n;
        this.googleMapsGroundOverlayId = c2287n.d();
        this.isCreatedWithBounds = z10;
    }

    public String getGoogleMapsGroundOverlayId() {
        return this.googleMapsGroundOverlayId;
    }

    public C2287n getGroundOverlay() {
        return this.groundOverlay;
    }

    public boolean isCreatedWithBounds() {
        return this.isCreatedWithBounds;
    }

    public void remove() {
        this.groundOverlay.k();
    }

    @Override // io.flutter.plugins.googlemaps.GroundOverlaySink
    public void setBearing(float f10) {
        this.groundOverlay.l(f10);
    }

    @Override // io.flutter.plugins.googlemaps.GroundOverlaySink
    public void setClickable(boolean z10) {
        this.groundOverlay.m(z10);
    }

    @Override // io.flutter.plugins.googlemaps.GroundOverlaySink
    public void setImage(C2276c c2276c) {
        this.groundOverlay.p(c2276c);
    }

    @Override // io.flutter.plugins.googlemaps.GroundOverlaySink
    public void setPosition(LatLng latLng, Float f10, Float f11) {
        this.groundOverlay.q(latLng);
        if (f11 == null) {
            this.groundOverlay.n(f10.floatValue());
        } else {
            this.groundOverlay.o(f10.floatValue(), f11.floatValue());
        }
    }

    @Override // io.flutter.plugins.googlemaps.GroundOverlaySink
    public void setPositionFromBounds(LatLngBounds latLngBounds) {
        this.groundOverlay.r(latLngBounds);
    }

    @Override // io.flutter.plugins.googlemaps.GroundOverlaySink
    public void setTransparency(float f10) {
        this.groundOverlay.s(f10);
    }

    @Override // io.flutter.plugins.googlemaps.GroundOverlaySink
    public void setVisible(boolean z10) {
        this.groundOverlay.t(z10);
    }

    @Override // io.flutter.plugins.googlemaps.GroundOverlaySink
    public void setZIndex(float f10) {
        this.groundOverlay.u(f10);
    }

    @Override // io.flutter.plugins.googlemaps.GroundOverlaySink
    public void setAnchor(float f10, float f11) {
    }
}
