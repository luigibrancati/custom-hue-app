package x;

import B0.c;
import E.InterfaceC0802n;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import androidx.lifecycle.AbstractC2763t;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import x.C6266v;
import y.C6378n;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class K1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C6266v f46647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.w f46648b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f46650d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Executor f46653g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f46654h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c.a f46655i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f46656j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C6266v.c f46657k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicInteger f46649c = new AtomicInteger(-1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f46651e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f46652f = false;

    public K1(C6266v c6266v, C6378n c6378n, Executor executor) {
        this.f46647a = c6266v;
        this.f46653g = executor;
        boolean zB = b(c6378n);
        this.f46650d = zB;
        this.f46648b = new androidx.lifecycle.w(-1);
        C6266v.c cVar = new C6266v.c() { // from class: x.J1
            @Override // x.C6266v.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                return K1.a(this.f46639a, totalCaptureResult);
            }
        };
        this.f46657k = cVar;
        if (zB) {
            c6266v.y(cVar);
        }
    }

    public static /* synthetic */ boolean a(K1 k12, TotalCaptureResult totalCaptureResult) {
        Integer num;
        if (k12.f46655i != null) {
            Integer num2 = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.CONTROL_AE_MODE);
            if (num2 != null) {
                if ((num2.intValue() == 6) == k12.f46656j) {
                    k12.f46655i.c(null);
                    k12.f46655i = null;
                    if (Build.VERSION.SDK_INT >= 35) {
                        k12.e(k12.f46648b, num.intValue());
                    }
                }
            }
        } else if (Build.VERSION.SDK_INT >= 35 && k12.f46656j && (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_LOW_LIGHT_BOOST_STATE)) != null) {
            k12.e(k12.f46648b, num.intValue());
        }
        return false;
    }

    public static boolean b(C6378n c6378n) {
        int[] iArr;
        if (Build.VERSION.SDK_INT > 34 && (iArr = (int[]) c6378n.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES)) != null) {
            for (int i10 : iArr) {
                if (i10 == 6) {
                    return true;
                }
            }
        }
        return false;
    }

    public AbstractC2763t c() {
        return this.f46648b;
    }

    public void d(boolean z10) {
        if (this.f46654h == z10) {
            return;
        }
        this.f46654h = z10;
        if (z10) {
            return;
        }
        if (this.f46656j) {
            this.f46656j = false;
            this.f46647a.B(false);
            e(this.f46648b, -1);
        }
        c.a aVar = this.f46655i;
        if (aVar != null) {
            aVar.f(new InterfaceC0802n.a("Camera is not active."));
            this.f46655i = null;
        }
    }

    public final void e(androidx.lifecycle.w wVar, int i10) {
        if (this.f46649c.getAndSet(i10) != i10) {
            if (M.x.d()) {
                wVar.setValue(Integer.valueOf(i10));
            } else {
                wVar.postValue(Integer.valueOf(i10));
            }
        }
    }

    public void f(boolean z10) {
        synchronized (this.f46651e) {
            try {
                this.f46652f = z10;
                if (z10) {
                    if (this.f46656j) {
                        this.f46656j = false;
                        this.f46647a.B(false);
                        e(this.f46648b, -1);
                        c.a aVar = this.f46655i;
                        if (aVar != null) {
                            aVar.f(new IllegalStateException("Low-light boost is disabled when expected frame rate range exceeds 30 or HDR 10-bit is on."));
                            this.f46655i = null;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
