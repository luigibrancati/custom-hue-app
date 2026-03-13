package db;

import db.C3857M;
import io.flutter.plugin.common.PluginRegistry;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: db.N, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C3858N implements PluginRegistry.RequestPermissionsResultListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3857M.b f33233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f33234b;

    public C3858N(C3857M.b resultCallback) {
        AbstractC4862t.e(resultCallback, "resultCallback");
        this.f33233a = resultCallback;
    }

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public boolean onRequestPermissionsResult(int i10, String[] permissions, int[] grantResults) {
        AbstractC4862t.e(permissions, "permissions");
        AbstractC4862t.e(grantResults, "grantResults");
        if (this.f33234b || i10 != 1926) {
            return false;
        }
        this.f33234b = true;
        if (grantResults.length != 0 && grantResults[0] == 0) {
            this.f33233a.a(null);
        } else {
            this.f33233a.a("MOBILE_SCANNER_CAMERA_PERMISSION_DENIED");
        }
        return true;
    }
}
