package org.apache.tika.pipes.async;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class OfferLargerThanQueueSize extends IllegalArgumentException {
    private final int queueSize;
    private final int sizeOffered;

    public OfferLargerThanQueueSize(int i10, int i11) {
        this.sizeOffered = i10;
        this.queueSize = i11;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "sizeOffered (" + this.sizeOffered + ") is greater than queue size (" + this.queueSize + ")";
    }

    public int getQueueSize() {
        return this.queueSize;
    }

    public int getSizeOffered() {
        return this.sizeOffered;
    }
}
