package io.sentry.android.core;

import io.sentry.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
final class ApplicationNotResponding extends RuntimeException {
    private static final long serialVersionUID = 252541144579117016L;
    private final Thread thread;

    public ApplicationNotResponding(String str, Thread thread) {
        super(str);
        Thread thread2 = (Thread) Objects.requireNonNull(thread, "Thread must be provided.");
        this.thread = thread2;
        setStackTrace(thread2.getStackTrace());
    }

    public Thread getThread() {
        return this.thread;
    }
}
