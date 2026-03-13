package x;

import B0.c;
import E.AbstractC0807p0;
import E.InterfaceC0802n;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import androidx.lifecycle.AbstractC2763t;
import java.util.Objects;
import java.util.concurrent.Executor;
import x.C6266v;
import y.C6378n;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C6266v f47051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.w f47052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.w f47053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f47054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f47055e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f47056f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f47057g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f47058h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f47059i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c.a f47060j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c.a f47061k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f47062l;

    public k2(C6266v c6266v, C6378n c6378n, Executor executor) {
        this.f47051a = c6266v;
        this.f47055e = executor;
        Objects.requireNonNull(c6378n);
        boolean zA = B.g.a(new X(c6378n));
        this.f47054d = zA;
        boolean zH = c6378n.h();
        this.f47057g = zH;
        int iC = (zA && zH) ? c6378n.c() : 0;
        this.f47058h = iC;
        this.f47059i = iC;
        this.f47052b = new androidx.lifecycle.w(0);
        this.f47053c = new androidx.lifecycle.w(Integer.valueOf(this.f47058h));
        c6266v.y(new C6266v.c() { // from class: x.i2
            @Override // x.C6266v.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                return k2.b(this.f47023a, totalCaptureResult);
            }
        });
    }

    public static /* synthetic */ boolean b(k2 k2Var, TotalCaptureResult totalCaptureResult) {
        Integer num;
        if (k2Var.f47061k != null) {
            Integer num2 = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
            if ((num2 != null && num2.intValue() == 2) == k2Var.f47062l) {
                k2Var.f47061k.c(null);
                k2Var.f47061k = null;
            }
        }
        if (k2Var.f47057g && Build.VERSION.SDK_INT >= 35 && k2Var.f47060j != null && (num = (Integer) totalCaptureResult.get(CaptureResult.FLASH_STRENGTH_LEVEL)) != null && num.intValue() == k2Var.f47059i) {
            k2Var.f47060j.c(null);
            k2Var.f47060j = null;
        }
        return false;
    }

    public static /* synthetic */ Object c(final k2 k2Var, final int i10, boolean z10, final c.a aVar) {
        k2Var.f47055e.execute(new Runnable() { // from class: x.j2
            @Override // java.lang.Runnable
            public final void run() {
                this.f47032a.e(aVar, i10);
            }
        });
        return "enableTorch: " + z10;
    }

    public O7.e d(final boolean z10) {
        if (!this.f47054d) {
            AbstractC0807p0.a("TorchControl", "Unable to enableTorch due to there is no flash unit.");
            return O.n.n(new IllegalStateException("No flash unit"));
        }
        k(z10 ? 1 : 0);
        final int i10 = z10 ? 1 : 0;
        return B0.c.a(new c.InterfaceC0018c() { // from class: x.h2
            @Override // B0.c.InterfaceC0018c
            public final Object a(c.a aVar) {
                return k2.c(this.f47010a, i10, z10, aVar);
            }
        });
    }

    public void e(c.a aVar, int i10) {
        if (!this.f47054d) {
            if (aVar != null) {
                aVar.f(new IllegalStateException("No flash unit"));
                return;
            }
            return;
        }
        if (!this.f47056f) {
            k(0);
            if (aVar != null) {
                aVar.f(new InterfaceC0802n.a("Camera is not active."));
                return;
            }
            return;
        }
        if (this.f47051a.Y()) {
            if (aVar != null) {
                aVar.f(new IllegalStateException("Torch can not be enabled when low-light boost is on!"));
                return;
            }
            return;
        }
        this.f47062l = i10 != 0;
        this.f47051a.C(i10);
        k(i10);
        c.a aVar2 = this.f47061k;
        if (aVar2 != null) {
            aVar2.f(new InterfaceC0802n.a("There is a new enableTorch being set"));
        }
        this.f47061k = aVar;
    }

    public void f() {
        if (this.f47062l) {
            this.f47062l = false;
            k(0);
        }
    }

    public AbstractC2763t g() {
        return this.f47052b;
    }

    public AbstractC2763t h() {
        return this.f47053c;
    }

    public void i(boolean z10) {
        if (this.f47056f == z10) {
            return;
        }
        this.f47056f = z10;
        if (z10) {
            return;
        }
        if (this.f47062l) {
            this.f47062l = false;
            this.f47059i = this.f47058h;
            this.f47051a.C(0);
            k(0);
            j(this.f47053c, Integer.valueOf(this.f47058h));
        }
        c.a aVar = this.f47061k;
        if (aVar != null) {
            aVar.f(new InterfaceC0802n.a("Camera is not active."));
            this.f47061k = null;
        }
        c.a aVar2 = this.f47060j;
        if (aVar2 != null) {
            aVar2.f(new InterfaceC0802n.a("Camera is not active."));
            this.f47060j = null;
        }
    }

    public final void j(androidx.lifecycle.w wVar, Object obj) {
        if (M.x.d()) {
            wVar.setValue(obj);
        } else {
            wVar.postValue(obj);
        }
    }

    public final void k(int i10) {
        j(this.f47052b, Integer.valueOf(i10 != 1 ? 0 : 1));
    }
}
