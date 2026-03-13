package io.sentry.opentelemetry;

import io.sentry.NoOpLogger;
import io.sentry.SentryLevel;
import io.sentry.SentryOpenTelemetryMode;
import io.sentry.SentryOptions;
import io.sentry.util.LoadClass;
import io.sentry.util.Platform;
import io.sentry.util.SpanUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class OpenTelemetryUtil {
    public static void applyIgnoredSpanOrigins(SentryOptions sentryOptions) {
        if (Platform.isJvm()) {
            Iterator<String> it = ignoredSpanOrigins(sentryOptions).iterator();
            while (it.hasNext()) {
                sentryOptions.addIgnoredSpanOrigin(it.next());
            }
        }
    }

    private static List<String> ignoredSpanOrigins(SentryOptions sentryOptions) {
        SentryOpenTelemetryMode openTelemetryMode = sentryOptions.getOpenTelemetryMode();
        return SentryOpenTelemetryMode.OFF.equals(openTelemetryMode) ? Collections.EMPTY_LIST : SpanUtils.ignoredSpanOriginsForOpenTelemetry(openTelemetryMode);
    }

    public static void updateOpenTelemetryModeIfAuto(SentryOptions sentryOptions, LoadClass loadClass) {
        if (Platform.isJvm()) {
            if (SentryOpenTelemetryMode.AUTO.equals(sentryOptions.getOpenTelemetryMode())) {
                if (loadClass.isClassAvailable("io.sentry.opentelemetry.agent.AgentMarker", NoOpLogger.getInstance())) {
                    sentryOptions.getLogger().log(SentryLevel.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENT", new Object[0]);
                    sentryOptions.setOpenTelemetryMode(SentryOpenTelemetryMode.AGENT);
                } else if (loadClass.isClassAvailable("io.sentry.opentelemetry.agent.AgentlessMarker", NoOpLogger.getInstance())) {
                    sentryOptions.getLogger().log(SentryLevel.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENTLESS", new Object[0]);
                    sentryOptions.setOpenTelemetryMode(SentryOpenTelemetryMode.AGENTLESS);
                } else if (loadClass.isClassAvailable("io.sentry.opentelemetry.agent.AgentlessSpringMarker", NoOpLogger.getInstance())) {
                    sentryOptions.getLogger().log(SentryLevel.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENTLESS_SPRING", new Object[0]);
                    sentryOptions.setOpenTelemetryMode(SentryOpenTelemetryMode.AGENTLESS_SPRING);
                }
            }
        }
    }
}
