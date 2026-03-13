package x3;

import android.webkit.WebSettings;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebkitToCompatConverterBoundaryInterface f47436a;

    public o(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f47436a = webkitToCompatConverterBoundaryInterface;
    }

    public j a(WebSettings webSettings) {
        return new j((WebSettingsBoundaryInterface) Se.a.a(WebSettingsBoundaryInterface.class, this.f47436a.convertSettings(webSettings)));
    }
}
