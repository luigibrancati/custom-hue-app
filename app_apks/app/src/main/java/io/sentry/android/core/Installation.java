package io.sentry.android.core;

import android.content.Context;
import io.sentry.ISentryLifecycleToken;
import io.sentry.SentryUUID;
import io.sentry.util.AutoClosableReentrantLock;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
final class Installation {
    static final String INSTALLATION = "INSTALLATION";
    static String deviceId;
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    protected static final AutoClosableReentrantLock staticLock = new AutoClosableReentrantLock();

    private Installation() {
    }

    public static String id(Context context) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = staticLock.acquire();
        try {
            if (deviceId == null) {
                File file = new File(context.getFilesDir(), INSTALLATION);
                try {
                    if (!file.exists()) {
                        String strWriteInstallationFile = writeInstallationFile(file);
                        deviceId = strWriteInstallationFile;
                        if (iSentryLifecycleTokenAcquire != null) {
                            iSentryLifecycleTokenAcquire.close();
                        }
                        return strWriteInstallationFile;
                    }
                    deviceId = readInstallationFile(file);
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
            String str = deviceId;
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            return str;
        } catch (Throwable th2) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public static String readInstallationFile(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            byte[] bArr = new byte[(int) randomAccessFile.length()];
            randomAccessFile.readFully(bArr);
            String str = new String(bArr, UTF_8);
            randomAccessFile.close();
            return str;
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String writeInstallationFile(File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            String strGenerateSentryId = SentryUUID.generateSentryId();
            fileOutputStream.write(strGenerateSentryId.getBytes(UTF_8));
            fileOutputStream.flush();
            fileOutputStream.close();
            return strGenerateSentryId;
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
