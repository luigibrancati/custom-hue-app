package io.flutter.plugins.googlemaps;

import S6.C2197c;
import U6.C2297y;
import U6.C2298z;
import android.content.res.AssetManager;
import io.flutter.plugins.googlemaps.Messages;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class PolylinesController {
    private final AssetManager assetManager;
    private final float density;
    private final Messages.MapsCallbackApi flutterApi;
    private C2197c googleMap;
    private final Map<String, PolylineController> polylineIdToController = new HashMap();
    private final Map<String, String> googleMapsPolylineIdToDartPolylineId = new HashMap();

    public PolylinesController(Messages.MapsCallbackApi mapsCallbackApi, AssetManager assetManager, float f10) {
        this.assetManager = assetManager;
        this.flutterApi = mapsCallbackApi;
        this.density = f10;
    }

    private void addPolyline(Messages.PlatformPolyline platformPolyline) {
        PolylineBuilder polylineBuilder = new PolylineBuilder(this.density);
        addPolyline(Convert.interpretPolylineOptions(platformPolyline, polylineBuilder, this.assetManager, this.density), polylineBuilder.build(), polylineBuilder.consumeTapEvents());
    }

    private void changePolyline(Messages.PlatformPolyline platformPolyline) {
        PolylineController polylineController = this.polylineIdToController.get(platformPolyline.getPolylineId());
        if (polylineController != null) {
            Convert.interpretPolylineOptions(platformPolyline, polylineController, this.assetManager, this.density);
        }
    }

    private static String getPolylineId(Map<String, ?> map) {
        return (String) map.get("polylineId");
    }

    public void addPolylines(List<Messages.PlatformPolyline> list) {
        Iterator<Messages.PlatformPolyline> it = list.iterator();
        while (it.hasNext()) {
            addPolyline(it.next());
        }
    }

    public void changePolylines(List<Messages.PlatformPolyline> list) {
        Iterator<Messages.PlatformPolyline> it = list.iterator();
        while (it.hasNext()) {
            changePolyline(it.next());
        }
    }

    public boolean onPolylineTap(String str) {
        String str2 = this.googleMapsPolylineIdToDartPolylineId.get(str);
        if (str2 == null) {
            return false;
        }
        this.flutterApi.onPolylineTap(str2, new NoOpVoidResult());
        PolylineController polylineController = this.polylineIdToController.get(str2);
        if (polylineController != null) {
            return polylineController.consumeTapEvents();
        }
        return false;
    }

    public void removePolylines(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            PolylineController polylineControllerRemove = this.polylineIdToController.remove(it.next());
            if (polylineControllerRemove != null) {
                polylineControllerRemove.remove();
                this.googleMapsPolylineIdToDartPolylineId.remove(polylineControllerRemove.getGoogleMapsPolylineId());
            }
        }
    }

    public void setGoogleMap(C2197c c2197c) {
        this.googleMap = c2197c;
    }

    private void addPolyline(String str, C2298z c2298z, boolean z10) {
        C2297y c2297yE = this.googleMap.e(c2298z);
        this.polylineIdToController.put(str, new PolylineController(c2297yE, z10, this.density));
        this.googleMapsPolylineIdToDartPolylineId.put(c2297yE.a(), str);
    }
}
