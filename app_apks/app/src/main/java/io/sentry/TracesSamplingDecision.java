package io.sentry;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class TracesSamplingDecision {
    private final Double profileSampleRate;
    private final Boolean profileSampled;
    private final Double sampleRand;
    private final Double sampleRate;
    private final Boolean sampled;

    public TracesSamplingDecision(Boolean bool) {
        this(bool, null);
    }

    public Double getProfileSampleRate() {
        return this.profileSampleRate;
    }

    public Boolean getProfileSampled() {
        return this.profileSampled;
    }

    public Double getSampleRand() {
        return this.sampleRand;
    }

    public Double getSampleRate() {
        return this.sampleRate;
    }

    public Boolean getSampled() {
        return this.sampled;
    }

    public TracesSamplingDecision(Boolean bool, Double d10) {
        this(bool, d10, null, Boolean.FALSE, null);
    }

    public TracesSamplingDecision(Boolean bool, Double d10, Double d11) {
        this(bool, d10, d11, Boolean.FALSE, null);
    }

    public TracesSamplingDecision(Boolean bool, Double d10, Boolean bool2, Double d11) {
        this(bool, d10, null, bool2, d11);
    }

    public TracesSamplingDecision(Boolean bool, Double d10, Double d11, Boolean bool2, Double d12) {
        this.sampled = bool;
        this.sampleRate = d10;
        this.sampleRand = d11;
        this.profileSampled = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
        this.profileSampleRate = d12;
    }
}
