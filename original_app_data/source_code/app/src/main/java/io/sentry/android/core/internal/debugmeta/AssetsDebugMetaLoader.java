package io.sentry.android.core.internal.debugmeta;

import android.content.Context;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.android.core.ContextUtils;
import io.sentry.internal.debugmeta.IDebugMetaLoader;
import io.sentry.util.DebugMetaPropertiesApplier;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class AssetsDebugMetaLoader implements IDebugMetaLoader {
    private final Context context;
    private final ILogger logger;

    public AssetsDebugMetaLoader(Context context, ILogger iLogger) {
        this.context = ContextUtils.getApplicationContext(context);
        this.logger = iLogger;
    }

    @Override // io.sentry.internal.debugmeta.IDebugMetaLoader
    public List<Properties> loadDebugMeta() {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(this.context.getAssets().open(DebugMetaPropertiesApplier.DEBUG_META_PROPERTIES_FILENAME));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                List<Properties> listSingletonList = Collections.singletonList(properties);
                bufferedInputStream.close();
                return listSingletonList;
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (FileNotFoundException unused) {
            this.logger.log(SentryLevel.INFO, "%s file was not found.", DebugMetaPropertiesApplier.DEBUG_META_PROPERTIES_FILENAME);
            return null;
        } catch (IOException e10) {
            this.logger.log(SentryLevel.ERROR, "Error getting Proguard UUIDs.", e10);
            return null;
        } catch (RuntimeException e11) {
            this.logger.log(SentryLevel.ERROR, e11, "%s file is malformed.", DebugMetaPropertiesApplier.DEBUG_META_PROPERTIES_FILENAME);
            return null;
        }
    }
}
