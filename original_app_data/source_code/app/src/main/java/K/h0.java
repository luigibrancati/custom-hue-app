package K;

import E.AbstractC0807p0;
import E.C0781c0;
import E.C0785e0;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6616a = new S.a().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f6617b = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        void d(h0 h0Var);
    }

    public static /* synthetic */ void a(h0 h0Var, C0785e0 c0785e0) {
        boolean z10 = h0Var.i() != null;
        h0Var.k();
        if (!z10) {
            throw new IllegalStateException("One and only one callback is allowed.");
        }
        C0781c0.e eVarI = h0Var.i();
        Objects.requireNonNull(eVarI);
        eVarI.d(c0785e0);
    }

    public static /* synthetic */ void b(h0 h0Var, C0781c0.h hVar) {
        h0Var.k();
        throw null;
    }

    public static /* synthetic */ void c(h0 h0Var, androidx.camera.core.d dVar) {
        C0781c0.e eVarI = h0Var.i();
        Objects.requireNonNull(eVarI);
        Objects.requireNonNull(dVar);
        eVarI.c(dVar);
    }

    public static /* synthetic */ void d(h0 h0Var, Bitmap bitmap) {
        h0Var.k();
        if (h0Var.i() != null) {
            h0Var.i().e(bitmap);
        }
    }

    public static /* synthetic */ void e(h0 h0Var, int i10) {
        h0Var.k();
        if (h0Var.i() != null) {
            h0Var.i().a(i10);
        }
    }

    public boolean f() {
        M.x.b();
        int i10 = this.f6616a;
        if (i10 <= 0) {
            return false;
        }
        this.f6616a = i10 - 1;
        return true;
    }

    public abstract Executor g();

    public abstract Rect h();

    public abstract C0781c0.e i();

    public abstract int j();

    public abstract C0781c0.f k();

    public abstract C0781c0.g l();

    public abstract int m();

    public abstract C0781c0.g n();

    public abstract Matrix o();

    public abstract List p();

    public boolean q() {
        Iterator it = this.f6617b.entrySet().iterator();
        while (it.hasNext()) {
            if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public abstract boolean r();

    public void s(int i10, boolean z10) {
        if (this.f6617b.containsKey(Integer.valueOf(i10))) {
            this.f6617b.put(Integer.valueOf(i10), Boolean.valueOf(z10));
        } else {
            AbstractC0807p0.c("TakePictureRequest", "The format is not supported in simultaneous capture");
        }
    }

    public void t(final int i10) {
        g().execute(new Runnable() { // from class: K.f0
            @Override // java.lang.Runnable
            public final void run() {
                h0.e(this.f6611a, i10);
            }
        });
    }

    public void u(final C0785e0 c0785e0) {
        g().execute(new Runnable() { // from class: K.g0
            @Override // java.lang.Runnable
            public final void run() {
                h0.a(this.f6613a, c0785e0);
            }
        });
    }

    public void v(final Bitmap bitmap) {
        g().execute(new Runnable() { // from class: K.d0
            @Override // java.lang.Runnable
            public final void run() {
                h0.d(this.f6603a, bitmap);
            }
        });
    }

    public void w(final C0781c0.h hVar) {
        g().execute(new Runnable() { // from class: K.e0
            @Override // java.lang.Runnable
            public final void run() {
                h0.b(this.f6607a, hVar);
            }
        });
    }

    public void x(final androidx.camera.core.d dVar) {
        g().execute(new Runnable() { // from class: K.c0
            @Override // java.lang.Runnable
            public final void run() {
                h0.c(this.f6597a, dVar);
            }
        });
    }
}
