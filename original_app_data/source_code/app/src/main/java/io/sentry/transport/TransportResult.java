package io.sentry.transport;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class TransportResult {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class ErrorTransportResult extends TransportResult {
        private final int responseCode;

        public ErrorTransportResult(int i10) {
            super();
            this.responseCode = i10;
        }

        @Override // io.sentry.transport.TransportResult
        public int getResponseCode() {
            return this.responseCode;
        }

        @Override // io.sentry.transport.TransportResult
        public boolean isSuccess() {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class SuccessTransportResult extends TransportResult {
        static final SuccessTransportResult INSTANCE = new SuccessTransportResult();

        private SuccessTransportResult() {
            super();
        }

        @Override // io.sentry.transport.TransportResult
        public int getResponseCode() {
            return -1;
        }

        @Override // io.sentry.transport.TransportResult
        public boolean isSuccess() {
            return true;
        }
    }

    public static TransportResult error(int i10) {
        return new ErrorTransportResult(i10);
    }

    public static TransportResult success() {
        return SuccessTransportResult.INSTANCE;
    }

    public abstract int getResponseCode();

    public abstract boolean isSuccess();

    private TransportResult() {
    }

    public static TransportResult error() {
        return error(-1);
    }
}
