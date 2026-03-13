package io.flutter.plugins.googlemaps;

import E9.c;
import H9.b;
import S6.C2195a;
import S6.C2197c;
import S6.C2198d;
import U6.C2280g;
import U6.C2287n;
import U6.C2290q;
import U6.C2295w;
import U6.C2297y;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC2754j;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC2758n;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugins.googlemaps.ClusterManagersController;
import io.flutter.plugins.googlemaps.Convert;
import io.flutter.plugins.googlemaps.Messages;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class GoogleMapController implements ActivityPluginBinding.OnSaveInstanceStateListener, c.e, ClusterManagersController.OnClusterItemRendered<MarkerBuilder>, DefaultLifecycleObserver, GoogleMapListener, GoogleMapOptionsSink, Messages.MapsApi, Messages.MapsInspectorApi, S6.g, PlatformView {
    private static final String TAG = "GoogleMapController";
    private final BinaryMessenger binaryMessenger;
    private final CirclesController circlesController;
    private final ClusterManagersController clusterManagersController;
    private final Context context;
    final float density;
    private final Messages.MapsCallbackApi flutterApi;
    private C2197c googleMap;
    private final GroundOverlaysController groundOverlaysController;
    private final HeatmapsController heatmapsController;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f37843id;
    private List<Messages.PlatformCircle> initialCircles;
    private List<Messages.PlatformClusterManager> initialClusterManagers;
    private List<Messages.PlatformGroundOverlay> initialGroundOverlays;
    private List<Messages.PlatformHeatmap> initialHeatmaps;
    private String initialMapStyle;
    private List<Messages.PlatformMarker> initialMarkers;
    List<Float> initialPadding;
    private List<Messages.PlatformPolygon> initialPolygons;
    private List<Messages.PlatformPolyline> initialPolylines;
    private List<Messages.PlatformTileOverlay> initialTileOverlays;
    private boolean lastSetStyleSucceeded;
    private final LifecycleProvider lifecycleProvider;
    private Messages.VoidResult mapReadyResult;
    private C2198d mapView;
    private b.a markerCollection;
    private H9.b markerManager;
    private final MarkersController markersController;
    private final GoogleMapOptions options;
    private final PolygonsController polygonsController;
    private final PolylinesController polylinesController;
    private final TileOverlaysController tileOverlaysController;
    private boolean trackCameraPosition = false;
    private boolean myLocationEnabled = false;
    private boolean myLocationButtonEnabled = false;
    private boolean zoomControlsEnabled = true;
    private boolean indoorEnabled = true;
    private boolean trafficEnabled = false;
    private boolean buildingsEnabled = true;
    private boolean disposed = false;

    public GoogleMapController(int i10, Context context, BinaryMessenger binaryMessenger, LifecycleProvider lifecycleProvider, GoogleMapOptions googleMapOptions, Messages.PlatformMarkerType platformMarkerType) {
        this.f37843id = i10;
        this.context = context;
        this.options = googleMapOptions;
        this.mapView = new C2198d(context, googleMapOptions);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.density = f10;
        this.binaryMessenger = binaryMessenger;
        Messages.MapsCallbackApi mapsCallbackApi = new Messages.MapsCallbackApi(binaryMessenger, Integer.toString(i10));
        this.flutterApi = mapsCallbackApi;
        Messages.MapsApi.setUp(binaryMessenger, Integer.toString(i10), this);
        Messages.MapsInspectorApi.setUp(binaryMessenger, Integer.toString(i10), this);
        AssetManager assets = context.getAssets();
        this.lifecycleProvider = lifecycleProvider;
        ClusterManagersController clusterManagersController = new ClusterManagersController(mapsCallbackApi, context, platformMarkerType);
        this.clusterManagersController = clusterManagersController;
        this.markersController = new MarkersController(mapsCallbackApi, clusterManagersController, assets, f10, new Convert.BitmapDescriptorFactoryWrapper(), platformMarkerType);
        this.polygonsController = new PolygonsController(mapsCallbackApi, f10);
        this.polylinesController = new PolylinesController(mapsCallbackApi, assets, f10);
        this.circlesController = new CirclesController(mapsCallbackApi, f10);
        this.heatmapsController = new HeatmapsController();
        this.tileOverlaysController = new TileOverlaysController(mapsCallbackApi);
        this.groundOverlaysController = new GroundOverlaysController(mapsCallbackApi, assets, f10);
    }

    public static /* synthetic */ void P(Messages.Result result, Bitmap bitmap) {
        if (bitmap == null) {
            result.error(new Messages.FlutterError("Snapshot failure", "Unable to take snapshot", null));
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        bitmap.recycle();
        result.success(byteArray);
    }

    private int checkSelfPermission(String str) {
        if (str != null) {
            return this.context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    private void destroyMapViewIfNecessary() {
        C2198d c2198d = this.mapView;
        if (c2198d == null) {
            return;
        }
        c2198d.c();
        this.mapView = null;
    }

    private static TextureView findTextureView(ViewGroup viewGroup) {
        TextureView textureViewFindTextureView;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof TextureView) {
                return (TextureView) childAt;
            }
            if ((childAt instanceof ViewGroup) && (textureViewFindTextureView = findTextureView((ViewGroup) childAt)) != null) {
                return textureViewFindTextureView;
            }
        }
        return null;
    }

    private boolean hasLocationPermission() {
        return checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0 || checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    private void installInvalidator() {
        C2198d c2198d = this.mapView;
        if (c2198d == null) {
            return;
        }
        TextureView textureViewFindTextureView = findTextureView(c2198d);
        if (textureViewFindTextureView == null) {
            Log.i(TAG, "No TextureView found. Likely using the LEGACY renderer.");
            return;
        }
        Log.i(TAG, "Installing custom TextureView driven invalidator.");
        final TextureView.SurfaceTextureListener surfaceTextureListener = textureViewFindTextureView.getSurfaceTextureListener();
        final C2198d c2198d2 = this.mapView;
        textureViewFindTextureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: io.flutter.plugins.googlemaps.GoogleMapController.1
            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
                TextureView.SurfaceTextureListener surfaceTextureListener2 = surfaceTextureListener;
                if (surfaceTextureListener2 != null) {
                    surfaceTextureListener2.onSurfaceTextureAvailable(surfaceTexture, i10, i11);
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                TextureView.SurfaceTextureListener surfaceTextureListener2 = surfaceTextureListener;
                if (surfaceTextureListener2 != null) {
                    return surfaceTextureListener2.onSurfaceTextureDestroyed(surfaceTexture);
                }
                return true;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
                TextureView.SurfaceTextureListener surfaceTextureListener2 = surfaceTextureListener;
                if (surfaceTextureListener2 != null) {
                    surfaceTextureListener2.onSurfaceTextureSizeChanged(surfaceTexture, i10, i11);
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                TextureView.SurfaceTextureListener surfaceTextureListener2 = surfaceTextureListener;
                if (surfaceTextureListener2 != null) {
                    surfaceTextureListener2.onSurfaceTextureUpdated(surfaceTexture);
                }
                c2198d2.invalidate();
            }
        });
    }

    private void setGoogleMapListener(GoogleMapListener googleMapListener) {
        C2197c c2197c = this.googleMap;
        if (c2197c == null) {
            Log.v(TAG, "Controller was disposed before GoogleMap was ready.");
            return;
        }
        c2197c.D(googleMapListener);
        this.googleMap.C(googleMapListener);
        this.googleMap.B(googleMapListener);
        this.googleMap.M(googleMapListener);
        this.googleMap.N(googleMapListener);
        this.googleMap.E(googleMapListener);
        this.googleMap.I(googleMapListener);
        this.googleMap.J(googleMapListener);
        this.googleMap.F(googleMapListener);
    }

    private void updateInitialCircles() {
        List<Messages.PlatformCircle> list = this.initialCircles;
        if (list != null) {
            this.circlesController.addCircles(list);
        }
    }

    private void updateInitialClusterManagers() {
        List<Messages.PlatformClusterManager> list = this.initialClusterManagers;
        if (list != null) {
            this.clusterManagersController.addClusterManagers(list);
        }
    }

    private void updateInitialGroundOverlays() {
        List<Messages.PlatformGroundOverlay> list = this.initialGroundOverlays;
        if (list != null) {
            this.groundOverlaysController.addGroundOverlays(list);
        }
    }

    private void updateInitialHeatmaps() {
        List<Messages.PlatformHeatmap> list = this.initialHeatmaps;
        if (list != null) {
            this.heatmapsController.addHeatmaps(list);
        }
    }

    private void updateInitialMarkers() {
        List<Messages.PlatformMarker> list = this.initialMarkers;
        if (list != null) {
            this.markersController.addMarkers(list);
        }
    }

    private void updateInitialPolygons() {
        List<Messages.PlatformPolygon> list = this.initialPolygons;
        if (list != null) {
            this.polygonsController.addPolygons(list);
        }
    }

    private void updateInitialPolylines() {
        List<Messages.PlatformPolyline> list = this.initialPolylines;
        if (list != null) {
            this.polylinesController.addPolylines(list);
        }
    }

    private void updateInitialTileOverlays() {
        List<Messages.PlatformTileOverlay> list = this.initialTileOverlays;
        if (list != null) {
            this.tileOverlaysController.addTileOverlays(list);
        }
    }

    private boolean updateMapStyle(String str) {
        C2290q c2290q = (str == null || str.isEmpty()) ? null : new C2290q(str);
        C2197c c2197c = this.googleMap;
        Objects.requireNonNull(c2197c);
        boolean zW = c2197c.w(c2290q);
        this.lastSetStyleSucceeded = zW;
        return zW;
    }

    @SuppressLint({"MissingPermission"})
    private void updateMyLocationSettings() {
        if (!hasLocationPermission()) {
            Log.e(TAG, "Cannot enable MyLocation layer as location permissions are not granted");
        } else {
            this.googleMap.A(this.myLocationEnabled);
            this.googleMap.n().k(this.myLocationButtonEnabled);
        }
    }

    @Override // io.flutter.plugins.googlemaps.Messages.MapsApi
    public void animateCamera(Messages.PlatformCameraUpdate platformCameraUpdate, Long l10) {
        if (this.googleMap == null) {
            throw new Messages.FlutterError("GoogleMap uninitialized", "animateCamera called prior to map initialization", null);
        }
        C2195a c2195aCameraUpdateFromPigeon = Convert.cameraUpdateFromPigeon(platformCameraUpdate, this.density);
        if (l10 != null) {
            this.googleMap.h(c2195aCameraUpdateFromPigeon, l10.intValue(), null);
        } else {
            this.googleMap.g(c2195aCameraUpdateFromPigeon);
        }
    }

    @Override // io.flutter.plugins.googlemaps.Messages.MapsInspectorApi
    public Boolean areBuildingsEnabled() {
        C2197c c2197c = this.googleMap;
        Objects.requireNonNull(c2197c);
        return Boolean.valueOf(c2197c.o());
    }

    @Override // io.flutter.plugins.googlemaps.Messages.MapsInspectorApi
    public Boolean areRotateGesturesEnabled() {
        C2197c c2197c = this.googleMap;
        Objects.requireNonNull(c2197c);
        return Boolean.valueOf(c2197c.n().d());
    }

    @Override // io.flutter.plugins.googlemaps.Messages.MapsInspectorApi
    public Boolean areScrollGesturesEnabled() {
        C2197c c2197c = this.googleMap;
        Objects.requireNonNull(c2197c);
        return Boolean.valueOf(c2197c.n().e());
    }

    @Override // io.flutter.plugins.googlemaps.Messages.MapsInspectorApi
    public Boolean areTiltGesturesEnabled() {
        C2197c c2197c = this.googleMap;
        Objects.requireNonNull(c2197c);
        return Boolean.valueOf(c2197c.n().f());
    }

    @Override // io.flutter.plugins.googlemaps.Messages.MapsInspectorApi
    public Boolean areZoomControlsEnabled() {
        C2197c c2197c = this.googleMap;
        Objects.requireNonNull(c2197c);
        return Boolean.valueOf(c2197c.n().g());
    }

    @Override // io.flutter.plugins.googlemaps.Messages.MapsInspectorApi
    public Boolean areZoomGesturesEnabled() {
        C2197c c2197c = this.googleMap;
        Objects.requireNonNull(c2197c);
        return Boolean.valueOf(c2197c.n().h());
    }

    @Override // io.flutter.plugins.googlemaps.Messages.MapsApi
    public void clearTileCache(String str) {
        this.tileOverlaysController.clearTileCache(str);
    }

    @Override // io.flutter.plugins.googlemaps.Messages.MapsApi
    public Boolean didLastStyleSucceed() {
        return Boolean.valueOf(this.lastSetStyleSucceeded);
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void dispose() {
        if (this.disposed) {
            return;
        }
        this.disposed = true;
        Messages.MapsApi.setUp(this.binaryMessenger, Integer.toString(this.f37843id), null);
        Messages.MapsInspectorApi.setUp(this.binaryMessenger, Integer.toString(this.f37843id), null);
        setGoogleMapListener(null);
        setMarkerCollectionListener(null);
        setClusterItemClickListener(null);
        setClusterItemRenderedListener(null);
        destroyMapViewIfNecessary();
        AbstractC2754j lifecycle = this.lifecycleProvider.getLifecycle();
        if (lifecycle != null) {
            lifecycle.c(this);
        }
    }

    @Override // io.flutter.plugins.googlemaps.Messages.MapsInspectorApi
    public Messages.PlatformCameraPosition getCameraPosition() {
        C2197c c2197c = this.googleMap;
        Objects.requireNonNull(c2197c);
        return Convert.cameraPositionToPigeon(c2197c.i());
    }

    @Override // io.flutter.plugins.googlemaps.Messages.MapsInspectorApi
    public List<Messages.PlatformCluster> getClusters(String str) {
        Set<? extends E9.a> clustersWithClusterManagerId = this.clusterManagersController.getClustersWithClusterManagerId(str);
        ArrayList arrayList = new ArrayList(clustersWithClusterManagerId.size());
        Iterator<? extends E9.a> it = clustersWithClusterManagerId.iterator();
        while (it.hasNext()) {
            arrayList.add(Convert.clusterToPigeon(str, it.next()));
        }
        return arrayList;
    }

    @Override // io.flutter.plugins.googlemaps.Messages.MapsInspectorApi
    public Messages.PlatformGroundOverlay getGroundOverlayInfo(String str) {
        C2287n groundOverlay = this.groundOverlaysController.getGroundOverlay(str);
        if (groundOverlay == null) {
            return null;
        }
        return Convert.groundOverlayToPigeon(groundOverlay, str, this.groundOverlaysController.isCreatedWithBounds(str));
    }

    @Override // io.flutter.plugins.googlemaps.Messages.MapsApi
    public Messages.PlatformLatLng getLatLng(Messages.PlatformPoint platformPoint) {
        C2197c c2197c = this.googleMap;
        if (c2197c != null) {
            return Convert.latLngToPigeon(c2197c.m().a(Convert.pointFromPigeon(platformPoint)));
        }
        throw new Messages.FlutterError("GoogleMap uninitialized", "getLatLng called prior to map initialization", null);
    }

    @Override // io.flutter.plugins.googlemaps.Messages.MapsApi
    public Messages.PlatformPoint getScreenCoordinate(Messages.PlatformLatLng platformLatLng) {
        C2197c c2197c = this.googleMap;
        if (c2197c != null) {
            return Convert.pointToPigeon(c2197c.m().c(Convert.latLngFromPigeon(platformLatLng)));
        }
        throw new Messages.FlutterError("GoogleMap uninitialized", "getScreenCoordinate called prior to map initialization", null);
    }

    @Override // io.flutter.plugins.googlemaps.Messages.MapsInspectorApi
    public Messages.PlatformTileLayer getTileOverlayInfo(String str) {
        U6.J tileOverlay = this.tileOverlaysController.getTileOverlay(str);
        if (tileOverlay == null) {
            return null;
        }
        return new Messages.PlatformTileLayer.Builder().setFadeIn(Boolean.valueOf(tileOverlay.b())).setTransparency(Double.valueOf(tileOverlay.c())).setZIndex(Double.valueOf(tileOverlay.d())).setVisible(Boolean.valueOf(tileOverlay.e())).build();
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public View getView() {
        return this.mapView;
    }

    @Override // io.flutter.plugins.googlemaps.Messages.MapsApi
    public Messages.PlatformLatLngBounds getVisibleRegion() {
        C2197c c2197c = this.googleMap;
        if (c2197c != null) {
            return Convert.latLngBoundsToPigeon(c2197c.m().b().f16663e);
        }
        throw new Messages.FlutterError("GoogleMap uninitialized", "getVisibleRegion called prior to map initialization", null);
    }

    @Override // io.flutter.plugins.googlemaps.Messages.MapsApi
    public Double getZoomLevel() {
        if (this.googleMap != null) {
            return Double.valueOf(r3.i().f30343b);
        }
        throw new Messages.FlutterError("GoogleMap uninitialized", "getZoomLevel called prior to map initialization", null);
    }

    @Override // io.flutter.plugins.googlemaps.Messages.MapsInspectorApi
    public Messages.PlatformZoomRange getZoomRange() {
        Messages.PlatformZoomRange.Builder builder = new Messages.PlatformZoomRange.Builder();
        Objects.requireNonNull(this.googleMap);
        Messages.PlatformZoomRange.Builder min = builder.setMin(Double.valueOf(r1.l()));
        Objects.requireNonNull(this.googleMap);
        return min.setMax(Double.valueOf(r3.k())).build();
    }

    @Override // io.flutter.plugins.googlemaps.Messages.MapsApi
    public void hideInfoWindow(String str) {
        this.markersController.hideMarkerInfoWindow(str);
    }

    public void init() {
        this.lifecycleProvider.getLifecycle().a(this);
        this.mapView.a(this);
    }

    @Override // io.flutter.plugins.googlemaps.Messages.MapsApi
    public Boolean isAdvancedMarkersAvailable() {
        C2197c c2197c = this.googleMap;
        if (c2197c != null) {
            return Boolean.valueOf(c2197c.j().a());
        }
        throw new Messages.FlutterError("GoogleMap uninitialized", "isAdvancedMarkersAvailable() called prior to map initialization", null);
    }

    @Override // io.flutter.plugins.googlemaps.Messages.MapsInspectorApi
    public Boolean isCompassEnabled() {
        C2197c c2197c = this.googleMap;
        Objects.requireNonNull(c2197c);
        return Boolean.valueOf(c2197c.n().a());
    }

    @Override // io.flutter.plugins.googlemaps.Messages.MapsApi
    public Boolean isInfoWindowShown(String str) {
        return Boolean.valueOf(this.markersController.isInfoWindowShown(str));
    }

    @Override // io.flutter.plugins.googlemaps.Messages.MapsInspectorApi
    public Boolean isLiteModeEnabled() {
        return this.options.l();
    }

    @Override // io.flutter.plugins.googlemaps.Messages.MapsInspectorApi
    public Boolean isMapToolbarEnabled() {
        C2197c c2197c = this.googleMap;
        Objects.requireNonNull(c2197c);
        return Boolean.valueOf(c2197c.n().b());
    }

    @Override // io.flutter.plugins.googlemaps.Messages.MapsInspectorApi
    public Boolean isMyLocationButtonEnabled() {
        C2197c c2197c = this.googleMap;
        Objects.requireNonNull(c2197c);
        return Boolean.valueOf(c2197c.n().c());
    }

    @Override // io.flutter.plugins.googlemaps.Messages.MapsInspectorApi
    public Boolean isTrafficEnabled() {
        C2197c c2197c = this.googleMap;
        Objects.requireNonNull(c2197c);
        return Boolean.valueOf(c2197c.p());
    }

    @Override // io.flutter.plugins.googlemaps.Messages.MapsApi
    public void moveCamera(Messages.PlatformCameraUpdate platformCameraUpdate) {
        C2197c c2197c = this.googleMap;
        if (c2197c == null) {
            throw new Messages.FlutterError("GoogleMap uninitialized", "moveCamera called prior to map initialization", null);
        }
        c2197c.q(Convert.cameraUpdateFromPigeon(platformCameraUpdate, this.density));
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapListener, S6.C2197c.InterfaceC0186c
    public void onCameraIdle() {
        this.clusterManagersController.onCameraIdle();
        this.flutterApi.onCameraIdle(new NoOpVoidResult());
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapListener, S6.C2197c.d
    public void onCameraMove() {
        if (this.trackCameraPosition) {
            this.flutterApi.onCameraMove(Convert.cameraPositionToPigeon(this.googleMap.i()), new NoOpVoidResult());
        }
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapListener, S6.C2197c.e
    public void onCameraMoveStarted(int i10) {
        this.flutterApi.onCameraMoveStarted(new NoOpVoidResult());
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapListener, S6.C2197c.f
    public void onCircleClick(C2280g c2280g) {
        this.circlesController.onCircleTap(c2280g.a());
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(InterfaceC2758n interfaceC2758n) {
        if (this.disposed) {
            return;
        }
        this.mapView.b(null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(InterfaceC2758n interfaceC2758n) {
        interfaceC2758n.getLifecycle().c(this);
        if (this.disposed) {
            return;
        }
        destroyMapViewIfNecessary();
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapListener, S6.C2197c.g
    public void onGroundOverlayClick(C2287n c2287n) {
        this.groundOverlaysController.onGroundOverlayTap(c2287n.d());
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapListener, S6.C2197c.h
    public void onInfoWindowClick(U6.r rVar) {
        this.markersController.onInfoWindowTap(rVar.a());
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapListener, S6.C2197c.j
    public void onMapClick(LatLng latLng) {
        this.flutterApi.onTap(Convert.latLngToPigeon(latLng), new NoOpVoidResult());
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapListener, S6.C2197c.k
    public void onMapLongClick(LatLng latLng) {
        this.flutterApi.onLongPress(Convert.latLngToPigeon(latLng), new NoOpVoidResult());
    }

    @Override // S6.g
    public void onMapReady(C2197c c2197c) {
        this.googleMap = c2197c;
        c2197c.t(this.indoorEnabled);
        this.googleMap.P(this.trafficEnabled);
        this.googleMap.s(this.buildingsEnabled);
        installInvalidator();
        Messages.VoidResult voidResult = this.mapReadyResult;
        if (voidResult != null) {
            voidResult.success();
            this.mapReadyResult = null;
        }
        setGoogleMapListener(this);
        H9.b bVar = new H9.b(c2197c);
        this.markerManager = bVar;
        this.markerCollection = bVar.g();
        updateMyLocationSettings();
        this.markersController.setCollection(this.markerCollection);
        this.clusterManagersController.init(c2197c, this.markerManager);
        this.polygonsController.setGoogleMap(c2197c);
        this.polylinesController.setGoogleMap(c2197c);
        this.circlesController.setGoogleMap(c2197c);
        this.heatmapsController.setGoogleMap(c2197c);
        this.tileOverlaysController.setGoogleMap(c2197c);
        this.groundOverlaysController.setGoogleMap(c2197c);
        setMarkerCollectionListener(this);
        setClusterItemClickListener(this);
        setClusterItemRenderedListener(this);
        updateInitialClusterManagers();
        updateInitialMarkers();
        updateInitialPolygons();
        updateInitialPolylines();
        updateInitialCircles();
        updateInitialHeatmaps();
        updateInitialTileOverlays();
        updateInitialGroundOverlays();
        List<Float> list = this.initialPadding;
        if (list != null && list.size() == 4) {
            setPadding(this.initialPadding.get(0).floatValue(), this.initialPadding.get(1).floatValue(), this.initialPadding.get(2).floatValue(), this.initialPadding.get(3).floatValue());
        }
        String str = this.initialMapStyle;
        if (str != null) {
            updateMapStyle(str);
            this.initialMapStyle = null;
        }
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapListener, S6.C2197c.l
    public boolean onMarkerClick(U6.r rVar) {
        return this.markersController.onMapsMarkerTap(rVar.a());
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapListener, S6.C2197c.m
    public void onMarkerDrag(U6.r rVar) {
        this.markersController.onMarkerDrag(rVar.a(), rVar.b());
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapListener, S6.C2197c.m
    public void onMarkerDragEnd(U6.r rVar) {
        this.markersController.onMarkerDragEnd(rVar.a(), rVar.b());
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapListener, S6.C2197c.m
    public void onMarkerDragStart(U6.r rVar) {
        this.markersController.onMarkerDragStart(rVar.a(), rVar.b());
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(InterfaceC2758n interfaceC2758n) {
        if (this.disposed) {
            return;
        }
        this.mapView.e();
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapListener, S6.C2197c.n
    public void onPolygonClick(C2295w c2295w) {
        this.polygonsController.onPolygonTap(c2295w.a());
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapListener, S6.C2197c.o
    public void onPolylineClick(C2297y c2297y) {
        this.polylinesController.onPolylineTap(c2297y.a());
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding.OnSaveInstanceStateListener
    public void onRestoreInstanceState(Bundle bundle) {
        if (this.disposed) {
            return;
        }
        this.mapView.b(bundle);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(InterfaceC2758n interfaceC2758n) {
        if (this.disposed) {
            return;
        }
        this.mapView.e();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding.OnSaveInstanceStateListener
    public void onSaveInstanceState(Bundle bundle) {
        if (this.disposed) {
            return;
        }
        this.mapView.f(bundle);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(InterfaceC2758n interfaceC2758n) {
        if (this.disposed) {
            return;
        }
        this.mapView.g();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(InterfaceC2758n interfaceC2758n) {
        if (this.disposed) {
            return;
        }
        this.mapView.h();
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setBuildingsEnabled(boolean z10) {
        this.buildingsEnabled = z10;
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setCameraTargetBounds(LatLngBounds latLngBounds) {
        this.googleMap.v(latLngBounds);
    }

    public void setClusterItemClickListener(c.e eVar) {
        if (this.googleMap == null) {
            Log.v(TAG, "Controller was disposed before GoogleMap was ready.");
        } else {
            this.clusterManagersController.setClusterItemClickListener(eVar);
        }
    }

    public void setClusterItemRenderedListener(ClusterManagersController.OnClusterItemRendered<MarkerBuilder> onClusterItemRendered) {
        if (this.googleMap == null) {
            Log.v(TAG, "Controller was disposed before GoogleMap was ready.");
        } else {
            this.clusterManagersController.setClusterItemRenderedListener(onClusterItemRendered);
        }
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setCompassEnabled(boolean z10) {
        this.googleMap.n().i(z10);
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setIndoorEnabled(boolean z10) {
        this.indoorEnabled = z10;
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setInitialCircles(List<Messages.PlatformCircle> list) {
        this.initialCircles = list;
        if (this.googleMap != null) {
            updateInitialCircles();
        }
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setInitialClusterManagers(List<Messages.PlatformClusterManager> list) {
        this.initialClusterManagers = list;
        if (this.googleMap != null) {
            updateInitialClusterManagers();
        }
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setInitialGroundOverlays(List<Messages.PlatformGroundOverlay> list) {
        this.initialGroundOverlays = list;
        if (this.googleMap != null) {
            updateInitialGroundOverlays();
        }
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setInitialHeatmaps(List<Messages.PlatformHeatmap> list) {
        this.initialHeatmaps = list;
        if (this.googleMap != null) {
            updateInitialHeatmaps();
        }
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setInitialMarkers(List<Messages.PlatformMarker> list) {
        this.initialMarkers = list;
        if (this.googleMap != null) {
            updateInitialMarkers();
        }
    }

    public void setInitialPadding(float f10, float f11, float f12, float f13) {
        List<Float> list = this.initialPadding;
        if (list == null) {
            this.initialPadding = new ArrayList();
        } else {
            list.clear();
        }
        this.initialPadding.add(Float.valueOf(f10));
        this.initialPadding.add(Float.valueOf(f11));
        this.initialPadding.add(Float.valueOf(f12));
        this.initialPadding.add(Float.valueOf(f13));
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setInitialPolygons(List<Messages.PlatformPolygon> list) {
        this.initialPolygons = list;
        if (this.googleMap != null) {
            updateInitialPolygons();
        }
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setInitialPolylines(List<Messages.PlatformPolyline> list) {
        this.initialPolylines = list;
        if (this.googleMap != null) {
            updateInitialPolylines();
        }
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setInitialTileOverlays(List<Messages.PlatformTileOverlay> list) {
        this.initialTileOverlays = list;
        if (this.googleMap != null) {
            updateInitialTileOverlays();
        }
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setLiteModeEnabled(boolean z10) {
        this.options.y(z10);
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setMapStyle(String str) {
        if (this.googleMap == null) {
            this.initialMapStyle = str;
        } else {
            updateMapStyle(str);
        }
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setMapToolbarEnabled(boolean z10) {
        this.googleMap.n().j(z10);
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setMapType(int i10) {
        this.googleMap.x(i10);
    }

    public void setMarkerCollectionListener(GoogleMapListener googleMapListener) {
        if (this.googleMap == null) {
            Log.v(TAG, "Controller was disposed before GoogleMap was ready.");
            return;
        }
        this.markerCollection.n(googleMapListener);
        this.markerCollection.o(googleMapListener);
        this.markerCollection.l(googleMapListener);
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setMinMaxZoomPreference(Float f10, Float f11) {
        this.googleMap.r();
        if (f10 != null) {
            this.googleMap.z(f10.floatValue());
        }
        if (f11 != null) {
            this.googleMap.y(f11.floatValue());
        }
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setMyLocationButtonEnabled(boolean z10) {
        if (this.myLocationButtonEnabled == z10) {
            return;
        }
        this.myLocationButtonEnabled = z10;
        if (this.googleMap != null) {
            updateMyLocationSettings();
        }
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setMyLocationEnabled(boolean z10) {
        if (this.myLocationEnabled == z10) {
            return;
        }
        this.myLocationEnabled = z10;
        if (this.googleMap != null) {
            updateMyLocationSettings();
        }
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setPadding(float f10, float f11, float f12, float f13) {
        C2197c c2197c = this.googleMap;
        if (c2197c == null) {
            setInitialPadding(f10, f11, f12, f13);
        } else {
            float f14 = this.density;
            c2197c.O((int) (f11 * f14), (int) (f10 * f14), (int) (f13 * f14), (int) (f12 * f14));
        }
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setRotateGesturesEnabled(boolean z10) {
        this.googleMap.n().l(z10);
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setScrollGesturesEnabled(boolean z10) {
        this.googleMap.n().m(z10);
    }

    @Override // io.flutter.plugins.googlemaps.Messages.MapsApi
    public Boolean setStyle(String str) {
        return Boolean.valueOf(updateMapStyle(str));
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setTiltGesturesEnabled(boolean z10) {
        this.googleMap.n().n(z10);
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setTrackCameraPosition(boolean z10) {
        this.trackCameraPosition = z10;
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setTrafficEnabled(boolean z10) {
        this.trafficEnabled = z10;
        C2197c c2197c = this.googleMap;
        if (c2197c == null) {
            return;
        }
        c2197c.P(z10);
    }

    public void setView(C2198d c2198d) {
        this.mapView = c2198d;
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setZoomControlsEnabled(boolean z10) {
        if (this.zoomControlsEnabled == z10) {
            return;
        }
        this.zoomControlsEnabled = z10;
        C2197c c2197c = this.googleMap;
        if (c2197c != null) {
            c2197c.n().o(z10);
        }
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setZoomGesturesEnabled(boolean z10) {
        this.googleMap.n().p(z10);
    }

    @Override // io.flutter.plugins.googlemaps.Messages.MapsApi
    public void showInfoWindow(String str) {
        this.markersController.showMarkerInfoWindow(str);
    }

    @Override // io.flutter.plugins.googlemaps.Messages.MapsApi
    public void takeSnapshot(final Messages.Result<byte[]> result) {
        C2197c c2197c = this.googleMap;
        if (c2197c == null) {
            result.error(new Messages.FlutterError("GoogleMap uninitialized", "takeSnapshot", null));
        } else {
            c2197c.Q(new C2197c.p() { // from class: io.flutter.plugins.googlemaps.d
                @Override // S6.C2197c.p
                public final void a(Bitmap bitmap) {
                    GoogleMapController.P(result, bitmap);
                }
            });
        }
    }

    @Override // io.flutter.plugins.googlemaps.Messages.MapsApi
    public void updateCircles(List<Messages.PlatformCircle> list, List<Messages.PlatformCircle> list2, List<String> list3) {
        this.circlesController.addCircles(list);
        this.circlesController.changeCircles(list2);
        this.circlesController.removeCircles(list3);
    }

    @Override // io.flutter.plugins.googlemaps.Messages.MapsApi
    public void updateClusterManagers(List<Messages.PlatformClusterManager> list, List<String> list2) {
        this.clusterManagersController.addClusterManagers(list);
        this.clusterManagersController.removeClusterManagers(list2);
    }

    @Override // io.flutter.plugins.googlemaps.Messages.MapsApi
    public void updateGroundOverlays(List<Messages.PlatformGroundOverlay> list, List<Messages.PlatformGroundOverlay> list2, List<String> list3) {
        this.groundOverlaysController.addGroundOverlays(list);
        this.groundOverlaysController.changeGroundOverlays(list2);
        this.groundOverlaysController.removeGroundOverlays(list3);
    }

    @Override // io.flutter.plugins.googlemaps.Messages.MapsApi
    public void updateHeatmaps(List<Messages.PlatformHeatmap> list, List<Messages.PlatformHeatmap> list2, List<String> list3) {
        this.heatmapsController.addHeatmaps(list);
        this.heatmapsController.changeHeatmaps(list2);
        this.heatmapsController.removeHeatmaps(list3);
    }

    @Override // io.flutter.plugins.googlemaps.Messages.MapsApi
    public void updateMapConfiguration(Messages.PlatformMapConfiguration platformMapConfiguration) {
        Convert.interpretMapConfiguration(platformMapConfiguration, this);
    }

    @Override // io.flutter.plugins.googlemaps.Messages.MapsApi
    public void updateMarkers(List<Messages.PlatformMarker> list, List<Messages.PlatformMarker> list2, List<String> list3) {
        this.markersController.addMarkers(list);
        this.markersController.changeMarkers(list2);
        this.markersController.removeMarkers(list3);
    }

    @Override // io.flutter.plugins.googlemaps.Messages.MapsApi
    public void updatePolygons(List<Messages.PlatformPolygon> list, List<Messages.PlatformPolygon> list2, List<String> list3) {
        this.polygonsController.addPolygons(list);
        this.polygonsController.changePolygons(list2);
        this.polygonsController.removePolygons(list3);
    }

    @Override // io.flutter.plugins.googlemaps.Messages.MapsApi
    public void updatePolylines(List<Messages.PlatformPolyline> list, List<Messages.PlatformPolyline> list2, List<String> list3) {
        this.polylinesController.addPolylines(list);
        this.polylinesController.changePolylines(list2);
        this.polylinesController.removePolylines(list3);
    }

    @Override // io.flutter.plugins.googlemaps.Messages.MapsApi
    public void updateTileOverlays(List<Messages.PlatformTileOverlay> list, List<Messages.PlatformTileOverlay> list2, List<String> list3) {
        this.tileOverlaysController.addTileOverlays(list);
        this.tileOverlaysController.changeTileOverlays(list2);
        this.tileOverlaysController.removeTileOverlays(list3);
    }

    @Override // io.flutter.plugins.googlemaps.Messages.MapsApi
    public void waitForMap(Messages.VoidResult voidResult) {
        if (this.googleMap == null) {
            this.mapReadyResult = voidResult;
        } else {
            voidResult.success();
        }
    }

    @Override // E9.c.e
    public boolean onClusterItemClick(MarkerBuilder markerBuilder) {
        return this.markersController.onMarkerTap(markerBuilder.markerId());
    }

    @Override // io.flutter.plugins.googlemaps.ClusterManagersController.OnClusterItemRendered
    public void onClusterItemRendered(MarkerBuilder markerBuilder, U6.r rVar) {
        this.markersController.onClusterItemRendered(markerBuilder, rVar);
    }

    public GoogleMapController(int i10, Context context, BinaryMessenger binaryMessenger, Messages.MapsCallbackApi mapsCallbackApi, LifecycleProvider lifecycleProvider, GoogleMapOptions googleMapOptions, ClusterManagersController clusterManagersController, MarkersController markersController, PolygonsController polygonsController, PolylinesController polylinesController, CirclesController circlesController, HeatmapsController heatmapsController, TileOverlaysController tileOverlaysController, GroundOverlaysController groundOverlaysController) {
        this.f37843id = i10;
        this.context = context;
        this.binaryMessenger = binaryMessenger;
        this.flutterApi = mapsCallbackApi;
        this.options = googleMapOptions;
        this.mapView = new C2198d(context, googleMapOptions);
        this.density = context.getResources().getDisplayMetrics().density;
        this.lifecycleProvider = lifecycleProvider;
        this.clusterManagersController = clusterManagersController;
        this.markersController = markersController;
        this.polygonsController = polygonsController;
        this.polylinesController = polylinesController;
        this.circlesController = circlesController;
        this.heatmapsController = heatmapsController;
        this.tileOverlaysController = tileOverlaysController;
        this.groundOverlaysController = groundOverlaysController;
    }
}
