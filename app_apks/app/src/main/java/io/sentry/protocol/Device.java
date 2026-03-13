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
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class Device implements JsonUnknown, JsonSerializable {
    public static final String TYPE = "device";
    private String[] archs;
    private Float batteryLevel;
    private Float batteryTemperature;
    private Date bootTime;
    private String brand;
    private Boolean charging;
    private String chipset;
    private String connectionType;
    private String cpuDescription;
    private Long externalFreeStorage;
    private Long externalStorageSize;
    private String family;
    private Long freeMemory;
    private Long freeStorage;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private String f38781id;
    private String locale;
    private Boolean lowMemory;
    private String manufacturer;
    private Long memorySize;
    private String model;
    private String modelId;
    private String name;
    private Boolean online;
    private DeviceOrientation orientation;
    private Integer processorCount;
    private Double processorFrequency;
    private Float screenDensity;
    private Integer screenDpi;
    private Integer screenHeightPixels;
    private Integer screenWidthPixels;
    private Boolean simulator;
    private Long storageSize;
    private TimeZone timezone;
    private Map<String, Object> unknown;
    private Long usableMemory;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Deserializer implements JsonDeserializer<Device> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public Device deserialize(ObjectReader objectReader, ILogger iLogger) {
            String strNextName;
            objectReader.beginObject();
            Device device = new Device();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "timezone":
                        device.timezone = objectReader.nextTimeZoneOrNull(iLogger);
                        break;
                    case "boot_time":
                        if (objectReader.peek() != JsonToken.STRING) {
                            break;
                        } else {
                            device.bootTime = objectReader.nextDateOrNull(iLogger);
                            break;
                        }
                        break;
                    case "simulator":
                        device.simulator = objectReader.nextBooleanOrNull();
                        break;
                    case "manufacturer":
                        device.manufacturer = objectReader.nextStringOrNull();
                        break;
                    case "processor_count":
                        device.processorCount = objectReader.nextIntegerOrNull();
                        break;
                    case "orientation":
                        device.orientation = (DeviceOrientation) objectReader.nextOrNull(iLogger, new DeviceOrientation.Deserializer());
                        break;
                    case "battery_temperature":
                        device.batteryTemperature = objectReader.nextFloatOrNull();
                        break;
                    case "family":
                        device.family = objectReader.nextStringOrNull();
                        break;
                    case "locale":
                        device.locale = objectReader.nextStringOrNull();
                        break;
                    case "online":
                        device.online = objectReader.nextBooleanOrNull();
                        break;
                    case "battery_level":
                        device.batteryLevel = objectReader.nextFloatOrNull();
                        break;
                    case "model_id":
                        device.modelId = objectReader.nextStringOrNull();
                        break;
                    case "screen_density":
                        device.screenDensity = objectReader.nextFloatOrNull();
                        break;
                    case "screen_dpi":
                        device.screenDpi = objectReader.nextIntegerOrNull();
                        break;
                    case "free_memory":
                        device.freeMemory = objectReader.nextLongOrNull();
                        break;
                    case "id":
                        device.f38781id = objectReader.nextStringOrNull();
                        break;
                    case "name":
                        device.name = objectReader.nextStringOrNull();
                        break;
                    case "low_memory":
                        device.lowMemory = objectReader.nextBooleanOrNull();
                        break;
                    case "archs":
                        List list = (List) objectReader.nextObjectOrNull();
                        if (list == null) {
                            break;
                        } else {
                            String[] strArr = new String[list.size()];
                            list.toArray(strArr);
                            device.archs = strArr;
                            break;
                        }
                        break;
                    case "brand":
                        device.brand = objectReader.nextStringOrNull();
                        break;
                    case "model":
                        device.model = objectReader.nextStringOrNull();
                        break;
                    case "cpu_description":
                        device.cpuDescription = objectReader.nextStringOrNull();
                        break;
                    case "processor_frequency":
                        device.processorFrequency = objectReader.nextDoubleOrNull();
                        break;
                    case "connection_type":
                        device.connectionType = objectReader.nextStringOrNull();
                        break;
                    case "chipset":
                        device.chipset = objectReader.nextStringOrNull();
                        break;
                    case "screen_width_pixels":
                        device.screenWidthPixels = objectReader.nextIntegerOrNull();
                        break;
                    case "external_storage_size":
                        device.externalStorageSize = objectReader.nextLongOrNull();
                        break;
                    case "storage_size":
                        device.storageSize = objectReader.nextLongOrNull();
                        break;
                    case "usable_memory":
                        device.usableMemory = objectReader.nextLongOrNull();
                        break;
                    case "memory_size":
                        device.memorySize = objectReader.nextLongOrNull();
                        break;
                    case "charging":
                        device.charging = objectReader.nextBooleanOrNull();
                        break;
                    case "external_free_storage":
                        device.externalFreeStorage = objectReader.nextLongOrNull();
                        break;
                    case "free_storage":
                        device.freeStorage = objectReader.nextLongOrNull();
                        break;
                    case "screen_height_pixels":
                        device.screenHeightPixels = objectReader.nextIntegerOrNull();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            device.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return device;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum DeviceOrientation implements JsonSerializable {
        PORTRAIT,
        LANDSCAPE;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Deserializer implements JsonDeserializer<DeviceOrientation> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // io.sentry.JsonDeserializer
            public DeviceOrientation deserialize(ObjectReader objectReader, ILogger iLogger) {
                return DeviceOrientation.valueOf(objectReader.nextString().toUpperCase(Locale.ROOT));
            }
        }

        @Override // io.sentry.JsonSerializable
        public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
            objectWriter.value(toString().toLowerCase(Locale.ROOT));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class JsonKeys {
        public static final String ARCHS = "archs";
        public static final String BATTERY_LEVEL = "battery_level";
        public static final String BATTERY_TEMPERATURE = "battery_temperature";
        public static final String BOOT_TIME = "boot_time";
        public static final String BRAND = "brand";
        public static final String CHARGING = "charging";
        public static final String CHIPSET = "chipset";
        public static final String CONNECTION_TYPE = "connection_type";
        public static final String CPU_DESCRIPTION = "cpu_description";
        public static final String EXTERNAL_FREE_STORAGE = "external_free_storage";
        public static final String EXTERNAL_STORAGE_SIZE = "external_storage_size";
        public static final String FAMILY = "family";
        public static final String FREE_MEMORY = "free_memory";
        public static final String FREE_STORAGE = "free_storage";
        public static final String ID = "id";
        public static final String LOCALE = "locale";
        public static final String LOW_MEMORY = "low_memory";
        public static final String MANUFACTURER = "manufacturer";
        public static final String MEMORY_SIZE = "memory_size";
        public static final String MODEL = "model";
        public static final String MODEL_ID = "model_id";
        public static final String NAME = "name";
        public static final String ONLINE = "online";
        public static final String ORIENTATION = "orientation";
        public static final String PROCESSOR_COUNT = "processor_count";
        public static final String PROCESSOR_FREQUENCY = "processor_frequency";
        public static final String SCREEN_DENSITY = "screen_density";
        public static final String SCREEN_DPI = "screen_dpi";
        public static final String SCREEN_HEIGHT_PIXELS = "screen_height_pixels";
        public static final String SCREEN_WIDTH_PIXELS = "screen_width_pixels";
        public static final String SIMULATOR = "simulator";
        public static final String STORAGE_SIZE = "storage_size";
        public static final String TIMEZONE = "timezone";
        public static final String USABLE_MEMORY = "usable_memory";
    }

    public Device() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Device.class == obj.getClass()) {
            Device device = (Device) obj;
            if (Objects.equals(this.name, device.name) && Objects.equals(this.manufacturer, device.manufacturer) && Objects.equals(this.brand, device.brand) && Objects.equals(this.family, device.family) && Objects.equals(this.model, device.model) && Objects.equals(this.modelId, device.modelId) && Arrays.equals(this.archs, device.archs) && Objects.equals(this.batteryLevel, device.batteryLevel) && Objects.equals(this.charging, device.charging) && Objects.equals(this.online, device.online) && this.orientation == device.orientation && Objects.equals(this.simulator, device.simulator) && Objects.equals(this.memorySize, device.memorySize) && Objects.equals(this.freeMemory, device.freeMemory) && Objects.equals(this.usableMemory, device.usableMemory) && Objects.equals(this.lowMemory, device.lowMemory) && Objects.equals(this.storageSize, device.storageSize) && Objects.equals(this.freeStorage, device.freeStorage) && Objects.equals(this.externalStorageSize, device.externalStorageSize) && Objects.equals(this.externalFreeStorage, device.externalFreeStorage) && Objects.equals(this.screenWidthPixels, device.screenWidthPixels) && Objects.equals(this.screenHeightPixels, device.screenHeightPixels) && Objects.equals(this.screenDensity, device.screenDensity) && Objects.equals(this.screenDpi, device.screenDpi) && Objects.equals(this.bootTime, device.bootTime) && Objects.equals(this.f38781id, device.f38781id) && Objects.equals(this.locale, device.locale) && Objects.equals(this.connectionType, device.connectionType) && Objects.equals(this.batteryTemperature, device.batteryTemperature) && Objects.equals(this.processorCount, device.processorCount) && Objects.equals(this.processorFrequency, device.processorFrequency) && Objects.equals(this.cpuDescription, device.cpuDescription) && Objects.equals(this.chipset, device.chipset)) {
                return true;
            }
        }
        return false;
    }

    public String[] getArchs() {
        return this.archs;
    }

    public Float getBatteryLevel() {
        return this.batteryLevel;
    }

    public Float getBatteryTemperature() {
        return this.batteryTemperature;
    }

    public Date getBootTime() {
        Date date = this.bootTime;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getChipset() {
        return this.chipset;
    }

    public String getConnectionType() {
        return this.connectionType;
    }

    public String getCpuDescription() {
        return this.cpuDescription;
    }

    public Long getExternalFreeStorage() {
        return this.externalFreeStorage;
    }

    public Long getExternalStorageSize() {
        return this.externalStorageSize;
    }

    public String getFamily() {
        return this.family;
    }

    public Long getFreeMemory() {
        return this.freeMemory;
    }

    public Long getFreeStorage() {
        return this.freeStorage;
    }

    public String getId() {
        return this.f38781id;
    }

    public String getLocale() {
        return this.locale;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public Long getMemorySize() {
        return this.memorySize;
    }

    public String getModel() {
        return this.model;
    }

    public String getModelId() {
        return this.modelId;
    }

    public String getName() {
        return this.name;
    }

    public DeviceOrientation getOrientation() {
        return this.orientation;
    }

    public Integer getProcessorCount() {
        return this.processorCount;
    }

    public Double getProcessorFrequency() {
        return this.processorFrequency;
    }

    public Float getScreenDensity() {
        return this.screenDensity;
    }

    public Integer getScreenDpi() {
        return this.screenDpi;
    }

    public Integer getScreenHeightPixels() {
        return this.screenHeightPixels;
    }

    public Integer getScreenWidthPixels() {
        return this.screenWidthPixels;
    }

    public Long getStorageSize() {
        return this.storageSize;
    }

    public TimeZone getTimezone() {
        return this.timezone;
    }

    @Override // io.sentry.JsonUnknown
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public Long getUsableMemory() {
        return this.usableMemory;
    }

    public int hashCode() {
        return (Objects.hash(this.name, this.manufacturer, this.brand, this.family, this.model, this.modelId, this.batteryLevel, this.charging, this.online, this.orientation, this.simulator, this.memorySize, this.freeMemory, this.usableMemory, this.lowMemory, this.storageSize, this.freeStorage, this.externalStorageSize, this.externalFreeStorage, this.screenWidthPixels, this.screenHeightPixels, this.screenDensity, this.screenDpi, this.bootTime, this.timezone, this.f38781id, this.locale, this.connectionType, this.batteryTemperature, this.processorCount, this.processorFrequency, this.cpuDescription, this.chipset) * 31) + Arrays.hashCode(this.archs);
    }

    public Boolean isCharging() {
        return this.charging;
    }

    public Boolean isLowMemory() {
        return this.lowMemory;
    }

    public Boolean isOnline() {
        return this.online;
    }

    public Boolean isSimulator() {
        return this.simulator;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        if (this.name != null) {
            objectWriter.name("name").value(this.name);
        }
        if (this.manufacturer != null) {
            objectWriter.name(JsonKeys.MANUFACTURER).value(this.manufacturer);
        }
        if (this.brand != null) {
            objectWriter.name(JsonKeys.BRAND).value(this.brand);
        }
        if (this.family != null) {
            objectWriter.name(JsonKeys.FAMILY).value(this.family);
        }
        if (this.model != null) {
            objectWriter.name(JsonKeys.MODEL).value(this.model);
        }
        if (this.modelId != null) {
            objectWriter.name(JsonKeys.MODEL_ID).value(this.modelId);
        }
        if (this.archs != null) {
            objectWriter.name(JsonKeys.ARCHS).value(iLogger, this.archs);
        }
        if (this.batteryLevel != null) {
            objectWriter.name(JsonKeys.BATTERY_LEVEL).value(this.batteryLevel);
        }
        if (this.charging != null) {
            objectWriter.name(JsonKeys.CHARGING).value(this.charging);
        }
        if (this.online != null) {
            objectWriter.name(JsonKeys.ONLINE).value(this.online);
        }
        if (this.orientation != null) {
            objectWriter.name(JsonKeys.ORIENTATION).value(iLogger, this.orientation);
        }
        if (this.simulator != null) {
            objectWriter.name(JsonKeys.SIMULATOR).value(this.simulator);
        }
        if (this.memorySize != null) {
            objectWriter.name("memory_size").value(this.memorySize);
        }
        if (this.freeMemory != null) {
            objectWriter.name(JsonKeys.FREE_MEMORY).value(this.freeMemory);
        }
        if (this.usableMemory != null) {
            objectWriter.name(JsonKeys.USABLE_MEMORY).value(this.usableMemory);
        }
        if (this.lowMemory != null) {
            objectWriter.name(JsonKeys.LOW_MEMORY).value(this.lowMemory);
        }
        if (this.storageSize != null) {
            objectWriter.name(JsonKeys.STORAGE_SIZE).value(this.storageSize);
        }
        if (this.freeStorage != null) {
            objectWriter.name(JsonKeys.FREE_STORAGE).value(this.freeStorage);
        }
        if (this.externalStorageSize != null) {
            objectWriter.name(JsonKeys.EXTERNAL_STORAGE_SIZE).value(this.externalStorageSize);
        }
        if (this.externalFreeStorage != null) {
            objectWriter.name(JsonKeys.EXTERNAL_FREE_STORAGE).value(this.externalFreeStorage);
        }
        if (this.screenWidthPixels != null) {
            objectWriter.name(JsonKeys.SCREEN_WIDTH_PIXELS).value(this.screenWidthPixels);
        }
        if (this.screenHeightPixels != null) {
            objectWriter.name(JsonKeys.SCREEN_HEIGHT_PIXELS).value(this.screenHeightPixels);
        }
        if (this.screenDensity != null) {
            objectWriter.name(JsonKeys.SCREEN_DENSITY).value(this.screenDensity);
        }
        if (this.screenDpi != null) {
            objectWriter.name(JsonKeys.SCREEN_DPI).value(this.screenDpi);
        }
        if (this.bootTime != null) {
            objectWriter.name(JsonKeys.BOOT_TIME).value(iLogger, this.bootTime);
        }
        if (this.timezone != null) {
            objectWriter.name("timezone").value(iLogger, this.timezone);
        }
        if (this.f38781id != null) {
            objectWriter.name("id").value(this.f38781id);
        }
        if (this.connectionType != null) {
            objectWriter.name(JsonKeys.CONNECTION_TYPE).value(this.connectionType);
        }
        if (this.batteryTemperature != null) {
            objectWriter.name(JsonKeys.BATTERY_TEMPERATURE).value(this.batteryTemperature);
        }
        if (this.locale != null) {
            objectWriter.name(JsonKeys.LOCALE).value(this.locale);
        }
        if (this.processorCount != null) {
            objectWriter.name(JsonKeys.PROCESSOR_COUNT).value(this.processorCount);
        }
        if (this.processorFrequency != null) {
            objectWriter.name(JsonKeys.PROCESSOR_FREQUENCY).value(this.processorFrequency);
        }
        if (this.cpuDescription != null) {
            objectWriter.name(JsonKeys.CPU_DESCRIPTION).value(this.cpuDescription);
        }
        if (this.chipset != null) {
            objectWriter.name(JsonKeys.CHIPSET).value(this.chipset);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    public void setArchs(String[] strArr) {
        this.archs = strArr;
    }

    public void setBatteryLevel(Float f10) {
        this.batteryLevel = f10;
    }

    public void setBatteryTemperature(Float f10) {
        this.batteryTemperature = f10;
    }

    public void setBootTime(Date date) {
        this.bootTime = date;
    }

    public void setBrand(String str) {
        this.brand = str;
    }

    public void setCharging(Boolean bool) {
        this.charging = bool;
    }

    public void setChipset(String str) {
        this.chipset = str;
    }

    public void setConnectionType(String str) {
        this.connectionType = str;
    }

    public void setCpuDescription(String str) {
        this.cpuDescription = str;
    }

    public void setExternalFreeStorage(Long l10) {
        this.externalFreeStorage = l10;
    }

    public void setExternalStorageSize(Long l10) {
        this.externalStorageSize = l10;
    }

    public void setFamily(String str) {
        this.family = str;
    }

    public void setFreeMemory(Long l10) {
        this.freeMemory = l10;
    }

    public void setFreeStorage(Long l10) {
        this.freeStorage = l10;
    }

    public void setId(String str) {
        this.f38781id = str;
    }

    public void setLocale(String str) {
        this.locale = str;
    }

    public void setLowMemory(Boolean bool) {
        this.lowMemory = bool;
    }

    public void setManufacturer(String str) {
        this.manufacturer = str;
    }

    public void setMemorySize(Long l10) {
        this.memorySize = l10;
    }

    public void setModel(String str) {
        this.model = str;
    }

    public void setModelId(String str) {
        this.modelId = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOnline(Boolean bool) {
        this.online = bool;
    }

    public void setOrientation(DeviceOrientation deviceOrientation) {
        this.orientation = deviceOrientation;
    }

    public void setProcessorCount(Integer num) {
        this.processorCount = num;
    }

    public void setProcessorFrequency(Double d10) {
        this.processorFrequency = d10;
    }

    public void setScreenDensity(Float f10) {
        this.screenDensity = f10;
    }

    public void setScreenDpi(Integer num) {
        this.screenDpi = num;
    }

    public void setScreenHeightPixels(Integer num) {
        this.screenHeightPixels = num;
    }

    public void setScreenWidthPixels(Integer num) {
        this.screenWidthPixels = num;
    }

    public void setSimulator(Boolean bool) {
        this.simulator = bool;
    }

    public void setStorageSize(Long l10) {
        this.storageSize = l10;
    }

    public void setTimezone(TimeZone timeZone) {
        this.timezone = timeZone;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public void setUsableMemory(Long l10) {
        this.usableMemory = l10;
    }

    public Device(Device device) {
        this.name = device.name;
        this.manufacturer = device.manufacturer;
        this.brand = device.brand;
        this.family = device.family;
        this.model = device.model;
        this.modelId = device.modelId;
        this.charging = device.charging;
        this.online = device.online;
        this.orientation = device.orientation;
        this.simulator = device.simulator;
        this.memorySize = device.memorySize;
        this.freeMemory = device.freeMemory;
        this.usableMemory = device.usableMemory;
        this.lowMemory = device.lowMemory;
        this.storageSize = device.storageSize;
        this.freeStorage = device.freeStorage;
        this.externalStorageSize = device.externalStorageSize;
        this.externalFreeStorage = device.externalFreeStorage;
        this.screenWidthPixels = device.screenWidthPixels;
        this.screenHeightPixels = device.screenHeightPixels;
        this.screenDensity = device.screenDensity;
        this.screenDpi = device.screenDpi;
        this.bootTime = device.bootTime;
        this.f38781id = device.f38781id;
        this.connectionType = device.connectionType;
        this.batteryTemperature = device.batteryTemperature;
        this.batteryLevel = device.batteryLevel;
        String[] strArr = device.archs;
        this.archs = strArr != null ? (String[]) strArr.clone() : null;
        this.locale = device.locale;
        TimeZone timeZone = device.timezone;
        this.timezone = timeZone != null ? (TimeZone) timeZone.clone() : null;
        this.processorCount = device.processorCount;
        this.processorFrequency = device.processorFrequency;
        this.cpuDescription = device.cpuDescription;
        this.chipset = device.chipset;
        this.unknown = CollectionUtils.newConcurrentHashMap(device.unknown);
    }
}
