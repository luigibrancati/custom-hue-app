package com.cloudwebrtc.webrtc.audio;

import Oa.c;
import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import fc.C4015H;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.webrtc.MediaStreamTrack;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class AudioSwitchManager {
    public static final String TAG = "AudioSwitchManager";

    @SuppressLint({"StaticFieldLeak"})
    public static AudioSwitchManager instance;
    private final AudioManager audioManager;
    private Oa.f audioSwitch;
    private final Context context;
    public boolean loggingEnabled;
    public List<Class<? extends Oa.c>> preferredDeviceList;
    private boolean isActive = false;
    public p audioDeviceChangeListener = new p() { // from class: com.cloudwebrtc.webrtc.audio.d
        @Override // vc.p
        public final Object invoke(Object obj, Object obj2) {
            return AudioSwitchManager.b((List) obj, (Oa.c) obj2);
        }
    };
    public AudioManager.OnAudioFocusChangeListener audioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() { // from class: com.cloudwebrtc.webrtc.audio.e
        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(int i10) {
            AudioSwitchManager.a(i10);
        }
    };
    private final Handler handler = new Handler(Looper.getMainLooper());
    private boolean manageAudioFocus = true;
    private int focusMode = 1;
    private int audioMode = 3;
    private int audioStreamType = 0;
    private int audioAttributeUsageType = 2;
    private int audioAttributeContentType = 1;
    private boolean forceHandleAudioRouting = false;

    public AudioSwitchManager(Context context) {
        this.context = context;
        this.audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        ArrayList arrayList = new ArrayList();
        this.preferredDeviceList = arrayList;
        arrayList.add(c.a.class);
        this.preferredDeviceList.add(c.d.class);
        this.preferredDeviceList.add(c.C0158c.class);
        this.preferredDeviceList.add(c.b.class);
        initAudioSwitch();
    }

    public static /* synthetic */ C4015H b(List list, Oa.c cVar) {
        return null;
    }

    public static /* synthetic */ void c(AudioSwitchManager audioSwitchManager) {
        if (audioSwitchManager.isActive) {
            return;
        }
        Oa.f fVar = audioSwitchManager.audioSwitch;
        Objects.requireNonNull(fVar);
        fVar.d();
        audioSwitchManager.isActive = true;
    }

    public static /* synthetic */ void d(AudioSwitchManager audioSwitchManager) {
        if (audioSwitchManager.isActive) {
            Oa.f fVar = audioSwitchManager.audioSwitch;
            Objects.requireNonNull(fVar);
            fVar.e();
            audioSwitchManager.isActive = false;
        }
    }

    public static /* synthetic */ void e(AudioSwitchManager audioSwitchManager) {
        audioSwitchManager.getClass();
        Oa.f fVar = new Oa.f(audioSwitchManager.context, audioSwitchManager.loggingEnabled, audioSwitchManager.audioFocusChangeListener, audioSwitchManager.preferredDeviceList);
        audioSwitchManager.audioSwitch = fVar;
        fVar.A(audioSwitchManager.manageAudioFocus);
        audioSwitchManager.audioSwitch.y(audioSwitchManager.focusMode);
        audioSwitchManager.audioSwitch.w(audioSwitchManager.audioMode);
        audioSwitchManager.audioSwitch.x(audioSwitchManager.audioStreamType);
        audioSwitchManager.audioSwitch.u(audioSwitchManager.audioAttributeContentType);
        audioSwitchManager.audioSwitch.v(audioSwitchManager.audioAttributeUsageType);
        audioSwitchManager.audioSwitch.z(audioSwitchManager.forceHandleAudioRouting);
        audioSwitchManager.audioSwitch.E(audioSwitchManager.audioDeviceChangeListener);
    }

    public static /* synthetic */ void f(AudioSwitchManager audioSwitchManager) {
        Oa.f fVar = audioSwitchManager.audioSwitch;
        Objects.requireNonNull(fVar);
        fVar.t(null);
    }

    public static /* synthetic */ void g(AudioSwitchManager audioSwitchManager, Class cls) {
        Oa.c next;
        Iterator<Oa.c> it = audioSwitchManager.availableAudioDevices().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next.getClass().equals(cls)) {
                    break;
                }
            }
        }
        if (next != null) {
            Oa.f fVar = audioSwitchManager.audioSwitch;
            Objects.requireNonNull(fVar);
            fVar.t(next);
        }
    }

    public static /* synthetic */ void h(AudioSwitchManager audioSwitchManager) {
        Oa.f fVar = audioSwitchManager.audioSwitch;
        Objects.requireNonNull(fVar);
        fVar.B(audioSwitchManager.preferredDeviceList);
    }

    private void initAudioSwitch() {
        if (this.audioSwitch == null) {
            this.handler.removeCallbacksAndMessages(null);
            this.handler.postAtFrontOfQueue(new Runnable() { // from class: com.cloudwebrtc.webrtc.audio.a
                @Override // java.lang.Runnable
                public final void run() {
                    AudioSwitchManager.e(this.f28772a);
                }
            });
        }
    }

    private void updatePreferredDeviceList(boolean z10) {
        ArrayList arrayList = new ArrayList();
        this.preferredDeviceList = arrayList;
        arrayList.add(c.a.class);
        this.preferredDeviceList.add(c.d.class);
        if (z10) {
            this.preferredDeviceList.add(c.C0158c.class);
            this.preferredDeviceList.add(c.b.class);
        } else {
            this.preferredDeviceList.add(c.b.class);
            this.preferredDeviceList.add(c.C0158c.class);
        }
        this.handler.post(new Runnable() { // from class: com.cloudwebrtc.webrtc.audio.c
            @Override // java.lang.Runnable
            public final void run() {
                AudioSwitchManager.h(this.f28775a);
            }
        });
    }

    public List<Oa.c> availableAudioDevices() {
        Oa.f fVar = this.audioSwitch;
        Objects.requireNonNull(fVar);
        return fVar.h();
    }

    public void clearCommunicationDevice() {
        this.audioManager.clearCommunicationDevice();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void enableSpeakerButPreferBluetooth() {
        Oa.c next;
        Iterator<Oa.c> it = availableAudioDevices().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.getClass().equals(c.a.class) || next.getClass().equals(c.d.class)) {
                break;
            }
        }
        if (next == null) {
            selectAudioOutput((Class<? extends Oa.c>) c.C0158c.class);
        } else {
            selectAudioOutput((Class<? extends Oa.c>) next.getClass());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void enableSpeakerphone(boolean z10) {
        Oa.c next;
        updatePreferredDeviceList(z10);
        if (z10) {
            selectAudioOutput((Class<? extends Oa.c>) c.C0158c.class);
            return;
        }
        Iterator<Oa.c> it = availableAudioDevices().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.getClass().equals(c.a.class) || next.getClass().equals(c.d.class) || next.getClass().equals(c.b.class)) {
                break;
            }
        }
        if (next != null) {
            selectAudioOutput((Class<? extends Oa.c>) next.getClass());
        } else {
            this.handler.post(new Runnable() { // from class: com.cloudwebrtc.webrtc.audio.g
                @Override // java.lang.Runnable
                public final void run() {
                    AudioSwitchManager.f(this.f28777a);
                }
            });
        }
    }

    public void selectAudioOutput(final Class<? extends Oa.c> cls) {
        this.handler.post(new Runnable() { // from class: com.cloudwebrtc.webrtc.audio.b
            @Override // java.lang.Runnable
            public final void run() {
                AudioSwitchManager.g(this.f28773a, cls);
            }
        });
    }

    public Oa.c selectedAudioDevice() {
        Oa.f fVar = this.audioSwitch;
        Objects.requireNonNull(fVar);
        return fVar.m();
    }

    public void setAudioAttributesContentType(String str) {
        Integer audioAttributesContentTypeFromString = AudioUtils.getAudioAttributesContentTypeFromString(str);
        if (audioAttributesContentTypeFromString == null) {
            return;
        }
        this.audioAttributeContentType = audioAttributesContentTypeFromString.intValue();
        Oa.f fVar = this.audioSwitch;
        if (fVar != null) {
            Objects.requireNonNull(fVar);
            fVar.u(this.audioAttributeContentType);
        }
    }

    public void setAudioAttributesUsageType(String str) {
        Integer audioAttributesUsageTypeForString = AudioUtils.getAudioAttributesUsageTypeForString(str);
        if (audioAttributesUsageTypeForString == null) {
            return;
        }
        this.audioAttributeUsageType = audioAttributesUsageTypeForString.intValue();
        Oa.f fVar = this.audioSwitch;
        if (fVar != null) {
            Objects.requireNonNull(fVar);
            fVar.v(this.audioAttributeUsageType);
        }
    }

    public void setAudioConfiguration(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        setManageAudioFocus(map.get("manageAudioFocus") instanceof Boolean ? (Boolean) map.get("manageAudioFocus") : null);
        setAudioMode(map.get("androidAudioMode") instanceof String ? (String) map.get("androidAudioMode") : null);
        setFocusMode(map.get("androidAudioFocusMode") instanceof String ? (String) map.get("androidAudioFocusMode") : null);
        setAudioStreamType(map.get("androidAudioStreamType") instanceof String ? (String) map.get("androidAudioStreamType") : null);
        setAudioAttributesUsageType(map.get("androidAudioAttributesUsageType") instanceof String ? (String) map.get("androidAudioAttributesUsageType") : null);
        setAudioAttributesContentType(map.get("androidAudioAttributesContentType") instanceof String ? (String) map.get("androidAudioAttributesContentType") : null);
        setForceHandleAudioRouting(map.get("forceHandleAudioRouting") instanceof Boolean ? (Boolean) map.get("forceHandleAudioRouting") : null);
    }

    public void setAudioMode(String str) {
        Integer audioModeForString = AudioUtils.getAudioModeForString(str);
        if (audioModeForString == null) {
            return;
        }
        this.audioMode = audioModeForString.intValue();
        Oa.f fVar = this.audioSwitch;
        if (fVar != null) {
            Objects.requireNonNull(fVar);
            fVar.w(audioModeForString.intValue());
        }
    }

    public void setAudioStreamType(String str) {
        Integer streamTypeForString = AudioUtils.getStreamTypeForString(str);
        if (streamTypeForString == null) {
            return;
        }
        this.audioStreamType = streamTypeForString.intValue();
        Oa.f fVar = this.audioSwitch;
        if (fVar != null) {
            Objects.requireNonNull(fVar);
            fVar.x(this.audioStreamType);
        }
    }

    public void setFocusMode(String str) {
        Integer focusModeForString = AudioUtils.getFocusModeForString(str);
        if (focusModeForString == null) {
            return;
        }
        this.focusMode = focusModeForString.intValue();
        Oa.f fVar = this.audioSwitch;
        if (fVar != null) {
            Objects.requireNonNull(fVar);
            fVar.y(focusModeForString.intValue());
        }
    }

    public void setForceHandleAudioRouting(Boolean bool) {
        if (bool == null || this.audioSwitch == null) {
            return;
        }
        this.forceHandleAudioRouting = bool.booleanValue();
        Oa.f fVar = this.audioSwitch;
        Objects.requireNonNull(fVar);
        fVar.z(this.forceHandleAudioRouting);
    }

    public void setManageAudioFocus(Boolean bool) {
        if (bool == null || this.audioSwitch == null) {
            return;
        }
        this.manageAudioFocus = bool.booleanValue();
        Oa.f fVar = this.audioSwitch;
        Objects.requireNonNull(fVar);
        fVar.A(this.manageAudioFocus);
    }

    public void setMicrophoneMute(boolean z10) {
        this.audioManager.setMicrophoneMute(z10);
    }

    public void start() {
        if (this.audioSwitch != null) {
            this.handler.removeCallbacksAndMessages(null);
            this.handler.postAtFrontOfQueue(new Runnable() { // from class: com.cloudwebrtc.webrtc.audio.f
                @Override // java.lang.Runnable
                public final void run() {
                    AudioSwitchManager.c(this.f28776a);
                }
            });
        }
    }

    public void stop() {
        if (this.audioSwitch != null) {
            this.handler.removeCallbacksAndMessages(null);
            this.handler.postAtFrontOfQueue(new Runnable() { // from class: com.cloudwebrtc.webrtc.audio.h
                @Override // java.lang.Runnable
                public final void run() {
                    AudioSwitchManager.d(this.f28778a);
                }
            });
        }
    }

    public void selectAudioOutput(AudioDeviceKind audioDeviceKind) {
        if (audioDeviceKind != null) {
            selectAudioOutput(audioDeviceKind.audioDeviceClass);
        }
    }

    public static /* synthetic */ void a(int i10) {
    }
}
