package io.sentry;

import java.lang.Thread;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
interface UncaughtExceptionHandler {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Adapter implements UncaughtExceptionHandler {
        private static final Adapter INSTANCE = new Adapter();

        private Adapter() {
        }

        public static UncaughtExceptionHandler getInstance() {
            return INSTANCE;
        }

        @Override // io.sentry.UncaughtExceptionHandler
        public Thread.UncaughtExceptionHandler getDefaultUncaughtExceptionHandler() {
            return Thread.getDefaultUncaughtExceptionHandler();
        }

        @Override // io.sentry.UncaughtExceptionHandler
        public void setDefaultUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
        }
    }

    Thread.UncaughtExceptionHandler getDefaultUncaughtExceptionHandler();

    void setDefaultUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler);
}
