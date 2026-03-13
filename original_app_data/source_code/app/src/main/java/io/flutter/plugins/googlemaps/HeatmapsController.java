package io.flutter.plugins.googlemaps;

import S6.C2197c;
import io.flutter.plugins.googlemaps.Messages;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class HeatmapsController {
    private C2197c googleMap;
    private final Map<String, HeatmapController> heatmapIdToController = new HashMap();

    private void addHeatmap(String str, J9.b bVar) {
        this.heatmapIdToController.put(str, new HeatmapController(bVar, this.googleMap.f(new U6.K().l(bVar))));
    }

    public void addHeatmaps(List<Messages.PlatformHeatmap> list) {
        for (Messages.PlatformHeatmap platformHeatmap : list) {
            HeatmapBuilder heatmapBuilder = new HeatmapBuilder();
            addHeatmap(Convert.interpretHeatmapOptions(platformHeatmap, heatmapBuilder), buildHeatmap(heatmapBuilder));
        }
    }

    public J9.b buildHeatmap(HeatmapBuilder heatmapBuilder) {
        return heatmapBuilder.build();
    }

    public void changeHeatmaps(List<Messages.PlatformHeatmap> list) {
        for (Messages.PlatformHeatmap platformHeatmap : list) {
            HeatmapController heatmapController = this.heatmapIdToController.get(platformHeatmap.getHeatmapId());
            if (heatmapController != null) {
                Convert.interpretHeatmapOptions(platformHeatmap, heatmapController);
                heatmapController.clearTileCache();
            }
        }
    }

    public void removeHeatmaps(List<String> list) {
        for (String str : list) {
            HeatmapController heatmapControllerRemove = this.heatmapIdToController.remove(str);
            if (heatmapControllerRemove != null) {
                heatmapControllerRemove.remove();
                this.heatmapIdToController.remove(str);
            }
        }
    }

    public void setGoogleMap(C2197c c2197c) {
        this.googleMap = c2197c;
    }
}
