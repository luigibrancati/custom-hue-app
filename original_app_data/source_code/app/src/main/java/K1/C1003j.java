package K1;

/* JADX INFO: renamed from: K1.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1003j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7100f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f7101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7102h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7103i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f7104j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f7105k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7106l;

    public void a(long j10) {
        b(j10, 1);
    }

    public final void b(long j10, int i10) {
        this.f7105k += j10;
        this.f7106l += i10;
    }

    public synchronized void c() {
    }

    public String toString() {
        return G1.M.G("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", Integer.valueOf(this.f7095a), Integer.valueOf(this.f7096b), Integer.valueOf(this.f7097c), Integer.valueOf(this.f7098d), Integer.valueOf(this.f7099e), Integer.valueOf(this.f7100f), Integer.valueOf(this.f7101g), Integer.valueOf(this.f7102h), Integer.valueOf(this.f7103i), Integer.valueOf(this.f7104j), Long.valueOf(this.f7105k), Integer.valueOf(this.f7106l));
    }
}
