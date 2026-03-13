package N6;

/* JADX INFO: renamed from: N6.gb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1330gb extends AbstractC1434ob {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f10279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f10280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f10281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f10282f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f10283g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f10284h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f10285i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f10286j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f10287k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f10288l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public short f10289m;

    @Override // N6.AbstractC1434ob
    public final AbstractC1434ob a(boolean z10) {
        this.f10286j = true;
        this.f10289m = (short) (this.f10289m | 512);
        return this;
    }

    @Override // N6.AbstractC1434ob
    public final AbstractC1434ob b(float f10) {
        this.f10283g = 0.8f;
        this.f10289m = (short) (this.f10289m | 64);
        return this;
    }

    @Override // N6.AbstractC1434ob
    public final AbstractC1434ob c(float f10) {
        this.f10282f = 0.5f;
        this.f10289m = (short) (this.f10289m | 32);
        return this;
    }

    @Override // N6.AbstractC1434ob
    public final AbstractC1434ob d(float f10) {
        this.f10280d = 0.8f;
        this.f10289m = (short) (this.f10289m | 8);
        return this;
    }

    @Override // N6.AbstractC1434ob
    public final AbstractC1434ob e(int i10) {
        this.f10278b = 5;
        this.f10289m = (short) (this.f10289m | 2);
        return this;
    }

    @Override // N6.AbstractC1434ob
    public final AbstractC1434ob f(float f10) {
        this.f10279c = 0.25f;
        this.f10289m = (short) (this.f10289m | 4);
        return this;
    }

    @Override // N6.AbstractC1434ob
    public final AbstractC1434ob g(long j10) {
        this.f10285i = 3000L;
        this.f10289m = (short) (this.f10289m | 256);
        return this;
    }

    @Override // N6.AbstractC1434ob
    public final AbstractC1434ob h(boolean z10) {
        this.f10281e = z10;
        this.f10289m = (short) (this.f10289m | 16);
        return this;
    }

    @Override // N6.AbstractC1434ob
    public final AbstractC1434ob i(float f10) {
        this.f10287k = 0.1f;
        this.f10289m = (short) (this.f10289m | 1024);
        return this;
    }

    @Override // N6.AbstractC1434ob
    public final AbstractC1434ob j(long j10) {
        this.f10284h = 1500L;
        this.f10289m = (short) (this.f10289m | 128);
        return this;
    }

    @Override // N6.AbstractC1434ob
    public final AbstractC1434ob k(float f10) {
        this.f10288l = 0.05f;
        this.f10289m = (short) (this.f10289m | 2048);
        return this;
    }

    @Override // N6.AbstractC1434ob
    public final AbstractC1447pb l() {
        if (this.f10289m == 4095) {
            return new C1356ib(this.f10277a, this.f10278b, this.f10279c, this.f10280d, this.f10281e, this.f10282f, this.f10283g, this.f10284h, this.f10285i, this.f10286j, this.f10287k, this.f10288l, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f10289m & 1) == 0) {
            sb2.append(" recentFramesToCheck");
        }
        if ((this.f10289m & 2) == 0) {
            sb2.append(" recentFramesContainingPredictedArea");
        }
        if ((this.f10289m & 4) == 0) {
            sb2.append(" recentFramesIou");
        }
        if ((this.f10289m & 8) == 0) {
            sb2.append(" maxCoverage");
        }
        if ((this.f10289m & 16) == 0) {
            sb2.append(" useConfidenceScore");
        }
        if ((this.f10289m & 32) == 0) {
            sb2.append(" lowerConfidenceScore");
        }
        if ((this.f10289m & 64) == 0) {
            sb2.append(" higherConfidenceScore");
        }
        if ((this.f10289m & 128) == 0) {
            sb2.append(" zoomIntervalInMillis");
        }
        if ((this.f10289m & 256) == 0) {
            sb2.append(" resetIntervalInMillis");
        }
        if ((this.f10289m & 512) == 0) {
            sb2.append(" enableZoomThreshold");
        }
        if ((this.f10289m & 1024) == 0) {
            sb2.append(" zoomInThreshold");
        }
        if ((this.f10289m & 2048) == 0) {
            sb2.append(" zoomOutThreshold");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    public final AbstractC1434ob m(int i10) {
        this.f10277a = 10;
        this.f10289m = (short) (this.f10289m | 1);
        return this;
    }
}
