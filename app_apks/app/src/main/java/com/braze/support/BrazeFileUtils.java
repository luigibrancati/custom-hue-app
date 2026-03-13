package com.braze.support;

import Od.C;
import Od.C1823c;
import Od.F;
import android.content.Context;
import android.content.res.AssetManager;
import android.net.TrafficStats;
import android.net.Uri;
import com.braze.Braze;
import com.braze.communication.g;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import fc.C4034q;
import gc.C4206t;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\f\u001a\u00020\u000b*\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u000e\u001a\u00020\u000b*\u00020\n¢\u0006\u0004\b\u000e\u0010\r\u001aO\u0010\u0017\u001a \u0012\u0004\u0012\u00020\u0000\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0015j\u0002`\u00160\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0019\u0010\u001b\u001a\u00020\u000f*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u001c\"\u0014\u0010\u001d\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\"\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u001f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Ljava/io/File;", "fileOrDirectory", "Lfc/H;", "deleteFileOrDirectory", "(Ljava/io/File;)V", "Landroid/content/Context;", "context", Constants.FILE, "deleteSharedPreferencesFile", "(Landroid/content/Context;Ljava/io/File;)V", "Landroid/net/Uri;", "", "isRemoteUri", "(Landroid/net/Uri;)Z", "isLocalUri", "", "downloadDirectoryAbsolutePath", "remoteFileUrl", "outputFilename", "extension", "Lfc/q;", "", "Lcom/braze/communication/HttpHeaders;", "downloadFileToPath", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lfc/q;", "Landroid/content/res/AssetManager;", "assetPath", "getAssetFileStringContents", "(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/lang/String;", "TAG", "Ljava/lang/String;", "", "REMOTE_SCHEMES", "Ljava/util/List;", "android-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class BrazeFileUtils {
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("BrazeFileUtils");
    public static final List<String> REMOTE_SCHEMES = C4206t.n("http", "https", "ftp", "ftps", "about", "javascript");

    public static final void deleteFileOrDirectory(final File fileOrDirectory) {
        AbstractC4862t.e(fileOrDirectory, "fileOrDirectory");
        if (sc.l.n(fileOrDirectory)) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.a
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeFileUtils.deleteFileOrDirectory$lambda$0(fileOrDirectory);
            }
        }, 12, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deleteFileOrDirectory$lambda$0(File file) {
        return "Could not recursively delete " + file.getName();
    }

    public static final void deleteSharedPreferencesFile(Context context, final File file) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(file, "file");
        if (!file.exists()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.b
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeFileUtils.deleteSharedPreferencesFile$lambda$1(file);
                }
            }, 12, (Object) null);
            return;
        }
        String name = file.getName();
        AbstractC4862t.b(name);
        if (C.D(name, ".xml", false, 2, null)) {
            context.deleteSharedPreferences(F.C0(name, ".xml"));
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.c
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeFileUtils.deleteSharedPreferencesFile$lambda$2(file);
                }
            }, 12, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deleteSharedPreferencesFile$lambda$1(File file) {
        return "Cannot delete SharedPreferences that does not exist. Path: " + file.getAbsolutePath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deleteSharedPreferencesFile$lambda$2(File file) {
        return "SharedPreferences file is expected to end in .xml. Path: " + file.getAbsolutePath();
    }

    public static final C4034q downloadFileToPath(String downloadDirectoryAbsolutePath, final String remoteFileUrl, String outputFilename, String str) throws Exception {
        Exception exc;
        Throwable th;
        AbstractC4862t.e(downloadDirectoryAbsolutePath, "downloadDirectoryAbsolutePath");
        AbstractC4862t.e(remoteFileUrl, "remoteFileUrl");
        AbstractC4862t.e(outputFilename, "outputFilename");
        TrafficStats.setThreadStatsTag(1337);
        if (Braze.INSTANCE.getOutboundNetworkRequestsOffline()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.i
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeFileUtils.downloadFileToPath$lambda$7(remoteFileUrl);
                }
            }, 12, (Object) null);
            throw new Exception("SDK is offline. File not downloaded for url: " + remoteFileUrl);
        }
        if (F.k0(downloadDirectoryAbsolutePath)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.h
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeFileUtils.downloadFileToPath$lambda$8();
                }
            }, 12, (Object) null);
            throw new Exception("Download directory is blank. File not downloaded.");
        }
        if (F.k0(remoteFileUrl)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.g
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeFileUtils.downloadFileToPath$lambda$9();
                }
            }, 12, (Object) null);
            throw new Exception("Zip file url is blank. File not downloaded.");
        }
        if (F.k0(outputFilename)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.f
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeFileUtils.downloadFileToPath$lambda$10();
                }
            }, 12, (Object) null);
            throw new Exception("Output filename is blank. File not downloaded.");
        }
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                new File(downloadDirectoryAbsolutePath).mkdirs();
                if (str != null && !F.k0(str)) {
                    outputFilename = outputFilename + str;
                }
                File file = new File(downloadDirectoryAbsolutePath, outputFilename);
                HttpURLConnection httpURLConnectionA = g.f27565a.a(new URL(remoteFileUrl));
                try {
                    final int responseCode = httpURLConnectionA.getResponseCode();
                    if (responseCode != 200) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.d
                            @Override // vc.InterfaceC6082a
                            public final Object invoke() {
                                return BrazeFileUtils.downloadFileToPath$lambda$11(responseCode, remoteFileUrl);
                            }
                        }, 14, (Object) null);
                        throw new Exception("HTTP response code was " + responseCode + ". File with url " + remoteFileUrl + " could not be downloaded.");
                    }
                    DataInputStream dataInputStream = new DataInputStream(httpURLConnectionA.getInputStream());
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            sc.b.b(dataInputStream, fileOutputStream, 0, 2, null);
                            sc.c.a(fileOutputStream, null);
                            sc.c.a(dataInputStream, null);
                            Map<String, List<String>> headerFields = httpURLConnectionA.getHeaderFields();
                            AbstractC4862t.d(headerFields, "getHeaderFields(...)");
                            LinkedHashMap linkedHashMapA = q.a(headerFields);
                            httpURLConnectionA.disconnect();
                            return new C4034q(file, linkedHashMapA);
                        } finally {
                        }
                    } finally {
                    }
                } catch (Exception e10) {
                    exc = e10;
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f28625E, (Throwable) exc, false, new InterfaceC6082a() { // from class: s5.e
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return BrazeFileUtils.downloadFileToPath$lambda$14(remoteFileUrl);
                        }
                    }, 8, (Object) null);
                    throw new Exception("Exception during download of file from url : " + remoteFileUrl);
                } catch (Throwable th2) {
                    httpURLConnection = httpURLConnectionA;
                    th = th2;
                    if (httpURLConnection == null) {
                        throw th;
                    }
                    httpURLConnection.disconnect();
                    throw th;
                }
            } catch (Exception e11) {
                exc = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static /* synthetic */ C4034q downloadFileToPath$default(String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str4 = null;
        }
        return downloadFileToPath(str, str2, str3, str4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String downloadFileToPath$lambda$10() {
        return "Output filename null or blank. File not downloaded.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String downloadFileToPath$lambda$11(int i10, String str) {
        return "HTTP response code was " + i10 + ". File with url " + str + " could not be downloaded.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String downloadFileToPath$lambda$14(String str) {
        return "Exception during download of file from url : " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String downloadFileToPath$lambda$7(String str) {
        return "SDK is offline. File not downloaded for url: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String downloadFileToPath$lambda$8() {
        return "Download directory null or blank. File not downloaded.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String downloadFileToPath$lambda$9() {
        return "Zip file url null or blank. File not downloaded.";
    }

    public static final String getAssetFileStringContents(AssetManager assetManager, String assetPath) {
        AbstractC4862t.e(assetManager, "<this>");
        AbstractC4862t.e(assetPath, "assetPath");
        InputStream inputStreamOpen = assetManager.open(assetPath);
        AbstractC4862t.d(inputStreamOpen, "open(...)");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, C1823c.f12394b), 8192);
        try {
            String strD = sc.o.d(bufferedReader);
            sc.c.a(bufferedReader, null);
            return strD;
        } finally {
        }
    }

    public static final boolean isLocalUri(Uri uri) {
        AbstractC4862t.e(uri, "<this>");
        String scheme = uri.getScheme();
        return scheme == null || F.k0(scheme) || AbstractC4862t.a(scheme, Constants.FILE);
    }

    public static final boolean isRemoteUri(Uri uri) {
        AbstractC4862t.e(uri, "<this>");
        String scheme = uri.getScheme();
        if (scheme != null && !F.k0(scheme)) {
            return REMOTE_SCHEMES.contains(scheme);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.j
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeFileUtils.isRemoteUri$lambda$6();
            }
        }, 12, (Object) null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isRemoteUri$lambda$6() {
        return "Null or blank Uri scheme.";
    }
}
