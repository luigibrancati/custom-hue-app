package X6;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import io.sentry.ProfileChunk;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import org.webrtc.WebrtcBuildVersion;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class E2 extends C6 {
    public E2(R6 r62) {
        super(r62);
    }

    @Override // X6.C6
    public final boolean l() {
        return false;
    }

    public final boolean m() {
        j();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f18400a.d().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final void n(String str, D6 d62, com.google.android.gms.internal.measurement.X2 x22, B2 b22) {
        E2 e22;
        String str2;
        h();
        j();
        try {
            URL url = new URI(d62.a()).toURL();
            this.f19261b.K0();
            byte[] bArrB = x22.b();
            e22 = this;
            str2 = str;
            try {
                this.f18400a.b().w(new D2(e22, str2, url, bArrB, d62.b(), b22));
            } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
                e22.f18400a.a().o().c("Failed to parse URL. Not uploading MeasurementBatch. appId", C2542z2.x(str2), d62.a());
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            e22 = this;
            str2 = str;
        }
    }

    public final void o(F2 f22, Map map, B2 b22) {
        E2 e22;
        h();
        j();
        AbstractC6056k.l(f22);
        AbstractC6056k.l(b22);
        E6 e6C0 = this.f19261b.C0();
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder builderAppendQueryParameter = builder.scheme((String) AbstractC2383f2.f18884f.b(null)).encodedAuthority((String) AbstractC2383f2.f18887g.b(null)).path("config/app/".concat(String.valueOf(f22.r0()))).appendQueryParameter("platform", ProfileChunk.PLATFORM_ANDROID);
        e6C0.f18400a.w().A();
        builderAppendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(133005L)).appendQueryParameter("runtime_version", WebrtcBuildVersion.maint_version);
        String string = builder.build().toString();
        try {
            URL url = new URI(string).toURL();
            e22 = this;
            try {
                this.f18400a.b().w(new D2(e22, f22.o0(), url, null, map, b22));
            } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
                e22.f18400a.a().o().c("Failed to parse config URL. Not fetching. appId", C2542z2.x(f22.o0()), string);
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            e22 = this;
        }
    }
}
