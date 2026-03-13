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
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class App implements JsonUnknown, JsonSerializable {
    public static final String TYPE = "app";
    private String appBuild;
    private String appIdentifier;
    private String appName;
    private Date appStartTime;
    private String appVersion;
    private String buildType;
    private String deviceAppHash;
    private Boolean inForeground;
    private Boolean isSplitApks;
    private Map<String, String> permissions;
    private List<String> splitNames;
    private String startType;
    private Map<String, Object> unknown;
    private List<String> viewNames;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Deserializer implements JsonDeserializer<App> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public App deserialize(ObjectReader objectReader, ILogger iLogger) {
            String strNextName;
            objectReader.beginObject();
            App app2 = new App();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "split_names":
                        List<String> list = (List) objectReader.nextObjectOrNull();
                        if (list == null) {
                            break;
                        } else {
                            app2.setSplitNames(list);
                            break;
                        }
                        break;
                    case "device_app_hash":
                        app2.deviceAppHash = objectReader.nextStringOrNull();
                        break;
                    case "start_type":
                        app2.startType = objectReader.nextStringOrNull();
                        break;
                    case "view_names":
                        List<String> list2 = (List) objectReader.nextObjectOrNull();
                        if (list2 == null) {
                            break;
                        } else {
                            app2.setViewNames(list2);
                            break;
                        }
                        break;
                    case "app_version":
                        app2.appVersion = objectReader.nextStringOrNull();
                        break;
                    case "in_foreground":
                        app2.inForeground = objectReader.nextBooleanOrNull();
                        break;
                    case "build_type":
                        app2.buildType = objectReader.nextStringOrNull();
                        break;
                    case "app_identifier":
                        app2.appIdentifier = objectReader.nextStringOrNull();
                        break;
                    case "app_start_time":
                        app2.appStartTime = objectReader.nextDateOrNull(iLogger);
                        break;
                    case "permissions":
                        app2.permissions = CollectionUtils.newConcurrentHashMap((Map) objectReader.nextObjectOrNull());
                        break;
                    case "app_name":
                        app2.appName = objectReader.nextStringOrNull();
                        break;
                    case "app_build":
                        app2.appBuild = objectReader.nextStringOrNull();
                        break;
                    case "is_split_apks":
                        app2.isSplitApks = objectReader.nextBooleanOrNull();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            app2.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return app2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class JsonKeys {
        public static final String APP_BUILD = "app_build";
        public static final String APP_IDENTIFIER = "app_identifier";
        public static final String APP_NAME = "app_name";
        public static final String APP_PERMISSIONS = "permissions";
        public static final String APP_START_TIME = "app_start_time";
        public static final String APP_VERSION = "app_version";
        public static final String BUILD_TYPE = "build_type";
        public static final String DEVICE_APP_HASH = "device_app_hash";
        public static final String IN_FOREGROUND = "in_foreground";
        public static final String IS_SPLIT_APKS = "is_split_apks";
        public static final String SPLIT_NAMES = "split_names";
        public static final String START_TYPE = "start_type";
        public static final String VIEW_NAMES = "view_names";
    }

    public App() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && App.class == obj.getClass()) {
            App app2 = (App) obj;
            if (Objects.equals(this.appIdentifier, app2.appIdentifier) && Objects.equals(this.appStartTime, app2.appStartTime) && Objects.equals(this.deviceAppHash, app2.deviceAppHash) && Objects.equals(this.buildType, app2.buildType) && Objects.equals(this.appName, app2.appName) && Objects.equals(this.appVersion, app2.appVersion) && Objects.equals(this.appBuild, app2.appBuild) && Objects.equals(this.permissions, app2.permissions) && Objects.equals(this.inForeground, app2.inForeground) && Objects.equals(this.viewNames, app2.viewNames) && Objects.equals(this.startType, app2.startType) && Objects.equals(this.isSplitApks, app2.isSplitApks) && Objects.equals(this.splitNames, app2.splitNames)) {
                return true;
            }
        }
        return false;
    }

    public String getAppBuild() {
        return this.appBuild;
    }

    public String getAppIdentifier() {
        return this.appIdentifier;
    }

    public String getAppName() {
        return this.appName;
    }

    public Date getAppStartTime() {
        Date date = this.appStartTime;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public String getAppVersion() {
        return this.appVersion;
    }

    public String getBuildType() {
        return this.buildType;
    }

    public String getDeviceAppHash() {
        return this.deviceAppHash;
    }

    public Boolean getInForeground() {
        return this.inForeground;
    }

    public Map<String, String> getPermissions() {
        return this.permissions;
    }

    public Boolean getSplitApks() {
        return this.isSplitApks;
    }

    public List<String> getSplitNames() {
        return this.splitNames;
    }

    public String getStartType() {
        return this.startType;
    }

    @Override // io.sentry.JsonUnknown
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public List<String> getViewNames() {
        return this.viewNames;
    }

    public int hashCode() {
        return Objects.hash(this.appIdentifier, this.appStartTime, this.deviceAppHash, this.buildType, this.appName, this.appVersion, this.appBuild, this.permissions, this.inForeground, this.viewNames, this.startType, this.isSplitApks, this.splitNames);
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        if (this.appIdentifier != null) {
            objectWriter.name(JsonKeys.APP_IDENTIFIER).value(this.appIdentifier);
        }
        if (this.appStartTime != null) {
            objectWriter.name(JsonKeys.APP_START_TIME).value(iLogger, this.appStartTime);
        }
        if (this.deviceAppHash != null) {
            objectWriter.name(JsonKeys.DEVICE_APP_HASH).value(this.deviceAppHash);
        }
        if (this.buildType != null) {
            objectWriter.name(JsonKeys.BUILD_TYPE).value(this.buildType);
        }
        if (this.appName != null) {
            objectWriter.name(JsonKeys.APP_NAME).value(this.appName);
        }
        if (this.appVersion != null) {
            objectWriter.name(JsonKeys.APP_VERSION).value(this.appVersion);
        }
        if (this.appBuild != null) {
            objectWriter.name(JsonKeys.APP_BUILD).value(this.appBuild);
        }
        Map<String, String> map = this.permissions;
        if (map != null && !map.isEmpty()) {
            objectWriter.name(JsonKeys.APP_PERMISSIONS).value(iLogger, this.permissions);
        }
        if (this.inForeground != null) {
            objectWriter.name(JsonKeys.IN_FOREGROUND).value(this.inForeground);
        }
        if (this.viewNames != null) {
            objectWriter.name(JsonKeys.VIEW_NAMES).value(iLogger, this.viewNames);
        }
        if (this.startType != null) {
            objectWriter.name(JsonKeys.START_TYPE).value(this.startType);
        }
        if (this.isSplitApks != null) {
            objectWriter.name(JsonKeys.IS_SPLIT_APKS).value(this.isSplitApks);
        }
        List<String> list = this.splitNames;
        if (list != null && !list.isEmpty()) {
            objectWriter.name(JsonKeys.SPLIT_NAMES).value(iLogger, this.splitNames);
        }
        Map<String, Object> map2 = this.unknown;
        if (map2 != null) {
            for (String str : map2.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    public void setAppBuild(String str) {
        this.appBuild = str;
    }

    public void setAppIdentifier(String str) {
        this.appIdentifier = str;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setAppStartTime(Date date) {
        this.appStartTime = date;
    }

    public void setAppVersion(String str) {
        this.appVersion = str;
    }

    public void setBuildType(String str) {
        this.buildType = str;
    }

    public void setDeviceAppHash(String str) {
        this.deviceAppHash = str;
    }

    public void setInForeground(Boolean bool) {
        this.inForeground = bool;
    }

    public void setPermissions(Map<String, String> map) {
        this.permissions = map;
    }

    public void setSplitApks(Boolean bool) {
        this.isSplitApks = bool;
    }

    public void setSplitNames(List<String> list) {
        this.splitNames = list;
    }

    public void setStartType(String str) {
        this.startType = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public void setViewNames(List<String> list) {
        this.viewNames = list;
    }

    public App(App app2) {
        this.appBuild = app2.appBuild;
        this.appIdentifier = app2.appIdentifier;
        this.appName = app2.appName;
        this.appStartTime = app2.appStartTime;
        this.appVersion = app2.appVersion;
        this.buildType = app2.buildType;
        this.deviceAppHash = app2.deviceAppHash;
        this.permissions = CollectionUtils.newConcurrentHashMap(app2.permissions);
        this.inForeground = app2.inForeground;
        this.viewNames = CollectionUtils.newArrayList(app2.viewNames);
        this.startType = app2.startType;
        this.isSplitApks = app2.isSplitApks;
        this.splitNames = app2.splitNames;
        this.unknown = CollectionUtils.newConcurrentHashMap(app2.unknown);
    }
}
