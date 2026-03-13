package io.sentry.cache;

import io.sentry.JsonDeserializer;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
final class CacheUtils {
    private static final Charset UTF_8 = Charset.forName("UTF-8");

    public static void delete(SentryOptions sentryOptions, String str, String str2) {
        File fileEnsureCacheDir = ensureCacheDir(sentryOptions, str);
        if (fileEnsureCacheDir == null) {
            sentryOptions.getLogger().log(SentryLevel.INFO, "Cache dir is not set, cannot delete from scope cache", new Object[0]);
            return;
        }
        File file = new File(fileEnsureCacheDir, str2);
        sentryOptions.getLogger().log(SentryLevel.DEBUG, "Deleting %s from scope cache", str2);
        if (file.delete()) {
            return;
        }
        sentryOptions.getLogger().log(SentryLevel.INFO, "Failed to delete: %s", file.getAbsolutePath());
    }

    public static File ensureCacheDir(SentryOptions sentryOptions, String str) {
        String cacheDirPath = sentryOptions.getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        File file = new File(cacheDirPath, str);
        file.mkdirs();
        return file;
    }

    public static <T, R> T read(SentryOptions sentryOptions, String str, String str2, Class<T> cls, JsonDeserializer<R> jsonDeserializer) {
        File fileEnsureCacheDir = ensureCacheDir(sentryOptions, str);
        if (fileEnsureCacheDir == null) {
            sentryOptions.getLogger().log(SentryLevel.INFO, "Cache dir is not set, cannot read from scope cache", new Object[0]);
            return null;
        }
        File file = new File(fileEnsureCacheDir, str2);
        if (file.exists()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), UTF_8));
                try {
                    T t10 = jsonDeserializer == null ? (T) sentryOptions.getSerializer().deserialize(bufferedReader, cls) : (T) sentryOptions.getSerializer().deserializeCollection(bufferedReader, cls, jsonDeserializer);
                    bufferedReader.close();
                    return t10;
                } finally {
                }
            } catch (Throwable th) {
                sentryOptions.getLogger().log(SentryLevel.ERROR, th, "Error reading entity from scope cache: %s", str2);
            }
        } else {
            sentryOptions.getLogger().log(SentryLevel.DEBUG, "No entry stored for %s", str2);
        }
        return null;
    }

    public static <T> void store(SentryOptions sentryOptions, T t10, String str, String str2) {
        File fileEnsureCacheDir = ensureCacheDir(sentryOptions, str);
        if (fileEnsureCacheDir == null) {
            sentryOptions.getLogger().log(SentryLevel.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(fileEnsureCacheDir, str2));
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, UTF_8));
                try {
                    sentryOptions.getSerializer().serialize(t10, bufferedWriter);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, th, "Error persisting entity: %s", str2);
        }
    }
}
