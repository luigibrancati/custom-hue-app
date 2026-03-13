package io.flutter.plugins.googlemaps;

import U6.C2279f;
import U6.C2292t;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
interface PolylineOptionsSink {
    void setColor(int i10);

    void setConsumeTapEvents(boolean z10);

    void setEndCap(C2279f c2279f);

    void setGeodesic(boolean z10);

    void setJointType(int i10);

    void setPattern(List<C2292t> list);

    void setPoints(List<LatLng> list);

    void setStartCap(C2279f c2279f);

    void setVisible(boolean z10);

    void setWidth(float f10);

    void setZIndex(float f10);
}
