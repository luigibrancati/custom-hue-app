package com.cloudwebrtc.webrtc;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.hardware.camera2.CameraManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import com.cloudwebrtc.webrtc.audio.AudioSwitchManager;
import com.cloudwebrtc.webrtc.audio.AudioUtils;
import com.cloudwebrtc.webrtc.audio.LocalAudioTrack;
import com.cloudwebrtc.webrtc.record.AudioChannel;
import com.cloudwebrtc.webrtc.record.AudioSamplesInterceptor;
import com.cloudwebrtc.webrtc.record.MediaRecorderImpl;
import com.cloudwebrtc.webrtc.record.OutputAudioSamplesInterceptor;
import com.cloudwebrtc.webrtc.utils.Callback;
import com.cloudwebrtc.webrtc.utils.ConstraintsArray;
import com.cloudwebrtc.webrtc.utils.ConstraintsMap;
import com.cloudwebrtc.webrtc.utils.EglUtils;
import com.cloudwebrtc.webrtc.utils.MediaConstraintsUtils;
import com.cloudwebrtc.webrtc.utils.ObjectType;
import com.cloudwebrtc.webrtc.utils.PermissionUtils;
import com.cloudwebrtc.webrtc.video.LocalVideoTrack;
import com.cloudwebrtc.webrtc.video.VideoCapturerInfo;
import io.flutter.plugin.common.MethodChannel;
import io.sentry.SentryBaseEvent;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.webrtc.AudioTrack;
import org.webrtc.Camera1Capturer;
import org.webrtc.Camera1Enumerator;
import org.webrtc.Camera1Helper;
import org.webrtc.Camera2Capturer;
import org.webrtc.Camera2Enumerator;
import org.webrtc.Camera2Helper;
import org.webrtc.CameraEnumerator;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.MediaConstraints;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.Size;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoCapturer;
import org.webrtc.VideoSource;
import org.webrtc.VideoTrack;
import org.webrtc.audio.JavaAudioDeviceModule;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class GetUserMediaImpl {
    private static final int CAPTURE_PERMISSION_REQUEST_CODE = 1;
    private static final int DEFAULT_FPS = 30;
    private static final int DEFAULT_HEIGHT = 720;
    private static final int DEFAULT_WIDTH = 1280;
    private static final String GRANT_RESULTS = "GRANT_RESULT";
    private static final String PERMISSIONS = "PERMISSION";
    private static final String PERMISSION_AUDIO = "android.permission.RECORD_AUDIO";
    private static final String PERMISSION_SCREEN = "android.permission.MediaProjection";
    private static final String PERMISSION_VIDEO = "android.permission.CAMERA";
    private static final String PROJECTION_DATA = "PROJECTION_DATA";
    private static final String REQUEST_CODE = "REQUEST_CODE";
    private static final String RESULT_RECEIVER = "RESULT_RECEIVER";
    static final String TAG = "FlutterWebRTCPlugin";
    static final int minAPILevel = 21;
    private final Context applicationContext;
    JavaAudioDeviceModule audioDeviceModule;
    private boolean isTorchOn;
    private final StateProvider stateProvider;
    private final Map<String, VideoCapturerInfoEx> mVideoCapturers = new HashMap();
    private final Map<String, SurfaceTextureHelper> mSurfaceTextureHelpers = new HashMap();
    final AudioSamplesInterceptor inputSamplesInterceptor = new AudioSamplesInterceptor();
    private OutputAudioSamplesInterceptor outputSamplesInterceptor = null;
    private final SparseArray<MediaRecorderImpl> mediaRecorders = new SparseArray<>();
    private AudioDeviceInfo preferredInput = null;
    private Intent mediaProjectionData = null;
    private boolean isFacing = true;

    /* JADX INFO: renamed from: com.cloudwebrtc.webrtc.GetUserMediaImpl$7, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class AnonymousClass7 {
        static final /* synthetic */ int[] $SwitchMap$com$cloudwebrtc$webrtc$utils$ObjectType;

        static {
            int[] iArr = new int[ObjectType.values().length];
            $SwitchMap$com$cloudwebrtc$webrtc$utils$ObjectType = iArr;
            try {
                iArr[ObjectType.Boolean.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$cloudwebrtc$webrtc$utils$ObjectType[ObjectType.Map.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface IsCameraEnabled {
        boolean isEnabled(String str);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class ScreenRequestPermissionsFragment extends Fragment {
        private ResultReceiver resultReceiver = null;
        private int requestCode = 0;
        private final int resultCode = 0;

        private void checkSelfPermissions(boolean z10) {
            Activity activity = getActivity();
            Bundle arguments = getArguments();
            this.resultReceiver = (ResultReceiver) arguments.getParcelable(GetUserMediaImpl.RESULT_RECEIVER);
            int i10 = arguments.getInt(GetUserMediaImpl.REQUEST_CODE);
            this.requestCode = i10;
            requestStart(activity, i10);
        }

        private void finish() {
            Activity activity = getActivity();
            if (activity != null) {
                activity.getFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
            }
        }

        @Override // android.app.Fragment
        public void onActivityResult(int i10, int i11, Intent intent) {
            super.onActivityResult(i10, i11, intent);
            if (i11 != -1) {
                finish();
                Bundle bundle = new Bundle();
                bundle.putString(GetUserMediaImpl.PERMISSIONS, GetUserMediaImpl.PERMISSION_SCREEN);
                bundle.putInt(GetUserMediaImpl.GRANT_RESULTS, i11);
                this.resultReceiver.send(i10, bundle);
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString(GetUserMediaImpl.PERMISSIONS, GetUserMediaImpl.PERMISSION_SCREEN);
            bundle2.putInt(GetUserMediaImpl.GRANT_RESULTS, i11);
            bundle2.putParcelable(GetUserMediaImpl.PROJECTION_DATA, intent);
            this.resultReceiver.send(i10, bundle2);
            finish();
        }

        @Override // android.app.Fragment
        public void onResume() {
            super.onResume();
            checkSelfPermissions(true);
        }

        public void requestStart(Activity activity, int i10) {
            startActivityForResult(((MediaProjectionManager) activity.getSystemService("media_projection")).createScreenCaptureIntent(), i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class VideoCapturerInfoEx extends VideoCapturerInfo {
        public CameraEventsHandler cameraEventsHandler;
    }

    public GetUserMediaImpl(StateProvider stateProvider, Context context) {
        this.stateProvider = stateProvider;
        this.applicationContext = context;
    }

    public static /* synthetic */ void a(GetUserMediaImpl getUserMediaImpl, Integer num, Runnable runnable) {
        getUserMediaImpl.mediaRecorders.remove(num.intValue());
        runnable.run();
    }

    private void addDefaultAudioConstraints(MediaConstraints mediaConstraints) {
        mediaConstraints.optional.add(new MediaConstraints.KeyValuePair("googNoiseSuppression", "true"));
        mediaConstraints.optional.add(new MediaConstraints.KeyValuePair("googEchoCancellation", "true"));
        mediaConstraints.optional.add(new MediaConstraints.KeyValuePair("echoCancellation", "true"));
        mediaConstraints.optional.add(new MediaConstraints.KeyValuePair("googEchoCancellation2", "true"));
        mediaConstraints.optional.add(new MediaConstraints.KeyValuePair("googDAEchoCancellation", "true"));
    }

    public static /* synthetic */ void b(ArrayList arrayList, Callback callback, Callback callback2, String[] strArr, int[] iArr) {
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i10 = 0; i10 < strArr.length; i10++) {
            String str = strArr[i10];
            if (iArr[i10] == 0) {
                arrayList2.add(str);
            } else {
                arrayList3.add(str);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!arrayList2.contains((String) it.next())) {
                callback.invoke(arrayList3);
                return;
            }
        }
        callback2.invoke(arrayList2);
    }

    private Pair<String, VideoCapturer> createVideoCapturer(CameraEnumerator cameraEnumerator, boolean z10, String str, CameraEventsHandler cameraEventsHandler) {
        String[] deviceNames = cameraEnumerator.getDeviceNames();
        if (str != null && !str.equals("")) {
            int length = deviceNames.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                String str2 = deviceNames[i10];
                if (str2.equals(str)) {
                    CameraVideoCapturer cameraVideoCapturerCreateCapturer = cameraEnumerator.createCapturer(str2, cameraEventsHandler);
                    if (cameraVideoCapturerCreateCapturer != null) {
                        Log.d("FlutterWebRTCPlugin", "create user specified camera " + str2 + " succeeded");
                        return new Pair<>(str2, cameraVideoCapturerCreateCapturer);
                    }
                    Log.d("FlutterWebRTCPlugin", "create user specified camera " + str2 + " failed");
                } else {
                    i10++;
                }
            }
        }
        String str3 = z10 ? "front" : "back";
        for (String str4 : deviceNames) {
            if (cameraEnumerator.isFrontFacing(str4) == z10) {
                CameraVideoCapturer cameraVideoCapturerCreateCapturer2 = cameraEnumerator.createCapturer(str4, cameraEventsHandler);
                if (cameraVideoCapturerCreateCapturer2 != null) {
                    Log.d("FlutterWebRTCPlugin", "Create " + str3 + " camera " + str4 + " succeeded");
                    return new Pair<>(str4, cameraVideoCapturerCreateCapturer2);
                }
                Log.e("FlutterWebRTCPlugin", "Create " + str3 + " camera " + str4 + " failed");
            }
        }
        if (deviceNames.length <= 0) {
            return null;
        }
        CameraVideoCapturer cameraVideoCapturerCreateCapturer3 = cameraEnumerator.createCapturer(deviceNames[0], cameraEventsHandler);
        Log.d("FlutterWebRTCPlugin", "Falling back to the first available camera");
        return new Pair<>(deviceNames[0], cameraVideoCapturerCreateCapturer3);
    }

    private Integer getConstrainInt(ConstraintsMap constraintsMap, String str) {
        if (constraintsMap == null) {
            return null;
        }
        ObjectType type = constraintsMap.getType(str);
        ObjectType objectType = ObjectType.Number;
        if (type == objectType) {
            try {
                return Integer.valueOf(constraintsMap.getInt(str));
            } catch (Exception unused) {
                return Integer.valueOf((int) Math.round(constraintsMap.getDouble(str)));
            }
        }
        if (constraintsMap.getType(str) == ObjectType.String) {
            try {
                return Integer.valueOf(Integer.parseInt(constraintsMap.getString(str)));
            } catch (Exception unused2) {
                return Integer.valueOf((int) Math.round(Double.parseDouble(constraintsMap.getString(str))));
            }
        }
        if (constraintsMap.getType(str) != ObjectType.Map) {
            return null;
        }
        ConstraintsMap map = constraintsMap.getMap(str);
        if (constraintsMap.getType("ideal") == objectType) {
            return Integer.valueOf(map.getInt("ideal"));
        }
        return null;
    }

    private String getFacingMode(ConstraintsMap constraintsMap) {
        if (constraintsMap == null) {
            return null;
        }
        return constraintsMap.getString("facingMode");
    }

    private String getSourceIdConstraint(ConstraintsMap constraintsMap) {
        if (constraintsMap != null && constraintsMap.hasKey("deviceId")) {
            return constraintsMap.getString("deviceId");
        }
        if (constraintsMap == null || !constraintsMap.hasKey("optional") || constraintsMap.getType("optional") != ObjectType.Array) {
            return null;
        }
        ConstraintsArray array = constraintsMap.getArray("optional");
        int size = array.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (array.getType(i10) == ObjectType.Map) {
                ConstraintsMap map = array.getMap(i10);
                if (map.hasKey("sourceId") && map.getType("sourceId") == ObjectType.String) {
                    return map.getString("sourceId");
                }
            }
        }
        return null;
    }

    private ConstraintsMap getUserAudio(ConstraintsMap constraintsMap, MediaStream mediaStream) {
        String sourceIdConstraint;
        AudioSwitchManager.instance.start();
        MediaConstraints mediaConstraints = new MediaConstraints();
        if (constraintsMap.getType(MediaStreamTrack.AUDIO_TRACK_KIND) == ObjectType.Boolean) {
            addDefaultAudioConstraints(mediaConstraints);
            sourceIdConstraint = null;
        } else {
            mediaConstraints = MediaConstraintsUtils.parseMediaConstraints(constraintsMap.getMap(MediaStreamTrack.AUDIO_TRACK_KIND));
            sourceIdConstraint = getSourceIdConstraint(constraintsMap.getMap(MediaStreamTrack.AUDIO_TRACK_KIND));
        }
        Log.i("FlutterWebRTCPlugin", "getUserMedia(audio): " + mediaConstraints);
        String nextTrackUUID = this.stateProvider.getNextTrackUUID();
        PeerConnectionFactory peerConnectionFactory = this.stateProvider.getPeerConnectionFactory();
        AudioTrack audioTrackCreateAudioTrack = peerConnectionFactory.createAudioTrack(nextTrackUUID, peerConnectionFactory.createAudioSource(mediaConstraints));
        mediaStream.addTrack(audioTrackCreateAudioTrack);
        this.stateProvider.putLocalTrack(audioTrackCreateAudioTrack.id(), new LocalAudioTrack(audioTrackCreateAudioTrack));
        ConstraintsMap constraintsMap2 = new ConstraintsMap();
        constraintsMap2.putBoolean("enabled", audioTrackCreateAudioTrack.enabled());
        constraintsMap2.putString("id", audioTrackCreateAudioTrack.id());
        constraintsMap2.putString("kind", MediaStreamTrack.AUDIO_TRACK_KIND);
        constraintsMap2.putString("label", audioTrackCreateAudioTrack.id());
        constraintsMap2.putString("readyState", audioTrackCreateAudioTrack.state().toString());
        constraintsMap2.putBoolean("remote", false);
        if (sourceIdConstraint == null) {
            sourceIdConstraint = "" + getPreferredInputDevice(this.preferredInput);
        }
        ConstraintsMap constraintsMap3 = new ConstraintsMap();
        constraintsMap3.putString("deviceId", sourceIdConstraint);
        constraintsMap3.putString("kind", "audioinput");
        constraintsMap3.putBoolean("autoGainControl", true);
        constraintsMap3.putBoolean("echoCancellation", true);
        constraintsMap3.putBoolean("noiseSuppression", true);
        constraintsMap3.putInt("channelCount", 1);
        constraintsMap3.putInt("latency", 0);
        constraintsMap2.putMap("settings", constraintsMap3.toMap());
        return constraintsMap2;
    }

    private ConstraintsMap getUserVideo(ConstraintsMap constraintsMap, MediaStream mediaStream) {
        ConstraintsMap map;
        ConstraintsMap map2;
        CameraEnumerator camera1Enumerator;
        String str;
        int i10;
        String str2;
        Size sizeFindClosestCaptureFormat;
        ObjectType type = constraintsMap.getType("video");
        ObjectType objectType = ObjectType.Map;
        if (type == objectType) {
            map = constraintsMap.getMap("video");
            map2 = (map.hasKey("mandatory") && map.getType("mandatory") == objectType) ? map.getMap("mandatory") : null;
        } else {
            map = null;
            map2 = null;
        }
        Log.i("FlutterWebRTCPlugin", "getUserMedia(video): " + map);
        if (Camera2Enumerator.isSupported(this.applicationContext)) {
            Log.d("FlutterWebRTCPlugin", "Creating video capturer using Camera2 API.");
            camera1Enumerator = new Camera2Enumerator(this.applicationContext);
        } else {
            Log.d("FlutterWebRTCPlugin", "Creating video capturer using Camera1 API.");
            camera1Enumerator = new Camera1Enumerator(false);
        }
        String facingMode = getFacingMode(map);
        this.isFacing = facingMode == null || !facingMode.equals("environment");
        String sourceIdConstraint = getSourceIdConstraint(map);
        CameraEventsHandler cameraEventsHandler = new CameraEventsHandler();
        Pair<String, VideoCapturer> pairCreateVideoCapturer = createVideoCapturer(camera1Enumerator, this.isFacing, sourceIdConstraint, cameraEventsHandler);
        if (pairCreateVideoCapturer == null) {
            return null;
        }
        String str3 = (String) pairCreateVideoCapturer.first;
        VideoCapturer videoCapturer = (VideoCapturer) pairCreateVideoCapturer.second;
        if (facingMode == null && camera1Enumerator.isFrontFacing(str3)) {
            facingMode = SentryBaseEvent.JsonKeys.USER;
        } else if (facingMode == null && camera1Enumerator.isBackFacing(str3)) {
            facingMode = "environment";
        }
        PeerConnectionFactory peerConnectionFactory = this.stateProvider.getPeerConnectionFactory();
        VideoSource videoSourceCreateVideoSource = peerConnectionFactory.createVideoSource(false);
        SurfaceTextureHelper surfaceTextureHelperCreate = SurfaceTextureHelper.create(Thread.currentThread().getName() + "_texture_camera_thread", EglUtils.getRootEglBaseContext());
        if (surfaceTextureHelperCreate == null) {
            Log.e("FlutterWebRTCPlugin", "surfaceTextureHelper is null");
            return null;
        }
        videoCapturer.initialize(surfaceTextureHelperCreate, this.applicationContext, videoSourceCreateVideoSource.getCapturerObserver());
        VideoCapturerInfoEx videoCapturerInfoEx = new VideoCapturerInfoEx();
        Integer constrainInt = getConstrainInt(map, "width");
        int iIntValue = constrainInt != null ? constrainInt.intValue() : (map2 == null || !map2.hasKey("minWidth")) ? 1280 : map2.getInt("minWidth");
        Integer constrainInt2 = getConstrainInt(map, "height");
        if (constrainInt2 != null) {
            int iIntValue2 = constrainInt2.intValue();
            str = facingMode;
            i10 = iIntValue2;
        } else {
            str = facingMode;
            i10 = (map2 == null || !map2.hasKey("minHeight")) ? DEFAULT_HEIGHT : map2.getInt("minHeight");
        }
        Integer constrainInt3 = getConstrainInt(map, RRWebVideoEvent.JsonKeys.FRAME_RATE);
        int iIntValue3 = constrainInt3 != null ? constrainInt3.intValue() : (map2 == null || !map2.hasKey("minFrameRate")) ? 30 : map2.getInt("minFrameRate");
        videoCapturerInfoEx.width = iIntValue;
        videoCapturerInfoEx.height = i10;
        videoCapturerInfoEx.fps = iIntValue3;
        videoCapturerInfoEx.capturer = videoCapturer;
        videoCapturerInfoEx.cameraName = str3;
        if (videoCapturer instanceof Camera1Capturer) {
            sizeFindClosestCaptureFormat = Camera1Helper.findClosestCaptureFormat(Camera1Helper.getCameraId(str3), iIntValue, i10);
            str2 = RRWebVideoEvent.JsonKeys.FRAME_RATE;
        } else if (videoCapturer instanceof Camera2Capturer) {
            Context context = this.applicationContext;
            str2 = RRWebVideoEvent.JsonKeys.FRAME_RATE;
            sizeFindClosestCaptureFormat = Camera2Helper.findClosestCaptureFormat((CameraManager) context.getSystemService("camera"), str3, iIntValue, i10);
        } else {
            str2 = RRWebVideoEvent.JsonKeys.FRAME_RATE;
            sizeFindClosestCaptureFormat = null;
        }
        if (sizeFindClosestCaptureFormat != null) {
            videoCapturerInfoEx.width = sizeFindClosestCaptureFormat.width;
            videoCapturerInfoEx.height = sizeFindClosestCaptureFormat.height;
        }
        videoCapturerInfoEx.cameraEventsHandler = cameraEventsHandler;
        videoCapturer.startCapture(iIntValue, i10, iIntValue3);
        cameraEventsHandler.waitForCameraOpen();
        String nextTrackUUID = this.stateProvider.getNextTrackUUID();
        this.mVideoCapturers.put(nextTrackUUID, videoCapturerInfoEx);
        this.mSurfaceTextureHelpers.put(nextTrackUUID, surfaceTextureHelperCreate);
        Log.d("FlutterWebRTCPlugin", "Target: " + iIntValue + "x" + i10 + "@" + iIntValue3 + ", Actual: " + videoCapturerInfoEx.width + "x" + videoCapturerInfoEx.height + "@" + videoCapturerInfoEx.fps);
        VideoTrack videoTrackCreateVideoTrack = peerConnectionFactory.createVideoTrack(nextTrackUUID, videoSourceCreateVideoSource);
        mediaStream.addTrack(videoTrackCreateVideoTrack);
        LocalVideoTrack localVideoTrack = new LocalVideoTrack(videoTrackCreateVideoTrack);
        videoSourceCreateVideoSource.setVideoProcessor(localVideoTrack);
        this.stateProvider.putLocalTrack(videoTrackCreateVideoTrack.id(), localVideoTrack);
        ConstraintsMap constraintsMap2 = new ConstraintsMap();
        constraintsMap2.putBoolean("enabled", videoTrackCreateVideoTrack.enabled());
        constraintsMap2.putString("id", videoTrackCreateVideoTrack.id());
        constraintsMap2.putString("kind", "video");
        constraintsMap2.putString("label", videoTrackCreateVideoTrack.id());
        constraintsMap2.putString("readyState", videoTrackCreateVideoTrack.state().toString());
        constraintsMap2.putBoolean("remote", false);
        ConstraintsMap constraintsMap3 = new ConstraintsMap();
        constraintsMap3.putString("deviceId", str3);
        constraintsMap3.putString("kind", "videoinput");
        constraintsMap3.putInt("width", videoCapturerInfoEx.width);
        constraintsMap3.putInt("height", videoCapturerInfoEx.height);
        constraintsMap3.putInt(str2, videoCapturerInfoEx.fps);
        if (str != null) {
            constraintsMap3.putString("facingMode", str);
        }
        constraintsMap2.putMap("settings", constraintsMap3.toMap());
        return constraintsMap2;
    }

    private void requestPermissions(final ArrayList<String> arrayList, final Callback callback, final Callback callback2) {
        PermissionUtils.Callback callback3 = new PermissionUtils.Callback() { // from class: com.cloudwebrtc.webrtc.b
            @Override // com.cloudwebrtc.webrtc.utils.PermissionUtils.Callback
            public final void invoke(String[] strArr, int[] iArr) {
                GetUserMediaImpl.b(arrayList, callback2, callback, strArr, iArr);
            }
        };
        PermissionUtils.requestPermissions(this.stateProvider.getApplicationContext(), this.stateProvider.getActivity(), (String[]) arrayList.toArray(new String[arrayList.size()]), callback3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void resultError(String str, String str2, MethodChannel.Result result) {
        String str3 = str + "(): " + str2;
        result.error(str, str3, null);
        Log.d("FlutterWebRTCPlugin", str3);
    }

    public VideoCapturerInfoEx getCapturerInfo(String str) {
        return this.mVideoCapturers.get(str);
    }

    public void getDisplayMedia(ConstraintsMap constraintsMap, final MethodChannel.Result result, final MediaStream mediaStream) {
        Intent intent = this.mediaProjectionData;
        if (intent == null) {
            screenRequestPermissions(new ResultReceiver(new Handler(Looper.getMainLooper())) { // from class: com.cloudwebrtc.webrtc.GetUserMediaImpl.4
                @Override // android.os.ResultReceiver
                public void onReceiveResult(int i10, Bundle bundle) {
                    Intent intent2 = (Intent) bundle.getParcelable(GetUserMediaImpl.PROJECTION_DATA);
                    if (bundle.getInt(GetUserMediaImpl.GRANT_RESULTS) != -1) {
                        GetUserMediaImpl.resultError("screenRequestPermissions", "User didn't give permission to capture the screen.", result);
                    } else {
                        GetUserMediaImpl.this.getDisplayMedia(result, mediaStream, intent2);
                    }
                }
            });
        } else {
            getDisplayMedia(result, mediaStream, intent);
        }
    }

    public int getPreferredInputDevice(AudioDeviceInfo audioDeviceInfo) {
        if (audioDeviceInfo == null) {
            return -1;
        }
        AudioDeviceInfo[] devices = ((AudioManager) this.applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)).getDevices(1);
        for (int i10 = 0; i10 < devices.length; i10++) {
            if (devices[i10].getId() == audioDeviceInfo.getId()) {
                return i10;
            }
        }
        return -1;
    }

    public void getUserMedia(final ConstraintsMap constraintsMap, final MethodChannel.Result result, final MediaStream mediaStream) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (constraintsMap.hasKey(MediaStreamTrack.AUDIO_TRACK_KIND)) {
            int i10 = AnonymousClass7.$SwitchMap$com$cloudwebrtc$webrtc$utils$ObjectType[constraintsMap.getType(MediaStreamTrack.AUDIO_TRACK_KIND).ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    arrayList.add(PERMISSION_AUDIO);
                }
            } else if (constraintsMap.getBoolean(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                arrayList.add(PERMISSION_AUDIO);
            }
        }
        if (constraintsMap.hasKey("video")) {
            int i11 = AnonymousClass7.$SwitchMap$com$cloudwebrtc$webrtc$utils$ObjectType[constraintsMap.getType("video").ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    arrayList.add(PERMISSION_VIDEO);
                }
            } else if (constraintsMap.getBoolean("video")) {
                arrayList.add(PERMISSION_VIDEO);
            }
        }
        if (arrayList.isEmpty()) {
            resultError("getUserMedia", "TypeError, constraints requests no media types", result);
        } else {
            requestPermissions(arrayList, new Callback() { // from class: com.cloudwebrtc.webrtc.GetUserMediaImpl.2
                @Override // com.cloudwebrtc.webrtc.utils.Callback
                public void invoke(Object... objArr) {
                    GetUserMediaImpl.this.getUserMedia(constraintsMap, result, mediaStream, (List) objArr[0]);
                }
            }, new Callback() { // from class: com.cloudwebrtc.webrtc.GetUserMediaImpl.3
                @Override // com.cloudwebrtc.webrtc.utils.Callback
                public void invoke(Object... objArr) {
                    GetUserMediaImpl.resultError("getUserMedia", "DOMException, NotAllowedError", result);
                }
            });
        }
    }

    public void reStartCamera(IsCameraEnabled isCameraEnabled) {
        for (Map.Entry<String, VideoCapturerInfoEx> entry : this.mVideoCapturers.entrySet()) {
            if (!entry.getValue().isScreenCapture && isCameraEnabled.isEnabled(entry.getKey())) {
                entry.getValue().capturer.startCapture(entry.getValue().width, entry.getValue().height, entry.getValue().fps);
            }
        }
    }

    public void removeVideoCapturer(String str) {
        VideoCapturerInfoEx videoCapturerInfoEx = this.mVideoCapturers.get(str);
        try {
            if (videoCapturerInfoEx != null) {
                try {
                    videoCapturerInfoEx.capturer.stopCapture();
                    CameraEventsHandler cameraEventsHandler = videoCapturerInfoEx.cameraEventsHandler;
                    if (cameraEventsHandler != null) {
                        cameraEventsHandler.waitForCameraClosed();
                    }
                    videoCapturerInfoEx.capturer.dispose();
                    this.mVideoCapturers.remove(str);
                    SurfaceTextureHelper surfaceTextureHelper = this.mSurfaceTextureHelpers.get(str);
                    if (surfaceTextureHelper != null) {
                        surfaceTextureHelper.stopListening();
                        surfaceTextureHelper.dispose();
                        this.mSurfaceTextureHelpers.remove(str);
                    }
                } catch (InterruptedException unused) {
                    Log.e("FlutterWebRTCPlugin", "removeVideoCapturer() Failed to stop video capturer");
                    videoCapturerInfoEx.capturer.dispose();
                    this.mVideoCapturers.remove(str);
                    SurfaceTextureHelper surfaceTextureHelper2 = this.mSurfaceTextureHelpers.get(str);
                    if (surfaceTextureHelper2 != null) {
                        surfaceTextureHelper2.stopListening();
                        surfaceTextureHelper2.dispose();
                        this.mSurfaceTextureHelpers.remove(str);
                    }
                }
            }
        } catch (Throwable th) {
            videoCapturerInfoEx.capturer.dispose();
            this.mVideoCapturers.remove(str);
            SurfaceTextureHelper surfaceTextureHelper3 = this.mSurfaceTextureHelpers.get(str);
            if (surfaceTextureHelper3 != null) {
                surfaceTextureHelper3.stopListening();
                surfaceTextureHelper3.dispose();
                this.mSurfaceTextureHelpers.remove(str);
            }
            throw th;
        }
    }

    public void requestCapturePermission(final MethodChannel.Result result) {
        screenRequestPermissions(new ResultReceiver(new Handler(Looper.getMainLooper())) { // from class: com.cloudwebrtc.webrtc.GetUserMediaImpl.1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i10, Bundle bundle) {
                if (bundle.getInt(GetUserMediaImpl.GRANT_RESULTS) != -1) {
                    result.success(Boolean.FALSE);
                    return;
                }
                GetUserMediaImpl.this.mediaProjectionData = (Intent) bundle.getParcelable(GetUserMediaImpl.PROJECTION_DATA);
                result.success(Boolean.TRUE);
            }
        });
    }

    public void screenRequestPermissions(ResultReceiver resultReceiver) {
        this.mediaProjectionData = null;
        Activity activity = this.stateProvider.getActivity();
        if (activity == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable(RESULT_RECEIVER, resultReceiver);
        bundle.putInt(REQUEST_CODE, 1);
        ScreenRequestPermissionsFragment screenRequestPermissionsFragment = new ScreenRequestPermissionsFragment();
        screenRequestPermissionsFragment.setArguments(bundle);
        try {
            activity.getFragmentManager().beginTransaction().add(screenRequestPermissionsFragment, ScreenRequestPermissionsFragment.class.getName()).commit();
        } catch (IllegalStateException unused) {
        }
    }

    public void setPreferredInputDevice(String str) {
        AudioDeviceInfo[] devices = ((AudioManager) this.applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)).getDevices(1);
        if (devices.length > 0) {
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (str.equals(AudioUtils.getAudioDeviceId(audioDeviceInfo))) {
                    this.preferredInput = audioDeviceInfo;
                    this.audioDeviceModule.setPreferredInputDevice(audioDeviceInfo);
                    return;
                }
            }
        }
    }

    public void startRecordingToFile(String str, Integer num, VideoTrack videoTrack, AudioChannel audioChannel) throws Exception {
        AudioSamplesInterceptor audioSamplesInterceptor;
        if (audioChannel == AudioChannel.INPUT) {
            audioSamplesInterceptor = this.inputSamplesInterceptor;
        } else if (audioChannel == AudioChannel.OUTPUT) {
            if (this.outputSamplesInterceptor == null) {
                this.outputSamplesInterceptor = new OutputAudioSamplesInterceptor(this.audioDeviceModule);
            }
            audioSamplesInterceptor = this.outputSamplesInterceptor;
        } else {
            audioSamplesInterceptor = null;
        }
        MediaRecorderImpl mediaRecorderImpl = new MediaRecorderImpl(num, videoTrack, audioSamplesInterceptor);
        mediaRecorderImpl.startRecording(new File(str));
        this.mediaRecorders.append(num.intValue(), mediaRecorderImpl);
    }

    public void stopRecording(final Integer num, String str, final Runnable runnable) {
        MediaRecorderImpl mediaRecorderImpl = this.mediaRecorders.get(num.intValue());
        if (mediaRecorderImpl != null) {
            mediaRecorderImpl.stopRecording(new Runnable() { // from class: com.cloudwebrtc.webrtc.c
                @Override // java.lang.Runnable
                public final void run() {
                    GetUserMediaImpl.a(this.f28782a, num, runnable);
                }
            });
        }
    }

    public void switchCamera(final String str, final MethodChannel.Result result) {
        CameraEnumerator camera1Enumerator;
        VideoCapturer videoCapturer = this.mVideoCapturers.get(str).capturer;
        if (videoCapturer == null) {
            resultError("switchCamera", "Video capturer not found for id: " + str, result);
            return;
        }
        if (Camera2Enumerator.isSupported(this.applicationContext)) {
            Log.d("FlutterWebRTCPlugin", "Creating video capturer using Camera2 API.");
            camera1Enumerator = new Camera2Enumerator(this.applicationContext);
        } else {
            Log.d("FlutterWebRTCPlugin", "Creating video capturer using Camera1 API.");
            camera1Enumerator = new Camera1Enumerator(false);
        }
        for (String str2 : camera1Enumerator.getDeviceNames()) {
            if (camera1Enumerator.isFrontFacing(str2) == (!this.isFacing)) {
                ((CameraVideoCapturer) videoCapturer).switchCamera(new CameraVideoCapturer.CameraSwitchHandler() { // from class: com.cloudwebrtc.webrtc.GetUserMediaImpl.6
                    @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
                    public void onCameraSwitchDone(boolean z10) {
                        GetUserMediaImpl.this.isFacing = !r0.isFacing;
                        result.success(Boolean.valueOf(z10));
                    }

                    @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
                    public void onCameraSwitchError(String str3) {
                        GetUserMediaImpl.resultError("switchCamera", "Switching camera failed: " + str, result);
                    }
                }, str2);
                return;
            }
        }
        resultError("switchCamera", "Switching camera failed: " + str, result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getDisplayMedia(MethodChannel.Result result, MediaStream mediaStream, Intent intent) {
        OrientationAwareScreenCapturer orientationAwareScreenCapturer = new OrientationAwareScreenCapturer(intent, new MediaProjection.Callback() { // from class: com.cloudwebrtc.webrtc.GetUserMediaImpl.5
            @Override // android.media.projection.MediaProjection.Callback
            public void onStop() {
                super.onStop();
            }
        });
        PeerConnectionFactory peerConnectionFactory = this.stateProvider.getPeerConnectionFactory();
        VideoSource videoSourceCreateVideoSource = peerConnectionFactory.createVideoSource(true);
        orientationAwareScreenCapturer.initialize(SurfaceTextureHelper.create(Thread.currentThread().getName() + "_texture_screen_thread", EglUtils.getRootEglBaseContext()), this.applicationContext, videoSourceCreateVideoSource.getCapturerObserver());
        Display defaultDisplay = ((WindowManager) this.applicationContext.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        VideoCapturerInfoEx videoCapturerInfoEx = new VideoCapturerInfoEx();
        int i10 = point.x;
        videoCapturerInfoEx.width = i10;
        int i11 = point.y;
        videoCapturerInfoEx.height = i11;
        videoCapturerInfoEx.fps = 30;
        videoCapturerInfoEx.isScreenCapture = true;
        videoCapturerInfoEx.capturer = orientationAwareScreenCapturer;
        orientationAwareScreenCapturer.startCapture(i10, i11, 30);
        Log.d("FlutterWebRTCPlugin", "OrientationAwareScreenCapturer.startCapture: " + videoCapturerInfoEx.width + "x" + videoCapturerInfoEx.height + "@" + videoCapturerInfoEx.fps);
        String nextTrackUUID = this.stateProvider.getNextTrackUUID();
        this.mVideoCapturers.put(nextTrackUUID, videoCapturerInfoEx);
        VideoTrack videoTrackCreateVideoTrack = peerConnectionFactory.createVideoTrack(nextTrackUUID, videoSourceCreateVideoSource);
        ConstraintsArray constraintsArray = new ConstraintsArray();
        ConstraintsArray constraintsArray2 = new ConstraintsArray();
        ConstraintsMap constraintsMap = new ConstraintsMap();
        if (videoTrackCreateVideoTrack != null) {
            String strId = videoTrackCreateVideoTrack.id();
            LocalVideoTrack localVideoTrack = new LocalVideoTrack(videoTrackCreateVideoTrack);
            videoSourceCreateVideoSource.setVideoProcessor(localVideoTrack);
            this.stateProvider.putLocalTrack(strId, localVideoTrack);
            ConstraintsMap constraintsMap2 = new ConstraintsMap();
            String strKind = videoTrackCreateVideoTrack.kind();
            constraintsMap2.putBoolean("enabled", videoTrackCreateVideoTrack.enabled());
            constraintsMap2.putString("id", strId);
            constraintsMap2.putString("kind", strKind);
            constraintsMap2.putString("label", strKind);
            constraintsMap2.putString("readyState", videoTrackCreateVideoTrack.state().toString());
            constraintsMap2.putBoolean("remote", false);
            constraintsArray2.pushMap(constraintsMap2);
            mediaStream.addTrack(videoTrackCreateVideoTrack);
        }
        String id2 = mediaStream.getId();
        Log.d("FlutterWebRTCPlugin", "MediaStream id: " + id2);
        this.stateProvider.putLocalStream(id2, mediaStream);
        constraintsMap.putString("streamId", id2);
        constraintsMap.putArray("audioTracks", constraintsArray.toArrayList());
        constraintsMap.putArray("videoTracks", constraintsArray2.toArrayList());
        result.success(constraintsMap.toMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r8 == null) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void getUserMedia(com.cloudwebrtc.webrtc.utils.ConstraintsMap r8, io.flutter.plugin.common.MethodChannel.Result r9, org.webrtc.MediaStream r10, java.util.List<java.lang.String> r11) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudwebrtc.webrtc.GetUserMediaImpl.getUserMedia(com.cloudwebrtc.webrtc.utils.ConstraintsMap, io.flutter.plugin.common.MethodChannel$Result, org.webrtc.MediaStream, java.util.List):void");
    }
}
