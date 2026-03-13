package io.sentry.metrics;

import io.sentry.HostnameCache;
import io.sentry.IScope;
import io.sentry.ISpan;
import io.sentry.PropagationContext;
import io.sentry.Scopes;
import io.sentry.SentryAttribute;
import io.sentry.SentryAttributeType;
import io.sentry.SentryAttributes;
import io.sentry.SentryDate;
import io.sentry.SentryLevel;
import io.sentry.SentryLogEventAttributeValue;
import io.sentry.SentryMetricsEvent;
import io.sentry.SentryOptions;
import io.sentry.SpanContext;
import io.sentry.SpanId;
import io.sentry.protocol.SdkVersion;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.User;
import io.sentry.util.Platform;
import io.sentry.util.TracingUtils;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class MetricsApi implements IMetricsApi {
    private final Scopes scopes;

    public MetricsApi(Scopes scopes) {
        this.scopes = scopes;
    }

    private void captureMetrics(SentryMetricsParameters sentryMetricsParameters, String str, String str2, Double d10, String str3) {
        SentryOptions options = this.scopes.getOptions();
        try {
            if (!this.scopes.isEnabled()) {
                options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'metrics' call is a no-op.", new Object[0]);
                return;
            }
            if (!options.getMetrics().isEnabled()) {
                options.getLogger().log(SentryLevel.WARNING, "Sentry Metrics is disabled and this 'metrics' call is a no-op.", new Object[0]);
                return;
            }
            if (str == null || str2 == null || d10 == null) {
                return;
            }
            SentryDate timestamp = sentryMetricsParameters.getTimestamp();
            if (timestamp == null) {
                timestamp = options.getDateProvider().now();
            }
            SentryDate sentryDate = timestamp;
            IScope combinedScopeView = this.scopes.getCombinedScopeView();
            PropagationContext propagationContext = combinedScopeView.getPropagationContext();
            ISpan span = combinedScopeView.getSpan();
            if (span == null) {
                TracingUtils.maybeUpdateBaggage(combinedScopeView, options);
            }
            SentryId traceId = span == null ? propagationContext.getTraceId() : span.getSpanContext().getTraceId();
            SpanId spanId = span == null ? propagationContext.getSpanId() : span.getSpanContext().getSpanId();
            SentryMetricsEvent sentryMetricsEvent = new SentryMetricsEvent(traceId, sentryDate, str, str2, d10);
            sentryMetricsEvent.setSpanId(spanId);
            sentryMetricsEvent.setUnit(str3);
            sentryMetricsEvent.setAttributes(createAttributes(sentryMetricsParameters));
            this.scopes.getClient().captureMetric(sentryMetricsEvent, combinedScopeView, sentryMetricsParameters.getHint());
        } catch (Throwable th) {
            options.getLogger().log(SentryLevel.ERROR, "Error while capturing metrics event", th);
        }
    }

    private HashMap<String, SentryLogEventAttributeValue> createAttributes(SentryMetricsParameters sentryMetricsParameters) {
        HashMap<String, SentryLogEventAttributeValue> map = new HashMap<>();
        String origin = sentryMetricsParameters.getOrigin();
        if (!SpanContext.DEFAULT_ORIGIN.equalsIgnoreCase(origin)) {
            map.put("sentry.origin", new SentryLogEventAttributeValue(SentryAttributeType.STRING, origin));
        }
        SentryAttributes attributes = sentryMetricsParameters.getAttributes();
        if (attributes != null) {
            for (SentryAttribute sentryAttribute : attributes.getAttributes().values()) {
                Object value = sentryAttribute.getValue();
                map.put(sentryAttribute.getName(), new SentryLogEventAttributeValue(sentryAttribute.getType() == null ? getType(value) : sentryAttribute.getType(), value));
            }
        }
        SdkVersion sdkVersion = this.scopes.getOptions().getSdkVersion();
        if (sdkVersion != null) {
            SentryAttributeType sentryAttributeType = SentryAttributeType.STRING;
            map.put("sentry.sdk.name", new SentryLogEventAttributeValue(sentryAttributeType, sdkVersion.getName()));
            map.put("sentry.sdk.version", new SentryLogEventAttributeValue(sentryAttributeType, sdkVersion.getVersion()));
        }
        String environment = this.scopes.getOptions().getEnvironment();
        if (environment != null) {
            map.put("sentry.environment", new SentryLogEventAttributeValue(SentryAttributeType.STRING, environment));
        }
        SentryId replayId = this.scopes.getCombinedScopeView().getReplayId();
        SentryId sentryId = SentryId.EMPTY_ID;
        if (sentryId.equals(replayId)) {
            SentryId replayId2 = this.scopes.getOptions().getReplayController().getReplayId();
            if (!sentryId.equals(replayId2)) {
                map.put("sentry.replay_id", new SentryLogEventAttributeValue(SentryAttributeType.STRING, replayId2.toString()));
                map.put("sentry._internal.replay_is_buffering", new SentryLogEventAttributeValue(SentryAttributeType.BOOLEAN, Boolean.TRUE));
            }
        } else {
            map.put("sentry.replay_id", new SentryLogEventAttributeValue(SentryAttributeType.STRING, replayId.toString()));
        }
        String release = this.scopes.getOptions().getRelease();
        if (release != null) {
            map.put("sentry.release", new SentryLogEventAttributeValue(SentryAttributeType.STRING, release));
        }
        if (Platform.isJvm()) {
            setServerName(map);
        }
        if (this.scopes.getOptions().isSendDefaultPii()) {
            setUser(map);
        }
        return map;
    }

    private SentryAttributeType getType(Object obj) {
        return obj instanceof Boolean ? SentryAttributeType.BOOLEAN : obj instanceof Integer ? SentryAttributeType.INTEGER : obj instanceof Number ? SentryAttributeType.DOUBLE : SentryAttributeType.STRING;
    }

    private void setServerName(HashMap<String, SentryLogEventAttributeValue> map) {
        String hostname;
        SentryOptions options = this.scopes.getOptions();
        String serverName = options.getServerName();
        if (serverName != null) {
            map.put("server.address", new SentryLogEventAttributeValue(SentryAttributeType.STRING, serverName));
        } else {
            if (!options.isAttachServerName() || (hostname = HostnameCache.getInstance().getHostname()) == null) {
                return;
            }
            map.put("server.address", new SentryLogEventAttributeValue(SentryAttributeType.STRING, hostname));
        }
    }

    private void setUser(HashMap<String, SentryLogEventAttributeValue> map) {
        User user = this.scopes.getCombinedScopeView().getUser();
        if (user == null) {
            String distinctId = this.scopes.getOptions().getDistinctId();
            if (distinctId != null) {
                map.put("user.id", new SentryLogEventAttributeValue(SentryAttributeType.STRING, distinctId));
                return;
            }
            return;
        }
        String id2 = user.getId();
        if (id2 != null) {
            map.put("user.id", new SentryLogEventAttributeValue(SentryAttributeType.STRING, id2));
        }
        String username = user.getUsername();
        if (username != null) {
            map.put("user.name", new SentryLogEventAttributeValue(SentryAttributeType.STRING, username));
        }
        String email = user.getEmail();
        if (email != null) {
            map.put("user.email", new SentryLogEventAttributeValue(SentryAttributeType.STRING, email));
        }
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void count(String str) {
        captureMetrics(SentryMetricsParameters.create(null, null), str, "counter", Double.valueOf(1.0d), null);
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void distribution(String str, Double d10) {
        captureMetrics(SentryMetricsParameters.create(null, null), str, "distribution", d10, null);
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void gauge(String str, Double d10) {
        captureMetrics(SentryMetricsParameters.create(null, null), str, "gauge", d10, null);
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void count(String str, Double d10) {
        captureMetrics(SentryMetricsParameters.create(null, null), str, "counter", d10, null);
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void distribution(String str, Double d10, String str2) {
        captureMetrics(SentryMetricsParameters.create(null, null), str, "distribution", d10, str2);
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void gauge(String str, Double d10, String str2) {
        captureMetrics(SentryMetricsParameters.create(null, null), str, "gauge", d10, str2);
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void count(String str, String str2) {
        captureMetrics(SentryMetricsParameters.create(null, null), str, "counter", Double.valueOf(1.0d), str2);
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void distribution(String str, Double d10, String str2, SentryMetricsParameters sentryMetricsParameters) {
        captureMetrics(sentryMetricsParameters, str, "distribution", d10, str2);
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void gauge(String str, Double d10, String str2, SentryMetricsParameters sentryMetricsParameters) {
        captureMetrics(sentryMetricsParameters, str, "gauge", d10, str2);
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void count(String str, Double d10, String str2) {
        captureMetrics(SentryMetricsParameters.create(null, null), str, "counter", d10, str2);
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void count(String str, Double d10, String str2, SentryMetricsParameters sentryMetricsParameters) {
        captureMetrics(sentryMetricsParameters, str, "counter", d10, str2);
    }
}
