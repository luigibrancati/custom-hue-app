package com.cloudwebrtc.webrtc;

import android.util.Log;
import com.cloudwebrtc.webrtc.utils.AnyThreadSink;
import com.cloudwebrtc.webrtc.utils.ConstraintsMap;
import com.cloudwebrtc.webrtc.utils.EglUtils;
import io.flutter.plugin.common.EventChannel;
import io.flutter.view.TextureRegistry;
import java.util.List;
import org.webrtc.EglBase;
import org.webrtc.MediaStream;
import org.webrtc.RendererCommon;
import org.webrtc.VideoTrack;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class FlutterRTCVideoRenderer implements EventChannel.StreamHandler {
    private static final String TAG = "FlutterWebRTCPlugin";
    EventChannel eventChannel;
    EventChannel.EventSink eventSink;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f28769id = -1;
    private MediaStream mediaStream;
    private String ownerTag;
    private final TextureRegistry.SurfaceProducer producer;
    private RendererCommon.RendererEvents rendererEvents;
    private final SurfaceTextureRenderer surfaceTextureRenderer;
    private VideoTrack videoTrack;

    public FlutterRTCVideoRenderer(TextureRegistry.SurfaceProducer surfaceProducer) {
        SurfaceTextureRenderer surfaceTextureRenderer = new SurfaceTextureRenderer("");
        this.surfaceTextureRenderer = surfaceTextureRenderer;
        listenRendererEvents();
        surfaceTextureRenderer.init(EglUtils.getRootEglBaseContext(), this.rendererEvents);
        surfaceTextureRenderer.surfaceCreated(surfaceProducer);
        this.eventSink = null;
        this.producer = surfaceProducer;
        this.ownerTag = null;
    }

    private void listenRendererEvents() {
        this.rendererEvents = new RendererCommon.RendererEvents() { // from class: com.cloudwebrtc.webrtc.FlutterRTCVideoRenderer.1
            private int _rotation = -1;
            private int _width = 0;
            private int _height = 0;

            @Override // org.webrtc.RendererCommon.RendererEvents
            public void onFirstFrameRendered() {
                ConstraintsMap constraintsMap = new ConstraintsMap();
                constraintsMap.putString("event", "didFirstFrameRendered");
                constraintsMap.putInt("id", FlutterRTCVideoRenderer.this.f28769id);
                EventChannel.EventSink eventSink = FlutterRTCVideoRenderer.this.eventSink;
                if (eventSink != null) {
                    eventSink.success(constraintsMap.toMap());
                }
            }

            @Override // org.webrtc.RendererCommon.RendererEvents
            public void onFrameResolutionChanged(int i10, int i11, int i12) {
                if (FlutterRTCVideoRenderer.this.eventSink != null) {
                    if (this._width != i10 || this._height != i11) {
                        ConstraintsMap constraintsMap = new ConstraintsMap();
                        constraintsMap.putString("event", "didTextureChangeVideoSize");
                        constraintsMap.putInt("id", FlutterRTCVideoRenderer.this.f28769id);
                        constraintsMap.putDouble("width", i10);
                        constraintsMap.putDouble("height", i11);
                        this._width = i10;
                        this._height = i11;
                        FlutterRTCVideoRenderer.this.eventSink.success(constraintsMap.toMap());
                    }
                    if (this._rotation != i12) {
                        ConstraintsMap constraintsMap2 = new ConstraintsMap();
                        constraintsMap2.putString("event", "didTextureChangeRotation");
                        constraintsMap2.putInt("id", FlutterRTCVideoRenderer.this.f28769id);
                        constraintsMap2.putInt("rotation", i12);
                        this._rotation = i12;
                        FlutterRTCVideoRenderer.this.eventSink.success(constraintsMap2.toMap());
                    }
                }
            }
        };
    }

    private void removeRendererFromVideoTrack() {
        this.videoTrack.removeSink(this.surfaceTextureRenderer);
    }

    private void tryAddRendererToVideoTrack() {
        if (this.videoTrack != null) {
            EglBase.Context rootEglBaseContext = EglUtils.getRootEglBaseContext();
            if (rootEglBaseContext == null) {
                Log.e("FlutterWebRTCPlugin", "Failed to render a VideoTrack!");
                return;
            }
            this.surfaceTextureRenderer.release();
            listenRendererEvents();
            this.surfaceTextureRenderer.init(rootEglBaseContext, this.rendererEvents);
            this.surfaceTextureRenderer.surfaceCreated(this.producer);
            this.videoTrack.addSink(this.surfaceTextureRenderer);
        }
    }

    public void Dispose() {
        SurfaceTextureRenderer surfaceTextureRenderer = this.surfaceTextureRenderer;
        if (surfaceTextureRenderer != null) {
            surfaceTextureRenderer.release();
        }
        EventChannel eventChannel = this.eventChannel;
        if (eventChannel != null) {
            eventChannel.setStreamHandler(null);
        }
        this.eventSink = null;
        this.producer.release();
    }

    public boolean checkMediaStream(String str, String str2) {
        if (str == null || this.mediaStream == null || str2 == null || !str2.equals(this.ownerTag)) {
            return false;
        }
        return str.equals(this.mediaStream.getId());
    }

    public boolean checkVideoTrack(String str, String str2) {
        if (str == null || this.videoTrack == null || str2 == null || !str2.equals(this.ownerTag)) {
            return false;
        }
        return str.equals(this.videoTrack.id());
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        this.eventSink = null;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        this.eventSink = new AnyThreadSink(eventSink);
    }

    public void setEventChannel(EventChannel eventChannel) {
        this.eventChannel = eventChannel;
    }

    public void setId(int i10) {
        this.f28769id = i10;
    }

    public void setStream(MediaStream mediaStream, String str) {
        this.mediaStream = mediaStream;
        this.ownerTag = str;
        VideoTrack videoTrack = null;
        if (mediaStream != null) {
            List<VideoTrack> list = mediaStream.videoTracks;
            if (!list.isEmpty()) {
                videoTrack = list.get(0);
            }
        }
        setVideoTrack(videoTrack);
    }

    public void setVideoTrack(VideoTrack videoTrack) {
        VideoTrack videoTrack2 = this.videoTrack;
        if (videoTrack2 != videoTrack) {
            if (videoTrack2 != null) {
                removeRendererFromVideoTrack();
            }
            this.videoTrack = videoTrack;
            if (videoTrack == null) {
                Log.w("FlutterWebRTCPlugin", "FlutterRTCVideoRenderer.setVideoTrack, set video track to null");
                return;
            }
            try {
                Log.w("FlutterWebRTCPlugin", "FlutterRTCVideoRenderer.setVideoTrack, set video track to " + videoTrack.id());
                tryAddRendererToVideoTrack();
            } catch (Exception e10) {
                Log.e("FlutterWebRTCPlugin", "tryAddRendererToVideoTrack " + e10);
            }
        }
    }

    public void setStream(MediaStream mediaStream, String str, String str2) {
        this.mediaStream = mediaStream;
        this.ownerTag = str2;
        if (mediaStream != null) {
            List<VideoTrack> list = mediaStream.videoTracks;
            videoTrack = list.isEmpty() ? null : list.get(0);
            for (VideoTrack videoTrack : list) {
                if (videoTrack.id().equals(str)) {
                    videoTrack = videoTrack;
                }
            }
        }
        setVideoTrack(videoTrack);
    }
}
