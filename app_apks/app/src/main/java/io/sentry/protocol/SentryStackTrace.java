package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.protocol.SentryStackFrame;
import io.sentry.util.CollectionUtils;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SentryStackTrace implements JsonUnknown, JsonSerializable {
    private List<SentryStackFrame> frames;
    private InstructionAddressAdjustment instructionAddressAdjustment;
    private Map<String, String> registers;
    private Boolean snapshot;
    private Map<String, Object> unknown;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Deserializer implements JsonDeserializer<SentryStackTrace> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public SentryStackTrace deserialize(ObjectReader objectReader, ILogger iLogger) {
            String strNextName;
            SentryStackTrace sentryStackTrace = new SentryStackTrace();
            objectReader.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "frames":
                        sentryStackTrace.frames = objectReader.nextListOrNull(iLogger, new SentryStackFrame.Deserializer());
                        break;
                    case "instruction_addr_adjustment":
                        sentryStackTrace.instructionAddressAdjustment = (InstructionAddressAdjustment) objectReader.nextOrNull(iLogger, new InstructionAddressAdjustment.Deserializer());
                        break;
                    case "registers":
                        sentryStackTrace.registers = CollectionUtils.newConcurrentHashMap((Map) objectReader.nextObjectOrNull());
                        break;
                    case "snapshot":
                        sentryStackTrace.snapshot = objectReader.nextBooleanOrNull();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            sentryStackTrace.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return sentryStackTrace;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum InstructionAddressAdjustment implements JsonSerializable {
        AUTO,
        ALL,
        ALL_BUT_FIRST,
        NONE;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Deserializer implements JsonDeserializer<InstructionAddressAdjustment> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // io.sentry.JsonDeserializer
            public InstructionAddressAdjustment deserialize(ObjectReader objectReader, ILogger iLogger) {
                return InstructionAddressAdjustment.valueOf(objectReader.nextString().toUpperCase(Locale.ROOT));
            }
        }

        @Override // io.sentry.JsonSerializable
        public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
            objectWriter.value(toString().toLowerCase(Locale.ROOT));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class JsonKeys {
        public static final String FRAMES = "frames";
        public static final String INSTRUCTION_ADDRESS_ADJUSTMENT = "instruction_addr_adjustment";
        public static final String REGISTERS = "registers";
        public static final String SNAPSHOT = "snapshot";
    }

    public SentryStackTrace() {
    }

    public List<SentryStackFrame> getFrames() {
        return this.frames;
    }

    public InstructionAddressAdjustment getInstructionAddressAdjustment() {
        return this.instructionAddressAdjustment;
    }

    public Map<String, String> getRegisters() {
        return this.registers;
    }

    public Boolean getSnapshot() {
        return this.snapshot;
    }

    @Override // io.sentry.JsonUnknown
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        if (this.frames != null) {
            objectWriter.name("frames").value(iLogger, this.frames);
        }
        if (this.registers != null) {
            objectWriter.name(JsonKeys.REGISTERS).value(iLogger, this.registers);
        }
        if (this.snapshot != null) {
            objectWriter.name(JsonKeys.SNAPSHOT).value(this.snapshot);
        }
        if (this.instructionAddressAdjustment != null) {
            objectWriter.name(JsonKeys.INSTRUCTION_ADDRESS_ADJUSTMENT).value(iLogger, this.instructionAddressAdjustment);
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

    public void setFrames(List<SentryStackFrame> list) {
        this.frames = list;
    }

    public void setInstructionAddressAdjustment(InstructionAddressAdjustment instructionAddressAdjustment) {
        this.instructionAddressAdjustment = instructionAddressAdjustment;
    }

    public void setRegisters(Map<String, String> map) {
        this.registers = map;
    }

    public void setSnapshot(Boolean bool) {
        this.snapshot = bool;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public SentryStackTrace(List<SentryStackFrame> list) {
        this.frames = list;
    }
}
