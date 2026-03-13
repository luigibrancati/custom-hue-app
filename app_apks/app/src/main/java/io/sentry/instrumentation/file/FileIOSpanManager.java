package io.sentry.instrumentation.file;

import io.sentry.IScopes;
import io.sentry.ISpan;
import io.sentry.SentryIntegrationPackageStorage;
import io.sentry.SentryOptions;
import io.sentry.SentryStackTraceFactory;
import io.sentry.SpanDataConvention;
import io.sentry.SpanStatus;
import io.sentry.util.Platform;
import io.sentry.util.StringUtils;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
final class FileIOSpanManager {
    private long byteCount;
    private final ISpan currentSpan;
    private final File file;
    private final SentryOptions options;
    private SpanStatus spanStatus = SpanStatus.OK;
    private final SentryStackTraceFactory stackTraceFactory;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @FunctionalInterface
    public interface FileIOCallable<T> {
        T call();
    }

    public FileIOSpanManager(ISpan iSpan, File file, SentryOptions sentryOptions) {
        this.currentSpan = iSpan;
        this.file = file;
        this.options = sentryOptions;
        this.stackTraceFactory = new SentryStackTraceFactory(sentryOptions);
        SentryIntegrationPackageStorage.getInstance().addIntegration("FileIO");
    }

    private void finishSpan() {
        if (this.currentSpan != null) {
            String strByteCountToString = StringUtils.byteCountToString(this.byteCount);
            File file = this.file;
            if (file != null) {
                this.currentSpan.setDescription(getDescription(file));
                if (this.options.isSendDefaultPii()) {
                    this.currentSpan.setData("file.path", this.file.getAbsolutePath());
                }
            } else {
                this.currentSpan.setDescription(strByteCountToString);
            }
            this.currentSpan.setData("file.size", Long.valueOf(this.byteCount));
            boolean zIsMainThread = this.options.getThreadChecker().isMainThread();
            this.currentSpan.setData(SpanDataConvention.BLOCKED_MAIN_THREAD_KEY, Boolean.valueOf(zIsMainThread));
            if (zIsMainThread) {
                this.currentSpan.setData(SpanDataConvention.CALL_STACK_KEY, this.stackTraceFactory.getInAppCallStack());
            }
            this.currentSpan.finish(this.spanStatus);
        }
    }

    private String getDescription(File file) {
        String strByteCountToString = StringUtils.byteCountToString(this.byteCount);
        if (this.options.isSendDefaultPii()) {
            return file.getName() + " (" + strByteCountToString + ")";
        }
        int iLastIndexOf = file.getName().lastIndexOf(46);
        if (iLastIndexOf <= 0 || iLastIndexOf >= file.getName().length() - 1) {
            return "*** (" + strByteCountToString + ")";
        }
        return "***" + file.getName().substring(iLastIndexOf) + " (" + strByteCountToString + ")";
    }

    public static ISpan startSpan(IScopes iScopes, String str) {
        ISpan transaction = Platform.isAndroid() ? iScopes.getTransaction() : iScopes.getSpan();
        if (transaction != null) {
            return transaction.startChild(str);
        }
        return null;
    }

    public void finish(Closeable closeable) {
        try {
            try {
                closeable.close();
            } catch (IOException e10) {
                this.spanStatus = SpanStatus.INTERNAL_ERROR;
                if (this.currentSpan != null) {
                    this.currentSpan.setThrowable(e10);
                }
                throw e10;
            }
        } finally {
            finishSpan();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T performIO(FileIOCallable<T> fileIOCallable) throws IOException {
        try {
            T tCall = fileIOCallable.call();
            if (tCall instanceof Integer) {
                int iIntValue = ((Integer) tCall).intValue();
                if (iIntValue != -1) {
                    this.byteCount += (long) iIntValue;
                    return tCall;
                }
            } else if (tCall instanceof Long) {
                long jLongValue = ((Long) tCall).longValue();
                if (jLongValue != -1) {
                    this.byteCount += jLongValue;
                }
            }
            return tCall;
        } catch (IOException e10) {
            this.spanStatus = SpanStatus.INTERNAL_ERROR;
            ISpan iSpan = this.currentSpan;
            if (iSpan != null) {
                iSpan.setThrowable(e10);
            }
            throw e10;
        }
    }
}
