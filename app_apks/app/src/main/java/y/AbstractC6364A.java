package y;

import E.AbstractC0807p0;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Range;
import android.util.Size;
import y.y;

/* JADX INFO: renamed from: y.A, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6364A implements y.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StreamConfigurationMap f48307a;

    /* JADX INFO: renamed from: y.A$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {
        public static Size[] a(StreamConfigurationMap streamConfigurationMap, int i10) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i10);
        }
    }

    public AbstractC6364A(StreamConfigurationMap streamConfigurationMap) {
        this.f48307a = streamConfigurationMap;
    }

    @Override // y.y.a
    public StreamConfigurationMap a() {
        return this.f48307a;
    }

    @Override // y.y.a
    public int[] d() {
        try {
            return this.f48307a.getOutputFormats();
        } catch (IllegalArgumentException | NullPointerException e10) {
            AbstractC0807p0.m("StreamConfigurationMapCompatBaseImpl", "Failed to get output formats from StreamConfigurationMap", e10);
            return null;
        }
    }

    @Override // y.y.a
    public Size[] e() {
        return this.f48307a.getHighSpeedVideoSizes();
    }

    @Override // y.y.a
    public Range[] f(Size size) {
        return this.f48307a.getHighSpeedVideoFpsRangesFor(size);
    }

    @Override // y.y.a
    public Size[] g(int i10) {
        return a.a(this.f48307a, i10);
    }
}
