package u;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import java.util.List;

/* JADX INFO: renamed from: u.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5891f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f45015a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ICustomTabsService f45016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ICustomTabsCallback f45017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ComponentName f45018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PendingIntent f45019e;

    public C5891f(ICustomTabsService iCustomTabsService, ICustomTabsCallback iCustomTabsCallback, ComponentName componentName, PendingIntent pendingIntent) {
        this.f45016b = iCustomTabsService;
        this.f45017c = iCustomTabsCallback;
        this.f45018d = componentName;
        this.f45019e = pendingIntent;
    }

    public final void a(Bundle bundle) {
        PendingIntent pendingIntent = this.f45019e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
    }

    public final Bundle b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        a(bundle2);
        return bundle2;
    }

    public IBinder c() {
        return this.f45017c.asBinder();
    }

    public ComponentName d() {
        return this.f45018d;
    }

    public PendingIntent e() {
        return this.f45019e;
    }

    public boolean f(Uri uri, Bundle bundle, List list) {
        try {
            return this.f45016b.X3(this.f45017c, uri, b(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
