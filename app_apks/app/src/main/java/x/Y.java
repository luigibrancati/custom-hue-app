package x;

import E.AbstractC0807p0;
import E.AbstractC0819w;
import L.AbstractC1114o;
import L.InterfaceC1117p0;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Pair;
import android.util.Size;
import androidx.lifecycle.AbstractC2763t;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import y.C6378n;
import z.C6485e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class Y implements L.I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C6378n f46839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D.h f46840c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C6266v f46842e;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final M.t f46847j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final L.X0 f46849l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final InterfaceC1117p0 f46850m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final y.t f46851n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final P.m f46852o;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f46841d = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public M.t f46843f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public M.t f46844g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public M.t f46845h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public M.t f46846i = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f46848k = null;

    public Y(String str, y.t tVar, P.m mVar) {
        String str2 = (String) X0.h.g(str);
        this.f46838a = str2;
        this.f46851n = tVar;
        C6378n c6378nC = tVar.c(str2);
        this.f46839b = c6378nC;
        this.f46840c = new D.h(this);
        L.X0 x0A = A.a.a(str, c6378nC);
        this.f46849l = x0A;
        this.f46850m = new K0(str, x0A);
        this.f46847j = new M.t(AbstractC0819w.a(AbstractC0819w.b.CLOSED));
        this.f46852o = mVar;
    }

    public void A(AbstractC2763t abstractC2763t) {
        this.f46847j.g(abstractC2763t);
    }

    @Override // L.I
    public Set a() {
        int[] iArrD = this.f46839b.e().d();
        if (iArrD == null) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        for (int i10 : iArrD) {
            hashSet.add(Integer.valueOf(i10));
        }
        return hashSet;
    }

    @Override // L.I
    public Set b() {
        return C6485e.a(this.f46839b).c();
    }

    @Override // E.InterfaceC0815u
    public int c() {
        return p(0);
    }

    @Override // L.I
    public String d() {
        return this.f46838a;
    }

    @Override // L.I
    public Rect e() {
        Rect rect = (Rect) this.f46839b.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        return ("robolectric".equals(Build.FINGERPRINT) && rect == null) ? new Rect(0, 0, 4000, 3000) : (Rect) X0.h.g(rect);
    }

    @Override // E.InterfaceC0815u
    public int f() {
        Integer num = (Integer) this.f46839b.a(CameraCharacteristics.LENS_FACING);
        X0.h.b(num != null, "Unable to get the lens facing of the camera.");
        return I1.a(num.intValue());
    }

    @Override // L.I
    public List g(int i10) {
        Size[] sizeArrA = this.f46839b.e().a(i10);
        return sizeArrA != null ? Arrays.asList(sizeArrA) : Collections.EMPTY_LIST;
    }

    @Override // L.I
    public Object h() {
        return this.f46839b.j();
    }

    @Override // E.InterfaceC0815u
    public boolean i() {
        C6378n c6378n = this.f46839b;
        Objects.requireNonNull(c6378n);
        return B.g.a(new X(c6378n));
    }

    @Override // L.I
    public L.X0 k() {
        return this.f46849l;
    }

    @Override // L.I
    public List l(int i10) {
        Size[] sizeArrF = this.f46839b.e().f(i10);
        return sizeArrF != null ? Arrays.asList(sizeArrF) : Collections.EMPTY_LIST;
    }

    @Override // L.I
    public Set m() {
        HashSet hashSet = new HashSet();
        int[] iArr = (int[]) this.f46839b.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i10 : iArr) {
                hashSet.add(Integer.valueOf(i10));
            }
        }
        return hashSet;
    }

    @Override // E.InterfaceC0815u
    public AbstractC2763t n() {
        synchronized (this.f46841d) {
            try {
                C6266v c6266v = this.f46842e;
                if (c6266v == null) {
                    if (this.f46843f == null) {
                        this.f46843f = new M.t(0);
                    }
                    return this.f46843f;
                }
                M.t tVar = this.f46843f;
                if (tVar != null) {
                    return tVar;
                }
                return c6266v.R().g();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // E.InterfaceC0815u
    public AbstractC2763t o() {
        return this.f46847j;
    }

    @Override // E.InterfaceC0815u
    public int p(int i10) {
        return M.c.a(M.c.b(i10), u(), 1 == f());
    }

    @Override // E.InterfaceC0815u
    public AbstractC2763t q() {
        synchronized (this.f46841d) {
            try {
                C6266v c6266v = this.f46842e;
                if (c6266v == null) {
                    if (this.f46846i == null) {
                        this.f46846i = new M.t(r2.h(this.f46839b));
                    }
                    return this.f46846i;
                }
                M.t tVar = this.f46846i;
                if (tVar != null) {
                    return tVar;
                }
                return c6266v.T().j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public D.h s() {
        return this.f46840c;
    }

    public C6378n t() {
        return this.f46839b;
    }

    public int u() {
        Integer num = (Integer) this.f46839b.a(CameraCharacteristics.SENSOR_ORIENTATION);
        X0.h.g(num);
        return num.intValue();
    }

    public int v() {
        Integer num = (Integer) this.f46839b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        X0.h.g(num);
        return num.intValue();
    }

    public boolean w() {
        return K1.b(this.f46839b);
    }

    public void x(C6266v c6266v) {
        synchronized (this.f46841d) {
            try {
                this.f46842e = c6266v;
                M.t tVar = this.f46846i;
                if (tVar != null) {
                    tVar.g(c6266v.T().j());
                }
                M.t tVar2 = this.f46843f;
                if (tVar2 != null) {
                    tVar2.g(this.f46842e.R().g());
                }
                M.t tVar3 = this.f46844g;
                if (tVar3 != null) {
                    tVar3.g(this.f46842e.R().h());
                }
                M.t tVar4 = this.f46845h;
                if (tVar4 != null) {
                    tVar4.g(this.f46842e.G().c());
                }
                List<Pair> list = this.f46848k;
                if (list != null) {
                    for (Pair pair : list) {
                        this.f46842e.z((Executor) pair.second, (AbstractC1114o) pair.first);
                    }
                    this.f46848k = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        y();
    }

    public final void y() {
        z();
    }

    public final void z() {
        String str;
        int iV = v();
        if (iV == 0) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        } else if (iV == 1) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
        } else if (iV == 2) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
        } else if (iV == 3) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
        } else if (iV != 4) {
            str = "Unknown value: " + iV;
        } else {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
        }
        AbstractC0807p0.e("Camera2CameraInfo", "Device Level: " + str);
    }
}
