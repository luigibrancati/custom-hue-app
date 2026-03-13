package io.sentry;

import io.sentry.ProfilingTransactionData;
import io.sentry.profilemeasurements.ProfileMeasurement;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class ProfilingTraceData implements JsonUnknown, JsonSerializable {
    private static final String DEFAULT_ENVIRONMENT = "production";
    public static final String TRUNCATION_REASON_BACKGROUNDED = "backgrounded";
    public static final String TRUNCATION_REASON_NORMAL = "normal";
    public static final String TRUNCATION_REASON_TIMEOUT = "timeout";
    private int androidApiLevel;
    private String buildId;
    private String cpuArchitecture;
    private List<Integer> deviceCpuFrequencies;
    private final Callable<List<Integer>> deviceCpuFrequenciesReader;
    private boolean deviceIsEmulator;
    private String deviceLocale;
    private String deviceManufacturer;
    private String deviceModel;
    private String deviceOsBuildNumber;
    private String deviceOsName;
    private String deviceOsVersion;
    private String devicePhysicalMemoryBytes;
    private String durationNs;
    private String environment;
    private final Map<String, ProfileMeasurement> measurementsMap;
    private String platform;
    private String profileId;
    private String release;
    private String sampledProfile;
    private Date timestamp;
    private final File traceFile;
    private String traceId;
    private String transactionId;
    private String transactionName;
    private List<ProfilingTransactionData> transactions;
    private String truncationReason;
    private Map<String, Object> unknown;
    private String versionCode;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Deserializer implements JsonDeserializer<ProfilingTraceData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public ProfilingTraceData deserialize(ObjectReader objectReader, ILogger iLogger) {
            String strNextName;
            objectReader.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            ProfilingTraceData profilingTraceData = new ProfilingTraceData();
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "device_manufacturer":
                        String strNextStringOrNull = objectReader.nextStringOrNull();
                        if (strNextStringOrNull == null) {
                            break;
                        } else {
                            profilingTraceData.deviceManufacturer = strNextStringOrNull;
                            break;
                        }
                        break;
                    case "android_api_level":
                        Integer numNextIntegerOrNull = objectReader.nextIntegerOrNull();
                        if (numNextIntegerOrNull == null) {
                            break;
                        } else {
                            profilingTraceData.androidApiLevel = numNextIntegerOrNull.intValue();
                            break;
                        }
                        break;
                    case "build_id":
                        String strNextStringOrNull2 = objectReader.nextStringOrNull();
                        if (strNextStringOrNull2 == null) {
                            break;
                        } else {
                            profilingTraceData.buildId = strNextStringOrNull2;
                            break;
                        }
                        break;
                    case "device_locale":
                        String strNextStringOrNull3 = objectReader.nextStringOrNull();
                        if (strNextStringOrNull3 == null) {
                            break;
                        } else {
                            profilingTraceData.deviceLocale = strNextStringOrNull3;
                            break;
                        }
                        break;
                    case "profile_id":
                        String strNextStringOrNull4 = objectReader.nextStringOrNull();
                        if (strNextStringOrNull4 == null) {
                            break;
                        } else {
                            profilingTraceData.profileId = strNextStringOrNull4;
                            break;
                        }
                        break;
                    case "device_os_build_number":
                        String strNextStringOrNull5 = objectReader.nextStringOrNull();
                        if (strNextStringOrNull5 == null) {
                            break;
                        } else {
                            profilingTraceData.deviceOsBuildNumber = strNextStringOrNull5;
                            break;
                        }
                        break;
                    case "device_model":
                        String strNextStringOrNull6 = objectReader.nextStringOrNull();
                        if (strNextStringOrNull6 == null) {
                            break;
                        } else {
                            profilingTraceData.deviceModel = strNextStringOrNull6;
                            break;
                        }
                        break;
                    case "device_is_emulator":
                        Boolean boolNextBooleanOrNull = objectReader.nextBooleanOrNull();
                        if (boolNextBooleanOrNull == null) {
                            break;
                        } else {
                            profilingTraceData.deviceIsEmulator = boolNextBooleanOrNull.booleanValue();
                            break;
                        }
                        break;
                    case "duration_ns":
                        String strNextStringOrNull7 = objectReader.nextStringOrNull();
                        if (strNextStringOrNull7 == null) {
                            break;
                        } else {
                            profilingTraceData.durationNs = strNextStringOrNull7;
                            break;
                        }
                        break;
                    case "measurements":
                        Map mapNextMapOrNull = objectReader.nextMapOrNull(iLogger, new ProfileMeasurement.Deserializer());
                        if (mapNextMapOrNull == null) {
                            break;
                        } else {
                            profilingTraceData.measurementsMap.putAll(mapNextMapOrNull);
                            break;
                        }
                        break;
                    case "device_physical_memory_bytes":
                        String strNextStringOrNull8 = objectReader.nextStringOrNull();
                        if (strNextStringOrNull8 == null) {
                            break;
                        } else {
                            profilingTraceData.devicePhysicalMemoryBytes = strNextStringOrNull8;
                            break;
                        }
                        break;
                    case "device_cpu_frequencies":
                        List list = (List) objectReader.nextObjectOrNull();
                        if (list == null) {
                            break;
                        } else {
                            profilingTraceData.deviceCpuFrequencies = list;
                            break;
                        }
                        break;
                    case "version_code":
                        String strNextStringOrNull9 = objectReader.nextStringOrNull();
                        if (strNextStringOrNull9 == null) {
                            break;
                        } else {
                            profilingTraceData.versionCode = strNextStringOrNull9;
                            break;
                        }
                        break;
                    case "version_name":
                        String strNextStringOrNull10 = objectReader.nextStringOrNull();
                        if (strNextStringOrNull10 == null) {
                            break;
                        } else {
                            profilingTraceData.release = strNextStringOrNull10;
                            break;
                        }
                        break;
                    case "environment":
                        String strNextStringOrNull11 = objectReader.nextStringOrNull();
                        if (strNextStringOrNull11 == null) {
                            break;
                        } else {
                            profilingTraceData.environment = strNextStringOrNull11;
                            break;
                        }
                        break;
                    case "timestamp":
                        Date dateNextDateOrNull = objectReader.nextDateOrNull(iLogger);
                        if (dateNextDateOrNull == null) {
                            break;
                        } else {
                            profilingTraceData.timestamp = dateNextDateOrNull;
                            break;
                        }
                        break;
                    case "transaction_name":
                        String strNextStringOrNull12 = objectReader.nextStringOrNull();
                        if (strNextStringOrNull12 == null) {
                            break;
                        } else {
                            profilingTraceData.transactionName = strNextStringOrNull12;
                            break;
                        }
                        break;
                    case "device_os_name":
                        String strNextStringOrNull13 = objectReader.nextStringOrNull();
                        if (strNextStringOrNull13 == null) {
                            break;
                        } else {
                            profilingTraceData.deviceOsName = strNextStringOrNull13;
                            break;
                        }
                        break;
                    case "architecture":
                        String strNextStringOrNull14 = objectReader.nextStringOrNull();
                        if (strNextStringOrNull14 == null) {
                            break;
                        } else {
                            profilingTraceData.cpuArchitecture = strNextStringOrNull14;
                            break;
                        }
                        break;
                    case "transaction_id":
                        String strNextStringOrNull15 = objectReader.nextStringOrNull();
                        if (strNextStringOrNull15 == null) {
                            break;
                        } else {
                            profilingTraceData.transactionId = strNextStringOrNull15;
                            break;
                        }
                        break;
                    case "device_os_version":
                        String strNextStringOrNull16 = objectReader.nextStringOrNull();
                        if (strNextStringOrNull16 == null) {
                            break;
                        } else {
                            profilingTraceData.deviceOsVersion = strNextStringOrNull16;
                            break;
                        }
                        break;
                    case "truncation_reason":
                        String strNextStringOrNull17 = objectReader.nextStringOrNull();
                        if (strNextStringOrNull17 == null) {
                            break;
                        } else {
                            profilingTraceData.truncationReason = strNextStringOrNull17;
                            break;
                        }
                        break;
                    case "trace_id":
                        String strNextStringOrNull18 = objectReader.nextStringOrNull();
                        if (strNextStringOrNull18 == null) {
                            break;
                        } else {
                            profilingTraceData.traceId = strNextStringOrNull18;
                            break;
                        }
                        break;
                    case "platform":
                        String strNextStringOrNull19 = objectReader.nextStringOrNull();
                        if (strNextStringOrNull19 == null) {
                            break;
                        } else {
                            profilingTraceData.platform = strNextStringOrNull19;
                            break;
                        }
                        break;
                    case "sampled_profile":
                        String strNextStringOrNull20 = objectReader.nextStringOrNull();
                        if (strNextStringOrNull20 == null) {
                            break;
                        } else {
                            profilingTraceData.sampledProfile = strNextStringOrNull20;
                            break;
                        }
                        break;
                    case "transactions":
                        List listNextListOrNull = objectReader.nextListOrNull(iLogger, new ProfilingTransactionData.Deserializer());
                        if (listNextListOrNull == null) {
                            break;
                        } else {
                            profilingTraceData.transactions.addAll(listNextListOrNull);
                            break;
                        }
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            profilingTraceData.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return profilingTraceData;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class JsonKeys {
        public static final String ANDROID_API_LEVEL = "android_api_level";
        public static final String ARCHITECTURE = "architecture";
        public static final String BUILD_ID = "build_id";
        public static final String DEVICE_CPU_FREQUENCIES = "device_cpu_frequencies";
        public static final String DEVICE_IS_EMULATOR = "device_is_emulator";
        public static final String DEVICE_LOCALE = "device_locale";
        public static final String DEVICE_MANUFACTURER = "device_manufacturer";
        public static final String DEVICE_MODEL = "device_model";
        public static final String DEVICE_OS_BUILD_NUMBER = "device_os_build_number";
        public static final String DEVICE_OS_NAME = "device_os_name";
        public static final String DEVICE_OS_VERSION = "device_os_version";
        public static final String DEVICE_PHYSICAL_MEMORY_BYTES = "device_physical_memory_bytes";
        public static final String DURATION_NS = "duration_ns";
        public static final String ENVIRONMENT = "environment";
        public static final String MEASUREMENTS = "measurements";
        public static final String PLATFORM = "platform";
        public static final String PROFILE_ID = "profile_id";
        public static final String RELEASE = "version_name";
        public static final String SAMPLED_PROFILE = "sampled_profile";
        public static final String TIMESTAMP = "timestamp";
        public static final String TRACE_ID = "trace_id";
        public static final String TRANSACTION_ID = "transaction_id";
        public static final String TRANSACTION_LIST = "transactions";
        public static final String TRANSACTION_NAME = "transaction_name";
        public static final String TRUNCATION_REASON = "truncation_reason";
        public static final String VERSION_CODE = "version_code";
    }

    public static /* synthetic */ List a() {
        return new ArrayList();
    }

    private boolean isTruncationReasonValid() {
        return this.truncationReason.equals(TRUNCATION_REASON_NORMAL) || this.truncationReason.equals(TRUNCATION_REASON_TIMEOUT) || this.truncationReason.equals(TRUNCATION_REASON_BACKGROUNDED);
    }

    public int getAndroidApiLevel() {
        return this.androidApiLevel;
    }

    public String getBuildId() {
        return this.buildId;
    }

    public String getCpuArchitecture() {
        return this.cpuArchitecture;
    }

    public List<Integer> getDeviceCpuFrequencies() {
        return this.deviceCpuFrequencies;
    }

    public String getDeviceLocale() {
        return this.deviceLocale;
    }

    public String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    public String getDeviceModel() {
        return this.deviceModel;
    }

    public String getDeviceOsBuildNumber() {
        return this.deviceOsBuildNumber;
    }

    public String getDeviceOsName() {
        return this.deviceOsName;
    }

    public String getDeviceOsVersion() {
        return this.deviceOsVersion;
    }

    public String getDevicePhysicalMemoryBytes() {
        return this.devicePhysicalMemoryBytes;
    }

    public String getDurationNs() {
        return this.durationNs;
    }

    public String getEnvironment() {
        return this.environment;
    }

    public Map<String, ProfileMeasurement> getMeasurementsMap() {
        return this.measurementsMap;
    }

    public String getPlatform() {
        return this.platform;
    }

    public String getProfileId() {
        return this.profileId;
    }

    public String getRelease() {
        return this.release;
    }

    public String getSampledProfile() {
        return this.sampledProfile;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public File getTraceFile() {
        return this.traceFile;
    }

    public String getTraceId() {
        return this.traceId;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public String getTransactionName() {
        return this.transactionName;
    }

    public List<ProfilingTransactionData> getTransactions() {
        return this.transactions;
    }

    public String getTruncationReason() {
        return this.truncationReason;
    }

    @Override // io.sentry.JsonUnknown
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public boolean isDeviceIsEmulator() {
        return this.deviceIsEmulator;
    }

    public void readDeviceCpuFrequencies() {
        try {
            this.deviceCpuFrequencies = this.deviceCpuFrequenciesReader.call();
        } catch (Throwable unused) {
        }
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name(JsonKeys.ANDROID_API_LEVEL).value(iLogger, Integer.valueOf(this.androidApiLevel));
        objectWriter.name(JsonKeys.DEVICE_LOCALE).value(iLogger, this.deviceLocale);
        objectWriter.name(JsonKeys.DEVICE_MANUFACTURER).value(this.deviceManufacturer);
        objectWriter.name(JsonKeys.DEVICE_MODEL).value(this.deviceModel);
        objectWriter.name(JsonKeys.DEVICE_OS_BUILD_NUMBER).value(this.deviceOsBuildNumber);
        objectWriter.name(JsonKeys.DEVICE_OS_NAME).value(this.deviceOsName);
        objectWriter.name(JsonKeys.DEVICE_OS_VERSION).value(this.deviceOsVersion);
        objectWriter.name(JsonKeys.DEVICE_IS_EMULATOR).value(this.deviceIsEmulator);
        objectWriter.name(JsonKeys.ARCHITECTURE).value(iLogger, this.cpuArchitecture);
        objectWriter.name(JsonKeys.DEVICE_CPU_FREQUENCIES).value(iLogger, this.deviceCpuFrequencies);
        objectWriter.name(JsonKeys.DEVICE_PHYSICAL_MEMORY_BYTES).value(this.devicePhysicalMemoryBytes);
        objectWriter.name("platform").value(this.platform);
        objectWriter.name(JsonKeys.BUILD_ID).value(this.buildId);
        objectWriter.name(JsonKeys.TRANSACTION_NAME).value(this.transactionName);
        objectWriter.name(JsonKeys.DURATION_NS).value(this.durationNs);
        objectWriter.name(JsonKeys.RELEASE).value(this.release);
        objectWriter.name(JsonKeys.VERSION_CODE).value(this.versionCode);
        if (!this.transactions.isEmpty()) {
            objectWriter.name(JsonKeys.TRANSACTION_LIST).value(iLogger, this.transactions);
        }
        objectWriter.name(JsonKeys.TRANSACTION_ID).value(this.transactionId);
        objectWriter.name("trace_id").value(this.traceId);
        objectWriter.name(JsonKeys.PROFILE_ID).value(this.profileId);
        objectWriter.name("environment").value(this.environment);
        objectWriter.name(JsonKeys.TRUNCATION_REASON).value(this.truncationReason);
        if (this.sampledProfile != null) {
            objectWriter.name("sampled_profile").value(this.sampledProfile);
        }
        String indent = objectWriter.getIndent();
        objectWriter.setIndent("");
        objectWriter.name("measurements").value(iLogger, this.measurementsMap);
        objectWriter.setIndent(indent);
        objectWriter.name("timestamp").value(iLogger, this.timestamp);
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

    public void setAndroidApiLevel(int i10) {
        this.androidApiLevel = i10;
    }

    public void setBuildId(String str) {
        this.buildId = str;
    }

    public void setCpuArchitecture(String str) {
        this.cpuArchitecture = str;
    }

    public void setDeviceCpuFrequencies(List<Integer> list) {
        this.deviceCpuFrequencies = list;
    }

    public void setDeviceIsEmulator(boolean z10) {
        this.deviceIsEmulator = z10;
    }

    public void setDeviceLocale(String str) {
        this.deviceLocale = str;
    }

    public void setDeviceManufacturer(String str) {
        this.deviceManufacturer = str;
    }

    public void setDeviceModel(String str) {
        this.deviceModel = str;
    }

    public void setDeviceOsBuildNumber(String str) {
        this.deviceOsBuildNumber = str;
    }

    public void setDeviceOsVersion(String str) {
        this.deviceOsVersion = str;
    }

    public void setDevicePhysicalMemoryBytes(String str) {
        this.devicePhysicalMemoryBytes = str;
    }

    public void setDurationNs(String str) {
        this.durationNs = str;
    }

    public void setEnvironment(String str) {
        this.environment = str;
    }

    public void setProfileId(String str) {
        this.profileId = str;
    }

    public void setRelease(String str) {
        this.release = str;
    }

    public void setSampledProfile(String str) {
        this.sampledProfile = str;
    }

    public void setTimestamp(Date date) {
        this.timestamp = date;
    }

    public void setTraceId(String str) {
        this.traceId = str;
    }

    public void setTransactionId(String str) {
        this.transactionId = str;
    }

    public void setTransactionName(String str) {
        this.transactionName = str;
    }

    public void setTransactions(List<ProfilingTransactionData> list) {
        this.transactions = list;
    }

    public void setTruncationReason(String str) {
        this.truncationReason = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    private ProfilingTraceData() {
        this(new File("dummy"), NoOpTransaction.getInstance());
    }

    public ProfilingTraceData(File file, ITransaction iTransaction) {
        this(file, DateUtils.getCurrentDateTime(), new ArrayList(), iTransaction.getName(), iTransaction.getEventId().toString(), iTransaction.getSpanContext().getTraceId().toString(), WebrtcBuildVersion.maint_version, 0, "", new Callable() { // from class: io.sentry.r
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ProfilingTraceData.a();
            }
        }, null, null, null, null, null, null, null, null, TRUNCATION_REASON_NORMAL, new HashMap());
    }

    public ProfilingTraceData(File file, Date date, List<ProfilingTransactionData> list, String str, String str2, String str3, String str4, int i10, String str5, Callable<List<Integer>> callable, String str6, String str7, String str8, Boolean bool, String str9, String str10, String str11, String str12, String str13, Map<String, ProfileMeasurement> map) {
        this.deviceCpuFrequencies = new ArrayList();
        this.sampledProfile = null;
        this.traceFile = file;
        this.timestamp = date;
        this.cpuArchitecture = str5;
        this.deviceCpuFrequenciesReader = callable;
        this.androidApiLevel = i10;
        this.deviceLocale = Locale.getDefault().toString();
        this.deviceManufacturer = str6 == null ? "" : str6;
        this.deviceModel = str7 == null ? "" : str7;
        this.deviceOsVersion = str8 == null ? "" : str8;
        this.deviceIsEmulator = bool != null ? bool.booleanValue() : false;
        this.devicePhysicalMemoryBytes = str9 != null ? str9 : WebrtcBuildVersion.maint_version;
        this.deviceOsBuildNumber = "";
        this.deviceOsName = ProfileChunk.PLATFORM_ANDROID;
        this.platform = ProfileChunk.PLATFORM_ANDROID;
        this.buildId = str10 != null ? str10 : "";
        this.transactions = list;
        this.transactionName = str.isEmpty() ? "unknown" : str;
        this.durationNs = str4;
        this.versionCode = "";
        this.release = str11 != null ? str11 : "";
        this.transactionId = str2;
        this.traceId = str3;
        this.profileId = SentryUUID.generateSentryId();
        this.environment = str12 != null ? str12 : DEFAULT_ENVIRONMENT;
        this.truncationReason = str13;
        if (!isTruncationReasonValid()) {
            this.truncationReason = TRUNCATION_REASON_NORMAL;
        }
        this.measurementsMap = map;
    }
}
