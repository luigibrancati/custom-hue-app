package io.flutter.embedding.engine.systemchannels;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class PlatformViewCreationRequest {
    public final int direction;
    public final RequestedDisplayMode displayMode;
    public final double logicalHeight;
    public final double logicalLeft;
    public final double logicalTop;
    public final double logicalWidth;
    public final ByteBuffer params;
    public final int viewId;
    public final String viewType;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum RequestedDisplayMode {
        TEXTURE_WITH_VIRTUAL_FALLBACK,
        TEXTURE_WITH_HYBRID_FALLBACK,
        HYBRID_ONLY
    }

    public PlatformViewCreationRequest(int i10, String str, double d10, double d11, double d12, double d13, int i11, ByteBuffer byteBuffer) {
        this(i10, str, d10, d11, d12, d13, i11, RequestedDisplayMode.TEXTURE_WITH_VIRTUAL_FALLBACK, byteBuffer);
    }

    public static PlatformViewCreationRequest createHCPPRequest(int i10, String str, int i11, ByteBuffer byteBuffer) {
        return new PlatformViewCreationRequest(i10, str, 0.0d, 0.0d, 0.0d, 0.0d, i11, null, byteBuffer);
    }

    public static PlatformViewCreationRequest createHybridCompositionRequest(int i10, String str, int i11, ByteBuffer byteBuffer) {
        return new PlatformViewCreationRequest(i10, str, 0.0d, 0.0d, 0.0d, 0.0d, i11, RequestedDisplayMode.HYBRID_ONLY, byteBuffer);
    }

    public static PlatformViewCreationRequest createTLHCWithFallbackRequest(int i10, String str, double d10, double d11, double d12, double d13, int i11, boolean z10, ByteBuffer byteBuffer) {
        return new PlatformViewCreationRequest(i10, str, d10, d11, d12, d13, i11, z10 ? RequestedDisplayMode.TEXTURE_WITH_HYBRID_FALLBACK : RequestedDisplayMode.TEXTURE_WITH_VIRTUAL_FALLBACK, byteBuffer);
    }

    public PlatformViewCreationRequest(int i10, String str, double d10, double d11, double d12, double d13, int i11, RequestedDisplayMode requestedDisplayMode, ByteBuffer byteBuffer) {
        this.viewId = i10;
        this.viewType = str;
        this.logicalTop = d10;
        this.logicalLeft = d11;
        this.logicalWidth = d12;
        this.logicalHeight = d13;
        this.direction = i11;
        this.displayMode = requestedDisplayMode;
        this.params = byteBuffer;
    }
}
