package db;

import android.app.Activity;
import io.flutter.plugin.common.PluginRegistry;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: db.M, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C3857M {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f33228c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PluginRegistry.RequestPermissionsResultListener f33229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f33230b;

    /* JADX INFO: renamed from: db.M$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: db.M$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        void a(String str);
    }

    /* JADX INFO: renamed from: db.M$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c implements b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f33232b;

        public c(b bVar) {
            this.f33232b = bVar;
        }

        @Override // db.C3857M.b
        public void a(String str) {
            C3857M.this.f33230b = false;
            C3857M.this.f33229a = null;
            this.f33232b.a(str);
        }
    }

    public final PluginRegistry.RequestPermissionsResultListener c() {
        return this.f33229a;
    }

    public final int d(Activity activity) {
        AbstractC4862t.e(activity, "activity");
        return L0.a.a(activity, "android.permission.CAMERA") == 0 ? 1 : 2;
    }

    public final void e(Activity activity, vc.l addPermissionListener, b callback) {
        AbstractC4862t.e(activity, "activity");
        AbstractC4862t.e(addPermissionListener, "addPermissionListener");
        AbstractC4862t.e(callback, "callback");
        if (this.f33230b) {
            callback.a("MOBILE_SCANNER_CAMERA_PERMISSION_REQUEST_PENDING");
            return;
        }
        if (d(activity) == 1) {
            callback.a(null);
            return;
        }
        if (this.f33229a == null) {
            C3858N c3858n = new C3858N(new c(callback));
            this.f33229a = c3858n;
            addPermissionListener.invoke(c3858n);
        }
        this.f33230b = true;
        androidx.core.app.a.v(activity, new String[]{"android.permission.CAMERA"}, 1926);
    }
}
