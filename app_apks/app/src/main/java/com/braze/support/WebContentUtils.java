package com.braze.support;

import Od.C;
import Od.F;
import android.content.Context;
import com.braze.support.BrazeLogger;
import com.braze.support.WebContentUtils;
import fc.C4015H;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.L;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/braze/support/WebContentUtils;", "", "<init>", "()V", "Ljava/io/File;", "localDirectory", "", "remoteZipUrl", "getLocalHtmlUrlFromRemoteUrl", "(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;", "unpackDirectory", "zipFile", "", "unpackZipIntoDirectory", "(Ljava/lang/String;Ljava/io/File;)Z", "Landroid/content/Context;", "context", "getHtmlInAppMessageAssetCacheDirectory", "(Landroid/content/Context;)Ljava/io/File;", "originalString", "", "remoteToLocalAssetMap", "replacePrefetchedUrlsWithLocalAssets", "(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;", "intendedParentDirectory", "childFilePath", "validateChildFileExistsUnderParent", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WebContentUtils {
    public static final WebContentUtils INSTANCE = new WebContentUtils();

    private WebContentUtils() {
    }

    public static final File getHtmlInAppMessageAssetCacheDirectory(Context context) {
        AbstractC4862t.e(context, "context");
        return new File(context.getCacheDir().getPath() + "/braze-html-inapp-messages");
    }

    public static final String getLocalHtmlUrlFromRemoteUrl(File localDirectory, final String remoteZipUrl) {
        AbstractC4862t.e(localDirectory, "localDirectory");
        AbstractC4862t.e(remoteZipUrl, "remoteZipUrl");
        if (F.k0(remoteZipUrl)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.C0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return WebContentUtils.getLocalHtmlUrlFromRemoteUrl$lambda$0();
                }
            }, 6, (Object) null);
            return null;
        }
        String absolutePath = localDirectory.getAbsolutePath();
        String strValueOf = String.valueOf(IntentUtils.getRequestCode());
        final String str = absolutePath + "/" + strValueOf;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        WebContentUtils webContentUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) webContentUtils, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.F0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return WebContentUtils.getLocalHtmlUrlFromRemoteUrl$lambda$1(remoteZipUrl, str);
            }
        }, 7, (Object) null);
        try {
            File file = (File) BrazeFileUtils.downloadFileToPath(str, remoteZipUrl, strValueOf, ".zip").a();
            BrazeLogger.brazelog$default(brazeLogger, (Object) webContentUtils, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.G0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return WebContentUtils.getLocalHtmlUrlFromRemoteUrl$lambda$3(remoteZipUrl, str);
                }
            }, 7, (Object) null);
            if (unpackZipIntoDirectory(str, file)) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) webContentUtils, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.I0
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return WebContentUtils.getLocalHtmlUrlFromRemoteUrl$lambda$5(str);
                    }
                }, 7, (Object) null);
                return str;
            }
            BrazeLogger.brazelog$default(brazeLogger, (Object) webContentUtils, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.H0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return WebContentUtils.getLocalHtmlUrlFromRemoteUrl$lambda$4();
                }
            }, 6, (Object) null);
            BrazeFileUtils.deleteFileOrDirectory(new File(str));
            return null;
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: s5.J0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return WebContentUtils.getLocalHtmlUrlFromRemoteUrl$lambda$2(remoteZipUrl);
                }
            }, 4, (Object) null);
            BrazeFileUtils.deleteFileOrDirectory(new File(str));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalHtmlUrlFromRemoteUrl$lambda$0() {
        return "Remote zip url is empty. No local URL will be created.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalHtmlUrlFromRemoteUrl$lambda$1(String str, String str2) {
        return "Starting download of url: " + str + " to " + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalHtmlUrlFromRemoteUrl$lambda$2(String str) {
        return "Could not download zip file to local storage. " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalHtmlUrlFromRemoteUrl$lambda$3(String str, String str2) {
        return "Html content zip downloaded. " + str + " to " + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalHtmlUrlFromRemoteUrl$lambda$4() {
        return "Error during the zip unpack.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalHtmlUrlFromRemoteUrl$lambda$5(String str) {
        return "Html content zip unpacked to to " + str + ".";
    }

    public static final String replacePrefetchedUrlsWithLocalAssets(String originalString, Map<String, String> remoteToLocalAssetMap) {
        AbstractC4862t.e(originalString, "originalString");
        AbstractC4862t.e(remoteToLocalAssetMap, "remoteToLocalAssetMap");
        String strL = originalString;
        for (Map.Entry<String, String> entry : remoteToLocalAssetMap.entrySet()) {
            final String value = entry.getValue();
            if (new File(value).exists()) {
                final String key = entry.getKey();
                if (F.V(value, "ab_triggers", false, 2, null)) {
                    final String str = "https://iamcache.braze/ab_triggers" + ((String) F.I0(value, new String[]{"ab_triggers"}, false, 0, 6, null).get(1));
                    if (F.V(strL, key, false, 2, null)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.L0
                            @Override // vc.InterfaceC6082a
                            public final Object invoke() {
                                return WebContentUtils.replacePrefetchedUrlsWithLocalAssets$lambda$13(key, str);
                            }
                        }, 7, (Object) null);
                        strL = C.L(strL, key, str, false, 4, null);
                    }
                }
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.K0
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return WebContentUtils.replacePrefetchedUrlsWithLocalAssets$lambda$12(value);
                    }
                }, 6, (Object) null);
            }
        }
        return strL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String replacePrefetchedUrlsWithLocalAssets$lambda$12(String str) {
        return "Cannot find local asset file at path: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String replacePrefetchedUrlsWithLocalAssets$lambda$13(String str, String str2) {
        return "Replacing remote url \"" + str + "\" with local uri \"" + str2 + "\"";
    }

    public static final boolean unpackZipIntoDirectory(final String unpackDirectory, final File zipFile) {
        AbstractC4862t.e(unpackDirectory, "unpackDirectory");
        AbstractC4862t.e(zipFile, "zipFile");
        if (F.k0(unpackDirectory)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.M0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return WebContentUtils.unpackZipIntoDirectory$lambda$6();
                }
            }, 6, (Object) null);
            return false;
        }
        new File(unpackDirectory).mkdirs();
        try {
            final L l10 = new L();
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(zipFile));
            try {
                for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                    String name = nextEntry.getName();
                    l10.f39776a = name;
                    Locale US = Locale.US;
                    AbstractC4862t.d(US, "US");
                    String lowerCase = name.toLowerCase(US);
                    AbstractC4862t.d(lowerCase, "toLowerCase(...)");
                    if (!C.P(lowerCase, "__macosx", false, 2, null)) {
                        try {
                            String strValidateChildFileExistsUnderParent = validateChildFileExistsUnderParent(unpackDirectory, unpackDirectory + "/" + l10.f39776a);
                            if (nextEntry.isDirectory()) {
                                new File(strValidateChildFileExistsUnderParent).mkdirs();
                            } else {
                                try {
                                    File parentFile = new File(strValidateChildFileExistsUnderParent).getParentFile();
                                    if (parentFile != null) {
                                        parentFile.mkdirs();
                                    }
                                } catch (Exception e10) {
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: s5.N0
                                        @Override // vc.InterfaceC6082a
                                        public final Object invoke() {
                                            return WebContentUtils.unpackZipIntoDirectory$lambda$10$lambda$7(l10);
                                        }
                                    }, 4, (Object) null);
                                }
                                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(strValidateChildFileExistsUnderParent));
                                try {
                                    sc.b.b(zipInputStream, bufferedOutputStream, 0, 2, null);
                                    sc.c.a(bufferedOutputStream, null);
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        sc.c.a(bufferedOutputStream, th);
                                        throw th2;
                                    }
                                }
                            }
                        } catch (Exception e11) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f28625E, (Throwable) e11, false, new InterfaceC6082a() { // from class: s5.D0
                                @Override // vc.InterfaceC6082a
                                public final Object invoke() {
                                    return WebContentUtils.unpackZipIntoDirectory$lambda$10$lambda$9(l10);
                                }
                            }, 4, (Object) null);
                        }
                    }
                    zipInputStream.closeEntry();
                }
                C4015H c4015h = C4015H.f34254a;
                sc.c.a(zipInputStream, null);
                return true;
            } finally {
            }
        } catch (Throwable th3) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f28625E, th3, false, new InterfaceC6082a() { // from class: s5.E0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return WebContentUtils.unpackZipIntoDirectory$lambda$11(zipFile, unpackDirectory);
                }
            }, 4, (Object) null);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unpackZipIntoDirectory$lambda$10$lambda$7(L l10) {
        return "Error creating parent directory " + l10.f39776a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unpackZipIntoDirectory$lambda$10$lambda$9(L l10) {
        return "Error unpacking zipEntry " + l10.f39776a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unpackZipIntoDirectory$lambda$11(File file, String str) {
        return "Error during unpack of zip file " + file.getAbsolutePath() + " to " + str + ".";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unpackZipIntoDirectory$lambda$6() {
        return "Unpack directory is blank. Zip file not unpacked.";
    }

    public static final String validateChildFileExistsUnderParent(String intendedParentDirectory, String childFilePath) throws IOException {
        AbstractC4862t.e(intendedParentDirectory, "intendedParentDirectory");
        AbstractC4862t.e(childFilePath, "childFilePath");
        String canonicalPath = new File(intendedParentDirectory).getCanonicalPath();
        String canonicalPath2 = new File(childFilePath).getCanonicalPath();
        AbstractC4862t.b(canonicalPath2);
        AbstractC4862t.b(canonicalPath);
        if (C.P(canonicalPath2, canonicalPath, false, 2, null)) {
            return canonicalPath2;
        }
        throw new IllegalStateException("Invalid file with original path: " + childFilePath + " with canonical path: " + canonicalPath2 + " does not exist under intended parent with  path: " + intendedParentDirectory + " and canonical path: " + canonicalPath);
    }
}
