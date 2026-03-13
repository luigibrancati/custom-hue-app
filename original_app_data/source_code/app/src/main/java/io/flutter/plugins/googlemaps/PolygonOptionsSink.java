package io.flutter.plugins.googlemaps;

import com.google.android.gms.maps.model.LatLng;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
interface PolygonOptionsSink {
    void setConsumeTapEvents(boolean z10);

    void setFillColor(int i10);

    void setGeodesic(boolean z10);

    void setHoles(List<List<LatLng>> list);

    void setPoints(List<LatLng> list);

    void setStrokeColor(int i10);

    void setStrokeWidth(float f10);

    void setVisible(boolean z10);

    void setZIndex(float f10);
}
