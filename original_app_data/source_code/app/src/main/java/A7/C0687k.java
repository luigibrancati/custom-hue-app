package A7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.io.File;

/* JADX INFO: renamed from: A7.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C0687k implements B7.N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B7.N f207a;

    public C0687k(B7.N n10) {
        this.f207a = n10;
    }

    @Override // B7.N
    public final /* bridge */ /* synthetic */ Object zza() {
        String string;
        Context contextA = ((C0685i) this.f207a).a();
        try {
            Bundle bundle = contextA.getPackageManager().getApplicationInfo(contextA.getPackageName(), 128).metaData;
            if (bundle != null && (string = bundle.getString("local_testing_dir")) != null) {
                return new File(contextA.getExternalFilesDir(null), string);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }
}
