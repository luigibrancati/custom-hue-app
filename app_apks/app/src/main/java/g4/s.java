package g4;

import Y0.E;
import android.graphics.Bitmap;
import android.view.View;
import gc.C4204q;
import j4.AbstractC4689h;
import k4.InterfaceC4797c;
import k4.InterfaceC4798d;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import n4.AbstractC5085a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f35510b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Bitmap.Config[] f35511c = {Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f35512a = h.f35448a.a();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public s(n4.l lVar) {
    }

    public final i4.f a(i4.i request, Throwable throwable) {
        AbstractC4862t.e(request, "request");
        AbstractC4862t.e(throwable, "throwable");
        return new i4.f(throwable instanceof i4.l ? request.t() : request.s(), request, throwable);
    }

    public final boolean b(i4.i request, Bitmap.Config requestedConfig) {
        AbstractC4862t.e(request, "request");
        AbstractC4862t.e(requestedConfig, "requestedConfig");
        if (!AbstractC5085a.d(requestedConfig)) {
            return true;
        }
        if (!request.h()) {
            return false;
        }
        InterfaceC4797c interfaceC4797cI = request.I();
        if (interfaceC4797cI instanceof InterfaceC4798d) {
            View view = ((InterfaceC4798d) interfaceC4797cI).getView();
            if (E.K(view) && !view.isHardwareAccelerated()) {
                return false;
            }
        }
        return true;
    }

    public final boolean c(i4.i iVar, AbstractC4689h abstractC4689h) {
        return b(iVar, iVar.j()) && this.f35512a.a(abstractC4689h, null);
    }

    public final boolean d(i4.i iVar) {
        return iVar.J().isEmpty() || C4204q.P(f35511c, iVar.j());
    }

    public final c4.i e(i4.i request, AbstractC4689h size, boolean z10) {
        AbstractC4862t.e(request, "request");
        AbstractC4862t.e(size, "size");
        Bitmap.Config configJ = (d(request) && c(request, size)) ? request.j() : Bitmap.Config.ARGB_8888;
        return new c4.i(request.l(), configJ, request.k(), request.G(), n4.h.b(request), request.i() && request.J().isEmpty() && configJ != Bitmap.Config.ALPHA_8, request.F(), request.v(), request.B(), request.z(), request.q(), z10 ? request.A() : i4.b.DISABLED);
    }
}
