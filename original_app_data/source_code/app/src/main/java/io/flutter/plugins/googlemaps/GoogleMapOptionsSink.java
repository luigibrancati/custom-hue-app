package io.flutter.plugins.googlemaps;

import com.google.android.gms.maps.model.LatLngBounds;
import io.flutter.plugins.googlemaps.Messages;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
interface GoogleMapOptionsSink {
    void setBuildingsEnabled(boolean z10);

    void setCameraTargetBounds(LatLngBounds latLngBounds);

    void setCompassEnabled(boolean z10);

    void setIndoorEnabled(boolean z10);

    void setInitialCircles(List<Messages.PlatformCircle> list);

    void setInitialClusterManagers(List<Messages.PlatformClusterManager> list);

    void setInitialGroundOverlays(List<Messages.PlatformGroundOverlay> list);

    void setInitialHeatmaps(List<Messages.PlatformHeatmap> list);

    void setInitialMarkers(List<Messages.PlatformMarker> list);

    void setInitialPolygons(List<Messages.PlatformPolygon> list);

    void setInitialPolylines(List<Messages.PlatformPolyline> list);

    void setInitialTileOverlays(List<Messages.PlatformTileOverlay> list);

    void setLiteModeEnabled(boolean z10);

    void setMapStyle(String str);

    void setMapToolbarEnabled(boolean z10);

    void setMapType(int i10);

    void setMinMaxZoomPreference(Float f10, Float f11);

    void setMyLocationButtonEnabled(boolean z10);

    void setMyLocationEnabled(boolean z10);

    void setPadding(float f10, float f11, float f12, float f13);

    void setRotateGesturesEnabled(boolean z10);

    void setScrollGesturesEnabled(boolean z10);

    void setTiltGesturesEnabled(boolean z10);

    void setTrackCameraPosition(boolean z10);

    void setTrafficEnabled(boolean z10);

    void setZoomControlsEnabled(boolean z10);

    void setZoomGesturesEnabled(boolean z10);
}
