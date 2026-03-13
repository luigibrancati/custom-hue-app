package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.SentryLockReason;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SentryStackFrame implements JsonUnknown, JsonSerializable {
    private Boolean _native;
    private String _package;
    private String absPath;
    private String addrMode;
    private Integer colno;
    private String contextLine;
    private String filename;
    private List<Integer> framesOmitted;
    private String function;
    private String imageAddr;
    private Boolean inApp;
    private String instructionAddr;
    private Integer lineno;
    private SentryLockReason lock;
    private String module;
    private String platform;
    private List<String> postContext;
    private List<String> preContext;
    private String rawFunction;
    private String symbol;
    private String symbolAddr;
    private Map<String, Object> unknown;
    private Map<String, Object> vars;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Deserializer implements JsonDeserializer<SentryStackFrame> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public SentryStackFrame deserialize(ObjectReader objectReader, ILogger iLogger) {
            String strNextName;
            SentryStackFrame sentryStackFrame = new SentryStackFrame();
            objectReader.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "post_context":
                        sentryStackFrame.postContext = (List) objectReader.nextObjectOrNull();
                        break;
                    case "image_addr":
                        sentryStackFrame.imageAddr = objectReader.nextStringOrNull();
                        break;
                    case "in_app":
                        sentryStackFrame.inApp = objectReader.nextBooleanOrNull();
                        break;
                    case "raw_function":
                        sentryStackFrame.rawFunction = objectReader.nextStringOrNull();
                        break;
                    case "lineno":
                        sentryStackFrame.lineno = objectReader.nextIntegerOrNull();
                        break;
                    case "module":
                        sentryStackFrame.module = objectReader.nextStringOrNull();
                        break;
                    case "native":
                        sentryStackFrame._native = objectReader.nextBooleanOrNull();
                        break;
                    case "symbol":
                        sentryStackFrame.symbol = objectReader.nextStringOrNull();
                        break;
                    case "package":
                        sentryStackFrame._package = objectReader.nextStringOrNull();
                        break;
                    case "filename":
                        sentryStackFrame.filename = objectReader.nextStringOrNull();
                        break;
                    case "symbol_addr":
                        sentryStackFrame.symbolAddr = objectReader.nextStringOrNull();
                        break;
                    case "lock":
                        sentryStackFrame.lock = (SentryLockReason) objectReader.nextOrNull(iLogger, new SentryLockReason.Deserializer());
                        break;
                    case "vars":
                        sentryStackFrame.vars = (Map) objectReader.nextObjectOrNull();
                        break;
                    case "colno":
                        sentryStackFrame.colno = objectReader.nextIntegerOrNull();
                        break;
                    case "instruction_addr":
                        sentryStackFrame.instructionAddr = objectReader.nextStringOrNull();
                        break;
                    case "pre_context":
                        sentryStackFrame.preContext = (List) objectReader.nextObjectOrNull();
                        break;
                    case "addr_mode":
                        sentryStackFrame.addrMode = objectReader.nextStringOrNull();
                        break;
                    case "context_line":
                        sentryStackFrame.contextLine = objectReader.nextStringOrNull();
                        break;
                    case "function":
                        sentryStackFrame.function = objectReader.nextStringOrNull();
                        break;
                    case "abs_path":
                        sentryStackFrame.absPath = objectReader.nextStringOrNull();
                        break;
                    case "platform":
                        sentryStackFrame.platform = objectReader.nextStringOrNull();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            sentryStackFrame.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return sentryStackFrame;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class JsonKeys {
        public static final String ABS_PATH = "abs_path";
        public static final String ADDR_MODE = "addr_mode";
        public static final String COLNO = "colno";
        public static final String CONTEXT_LINE = "context_line";
        public static final String FILENAME = "filename";
        public static final String FUNCTION = "function";
        public static final String IMAGE_ADDR = "image_addr";
        public static final String INSTRUCTION_ADDR = "instruction_addr";
        public static final String IN_APP = "in_app";
        public static final String LINENO = "lineno";
        public static final String LOCK = "lock";
        public static final String MODULE = "module";
        public static final String NATIVE = "native";
        public static final String PACKAGE = "package";
        public static final String PLATFORM = "platform";
        public static final String POST_CONTEXT = "post_context";
        public static final String PRE_CONTEXT = "pre_context";
        public static final String RAW_FUNCTION = "raw_function";
        public static final String SYMBOL = "symbol";
        public static final String SYMBOL_ADDR = "symbol_addr";
        public static final String VARS = "vars";
    }

    public boolean equals(Object obj) {
        if (obj != null && SentryStackFrame.class == obj.getClass()) {
            SentryStackFrame sentryStackFrame = (SentryStackFrame) obj;
            if (Objects.equals(this.preContext, sentryStackFrame.preContext) && Objects.equals(this.postContext, sentryStackFrame.postContext) && Objects.equals(this.vars, sentryStackFrame.vars) && Objects.equals(this.framesOmitted, sentryStackFrame.framesOmitted) && Objects.equals(this.filename, sentryStackFrame.filename) && Objects.equals(this.function, sentryStackFrame.function) && Objects.equals(this.module, sentryStackFrame.module) && Objects.equals(this.lineno, sentryStackFrame.lineno) && Objects.equals(this.colno, sentryStackFrame.colno) && Objects.equals(this.absPath, sentryStackFrame.absPath) && Objects.equals(this.contextLine, sentryStackFrame.contextLine) && Objects.equals(this.inApp, sentryStackFrame.inApp) && Objects.equals(this._package, sentryStackFrame._package) && Objects.equals(this._native, sentryStackFrame._native) && Objects.equals(this.platform, sentryStackFrame.platform) && Objects.equals(this.imageAddr, sentryStackFrame.imageAddr) && Objects.equals(this.symbolAddr, sentryStackFrame.symbolAddr) && Objects.equals(this.instructionAddr, sentryStackFrame.instructionAddr) && Objects.equals(this.addrMode, sentryStackFrame.addrMode) && Objects.equals(this.symbol, sentryStackFrame.symbol) && Objects.equals(this.unknown, sentryStackFrame.unknown) && Objects.equals(this.rawFunction, sentryStackFrame.rawFunction) && Objects.equals(this.lock, sentryStackFrame.lock)) {
                return true;
            }
        }
        return false;
    }

    public String getAbsPath() {
        return this.absPath;
    }

    public String getAddrMode() {
        return this.addrMode;
    }

    public Integer getColno() {
        return this.colno;
    }

    public String getContextLine() {
        return this.contextLine;
    }

    public String getFilename() {
        return this.filename;
    }

    public List<Integer> getFramesOmitted() {
        return this.framesOmitted;
    }

    public String getFunction() {
        return this.function;
    }

    public String getImageAddr() {
        return this.imageAddr;
    }

    public String getInstructionAddr() {
        return this.instructionAddr;
    }

    public Integer getLineno() {
        return this.lineno;
    }

    public SentryLockReason getLock() {
        return this.lock;
    }

    public String getModule() {
        return this.module;
    }

    public String getPackage() {
        return this._package;
    }

    public String getPlatform() {
        return this.platform;
    }

    public List<String> getPostContext() {
        return this.postContext;
    }

    public List<String> getPreContext() {
        return this.preContext;
    }

    public String getRawFunction() {
        return this.rawFunction;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public String getSymbolAddr() {
        return this.symbolAddr;
    }

    @Override // io.sentry.JsonUnknown
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public Map<String, Object> getVars() {
        return this.vars;
    }

    public int hashCode() {
        return Objects.hash(this.preContext, this.postContext, this.vars, this.framesOmitted, this.filename, this.function, this.module, this.lineno, this.colno, this.absPath, this.contextLine, this.inApp, this._package, this._native, this.platform, this.imageAddr, this.symbolAddr, this.instructionAddr, this.addrMode, this.symbol, this.unknown, this.rawFunction, this.lock);
    }

    public Boolean isInApp() {
        return this.inApp;
    }

    public Boolean isNative() {
        return this._native;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        if (this.filename != null) {
            objectWriter.name("filename").value(this.filename);
        }
        if (this.function != null) {
            objectWriter.name(JsonKeys.FUNCTION).value(this.function);
        }
        if (this.module != null) {
            objectWriter.name("module").value(this.module);
        }
        if (this.lineno != null) {
            objectWriter.name(JsonKeys.LINENO).value(this.lineno);
        }
        if (this.colno != null) {
            objectWriter.name(JsonKeys.COLNO).value(this.colno);
        }
        if (this.absPath != null) {
            objectWriter.name(JsonKeys.ABS_PATH).value(this.absPath);
        }
        if (this.contextLine != null) {
            objectWriter.name(JsonKeys.CONTEXT_LINE).value(this.contextLine);
        }
        if (this.inApp != null) {
            objectWriter.name(JsonKeys.IN_APP).value(this.inApp);
        }
        if (this._package != null) {
            objectWriter.name(JsonKeys.PACKAGE).value(this._package);
        }
        if (this._native != null) {
            objectWriter.name(JsonKeys.NATIVE).value(this._native);
        }
        if (this.platform != null) {
            objectWriter.name("platform").value(this.platform);
        }
        if (this.imageAddr != null) {
            objectWriter.name("image_addr").value(this.imageAddr);
        }
        if (this.symbolAddr != null) {
            objectWriter.name(JsonKeys.SYMBOL_ADDR).value(this.symbolAddr);
        }
        if (this.instructionAddr != null) {
            objectWriter.name(JsonKeys.INSTRUCTION_ADDR).value(this.instructionAddr);
        }
        if (this.addrMode != null) {
            objectWriter.name(JsonKeys.ADDR_MODE).value(this.addrMode);
        }
        if (this.rawFunction != null) {
            objectWriter.name(JsonKeys.RAW_FUNCTION).value(this.rawFunction);
        }
        if (this.symbol != null) {
            objectWriter.name(JsonKeys.SYMBOL).value(this.symbol);
        }
        if (this.lock != null) {
            objectWriter.name(JsonKeys.LOCK).value(iLogger, this.lock);
        }
        List<String> list = this.preContext;
        if (list != null && !list.isEmpty()) {
            objectWriter.name(JsonKeys.PRE_CONTEXT).value(iLogger, this.preContext);
        }
        List<String> list2 = this.postContext;
        if (list2 != null && !list2.isEmpty()) {
            objectWriter.name(JsonKeys.POST_CONTEXT).value(iLogger, this.postContext);
        }
        Map<String, Object> map = this.vars;
        if (map != null && !map.isEmpty()) {
            objectWriter.name(JsonKeys.VARS).value(iLogger, this.vars);
        }
        Map<String, Object> map2 = this.unknown;
        if (map2 != null) {
            for (String str : map2.keySet()) {
                Object obj = this.unknown.get(str);
                objectWriter.name(str);
                objectWriter.value(iLogger, obj);
            }
        }
        objectWriter.endObject();
    }

    public void setAbsPath(String str) {
        this.absPath = str;
    }

    public void setAddrMode(String str) {
        this.addrMode = str;
    }

    public void setColno(Integer num) {
        this.colno = num;
    }

    public void setContextLine(String str) {
        this.contextLine = str;
    }

    public void setFilename(String str) {
        this.filename = str;
    }

    public void setFramesOmitted(List<Integer> list) {
        this.framesOmitted = list;
    }

    public void setFunction(String str) {
        this.function = str;
    }

    public void setImageAddr(String str) {
        this.imageAddr = str;
    }

    public void setInApp(Boolean bool) {
        this.inApp = bool;
    }

    public void setInstructionAddr(String str) {
        this.instructionAddr = str;
    }

    public void setLineno(Integer num) {
        this.lineno = num;
    }

    public void setLock(SentryLockReason sentryLockReason) {
        this.lock = sentryLockReason;
    }

    public void setModule(String str) {
        this.module = str;
    }

    public void setNative(Boolean bool) {
        this._native = bool;
    }

    public void setPackage(String str) {
        this._package = str;
    }

    public void setPlatform(String str) {
        this.platform = str;
    }

    public void setPostContext(List<String> list) {
        this.postContext = list;
    }

    public void setPreContext(List<String> list) {
        this.preContext = list;
    }

    public void setRawFunction(String str) {
        this.rawFunction = str;
    }

    public void setSymbol(String str) {
        this.symbol = str;
    }

    public void setSymbolAddr(String str) {
        this.symbolAddr = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public void setVars(Map<String, Object> map) {
        this.vars = map;
    }
}
