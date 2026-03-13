package io.sentry.exception;

import io.sentry.protocol.Mechanism;
import io.sentry.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class ExceptionMechanismException extends RuntimeException {
    private static final long serialVersionUID = 142345454265713915L;
    private final Mechanism exceptionMechanism;
    private final boolean snapshot;
    private final Thread thread;
    private final Throwable throwable;

    public ExceptionMechanismException(Mechanism mechanism, Throwable th, Thread thread, boolean z10) {
        this.exceptionMechanism = (Mechanism) Objects.requireNonNull(mechanism, "Mechanism is required.");
        this.throwable = (Throwable) Objects.requireNonNull(th, "Throwable is required.");
        this.thread = (Thread) Objects.requireNonNull(thread, "Thread is required.");
        this.snapshot = z10;
    }

    public Mechanism getExceptionMechanism() {
        return this.exceptionMechanism;
    }

    public Thread getThread() {
        return this.thread;
    }

    public Throwable getThrowable() {
        return this.throwable;
    }

    public boolean isSnapshot() {
        return this.snapshot;
    }

    public ExceptionMechanismException(Mechanism mechanism, Throwable th, Thread thread) {
        this(mechanism, th, thread, false);
    }
}
