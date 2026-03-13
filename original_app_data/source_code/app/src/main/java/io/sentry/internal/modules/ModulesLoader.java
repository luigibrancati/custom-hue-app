package io.sentry.internal.modules;

import io.sentry.ILogger;
import io.sentry.ISentryLifecycleToken;
import io.sentry.SentryLevel;
import io.sentry.util.AutoClosableReentrantLock;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class ModulesLoader implements IModulesLoader {
    public static final String EXTERNAL_MODULES_FILENAME = "sentry-external-modules.txt";
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    protected final ILogger logger;
    private final AutoClosableReentrantLock modulesLock = new AutoClosableReentrantLock();
    private volatile Map<String, String> cachedModules = null;

    public ModulesLoader(ILogger iLogger) {
        this.logger = iLogger;
    }

    @Override // io.sentry.internal.modules.IModulesLoader
    public Map<String, String> getOrLoadModules() {
        if (this.cachedModules == null) {
            ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.modulesLock.acquire();
            try {
                if (this.cachedModules == null) {
                    this.cachedModules = loadModules();
                }
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
            } catch (Throwable th) {
                if (iSentryLifecycleTokenAcquire != null) {
                    try {
                        iSentryLifecycleTokenAcquire.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        return this.cachedModules;
    }

    public abstract Map<String, String> loadModules();

    public Map<String, String> parseStream(InputStream inputStream) {
        TreeMap treeMap = new TreeMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, UTF_8));
            try {
                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    int iLastIndexOf = line.lastIndexOf(58);
                    treeMap.put(line.substring(0, iLastIndexOf), line.substring(iLastIndexOf + 1));
                }
                this.logger.log(SentryLevel.DEBUG, "Extracted %d modules from resources.", Integer.valueOf(treeMap.size()));
                bufferedReader.close();
                return treeMap;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e10) {
            this.logger.log(SentryLevel.ERROR, "Error extracting modules.", e10);
            return treeMap;
        } catch (RuntimeException e11) {
            this.logger.log(SentryLevel.ERROR, e11, "%s file is malformed.", EXTERNAL_MODULES_FILENAME);
            return treeMap;
        }
    }
}
