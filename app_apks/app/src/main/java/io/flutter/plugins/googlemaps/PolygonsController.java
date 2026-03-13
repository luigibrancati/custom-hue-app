package io.flutter.plugins.googlemaps;

import S6.C2197c;
import U6.C2295w;
import U6.C2296x;
import io.flutter.plugins.googlemaps.Messages;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class PolygonsController {
    private final float density;
    private final Messages.MapsCallbackApi flutterApi;
    private C2197c googleMap;
    private final Map<String, PolygonController> polygonIdToController = new HashMap();
    private final Map<String, String> googleMapsPolygonIdToDartPolygonId = new HashMap();

    public PolygonsController(Messages.MapsCallbackApi mapsCallbackApi, float f10) {
        this.flutterApi = mapsCallbackApi;
        this.density = f10;
    }

    private void addPolygon(Messages.PlatformPolygon platformPolygon) {
        PolygonBuilder polygonBuilder = new PolygonBuilder(this.density);
        addPolygon(Convert.interpretPolygonOptions(platformPolygon, polygonBuilder), polygonBuilder.build(), polygonBuilder.consumeTapEvents());
    }

    private void changePolygon(Messages.PlatformPolygon platformPolygon) {
        PolygonController polygonController = this.polygonIdToController.get(platformPolygon.getPolygonId());
        if (polygonController != null) {
            Convert.interpretPolygonOptions(platformPolygon, polygonController);
        }
    }

    private static String getPolygonId(Map<String, ?> map) {
        return (String) map.get("polygonId");
    }

    public void addPolygons(List<Messages.PlatformPolygon> list) {
        Iterator<Messages.PlatformPolygon> it = list.iterator();
        while (it.hasNext()) {
            addPolygon(it.next());
        }
    }

    public void changePolygons(List<Messages.PlatformPolygon> list) {
        Iterator<Messages.PlatformPolygon> it = list.iterator();
        while (it.hasNext()) {
            changePolygon(it.next());
        }
    }

    public boolean onPolygonTap(String str) {
        String str2 = this.googleMapsPolygonIdToDartPolygonId.get(str);
        if (str2 == null) {
            return false;
        }
        this.flutterApi.onPolygonTap(str2, new NoOpVoidResult());
        PolygonController polygonController = this.polygonIdToController.get(str2);
        if (polygonController != null) {
            return polygonController.consumeTapEvents();
        }
        return false;
    }

    public void removePolygons(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            PolygonController polygonControllerRemove = this.polygonIdToController.remove(it.next());
            if (polygonControllerRemove != null) {
                polygonControllerRemove.remove();
                this.googleMapsPolygonIdToDartPolygonId.remove(polygonControllerRemove.getGoogleMapsPolygonId());
            }
        }
    }

    public void setGoogleMap(C2197c c2197c) {
        this.googleMap = c2197c;
    }

    private void addPolygon(String str, C2296x c2296x, boolean z10) {
        C2295w c2295wD = this.googleMap.d(c2296x);
        this.polygonIdToController.put(str, new PolygonController(c2295wD, z10, this.density));
        this.googleMapsPolygonIdToDartPolygonId.put(c2295wD.a(), str);
    }
}
