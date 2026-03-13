package io.sentry;

import io.sentry.Session;
import io.sentry.cache.EnvelopeCache;
import io.sentry.cache.IEnvelopeCache;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
final class PreviousSessionFinalizer implements Runnable {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final SentryOptions options;
    private final IScopes scopes;

    public PreviousSessionFinalizer(SentryOptions sentryOptions, IScopes iScopes) {
        this.options = sentryOptions;
        this.scopes = iScopes;
    }

    private Date getTimestampFromCrashMarkerFile(File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), UTF_8));
            try {
                String line = bufferedReader.readLine();
                this.options.getLogger().log(SentryLevel.DEBUG, "Crash marker file has %s timestamp.", line);
                Date dateTime = DateUtils.getDateTime(line);
                bufferedReader.close();
                return dateTime;
            } finally {
            }
        } catch (IOException e10) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error reading the crash marker file.", e10);
            return null;
        } catch (IllegalArgumentException e11) {
            this.options.getLogger().log(SentryLevel.ERROR, e11, "Error converting the crash timestamp.", new Object[0]);
            return null;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        String cacheDirPath = this.options.getCacheDirPath();
        if (cacheDirPath == null) {
            this.options.getLogger().log(SentryLevel.INFO, "Cache dir is not set, not finalizing the previous session.", new Object[0]);
            return;
        }
        if (!this.options.isEnableAutoSessionTracking()) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Session tracking is disabled, bailing from previous session finalizer.", new Object[0]);
            return;
        }
        IEnvelopeCache envelopeDiskCache = this.options.getEnvelopeDiskCache();
        if ((envelopeDiskCache instanceof EnvelopeCache) && !((EnvelopeCache) envelopeDiskCache).waitPreviousSessionFlush()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Timed out waiting to flush previous session to its own file in session finalizer.", new Object[0]);
            return;
        }
        File previousSessionFile = EnvelopeCache.getPreviousSessionFile(cacheDirPath);
        ISerializer serializer = this.options.getSerializer();
        if (previousSessionFile.exists()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Current session is not ended, we'd need to end it.", new Object[0]);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(previousSessionFile), UTF_8));
                try {
                    Session session = (Session) serializer.deserialize(bufferedReader, Session.class);
                    if (session == null) {
                        this.options.getLogger().log(SentryLevel.ERROR, "Stream from path %s resulted in a null envelope.", previousSessionFile.getAbsolutePath());
                    } else {
                        File file = new File(this.options.getCacheDirPath(), EnvelopeCache.NATIVE_CRASH_MARKER_FILE);
                        Session.State status = session.getStatus();
                        Session.State state = Session.State.Crashed;
                        if (status == state) {
                            SentryCrashLastRunState sentryCrashLastRunState = SentryCrashLastRunState.getInstance();
                            sentryCrashLastRunState.reset();
                            sentryCrashLastRunState.setCrashedLastRun(true);
                        } else if (file.exists()) {
                            this.options.getLogger().log(SentryLevel.INFO, "Crash marker file exists, last Session is gonna be Crashed.", new Object[0]);
                            Date timestampFromCrashMarkerFile = getTimestampFromCrashMarkerFile(file);
                            session.update(state, null, true);
                            session.end(timestampFromCrashMarkerFile);
                        } else if (session.getAbnormalMechanism() == null) {
                            session.end();
                        }
                        if (file.exists() && !file.delete()) {
                            this.options.getLogger().log(SentryLevel.ERROR, "Failed to delete the crash marker file. %s.", file.getAbsolutePath());
                        }
                        this.scopes.captureEnvelope(SentryEnvelope.from(serializer, session, this.options.getSdkVersion()));
                    }
                    bufferedReader.close();
                } finally {
                }
            } catch (Throwable th) {
                this.options.getLogger().log(SentryLevel.ERROR, "Error processing previous session.", th);
            }
            if (previousSessionFile.delete()) {
                return;
            }
            this.options.getLogger().log(SentryLevel.WARNING, "Failed to delete the previous session file.", new Object[0]);
        }
    }
}
