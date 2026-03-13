package io.sentry.logger;

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
import io.sentry.SentryLogEvent;
import io.sentry.SentryLogEventAttributeValue;
import io.sentry.SentryLogLevel;
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
public final class LoggerApi implements ILoggerApi {
    private final Scopes scopes;

    public LoggerApi(Scopes scopes) {
        this.scopes = scopes;
    }

    private void captureLog(SentryLogLevel sentryLogLevel, SentryLogParameters sentryLogParameters, String str, Object... objArr) {
        SentryOptions options = this.scopes.getOptions();
        try {
            if (!this.scopes.isEnabled()) {
                options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'logger' call is a no-op.", new Object[0]);
                return;
            }
            if (!options.getLogs().isEnabled()) {
                options.getLogger().log(SentryLevel.WARNING, "Sentry Log is disabled and this 'logger' call is a no-op.", new Object[0]);
                return;
            }
            if (str == null) {
                return;
            }
            SentryDate timestamp = sentryLogParameters.getTimestamp();
            if (timestamp == null) {
                timestamp = options.getDateProvider().now();
            }
            String strMaybeFormatMessage = maybeFormatMessage(str, objArr);
            IScope combinedScopeView = this.scopes.getCombinedScopeView();
            PropagationContext propagationContext = combinedScopeView.getPropagationContext();
            ISpan span = combinedScopeView.getSpan();
            if (span == null) {
                TracingUtils.maybeUpdateBaggage(combinedScopeView, options);
            }
            SentryId traceId = span == null ? propagationContext.getTraceId() : span.getSpanContext().getTraceId();
            SpanId spanId = span == null ? propagationContext.getSpanId() : span.getSpanContext().getSpanId();
            SentryLogEvent sentryLogEvent = new SentryLogEvent(traceId, timestamp, strMaybeFormatMessage, sentryLogLevel);
            sentryLogEvent.setSpanId(spanId);
            sentryLogEvent.setAttributes(createAttributes(sentryLogParameters, str, objArr));
            sentryLogEvent.setSeverityNumber(Integer.valueOf(sentryLogLevel.getSeverityNumber()));
            this.scopes.getClient().captureLog(sentryLogEvent, combinedScopeView);
        } catch (Throwable th) {
            options.getLogger().log(SentryLevel.ERROR, "Error while capturing log event", th);
        }
    }

    private HashMap<String, SentryLogEventAttributeValue> createAttributes(SentryLogParameters sentryLogParameters, String str, Object... objArr) {
        HashMap<String, SentryLogEventAttributeValue> map = new HashMap<>();
        String origin = sentryLogParameters.getOrigin();
        if (!SpanContext.DEFAULT_ORIGIN.equalsIgnoreCase(origin)) {
            map.put("sentry.origin", new SentryLogEventAttributeValue(SentryAttributeType.STRING, origin));
        }
        SentryAttributes attributes = sentryLogParameters.getAttributes();
        if (attributes != null) {
            for (SentryAttribute sentryAttribute : attributes.getAttributes().values()) {
                Object value = sentryAttribute.getValue();
                map.put(sentryAttribute.getName(), new SentryLogEventAttributeValue(sentryAttribute.getType() == null ? getType(value) : sentryAttribute.getType(), value));
            }
        }
        if (objArr != null) {
            int i10 = 0;
            for (Object obj : objArr) {
                map.put("sentry.message.parameter." + i10, new SentryLogEventAttributeValue(getType(obj), obj));
                i10++;
            }
            if (i10 > 0 && map.get("sentry.message.template") == null) {
                map.put("sentry.message.template", new SentryLogEventAttributeValue(SentryAttributeType.STRING, str));
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

    private String maybeFormatMessage(String str, Object[] objArr) {
        if (objArr != null && objArr.length != 0) {
            try {
                return String.format(str, objArr);
            } catch (Throwable th) {
                this.scopes.getOptions().getLogger().log(SentryLevel.ERROR, "Error while running log through String.format", th);
            }
        }
        return str;
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

    @Override // io.sentry.logger.ILoggerApi
    public void debug(String str, Object... objArr) {
        log(SentryLogLevel.DEBUG, str, objArr);
    }

    @Override // io.sentry.logger.ILoggerApi
    public void error(String str, Object... objArr) {
        log(SentryLogLevel.ERROR, str, objArr);
    }

    @Override // io.sentry.logger.ILoggerApi
    public void fatal(String str, Object... objArr) {
        log(SentryLogLevel.FATAL, str, objArr);
    }

    @Override // io.sentry.logger.ILoggerApi
    public void info(String str, Object... objArr) {
        log(SentryLogLevel.INFO, str, objArr);
    }

    @Override // io.sentry.logger.ILoggerApi
    public void log(SentryLogLevel sentryLogLevel, String str, Object... objArr) {
        captureLog(sentryLogLevel, SentryLogParameters.create(null, null), str, objArr);
    }

    @Override // io.sentry.logger.ILoggerApi
    public void trace(String str, Object... objArr) {
        log(SentryLogLevel.TRACE, str, objArr);
    }

    @Override // io.sentry.logger.ILoggerApi
    public void warn(String str, Object... objArr) {
        log(SentryLogLevel.WARN, str, objArr);
    }

    @Override // io.sentry.logger.ILoggerApi
    public void log(SentryLogLevel sentryLogLevel, SentryDate sentryDate, String str, Object... objArr) {
        captureLog(sentryLogLevel, SentryLogParameters.create(sentryDate, null), str, objArr);
    }

    @Override // io.sentry.logger.ILoggerApi
    public void log(SentryLogLevel sentryLogLevel, SentryLogParameters sentryLogParameters, String str, Object... objArr) {
        captureLog(sentryLogLevel, sentryLogParameters, str, objArr);
    }
}
