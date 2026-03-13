package io.sentry.config;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
final class FilesystemPropertiesLoader implements PropertiesLoader {
    private final String filePath;
    private boolean logNonExisting;
    private final ILogger logger;

    public FilesystemPropertiesLoader(String str, ILogger iLogger) {
        this(str, iLogger, true);
    }

    @Override // io.sentry.config.PropertiesLoader
    public Properties load() {
        try {
            File file = new File(this.filePath.trim());
            if (file.isFile() && file.canRead()) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    Properties properties = new Properties();
                    properties.load(bufferedInputStream);
                    bufferedInputStream.close();
                    return properties;
                } finally {
                }
            }
            if (file.isFile()) {
                if (!file.canRead()) {
                    this.logger.log(SentryLevel.ERROR, "Failed to load Sentry configuration since it is not readable: %s", this.filePath);
                }
            } else if (this.logNonExisting) {
                this.logger.log(SentryLevel.ERROR, "Failed to load Sentry configuration since it is not a file or does not exist: %s", this.filePath);
            }
            return null;
        } catch (Throwable th) {
            this.logger.log(SentryLevel.ERROR, th, "Failed to load Sentry configuration from file: %s", this.filePath);
            return null;
        }
    }

    public FilesystemPropertiesLoader(String str, ILogger iLogger, boolean z10) {
        this.filePath = str;
        this.logger = iLogger;
        this.logNonExisting = z10;
    }
}
