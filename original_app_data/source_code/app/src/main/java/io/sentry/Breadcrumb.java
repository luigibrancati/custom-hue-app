package io.sentry;

import io.sentry.SentryBaseEvent;
import io.sentry.SentryLevel;
import io.sentry.protocol.Response;
import io.sentry.util.CollectionUtils;
import io.sentry.util.HttpUtils;
import io.sentry.util.Objects;
import io.sentry.util.UrlUtils;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class Breadcrumb implements JsonUnknown, JsonSerializable, Comparable<Breadcrumb> {
    private String category;
    private Map<String, Object> data;
    private SentryLevel level;
    private String message;
    private final Long nanos;
    private String origin;
    private Date timestamp;
    private final Long timestampMs;
    private String type;
    private Map<String, Object> unknown;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Deserializer implements JsonDeserializer<Breadcrumb> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public Breadcrumb deserialize(ObjectReader objectReader, ILogger iLogger) {
            String strNextName;
            objectReader.beginObject();
            Date currentDateTime = DateUtils.getCurrentDateTime();
            Map concurrentHashMap = new ConcurrentHashMap();
            String strNextStringOrNull = null;
            String strNextStringOrNull2 = null;
            String strNextStringOrNull3 = null;
            String strNextStringOrNull4 = null;
            SentryLevel sentryLevelDeserialize = null;
            ConcurrentHashMap concurrentHashMap2 = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "origin":
                        strNextStringOrNull4 = objectReader.nextStringOrNull();
                        break;
                    case "data":
                        Map mapNewConcurrentHashMap = CollectionUtils.newConcurrentHashMap((Map) objectReader.nextObjectOrNull());
                        if (mapNewConcurrentHashMap == null) {
                            break;
                        } else {
                            concurrentHashMap = mapNewConcurrentHashMap;
                            break;
                        }
                        break;
                    case "type":
                        strNextStringOrNull2 = objectReader.nextStringOrNull();
                        break;
                    case "category":
                        strNextStringOrNull3 = objectReader.nextStringOrNull();
                        break;
                    case "timestamp":
                        Date dateNextDateOrNull = objectReader.nextDateOrNull(iLogger);
                        if (dateNextDateOrNull == null) {
                            break;
                        } else {
                            currentDateTime = dateNextDateOrNull;
                            break;
                        }
                        break;
                    case "level":
                        try {
                            sentryLevelDeserialize = new SentryLevel.Deserializer().deserialize(objectReader, iLogger);
                            break;
                        } catch (Exception e10) {
                            iLogger.log(SentryLevel.ERROR, e10, "Error when deserializing SentryLevel", new Object[0]);
                            break;
                        }
                        break;
                    case "message":
                        strNextStringOrNull = objectReader.nextStringOrNull();
                        break;
                    default:
                        if (concurrentHashMap2 == null) {
                            concurrentHashMap2 = new ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap2, strNextName);
                        break;
                }
            }
            Breadcrumb breadcrumb = new Breadcrumb(currentDateTime);
            breadcrumb.message = strNextStringOrNull;
            breadcrumb.type = strNextStringOrNull2;
            breadcrumb.data = concurrentHashMap;
            breadcrumb.category = strNextStringOrNull3;
            breadcrumb.origin = strNextStringOrNull4;
            breadcrumb.level = sentryLevelDeserialize;
            breadcrumb.setUnknown(concurrentHashMap2);
            objectReader.endObject();
            return breadcrumb;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class JsonKeys {
        public static final String CATEGORY = "category";
        public static final String DATA = "data";
        public static final String LEVEL = "level";
        public static final String MESSAGE = "message";
        public static final String ORIGIN = "origin";
        public static final String TIMESTAMP = "timestamp";
        public static final String TYPE = "type";
    }

    public Breadcrumb(Date date) {
        this.data = new ConcurrentHashMap();
        this.nanos = Long.valueOf(System.nanoTime());
        this.timestamp = date;
        this.timestampMs = null;
    }

    private static boolean breadcrumbEquals(Breadcrumb breadcrumb, Breadcrumb breadcrumb2) {
        return breadcrumb.getTimestamp().getTime() == breadcrumb2.getTimestamp().getTime() && Objects.equals(breadcrumb.message, breadcrumb2.message) && Objects.equals(breadcrumb.type, breadcrumb2.type) && Objects.equals(breadcrumb.category, breadcrumb2.category) && Objects.equals(breadcrumb.origin, breadcrumb2.origin) && breadcrumb.level == breadcrumb2.level;
    }

    private static int breadcrumbHashCode(Breadcrumb breadcrumb) {
        return Objects.hash(Long.valueOf(breadcrumb.getTimestamp().getTime()), breadcrumb.message, breadcrumb.type, breadcrumb.category, breadcrumb.origin, breadcrumb.level);
    }

    public static Breadcrumb debug(String str) {
        Breadcrumb breadcrumb = new Breadcrumb();
        breadcrumb.setType("debug");
        breadcrumb.setMessage(str);
        breadcrumb.setLevel(SentryLevel.DEBUG);
        return breadcrumb;
    }

    public static Breadcrumb error(String str) {
        Breadcrumb breadcrumb = new Breadcrumb();
        breadcrumb.setType("error");
        breadcrumb.setMessage(str);
        breadcrumb.setLevel(SentryLevel.ERROR);
        return breadcrumb;
    }

    public static Breadcrumb fromMap(Map<String, Object> map, SentryOptions sentryOptions) {
        Object value;
        Date dateDateOrNull;
        Date currentDateTime = DateUtils.getCurrentDateTime();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        SentryLevel sentryLevelValueOf = null;
        ConcurrentHashMap concurrentHashMap2 = null;
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            value = entry.getValue();
            String key = entry.getKey();
            key.getClass();
            switch (key) {
                case "origin":
                    if (!(value instanceof String)) {
                        str4 = null;
                        break;
                    } else {
                        str4 = (String) value;
                        break;
                    }
                    break;
                case "data":
                    Map map2 = value instanceof Map ? (Map) value : null;
                    if (map2 == null) {
                        break;
                    } else {
                        for (Map.Entry entry2 : map2.entrySet()) {
                            if (!(entry2.getKey() instanceof String) || entry2.getValue() == null) {
                                sentryOptions.getLogger().log(SentryLevel.WARNING, "Invalid key or null value in data map.", new Object[0]);
                            } else {
                                concurrentHashMap.put((String) entry2.getKey(), entry2.getValue());
                            }
                        }
                        break;
                    }
                    break;
                case "type":
                    if (!(value instanceof String)) {
                        str2 = null;
                        break;
                    } else {
                        str2 = (String) value;
                        break;
                    }
                    break;
                case "category":
                    if (!(value instanceof String)) {
                        str3 = null;
                        break;
                    } else {
                        str3 = (String) value;
                        break;
                    }
                    break;
                case "timestamp":
                    if ((value instanceof String) && (dateDateOrNull = ObjectReader.dateOrNull((String) value, sentryOptions.getLogger())) != null) {
                        currentDateTime = dateDateOrNull;
                        break;
                    } else {
                        break;
                    }
                    break;
                case "level":
                    String str5 = value instanceof String ? (String) value : null;
                    if (str5 == null) {
                        break;
                    } else {
                        try {
                            sentryLevelValueOf = SentryLevel.valueOf(str5.toUpperCase(Locale.ROOT));
                        } catch (Exception unused) {
                        }
                        break;
                    }
                    break;
                case "message":
                    if (!(value instanceof String)) {
                        str = null;
                        break;
                    } else {
                        str = (String) value;
                        break;
                    }
                    break;
                default:
                    if (concurrentHashMap2 == null) {
                        concurrentHashMap2 = new ConcurrentHashMap();
                    }
                    concurrentHashMap2.put(entry.getKey(), entry.getValue());
                    break;
            }
        }
        Breadcrumb breadcrumb = new Breadcrumb(currentDateTime);
        breadcrumb.message = str;
        breadcrumb.type = str2;
        breadcrumb.data = concurrentHashMap;
        breadcrumb.category = str3;
        breadcrumb.origin = str4;
        breadcrumb.level = sentryLevelValueOf;
        breadcrumb.setUnknown(concurrentHashMap2);
        return breadcrumb;
    }

    public static Breadcrumb graphqlDataFetcher(String str, String str2, String str3, String str4) {
        Breadcrumb breadcrumb = new Breadcrumb();
        breadcrumb.setType("graphql");
        breadcrumb.setCategory("graphql.fetcher");
        if (str != null) {
            breadcrumb.setData("path", str);
        }
        if (str2 != null) {
            breadcrumb.setData("field", str2);
        }
        if (str3 != null) {
            breadcrumb.setData("type", str3);
        }
        if (str4 != null) {
            breadcrumb.setData("object_type", str4);
        }
        return breadcrumb;
    }

    public static Breadcrumb graphqlDataLoader(Iterable<?> iterable, Class<?> cls, Class<?> cls2, String str) {
        Breadcrumb breadcrumb = new Breadcrumb();
        breadcrumb.setType("graphql");
        breadcrumb.setCategory("graphql.data_loader");
        ArrayList arrayList = new ArrayList();
        Iterator<?> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toString());
        }
        breadcrumb.setData("keys", arrayList);
        if (cls != null) {
            breadcrumb.setData("key_type", cls.getName());
        }
        if (cls2 != null) {
            breadcrumb.setData("value_type", cls2.getName());
        }
        if (str != null) {
            breadcrumb.setData("name", str);
        }
        return breadcrumb;
    }

    public static Breadcrumb graphqlOperation(String str, String str2, String str3) {
        Breadcrumb breadcrumb = new Breadcrumb();
        breadcrumb.setType("graphql");
        if (str != null) {
            breadcrumb.setData("operation_name", str);
        }
        if (str2 != null) {
            breadcrumb.setData("operation_type", str2);
            breadcrumb.setCategory(str2);
        } else {
            breadcrumb.setCategory("graphql.operation");
        }
        if (str3 != null) {
            breadcrumb.setData("operation_id", str3);
        }
        return breadcrumb;
    }

    public static Breadcrumb http(String str, String str2) {
        Breadcrumb breadcrumb = new Breadcrumb();
        UrlUtils.UrlDetails urlDetails = UrlUtils.parse(str);
        breadcrumb.setType("http");
        breadcrumb.setCategory("http");
        if (urlDetails.getUrl() != null) {
            breadcrumb.setData("url", urlDetails.getUrl());
        }
        breadcrumb.setData("method", str2.toUpperCase(Locale.ROOT));
        if (urlDetails.getQuery() != null) {
            breadcrumb.setData(SpanDataConvention.HTTP_QUERY_KEY, urlDetails.getQuery());
        }
        if (urlDetails.getFragment() != null) {
            breadcrumb.setData(SpanDataConvention.HTTP_FRAGMENT_KEY, urlDetails.getFragment());
        }
        return breadcrumb;
    }

    private static boolean httpBreadcrumbEquals(Breadcrumb breadcrumb, Breadcrumb breadcrumb2) {
        return breadcrumbEquals(breadcrumb, breadcrumb2) && Objects.equals(breadcrumb.getData(Response.JsonKeys.STATUS_CODE), breadcrumb2.getData(Response.JsonKeys.STATUS_CODE)) && Objects.equals(breadcrumb.getData("url"), breadcrumb2.getData("url")) && Objects.equals(breadcrumb.getData("method"), breadcrumb2.getData("method")) && Objects.equals(breadcrumb.getData(SpanDataConvention.HTTP_FRAGMENT_KEY), breadcrumb2.getData(SpanDataConvention.HTTP_FRAGMENT_KEY)) && Objects.equals(breadcrumb.getData(SpanDataConvention.HTTP_QUERY_KEY), breadcrumb2.getData(SpanDataConvention.HTTP_QUERY_KEY));
    }

    private static int httpBreadcrumbHashCode(Breadcrumb breadcrumb) {
        return Objects.hash(Long.valueOf(breadcrumb.getTimestamp().getTime()), breadcrumb.message, breadcrumb.type, breadcrumb.category, breadcrumb.origin, breadcrumb.level, breadcrumb.getData(Response.JsonKeys.STATUS_CODE), breadcrumb.getData("url"), breadcrumb.getData("method"), breadcrumb.getData(SpanDataConvention.HTTP_FRAGMENT_KEY), breadcrumb.getData(SpanDataConvention.HTTP_QUERY_KEY));
    }

    public static Breadcrumb info(String str) {
        Breadcrumb breadcrumb = new Breadcrumb();
        breadcrumb.setType("info");
        breadcrumb.setMessage(str);
        breadcrumb.setLevel(SentryLevel.INFO);
        return breadcrumb;
    }

    private static SentryLevel levelFromHttpStatusCode(Integer num) {
        if (HttpUtils.isHttpClientError(num.intValue())) {
            return SentryLevel.WARNING;
        }
        if (HttpUtils.isHttpServerError(num.intValue())) {
            return SentryLevel.ERROR;
        }
        return null;
    }

    public static Breadcrumb navigation(String str, String str2) {
        Breadcrumb breadcrumb = new Breadcrumb();
        breadcrumb.setCategory("navigation");
        breadcrumb.setType("navigation");
        breadcrumb.setData("from", str);
        breadcrumb.setData("to", str2);
        return breadcrumb;
    }

    public static Breadcrumb query(String str) {
        Breadcrumb breadcrumb = new Breadcrumb();
        breadcrumb.setType("query");
        breadcrumb.setMessage(str);
        return breadcrumb;
    }

    public static Breadcrumb transaction(String str) {
        Breadcrumb breadcrumb = new Breadcrumb();
        breadcrumb.setType("default");
        breadcrumb.setCategory("sentry.transaction");
        breadcrumb.setMessage(str);
        return breadcrumb;
    }

    public static Breadcrumb ui(String str, String str2) {
        Breadcrumb breadcrumb = new Breadcrumb();
        breadcrumb.setType("default");
        breadcrumb.setCategory("ui." + str);
        breadcrumb.setMessage(str2);
        return breadcrumb;
    }

    public static Breadcrumb user(String str, String str2) {
        Breadcrumb breadcrumb = new Breadcrumb();
        breadcrumb.setType(SentryBaseEvent.JsonKeys.USER);
        breadcrumb.setCategory(str);
        breadcrumb.setMessage(str2);
        return breadcrumb;
    }

    public static Breadcrumb userInteraction(String str, String str2, String str3) {
        return userInteraction(str, str2, str3, Collections.EMPTY_MAP);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Breadcrumb.class != obj.getClass()) {
            return false;
        }
        Breadcrumb breadcrumb = (Breadcrumb) obj;
        return "http".equals(this.type) ? httpBreadcrumbEquals(this, breadcrumb) : breadcrumbEquals(this, breadcrumb);
    }

    public String getCategory() {
        return this.category;
    }

    public Map<String, Object> getData() {
        return this.data;
    }

    public SentryLevel getLevel() {
        return this.level;
    }

    public String getMessage() {
        return this.message;
    }

    public String getOrigin() {
        return this.origin;
    }

    public Date getTimestamp() {
        Date date = this.timestamp;
        if (date != null) {
            return (Date) date.clone();
        }
        Long l10 = this.timestampMs;
        if (l10 == null) {
            throw new IllegalStateException("No timestamp set for breadcrumb");
        }
        Date dateTime = DateUtils.getDateTime(l10.longValue());
        this.timestamp = dateTime;
        return dateTime;
    }

    public String getType() {
        return this.type;
    }

    @Override // io.sentry.JsonUnknown
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public int hashCode() {
        return "http".equals(this.type) ? httpBreadcrumbHashCode(this) : breadcrumbHashCode(this);
    }

    public void removeData(String str) {
        if (str == null) {
            return;
        }
        this.data.remove(str);
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("timestamp").value(iLogger, getTimestamp());
        if (this.message != null) {
            objectWriter.name("message").value(this.message);
        }
        if (this.type != null) {
            objectWriter.name("type").value(this.type);
        }
        objectWriter.name("data").value(iLogger, this.data);
        if (this.category != null) {
            objectWriter.name("category").value(this.category);
        }
        if (this.origin != null) {
            objectWriter.name("origin").value(this.origin);
        }
        if (this.level != null) {
            objectWriter.name("level").value(iLogger, this.level);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.unknown.get(str);
                objectWriter.name(str);
                objectWriter.value(iLogger, obj);
            }
        }
        objectWriter.endObject();
    }

    public void setCategory(String str) {
        this.category = str;
    }

    public void setData(String str, Object obj) {
        if (str == null) {
            return;
        }
        if (obj == null) {
            removeData(str);
        } else {
            this.data.put(str, obj);
        }
    }

    public void setLevel(SentryLevel sentryLevel) {
        this.level = sentryLevel;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setOrigin(String str) {
        this.origin = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public static Breadcrumb userInteraction(String str, String str2, String str3, String str4, Map<String, Object> map) {
        Breadcrumb breadcrumb = new Breadcrumb();
        breadcrumb.setType(SentryBaseEvent.JsonKeys.USER);
        breadcrumb.setCategory("ui." + str);
        if (str2 != null) {
            breadcrumb.setData("view.id", str2);
        }
        if (str3 != null) {
            breadcrumb.setData("view.class", str3);
        }
        if (str4 != null) {
            breadcrumb.setData("view.tag", str4);
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            breadcrumb.getData().put(entry.getKey(), entry.getValue());
        }
        breadcrumb.setLevel(SentryLevel.INFO);
        return breadcrumb;
    }

    @Override // java.lang.Comparable
    public int compareTo(Breadcrumb breadcrumb) {
        return this.nanos.compareTo(breadcrumb.nanos);
    }

    public Object getData(String str) {
        if (str == null) {
            return null;
        }
        return this.data.get(str);
    }

    public Breadcrumb(long j10) {
        this.data = new ConcurrentHashMap();
        this.nanos = Long.valueOf(System.nanoTime());
        this.timestampMs = Long.valueOf(j10);
        this.timestamp = null;
    }

    public Breadcrumb(Breadcrumb breadcrumb) {
        this.data = new ConcurrentHashMap();
        this.nanos = Long.valueOf(System.nanoTime());
        this.timestamp = breadcrumb.timestamp;
        this.timestampMs = breadcrumb.timestampMs;
        this.message = breadcrumb.message;
        this.type = breadcrumb.type;
        this.category = breadcrumb.category;
        this.origin = breadcrumb.origin;
        Map<String, Object> mapNewConcurrentHashMap = CollectionUtils.newConcurrentHashMap(breadcrumb.data);
        if (mapNewConcurrentHashMap != null) {
            this.data = mapNewConcurrentHashMap;
        }
        this.unknown = CollectionUtils.newConcurrentHashMap(breadcrumb.unknown);
        this.level = breadcrumb.level;
    }

    public static Breadcrumb userInteraction(String str, String str2, String str3, Map<String, Object> map) {
        return userInteraction(str, str2, str3, null, map);
    }

    public static Breadcrumb http(String str, String str2, Integer num) {
        Breadcrumb breadcrumbHttp = http(str, str2);
        if (num != null) {
            breadcrumbHttp.setData(Response.JsonKeys.STATUS_CODE, num);
            breadcrumbHttp.setLevel(levelFromHttpStatusCode(num));
        }
        return breadcrumbHttp;
    }

    public Breadcrumb() {
        this(System.currentTimeMillis());
    }

    public Breadcrumb(String str) {
        this();
        this.message = str;
    }
}
