package com.cloudwebrtc.webrtc;

import com.cloudwebrtc.webrtc.SimulcastVideoEncoderFactoryWrapper;
import gc.y;
import io.sentry.protocol.SentryStackFrame;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import org.webrtc.EglBase;
import org.webrtc.HardwareVideoEncoderFactory;
import org.webrtc.SimulcastVideoEncoderFactory;
import org.webrtc.SoftwareVideoEncoderFactory;
import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoCodecStatus;
import org.webrtc.VideoEncoder;
import org.webrtc.VideoEncoderFactory;
import org.webrtc.VideoEncoderFallback;
import org.webrtc.VideoFrame;
import org.webrtc.WrappedNativeVideoEncoder;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0014\u0015\u0016B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012H\u0016¢\u0006\u0002\u0010\u0013R\u000e\u0010\t\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/cloudwebrtc/webrtc/SimulcastVideoEncoderFactoryWrapper;", "Lorg/webrtc/VideoEncoderFactory;", "sharedContext", "Lorg/webrtc/EglBase$Context;", "enableIntelVp8Encoder", "", "enableH264HighProfile", "<init>", "(Lorg/webrtc/EglBase$Context;ZZ)V", "primary", "fallback", SentryStackFrame.JsonKeys.NATIVE, "Lorg/webrtc/SimulcastVideoEncoderFactory;", "createEncoder", "Lorg/webrtc/VideoEncoder;", "info", "Lorg/webrtc/VideoCodecInfo;", "getSupportedCodecs", "", "()[Lorg/webrtc/VideoCodecInfo;", "FallbackFactory", "StreamEncoderWrapper", "StreamEncoderWrapperFactory", "flutter_webrtc_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SimulcastVideoEncoderFactoryWrapper implements VideoEncoderFactory {
    private final VideoEncoderFactory fallback;
    private final SimulcastVideoEncoderFactory native;
    private final VideoEncoderFactory primary;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0016¢\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/cloudwebrtc/webrtc/SimulcastVideoEncoderFactoryWrapper$FallbackFactory;", "Lorg/webrtc/VideoEncoderFactory;", "hardwareVideoEncoderFactory", "<init>", "(Lorg/webrtc/VideoEncoderFactory;)V", "softwareVideoEncoderFactory", "createEncoder", "Lorg/webrtc/VideoEncoder;", "info", "Lorg/webrtc/VideoCodecInfo;", "getSupportedCodecs", "", "()[Lorg/webrtc/VideoCodecInfo;", "flutter_webrtc_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FallbackFactory implements VideoEncoderFactory {
        private final VideoEncoderFactory hardwareVideoEncoderFactory;
        private final VideoEncoderFactory softwareVideoEncoderFactory;

        public FallbackFactory(VideoEncoderFactory hardwareVideoEncoderFactory) {
            AbstractC4862t.e(hardwareVideoEncoderFactory, "hardwareVideoEncoderFactory");
            this.hardwareVideoEncoderFactory = hardwareVideoEncoderFactory;
            this.softwareVideoEncoderFactory = new SoftwareVideoEncoderFactory();
        }

        @Override // org.webrtc.VideoEncoderFactory
        public VideoEncoder createEncoder(VideoCodecInfo info) {
            AbstractC4862t.e(info, "info");
            VideoEncoder videoEncoderCreateEncoder = this.softwareVideoEncoderFactory.createEncoder(info);
            VideoEncoder videoEncoderCreateEncoder2 = this.hardwareVideoEncoderFactory.createEncoder(info);
            return (videoEncoderCreateEncoder2 == null || videoEncoderCreateEncoder == null) ? videoEncoderCreateEncoder == null ? videoEncoderCreateEncoder2 : videoEncoderCreateEncoder : new VideoEncoderFallback(videoEncoderCreateEncoder2, videoEncoderCreateEncoder);
        }

        @Override // org.webrtc.VideoEncoderFactory
        public VideoCodecInfo[] getSupportedCodecs() {
            ArrayList arrayList = new ArrayList();
            VideoCodecInfo[] supportedCodecs = this.softwareVideoEncoderFactory.getSupportedCodecs();
            AbstractC4862t.d(supportedCodecs, "getSupportedCodecs(...)");
            y.D(arrayList, supportedCodecs);
            VideoCodecInfo[] supportedCodecs2 = this.hardwareVideoEncoderFactory.getSupportedCodecs();
            AbstractC4862t.d(supportedCodecs2, "getSupportedCodecs(...)");
            y.D(arrayList, supportedCodecs2);
            return (VideoCodecInfo[]) arrayList.toArray(new VideoCodecInfo[0]);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\u001a\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$H\u0016J\b\u0010&\u001a\u00020'H\u0016J\u0012\u0010(\u001a\u00020\u00102\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0013\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,H\u0016¢\u0006\u0002\u0010.J\b\u0010/\u001a\u000200H\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u00061"}, d2 = {"Lcom/cloudwebrtc/webrtc/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;", "Lorg/webrtc/VideoEncoder;", "encoder", "<init>", "(Lorg/webrtc/VideoEncoder;)V", "executor", "Ljava/util/concurrent/ExecutorService;", "getExecutor", "()Ljava/util/concurrent/ExecutorService;", "streamSettings", "Lorg/webrtc/VideoEncoder$Settings;", "getStreamSettings", "()Lorg/webrtc/VideoEncoder$Settings;", "setStreamSettings", "(Lorg/webrtc/VideoEncoder$Settings;)V", "initEncode", "Lorg/webrtc/VideoCodecStatus;", "settings", "callback", "Lorg/webrtc/VideoEncoder$Callback;", "release", "encode", "frame", "Lorg/webrtc/VideoFrame;", "encodeInfo", "Lorg/webrtc/VideoEncoder$EncodeInfo;", "setRateAllocation", "allocation", "Lorg/webrtc/VideoEncoder$BitrateAllocation;", RRWebVideoEvent.JsonKeys.FRAME_RATE, "", "getScalingSettings", "Lorg/webrtc/VideoEncoder$ScalingSettings;", "getImplementationName", "", "createNative", "", "webrtcEnvRef", "isHardwareEncoder", "", "setRates", "rcParameters", "Lorg/webrtc/VideoEncoder$RateControlParameters;", "getResolutionBitrateLimits", "", "Lorg/webrtc/VideoEncoder$ResolutionBitrateLimits;", "()[Lorg/webrtc/VideoEncoder$ResolutionBitrateLimits;", "getEncoderInfo", "Lorg/webrtc/VideoEncoder$EncoderInfo;", "flutter_webrtc_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class StreamEncoderWrapper implements VideoEncoder {
        private final VideoEncoder encoder;
        private final ExecutorService executor;
        private VideoEncoder.Settings streamSettings;

        public StreamEncoderWrapper(VideoEncoder encoder) {
            AbstractC4862t.e(encoder, "encoder");
            this.encoder = encoder;
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            AbstractC4862t.d(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
            this.executor = executorServiceNewSingleThreadExecutor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Long createNative$lambda$6(StreamEncoderWrapper streamEncoderWrapper, long j10) {
            return Long.valueOf(streamEncoderWrapper.encoder.createNative(j10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final VideoCodecStatus encode$lambda$2(StreamEncoderWrapper streamEncoderWrapper, VideoFrame videoFrame, VideoEncoder.EncodeInfo encodeInfo) {
            if (streamEncoderWrapper.streamSettings == null) {
                return streamEncoderWrapper.encoder.encode(videoFrame, encodeInfo);
            }
            int width = videoFrame.getBuffer().getWidth();
            VideoEncoder.Settings settings = streamEncoderWrapper.streamSettings;
            AbstractC4862t.b(settings);
            if (width == settings.width) {
                return streamEncoderWrapper.encoder.encode(videoFrame, encodeInfo);
            }
            VideoFrame.Buffer buffer = videoFrame.getBuffer();
            int width2 = buffer.getWidth();
            int height = buffer.getHeight();
            VideoEncoder.Settings settings2 = streamEncoderWrapper.streamSettings;
            AbstractC4862t.b(settings2);
            int i10 = settings2.width;
            VideoEncoder.Settings settings3 = streamEncoderWrapper.streamSettings;
            AbstractC4862t.b(settings3);
            VideoFrame.Buffer bufferCropAndScale = buffer.cropAndScale(0, 0, width2, height, i10, settings3.height);
            VideoCodecStatus videoCodecStatusEncode = streamEncoderWrapper.encoder.encode(new VideoFrame(bufferCropAndScale, videoFrame.getRotation(), videoFrame.getTimestampNs()), encodeInfo);
            bufferCropAndScale.release();
            return videoCodecStatusEncode;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final VideoEncoder.EncoderInfo getEncoderInfo$lambda$10(StreamEncoderWrapper streamEncoderWrapper) {
            return streamEncoderWrapper.encoder.getEncoderInfo();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getImplementationName$lambda$5(StreamEncoderWrapper streamEncoderWrapper) {
            return streamEncoderWrapper.encoder.getImplementationName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final VideoEncoder.ResolutionBitrateLimits[] getResolutionBitrateLimits$lambda$9(StreamEncoderWrapper streamEncoderWrapper) {
            return streamEncoderWrapper.encoder.getResolutionBitrateLimits();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final VideoEncoder.ScalingSettings getScalingSettings$lambda$4(StreamEncoderWrapper streamEncoderWrapper) {
            return streamEncoderWrapper.encoder.getScalingSettings();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final VideoCodecStatus initEncode$lambda$0(StreamEncoderWrapper streamEncoderWrapper, VideoEncoder.Settings settings, VideoEncoder.Callback callback) {
            return streamEncoderWrapper.encoder.initEncode(settings, callback);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Boolean isHardwareEncoder$lambda$7(StreamEncoderWrapper streamEncoderWrapper) {
            return Boolean.valueOf(streamEncoderWrapper.encoder.isHardwareEncoder());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final VideoCodecStatus release$lambda$1(StreamEncoderWrapper streamEncoderWrapper) {
            return streamEncoderWrapper.encoder.release();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final VideoCodecStatus setRateAllocation$lambda$3(StreamEncoderWrapper streamEncoderWrapper, VideoEncoder.BitrateAllocation bitrateAllocation, int i10) {
            return streamEncoderWrapper.encoder.setRateAllocation(bitrateAllocation, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final VideoCodecStatus setRates$lambda$8(StreamEncoderWrapper streamEncoderWrapper, VideoEncoder.RateControlParameters rateControlParameters) {
            return streamEncoderWrapper.encoder.setRates(rateControlParameters);
        }

        @Override // org.webrtc.VideoEncoder
        public long createNative(final long webrtcEnvRef) throws ExecutionException, InterruptedException {
            Object obj = this.executor.submit(new Callable() { // from class: com.cloudwebrtc.webrtc.o
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper.createNative$lambda$6(this.f28804a, webrtcEnvRef);
                }
            }).get();
            AbstractC4862t.d(obj, "get(...)");
            return ((Number) obj).longValue();
        }

        @Override // org.webrtc.VideoEncoder
        public VideoCodecStatus encode(final VideoFrame frame, final VideoEncoder.EncodeInfo encodeInfo) throws ExecutionException, InterruptedException {
            AbstractC4862t.e(frame, "frame");
            Object obj = this.executor.submit(new Callable() { // from class: com.cloudwebrtc.webrtc.u
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper.encode$lambda$2(this.f28833a, frame, encodeInfo);
                }
            }).get();
            AbstractC4862t.d(obj, "get(...)");
            return (VideoCodecStatus) obj;
        }

        @Override // org.webrtc.VideoEncoder
        public VideoEncoder.EncoderInfo getEncoderInfo() throws ExecutionException, InterruptedException {
            Object obj = this.executor.submit(new Callable() { // from class: com.cloudwebrtc.webrtc.t
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper.getEncoderInfo$lambda$10(this.f28832a);
                }
            }).get();
            AbstractC4862t.d(obj, "get(...)");
            return (VideoEncoder.EncoderInfo) obj;
        }

        public final ExecutorService getExecutor() {
            return this.executor;
        }

        @Override // org.webrtc.VideoEncoder
        public String getImplementationName() throws ExecutionException, InterruptedException {
            Object obj = this.executor.submit(new Callable() { // from class: com.cloudwebrtc.webrtc.m
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper.getImplementationName$lambda$5(this.f28801a);
                }
            }).get();
            AbstractC4862t.d(obj, "get(...)");
            return (String) obj;
        }

        @Override // org.webrtc.VideoEncoder
        public VideoEncoder.ResolutionBitrateLimits[] getResolutionBitrateLimits() throws ExecutionException, InterruptedException {
            Object obj = this.executor.submit(new Callable() { // from class: com.cloudwebrtc.webrtc.w
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper.getResolutionBitrateLimits$lambda$9(this.f28853a);
                }
            }).get();
            AbstractC4862t.d(obj, "get(...)");
            return (VideoEncoder.ResolutionBitrateLimits[]) obj;
        }

        @Override // org.webrtc.VideoEncoder
        public VideoEncoder.ScalingSettings getScalingSettings() throws ExecutionException, InterruptedException {
            Object obj = this.executor.submit(new Callable() { // from class: com.cloudwebrtc.webrtc.q
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper.getScalingSettings$lambda$4(this.f28809a);
                }
            }).get();
            AbstractC4862t.d(obj, "get(...)");
            return (VideoEncoder.ScalingSettings) obj;
        }

        public final VideoEncoder.Settings getStreamSettings() {
            return this.streamSettings;
        }

        @Override // org.webrtc.VideoEncoder
        public VideoCodecStatus initEncode(final VideoEncoder.Settings settings, final VideoEncoder.Callback callback) throws ExecutionException, InterruptedException {
            AbstractC4862t.e(settings, "settings");
            this.streamSettings = settings;
            Object obj = this.executor.submit(new Callable() { // from class: com.cloudwebrtc.webrtc.p
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper.initEncode$lambda$0(this.f28806a, settings, callback);
                }
            }).get();
            AbstractC4862t.d(obj, "get(...)");
            return (VideoCodecStatus) obj;
        }

        @Override // org.webrtc.VideoEncoder
        public boolean isHardwareEncoder() throws ExecutionException, InterruptedException {
            Object obj = this.executor.submit(new Callable() { // from class: com.cloudwebrtc.webrtc.s
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper.isHardwareEncoder$lambda$7(this.f28831a);
                }
            }).get();
            AbstractC4862t.d(obj, "get(...)");
            return ((Boolean) obj).booleanValue();
        }

        @Override // org.webrtc.VideoEncoder
        public VideoCodecStatus release() throws ExecutionException, InterruptedException {
            Object obj = this.executor.submit(new Callable() { // from class: com.cloudwebrtc.webrtc.v
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper.release$lambda$1(this.f28850a);
                }
            }).get();
            AbstractC4862t.d(obj, "get(...)");
            return (VideoCodecStatus) obj;
        }

        @Override // org.webrtc.VideoEncoder
        public VideoCodecStatus setRateAllocation(final VideoEncoder.BitrateAllocation allocation, final int frameRate) throws ExecutionException, InterruptedException {
            Object obj = this.executor.submit(new Callable() { // from class: com.cloudwebrtc.webrtc.r
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper.setRateAllocation$lambda$3(this.f28810a, allocation, frameRate);
                }
            }).get();
            AbstractC4862t.d(obj, "get(...)");
            return (VideoCodecStatus) obj;
        }

        @Override // org.webrtc.VideoEncoder
        public VideoCodecStatus setRates(final VideoEncoder.RateControlParameters rcParameters) throws ExecutionException, InterruptedException {
            Object obj = this.executor.submit(new Callable() { // from class: com.cloudwebrtc.webrtc.n
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper.setRates$lambda$8(this.f28802a, rcParameters);
                }
            }).get();
            AbstractC4862t.d(obj, "get(...)");
            return (VideoCodecStatus) obj;
        }

        public final void setStreamSettings(VideoEncoder.Settings settings) {
            this.streamSettings = settings;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0016¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/cloudwebrtc/webrtc/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapperFactory;", "Lorg/webrtc/VideoEncoderFactory;", "factory", "<init>", "(Lorg/webrtc/VideoEncoderFactory;)V", "createEncoder", "Lorg/webrtc/VideoEncoder;", "videoCodecInfo", "Lorg/webrtc/VideoCodecInfo;", "getSupportedCodecs", "", "()[Lorg/webrtc/VideoCodecInfo;", "flutter_webrtc_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class StreamEncoderWrapperFactory implements VideoEncoderFactory {
        private final VideoEncoderFactory factory;

        public StreamEncoderWrapperFactory(VideoEncoderFactory factory) {
            AbstractC4862t.e(factory, "factory");
            this.factory = factory;
        }

        @Override // org.webrtc.VideoEncoderFactory
        public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
            VideoEncoder videoEncoderCreateEncoder = this.factory.createEncoder(videoCodecInfo);
            if (videoEncoderCreateEncoder == null) {
                return null;
            }
            return videoEncoderCreateEncoder instanceof WrappedNativeVideoEncoder ? videoEncoderCreateEncoder : new StreamEncoderWrapper(videoEncoderCreateEncoder);
        }

        @Override // org.webrtc.VideoEncoderFactory
        public VideoCodecInfo[] getSupportedCodecs() {
            VideoCodecInfo[] supportedCodecs = this.factory.getSupportedCodecs();
            AbstractC4862t.d(supportedCodecs, "getSupportedCodecs(...)");
            return supportedCodecs;
        }
    }

    public SimulcastVideoEncoderFactoryWrapper(EglBase.Context context, boolean z10, boolean z11) {
        StreamEncoderWrapperFactory streamEncoderWrapperFactory = new StreamEncoderWrapperFactory(new HardwareVideoEncoderFactory(context, z10, z11));
        this.primary = streamEncoderWrapperFactory;
        StreamEncoderWrapperFactory streamEncoderWrapperFactory2 = new StreamEncoderWrapperFactory(new FallbackFactory(streamEncoderWrapperFactory));
        this.fallback = streamEncoderWrapperFactory2;
        this.native = new SimulcastVideoEncoderFactory(streamEncoderWrapperFactory, streamEncoderWrapperFactory2);
    }

    @Override // org.webrtc.VideoEncoderFactory
    public VideoEncoder createEncoder(VideoCodecInfo info) {
        return this.native.createEncoder(info);
    }

    @Override // org.webrtc.VideoEncoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        VideoCodecInfo[] supportedCodecs = this.native.getSupportedCodecs();
        AbstractC4862t.d(supportedCodecs, "getSupportedCodecs(...)");
        return supportedCodecs;
    }
}
