package io.sentry;

import io.sentry.UpdateStatus;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class NoOpDistributionApi implements IDistributionApi {
    private static final NoOpDistributionApi instance = new NoOpDistributionApi();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class CompletedFuture<T> implements Future<T> {
        private final T result;

        public CompletedFuture(T t10) {
            this.result = t10;
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            return false;
        }

        @Override // java.util.concurrent.Future
        public T get() {
            return this.result;
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return false;
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public T get(long j10, TimeUnit timeUnit) {
            return this.result;
        }
    }

    private NoOpDistributionApi() {
    }

    public static NoOpDistributionApi getInstance() {
        return instance;
    }

    @Override // io.sentry.IDistributionApi
    public Future<UpdateStatus> checkForUpdate() {
        return new CompletedFuture(UpdateStatus.UpToDate.getInstance());
    }

    @Override // io.sentry.IDistributionApi
    public UpdateStatus checkForUpdateBlocking() {
        return UpdateStatus.UpToDate.getInstance();
    }

    @Override // io.sentry.IDistributionApi
    public boolean isEnabled() {
        return false;
    }

    @Override // io.sentry.IDistributionApi
    public void downloadUpdate(UpdateInfo updateInfo) {
    }
}
