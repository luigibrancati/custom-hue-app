package io.flutter.plugins.googlemaps;

import U6.C2276c;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
interface GroundOverlaySink {
    void setAnchor(float f10, float f11);

    void setBearing(float f10);

    void setClickable(boolean z10);

    void setImage(C2276c c2276c);

    void setPosition(LatLng latLng, Float f10, Float f11);

    void setPositionFromBounds(LatLngBounds latLngBounds);

    void setTransparency(float f10);

    void setVisible(boolean z10);

    void setZIndex(float f10);
}
