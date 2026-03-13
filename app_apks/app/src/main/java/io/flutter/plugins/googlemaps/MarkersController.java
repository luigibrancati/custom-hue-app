package io.flutter.plugins.googlemaps;

import H9.b;
import android.content.res.AssetManager;
import com.google.android.gms.maps.model.LatLng;
import io.flutter.plugins.googlemaps.Convert;
import io.flutter.plugins.googlemaps.Messages;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class MarkersController {
    private final AssetManager assetManager;
    private final Convert.BitmapDescriptorFactoryWrapper bitmapDescriptorFactoryWrapper;
    private final ClusterManagersController clusterManagersController;
    private final float density;
    private final Messages.MapsCallbackApi flutterApi;
    private b.a markerCollection;
    private Messages.PlatformMarkerType markerType;
    private final HashMap<String, MarkerBuilder> markerIdToMarkerBuilder = new HashMap<>();
    private final HashMap<String, MarkerController> markerIdToController = new HashMap<>();
    private final HashMap<String, String> googleMapsMarkerIdToDartMarkerId = new HashMap<>();

    public MarkersController(Messages.MapsCallbackApi mapsCallbackApi, ClusterManagersController clusterManagersController, AssetManager assetManager, float f10, Convert.BitmapDescriptorFactoryWrapper bitmapDescriptorFactoryWrapper, Messages.PlatformMarkerType platformMarkerType) {
        this.flutterApi = mapsCallbackApi;
        this.clusterManagersController = clusterManagersController;
        this.assetManager = assetManager;
        this.density = f10;
        this.bitmapDescriptorFactoryWrapper = bitmapDescriptorFactoryWrapper;
        this.markerType = platformMarkerType;
    }

    private void addMarker(Messages.PlatformMarker platformMarker) {
        MarkerBuilder markerBuilder = new MarkerBuilder(platformMarker.getMarkerId(), platformMarker.getClusterManagerId(), this.markerType);
        Convert.interpretMarkerOptions(platformMarker, markerBuilder, this.assetManager, this.density, this.bitmapDescriptorFactoryWrapper);
        addMarker(markerBuilder);
    }

    private void addMarkerBuilderForCluster(MarkerBuilder markerBuilder) {
        this.clusterManagersController.addItem(markerBuilder);
    }

    private void addMarkerToCollection(String str, MarkerBuilder markerBuilder) {
        createControllerForMarker(str, this.markerCollection.j(markerBuilder.build()), markerBuilder.consumeTapEvents());
    }

    private void changeMarker(Messages.PlatformMarker platformMarker) {
        String markerId = platformMarker.getMarkerId();
        MarkerBuilder markerBuilder = this.markerIdToMarkerBuilder.get(markerId);
        if (markerBuilder == null) {
            return;
        }
        if (!Objects.equals(platformMarker.getClusterManagerId(), markerBuilder.clusterManagerId())) {
            removeMarker(markerId);
            addMarker(platformMarker);
            return;
        }
        Convert.interpretMarkerOptions(platformMarker, markerBuilder, this.assetManager, this.density, this.bitmapDescriptorFactoryWrapper);
        MarkerController markerController = this.markerIdToController.get(markerId);
        if (markerController != null) {
            Convert.interpretMarkerOptions(platformMarker, markerController, this.assetManager, this.density, this.bitmapDescriptorFactoryWrapper);
        }
    }

    private void createControllerForMarker(String str, U6.r rVar, boolean z10) {
        this.markerIdToController.put(str, new MarkerController(rVar, z10));
        this.googleMapsMarkerIdToDartMarkerId.put(rVar.a(), str);
    }

    private void removeMarker(String str) {
        b.a aVar;
        MarkerBuilder markerBuilderRemove = this.markerIdToMarkerBuilder.remove(str);
        if (markerBuilderRemove == null) {
            return;
        }
        MarkerController markerControllerRemove = this.markerIdToController.remove(str);
        if (markerBuilderRemove.clusterManagerId() != null) {
            this.clusterManagersController.removeItem(markerBuilderRemove);
        } else if (markerControllerRemove != null && (aVar = this.markerCollection) != null) {
            markerControllerRemove.removeFromCollection(aVar);
        }
        if (markerControllerRemove != null) {
            this.googleMapsMarkerIdToDartMarkerId.remove(markerControllerRemove.getGoogleMapsMarkerId());
        }
    }

    public void addMarkers(List<Messages.PlatformMarker> list) {
        Iterator<Messages.PlatformMarker> it = list.iterator();
        while (it.hasNext()) {
            addMarker(it.next());
        }
    }

    public void changeMarkers(List<Messages.PlatformMarker> list) {
        Iterator<Messages.PlatformMarker> it = list.iterator();
        while (it.hasNext()) {
            changeMarker(it.next());
        }
    }

    public void hideMarkerInfoWindow(String str) {
        MarkerController markerController = this.markerIdToController.get(str);
        if (markerController == null) {
            throw new Messages.FlutterError("Invalid markerId", "hideInfoWindow called with invalid markerId", null);
        }
        markerController.hideInfoWindow();
    }

    public boolean isInfoWindowShown(String str) {
        MarkerController markerController = this.markerIdToController.get(str);
        if (markerController != null) {
            return markerController.isInfoWindowShown();
        }
        throw new Messages.FlutterError("Invalid markerId", "isInfoWindowShown called with invalid markerId", null);
    }

    public void onClusterItemRendered(MarkerBuilder markerBuilder, U6.r rVar) {
        if (this.markerIdToMarkerBuilder.get(markerBuilder.markerId()) == markerBuilder) {
            createControllerForMarker(markerBuilder.markerId(), rVar, markerBuilder.consumeTapEvents());
        }
    }

    public void onInfoWindowTap(String str) {
        String str2 = this.googleMapsMarkerIdToDartMarkerId.get(str);
        if (str2 == null) {
            return;
        }
        this.flutterApi.onInfoWindowTap(str2, new NoOpVoidResult());
    }

    public boolean onMapsMarkerTap(String str) {
        String str2 = this.googleMapsMarkerIdToDartMarkerId.get(str);
        if (str2 == null) {
            return false;
        }
        return onMarkerTap(str2);
    }

    public void onMarkerDrag(String str, LatLng latLng) {
        String str2 = this.googleMapsMarkerIdToDartMarkerId.get(str);
        if (str2 == null) {
            return;
        }
        this.flutterApi.onMarkerDrag(str2, Convert.latLngToPigeon(latLng), new NoOpVoidResult());
    }

    public void onMarkerDragEnd(String str, LatLng latLng) {
        String str2 = this.googleMapsMarkerIdToDartMarkerId.get(str);
        if (str2 == null) {
            return;
        }
        this.flutterApi.onMarkerDragEnd(str2, Convert.latLngToPigeon(latLng), new NoOpVoidResult());
    }

    public void onMarkerDragStart(String str, LatLng latLng) {
        String str2 = this.googleMapsMarkerIdToDartMarkerId.get(str);
        if (str2 == null) {
            return;
        }
        this.flutterApi.onMarkerDragStart(str2, Convert.latLngToPigeon(latLng), new NoOpVoidResult());
    }

    public boolean onMarkerTap(String str) {
        this.flutterApi.onMarkerTap(str, new NoOpVoidResult());
        MarkerController markerController = this.markerIdToController.get(str);
        if (markerController != null) {
            return markerController.consumeTapEvents();
        }
        return false;
    }

    public void removeMarkers(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            removeMarker(it.next());
        }
    }

    public void setCollection(b.a aVar) {
        this.markerCollection = aVar;
    }

    public void showMarkerInfoWindow(String str) {
        MarkerController markerController = this.markerIdToController.get(str);
        if (markerController == null) {
            throw new Messages.FlutterError("Invalid markerId", "showInfoWindow called with invalid markerId", null);
        }
        markerController.showInfoWindow();
    }

    private void addMarker(MarkerBuilder markerBuilder) {
        if (markerBuilder == null) {
            return;
        }
        String strMarkerId = markerBuilder.markerId();
        this.markerIdToMarkerBuilder.put(strMarkerId, markerBuilder);
        if (markerBuilder.clusterManagerId() == null) {
            addMarkerToCollection(strMarkerId, markerBuilder);
        } else {
            addMarkerBuilderForCluster(markerBuilder);
        }
    }
}
