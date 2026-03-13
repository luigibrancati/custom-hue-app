package hb;

import android.net.Uri;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import me.InterfaceC5054a;

/* JADX INFO: renamed from: hb.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C4295b implements InterfaceC5054a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4295b f36470a = new C4295b();

    @Override // me.InterfaceC5054a
    public HttpURLConnection a(Uri uri) {
        return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(uri.toString()).openConnection()));
    }
}
