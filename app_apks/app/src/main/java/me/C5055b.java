package me;

import android.net.Uri;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.TimeUnit;
import ke.p;

/* JADX INFO: renamed from: me.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C5055b implements InterfaceC5054a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C5055b f40400a = new C5055b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f40401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f40402c;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f40401b = (int) timeUnit.toMillis(15L);
        f40402c = (int) timeUnit.toMillis(10L);
    }

    @Override // me.InterfaceC5054a
    public HttpURLConnection a(Uri uri) {
        p.e(uri, "url must not be null");
        p.a("https".equals(uri.getScheme()), "only https connections are permitted");
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(uri.toString()).openConnection()));
        httpURLConnection.setConnectTimeout(f40401b);
        httpURLConnection.setReadTimeout(f40402c);
        httpURLConnection.setInstanceFollowRedirects(false);
        return httpURLConnection;
    }
}
