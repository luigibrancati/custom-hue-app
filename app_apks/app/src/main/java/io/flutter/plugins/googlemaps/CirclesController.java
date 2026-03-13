package io.flutter.plugins.googlemaps;

import S6.C2197c;
import U6.C2280g;
import U6.C2281h;
import io.flutter.plugins.googlemaps.Messages;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class CirclesController {
    private final float density;
    private final Messages.MapsCallbackApi flutterApi;
    private C2197c googleMap;
    final Map<String, CircleController> circleIdToController = new HashMap();
    private final Map<String, String> googleMapsCircleIdToDartCircleId = new HashMap();

    public CirclesController(Messages.MapsCallbackApi mapsCallbackApi, float f10) {
        this.flutterApi = mapsCallbackApi;
        this.density = f10;
    }

    private void changeCircle(Messages.PlatformCircle platformCircle) {
        CircleController circleController = this.circleIdToController.get(platformCircle.getCircleId());
        if (circleController != null) {
            Convert.interpretCircleOptions(platformCircle, circleController);
        }
    }

    public void addCircle(Messages.PlatformCircle platformCircle) {
        CircleBuilder circleBuilder = new CircleBuilder(this.density);
        addCircle(Convert.interpretCircleOptions(platformCircle, circleBuilder), circleBuilder.build(), circleBuilder.consumeTapEvents());
    }

    public void addCircles(List<Messages.PlatformCircle> list) {
        Iterator<Messages.PlatformCircle> it = list.iterator();
        while (it.hasNext()) {
            addCircle(it.next());
        }
    }

    public void changeCircles(List<Messages.PlatformCircle> list) {
        Iterator<Messages.PlatformCircle> it = list.iterator();
        while (it.hasNext()) {
            changeCircle(it.next());
        }
    }

    public boolean onCircleTap(String str) {
        String str2 = this.googleMapsCircleIdToDartCircleId.get(str);
        if (str2 == null) {
            return false;
        }
        this.flutterApi.onCircleTap(str2, new NoOpVoidResult());
        CircleController circleController = this.circleIdToController.get(str2);
        if (circleController != null) {
            return circleController.consumeTapEvents();
        }
        return false;
    }

    public void removeCircles(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            CircleController circleControllerRemove = this.circleIdToController.remove(it.next());
            if (circleControllerRemove != null) {
                circleControllerRemove.remove();
                this.googleMapsCircleIdToDartCircleId.remove(circleControllerRemove.getGoogleMapsCircleId());
            }
        }
    }

    public void setGoogleMap(C2197c c2197c) {
        this.googleMap = c2197c;
    }

    private void addCircle(String str, C2281h c2281h, boolean z10) {
        C2280g c2280gA = this.googleMap.a(c2281h);
        this.circleIdToController.put(str, new CircleController(c2280gA, z10, this.density));
        this.googleMapsCircleIdToDartCircleId.put(c2280gA.a(), str);
    }
}
