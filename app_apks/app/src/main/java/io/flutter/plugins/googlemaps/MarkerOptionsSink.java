package io.flutter.plugins.googlemaps;

import U6.C2276c;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
interface MarkerOptionsSink {
    void setAlpha(float f10);

    void setAnchor(float f10, float f11);

    void setCollisionBehavior(int i10);

    void setConsumeTapEvents(boolean z10);

    void setDraggable(boolean z10);

    void setFlat(boolean z10);

    void setIcon(C2276c c2276c);

    void setInfoWindowAnchor(float f10, float f11);

    void setInfoWindowText(String str, String str2);

    void setPosition(LatLng latLng);

    void setRotation(float f10);

    void setVisible(boolean z10);

    void setZIndex(float f10);
}
