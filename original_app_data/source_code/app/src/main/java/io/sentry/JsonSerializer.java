package io.sentry;

import io.sentry.Breadcrumb;
import io.sentry.ProfileChunk;
import io.sentry.ProfileContext;
import io.sentry.ProfilingTraceData;
import io.sentry.ProfilingTransactionData;
import io.sentry.ReplayRecording;
import io.sentry.SentryAppStartProfilingOptions;
import io.sentry.SentryEnvelopeHeader;
import io.sentry.SentryEnvelopeItemHeader;
import io.sentry.SentryEvent;
import io.sentry.SentryItemType;
import io.sentry.SentryLevel;
import io.sentry.SentryLockReason;
import io.sentry.SentryLogEvents;
import io.sentry.SentryMetricsEvents;
import io.sentry.SentryReplayEvent;
import io.sentry.Session;
import io.sentry.SpanContext;
import io.sentry.SpanId;
import io.sentry.SpanStatus;
import io.sentry.UserFeedback;
import io.sentry.clientreport.ClientReport;
import io.sentry.profilemeasurements.ProfileMeasurement;
import io.sentry.profilemeasurements.ProfileMeasurementValue;
import io.sentry.protocol.App;
import io.sentry.protocol.Browser;
import io.sentry.protocol.Contexts;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.DebugMeta;
import io.sentry.protocol.Device;
import io.sentry.protocol.Feedback;
import io.sentry.protocol.Geo;
import io.sentry.protocol.Gpu;
import io.sentry.protocol.MeasurementValue;
import io.sentry.protocol.Mechanism;
import io.sentry.protocol.Message;
import io.sentry.protocol.OperatingSystem;
import io.sentry.protocol.Request;
import io.sentry.protocol.SdkInfo;
import io.sentry.protocol.SdkVersion;
import io.sentry.protocol.SentryException;
import io.sentry.protocol.SentryPackage;
import io.sentry.protocol.SentryRuntime;
import io.sentry.protocol.SentrySpan;
import io.sentry.protocol.SentryStackFrame;
import io.sentry.protocol.SentryStackTrace;
import io.sentry.protocol.SentryThread;
import io.sentry.protocol.SentryTransaction;
import io.sentry.protocol.User;
import io.sentry.protocol.ViewHierarchy;
import io.sentry.protocol.ViewHierarchyNode;
import io.sentry.rrweb.RRWebBreadcrumbEvent;
import io.sentry.rrweb.RRWebEventType;
import io.sentry.rrweb.RRWebInteractionEvent;
import io.sentry.rrweb.RRWebInteractionMoveEvent;
import io.sentry.rrweb.RRWebMetaEvent;
import io.sentry.rrweb.RRWebSpanEvent;
import io.sentry.rrweb.RRWebVideoEvent;
import io.sentry.util.Objects;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class JsonSerializer implements ISerializer {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final Map<Class<?>, JsonDeserializer<?>> deserializersByClass;
    private final SentryOptions options;

    public JsonSerializer(SentryOptions sentryOptions) {
        this.options = sentryOptions;
        HashMap map = new HashMap();
        this.deserializersByClass = map;
        map.put(App.class, new App.Deserializer());
        map.put(Breadcrumb.class, new Breadcrumb.Deserializer());
        map.put(Browser.class, new Browser.Deserializer());
        map.put(Contexts.class, new Contexts.Deserializer());
        map.put(DebugImage.class, new DebugImage.Deserializer());
        map.put(DebugMeta.class, new DebugMeta.Deserializer());
        map.put(Device.class, new Device.Deserializer());
        map.put(Device.DeviceOrientation.class, new Device.DeviceOrientation.Deserializer());
        map.put(Feedback.class, new Feedback.Deserializer());
        map.put(Gpu.class, new Gpu.Deserializer());
        map.put(SentryStackTrace.InstructionAddressAdjustment.class, new SentryStackTrace.InstructionAddressAdjustment.Deserializer());
        map.put(MeasurementValue.class, new MeasurementValue.Deserializer());
        map.put(Mechanism.class, new Mechanism.Deserializer());
        map.put(Message.class, new Message.Deserializer());
        map.put(OperatingSystem.class, new OperatingSystem.Deserializer());
        map.put(ProfileChunk.class, new ProfileChunk.Deserializer());
        map.put(ProfileContext.class, new ProfileContext.Deserializer());
        map.put(ProfilingTraceData.class, new ProfilingTraceData.Deserializer());
        map.put(ProfilingTransactionData.class, new ProfilingTransactionData.Deserializer());
        map.put(ProfileMeasurement.class, new ProfileMeasurement.Deserializer());
        map.put(ProfileMeasurementValue.class, new ProfileMeasurementValue.Deserializer());
        map.put(Request.class, new Request.Deserializer());
        map.put(ReplayRecording.class, new ReplayRecording.Deserializer());
        map.put(RRWebBreadcrumbEvent.class, new RRWebBreadcrumbEvent.Deserializer());
        map.put(RRWebEventType.class, new RRWebEventType.Deserializer());
        map.put(RRWebInteractionEvent.class, new RRWebInteractionEvent.Deserializer());
        map.put(RRWebInteractionMoveEvent.class, new RRWebInteractionMoveEvent.Deserializer());
        map.put(RRWebMetaEvent.class, new RRWebMetaEvent.Deserializer());
        map.put(RRWebSpanEvent.class, new RRWebSpanEvent.Deserializer());
        map.put(RRWebVideoEvent.class, new RRWebVideoEvent.Deserializer());
        map.put(SdkInfo.class, new SdkInfo.Deserializer());
        map.put(SdkVersion.class, new SdkVersion.Deserializer());
        map.put(SentryEnvelopeHeader.class, new SentryEnvelopeHeader.Deserializer());
        map.put(SentryEnvelopeItemHeader.class, new SentryEnvelopeItemHeader.Deserializer());
        map.put(SentryEvent.class, new SentryEvent.Deserializer());
        map.put(SentryException.class, new SentryException.Deserializer());
        map.put(SentryItemType.class, new SentryItemType.Deserializer());
        map.put(SentryLevel.class, new SentryLevel.Deserializer());
        map.put(SentryLockReason.class, new SentryLockReason.Deserializer());
        map.put(SentryLogEvents.class, new SentryLogEvents.Deserializer());
        map.put(SentryMetricsEvents.class, new SentryMetricsEvents.Deserializer());
        map.put(SentryPackage.class, new SentryPackage.Deserializer());
        map.put(SentryRuntime.class, new SentryRuntime.Deserializer());
        map.put(SentryReplayEvent.class, new SentryReplayEvent.Deserializer());
        map.put(SentrySpan.class, new SentrySpan.Deserializer());
        map.put(SentryStackFrame.class, new SentryStackFrame.Deserializer());
        map.put(SentryStackTrace.class, new SentryStackTrace.Deserializer());
        map.put(SentryAppStartProfilingOptions.class, new SentryAppStartProfilingOptions.Deserializer());
        map.put(SentryThread.class, new SentryThread.Deserializer());
        map.put(SentryTransaction.class, new SentryTransaction.Deserializer());
        map.put(Session.class, new Session.Deserializer());
        map.put(SpanContext.class, new SpanContext.Deserializer());
        map.put(SpanId.class, new SpanId.Deserializer());
        map.put(SpanStatus.class, new SpanStatus.Deserializer());
        map.put(User.class, new User.Deserializer());
        map.put(Geo.class, new Geo.Deserializer());
        map.put(UserFeedback.class, new UserFeedback.Deserializer());
        map.put(ClientReport.class, new ClientReport.Deserializer());
        map.put(ViewHierarchyNode.class, new ViewHierarchyNode.Deserializer());
        map.put(ViewHierarchy.class, new ViewHierarchy.Deserializer());
    }

    private <T> boolean isKnownPrimitive(Class<T> cls) {
        return cls.isArray() || Collection.class.isAssignableFrom(cls) || String.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls);
    }

    private String serializeToString(Object obj, boolean z10) {
        StringWriter stringWriter = new StringWriter();
        JsonObjectWriter jsonObjectWriter = new JsonObjectWriter(stringWriter, this.options.getMaxDepth());
        if (z10) {
            jsonObjectWriter.setIndent("\t");
        }
        jsonObjectWriter.value(this.options.getLogger(), obj);
        return stringWriter.toString();
    }

    @Override // io.sentry.ISerializer
    public <T> T deserialize(Reader reader, Class<T> cls) {
        T tCast;
        try {
            JsonObjectReader jsonObjectReader = new JsonObjectReader(reader);
            try {
                JsonDeserializer<?> jsonDeserializer = this.deserializersByClass.get(cls);
                if (jsonDeserializer != null) {
                    tCast = cls.cast(jsonDeserializer.deserialize(jsonObjectReader, this.options.getLogger()));
                } else {
                    if (!isKnownPrimitive(cls)) {
                        jsonObjectReader.close();
                        return null;
                    }
                    tCast = (T) jsonObjectReader.nextObjectOrNull();
                }
                jsonObjectReader.close();
                return tCast;
            } finally {
            }
        } catch (Exception e10) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error when deserializing", e10);
            return null;
        }
    }

    @Override // io.sentry.ISerializer
    public <T, R> T deserializeCollection(Reader reader, Class<T> cls, JsonDeserializer<R> jsonDeserializer) {
        try {
            JsonObjectReader jsonObjectReader = new JsonObjectReader(reader);
            try {
                T t10 = (!Collection.class.isAssignableFrom(cls) || jsonDeserializer == null) ? (T) jsonObjectReader.nextObjectOrNull() : (T) jsonObjectReader.nextListOrNull(this.options.getLogger(), jsonDeserializer);
                jsonObjectReader.close();
                return t10;
            } finally {
            }
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error when deserializing", th);
            return null;
        }
    }

    @Override // io.sentry.ISerializer
    public SentryEnvelope deserializeEnvelope(InputStream inputStream) {
        Objects.requireNonNull(inputStream, "The InputStream object is required.");
        try {
            return this.options.getEnvelopeReader().read(inputStream);
        } catch (IOException e10) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error deserializing envelope.", e10);
            return null;
        }
    }

    @Override // io.sentry.ISerializer
    public <T> void serialize(T t10, Writer writer) throws IOException {
        Objects.requireNonNull(t10, "The entity is required.");
        Objects.requireNonNull(writer, "The Writer object is required.");
        ILogger logger = this.options.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        if (logger.isEnabled(sentryLevel)) {
            this.options.getLogger().log(sentryLevel, "Serializing object: %s", serializeToString(t10, this.options.isEnablePrettySerializationOutput()));
        }
        new JsonObjectWriter(writer, this.options.getMaxDepth()).value(this.options.getLogger(), (Object) t10);
        writer.flush();
    }

    @Override // io.sentry.ISerializer
    public void serialize(SentryEnvelope sentryEnvelope, OutputStream outputStream) throws IOException {
        Objects.requireNonNull(sentryEnvelope, "The SentryEnvelope object is required.");
        Objects.requireNonNull(outputStream, "The Stream object is required.");
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new BufferedOutputStream(outputStream), UTF_8));
        try {
            sentryEnvelope.getHeader().serialize(new JsonObjectWriter(bufferedWriter, this.options.getMaxDepth()), this.options.getLogger());
            bufferedWriter.write("\n");
            for (SentryEnvelopeItem sentryEnvelopeItem : sentryEnvelope.getItems()) {
                try {
                    byte[] data = sentryEnvelopeItem.getData();
                    sentryEnvelopeItem.getHeader().serialize(new JsonObjectWriter(bufferedWriter, this.options.getMaxDepth()), this.options.getLogger());
                    bufferedWriter.write("\n");
                    bufferedWriter.flush();
                    outputStream.write(data);
                    bufferedWriter.write("\n");
                } catch (Exception e10) {
                    this.options.getLogger().log(SentryLevel.ERROR, "Failed to create envelope item. Dropping it.", e10);
                }
            }
        } finally {
            bufferedWriter.flush();
        }
    }

    @Override // io.sentry.ISerializer
    public String serialize(Map<String, Object> map) {
        return serializeToString(map, false);
    }
}
