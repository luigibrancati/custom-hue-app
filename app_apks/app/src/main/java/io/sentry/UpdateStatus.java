package io.sentry;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class UpdateStatus {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class NewRelease extends UpdateStatus {
        private final UpdateInfo info;

        public NewRelease(UpdateInfo updateInfo) {
            this.info = updateInfo;
        }

        public UpdateInfo getInfo() {
            return this.info;
        }

        public String toString() {
            return "UpdateStatus.NewRelease{info=" + this.info + '}';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class NoNetwork extends UpdateStatus {
        private final String message;

        public NoNetwork(String str) {
            this.message = str;
        }

        public String getMessage() {
            return this.message;
        }

        public String toString() {
            return "UpdateStatus.NoNetwork{message='" + this.message + "'}";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class UpToDate extends UpdateStatus {
        private static final UpToDate INSTANCE = new UpToDate();

        private UpToDate() {
        }

        public static UpToDate getInstance() {
            return INSTANCE;
        }

        public String toString() {
            return "UpdateStatus.UpToDate{}";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class UpdateError extends UpdateStatus {
        private final String message;

        public UpdateError(String str) {
            this.message = str;
        }

        public String getMessage() {
            return this.message;
        }

        public String toString() {
            return "UpdateStatus.UpdateError{message='" + this.message + "'}";
        }
    }
}
