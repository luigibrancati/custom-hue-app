package X8;

import android.app.Activity;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import androidx.fragment.app.ComponentCallbacksC2736q;
import b9.C2898a;
import c9.g;
import com.google.firebase.perf.util.g;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C2898a f19375e = C2898a.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f19376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FrameMetricsAggregator f19377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f19378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f19379d;

    public d(Activity activity) {
        this(activity, new FrameMetricsAggregator(), new HashMap());
    }

    public static boolean a() {
        return true;
    }

    public final g b() {
        if (!this.f19379d) {
            f19375e.a("No recording has been started.");
            return g.a();
        }
        SparseIntArray[] sparseIntArrayArrB = this.f19377b.b();
        if (sparseIntArrayArrB == null) {
            f19375e.a("FrameMetricsAggregator.mMetrics is uninitialized.");
            return g.a();
        }
        if (sparseIntArrayArrB[0] != null) {
            return g.e(c9.g.a(sparseIntArrayArrB));
        }
        f19375e.a("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
        return g.a();
    }

    public void c() {
        if (this.f19379d) {
            f19375e.b("FrameMetricsAggregator is already recording %s", this.f19376a.getClass().getSimpleName());
        } else {
            this.f19377b.a(this.f19376a);
            this.f19379d = true;
        }
    }

    public void d(ComponentCallbacksC2736q componentCallbacksC2736q) {
        if (!this.f19379d) {
            f19375e.a("Cannot start sub-recording because FrameMetricsAggregator is not recording");
            return;
        }
        if (this.f19378c.containsKey(componentCallbacksC2736q)) {
            f19375e.b("Cannot start sub-recording because one is already ongoing with the key %s", componentCallbacksC2736q.getClass().getSimpleName());
            return;
        }
        g gVarB = b();
        if (gVarB.d()) {
            this.f19378c.put(componentCallbacksC2736q, (g.a) gVarB.c());
        } else {
            f19375e.b("startFragment(%s): snapshot() failed", componentCallbacksC2736q.getClass().getSimpleName());
        }
    }

    public com.google.firebase.perf.util.g e() {
        if (!this.f19379d) {
            f19375e.a("Cannot stop because no recording was started");
            return com.google.firebase.perf.util.g.a();
        }
        if (!this.f19378c.isEmpty()) {
            f19375e.a("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
            this.f19378c.clear();
        }
        com.google.firebase.perf.util.g gVarB = b();
        try {
            this.f19377b.c(this.f19376a);
        } catch (IllegalArgumentException | NullPointerException e10) {
            if (e10 instanceof NullPointerException) {
                throw e10;
            }
            f19375e.k("View not hardware accelerated. Unable to collect FrameMetrics. %s", e10.toString());
            gVarB = com.google.firebase.perf.util.g.a();
        }
        this.f19377b.d();
        this.f19379d = false;
        return gVarB;
    }

    public com.google.firebase.perf.util.g f(ComponentCallbacksC2736q componentCallbacksC2736q) {
        if (!this.f19379d) {
            f19375e.a("Cannot stop sub-recording because FrameMetricsAggregator is not recording");
            return com.google.firebase.perf.util.g.a();
        }
        if (!this.f19378c.containsKey(componentCallbacksC2736q)) {
            f19375e.b("Sub-recording associated with key %s was not started or does not exist", componentCallbacksC2736q.getClass().getSimpleName());
            return com.google.firebase.perf.util.g.a();
        }
        g.a aVar = (g.a) this.f19378c.remove(componentCallbacksC2736q);
        com.google.firebase.perf.util.g gVarB = b();
        if (gVarB.d()) {
            return com.google.firebase.perf.util.g.e(((g.a) gVarB.c()).a(aVar));
        }
        f19375e.b("stopFragment(%s): snapshot() failed", componentCallbacksC2736q.getClass().getSimpleName());
        return com.google.firebase.perf.util.g.a();
    }

    public d(Activity activity, FrameMetricsAggregator frameMetricsAggregator, Map map) {
        this.f19379d = false;
        this.f19376a = activity;
        this.f19377b = frameMetricsAggregator;
        this.f19378c = map;
    }
}
