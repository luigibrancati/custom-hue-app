package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.protocol.Geo;
import io.sentry.util.CollectionUtils;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class User implements JsonUnknown, JsonSerializable {
    private Map<String, String> data;
    private String email;
    private Geo geo;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private String f38784id;
    private String ipAddress;

    @Deprecated
    private String name;
    private Map<String, Object> unknown;
    private String username;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Deserializer implements JsonDeserializer<User> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public User deserialize(ObjectReader objectReader, ILogger iLogger) {
            String strNextName;
            objectReader.beginObject();
            User user = new User();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "username":
                        user.username = objectReader.nextStringOrNull();
                        break;
                    case "id":
                        user.f38784id = objectReader.nextStringOrNull();
                        break;
                    case "geo":
                        user.geo = new Geo.Deserializer().deserialize(objectReader, iLogger);
                        break;
                    case "data":
                        user.data = CollectionUtils.newConcurrentHashMap((Map) objectReader.nextObjectOrNull());
                        break;
                    case "name":
                        user.name = objectReader.nextStringOrNull();
                        break;
                    case "email":
                        user.email = objectReader.nextStringOrNull();
                        break;
                    case "ip_address":
                        user.ipAddress = objectReader.nextStringOrNull();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            user.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return user;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class JsonKeys {
        public static final String DATA = "data";
        public static final String EMAIL = "email";
        public static final String GEO = "geo";
        public static final String ID = "id";
        public static final String IP_ADDRESS = "ip_address";
        public static final String NAME = "name";
        public static final String USERNAME = "username";
    }

    public User() {
    }

    public static User fromMap(Map<String, Object> map, SentryOptions sentryOptions) {
        Object value;
        User user = new User();
        ConcurrentHashMap concurrentHashMap = null;
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            value = entry.getValue();
            String key = entry.getKey();
            key.getClass();
            switch (key) {
                case "username":
                    user.username = value instanceof String ? (String) value : null;
                    break;
                case "id":
                    user.f38784id = value instanceof String ? (String) value : null;
                    break;
                case "geo":
                    Map map2 = value instanceof Map ? (Map) value : null;
                    if (map2 != null) {
                        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
                        for (Map.Entry entry2 : map2.entrySet()) {
                            if (!(entry2.getKey() instanceof String) || entry2.getValue() == null) {
                                sentryOptions.getLogger().log(SentryLevel.WARNING, "Invalid key type in gep map.", new Object[0]);
                            } else {
                                concurrentHashMap2.put((String) entry2.getKey(), entry2.getValue());
                            }
                        }
                        user.geo = Geo.fromMap(concurrentHashMap2);
                        break;
                    } else {
                        break;
                    }
                    break;
                case "data":
                    Map map3 = value instanceof Map ? (Map) value : null;
                    if (map3 != null) {
                        ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
                        for (Map.Entry entry3 : map3.entrySet()) {
                            if (!(entry3.getKey() instanceof String) || entry3.getValue() == null) {
                                sentryOptions.getLogger().log(SentryLevel.WARNING, "Invalid key or null value in data map.", new Object[0]);
                            } else {
                                concurrentHashMap3.put((String) entry3.getKey(), entry3.getValue().toString());
                            }
                        }
                        user.data = concurrentHashMap3;
                        break;
                    } else {
                        break;
                    }
                    break;
                case "name":
                    user.name = value instanceof String ? (String) value : null;
                    break;
                case "email":
                    user.email = value instanceof String ? (String) value : null;
                    break;
                case "ip_address":
                    user.ipAddress = value instanceof String ? (String) value : null;
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    concurrentHashMap.put(entry.getKey(), entry.getValue());
                    break;
            }
        }
        user.unknown = concurrentHashMap;
        return user;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && User.class == obj.getClass()) {
            User user = (User) obj;
            if (Objects.equals(this.email, user.email) && Objects.equals(this.f38784id, user.f38784id) && Objects.equals(this.username, user.username) && Objects.equals(this.ipAddress, user.ipAddress)) {
                return true;
            }
        }
        return false;
    }

    public Map<String, String> getData() {
        return this.data;
    }

    public String getEmail() {
        return this.email;
    }

    public Geo getGeo() {
        return this.geo;
    }

    public String getId() {
        return this.f38784id;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }

    @Deprecated
    public String getName() {
        return this.name;
    }

    @Override // io.sentry.JsonUnknown
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public String getUsername() {
        return this.username;
    }

    public int hashCode() {
        return Objects.hash(this.email, this.f38784id, this.username, this.ipAddress);
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        if (this.email != null) {
            objectWriter.name("email").value(this.email);
        }
        if (this.f38784id != null) {
            objectWriter.name("id").value(this.f38784id);
        }
        if (this.username != null) {
            objectWriter.name(JsonKeys.USERNAME).value(this.username);
        }
        if (this.ipAddress != null) {
            objectWriter.name("ip_address").value(this.ipAddress);
        }
        if (this.name != null) {
            objectWriter.name("name").value(this.name);
        }
        if (this.geo != null) {
            objectWriter.name(JsonKeys.GEO);
            this.geo.serialize(objectWriter, iLogger);
        }
        if (this.data != null) {
            objectWriter.name("data").value(iLogger, this.data);
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

    public void setData(Map<String, String> map) {
        this.data = CollectionUtils.newConcurrentHashMap(map);
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public void setId(String str) {
        this.f38784id = str;
    }

    public void setIpAddress(String str) {
        this.ipAddress = str;
    }

    @Deprecated
    public void setName(String str) {
        this.name = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public void setUsername(String str) {
        this.username = str;
    }

    public User(User user) {
        this.email = user.email;
        this.username = user.username;
        this.f38784id = user.f38784id;
        this.ipAddress = user.ipAddress;
        this.name = user.name;
        this.geo = user.geo;
        this.data = CollectionUtils.newConcurrentHashMap(user.data);
        this.unknown = CollectionUtils.newConcurrentHashMap(user.unknown);
    }
}
