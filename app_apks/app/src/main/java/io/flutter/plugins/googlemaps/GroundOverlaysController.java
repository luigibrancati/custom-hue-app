package io.flutter.plugins.googlemaps;

import S6.C2197c;
import U6.C2287n;
import android.content.res.AssetManager;
import io.flutter.plugins.googlemaps.Convert;
import io.flutter.plugins.googlemaps.Messages;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class GroundOverlaysController {
    private final AssetManager assetManager;
    private final Convert.BitmapDescriptorFactoryWrapper bitmapDescriptorFactoryWrapper;
    private final float density;
    private final Messages.MapsCallbackApi flutterApi;
    private C2197c googleMap;
    private final HashMap<String, String> googleMapsGroundOverlayIdToDartGroundOverlayId;
    private final Map<String, GroundOverlayController> groundOverlayIdToController;

    public GroundOverlaysController(Messages.MapsCallbackApi mapsCallbackApi, AssetManager assetManager, float f10) {
        this(mapsCallbackApi, assetManager, f10, new Convert.BitmapDescriptorFactoryWrapper());
    }

    private void addGroundOverlay(Messages.PlatformGroundOverlay platformGroundOverlay) {
        GroundOverlayBuilder groundOverlayBuilder = new GroundOverlayBuilder();
        String strInterpretGroundOverlayOptions = Convert.interpretGroundOverlayOptions(platformGroundOverlay, groundOverlayBuilder, this.assetManager, this.density, this.bitmapDescriptorFactoryWrapper);
        C2287n c2287nB = this.googleMap.b(groundOverlayBuilder.build());
        if (c2287nB != null) {
            this.groundOverlayIdToController.put(strInterpretGroundOverlayOptions, new GroundOverlayController(c2287nB, platformGroundOverlay.getBounds() != null));
            this.googleMapsGroundOverlayIdToDartGroundOverlayId.put(c2287nB.d(), strInterpretGroundOverlayOptions);
        }
    }

    private void changeGroundOverlay(Messages.PlatformGroundOverlay platformGroundOverlay) {
        GroundOverlayController groundOverlayController = this.groundOverlayIdToController.get(platformGroundOverlay.getGroundOverlayId());
        if (groundOverlayController != null) {
            Convert.interpretGroundOverlayOptions(platformGroundOverlay, groundOverlayController, this.assetManager, this.density, this.bitmapDescriptorFactoryWrapper);
        }
    }

    private void removeGroundOverlay(String str) {
        GroundOverlayController groundOverlayController = this.groundOverlayIdToController.get(str);
        if (groundOverlayController != null) {
            groundOverlayController.remove();
            this.groundOverlayIdToController.remove(str);
            this.googleMapsGroundOverlayIdToDartGroundOverlayId.remove(groundOverlayController.getGoogleMapsGroundOverlayId());
        }
    }

    public void addGroundOverlays(List<Messages.PlatformGroundOverlay> list) {
        Iterator<Messages.PlatformGroundOverlay> it = list.iterator();
        while (it.hasNext()) {
            addGroundOverlay(it.next());
        }
    }

    public void changeGroundOverlays(List<Messages.PlatformGroundOverlay> list) {
        Iterator<Messages.PlatformGroundOverlay> it = list.iterator();
        while (it.hasNext()) {
            changeGroundOverlay(it.next());
        }
    }

    public C2287n getGroundOverlay(String str) {
        GroundOverlayController groundOverlayController = this.groundOverlayIdToController.get(str);
        if (groundOverlayController == null) {
            return null;
        }
        return groundOverlayController.getGroundOverlay();
    }

    public boolean isCreatedWithBounds(String str) {
        GroundOverlayController groundOverlayController = this.groundOverlayIdToController.get(str);
        if (groundOverlayController == null) {
            return false;
        }
        return groundOverlayController.isCreatedWithBounds();
    }

    public void onGroundOverlayTap(String str) {
        String str2 = this.googleMapsGroundOverlayIdToDartGroundOverlayId.get(str);
        if (str2 == null) {
            return;
        }
        this.flutterApi.onGroundOverlayTap(str2, new NoOpVoidResult());
    }

    public void removeGroundOverlays(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            removeGroundOverlay(it.next());
        }
    }

    public void setGoogleMap(C2197c c2197c) {
        this.googleMap = c2197c;
    }

    public GroundOverlaysController(Messages.MapsCallbackApi mapsCallbackApi, AssetManager assetManager, float f10, Convert.BitmapDescriptorFactoryWrapper bitmapDescriptorFactoryWrapper) {
        this.groundOverlayIdToController = new HashMap();
        this.googleMapsGroundOverlayIdToDartGroundOverlayId = new HashMap<>();
        this.flutterApi = mapsCallbackApi;
        this.assetManager = assetManager;
        this.density = f10;
        this.bitmapDescriptorFactoryWrapper = bitmapDescriptorFactoryWrapper;
    }
}
