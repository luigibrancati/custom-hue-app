package io.flutter.plugins.googlemaps;

import android.content.Context;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;
import io.flutter.plugins.googlemaps.Messages;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class GoogleMapFactory extends PlatformViewFactory {
    private final BinaryMessenger binaryMessenger;
    private final GoogleMapInitializer googleMapInitializer;
    private final LifecycleProvider lifecycleProvider;

    public GoogleMapFactory(BinaryMessenger binaryMessenger, Context context, LifecycleProvider lifecycleProvider) {
        super(Messages.MapsApi.getCodec());
        this.binaryMessenger = binaryMessenger;
        this.lifecycleProvider = lifecycleProvider;
        this.googleMapInitializer = new GoogleMapInitializer(context, binaryMessenger);
    }

    @Override // io.flutter.plugin.platform.PlatformViewFactory
    public PlatformView create(Context context, int i10, Object obj) {
        Messages.PlatformMapViewCreationParams platformMapViewCreationParams = (Messages.PlatformMapViewCreationParams) obj;
        Objects.requireNonNull(platformMapViewCreationParams);
        GoogleMapBuilder googleMapBuilder = new GoogleMapBuilder();
        Messages.PlatformMapConfiguration mapConfiguration = platformMapViewCreationParams.getMapConfiguration();
        Convert.interpretMapConfiguration(mapConfiguration, googleMapBuilder);
        googleMapBuilder.setInitialCameraPosition(Convert.cameraPositionFromPigeon(platformMapViewCreationParams.getInitialCameraPosition()));
        googleMapBuilder.setInitialClusterManagers(platformMapViewCreationParams.getInitialClusterManagers());
        googleMapBuilder.setInitialMarkers(platformMapViewCreationParams.getInitialMarkers());
        googleMapBuilder.setInitialPolygons(platformMapViewCreationParams.getInitialPolygons());
        googleMapBuilder.setInitialPolylines(platformMapViewCreationParams.getInitialPolylines());
        googleMapBuilder.setInitialCircles(platformMapViewCreationParams.getInitialCircles());
        googleMapBuilder.setInitialHeatmaps(platformMapViewCreationParams.getInitialHeatmaps());
        googleMapBuilder.setInitialTileOverlays(platformMapViewCreationParams.getInitialTileOverlays());
        googleMapBuilder.setInitialGroundOverlays(platformMapViewCreationParams.getInitialGroundOverlays());
        String mapId = mapConfiguration.getMapId();
        if (mapId != null && !mapId.isEmpty()) {
            googleMapBuilder.setMapId(mapId);
        }
        return googleMapBuilder.build(i10, context, this.binaryMessenger, this.lifecycleProvider, mapConfiguration.getMarkerType());
    }
}
