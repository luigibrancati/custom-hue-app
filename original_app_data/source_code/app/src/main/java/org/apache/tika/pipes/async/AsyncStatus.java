package org.apache.tika.pipes.async;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import org.apache.tika.pipes.PipesResult;
import org.apache.tika.pipes.pipesiterator.TotalCountResult;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class AsyncStatus {
    private Instant lastUpdate;
    private final Instant started;
    private TotalCountResult totalCountResult = new TotalCountResult(0, TotalCountResult.STATUS.NOT_COMPLETED);
    private Map<PipesResult.STATUS, Long> statusCounts = new HashMap();
    private ASYNC_STATUS asyncStatus = ASYNC_STATUS.STARTED;
    private String crashMessage = "";

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum ASYNC_STATUS {
        STARTED,
        COMPLETED,
        CRASHED
    }

    public AsyncStatus() {
        Instant instantNow = Instant.now();
        this.started = instantNow;
        this.lastUpdate = instantNow;
    }

    public ASYNC_STATUS getAsyncStatus() {
        return this.asyncStatus;
    }

    public String getCrashMessage() {
        return this.crashMessage;
    }

    public Instant getLastUpdate() {
        return this.lastUpdate;
    }

    public Instant getStarted() {
        return this.started;
    }

    public Map<PipesResult.STATUS, Long> getStatusCounts() {
        return this.statusCounts;
    }

    public TotalCountResult getTotalCountResult() {
        return this.totalCountResult;
    }

    public String toString() {
        return "AsyncStatus{started=" + String.valueOf(this.started) + ", lastUpdate=" + String.valueOf(this.lastUpdate) + ", totalCountResult=" + String.valueOf(this.totalCountResult) + ", statusCounts=" + String.valueOf(this.statusCounts) + ", asyncStatus=" + String.valueOf(this.asyncStatus) + ", crashMessage='" + this.crashMessage + "'}";
    }

    public synchronized void update(Map<PipesResult.STATUS, Long> map, TotalCountResult totalCountResult, ASYNC_STATUS async_status) {
        this.lastUpdate = Instant.now();
        this.statusCounts = map;
        this.totalCountResult = totalCountResult;
        this.asyncStatus = async_status;
    }

    public void updateCrash(String str) {
        this.crashMessage = str;
    }
}
