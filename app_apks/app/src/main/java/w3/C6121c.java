package w3;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.webkit.WebResourceResponse;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: w3.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6121c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f46138a;

    /* JADX INFO: renamed from: w3.c$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f46139a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f46140b = "appassets.androidplatform.net";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f46141c = new ArrayList();

        public a a(String str, InterfaceC0632c interfaceC0632c) {
            this.f46141c.add(X0.d.a(str, interfaceC0632c));
            return this;
        }

        public C6121c b() {
            ArrayList arrayList = new ArrayList();
            for (X0.d dVar : this.f46141c) {
                arrayList.add(new d(this.f46140b, (String) dVar.f17986a, this.f46139a, (InterfaceC0632c) dVar.f17987b));
            }
            return new C6121c(arrayList);
        }

        public a c(String str) {
            this.f46140b = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: w3.c$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements InterfaceC0632c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String[] f46142b = {"app_webview/", "databases/", "lib/", "shared_prefs/", "code_cache/"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final File f46143a;

        public b(Context context, File file) {
            try {
                this.f46143a = new File(x3.e.a(file));
                if (b(context)) {
                    return;
                }
                throw new IllegalArgumentException("The given directory \"" + file + "\" doesn't exist under an allowed app internal storage directory");
            } catch (IOException e10) {
                throw new IllegalArgumentException("Failed to resolve the canonical path for the given directory: " + file.getPath(), e10);
            }
        }

        @Override // w3.C6121c.InterfaceC0632c
        public WebResourceResponse a(String str) {
            File fileB;
            try {
                fileB = x3.e.b(this.f46143a, str);
            } catch (IOException e10) {
                Log.e("WebViewAssetLoader", "Error opening the requested path: " + str, e10);
            }
            if (fileB != null) {
                return new WebResourceResponse(x3.e.d(str), null, x3.e.f(fileB));
            }
            Log.e("WebViewAssetLoader", String.format("The requested file: %s is outside the mounted directory: %s", str, this.f46143a));
            return new WebResourceResponse(null, null, null);
        }

        public final boolean b(Context context) throws IOException {
            String strA = x3.e.a(this.f46143a);
            String strA2 = x3.e.a(context.getCacheDir());
            String strA3 = x3.e.a(x3.e.c(context));
            if ((!strA.startsWith(strA2) && !strA.startsWith(strA3)) || strA.equals(strA2) || strA.equals(strA3)) {
                return false;
            }
            for (String str : f46142b) {
                if (strA.startsWith(strA3 + str)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: w3.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface InterfaceC0632c {
        WebResourceResponse a(String str);
    }

    /* JADX INFO: renamed from: w3.c$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f46144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f46145b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f46146c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final InterfaceC0632c f46147d;

        public d(String str, String str2, boolean z10, InterfaceC0632c interfaceC0632c) {
            if (str2.isEmpty() || str2.charAt(0) != '/') {
                throw new IllegalArgumentException("Path should start with a slash '/'.");
            }
            if (!str2.endsWith("/")) {
                throw new IllegalArgumentException("Path should end with a slash '/'");
            }
            this.f46145b = str;
            this.f46146c = str2;
            this.f46144a = z10;
            this.f46147d = interfaceC0632c;
        }

        public String a(String str) {
            return str.replaceFirst(this.f46146c, "");
        }

        public InterfaceC0632c b(Uri uri) {
            if (uri.getScheme().equals("http") && !this.f46144a) {
                return null;
            }
            if ((uri.getScheme().equals("http") || uri.getScheme().equals("https")) && uri.getAuthority().equals(this.f46145b) && uri.getPath().startsWith(this.f46146c)) {
                return this.f46147d;
            }
            return null;
        }
    }

    public C6121c(List list) {
        this.f46138a = list;
    }

    public WebResourceResponse a(Uri uri) {
        WebResourceResponse webResourceResponseA;
        for (d dVar : this.f46138a) {
            InterfaceC0632c interfaceC0632cB = dVar.b(uri);
            if (interfaceC0632cB != null && (webResourceResponseA = interfaceC0632cB.a(dVar.a(uri.getPath()))) != null) {
                return webResourceResponseA;
            }
        }
        return null;
    }
}
