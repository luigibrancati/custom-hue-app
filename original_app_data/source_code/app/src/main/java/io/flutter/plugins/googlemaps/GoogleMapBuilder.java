package io.flutter.plugins.googlemaps;

import android.content.Context;
import android.graphics.Rect;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugins.googlemaps.Messages;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class GoogleMapBuilder implements GoogleMapOptionsSink {
    private List<Messages.PlatformCircle> initialCircles;
    private List<Messages.PlatformClusterManager> initialClusterManagers;
    private List<Messages.PlatformGroundOverlay> initialGroundOverlays;
    private List<Messages.PlatformHeatmap> initialHeatmaps;
    private List<Messages.PlatformMarker> initialMarkers;
    private List<Messages.PlatformPolygon> initialPolygons;
    private List<Messages.PlatformPolyline> initialPolylines;
    private List<Messages.PlatformTileOverlay> initialTileOverlays;
    private String style;
    private final GoogleMapOptions options = new GoogleMapOptions();
    private boolean trackCameraPosition = false;
    private boolean myLocationEnabled = false;
    private boolean myLocationButtonEnabled = false;
    private boolean indoorEnabled = true;
    private boolean trafficEnabled = false;
    private boolean buildingsEnabled = true;
    private Rect padding = new Rect(0, 0, 0, 0);

    public GoogleMapController build(int i10, Context context, BinaryMessenger binaryMessenger, LifecycleProvider lifecycleProvider, Messages.PlatformMarkerType platformMarkerType) {
        GoogleMapController googleMapController = new GoogleMapController(i10, context, binaryMessenger, lifecycleProvider, this.options, platformMarkerType);
        googleMapController.init();
        googleMapController.setMyLocationEnabled(this.myLocationEnabled);
        googleMapController.setMyLocationButtonEnabled(this.myLocationButtonEnabled);
        googleMapController.setIndoorEnabled(this.indoorEnabled);
        googleMapController.setTrafficEnabled(this.trafficEnabled);
        googleMapController.setBuildingsEnabled(this.buildingsEnabled);
        googleMapController.setTrackCameraPosition(this.trackCameraPosition);
        googleMapController.setInitialClusterManagers(this.initialClusterManagers);
        googleMapController.setInitialMarkers(this.initialMarkers);
        googleMapController.setInitialPolygons(this.initialPolygons);
        googleMapController.setInitialPolylines(this.initialPolylines);
        googleMapController.setInitialCircles(this.initialCircles);
        googleMapController.setInitialHeatmaps(this.initialHeatmaps);
        Rect rect = this.padding;
        googleMapController.setPadding(rect.top, rect.left, rect.bottom, rect.right);
        googleMapController.setInitialTileOverlays(this.initialTileOverlays);
        googleMapController.setInitialGroundOverlays(this.initialGroundOverlays);
        googleMapController.setMapStyle(this.style);
        return googleMapController;
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setBuildingsEnabled(boolean z10) {
        this.buildingsEnabled = z10;
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setCameraTargetBounds(LatLngBounds latLngBounds) {
        this.options.x(latLngBounds);
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setCompassEnabled(boolean z10) {
        this.options.e(z10);
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setIndoorEnabled(boolean z10) {
        this.indoorEnabled = z10;
    }

    public void setInitialCameraPosition(CameraPosition cameraPosition) {
        this.options.d(cameraPosition);
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setInitialCircles(List<Messages.PlatformCircle> list) {
        this.initialCircles = list;
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setInitialClusterManagers(List<Messages.PlatformClusterManager> list) {
        this.initialClusterManagers = list;
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setInitialGroundOverlays(List<Messages.PlatformGroundOverlay> list) {
        this.initialGroundOverlays = list;
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setInitialHeatmaps(List<Messages.PlatformHeatmap> list) {
        this.initialHeatmaps = list;
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setInitialMarkers(List<Messages.PlatformMarker> list) {
        this.initialMarkers = list;
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setInitialPolygons(List<Messages.PlatformPolygon> list) {
        this.initialPolygons = list;
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setInitialPolylines(List<Messages.PlatformPolyline> list) {
        this.initialPolylines = list;
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setInitialTileOverlays(List<Messages.PlatformTileOverlay> list) {
        this.initialTileOverlays = list;
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setLiteModeEnabled(boolean z10) {
        this.options.y(z10);
    }

    public void setMapId(String str) {
        this.options.z(str);
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setMapStyle(String str) {
        this.style = str;
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setMapToolbarEnabled(boolean z10) {
        this.options.A(z10);
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setMapType(int i10) {
        this.options.B(i10);
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setMinMaxZoomPreference(Float f10, Float f11) {
        if (f10 != null) {
            this.options.H(f10.floatValue());
        }
        if (f11 != null) {
            this.options.E(f11.floatValue());
        }
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setMyLocationButtonEnabled(boolean z10) {
        this.myLocationButtonEnabled = z10;
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setMyLocationEnabled(boolean z10) {
        this.myLocationEnabled = z10;
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setPadding(float f10, float f11, float f12, float f13) {
        this.padding = new Rect((int) f11, (int) f10, (int) f13, (int) f12);
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setRotateGesturesEnabled(boolean z10) {
        this.options.I(z10);
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setScrollGesturesEnabled(boolean z10) {
        this.options.J(z10);
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setTiltGesturesEnabled(boolean z10) {
        this.options.L(z10);
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setTrackCameraPosition(boolean z10) {
        this.trackCameraPosition = z10;
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setTrafficEnabled(boolean z10) {
        this.trafficEnabled = z10;
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setZoomControlsEnabled(boolean z10) {
        this.options.M(z10);
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setZoomGesturesEnabled(boolean z10) {
        this.options.N(z10);
    }
}
