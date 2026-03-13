package org.apache.tika.pipes.fetcher;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class FetchKey implements Serializable {
    private static final long serialVersionUID = -3861669115439125268L;
    private String fetchKey;
    private String fetcherName;
    private long rangeEnd;
    private long rangeStart;

    public FetchKey() {
        this.rangeStart = -1L;
        this.rangeEnd = -1L;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            FetchKey fetchKey = (FetchKey) obj;
            if (this.rangeStart == fetchKey.rangeStart && this.rangeEnd == fetchKey.rangeEnd && Objects.equals(this.fetcherName, fetchKey.fetcherName) && Objects.equals(this.fetchKey, fetchKey.fetchKey)) {
                return true;
            }
        }
        return false;
    }

    public String getFetchKey() {
        return this.fetchKey;
    }

    public String getFetcherName() {
        return this.fetcherName;
    }

    public long getRangeEnd() {
        return this.rangeEnd;
    }

    public long getRangeStart() {
        return this.rangeStart;
    }

    public boolean hasRange() {
        return this.rangeStart > -1 && this.rangeEnd > -1;
    }

    public int hashCode() {
        return Objects.hash(this.fetcherName, this.fetchKey, Long.valueOf(this.rangeStart), Long.valueOf(this.rangeEnd));
    }

    public String toString() {
        return "FetchKey{fetcherName='" + this.fetcherName + "', fetchKey='" + this.fetchKey + "', rangeStart=" + this.rangeStart + ", rangeEnd=" + this.rangeEnd + "}";
    }

    public FetchKey(String str, String str2) {
        this(str, str2, -1L, -1L);
    }

    public FetchKey(String str, String str2, long j10, long j11) {
        this.fetcherName = str;
        this.fetchKey = str2;
        this.rangeStart = j10;
        this.rangeEnd = j11;
    }
}
