package io.flutter.plugins.googlemaps;

import E9.c;
import S6.C2197c;
import U6.C2275b;
import U6.C2291s;
import android.content.Context;
import io.flutter.plugins.googlemaps.Messages;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class ClusterManagersController implements C2197c.InterfaceC0186c, c.b {
    private c.e clusterItemClickListener;
    private OnClusterItemRendered<MarkerBuilder> clusterItemRenderedListener;
    protected final HashMap<String, E9.c> clusterManagerIdToManager = new HashMap<>();
    private final Context context;
    private final Messages.MapsCallbackApi flutterApi;
    private C2197c googleMap;
    private H9.b markerManager;
    private Messages.PlatformMarkerType markerType;

    /* JADX INFO: renamed from: io.flutter.plugins.googlemaps.ClusterManagersController$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$googlemaps$Messages$PlatformMarkerType;

        static {
            int[] iArr = new int[Messages.PlatformMarkerType.values().length];
            $SwitchMap$io$flutter$plugins$googlemaps$Messages$PlatformMarkerType = iArr;
            try {
                iArr[Messages.PlatformMarkerType.ADVANCED_MARKER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$plugins$googlemaps$Messages$PlatformMarkerType[Messages.PlatformMarkerType.MARKER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class AdvancedMarkerClusterRenderer<T extends MarkerBuilder> extends G9.f {
        private final ClusterManagersController clusterManagersController;

        public AdvancedMarkerClusterRenderer(Context context, C2197c c2197c, E9.c cVar, ClusterManagersController clusterManagersController) {
            super(context, c2197c, cVar);
            this.clusterManagersController = clusterManagersController;
        }

        @Override // G9.f
        public void onBeforeClusterItemRendered(T t10, C2275b c2275b) {
            t10.update(c2275b);
        }

        @Override // G9.f
        public void onClusterItemRendered(T t10, U6.r rVar) {
            super.onClusterItemRendered((E9.b) t10, rVar);
            this.clusterManagersController.onClusterItemRendered(t10, rVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class MarkerClusterRenderer<T extends MarkerBuilder> extends G9.o {
        private final ClusterManagersController clusterManagersController;

        public MarkerClusterRenderer(Context context, C2197c c2197c, E9.c cVar, ClusterManagersController clusterManagersController) {
            super(context, c2197c, cVar);
            this.clusterManagersController = clusterManagersController;
        }

        @Override // G9.o
        public void onBeforeClusterItemRendered(T t10, C2291s c2291s) {
            t10.update(c2291s);
        }

        @Override // G9.o
        public void onClusterItemRendered(T t10, U6.r rVar) {
            super.onClusterItemRendered((E9.b) t10, rVar);
            this.clusterManagersController.onClusterItemRendered(t10, rVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface OnClusterItemRendered<T extends E9.b> {
        void onClusterItemRendered(T t10, U6.r rVar);
    }

    public ClusterManagersController(Messages.MapsCallbackApi mapsCallbackApi, Context context, Messages.PlatformMarkerType platformMarkerType) {
        this.context = context;
        this.flutterApi = mapsCallbackApi;
        this.markerType = platformMarkerType;
    }

    private static String getClusterManagerId(Object obj) {
        return (String) ((Map) obj).get("clusterManagerId");
    }

    private void initListenersForClusterManager(E9.c cVar, c.b bVar, c.e eVar) {
        cVar.j(bVar);
        cVar.k(eVar);
    }

    private void initListenersForClusterManagers() {
        Iterator<Map.Entry<String, E9.c>> it = this.clusterManagerIdToManager.entrySet().iterator();
        while (it.hasNext()) {
            initListenersForClusterManager(it.next().getValue(), this, this.clusterItemClickListener);
        }
    }

    private void initializeRenderer(E9.c cVar) {
        cVar.l(AnonymousClass1.$SwitchMap$io$flutter$plugins$googlemaps$Messages$PlatformMarkerType[this.markerType.ordinal()] != 1 ? new MarkerClusterRenderer(this.context, this.googleMap, cVar, this) : new AdvancedMarkerClusterRenderer(this.context, this.googleMap, cVar, this));
        initListenersForClusterManager(cVar, this, this.clusterItemClickListener);
    }

    private void removeClusterManager(Object obj) {
        E9.c cVarRemove = this.clusterManagerIdToManager.remove(obj);
        if (cVarRemove == null) {
            return;
        }
        initListenersForClusterManager(cVarRemove, null, null);
        cVarRemove.c();
        cVarRemove.d();
    }

    public void addClusterManager(String str) {
        E9.c cVar = new E9.c(this.context, this.googleMap, this.markerManager);
        initializeRenderer(cVar);
        this.clusterManagerIdToManager.put(str, cVar);
    }

    public void addClusterManagers(List<Messages.PlatformClusterManager> list) {
        Iterator<Messages.PlatformClusterManager> it = list.iterator();
        while (it.hasNext()) {
            addClusterManager(it.next().getIdentifier());
        }
    }

    public void addItem(MarkerBuilder markerBuilder) {
        E9.c cVar = this.clusterManagerIdToManager.get(markerBuilder.clusterManagerId());
        if (cVar != null) {
            cVar.b(markerBuilder);
            cVar.d();
        }
    }

    public Set<? extends E9.a> getClustersWithClusterManagerId(String str) {
        E9.c cVar = this.clusterManagerIdToManager.get(str);
        if (cVar != null) {
            return cVar.e().e(this.googleMap.i().f30343b);
        }
        throw new Messages.FlutterError("Invalid clusterManagerId", "getClusters called with invalid clusterManagerId:" + str, null);
    }

    public void init(C2197c c2197c, H9.b bVar) {
        this.markerManager = bVar;
        this.googleMap = c2197c;
    }

    @Override // S6.C2197c.InterfaceC0186c
    public void onCameraIdle() {
        Iterator<Map.Entry<String, E9.c>> it = this.clusterManagerIdToManager.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().onCameraIdle();
        }
    }

    @Override // E9.c.b
    public boolean onClusterClick(E9.a aVar) {
        if (aVar.getSize() > 0) {
            this.flutterApi.onClusterTap(Convert.clusterToPigeon(((MarkerBuilder[]) aVar.b().toArray(new MarkerBuilder[0]))[0].clusterManagerId(), aVar), new NoOpVoidResult());
        }
        return false;
    }

    public void onClusterItemRendered(MarkerBuilder markerBuilder, U6.r rVar) {
        OnClusterItemRendered<MarkerBuilder> onClusterItemRendered = this.clusterItemRenderedListener;
        if (onClusterItemRendered != null) {
            onClusterItemRendered.onClusterItemRendered(markerBuilder, rVar);
        }
    }

    public void removeClusterManagers(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            removeClusterManager(it.next());
        }
    }

    public void removeItem(MarkerBuilder markerBuilder) {
        E9.c cVar = this.clusterManagerIdToManager.get(markerBuilder.clusterManagerId());
        if (cVar != null) {
            cVar.i(markerBuilder);
            cVar.d();
        }
    }

    public void setClusterItemClickListener(c.e eVar) {
        this.clusterItemClickListener = eVar;
        initListenersForClusterManagers();
    }

    public void setClusterItemRenderedListener(OnClusterItemRendered<MarkerBuilder> onClusterItemRendered) {
        this.clusterItemRenderedListener = onClusterItemRendered;
    }
}
