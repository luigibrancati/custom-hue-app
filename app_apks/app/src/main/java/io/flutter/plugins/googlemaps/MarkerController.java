package io.flutter.plugins.googlemaps;

import H9.b;
import U6.C2276c;
import com.google.android.gms.maps.model.LatLng;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class MarkerController implements MarkerOptionsSink {
    private boolean consumeTapEvents;
    private final String googleMapsMarkerId;
    private final WeakReference<U6.r> weakMarker;

    public MarkerController(U6.r rVar, boolean z10) {
        this.weakMarker = new WeakReference<>(rVar);
        this.consumeTapEvents = z10;
        this.googleMapsMarkerId = rVar.a();
    }

    public boolean consumeTapEvents() {
        return this.consumeTapEvents;
    }

    public String getGoogleMapsMarkerId() {
        return this.googleMapsMarkerId;
    }

    public void hideInfoWindow() {
        U6.r rVar = this.weakMarker.get();
        if (rVar == null) {
            return;
        }
        rVar.e();
    }

    public boolean isInfoWindowShown() {
        U6.r rVar = this.weakMarker.get();
        if (rVar == null) {
            return false;
        }
        return rVar.f();
    }

    public void removeFromCollection(b.a aVar) {
        U6.r rVar = this.weakMarker.get();
        if (rVar == null) {
            return;
        }
        aVar.k(rVar);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setAlpha(float f10) {
        U6.r rVar = this.weakMarker.get();
        if (rVar == null) {
            return;
        }
        rVar.h(f10);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setAnchor(float f10, float f11) {
        U6.r rVar = this.weakMarker.get();
        if (rVar == null) {
            return;
        }
        rVar.i(f10, f11);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setConsumeTapEvents(boolean z10) {
        if (this.weakMarker.get() == null) {
            return;
        }
        this.consumeTapEvents = z10;
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setDraggable(boolean z10) {
        U6.r rVar = this.weakMarker.get();
        if (rVar == null) {
            return;
        }
        rVar.j(z10);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setFlat(boolean z10) {
        U6.r rVar = this.weakMarker.get();
        if (rVar == null) {
            return;
        }
        rVar.k(z10);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setIcon(C2276c c2276c) {
        U6.r rVar = this.weakMarker.get();
        if (rVar == null) {
            return;
        }
        rVar.l(c2276c);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setInfoWindowAnchor(float f10, float f11) {
        U6.r rVar = this.weakMarker.get();
        if (rVar == null) {
            return;
        }
        rVar.m(f10, f11);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setInfoWindowText(String str, String str2) {
        U6.r rVar = this.weakMarker.get();
        if (rVar == null) {
            return;
        }
        rVar.q(str);
        rVar.p(str2);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setPosition(LatLng latLng) {
        U6.r rVar = this.weakMarker.get();
        if (rVar == null) {
            return;
        }
        rVar.n(latLng);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setRotation(float f10) {
        U6.r rVar = this.weakMarker.get();
        if (rVar == null) {
            return;
        }
        rVar.o(f10);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setVisible(boolean z10) {
        U6.r rVar = this.weakMarker.get();
        if (rVar == null) {
            return;
        }
        rVar.r(z10);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setZIndex(float f10) {
        U6.r rVar = this.weakMarker.get();
        if (rVar == null) {
            return;
        }
        rVar.s(f10);
    }

    public void showInfoWindow() {
        U6.r rVar = this.weakMarker.get();
        if (rVar == null) {
            return;
        }
        rVar.t();
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setCollisionBehavior(int i10) {
    }
}
