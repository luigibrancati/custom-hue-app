package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.util.CollectionUtils;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class Request implements JsonUnknown, JsonSerializable {
    private String apiTarget;
    private Long bodySize;
    private String cookies;
    private Object data;
    private Map<String, String> env;
    private String fragment;
    private Map<String, String> headers;
    private String method;
    private Map<String, String> other;
    private String queryString;
    private Map<String, Object> unknown;
    private String url;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Deserializer implements JsonDeserializer<Request> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public Request deserialize(ObjectReader objectReader, ILogger iLogger) {
            String strNextName;
            objectReader.beginObject();
            Request request = new Request();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "fragment":
                        request.fragment = objectReader.nextStringOrNull();
                        break;
                    case "method":
                        request.method = objectReader.nextStringOrNull();
                        break;
                    case "env":
                        Map map = (Map) objectReader.nextObjectOrNull();
                        if (map == null) {
                            break;
                        } else {
                            request.env = CollectionUtils.newConcurrentHashMap(map);
                            break;
                        }
                        break;
                    case "url":
                        request.url = objectReader.nextStringOrNull();
                        break;
                    case "data":
                        request.data = objectReader.nextObjectOrNull();
                        break;
                    case "other":
                        Map map2 = (Map) objectReader.nextObjectOrNull();
                        if (map2 == null) {
                            break;
                        } else {
                            request.other = CollectionUtils.newConcurrentHashMap(map2);
                            break;
                        }
                        break;
                    case "headers":
                        Map map3 = (Map) objectReader.nextObjectOrNull();
                        if (map3 == null) {
                            break;
                        } else {
                            request.headers = CollectionUtils.newConcurrentHashMap(map3);
                            break;
                        }
                        break;
                    case "cookies":
                        request.cookies = objectReader.nextStringOrNull();
                        break;
                    case "body_size":
                        request.bodySize = objectReader.nextLongOrNull();
                        break;
                    case "query_string":
                        request.queryString = objectReader.nextStringOrNull();
                        break;
                    case "api_target":
                        request.apiTarget = objectReader.nextStringOrNull();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            request.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return request;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class JsonKeys {
        public static final String API_TARGET = "api_target";
        public static final String BODY_SIZE = "body_size";
        public static final String COOKIES = "cookies";
        public static final String DATA = "data";
        public static final String ENV = "env";
        public static final String FRAGMENT = "fragment";
        public static final String HEADERS = "headers";
        public static final String METHOD = "method";
        public static final String OTHER = "other";
        public static final String QUERY_STRING = "query_string";
        public static final String URL = "url";
    }

    public Request() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Request.class == obj.getClass()) {
            Request request = (Request) obj;
            if (Objects.equals(this.url, request.url) && Objects.equals(this.method, request.method) && Objects.equals(this.queryString, request.queryString) && Objects.equals(this.cookies, request.cookies) && Objects.equals(this.headers, request.headers) && Objects.equals(this.env, request.env) && Objects.equals(this.bodySize, request.bodySize) && Objects.equals(this.fragment, request.fragment) && Objects.equals(this.apiTarget, request.apiTarget)) {
                return true;
            }
        }
        return false;
    }

    public String getApiTarget() {
        return this.apiTarget;
    }

    public Long getBodySize() {
        return this.bodySize;
    }

    public String getCookies() {
        return this.cookies;
    }

    public Object getData() {
        return this.data;
    }

    public Map<String, String> getEnvs() {
        return this.env;
    }

    public String getFragment() {
        return this.fragment;
    }

    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public String getMethod() {
        return this.method;
    }

    public Map<String, String> getOthers() {
        return this.other;
    }

    public String getQueryString() {
        return this.queryString;
    }

    @Override // io.sentry.JsonUnknown
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return Objects.hash(this.url, this.method, this.queryString, this.cookies, this.headers, this.env, this.bodySize, this.fragment, this.apiTarget);
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        if (this.url != null) {
            objectWriter.name("url").value(this.url);
        }
        if (this.method != null) {
            objectWriter.name("method").value(this.method);
        }
        if (this.queryString != null) {
            objectWriter.name(JsonKeys.QUERY_STRING).value(this.queryString);
        }
        if (this.data != null) {
            objectWriter.name("data").value(iLogger, this.data);
        }
        if (this.cookies != null) {
            objectWriter.name("cookies").value(this.cookies);
        }
        if (this.headers != null) {
            objectWriter.name("headers").value(iLogger, this.headers);
        }
        if (this.env != null) {
            objectWriter.name(JsonKeys.ENV).value(iLogger, this.env);
        }
        if (this.other != null) {
            objectWriter.name(JsonKeys.OTHER).value(iLogger, this.other);
        }
        if (this.fragment != null) {
            objectWriter.name(JsonKeys.FRAGMENT).value(iLogger, this.fragment);
        }
        if (this.bodySize != null) {
            objectWriter.name("body_size").value(iLogger, this.bodySize);
        }
        if (this.apiTarget != null) {
            objectWriter.name(JsonKeys.API_TARGET).value(iLogger, this.apiTarget);
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

    public void setApiTarget(String str) {
        this.apiTarget = str;
    }

    public void setBodySize(Long l10) {
        this.bodySize = l10;
    }

    public void setCookies(String str) {
        this.cookies = str;
    }

    public void setData(Object obj) {
        this.data = obj;
    }

    public void setEnvs(Map<String, String> map) {
        this.env = CollectionUtils.newConcurrentHashMap(map);
    }

    public void setFragment(String str) {
        this.fragment = str;
    }

    public void setHeaders(Map<String, String> map) {
        this.headers = CollectionUtils.newConcurrentHashMap(map);
    }

    public void setMethod(String str) {
        this.method = str;
    }

    public void setOthers(Map<String, String> map) {
        this.other = CollectionUtils.newConcurrentHashMap(map);
    }

    public void setQueryString(String str) {
        this.queryString = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public Request(Request request) {
        this.url = request.url;
        this.cookies = request.cookies;
        this.method = request.method;
        this.queryString = request.queryString;
        this.headers = CollectionUtils.newConcurrentHashMap(request.headers);
        this.env = CollectionUtils.newConcurrentHashMap(request.env);
        this.other = CollectionUtils.newConcurrentHashMap(request.other);
        this.unknown = CollectionUtils.newConcurrentHashMap(request.unknown);
        this.data = request.data;
        this.fragment = request.fragment;
        this.bodySize = request.bodySize;
        this.apiTarget = request.apiTarget;
    }
}
