package G7;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.concurrent.Callable;
import rb.k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g {
    public static /* synthetic */ InputStream a(AssetManager assetManager, String str, String str2) {
        return g(assetManager, str) ? assetManager.open(str) : new FileInputStream(new File(str2));
    }

    public static /* synthetic */ InputStream c(boolean z10, String str) {
        return new ByteArrayInputStream(z10 ? Base64.decode(str, 0) : str.getBytes());
    }

    public static Callable f(final Context context, final Uri uri) {
        String path = uri.getPath();
        String strSubstring = path.substring(1, path.lastIndexOf(47));
        if (strSubstring.equals("raw") || strSubstring.equals("drawable")) {
            return new Callable() { // from class: G7.d
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return context.getContentResolver().openInputStream(uri);
                }
            };
        }
        throw new IllegalArgumentException("Unknown resource resourceType '" + strSubstring + "' in uri '" + uri + "'. Resource will not be loaded");
    }

    public static boolean g(AssetManager assetManager, String str) throws IOException {
        String[] list;
        int iLastIndexOf = str.lastIndexOf(47);
        if (iLastIndexOf != -1) {
            String strSubstring = str.substring(iLastIndexOf + 1);
            list = assetManager.list(str.substring(0, iLastIndexOf));
            str = strSubstring;
        } else {
            list = assetManager.list("");
        }
        if (list != null) {
            for (String str2 : list) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Callable h(final Context context, final Uri uri) {
        return new Callable() { // from class: G7.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return context.getContentResolver().openInputStream(uri);
            }
        };
    }

    public static Callable i(Uri uri) {
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int iIndexOf = schemeSpecificPart.indexOf(44);
        if (iIndexOf < 0) {
            throw new IllegalArgumentException("Malformed data uri - does not contain a ','");
        }
        final boolean zContains = schemeSpecificPart.substring(0, iIndexOf).contains(";base64");
        final String strSubstring = schemeSpecificPart.substring(iIndexOf + 1);
        return new Callable() { // from class: G7.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return g.c(zContains, strSubstring);
            }
        };
    }

    public static Callable j(Context context, Uri uri) {
        final String authority;
        final AssetManager assets = context.getAssets();
        if (uri.getAuthority() == null) {
            authority = uri.getPath();
        } else if (uri.getPath().isEmpty()) {
            authority = uri.getAuthority();
        } else {
            authority = uri.getAuthority() + uri.getPath();
        }
        final String strT = t(authority);
        return new Callable() { // from class: G7.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return g.a(assets, strT, authority);
            }
        };
    }

    public static Callable k(Context context, Uri uri) {
        return l(context, uri, null);
    }

    public static Callable l(Context context, Uri uri, Map map) {
        k.d(uri, "Parameter \"sourceUri\" was null.");
        k.d(context, "Parameter \"context\" was null.");
        return q(uri).booleanValue() ? j(context, uri) : n(uri).booleanValue() ? f(context, uri) : o(uri).booleanValue() ? h(context, uri) : r(uri) ? i(uri) : s(uri, map);
    }

    public static String m(String str) {
        if (str.startsWith("model/gltf-binary")) {
            return "glb";
        }
        if (str.startsWith("model/gltf+json")) {
            return "gltf";
        }
        return null;
    }

    public static Boolean n(Uri uri) {
        k.d(uri, "Parameter \"sourceUri\" was null.");
        return Boolean.valueOf(TextUtils.equals("android.resource", uri.getScheme()));
    }

    public static Boolean o(Uri uri) {
        k.d(uri, "Parameter \"sourceUri\" was null.");
        return Boolean.valueOf(TextUtils.equals("content", uri.getScheme()));
    }

    public static boolean p(Uri uri) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("data");
    }

    public static Boolean q(Uri uri) {
        k.d(uri, "Parameter \"sourceUri\" was null.");
        String scheme = uri.getScheme();
        return Boolean.valueOf(TextUtils.isEmpty(scheme) || Constants.FILE.equals(scheme));
    }

    public static boolean r(Uri uri) {
        return p(uri) && m(uri.getSchemeSpecificPart()) != null;
    }

    public static Callable s(Uri uri, Map map) {
        try {
            final URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(uri.toString()).openConnection());
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    uRLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            return new Callable() { // from class: G7.e
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return uRLConnection.getInputStream();
                }
            };
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException("Unable to parse url: '" + uri + "'", e10);
        } catch (IOException e11) {
            throw new AssertionError("Error opening url connection: '" + uri + "'", e11);
        }
    }

    public static String t(String str) {
        return str.startsWith("/android_asset/") ? str.substring(15) : str;
    }
}
