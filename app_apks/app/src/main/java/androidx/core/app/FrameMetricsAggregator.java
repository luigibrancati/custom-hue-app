package androidx.core.app;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class FrameMetricsAggregator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f22447a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static HandlerThread f22448e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static Handler f22449f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f22450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public SparseIntArray[] f22451b = new SparseIntArray[9];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f22452c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Window.OnFrameMetricsAvailableListener f22453d = new WindowOnFrameMetricsAvailableListenerC0281a();

        /* JADX INFO: renamed from: androidx.core.app.FrameMetricsAggregator$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class WindowOnFrameMetricsAvailableListenerC0281a implements Window.OnFrameMetricsAvailableListener {
            public WindowOnFrameMetricsAvailableListenerC0281a() {
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i10) {
                a aVar = a.this;
                if ((aVar.f22450a & 1) != 0) {
                    aVar.f(aVar.f22451b[0], frameMetrics.getMetric(8));
                }
                a aVar2 = a.this;
                if ((aVar2.f22450a & 2) != 0) {
                    aVar2.f(aVar2.f22451b[1], frameMetrics.getMetric(1));
                }
                a aVar3 = a.this;
                if ((aVar3.f22450a & 4) != 0) {
                    aVar3.f(aVar3.f22451b[2], frameMetrics.getMetric(3));
                }
                a aVar4 = a.this;
                if ((aVar4.f22450a & 8) != 0) {
                    aVar4.f(aVar4.f22451b[3], frameMetrics.getMetric(4));
                }
                a aVar5 = a.this;
                if ((aVar5.f22450a & 16) != 0) {
                    aVar5.f(aVar5.f22451b[4], frameMetrics.getMetric(5));
                }
                a aVar6 = a.this;
                if ((aVar6.f22450a & 64) != 0) {
                    aVar6.f(aVar6.f22451b[6], frameMetrics.getMetric(7));
                }
                a aVar7 = a.this;
                if ((aVar7.f22450a & 32) != 0) {
                    aVar7.f(aVar7.f22451b[5], frameMetrics.getMetric(6));
                }
                a aVar8 = a.this;
                if ((aVar8.f22450a & 128) != 0) {
                    aVar8.f(aVar8.f22451b[7], frameMetrics.getMetric(0));
                }
                a aVar9 = a.this;
                if ((aVar9.f22450a & 256) != 0) {
                    aVar9.f(aVar9.f22451b[8], frameMetrics.getMetric(2));
                }
            }
        }

        public a(int i10) {
            this.f22450a = i10;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public void a(Activity activity) {
            if (f22448e == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f22448e = handlerThread;
                handlerThread.start();
                f22449f = new Handler(f22448e.getLooper());
            }
            for (int i10 = 0; i10 <= 8; i10++) {
                SparseIntArray[] sparseIntArrayArr = this.f22451b;
                if (sparseIntArrayArr[i10] == null && (this.f22450a & (1 << i10)) != 0) {
                    sparseIntArrayArr[i10] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f22453d, f22449f);
            this.f22452c.add(new WeakReference(activity));
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public SparseIntArray[] b() {
            return this.f22451b;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public SparseIntArray[] c(Activity activity) {
            Iterator it = this.f22452c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == activity) {
                    this.f22452c.remove(weakReference);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f22453d);
            return this.f22451b;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public SparseIntArray[] d() {
            SparseIntArray[] sparseIntArrayArr = this.f22451b;
            this.f22451b = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public SparseIntArray[] e() {
            for (int size = this.f22452c.size() - 1; size >= 0; size--) {
                WeakReference weakReference = (WeakReference) this.f22452c.get(size);
                Activity activity = (Activity) weakReference.get();
                if (weakReference.get() != null) {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this.f22453d);
                    this.f22452c.remove(size);
                }
            }
            return this.f22451b;
        }

        public void f(SparseIntArray sparseIntArray, long j10) {
            if (sparseIntArray != null) {
                int i10 = (int) ((500000 + j10) / 1000000);
                if (j10 >= 0) {
                    sparseIntArray.put(i10, sparseIntArray.get(i10) + 1);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {
        public abstract void a(Activity activity);

        public abstract SparseIntArray[] b();

        public abstract SparseIntArray[] c(Activity activity);

        public abstract SparseIntArray[] d();

        public abstract SparseIntArray[] e();
    }

    public FrameMetricsAggregator() {
        this(1);
    }

    public void a(Activity activity) {
        this.f22447a.a(activity);
    }

    public SparseIntArray[] b() {
        return this.f22447a.b();
    }

    public SparseIntArray[] c(Activity activity) {
        return this.f22447a.c(activity);
    }

    public SparseIntArray[] d() {
        return this.f22447a.d();
    }

    public SparseIntArray[] e() {
        return this.f22447a.e();
    }

    public FrameMetricsAggregator(int i10) {
        this.f22447a = new a(i10);
    }
}
