package io.flutter.plugins.videoplayer.texture;

import D1.C0744b;
import D1.C0752j;
import D1.D;
import D1.F;
import D1.G;
import D1.K;
import D1.o;
import D1.r;
import D1.t;
import D1.u;
import D1.x;
import D1.y;
import D1.z;
import F1.c;
import K1.InterfaceC1032y;
import io.flutter.plugins.videoplayer.ExoPlayerEventListener;
import io.flutter.plugins.videoplayer.VideoPlayerCallbacks;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class TextureExoPlayerEventListener extends ExoPlayerEventListener {
    private final boolean surfaceProducerHandlesCropAndRotation;

    public TextureExoPlayerEventListener(InterfaceC1032y interfaceC1032y, VideoPlayerCallbacks videoPlayerCallbacks, boolean z10) {
        super(interfaceC1032y, videoPlayerCallbacks);
        this.surfaceProducerHandlesCropAndRotation = z10;
    }

    private int getRotationCorrectionFromFormat(InterfaceC1032y interfaceC1032y) {
        o oVarA = interfaceC1032y.a();
        Objects.requireNonNull(oVarA);
        return oVarA.f1774A;
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, D1.z.d
    public /* bridge */ /* synthetic */ void onAudioAttributesChanged(C0744b c0744b) {
        super.onAudioAttributesChanged(c0744b);
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, D1.z.d
    public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i10) {
        super.onAudioSessionIdChanged(i10);
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, D1.z.d
    public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(z.b bVar) {
        super.onAvailableCommandsChanged(bVar);
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, D1.z.d
    public /* bridge */ /* synthetic */ void onCues(c cVar) {
        super.onCues(cVar);
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, D1.z.d
    public /* bridge */ /* synthetic */ void onDeviceInfoChanged(C0752j c0752j) {
        super.onDeviceInfoChanged(c0752j);
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, D1.z.d
    public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i10, boolean z10) {
        super.onDeviceVolumeChanged(i10, z10);
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, D1.z.d
    public /* bridge */ /* synthetic */ void onEvents(z zVar, z.c cVar) {
        super.onEvents(zVar, cVar);
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, D1.z.d
    public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z10) {
        super.onIsLoadingChanged(z10);
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, D1.z.d
    @Deprecated
    public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z10) {
        super.onLoadingChanged(z10);
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, D1.z.d
    public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j10) {
        super.onMaxSeekToPreviousPositionChanged(j10);
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, D1.z.d
    public /* bridge */ /* synthetic */ void onMediaItemTransition(r rVar, int i10) {
        super.onMediaItemTransition(rVar, i10);
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, D1.z.d
    public /* bridge */ /* synthetic */ void onMediaMetadataChanged(t tVar) {
        super.onMediaMetadataChanged(tVar);
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, D1.z.d
    public /* bridge */ /* synthetic */ void onMetadata(u uVar) {
        super.onMetadata(uVar);
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, D1.z.d
    public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z10, int i10) {
        super.onPlayWhenReadyChanged(z10, i10);
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, D1.z.d
    public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(y yVar) {
        super.onPlaybackParametersChanged(yVar);
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, D1.z.d
    public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i10) {
        super.onPlaybackSuppressionReasonChanged(i10);
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, D1.z.d
    public /* bridge */ /* synthetic */ void onPlayerErrorChanged(x xVar) {
        super.onPlayerErrorChanged(xVar);
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, D1.z.d
    @Deprecated
    public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z10, int i10) {
        super.onPlayerStateChanged(z10, i10);
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, D1.z.d
    public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(t tVar) {
        super.onPlaylistMetadataChanged(tVar);
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, D1.z.d
    @Deprecated
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i10) {
        super.onPositionDiscontinuity(i10);
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, D1.z.d
    public /* bridge */ /* synthetic */ void onRenderedFirstFrame() {
        super.onRenderedFirstFrame();
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, D1.z.d
    public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i10) {
        super.onRepeatModeChanged(i10);
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, D1.z.d
    public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j10) {
        super.onSeekBackIncrementChanged(j10);
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, D1.z.d
    public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j10) {
        super.onSeekForwardIncrementChanged(j10);
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, D1.z.d
    public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z10) {
        super.onShuffleModeEnabledChanged(z10);
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, D1.z.d
    public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z10) {
        super.onSkipSilenceEnabledChanged(z10);
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, D1.z.d
    public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i10, int i11) {
        super.onSurfaceSizeChanged(i10, i11);
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, D1.z.d
    public /* bridge */ /* synthetic */ void onTimelineChanged(D d10, int i10) {
        super.onTimelineChanged(d10, i10);
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, D1.z.d
    public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(F f10) {
        super.onTrackSelectionParametersChanged(f10);
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, D1.z.d
    public /* bridge */ /* synthetic */ void onTracksChanged(G g10) {
        super.onTracksChanged(g10);
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, D1.z.d
    public /* bridge */ /* synthetic */ void onVideoSizeChanged(K k10) {
        super.onVideoSizeChanged(k10);
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, D1.z.d
    public /* bridge */ /* synthetic */ void onVolumeChanged(float f10) {
        super.onVolumeChanged(f10);
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener
    public void sendInitialized() {
        K kX0 = this.exoPlayer.x0();
        ExoPlayerEventListener.RotationDegrees rotationDegreesFromDegrees = ExoPlayerEventListener.RotationDegrees.ROTATE_0;
        int i10 = kX0.f1622a;
        int i11 = kX0.f1623b;
        if (i10 != 0 && i11 != 0 && !this.surfaceProducerHandlesCropAndRotation) {
            try {
                rotationDegreesFromDegrees = ExoPlayerEventListener.RotationDegrees.fromDegrees(getRotationCorrectionFromFormat(this.exoPlayer));
            } catch (IllegalArgumentException unused) {
                rotationDegreesFromDegrees = ExoPlayerEventListener.RotationDegrees.ROTATE_0;
            }
        }
        this.events.onInitialized(i10, i11, this.exoPlayer.getDuration(), rotationDegreesFromDegrees.getDegrees());
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, D1.z.d
    @Deprecated
    public /* bridge */ /* synthetic */ void onCues(List list) {
        super.onCues(list);
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, D1.z.d
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(z.e eVar, z.e eVar2, int i10) {
        super.onPositionDiscontinuity(eVar, eVar2, i10);
    }
}
