package io.sentry.util;

import io.sentry.TracesSamplingDecision;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SampleRateUtils {
    public static Double backfilledSampleRand(Double d10, Double d11, Boolean bool) {
        if (d10 != null) {
            return d10;
        }
        double dNextDouble = SentryRandom.current().nextDouble();
        return (d11 == null || bool == null) ? Double.valueOf(dNextDouble) : bool.booleanValue() ? Double.valueOf(dNextDouble * d11.doubleValue()) : Double.valueOf(d11.doubleValue() + (dNextDouble * (1.0d - d11.doubleValue())));
    }

    public static boolean isValidContinuousProfilesSampleRate(Double d10) {
        return isValidRate(d10, true);
    }

    public static boolean isValidProfilesSampleRate(Double d10) {
        return isValidRate(d10, true);
    }

    private static boolean isValidRate(Double d10, boolean z10) {
        return d10 == null ? z10 : !d10.isNaN() && d10.doubleValue() >= 0.0d && d10.doubleValue() <= 1.0d;
    }

    public static boolean isValidSampleRate(Double d10) {
        return isValidRate(d10, true);
    }

    public static boolean isValidTracesSampleRate(Double d10) {
        return isValidTracesSampleRate(d10, true);
    }

    public static boolean isValidTracesSampleRate(Double d10, boolean z10) {
        return isValidRate(d10, z10);
    }

    public static TracesSamplingDecision backfilledSampleRand(TracesSamplingDecision tracesSamplingDecision) {
        if (tracesSamplingDecision.getSampleRand() != null) {
            return tracesSamplingDecision;
        }
        return new TracesSamplingDecision(tracesSamplingDecision.getSampled(), tracesSamplingDecision.getSampleRate(), backfilledSampleRand(null, tracesSamplingDecision.getSampleRate(), tracesSamplingDecision.getSampled()), tracesSamplingDecision.getProfileSampled(), tracesSamplingDecision.getProfileSampleRate());
    }
}
