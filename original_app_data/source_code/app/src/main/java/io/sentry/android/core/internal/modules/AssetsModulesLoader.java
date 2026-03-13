package io.sentry.android.core.internal.modules;

import android.content.Context;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.android.core.ContextUtils;
import io.sentry.internal.modules.ModulesLoader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class AssetsModulesLoader extends ModulesLoader {
    private final Context context;

    public AssetsModulesLoader(Context context, ILogger iLogger) {
        super(iLogger);
        this.context = ContextUtils.getApplicationContext(context);
        new Thread(new Runnable() { // from class: io.sentry.android.core.internal.modules.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f38551a.getOrLoadModules();
            }
        }).start();
    }

    @Override // io.sentry.internal.modules.ModulesLoader
    public Map<String, String> loadModules() {
        TreeMap treeMap = new TreeMap();
        try {
            InputStream inputStreamOpen = this.context.getAssets().open(ModulesLoader.EXTERNAL_MODULES_FILENAME);
            try {
                Map<String, String> stream = parseStream(inputStreamOpen);
                if (inputStreamOpen == null) {
                    return stream;
                }
                inputStreamOpen.close();
                return stream;
            } catch (Throwable th) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused) {
            this.logger.log(SentryLevel.INFO, "%s file was not found.", ModulesLoader.EXTERNAL_MODULES_FILENAME);
            return treeMap;
        } catch (IOException e10) {
            this.logger.log(SentryLevel.ERROR, "Error extracting modules.", e10);
            return treeMap;
        }
    }
}
