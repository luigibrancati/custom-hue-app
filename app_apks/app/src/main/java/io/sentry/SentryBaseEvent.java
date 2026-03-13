package io.sentry;

import io.sentry.Breadcrumb;
import io.sentry.exception.ExceptionMechanismException;
import io.sentry.protocol.Contexts;
import io.sentry.protocol.DebugMeta;
import io.sentry.protocol.Request;
import io.sentry.protocol.SdkVersion;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.User;
import io.sentry.util.CollectionUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class SentryBaseEvent {
    public static final String DEFAULT_PLATFORM = "java";
    private List<Breadcrumb> breadcrumbs;
    private final Contexts contexts;
    private DebugMeta debugMeta;
    private String dist;
    private String environment;
    private SentryId eventId;
    private Map<String, Object> extra;
    private String platform;
    private String release;
    private Request request;
    private SdkVersion sdk;
    private String serverName;
    private Map<String, String> tags;
    protected transient Throwable throwable;
    private User user;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Deserializer {
        public boolean deserializeValue(SentryBaseEvent sentryBaseEvent, String str, ObjectReader objectReader, ILogger iLogger) {
            str.getClass();
            switch (str) {
                case "debug_meta":
                    sentryBaseEvent.debugMeta = (DebugMeta) objectReader.nextOrNull(iLogger, new DebugMeta.Deserializer());
                    return true;
                case "server_name":
                    sentryBaseEvent.serverName = objectReader.nextStringOrNull();
                    return true;
                case "contexts":
                    sentryBaseEvent.contexts.putAll(new Contexts.Deserializer().deserialize(objectReader, iLogger));
                    return true;
                case "environment":
                    sentryBaseEvent.environment = objectReader.nextStringOrNull();
                    return true;
                case "breadcrumbs":
                    sentryBaseEvent.breadcrumbs = objectReader.nextListOrNull(iLogger, new Breadcrumb.Deserializer());
                    return true;
                case "sdk":
                    sentryBaseEvent.sdk = (SdkVersion) objectReader.nextOrNull(iLogger, new SdkVersion.Deserializer());
                    return true;
                case "dist":
                    sentryBaseEvent.dist = objectReader.nextStringOrNull();
                    return true;
                case "tags":
                    sentryBaseEvent.tags = CollectionUtils.newConcurrentHashMap((Map) objectReader.nextObjectOrNull());
                    return true;
                case "user":
                    sentryBaseEvent.user = (User) objectReader.nextOrNull(iLogger, new User.Deserializer());
                    return true;
                case "extra":
                    sentryBaseEvent.extra = CollectionUtils.newConcurrentHashMap((Map) objectReader.nextObjectOrNull());
                    return true;
                case "event_id":
                    sentryBaseEvent.eventId = (SentryId) objectReader.nextOrNull(iLogger, new SentryId.Deserializer());
                    return true;
                case "release":
                    sentryBaseEvent.release = objectReader.nextStringOrNull();
                    return true;
                case "request":
                    sentryBaseEvent.request = (Request) objectReader.nextOrNull(iLogger, new Request.Deserializer());
                    return true;
                case "platform":
                    sentryBaseEvent.platform = objectReader.nextStringOrNull();
                    return true;
                default:
                    return false;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class JsonKeys {
        public static final String BREADCRUMBS = "breadcrumbs";
        public static final String CONTEXTS = "contexts";
        public static final String DEBUG_META = "debug_meta";
        public static final String DIST = "dist";
        public static final String ENVIRONMENT = "environment";
        public static final String EVENT_ID = "event_id";
        public static final String EXTRA = "extra";
        public static final String PLATFORM = "platform";
        public static final String RELEASE = "release";
        public static final String REQUEST = "request";
        public static final String SDK = "sdk";
        public static final String SERVER_NAME = "server_name";
        public static final String TAGS = "tags";
        public static final String USER = "user";
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Serializer {
        public void serialize(SentryBaseEvent sentryBaseEvent, ObjectWriter objectWriter, ILogger iLogger) {
            if (sentryBaseEvent.eventId != null) {
                objectWriter.name("event_id").value(iLogger, sentryBaseEvent.eventId);
            }
            objectWriter.name("contexts").value(iLogger, sentryBaseEvent.contexts);
            if (sentryBaseEvent.sdk != null) {
                objectWriter.name("sdk").value(iLogger, sentryBaseEvent.sdk);
            }
            if (sentryBaseEvent.request != null) {
                objectWriter.name(JsonKeys.REQUEST).value(iLogger, sentryBaseEvent.request);
            }
            if (sentryBaseEvent.tags != null && !sentryBaseEvent.tags.isEmpty()) {
                objectWriter.name("tags").value(iLogger, sentryBaseEvent.tags);
            }
            if (sentryBaseEvent.release != null) {
                objectWriter.name("release").value(sentryBaseEvent.release);
            }
            if (sentryBaseEvent.environment != null) {
                objectWriter.name("environment").value(sentryBaseEvent.environment);
            }
            if (sentryBaseEvent.platform != null) {
                objectWriter.name("platform").value(sentryBaseEvent.platform);
            }
            if (sentryBaseEvent.user != null) {
                objectWriter.name(JsonKeys.USER).value(iLogger, sentryBaseEvent.user);
            }
            if (sentryBaseEvent.serverName != null) {
                objectWriter.name(JsonKeys.SERVER_NAME).value(sentryBaseEvent.serverName);
            }
            if (sentryBaseEvent.dist != null) {
                objectWriter.name(JsonKeys.DIST).value(sentryBaseEvent.dist);
            }
            if (sentryBaseEvent.breadcrumbs != null && !sentryBaseEvent.breadcrumbs.isEmpty()) {
                objectWriter.name(JsonKeys.BREADCRUMBS).value(iLogger, sentryBaseEvent.breadcrumbs);
            }
            if (sentryBaseEvent.debugMeta != null) {
                objectWriter.name("debug_meta").value(iLogger, sentryBaseEvent.debugMeta);
            }
            if (sentryBaseEvent.extra == null || sentryBaseEvent.extra.isEmpty()) {
                return;
            }
            objectWriter.name(JsonKeys.EXTRA).value(iLogger, sentryBaseEvent.extra);
        }
    }

    public SentryBaseEvent(SentryId sentryId) {
        this.contexts = new Contexts();
        this.eventId = sentryId;
    }

    public void addBreadcrumb(Breadcrumb breadcrumb) {
        if (this.breadcrumbs == null) {
            this.breadcrumbs = new ArrayList();
        }
        this.breadcrumbs.add(breadcrumb);
    }

    public List<Breadcrumb> getBreadcrumbs() {
        return this.breadcrumbs;
    }

    public Contexts getContexts() {
        return this.contexts;
    }

    public DebugMeta getDebugMeta() {
        return this.debugMeta;
    }

    public String getDist() {
        return this.dist;
    }

    public String getEnvironment() {
        return this.environment;
    }

    public SentryId getEventId() {
        return this.eventId;
    }

    public Object getExtra(String str) {
        Map<String, Object> map = this.extra;
        if (map == null || str == null) {
            return null;
        }
        return map.get(str);
    }

    public Map<String, Object> getExtras() {
        return this.extra;
    }

    public String getPlatform() {
        return this.platform;
    }

    public String getRelease() {
        return this.release;
    }

    public Request getRequest() {
        return this.request;
    }

    public SdkVersion getSdk() {
        return this.sdk;
    }

    public String getServerName() {
        return this.serverName;
    }

    public String getTag(String str) {
        Map<String, String> map = this.tags;
        if (map == null || str == null) {
            return null;
        }
        return map.get(str);
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public Throwable getThrowable() {
        Throwable th = this.throwable;
        return th instanceof ExceptionMechanismException ? ((ExceptionMechanismException) th).getThrowable() : th;
    }

    public Throwable getThrowableMechanism() {
        return this.throwable;
    }

    public User getUser() {
        return this.user;
    }

    public void removeExtra(String str) {
        Map<String, Object> map = this.extra;
        if (map == null || str == null) {
            return;
        }
        map.remove(str);
    }

    public void removeTag(String str) {
        Map<String, String> map = this.tags;
        if (map == null || str == null) {
            return;
        }
        map.remove(str);
    }

    public void setBreadcrumbs(List<Breadcrumb> list) {
        this.breadcrumbs = CollectionUtils.newArrayList(list);
    }

    public void setDebugMeta(DebugMeta debugMeta) {
        this.debugMeta = debugMeta;
    }

    public void setDist(String str) {
        this.dist = str;
    }

    public void setEnvironment(String str) {
        this.environment = str;
    }

    public void setEventId(SentryId sentryId) {
        this.eventId = sentryId;
    }

    public void setExtra(String str, Object obj) {
        if (this.extra == null) {
            this.extra = new HashMap();
        }
        if (str == null) {
            return;
        }
        if (obj == null) {
            removeExtra(str);
        } else {
            this.extra.put(str, obj);
        }
    }

    public void setExtras(Map<String, Object> map) {
        this.extra = CollectionUtils.newHashMap(map);
    }

    public void setPlatform(String str) {
        this.platform = str;
    }

    public void setRelease(String str) {
        this.release = str;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public void setSdk(SdkVersion sdkVersion) {
        this.sdk = sdkVersion;
    }

    public void setServerName(String str) {
        this.serverName = str;
    }

    public void setTag(String str, String str2) {
        if (this.tags == null) {
            this.tags = new HashMap();
        }
        if (str == null) {
            return;
        }
        if (str2 == null) {
            removeTag(str);
        } else {
            this.tags.put(str, str2);
        }
    }

    public void setTags(Map<String, String> map) {
        this.tags = CollectionUtils.newHashMap(map);
    }

    public void setThrowable(Throwable th) {
        this.throwable = th;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public SentryBaseEvent() {
        this(new SentryId());
    }

    public void addBreadcrumb(String str) {
        addBreadcrumb(new Breadcrumb(str));
    }
}
