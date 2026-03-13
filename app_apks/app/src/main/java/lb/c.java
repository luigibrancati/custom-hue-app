package lb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import f.C3982a;
import fc.C4015H;
import io.sentry.protocol.SentryStackFrame;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;
import mb.C5037b;
import vc.l;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f40020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f40021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f40022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f40023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p f40024e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f40025f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f40026g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Set f40027h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f.c f40028i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f40029j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f.c f40030k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f40031l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f40032m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C5037b f40033n;

    public c(l onSessionCreated, l onSessionResumed, l onSessionPaused, l onArSessionFailed, p onSessionConfigChanged) {
        AbstractC4862t.e(onSessionCreated, "onSessionCreated");
        AbstractC4862t.e(onSessionResumed, "onSessionResumed");
        AbstractC4862t.e(onSessionPaused, "onSessionPaused");
        AbstractC4862t.e(onArSessionFailed, "onArSessionFailed");
        AbstractC4862t.e(onSessionConfigChanged, "onSessionConfigChanged");
        this.f40020a = onSessionCreated;
        this.f40021b = onSessionResumed;
        this.f40022c = onSessionPaused;
        this.f40023d = onArSessionFailed;
        this.f40024e = onSessionConfigChanged;
        this.f40025f = true;
        this.f40026g = true;
    }

    public static final void h(d.p pVar, c cVar, Boolean bool) {
        if (bool.booleanValue() || androidx.core.app.a.y(pVar, "android.permission.CAMERA")) {
            return;
        }
        cVar.f40031l = true;
        cVar.y(pVar);
    }

    public static final void i(c cVar, C3982a c3982a) {
        cVar.f40031l = false;
    }

    public final boolean c(Context context) {
        AbstractC4862t.e(context, "context");
        ArCoreApk.Availability availabilityCheckAvailability = ArCoreApk.getInstance().checkAvailability(context);
        AbstractC4862t.d(availabilityCheckAvailability, "checkAvailability(...)");
        return availabilityCheckAvailability == ArCoreApk.Availability.SUPPORTED_APK_TOO_OLD || availabilityCheckAvailability == ArCoreApk.Availability.SUPPORTED_NOT_INSTALLED;
    }

    public final boolean d(Context context, f.c permissionLauncher) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(permissionLauncher, "permissionLauncher");
        if (p(context)) {
            return true;
        }
        permissionLauncher.a("android.permission.CAMERA");
        return false;
    }

    public final boolean e(d.p activity, boolean z10) {
        AbstractC4862t.e(activity, "activity");
        return r(activity) || !q(activity, z10);
    }

    public final boolean f(d.p activity) {
        boolean z10;
        AbstractC4862t.e(activity, "activity");
        if (this.f40025f && !this.f40029j && !d(activity, m())) {
            this.f40029j = true;
            return false;
        }
        if (this.f40031l) {
            return false;
        }
        try {
            if (!this.f40026g || (z10 = this.f40032m) || e(activity, z10)) {
                return true;
            }
            this.f40032m = true;
            return false;
        } catch (Exception e10) {
            s(e10);
            return false;
        }
    }

    public final void g(Context context, final d.p pVar, Set features) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(features, "features");
        x(features);
        if (pVar == null) {
            j(context);
            return;
        }
        f.c cVarO = pVar.getActivityResultRegistry().o("sceneview_camera_permission", new g.f(), new f.b() { // from class: lb.a
            @Override // f.b
            public final void a(Object obj) {
                c.h(pVar, this, (Boolean) obj);
            }
        });
        AbstractC4862t.d(cVarO, "register(...)");
        w(cVarO);
        f.c cVarO2 = pVar.getActivityResultRegistry().o("sceneview_app_settings", new g.g(), new f.b() { // from class: lb.b
            @Override // f.b
            public final void a(Object obj) {
                c.i(this.f40019a, (C3982a) obj);
            }
        });
        AbstractC4862t.d(cVarO2, "register(...)");
        v(cVarO2);
        if (f(pVar)) {
            j(context);
        }
    }

    public final void j(Context context) {
        AbstractC4862t.e(context, "context");
        try {
            C5037b c5037b = new C5037b(context, n(), this.f40021b, this.f40022c, this.f40024e);
            this.f40020a.invoke(c5037b);
            this.f40033n = c5037b;
        } catch (Exception e10) {
            s(e10);
        }
    }

    public final void k() {
        C5037b c5037b = this.f40033n;
        if (c5037b != null) {
            synchronized (c5037b) {
                try {
                    if (this.f40033n != null) {
                        c5037b.close();
                        this.f40033n = null;
                    }
                    C4015H c4015h = C4015H.f34254a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final f.c l() {
        f.c cVar = this.f40030k;
        if (cVar != null) {
            return cVar;
        }
        AbstractC4862t.p("appSettingsLauncher");
        return null;
    }

    public final f.c m() {
        f.c cVar = this.f40028i;
        if (cVar != null) {
            return cVar;
        }
        AbstractC4862t.p("cameraPermissionLauncher");
        return null;
    }

    public final Set n() {
        Set set = this.f40027h;
        if (set != null) {
            return set;
        }
        AbstractC4862t.p("features");
        return null;
    }

    public final C5037b o() {
        return this.f40033n;
    }

    public final boolean p(Context context) {
        AbstractC4862t.e(context, "context");
        return L0.a.a(context, "android.permission.CAMERA") == 0;
    }

    public final boolean q(d.p activity, boolean z10) throws UnavailableDeviceNotCompatibleException {
        AbstractC4862t.e(activity, "activity");
        if (c(activity)) {
            return ArCoreApk.getInstance().requestInstall(activity, z10 ^ true) == ArCoreApk.InstallStatus.INSTALL_REQUESTED;
        }
        throw new UnavailableDeviceNotCompatibleException();
    }

    public final boolean r(Context context) {
        AbstractC4862t.e(context, "context");
        return ArCoreApk.getInstance().checkAvailability(context) == ArCoreApk.Availability.SUPPORTED_INSTALLED;
    }

    public final void s(Exception exception) {
        AbstractC4862t.e(exception, "exception");
        this.f40023d.invoke(exception);
    }

    public final void t() {
        C5037b c5037b = this.f40033n;
        if (c5037b != null) {
            c5037b.pause();
        }
    }

    public final void u(Context context, d.p pVar) {
        AbstractC4862t.e(context, "context");
        if (this.f40033n == null && (pVar == null || f(pVar))) {
            j(context);
        }
        C5037b c5037b = this.f40033n;
        if (c5037b != null) {
            c5037b.resume();
        }
    }

    public final void v(f.c cVar) {
        AbstractC4862t.e(cVar, "<set-?>");
        this.f40030k = cVar;
    }

    public final void w(f.c cVar) {
        AbstractC4862t.e(cVar, "<set-?>");
        this.f40028i = cVar;
    }

    public final void x(Set set) {
        AbstractC4862t.e(set, "<set-?>");
        this.f40027h = set;
    }

    public final void y(d.p activity) {
        AbstractC4862t.e(activity, "activity");
        Toast.makeText(activity, activity.getString(j.f40081a), 1).show();
        f.c cVarL = l();
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts(SentryStackFrame.JsonKeys.PACKAGE, activity.getPackageName(), null));
        cVarL.a(intent);
    }
}
