package Z;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f20083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f20084c;

    public e(Context context) {
        this.f20082a = context;
        if (Build.VERSION.SDK_INT >= 35) {
            this.f20084c = new c(context);
        }
        this.f20083b = b();
    }

    public d a(String str) {
        ArrayList arrayList = new ArrayList();
        f fVar = this.f20083b;
        if (fVar != null) {
            arrayList.add(fVar.a(str));
        }
        f fVar2 = this.f20084c;
        if (fVar2 != null) {
            try {
                arrayList.add(fVar2.a(str));
            } catch (UnsupportedOperationException unused) {
            }
        }
        return new a(arrayList);
    }

    public final f b() {
        String string;
        try {
            ServiceInfo[] serviceInfoArr = this.f20082a.getPackageManager().getPackageInfo(this.f20082a.getPackageName(), 132).services;
            if (serviceInfoArr == null) {
                return null;
            }
            String str = null;
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY")) != null) {
                    if (str != null) {
                        throw new IllegalStateException("Multiple Play Services CameraDeviceSetupCompat implementations found in the manifest.");
                    }
                    str = string;
                }
            }
            if (str == null) {
                return null;
            }
            return c(str);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final f c(String str) {
        try {
            return (f) Class.forName(str).getConstructor(Context.class).newInstance(this.f20082a);
        } catch (Exception e10) {
            throw new IllegalStateException("Failed to instantiate Play Services CameraDeviceSetupCompat implementation", e10);
        }
    }
}
