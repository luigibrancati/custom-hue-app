package f4;

import android.net.Uri;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.File;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: f4.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C3990a implements InterfaceC3991b {
    @Override // f4.InterfaceC3991b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri data) {
        String strC;
        AbstractC4862t.e(data, "data");
        return (!AbstractC4862t.a(data.getScheme(), Constants.FILE) || (strC = n4.e.c(data)) == null || AbstractC4862t.a(strC, "android_asset")) ? false : true;
    }

    @Override // f4.InterfaceC3991b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public File map(Uri data) {
        AbstractC4862t.e(data, "data");
        return T0.c.a(data);
    }
}
