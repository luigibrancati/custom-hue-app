package io.sentry.util;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.util.LazyEvaluator;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class LoadClass {
    public boolean isClassAvailable(String str, ILogger iLogger) {
        return loadClass(str, iLogger) != null;
    }

    public LazyEvaluator<Boolean> isClassAvailableLazy(final String str, final ILogger iLogger) {
        return new LazyEvaluator<>(new LazyEvaluator.Evaluator() { // from class: io.sentry.util.e
            @Override // io.sentry.util.LazyEvaluator.Evaluator
            public final Object evaluate() {
                return Boolean.valueOf(this.f38835a.isClassAvailable(str, iLogger));
            }
        });
    }

    public Class<?> loadClass(String str, ILogger iLogger) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            if (iLogger == null) {
                return null;
            }
            iLogger.log(SentryLevel.INFO, "Class not available: " + str, new Object[0]);
            return null;
        } catch (UnsatisfiedLinkError e10) {
            if (iLogger == null) {
                return null;
            }
            iLogger.log(SentryLevel.ERROR, "Failed to load (UnsatisfiedLinkError) " + str, e10);
            return null;
        } catch (Throwable th) {
            if (iLogger == null) {
                return null;
            }
            iLogger.log(SentryLevel.ERROR, "Failed to initialize " + str, th);
            return null;
        }
    }

    public boolean isClassAvailable(String str, SentryOptions sentryOptions) {
        return isClassAvailable(str, sentryOptions != null ? sentryOptions.getLogger() : null);
    }

    public LazyEvaluator<Boolean> isClassAvailableLazy(final String str, final SentryOptions sentryOptions) {
        return new LazyEvaluator<>(new LazyEvaluator.Evaluator() { // from class: io.sentry.util.f
            @Override // io.sentry.util.LazyEvaluator.Evaluator
            public final Object evaluate() {
                return Boolean.valueOf(this.f38838a.isClassAvailable(str, sentryOptions));
            }
        });
    }
}
