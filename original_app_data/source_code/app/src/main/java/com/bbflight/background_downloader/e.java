package com.bbflight.background_downloader;

import Od.B;
import Od.F;
import Od.o;
import Od.q;
import Q4.EnumC1889i;
import Q4.Task;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import fc.C4032o;
import fc.C4034q;
import gc.C4179C;
import gc.Q;
import java.io.File;
import java.net.URLDecoder;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC4862t;
import org.apache.tika.metadata.HttpHeaders;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27062a;

        static {
            int[] iArr = new int[EnumC1889i.values().length];
            try {
                iArr[EnumC1889i.applicationDocuments.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1889i.temporary.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC1889i.applicationSupport.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC1889i.applicationLibrary.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC1889i.root.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f27062a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements X509TrustManager {
        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] chain, String authType) {
            AbstractC4862t.e(chain, "chain");
            AbstractC4862t.e(authType, "authType");
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] chain, String authType) {
            AbstractC4862t.e(chain, "chain");
            AbstractC4862t.e(authType, "authType");
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    public static final void a() {
        try {
            TrustManager[] trustManagerArr = {new b()};
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, trustManagerArr, new SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sSLContext.getSocketFactory());
            Log.w("BackgroundDownloader", "Bypassing TLS certificate validation\nHTTPS calls will NOT check the validity of the TLS certificate.");
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public static final String b(Context context, EnumC1889i baseDirectory) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(baseDirectory, "baseDirectory");
        if (!(T2.b.a(context).getInt("com.bbflight.background_downloader.config.useExternalStorage", -1) == 0)) {
            int i10 = a.f27062a[baseDirectory.ordinal()];
            if (i10 == 1) {
                String path = context.getDataDir().getPath();
                AbstractC4862t.d(path, "getPath(...)");
                Path path2 = Paths.get(path, (String[]) Arrays.copyOf(new String[]{"app_flutter"}, 1));
                AbstractC4862t.d(path2, "get(...)");
                return path2.toString();
            }
            if (i10 == 2) {
                String path3 = context.getCacheDir().getPath();
                AbstractC4862t.d(path3, "getPath(...)");
                return path3;
            }
            if (i10 == 3) {
                String path4 = context.getFilesDir().getPath();
                AbstractC4862t.d(path4, "getPath(...)");
                return path4;
            }
            if (i10 != 4) {
                if (i10 == 5) {
                    return "";
                }
                throw new C4032o();
            }
            String path5 = context.getFilesDir().getPath();
            AbstractC4862t.d(path5, "getPath(...)");
            Path path6 = Paths.get(path5, (String[]) Arrays.copyOf(new String[]{"Library"}, 1));
            AbstractC4862t.d(path6, "get(...)");
            return path6.toString();
        }
        File externalFilesDir = context.getExternalFilesDir(null);
        File externalCacheDir = context.getExternalCacheDir();
        if (externalFilesDir == null || externalCacheDir == null) {
            Log.e("TaskRunner", "Could not access external storage");
            return null;
        }
        int i11 = a.f27062a[baseDirectory.ordinal()];
        if (i11 == 1) {
            String path7 = externalFilesDir.getPath();
            AbstractC4862t.d(path7, "getPath(...)");
            return path7;
        }
        if (i11 == 2) {
            String path8 = externalCacheDir.getPath();
            AbstractC4862t.d(path8, "getPath(...)");
            return path8;
        }
        if (i11 == 3) {
            return externalFilesDir.getPath() + "/Support";
        }
        if (i11 != 4) {
            if (i11 == 5) {
                return "";
            }
            throw new C4032o();
        }
        return externalFilesDir.getPath() + "/Library";
    }

    public static final Map c(Map map) {
        if (map == null) {
            return Q.i();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key != null && value != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static final String d(File file) {
        AbstractC4862t.e(file, "file");
        String name = file.getName();
        String strO = sc.l.o(file);
        AbstractC4862t.b(name);
        return F.c1(name, "." + strO, null, 2, null);
    }

    public static final long e(Map responseHeaders, Task task) {
        long jLongValue;
        String str;
        long jLongValue2;
        Long lW;
        String str2;
        Long lW2;
        AbstractC4862t.e(responseHeaders, "responseHeaders");
        AbstractC4862t.e(task, "task");
        List list = (List) responseHeaders.get(HttpHeaders.CONTENT_LENGTH);
        if (list == null || (str2 = (String) list.get(0)) == null || (lW2 = B.w(str2)) == null) {
            List list2 = (List) responseHeaders.get("content-length");
            Long lW3 = (list2 == null || (str = (String) list2.get(0)) == null) ? null : B.w(str);
            jLongValue = lW3 != null ? lW3.longValue() : -1L;
        } else {
            jLongValue = lW2.longValue();
        }
        if (jLongValue != -1) {
            return jLongValue;
        }
        String str3 = (String) task.getHeaders().get("Range");
        if (str3 == null && (str3 = (String) task.getHeaders().get("range")) == null) {
            str3 = "";
        }
        C4034q c4034qH = h(str3);
        if (c4034qH.f() != null) {
            Object objF = c4034qH.f();
            AbstractC4862t.b(objF);
            long jLongValue3 = (((Number) objF).longValue() - ((Number) c4034qH.e()).longValue()) + 1;
            Log.d("TaskRunner", "TaskId " + task.getTaskId() + " contentLength set to " + jLongValue3 + " based on Range header");
            return jLongValue3;
        }
        String str4 = (String) task.getHeaders().get("Known-Content-Length");
        if (str4 == null || (lW = B.w(str4)) == null) {
            String str5 = (String) task.getHeaders().get("known-content-length");
            Long lW4 = str5 != null ? B.w(str5) : null;
            jLongValue2 = lW4 != null ? lW4.longValue() : -1L;
        } else {
            jLongValue2 = lW.longValue();
        }
        if (jLongValue2 == -1) {
            Log.d("TaskRunner", "TaskId " + task.getTaskId() + " contentLength undetermined");
            return jLongValue2;
        }
        Log.d("TaskRunner", "TaskId " + task.getTaskId() + " contentLength set to " + jLongValue2 + " based on Known-Content-Length header");
        return jLongValue2;
    }

    public static final String f(Uri uri) {
        AbstractC4862t.e(uri, "uri");
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return "";
        }
        int iO0 = F.o0(lastPathSegment, "/", 0, false, 6, null);
        if (iO0 == -1) {
            return lastPathSegment;
        }
        String strSubstring = lastPathSegment.substring(iO0 + 1);
        AbstractC4862t.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final boolean g(Context applicationContext, long j10) {
        int i10;
        AbstractC4862t.e(applicationContext, "applicationContext");
        if (j10 <= 0 || (i10 = T2.b.a(applicationContext).getInt("com.bbflight.background_downloader.config.checkAvailableSpace", 0)) <= 0) {
            return false;
        }
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return (statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong()) - (C4179C.L0(com.bbflight.background_downloader.a.INSTANCE.w().values()) + j10) < (((long) i10) << 20);
    }

    public static final C4034q h(String rangeStr) {
        AbstractC4862t.e(rangeStr, "rangeStr");
        Od.k kVarD = o.d(new o("bytes=(\\d*)-(\\d*)"), rangeStr, 0, 2, null);
        if (kVarD == null) {
            return new C4034q(0L, null);
        }
        Long lW = B.w((String) kVarD.b().get(1));
        return new C4034q(Long.valueOf(lW != null ? lW.longValue() : 0L), B.w((String) kVarD.b().get(2)));
    }

    public static final String i(Map responseHeaders, String url) {
        Od.k kVarD;
        AbstractC4862t.e(responseHeaders, "responseHeaders");
        AbstractC4862t.e(url, "url");
        try {
            List list = (List) responseHeaders.get(HttpHeaders.CONTENT_DISPOSITION);
            if (list == null) {
                list = (List) responseHeaders.get("content-disposition");
            }
            String str = list != null ? (String) list.get(0) : null;
            if (str != null) {
                Od.k kVarD2 = o.d(new o("filename\\*=\\s*([^']+)'([^']*)'\"?([^\"]+)\"?", q.IGNORE_CASE), str, 0, 2, null);
                if (kVarD2 != null && ((CharSequence) kVarD2.b().get(1)).length() > 0 && ((CharSequence) kVarD2.b().get(3)).length() > 0) {
                    try {
                        String upperCase = ((String) kVarD2.b().get(1)).toUpperCase(Locale.ROOT);
                        AbstractC4862t.d(upperCase, "toUpperCase(...)");
                        String strDecode = AbstractC4862t.a(upperCase, "UTF-8") ? URLDecoder.decode((String) kVarD2.b().get(3), "UTF-8") : (String) kVarD2.b().get(3);
                        AbstractC4862t.b(strDecode);
                        return strDecode;
                    } catch (IllegalArgumentException unused) {
                        Log.d("TaskRunner", "Could not interpret suggested filename (UTF-8 url encoded) " + kVarD2.b().get(3));
                        kVarD = o.d(new o("filename=\\s*\"?([^\"]+)\"?.*$", q.IGNORE_CASE), str, 0, 2, null);
                        if (kVarD != null) {
                            return (String) kVarD.b().get(1);
                        }
                        Uri uri = Uri.parse(url);
                        AbstractC4862t.b(uri);
                        return f(uri);
                    }
                }
                kVarD = o.d(new o("filename=\\s*\"?([^\"]+)\"?.*$", q.IGNORE_CASE), str, 0, 2, null);
                if (kVarD != null && ((CharSequence) kVarD.b().get(1)).length() > 0) {
                    return (String) kVarD.b().get(1);
                }
            }
        } catch (Throwable unused2) {
        }
        try {
            Uri uri2 = Uri.parse(url);
            AbstractC4862t.b(uri2);
            return f(uri2);
        } catch (Throwable unused3) {
            return "";
        }
    }
}
