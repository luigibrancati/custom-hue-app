package io.flutter.plugins.googlemaps;

import S6.C2197c;
import io.flutter.plugins.googlemaps.Messages;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class TileOverlaysController {
    private final Messages.MapsCallbackApi flutterApi;
    private C2197c googleMap;
    private final Map<String, TileOverlayController> tileOverlayIdToController = new HashMap();

    public TileOverlaysController(Messages.MapsCallbackApi mapsCallbackApi) {
        this.flutterApi = mapsCallbackApi;
    }

    private void addTileOverlay(Messages.PlatformTileOverlay platformTileOverlay) {
        TileOverlayBuilder tileOverlayBuilder = new TileOverlayBuilder();
        String strInterpretTileOverlayOptions = Convert.interpretTileOverlayOptions(platformTileOverlay, tileOverlayBuilder);
        tileOverlayBuilder.setTileProvider(new TileProviderController(this.flutterApi, strInterpretTileOverlayOptions));
        this.tileOverlayIdToController.put(strInterpretTileOverlayOptions, new TileOverlayController(this.googleMap.f(tileOverlayBuilder.build())));
    }

    private void changeTileOverlay(Messages.PlatformTileOverlay platformTileOverlay) {
        TileOverlayController tileOverlayController = this.tileOverlayIdToController.get(platformTileOverlay.getTileOverlayId());
        if (tileOverlayController != null) {
            Convert.interpretTileOverlayOptions(platformTileOverlay, tileOverlayController);
        }
    }

    private static String getTileOverlayId(Map<String, ?> map) {
        return (String) map.get("tileOverlayId");
    }

    private void removeTileOverlay(String str) {
        TileOverlayController tileOverlayController = this.tileOverlayIdToController.get(str);
        if (tileOverlayController != null) {
            tileOverlayController.remove();
            this.tileOverlayIdToController.remove(str);
        }
    }

    public void addTileOverlays(List<Messages.PlatformTileOverlay> list) {
        Iterator<Messages.PlatformTileOverlay> it = list.iterator();
        while (it.hasNext()) {
            addTileOverlay(it.next());
        }
    }

    public void changeTileOverlays(List<Messages.PlatformTileOverlay> list) {
        Iterator<Messages.PlatformTileOverlay> it = list.iterator();
        while (it.hasNext()) {
            changeTileOverlay(it.next());
        }
    }

    public void clearTileCache(String str) {
        TileOverlayController tileOverlayController;
        if (str == null || (tileOverlayController = this.tileOverlayIdToController.get(str)) == null) {
            return;
        }
        tileOverlayController.clearTileCache();
    }

    public U6.J getTileOverlay(String str) {
        TileOverlayController tileOverlayController;
        if (str == null || (tileOverlayController = this.tileOverlayIdToController.get(str)) == null) {
            return null;
        }
        return tileOverlayController.getTileOverlay();
    }

    public void removeTileOverlays(List<String> list) {
        if (list == null) {
            return;
        }
        for (String str : list) {
            if (str != null) {
                removeTileOverlay(str);
            }
        }
    }

    public void setGoogleMap(C2197c c2197c) {
        this.googleMap = c2197c;
    }
}
