package io.flutter.plugins.videoplayer;

import D1.C0744b;
import D1.C0752j;
import D1.D;
import D1.F;
import D1.G;
import D1.K;
import D1.x;
import D1.y;
import D1.z;
import K1.InterfaceC1032y;
import T1.r;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class ExoPlayerEventListener implements z.d {
    protected final VideoPlayerCallbacks events;
    protected final InterfaceC1032y exoPlayer;
    private boolean isInitialized = false;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum RotationDegrees {
        ROTATE_0(0),
        ROTATE_90(90),
        ROTATE_180(180),
        ROTATE_270(270);

        private final int degrees;

        RotationDegrees(int i10) {
            this.degrees = i10;
        }

        public static RotationDegrees fromDegrees(int i10) {
            for (RotationDegrees rotationDegrees : values()) {
                if (rotationDegrees.degrees == i10) {
                    return rotationDegrees;
                }
            }
            throw new IllegalArgumentException("Invalid rotation degrees specified: " + i10);
        }

        public int getDegrees() {
            return this.degrees;
        }
    }

    public ExoPlayerEventListener(InterfaceC1032y interfaceC1032y, VideoPlayerCallbacks videoPlayerCallbacks) {
        this.exoPlayer = interfaceC1032y;
        this.events = videoPlayerCallbacks;
    }

    private String getCodecErrorMessage(x xVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Video codec not supported on this device. ");
        Throwable cause = xVar.getCause();
        if (cause instanceof r.c) {
            r.c cVar = (r.c) cause;
            if (cVar.f16046c != null) {
                sb2.append("Failed codec: ");
                sb2.append(cVar.f16046c.f15959a);
                sb2.append(". ");
            }
            if (cVar.f16044a != null) {
                sb2.append("MIME type: ");
                sb2.append(cVar.f16044a);
                sb2.append(". ");
            }
        }
        sb2.append("Try using a different video format or device.");
        return sb2.toString();
    }

    private boolean isCodecError(x xVar) {
        if (xVar.getCause() instanceof r.c) {
            return true;
        }
        if (xVar.getMessage() != null) {
            return xVar.getMessage().contains("MediaCodecVideoRenderer") || xVar.getMessage().contains("codec") || xVar.getMessage().contains("Decoder init failed");
        }
        return false;
    }

    @Override // D1.z.d
    public /* bridge */ /* synthetic */ void onAudioAttributesChanged(C0744b c0744b) {
        super.onAudioAttributesChanged(c0744b);
    }

    @Override // D1.z.d
    public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i10) {
        super.onAudioSessionIdChanged(i10);
    }

    @Override // D1.z.d
    public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(z.b bVar) {
        super.onAvailableCommandsChanged(bVar);
    }

    @Override // D1.z.d
    public /* bridge */ /* synthetic */ void onCues(F1.c cVar) {
        super.onCues(cVar);
    }

    @Override // D1.z.d
    public /* bridge */ /* synthetic */ void onDeviceInfoChanged(C0752j c0752j) {
        super.onDeviceInfoChanged(c0752j);
    }

    @Override // D1.z.d
    public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i10, boolean z10) {
        super.onDeviceVolumeChanged(i10, z10);
    }

    @Override // D1.z.d
    public /* bridge */ /* synthetic */ void onEvents(z zVar, z.c cVar) {
        super.onEvents(zVar, cVar);
    }

    @Override // D1.z.d
    public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z10) {
        super.onIsLoadingChanged(z10);
    }

    @Override // D1.z.d
    public void onIsPlayingChanged(boolean z10) {
        this.events.onIsPlayingStateUpdate(z10);
    }

    @Override // D1.z.d
    @Deprecated
    public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z10) {
        super.onLoadingChanged(z10);
    }

    @Override // D1.z.d
    public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j10) {
        super.onMaxSeekToPreviousPositionChanged(j10);
    }

    @Override // D1.z.d
    public /* bridge */ /* synthetic */ void onMediaItemTransition(D1.r rVar, int i10) {
        super.onMediaItemTransition(rVar, i10);
    }

    @Override // D1.z.d
    public /* bridge */ /* synthetic */ void onMediaMetadataChanged(D1.t tVar) {
        super.onMediaMetadataChanged(tVar);
    }

    @Override // D1.z.d
    public /* bridge */ /* synthetic */ void onMetadata(D1.u uVar) {
        super.onMetadata(uVar);
    }

    @Override // D1.z.d
    public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z10, int i10) {
        super.onPlayWhenReadyChanged(z10, i10);
    }

    @Override // D1.z.d
    public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(y yVar) {
        super.onPlaybackParametersChanged(yVar);
    }

    @Override // D1.z.d
    public void onPlaybackStateChanged(int i10) {
        PlatformPlaybackState platformPlaybackState = PlatformPlaybackState.UNKNOWN;
        if (i10 == 1) {
            platformPlaybackState = PlatformPlaybackState.IDLE;
        } else if (i10 == 2) {
            platformPlaybackState = PlatformPlaybackState.BUFFERING;
        } else if (i10 == 3) {
            platformPlaybackState = PlatformPlaybackState.READY;
            if (!this.isInitialized) {
                this.isInitialized = true;
                sendInitialized();
            }
        } else if (i10 == 4) {
            platformPlaybackState = PlatformPlaybackState.ENDED;
        }
        this.events.onPlaybackStateChanged(platformPlaybackState);
    }

    @Override // D1.z.d
    public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i10) {
        super.onPlaybackSuppressionReasonChanged(i10);
    }

    @Override // D1.z.d
    public void onPlayerError(x xVar) {
        if (xVar.f2113a == 1002) {
            this.exoPlayer.i0();
            this.exoPlayer.u();
        } else {
            if (isCodecError(xVar)) {
                this.events.onError("CodecError", getCodecErrorMessage(xVar), null);
                return;
            }
            this.events.onError("VideoError", "Video player had error " + xVar, null);
        }
    }

    @Override // D1.z.d
    public /* bridge */ /* synthetic */ void onPlayerErrorChanged(x xVar) {
        super.onPlayerErrorChanged(xVar);
    }

    @Override // D1.z.d
    @Deprecated
    public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z10, int i10) {
        super.onPlayerStateChanged(z10, i10);
    }

    @Override // D1.z.d
    public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(D1.t tVar) {
        super.onPlaylistMetadataChanged(tVar);
    }

    @Override // D1.z.d
    @Deprecated
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i10) {
        super.onPositionDiscontinuity(i10);
    }

    @Override // D1.z.d
    public /* bridge */ /* synthetic */ void onRenderedFirstFrame() {
        super.onRenderedFirstFrame();
    }

    @Override // D1.z.d
    public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i10) {
        super.onRepeatModeChanged(i10);
    }

    @Override // D1.z.d
    public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j10) {
        super.onSeekBackIncrementChanged(j10);
    }

    @Override // D1.z.d
    public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j10) {
        super.onSeekForwardIncrementChanged(j10);
    }

    @Override // D1.z.d
    public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z10) {
        super.onShuffleModeEnabledChanged(z10);
    }

    @Override // D1.z.d
    public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z10) {
        super.onSkipSilenceEnabledChanged(z10);
    }

    @Override // D1.z.d
    public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i10, int i11) {
        super.onSurfaceSizeChanged(i10, i11);
    }

    @Override // D1.z.d
    public /* bridge */ /* synthetic */ void onTimelineChanged(D d10, int i10) {
        super.onTimelineChanged(d10, i10);
    }

    @Override // D1.z.d
    public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(F f10) {
        super.onTrackSelectionParametersChanged(f10);
    }

    @Override // D1.z.d
    public /* bridge */ /* synthetic */ void onTracksChanged(G g10) {
        super.onTracksChanged(g10);
    }

    @Override // D1.z.d
    public /* bridge */ /* synthetic */ void onVideoSizeChanged(K k10) {
        super.onVideoSizeChanged(k10);
    }

    @Override // D1.z.d
    public /* bridge */ /* synthetic */ void onVolumeChanged(float f10) {
        super.onVolumeChanged(f10);
    }

    public abstract void sendInitialized();

    @Override // D1.z.d
    @Deprecated
    public /* bridge */ /* synthetic */ void onCues(List list) {
        super.onCues(list);
    }

    @Override // D1.z.d
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(z.e eVar, z.e eVar2, int i10) {
        super.onPositionDiscontinuity(eVar, eVar2, i10);
    }
}
