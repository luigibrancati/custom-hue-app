package io.flutter.plugins.googlemaps;

import U6.C2275b;
import U6.C2276c;
import U6.C2291s;
import com.google.android.gms.maps.model.LatLng;
import io.flutter.plugins.googlemaps.Messages;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class MarkerBuilder implements MarkerOptionsSink, E9.b {
    private final C2275b advancedMarkerOptions;
    private String clusterManagerId;
    private boolean consumeTapEvents;
    private String markerId;
    private final C2291s markerOptions;

    /* JADX INFO: renamed from: io.flutter.plugins.googlemaps.MarkerBuilder$1, reason: invalid class name */
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

    public MarkerBuilder(String str, String str2, Messages.PlatformMarkerType platformMarkerType) {
        if (AnonymousClass1.$SwitchMap$io$flutter$plugins$googlemaps$Messages$PlatformMarkerType[platformMarkerType.ordinal()] != 1) {
            this.markerOptions = new C2291s();
            this.advancedMarkerOptions = null;
        } else {
            C2275b c2275b = new C2275b();
            this.advancedMarkerOptions = c2275b;
            this.markerOptions = c2275b;
        }
        this.markerId = str;
        this.clusterManagerId = str2;
    }

    public C2291s build() {
        return this.markerOptions;
    }

    public String clusterManagerId() {
        return this.clusterManagerId;
    }

    public boolean consumeTapEvents() {
        return this.consumeTapEvents;
    }

    @Override // E9.b
    public LatLng getPosition() {
        return this.markerOptions.w();
    }

    @Override // E9.b
    public String getSnippet() {
        return this.markerOptions.y();
    }

    @Override // E9.b
    public String getTitle() {
        return this.markerOptions.z();
    }

    @Override // E9.b
    public Float getZIndex() {
        return Float.valueOf(this.markerOptions.A());
    }

    public String markerId() {
        return this.markerId;
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setAlpha(float f10) {
        this.markerOptions.d(f10);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setAnchor(float f10, float f11) {
        this.markerOptions.e(f10, f11);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setCollisionBehavior(int i10) {
        C2275b c2275b = this.advancedMarkerOptions;
        if (c2275b != null) {
            c2275b.X(i10);
        }
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setConsumeTapEvents(boolean z10) {
        this.consumeTapEvents = z10;
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setDraggable(boolean z10) {
        this.markerOptions.f(z10);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setFlat(boolean z10) {
        this.markerOptions.h(z10);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setIcon(C2276c c2276c) {
        this.markerOptions.B(c2276c);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setInfoWindowAnchor(float f10, float f11) {
        this.markerOptions.E(f10, f11);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setInfoWindowText(String str, String str2) {
        this.markerOptions.O(str);
        this.markerOptions.N(str2);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setPosition(LatLng latLng) {
        this.markerOptions.L(latLng);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setRotation(float f10) {
        this.markerOptions.M(f10);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setVisible(boolean z10) {
        this.markerOptions.P(z10);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setZIndex(float f10) {
        this.markerOptions.Q(f10);
    }

    public void update(C2291s c2291s) {
        c2291s.d(this.markerOptions.k());
        c2291s.e(this.markerOptions.l(), this.markerOptions.n());
        c2291s.f(this.markerOptions.H());
        c2291s.h(this.markerOptions.I());
        c2291s.B(this.markerOptions.r());
        c2291s.E(this.markerOptions.t(), this.markerOptions.v());
        c2291s.O(this.markerOptions.z());
        c2291s.N(this.markerOptions.y());
        c2291s.L(this.markerOptions.w());
        c2291s.M(this.markerOptions.x());
        c2291s.P(this.markerOptions.J());
        c2291s.Q(this.markerOptions.A());
    }
}
