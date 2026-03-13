package io.sentry;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class HttpStatusCodeRange {
    public static final int DEFAULT_MAX = 599;
    public static final int DEFAULT_MIN = 500;
    private final int max;
    private final int min;

    public HttpStatusCodeRange(int i10, int i11) {
        this.min = i10;
        this.max = i11;
    }

    public boolean isInRange(int i10) {
        return i10 >= this.min && i10 <= this.max;
    }

    public HttpStatusCodeRange(int i10) {
        this.min = i10;
        this.max = i10;
    }
}
