package io.sentry;

import io.sentry.UncaughtExceptionHandler;
import io.sentry.exception.ExceptionMechanismException;
import io.sentry.hints.BlockingFlushHint;
import io.sentry.hints.EventDropReason;
import io.sentry.hints.SessionEnd;
import io.sentry.hints.TransactionEnd;
import io.sentry.protocol.Mechanism;
import io.sentry.protocol.SentryId;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.HintUtils;
import io.sentry.util.IntegrationUtils;
import io.sentry.util.Objects;
import java.io.Closeable;
import java.lang.Thread;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class UncaughtExceptionHandlerIntegration implements Integration, Thread.UncaughtExceptionHandler, Closeable {
    private static final AutoClosableReentrantLock lock = new AutoClosableReentrantLock();
    private Thread.UncaughtExceptionHandler defaultExceptionHandler;
    private SentryOptions options;
    private boolean registered;
    private IScopes scopes;
    private final UncaughtExceptionHandler threadAdapter;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class UncaughtExceptionHint extends BlockingFlushHint implements SessionEnd, TransactionEnd {
        private final AtomicReference<SentryId> flushableEventId;

        public UncaughtExceptionHint(long j10, ILogger iLogger) {
            super(j10, iLogger);
            this.flushableEventId = new AtomicReference<>();
        }

        @Override // io.sentry.hints.DiskFlushNotification
        public boolean isFlushable(SentryId sentryId) {
            SentryId sentryId2 = this.flushableEventId.get();
            return sentryId2 != null && sentryId2.equals(sentryId);
        }

        @Override // io.sentry.hints.DiskFlushNotification
        public void setFlushable(SentryId sentryId) {
            this.flushableEventId.set(sentryId);
        }
    }

    public UncaughtExceptionHandlerIntegration() {
        this(UncaughtExceptionHandler.Adapter.getInstance());
    }

    public static Throwable getUnhandledThrowable(Thread thread, Throwable th) {
        Mechanism mechanism = new Mechanism();
        mechanism.setHandled(Boolean.FALSE);
        mechanism.setType("UncaughtExceptionHandler");
        return new ExceptionMechanismException(mechanism, th, thread);
    }

    private void removeFromHandlerTree(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        removeFromHandlerTree(uncaughtExceptionHandler, new HashSet());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = lock.acquire();
        try {
            if (this == this.threadAdapter.getDefaultUncaughtExceptionHandler()) {
                this.threadAdapter.setDefaultUncaughtExceptionHandler(this.defaultExceptionHandler);
                SentryOptions sentryOptions = this.options;
                if (sentryOptions != null) {
                    sentryOptions.getLogger().log(SentryLevel.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
                }
            } else {
                removeFromHandlerTree(this.threadAdapter.getDefaultUncaughtExceptionHandler());
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

    @Override // io.sentry.Integration
    public final void register(IScopes iScopes, SentryOptions sentryOptions) {
        if (this.registered) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, "Attempt to register a UncaughtExceptionHandlerIntegration twice.", new Object[0]);
            return;
        }
        this.registered = true;
        this.scopes = (IScopes) Objects.requireNonNull(iScopes, "Scopes are required");
        SentryOptions sentryOptions2 = (SentryOptions) Objects.requireNonNull(sentryOptions, "SentryOptions is required");
        this.options = sentryOptions2;
        ILogger logger = sentryOptions2.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.log(sentryLevel, "UncaughtExceptionHandlerIntegration enabled: %s", Boolean.valueOf(this.options.isEnableUncaughtExceptionHandler()));
        if (this.options.isEnableUncaughtExceptionHandler()) {
            ISentryLifecycleToken iSentryLifecycleTokenAcquire = lock.acquire();
            try {
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = this.threadAdapter.getDefaultUncaughtExceptionHandler();
                if (defaultUncaughtExceptionHandler != null) {
                    this.options.getLogger().log(sentryLevel, "default UncaughtExceptionHandler class='" + defaultUncaughtExceptionHandler.getClass().getName() + "'", new Object[0]);
                    if (defaultUncaughtExceptionHandler instanceof UncaughtExceptionHandlerIntegration) {
                        UncaughtExceptionHandlerIntegration uncaughtExceptionHandlerIntegration = (UncaughtExceptionHandlerIntegration) defaultUncaughtExceptionHandler;
                        if (uncaughtExceptionHandlerIntegration.scopes == null || iScopes.getGlobalScope() != uncaughtExceptionHandlerIntegration.scopes.getGlobalScope()) {
                            this.defaultExceptionHandler = defaultUncaughtExceptionHandler;
                        } else {
                            this.defaultExceptionHandler = uncaughtExceptionHandlerIntegration.defaultExceptionHandler;
                        }
                    } else {
                        this.defaultExceptionHandler = defaultUncaughtExceptionHandler;
                    }
                }
                this.threadAdapter.setDefaultUncaughtExceptionHandler(this);
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
                this.options.getLogger().log(sentryLevel, "UncaughtExceptionHandlerIntegration installed.", new Object[0]);
                IntegrationUtils.addIntegrationToSdkVersion("UncaughtExceptionHandler");
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
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        SentryOptions sentryOptions = this.options;
        if (sentryOptions == null || this.scopes == null) {
            return;
        }
        sentryOptions.getLogger().log(SentryLevel.INFO, "Uncaught exception received.", new Object[0]);
        try {
            UncaughtExceptionHint uncaughtExceptionHint = new UncaughtExceptionHint(this.options.getFlushTimeoutMillis(), this.options.getLogger());
            SentryEvent sentryEvent = new SentryEvent(getUnhandledThrowable(thread, th));
            sentryEvent.setLevel(SentryLevel.FATAL);
            if (this.scopes.getTransaction() == null && sentryEvent.getEventId() != null) {
                uncaughtExceptionHint.setFlushable(sentryEvent.getEventId());
            }
            Hint hintCreateWithTypeCheckHint = HintUtils.createWithTypeCheckHint(uncaughtExceptionHint);
            boolean zEquals = this.scopes.captureEvent(sentryEvent, hintCreateWithTypeCheckHint).equals(SentryId.EMPTY_ID);
            EventDropReason eventDropReason = HintUtils.getEventDropReason(hintCreateWithTypeCheckHint);
            if ((!zEquals || EventDropReason.MULTITHREADED_DEDUPLICATION.equals(eventDropReason)) && !uncaughtExceptionHint.waitFlush()) {
                this.options.getLogger().log(SentryLevel.WARNING, "Timed out waiting to flush event to disk before crashing. Event: %s", sentryEvent.getEventId());
            }
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error sending uncaught exception to Sentry.", th2);
        }
        if (this.defaultExceptionHandler != null) {
            this.options.getLogger().log(SentryLevel.INFO, "Invoking inner uncaught exception handler.", new Object[0]);
            this.defaultExceptionHandler.uncaughtException(thread, th);
        } else if (this.options.isPrintUncaughtStackTrace()) {
            th.printStackTrace();
        }
    }

    public UncaughtExceptionHandlerIntegration(UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.registered = false;
        this.threadAdapter = (UncaughtExceptionHandler) Objects.requireNonNull(uncaughtExceptionHandler, "threadAdapter is required.");
    }

    private void removeFromHandlerTree(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Set<Thread.UncaughtExceptionHandler> set) {
        if (uncaughtExceptionHandler == null) {
            SentryOptions sentryOptions = this.options;
            if (sentryOptions != null) {
                sentryOptions.getLogger().log(SentryLevel.DEBUG, "Found no UncaughtExceptionHandler to remove.", new Object[0]);
                return;
            }
            return;
        }
        if (!set.add(uncaughtExceptionHandler)) {
            SentryOptions sentryOptions2 = this.options;
            if (sentryOptions2 != null) {
                sentryOptions2.getLogger().log(SentryLevel.WARNING, "Cycle detected in UncaughtExceptionHandler chain while removing handler.", new Object[0]);
                return;
            }
            return;
        }
        if (uncaughtExceptionHandler instanceof UncaughtExceptionHandlerIntegration) {
            UncaughtExceptionHandlerIntegration uncaughtExceptionHandlerIntegration = (UncaughtExceptionHandlerIntegration) uncaughtExceptionHandler;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = uncaughtExceptionHandlerIntegration.defaultExceptionHandler;
            if (this != uncaughtExceptionHandler2) {
                removeFromHandlerTree(uncaughtExceptionHandler2, set);
                return;
            }
            uncaughtExceptionHandlerIntegration.defaultExceptionHandler = this.defaultExceptionHandler;
            SentryOptions sentryOptions3 = this.options;
            if (sentryOptions3 != null) {
                sentryOptions3.getLogger().log(SentryLevel.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
            }
        }
    }
}
