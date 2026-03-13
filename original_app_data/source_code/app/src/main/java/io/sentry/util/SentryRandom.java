package io.sentry.util;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SentryRandom {
    private static final SentryRandomThreadLocal instance = new SentryRandomThreadLocal();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class SentryRandomThreadLocal extends ThreadLocal<Random> {
        private SentryRandomThreadLocal() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public Random initialValue() {
            return new Random();
        }
    }

    public static Random current() {
        return instance.get();
    }
}
