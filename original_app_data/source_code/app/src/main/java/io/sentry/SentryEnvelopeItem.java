package io.sentry;

import io.sentry.clientreport.ClientReport;
import io.sentry.exception.SentryEnvelopeException;
import io.sentry.protocol.SentryTransaction;
import io.sentry.util.FileUtils;
import io.sentry.util.JsonSerializationUtils;
import io.sentry.util.Objects;
import io.sentry.vendor.Base64;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SentryEnvelopeItem {
    private static final long MAX_PROFILE_CHUNK_SIZE = 52428800;
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private byte[] data;
    private final Callable<byte[]> dataFactory;
    private final SentryEnvelopeItemHeader header;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class CachedItem {
        private byte[] bytes;
        private final Callable<byte[]> dataFactory;

        public CachedItem(Callable<byte[]> callable) {
            this.dataFactory = callable;
        }

        private static byte[] orEmptyArray(byte[] bArr) {
            return bArr != null ? bArr : new byte[0];
        }

        public byte[] getBytes() {
            Callable<byte[]> callable;
            if (this.bytes == null && (callable = this.dataFactory) != null) {
                this.bytes = callable.call();
            }
            return orEmptyArray(this.bytes);
        }
    }

    public SentryEnvelopeItem(SentryEnvelopeItemHeader sentryEnvelopeItemHeader, byte[] bArr) {
        this.header = (SentryEnvelopeItemHeader) Objects.requireNonNull(sentryEnvelopeItemHeader, "SentryEnvelopeItemHeader is required.");
        this.data = bArr;
        this.dataFactory = null;
    }

    public static /* synthetic */ byte[] A(ISerializer iSerializer, SentryLogEvents sentryLogEvents) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, UTF_8));
            try {
                iSerializer.serialize(sentryLogEvents, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static /* synthetic */ byte[] B(ISerializer iSerializer, Session session) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, UTF_8));
            try {
                iSerializer.serialize(session, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static /* synthetic */ byte[] C(File file, ProfileChunk profileChunk, IProfileConverter iProfileConverter, ISerializer iSerializer) throws SentryEnvelopeException {
        if (!file.exists()) {
            throw new SentryEnvelopeException(String.format("Dropping profile chunk, because the file '%s' doesn't exists", file.getName()));
        }
        if (!"java".equals(profileChunk.getPlatform())) {
            String strEncodeToString = Base64.encodeToString(FileUtils.readBytesFromFile(file.getPath(), MAX_PROFILE_CHUNK_SIZE), 3);
            if (strEncodeToString.isEmpty()) {
                throw new SentryEnvelopeException("Profiling trace file is empty");
            }
            profileChunk.setSampledProfile(strEncodeToString);
        } else {
            if (NoOpProfileConverter.getInstance().equals(iProfileConverter)) {
                throw new SentryEnvelopeException("No ProfileConverter available, dropping chunk.");
            }
            try {
                profileChunk.setSentryProfile(iProfileConverter.convertFromFile(file.getAbsolutePath()));
            } catch (Exception e10) {
                throw new SentryEnvelopeException("Profile conversion failed", e10);
            }
        }
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, UTF_8));
                    try {
                        iSerializer.serialize(profileChunk, bufferedWriter);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        return byteArray;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e11) {
                throw new SentryEnvelopeException(String.format("Failed to serialize profile chunk\n%s", e11.getMessage()));
            }
        } finally {
            file.delete();
        }
    }

    public static /* synthetic */ byte[] F(Attachment attachment, long j10, ISerializer iSerializer, ILogger iLogger) throws SentryEnvelopeException {
        byte[] bArrCall;
        if (attachment.getBytes() != null) {
            byte[] bytes = attachment.getBytes();
            ensureAttachmentSizeLimit(bytes.length, j10, attachment.getFilename());
            return bytes;
        }
        if (attachment.getSerializable() != null) {
            byte[] bArrBytesFrom = JsonSerializationUtils.bytesFrom(iSerializer, iLogger, attachment.getSerializable());
            if (bArrBytesFrom != null) {
                ensureAttachmentSizeLimit(bArrBytesFrom.length, j10, attachment.getFilename());
                return bArrBytesFrom;
            }
        } else {
            if (attachment.getPathname() != null) {
                return FileUtils.readBytesFromFile(attachment.getPathname(), j10);
            }
            if (attachment.getByteProvider() != null && (bArrCall = attachment.getByteProvider().call()) != null) {
                ensureAttachmentSizeLimit(bArrCall.length, j10, attachment.getFilename());
                return bArrCall;
            }
        }
        throw new SentryEnvelopeException(String.format("Couldn't attach the attachment %s.\nPlease check that either bytes, serializable, path or provider is set.", attachment.getFilename()));
    }

    public static /* synthetic */ byte[] c(ISerializer iSerializer, SentryReplayEvent sentryReplayEvent, ReplayRecording replayRecording, File file, ILogger iLogger, boolean z10) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, UTF_8));
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    iSerializer.serialize(sentryReplayEvent, bufferedWriter);
                    linkedHashMap.put(SentryItemType.ReplayEvent.getItemType(), byteArrayOutputStream.toByteArray());
                    byteArrayOutputStream.reset();
                    if (replayRecording != null) {
                        iSerializer.serialize(replayRecording, bufferedWriter);
                        linkedHashMap.put(SentryItemType.ReplayRecording.getItemType(), byteArrayOutputStream.toByteArray());
                        byteArrayOutputStream.reset();
                    }
                    if (file != null && file.exists()) {
                        byte[] bytesFromFile = FileUtils.readBytesFromFile(file.getPath(), SentryReplayEvent.REPLAY_VIDEO_MAX_SIZE);
                        if (bytesFromFile.length > 0) {
                            linkedHashMap.put(SentryItemType.ReplayVideo.getItemType(), bytesFromFile);
                        }
                    }
                    byte[] bArrSerializeToMsgpack = serializeToMsgpack(linkedHashMap);
                    bufferedWriter.close();
                    byteArrayOutputStream.close();
                    if (file != null) {
                        if (z10) {
                            return bArrSerializeToMsgpack;
                        }
                    }
                    return bArrSerializeToMsgpack;
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                iLogger.log(SentryLevel.ERROR, "Could not serialize replay recording", th);
                if (file == null) {
                    return null;
                }
                if (z10) {
                    FileUtils.deleteRecursively(file.getParentFile());
                    return null;
                }
                file.delete();
                return null;
            } finally {
                if (file != null) {
                    if (z10) {
                        FileUtils.deleteRecursively(file.getParentFile());
                    } else {
                        file.delete();
                    }
                }
            }
        }
    }

    public static /* synthetic */ byte[] d(ISerializer iSerializer, ClientReport clientReport) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, UTF_8));
            try {
                iSerializer.serialize(clientReport, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static void ensureAttachmentSizeLimit(long j10, long j11, String str) throws SentryEnvelopeException {
        if (j10 > j11) {
            throw new SentryEnvelopeException(String.format("Dropping attachment with filename '%s', because the size of the passed bytes with %d bytes is bigger than the maximum allowed attachment size of %d bytes.", str, Long.valueOf(j10), Long.valueOf(j11)));
        }
    }

    public static SentryEnvelopeItem fromAttachment(final ISerializer iSerializer, final ILogger iLogger, final Attachment attachment, final long j10) {
        final CachedItem cachedItem = new CachedItem(new Callable() { // from class: io.sentry.r0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return SentryEnvelopeItem.F(attachment, j10, iSerializer, iLogger);
            }
        });
        return new SentryEnvelopeItem(new SentryEnvelopeItemHeader(SentryItemType.Attachment, new Callable() { // from class: io.sentry.s0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(cachedItem.getBytes().length);
            }
        }, attachment.getContentType(), attachment.getFilename(), attachment.getAttachmentType()), (Callable<byte[]>) new Callable() { // from class: io.sentry.t0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return cachedItem.getBytes();
            }
        });
    }

    public static SentryEnvelopeItem fromCheckIn(final ISerializer iSerializer, final CheckIn checkIn) {
        Objects.requireNonNull(iSerializer, "ISerializer is required.");
        Objects.requireNonNull(checkIn, "CheckIn is required.");
        final CachedItem cachedItem = new CachedItem(new Callable() { // from class: io.sentry.h0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return SentryEnvelopeItem.p(iSerializer, checkIn);
            }
        });
        return new SentryEnvelopeItem(new SentryEnvelopeItemHeader(SentryItemType.CheckIn, new Callable() { // from class: io.sentry.i0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(cachedItem.getBytes().length);
            }
        }, "application/json", null), (Callable<byte[]>) new Callable() { // from class: io.sentry.j0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return cachedItem.getBytes();
            }
        });
    }

    public static SentryEnvelopeItem fromClientReport(final ISerializer iSerializer, final ClientReport clientReport) {
        Objects.requireNonNull(iSerializer, "ISerializer is required.");
        Objects.requireNonNull(clientReport, "ClientReport is required.");
        final CachedItem cachedItem = new CachedItem(new Callable() { // from class: io.sentry.e0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return SentryEnvelopeItem.d(iSerializer, clientReport);
            }
        });
        return new SentryEnvelopeItem(new SentryEnvelopeItemHeader(SentryItemType.resolve(clientReport), new Callable() { // from class: io.sentry.f0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(cachedItem.getBytes().length);
            }
        }, "application/json", null), (Callable<byte[]>) new Callable() { // from class: io.sentry.g0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return cachedItem.getBytes();
            }
        });
    }

    public static SentryEnvelopeItem fromEvent(final ISerializer iSerializer, final SentryBaseEvent sentryBaseEvent) {
        Objects.requireNonNull(iSerializer, "ISerializer is required.");
        Objects.requireNonNull(sentryBaseEvent, "SentryEvent is required.");
        final CachedItem cachedItem = new CachedItem(new Callable() { // from class: io.sentry.X
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return SentryEnvelopeItem.r(iSerializer, sentryBaseEvent);
            }
        });
        return new SentryEnvelopeItem(new SentryEnvelopeItemHeader(SentryItemType.resolve(sentryBaseEvent), new Callable() { // from class: io.sentry.Y
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(cachedItem.getBytes().length);
            }
        }, "application/json", null), (Callable<byte[]>) new Callable() { // from class: io.sentry.a0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return cachedItem.getBytes();
            }
        });
    }

    public static SentryEnvelopeItem fromLogs(final ISerializer iSerializer, final SentryLogEvents sentryLogEvents) {
        Objects.requireNonNull(iSerializer, "ISerializer is required.");
        Objects.requireNonNull(sentryLogEvents, "SentryLogEvents is required.");
        final CachedItem cachedItem = new CachedItem(new Callable() { // from class: io.sentry.l0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return SentryEnvelopeItem.A(iSerializer, sentryLogEvents);
            }
        });
        return new SentryEnvelopeItem(new SentryEnvelopeItemHeader(SentryItemType.Log, (Callable<Integer>) new Callable() { // from class: io.sentry.m0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(cachedItem.getBytes().length);
            }
        }, "application/vnd.sentry.items.log+json", (String) null, (String) null, (String) null, Integer.valueOf(sentryLogEvents.getItems().size())), (Callable<byte[]>) new Callable() { // from class: io.sentry.n0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return cachedItem.getBytes();
            }
        });
    }

    public static SentryEnvelopeItem fromMetrics(final ISerializer iSerializer, final SentryMetricsEvents sentryMetricsEvents) {
        Objects.requireNonNull(iSerializer, "ISerializer is required.");
        Objects.requireNonNull(sentryMetricsEvents, "SentryMetricsEvents is required.");
        final CachedItem cachedItem = new CachedItem(new Callable() { // from class: io.sentry.o0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return SentryEnvelopeItem.x(iSerializer, sentryMetricsEvents);
            }
        });
        return new SentryEnvelopeItem(new SentryEnvelopeItemHeader(SentryItemType.TraceMetric, (Callable<Integer>) new Callable() { // from class: io.sentry.p0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(cachedItem.getBytes().length);
            }
        }, "application/vnd.sentry.items.trace-metric+json", (String) null, (String) null, (String) null, Integer.valueOf(sentryMetricsEvents.getItems().size())), (Callable<byte[]>) new Callable() { // from class: io.sentry.q0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return cachedItem.getBytes();
            }
        });
    }

    public static SentryEnvelopeItem fromProfileChunk(ProfileChunk profileChunk, ISerializer iSerializer) {
        return fromProfileChunk(profileChunk, iSerializer, NoOpProfileConverter.getInstance());
    }

    public static SentryEnvelopeItem fromProfilingTrace(final ProfilingTraceData profilingTraceData, final long j10, final ISerializer iSerializer) {
        final File traceFile = profilingTraceData.getTraceFile();
        final CachedItem cachedItem = new CachedItem(new Callable() { // from class: io.sentry.Q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return SentryEnvelopeItem.s(traceFile, j10, profilingTraceData, iSerializer);
            }
        });
        return new SentryEnvelopeItem(new SentryEnvelopeItemHeader(SentryItemType.Profile, new Callable() { // from class: io.sentry.S
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(cachedItem.getBytes().length);
            }
        }, "application-json", traceFile.getName()), (Callable<byte[]>) new Callable() { // from class: io.sentry.T
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return cachedItem.getBytes();
            }
        });
    }

    public static SentryEnvelopeItem fromReplay(final ISerializer iSerializer, final ILogger iLogger, final SentryReplayEvent sentryReplayEvent, final ReplayRecording replayRecording, final boolean z10) {
        final File videoFile = sentryReplayEvent.getVideoFile();
        final CachedItem cachedItem = new CachedItem(new Callable() { // from class: io.sentry.N
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return SentryEnvelopeItem.c(iSerializer, sentryReplayEvent, replayRecording, videoFile, iLogger, z10);
            }
        });
        return new SentryEnvelopeItem(new SentryEnvelopeItemHeader(SentryItemType.ReplayVideo, new Callable() { // from class: io.sentry.Z
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(cachedItem.getBytes().length);
            }
        }, null, null), (Callable<byte[]>) new Callable() { // from class: io.sentry.k0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return cachedItem.getBytes();
            }
        });
    }

    public static SentryEnvelopeItem fromSession(final ISerializer iSerializer, final Session session) {
        Objects.requireNonNull(iSerializer, "ISerializer is required.");
        Objects.requireNonNull(session, "Session is required.");
        final CachedItem cachedItem = new CachedItem(new Callable() { // from class: io.sentry.U
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return SentryEnvelopeItem.B(iSerializer, session);
            }
        });
        return new SentryEnvelopeItem(new SentryEnvelopeItemHeader(SentryItemType.Session, new Callable() { // from class: io.sentry.V
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(cachedItem.getBytes().length);
            }
        }, "application/json", null), (Callable<byte[]>) new Callable() { // from class: io.sentry.W
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return cachedItem.getBytes();
            }
        });
    }

    public static SentryEnvelopeItem fromUserFeedback(final ISerializer iSerializer, final UserFeedback userFeedback) {
        Objects.requireNonNull(iSerializer, "ISerializer is required.");
        Objects.requireNonNull(userFeedback, "UserFeedback is required.");
        final CachedItem cachedItem = new CachedItem(new Callable() { // from class: io.sentry.b0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return SentryEnvelopeItem.w(iSerializer, userFeedback);
            }
        });
        return new SentryEnvelopeItem(new SentryEnvelopeItemHeader(SentryItemType.UserFeedback, new Callable() { // from class: io.sentry.c0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(cachedItem.getBytes().length);
            }
        }, "application/json", null), (Callable<byte[]>) new Callable() { // from class: io.sentry.d0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return cachedItem.getBytes();
            }
        });
    }

    public static /* synthetic */ byte[] p(ISerializer iSerializer, CheckIn checkIn) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, UTF_8));
            try {
                iSerializer.serialize(checkIn, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static /* synthetic */ byte[] r(ISerializer iSerializer, SentryBaseEvent sentryBaseEvent) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, UTF_8));
            try {
                iSerializer.serialize(sentryBaseEvent, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static /* synthetic */ byte[] s(File file, long j10, ProfilingTraceData profilingTraceData, ISerializer iSerializer) throws SentryEnvelopeException {
        if (!file.exists()) {
            throw new SentryEnvelopeException(String.format("Dropping profiling trace data, because the file '%s' doesn't exists", file.getName()));
        }
        String strEncodeToString = Base64.encodeToString(FileUtils.readBytesFromFile(file.getPath(), j10), 3);
        if (strEncodeToString.isEmpty()) {
            throw new SentryEnvelopeException("Profiling trace file is empty");
        }
        profilingTraceData.setSampledProfile(strEncodeToString);
        profilingTraceData.readDeviceCpuFrequencies();
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, UTF_8));
                    try {
                        iSerializer.serialize(profilingTraceData, bufferedWriter);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        return byteArray;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e10) {
                throw new SentryEnvelopeException(String.format("Failed to serialize profiling trace data\n%s", e10.getMessage()));
            }
        } finally {
            file.delete();
        }
    }

    private static byte[] serializeToMsgpack(Map<String, byte[]> map) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write((byte) (map.size() | 128));
            for (Map.Entry<String, byte[]> entry : map.entrySet()) {
                byte[] bytes = entry.getKey().getBytes(UTF_8);
                int length = bytes.length;
                byteArrayOutputStream.write(-39);
                byteArrayOutputStream.write((byte) length);
                byteArrayOutputStream.write(bytes);
                byte[] value = entry.getValue();
                int length2 = value.length;
                byteArrayOutputStream.write(-58);
                byteArrayOutputStream.write(ByteBuffer.allocate(4).order(ByteOrder.BIG_ENDIAN).putInt(length2).array());
                byteArrayOutputStream.write(value);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static /* synthetic */ byte[] w(ISerializer iSerializer, UserFeedback userFeedback) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, UTF_8));
            try {
                iSerializer.serialize(userFeedback, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static /* synthetic */ byte[] x(ISerializer iSerializer, SentryMetricsEvents sentryMetricsEvents) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, UTF_8));
            try {
                iSerializer.serialize(sentryMetricsEvents, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public ClientReport getClientReport(ISerializer iSerializer) throws IOException {
        SentryEnvelopeItemHeader sentryEnvelopeItemHeader = this.header;
        if (sentryEnvelopeItemHeader == null || sentryEnvelopeItemHeader.getType() != SentryItemType.ClientReport) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(getData()), UTF_8));
        try {
            ClientReport clientReport = (ClientReport) iSerializer.deserialize(bufferedReader, ClientReport.class);
            bufferedReader.close();
            return clientReport;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public byte[] getData() {
        Callable<byte[]> callable;
        if (this.data == null && (callable = this.dataFactory) != null) {
            this.data = callable.call();
        }
        return this.data;
    }

    public SentryEvent getEvent(ISerializer iSerializer) throws IOException {
        SentryEnvelopeItemHeader sentryEnvelopeItemHeader = this.header;
        if (sentryEnvelopeItemHeader == null || sentryEnvelopeItemHeader.getType() != SentryItemType.Event) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(getData()), UTF_8));
        try {
            SentryEvent sentryEvent = (SentryEvent) iSerializer.deserialize(bufferedReader, SentryEvent.class);
            bufferedReader.close();
            return sentryEvent;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public SentryEnvelopeItemHeader getHeader() {
        return this.header;
    }

    public SentryLogEvents getLogs(ISerializer iSerializer) throws IOException {
        SentryEnvelopeItemHeader sentryEnvelopeItemHeader = this.header;
        if (sentryEnvelopeItemHeader == null || sentryEnvelopeItemHeader.getType() != SentryItemType.Log) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(getData()), UTF_8));
        try {
            SentryLogEvents sentryLogEvents = (SentryLogEvents) iSerializer.deserialize(bufferedReader, SentryLogEvents.class);
            bufferedReader.close();
            return sentryLogEvents;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public SentryMetricsEvents getMetrics(ISerializer iSerializer) throws IOException {
        SentryEnvelopeItemHeader sentryEnvelopeItemHeader = this.header;
        if (sentryEnvelopeItemHeader == null || sentryEnvelopeItemHeader.getType() != SentryItemType.TraceMetric) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(getData()), UTF_8));
        try {
            SentryMetricsEvents sentryMetricsEvents = (SentryMetricsEvents) iSerializer.deserialize(bufferedReader, SentryMetricsEvents.class);
            bufferedReader.close();
            return sentryMetricsEvents;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public SentryTransaction getTransaction(ISerializer iSerializer) throws IOException {
        SentryEnvelopeItemHeader sentryEnvelopeItemHeader = this.header;
        if (sentryEnvelopeItemHeader == null || sentryEnvelopeItemHeader.getType() != SentryItemType.Transaction) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(getData()), UTF_8));
        try {
            SentryTransaction sentryTransaction = (SentryTransaction) iSerializer.deserialize(bufferedReader, SentryTransaction.class);
            bufferedReader.close();
            return sentryTransaction;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static SentryEnvelopeItem fromProfileChunk(final ProfileChunk profileChunk, final ISerializer iSerializer, final IProfileConverter iProfileConverter) {
        final File traceFile = profileChunk.getTraceFile();
        final CachedItem cachedItem = new CachedItem(new Callable() { // from class: io.sentry.u0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return SentryEnvelopeItem.C(traceFile, profileChunk, iProfileConverter, iSerializer);
            }
        });
        return new SentryEnvelopeItem(new SentryEnvelopeItemHeader(SentryItemType.ProfileChunk, (Callable<Integer>) new Callable() { // from class: io.sentry.O
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(cachedItem.getBytes().length);
            }
        }, "application-json", traceFile.getName(), (String) null, profileChunk.getPlatform(), (Integer) null), (Callable<byte[]>) new Callable() { // from class: io.sentry.P
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return cachedItem.getBytes();
            }
        });
    }

    public SentryEnvelopeItem(SentryEnvelopeItemHeader sentryEnvelopeItemHeader, Callable<byte[]> callable) {
        this.header = (SentryEnvelopeItemHeader) Objects.requireNonNull(sentryEnvelopeItemHeader, "SentryEnvelopeItemHeader is required.");
        this.dataFactory = (Callable) Objects.requireNonNull(callable, "DataFactory is required.");
        this.data = null;
    }
}
