package y;

import E.AbstractC0807p0;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Range;
import android.util.Size;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f48327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B.m f48328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f48329c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f48330d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f48331e = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        StreamConfigurationMap a();

        long b(int i10, Size size);

        Size[] c(int i10);

        int[] d();

        Size[] e();

        Range[] f(Size size);

        Size[] g(int i10);
    }

    public y(StreamConfigurationMap streamConfigurationMap, B.m mVar) {
        this.f48327a = new z(streamConfigurationMap);
        this.f48328b = mVar;
    }

    public static y h(StreamConfigurationMap streamConfigurationMap, B.m mVar) {
        return new y(streamConfigurationMap, mVar);
    }

    public Size[] a(int i10) {
        if (this.f48330d.containsKey(Integer.valueOf(i10))) {
            if (((Size[]) this.f48330d.get(Integer.valueOf(i10))) == null) {
                return null;
            }
            return (Size[]) ((Size[]) this.f48330d.get(Integer.valueOf(i10))).clone();
        }
        Size[] sizeArrG = this.f48327a.g(i10);
        if (sizeArrG != null && sizeArrG.length > 0) {
            sizeArrG = this.f48328b.b(sizeArrG, i10);
        }
        this.f48330d.put(Integer.valueOf(i10), sizeArrG);
        if (sizeArrG != null) {
            return (Size[]) sizeArrG.clone();
        }
        return null;
    }

    public Range[] b(Size size) {
        return this.f48327a.f(size);
    }

    public Size[] c() {
        return this.f48327a.e();
    }

    public int[] d() {
        int[] iArrD = this.f48327a.d();
        if (iArrD == null) {
            return null;
        }
        return (int[]) iArrD.clone();
    }

    public long e(int i10, Size size) {
        try {
            return this.f48327a.b(i10, size);
        } catch (RuntimeException e10) {
            AbstractC0807p0.m("StreamConfigurationMapCompat", "Failed to get min frame duration for format = " + i10 + " and size = " + size, e10);
            return 0L;
        }
    }

    public Size[] f(int i10) {
        Size[] sizeArrC = null;
        if (this.f48329c.containsKey(Integer.valueOf(i10))) {
            if (((Size[]) this.f48329c.get(Integer.valueOf(i10))) == null) {
                return null;
            }
            return (Size[]) ((Size[]) this.f48329c.get(Integer.valueOf(i10))).clone();
        }
        try {
            sizeArrC = this.f48327a.c(i10);
        } catch (Throwable th) {
            AbstractC0807p0.m("StreamConfigurationMapCompat", "Failed to get output sizes for " + i10, th);
        }
        if (sizeArrC != null && sizeArrC.length != 0) {
            Size[] sizeArrB = this.f48328b.b(sizeArrC, i10);
            this.f48329c.put(Integer.valueOf(i10), sizeArrB);
            return (Size[]) sizeArrB.clone();
        }
        AbstractC0807p0.l("StreamConfigurationMapCompat", "Retrieved output sizes array is null or empty for format " + i10);
        return sizeArrC;
    }

    public StreamConfigurationMap g() {
        return this.f48327a.a();
    }
}
