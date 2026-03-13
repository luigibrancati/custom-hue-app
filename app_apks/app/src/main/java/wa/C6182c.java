package wa;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MicrophoneInfo;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.KeyEvent;
import androidx.media.AudioAttributesCompat;
import androidx.media.a;
import fc.AbstractC4040w;
import fc.C4034q;
import gc.C4204q;
import gc.C4206t;
import gc.C4207u;
import gc.Q;
import io.flutter.plugin.common.MethodChannel;
import io.sentry.SentryLockReason;
import io.sentry.protocol.Device;
import io.sentry.protocol.FeatureFlags;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: renamed from: wa.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C6182c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f46472j = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f46473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f46474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.media.a f46475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public BroadcastReceiver f46476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public BroadcastReceiver f46477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f46478f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AudioManager f46479g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f46480h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f46481i;

    /* JADX INFO: renamed from: wa.c$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final ArrayList a(MicrophoneInfo.Coordinate3F coordinate) {
            AbstractC4862t.e(coordinate, "coordinate");
            return C4206t.f(Double.valueOf(coordinate.x), Double.valueOf(coordinate.y), Double.valueOf(coordinate.z));
        }

        public final Map b(AudioDeviceInfo device) {
            AbstractC4862t.e(device, "device");
            String address = device.getAddress();
            C4034q c4034qA = AbstractC4040w.a("id", Integer.valueOf(device.getId()));
            C4034q c4034qA2 = AbstractC4040w.a("productName", device.getProductName());
            C4034q c4034qA3 = AbstractC4040w.a(SentryLockReason.JsonKeys.ADDRESS, address);
            C4034q c4034qA4 = AbstractC4040w.a("isSource", Boolean.valueOf(device.isSource()));
            C4034q c4034qA5 = AbstractC4040w.a("isSink", Boolean.valueOf(device.isSink()));
            int[] sampleRates = device.getSampleRates();
            AbstractC4862t.d(sampleRates, "getSampleRates(...)");
            C4034q c4034qA6 = AbstractC4040w.a("sampleRates", e(sampleRates));
            int[] channelMasks = device.getChannelMasks();
            AbstractC4862t.d(channelMasks, "getChannelMasks(...)");
            C4034q c4034qA7 = AbstractC4040w.a("channelMasks", e(channelMasks));
            int[] channelIndexMasks = device.getChannelIndexMasks();
            AbstractC4862t.d(channelIndexMasks, "getChannelIndexMasks(...)");
            C4034q c4034qA8 = AbstractC4040w.a("channelIndexMasks", e(channelIndexMasks));
            int[] channelCounts = device.getChannelCounts();
            AbstractC4862t.d(channelCounts, "getChannelCounts(...)");
            C4034q c4034qA9 = AbstractC4040w.a("channelCounts", e(channelCounts));
            int[] encodings = device.getEncodings();
            AbstractC4862t.d(encodings, "getEncodings(...)");
            return Q.l(c4034qA, c4034qA2, c4034qA3, c4034qA4, c4034qA5, c4034qA6, c4034qA7, c4034qA8, c4034qA9, AbstractC4040w.a("encodings", e(encodings)), AbstractC4040w.a("type", Integer.valueOf(device.getType())));
        }

        public final List c(AudioDeviceInfo[] devices) {
            AbstractC4862t.e(devices, "devices");
            ArrayList arrayList = new ArrayList(devices.length);
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                arrayList.add(C6182c.f46472j.b(audioDeviceInfo));
            }
            return arrayList;
        }

        public final Long d(Object obj) {
            Long l10 = obj instanceof Long ? (Long) obj : null;
            if (l10 != null) {
                return l10;
            }
            if ((obj instanceof Integer ? (Integer) obj : null) != null) {
                return Long.valueOf(r2.intValue());
            }
            return null;
        }

        public final ArrayList e(int[] a10) {
            AbstractC4862t.e(a10, "a");
            return new ArrayList(C4204q.M0(a10));
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: wa.c$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AudioDeviceCallback {
        public b() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] addedDevices) {
            AbstractC4862t.e(addedDevices, "addedDevices");
            C6182c.this.A("onAudioDevicesAdded", C6182c.f46472j.c(addedDevices));
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] removedDevices) {
            AbstractC4862t.e(removedDevices, "removedDevices");
            C6182c.this.A("onAudioDevicesRemoved", C6182c.f46472j.c(removedDevices));
        }
    }

    /* JADX INFO: renamed from: wa.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0639c extends BroadcastReceiver {
        public C0639c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            AbstractC4862t.e(context, "context");
            AbstractC4862t.e(intent, "intent");
            if (AbstractC4862t.a("android.media.AUDIO_BECOMING_NOISY", intent.getAction())) {
                C6182c.this.A("onBecomingNoisy", new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: wa.c$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends BroadcastReceiver {
        public d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            AbstractC4862t.e(context, "context");
            AbstractC4862t.e(intent, "intent");
            C6182c.this.A("onScoAudioStateUpdated", Integer.valueOf(intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1)), Integer.valueOf(intent.getIntExtra("android.media.extra.SCO_AUDIO_PREVIOUS_STATE", -1)));
        }
    }

    public C6182c(Context applicationContext) {
        AbstractC4862t.e(applicationContext, "applicationContext");
        this.f46473a = new Handler(Looper.getMainLooper());
        this.f46474b = new ArrayList();
        this.f46481i = new ArrayList();
        this.f46478f = applicationContext;
        Object systemService = applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        AbstractC4862t.c(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.f46479g = (AudioManager) systemService;
        z();
    }

    public static final void Q(C6182c c6182c, int i10) {
        if (i10 == -1) {
            c6182c.b();
        }
        c6182c.A("onAudioFocusChanged", Integer.valueOf(i10));
    }

    public final void A(String method, Object... args) {
        AbstractC4862t.e(method, "method");
        AbstractC4862t.e(args, "args");
        for (C6180a c6180a : this.f46474b) {
            List listX0 = C4204q.X0(args);
            MethodChannel methodChannelB = c6180a.b();
            AbstractC4862t.b(methodChannelB);
            methodChannelB.invokeMethod(method, listX0);
        }
    }

    public final Object B() {
        AudioManager audioManager = this.f46479g;
        AbstractC4862t.b(audioManager);
        return Boolean.valueOf(audioManager.isBluetoothScoAvailableOffCall());
    }

    public final Object C() {
        AudioManager audioManager = this.f46479g;
        AbstractC4862t.b(audioManager);
        return Boolean.valueOf(audioManager.isBluetoothScoOn());
    }

    public final boolean D() {
        return this.f46474b.size() == 0;
    }

    public final Object E() {
        return Boolean.valueOf(AudioManager.isHapticPlaybackSupported());
    }

    public final Object F() {
        AudioManager audioManager = this.f46479g;
        AbstractC4862t.b(audioManager);
        return Boolean.valueOf(audioManager.isMicrophoneMute());
    }

    public final Object G() {
        AudioManager audioManager = this.f46479g;
        AbstractC4862t.b(audioManager);
        return Boolean.valueOf(audioManager.isMusicActive());
    }

    public final Object H() {
        AudioManager audioManager = this.f46479g;
        AbstractC4862t.b(audioManager);
        return Boolean.valueOf(audioManager.isSpeakerphoneOn());
    }

    public final Object I(int i10) {
        AudioManager audioManager = this.f46479g;
        AbstractC4862t.b(audioManager);
        return Boolean.valueOf(audioManager.isStreamMute(i10));
    }

    public final Object J() {
        AudioManager audioManager = this.f46479g;
        AbstractC4862t.b(audioManager);
        return Boolean.valueOf(audioManager.isVolumeFixed());
    }

    public final Object K() {
        AudioManager audioManager = this.f46479g;
        AbstractC4862t.b(audioManager);
        audioManager.loadSoundEffects();
        return null;
    }

    public final Object L(int i10, Double d10) {
        if (d10 != null) {
            AudioManager audioManager = this.f46479g;
            AbstractC4862t.b(audioManager);
            audioManager.playSoundEffect(i10, (float) d10.doubleValue());
            return null;
        }
        AudioManager audioManager2 = this.f46479g;
        AbstractC4862t.b(audioManager2);
        audioManager2.playSoundEffect(i10);
        return null;
    }

    public final void M() {
        if (this.f46476d != null) {
            return;
        }
        this.f46476d = new C0639c();
        Context context = this.f46478f;
        AbstractC4862t.b(context);
        L0.a.m(context, this.f46476d, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"), 2);
    }

    public final void N() {
        if (this.f46477e != null) {
            return;
        }
        this.f46477e = new d();
        Context context = this.f46478f;
        AbstractC4862t.b(context);
        L0.a.m(context, this.f46477e, new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"), 2);
    }

    public final void O(C6180a manager) {
        AbstractC4862t.e(manager, "manager");
        this.f46474b.remove(manager);
    }

    public final boolean P(List args) {
        AbstractC4862t.e(args, "args");
        if (this.f46475c != null) {
            return true;
        }
        Object obj = args.get(0);
        AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
        Map map = (Map) obj;
        Object obj2 = map.get("gainType");
        AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.Int");
        a.b bVar = new a.b(((Integer) obj2).intValue());
        bVar.e(new AudioManager.OnAudioFocusChangeListener() { // from class: wa.b
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i10) {
                C6182c.Q(this.f46471a, i10);
            }
        });
        if (map.get("audioAttributes") != null) {
            Map map2 = (Map) map.get("audioAttributes");
            AbstractC4862t.b(map2);
            bVar.c(h(map2));
        }
        if (map.get("willPauseWhenDucked") != null) {
            Object obj3 = map.get("willPauseWhenDucked");
            AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            bVar.g(((Boolean) obj3).booleanValue());
        }
        this.f46475c = bVar.a();
        AudioManager audioManager = this.f46479g;
        AbstractC4862t.b(audioManager);
        androidx.media.a aVar = this.f46475c;
        AbstractC4862t.b(aVar);
        boolean z10 = B1.a.b(audioManager, aVar) == 1;
        if (z10) {
            M();
            N();
        }
        return z10;
    }

    public final Object R(int i10) {
        AudioManager audioManager = this.f46479g;
        AbstractC4862t.b(audioManager);
        audioManager.setAllowedCapturePolicy(i10);
        return null;
    }

    public final Object S(boolean z10) {
        AudioManager audioManager = this.f46479g;
        AbstractC4862t.b(audioManager);
        audioManager.setBluetoothScoOn(z10);
        return null;
    }

    public final boolean T(int i10) {
        for (AudioDeviceInfo audioDeviceInfo : this.f46481i) {
            if (audioDeviceInfo.getId() == i10) {
                AudioManager audioManager = this.f46479g;
                AbstractC4862t.b(audioManager);
                return audioManager.setCommunicationDevice(audioDeviceInfo);
            }
        }
        return false;
    }

    public final Object U(boolean z10) {
        AudioManager audioManager = this.f46479g;
        AbstractC4862t.b(audioManager);
        audioManager.setMicrophoneMute(z10);
        return null;
    }

    public final Object V(int i10) {
        AudioManager audioManager = this.f46479g;
        AbstractC4862t.b(audioManager);
        audioManager.setMode(i10);
        return null;
    }

    public final Object W(String str) {
        AudioManager audioManager = this.f46479g;
        AbstractC4862t.b(audioManager);
        audioManager.setParameters(str);
        return null;
    }

    public final Object X(int i10) {
        AudioManager audioManager = this.f46479g;
        AbstractC4862t.b(audioManager);
        audioManager.setRingerMode(i10);
        return null;
    }

    public final Object Y(boolean z10) {
        AudioManager audioManager = this.f46479g;
        AbstractC4862t.b(audioManager);
        audioManager.setSpeakerphoneOn(z10);
        return null;
    }

    public final Object Z(int i10, int i11, int i12) {
        AudioManager audioManager = this.f46479g;
        AbstractC4862t.b(audioManager);
        audioManager.setStreamVolume(i10, i11, i12);
        return null;
    }

    public final Object a0() {
        AudioManager audioManager = this.f46479g;
        AbstractC4862t.b(audioManager);
        audioManager.startBluetoothSco();
        return null;
    }

    public final boolean b() {
        if (this.f46478f == null) {
            return false;
        }
        d0();
        e0();
        if (this.f46475c == null) {
            return true;
        }
        AudioManager audioManager = this.f46479g;
        AbstractC4862t.b(audioManager);
        androidx.media.a aVar = this.f46475c;
        AbstractC4862t.b(aVar);
        int iA = B1.a.a(audioManager, aVar);
        this.f46475c = null;
        return iA == 1;
    }

    public final Object b0() {
        AudioManager audioManager = this.f46479g;
        AbstractC4862t.b(audioManager);
        audioManager.stopBluetoothSco();
        return null;
    }

    public final void c(C6180a manager) {
        AbstractC4862t.e(manager, "manager");
        this.f46474b.add(manager);
    }

    public final Object c0() {
        AudioManager audioManager = this.f46479g;
        AbstractC4862t.b(audioManager);
        audioManager.unloadSoundEffects();
        return null;
    }

    public final Object d(int i10, int i11, int i12) {
        AudioManager audioManager = this.f46479g;
        AbstractC4862t.b(audioManager);
        audioManager.adjustStreamVolume(i10, i11, i12);
        return null;
    }

    public final void d0() {
        Context context;
        if (this.f46476d == null || (context = this.f46478f) == null) {
            return;
        }
        AbstractC4862t.b(context);
        context.unregisterReceiver(this.f46476d);
        this.f46476d = null;
    }

    public final Object e(int i10, int i11, int i12) {
        AudioManager audioManager = this.f46479g;
        AbstractC4862t.b(audioManager);
        audioManager.adjustSuggestedStreamVolume(i10, i11, i12);
        return null;
    }

    public final void e0() {
        Context context;
        if (this.f46477e == null || (context = this.f46478f) == null) {
            return;
        }
        AbstractC4862t.b(context);
        context.unregisterReceiver(this.f46477e);
        this.f46477e = null;
    }

    public final Object f(int i10, int i11) {
        AudioManager audioManager = this.f46479g;
        AbstractC4862t.b(audioManager);
        audioManager.adjustVolume(i10, i11);
        return null;
    }

    public final Object g() {
        AudioManager audioManager = this.f46479g;
        AbstractC4862t.b(audioManager);
        audioManager.clearCommunicationDevice();
        return null;
    }

    public final AudioAttributesCompat h(Map attributes) {
        AbstractC4862t.e(attributes, "attributes");
        AudioAttributesCompat.a aVar = new AudioAttributesCompat.a();
        if (attributes.get("contentType") != null) {
            Object obj = attributes.get("contentType");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.Int");
            aVar.b(((Integer) obj).intValue());
        }
        if (attributes.get(FeatureFlags.TYPE) != null) {
            Object obj2 = attributes.get(FeatureFlags.TYPE);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.Int");
            aVar.c(((Integer) obj2).intValue());
        }
        if (attributes.get("usage") != null) {
            Object obj3 = attributes.get("usage");
            AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.Int");
            aVar.d(((Integer) obj3).intValue());
        }
        AudioAttributesCompat audioAttributesCompatA = aVar.a();
        AbstractC4862t.d(audioAttributesCompatA, "build(...)");
        return audioAttributesCompatA;
    }

    public final Object i(Map rawKeyEvent) {
        AbstractC4862t.e(rawKeyEvent, "rawKeyEvent");
        a aVar = f46472j;
        Long lD = aVar.d(rawKeyEvent.get("downTime"));
        AbstractC4862t.b(lD);
        long jLongValue = lD.longValue();
        Long lD2 = aVar.d(rawKeyEvent.get("eventTime"));
        AbstractC4862t.b(lD2);
        long jLongValue2 = lD2.longValue();
        Object obj = rawKeyEvent.get("action");
        AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj).intValue();
        Object obj2 = rawKeyEvent.get("keyCode");
        AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue2 = ((Integer) obj2).intValue();
        Object obj3 = rawKeyEvent.get("repeatCount");
        AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue3 = ((Integer) obj3).intValue();
        Object obj4 = rawKeyEvent.get("metaState");
        AbstractC4862t.c(obj4, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue4 = ((Integer) obj4).intValue();
        Object obj5 = rawKeyEvent.get("deviceId");
        AbstractC4862t.c(obj5, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue5 = ((Integer) obj5).intValue();
        Object obj6 = rawKeyEvent.get("scanCode");
        AbstractC4862t.c(obj6, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue6 = ((Integer) obj6).intValue();
        Object obj7 = rawKeyEvent.get(FeatureFlags.TYPE);
        AbstractC4862t.c(obj7, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue7 = ((Integer) obj7).intValue();
        Object obj8 = rawKeyEvent.get("source");
        AbstractC4862t.c(obj8, "null cannot be cast to non-null type kotlin.Int");
        KeyEvent keyEvent = new KeyEvent(jLongValue, jLongValue2, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue5, iIntValue6, iIntValue7, ((Integer) obj8).intValue());
        AudioManager audioManager = this.f46479g;
        AbstractC4862t.b(audioManager);
        audioManager.dispatchMediaKeyEvent(keyEvent);
        return null;
    }

    public final void j() {
        b();
        k();
        this.f46478f = null;
        this.f46479g = null;
    }

    public final void k() {
        AudioManager audioManager = this.f46479g;
        AbstractC4862t.b(audioManager);
        audioManager.unregisterAudioDeviceCallback((AudioDeviceCallback) this.f46480h);
    }

    public final Object l() {
        AudioManager audioManager = this.f46479g;
        AbstractC4862t.b(audioManager);
        return Integer.valueOf(audioManager.generateAudioSessionId());
    }

    public final Object m() {
        AudioManager audioManager = this.f46479g;
        AbstractC4862t.b(audioManager);
        return Integer.valueOf(audioManager.getAllowedCapturePolicy());
    }

    public final List n() {
        AudioManager audioManager = this.f46479g;
        AbstractC4862t.b(audioManager);
        List<AudioDeviceInfo> availableCommunicationDevices = audioManager.getAvailableCommunicationDevices();
        AbstractC4862t.d(availableCommunicationDevices, "getAvailableCommunicationDevices(...)");
        ArrayList arrayList = new ArrayList(C4207u.v(availableCommunicationDevices, 10));
        for (AudioDeviceInfo audioDeviceInfo : availableCommunicationDevices) {
            a aVar = f46472j;
            AbstractC4862t.b(audioDeviceInfo);
            arrayList.add(aVar.b(audioDeviceInfo));
        }
        return arrayList;
    }

    public final Map o() {
        AudioManager audioManager = this.f46479g;
        AbstractC4862t.b(audioManager);
        AudioDeviceInfo communicationDevice = audioManager.getCommunicationDevice();
        if (communicationDevice == null) {
            return null;
        }
        return f46472j.b(communicationDevice);
    }

    public final Object p(int i10) {
        ArrayList arrayList = new ArrayList();
        AudioManager audioManager = this.f46479g;
        AbstractC4862t.b(audioManager);
        AudioDeviceInfo[] devices = audioManager.getDevices(i10);
        AbstractC4862t.d(devices, "getDevices(...)");
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            arrayList.add(f46472j.b(audioDeviceInfo));
        }
        return arrayList;
    }

    public final Object q() throws IOException {
        ArrayList arrayList = new ArrayList();
        AudioManager audioManager = this.f46479g;
        AbstractC4862t.b(audioManager);
        List<MicrophoneInfo> microphones = audioManager.getMicrophones();
        AbstractC4862t.d(microphones, "getMicrophones(...)");
        for (MicrophoneInfo microphoneInfo : microphones) {
            List<Pair<Float, Float>> frequencyResponse = microphoneInfo.getFrequencyResponse();
            AbstractC4862t.d(frequencyResponse, "getFrequencyResponse(...)");
            ArrayList arrayList2 = new ArrayList(C4207u.v(frequencyResponse, 10));
            Iterator<T> it = frequencyResponse.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                arrayList2.add(C4206t.n(Double.valueOf(((Number) pair.first).floatValue()), Double.valueOf(((Number) pair.second).floatValue())));
            }
            List<Pair<Integer, Integer>> channelMapping = microphoneInfo.getChannelMapping();
            AbstractC4862t.d(channelMapping, "getChannelMapping(...)");
            ArrayList arrayList3 = new ArrayList(C4207u.v(channelMapping, 10));
            Iterator<T> it2 = channelMapping.iterator();
            while (it2.hasNext()) {
                Pair pair2 = (Pair) it2.next();
                arrayList3.add(C4206t.n(Integer.valueOf(((Number) pair2.first).intValue()), Integer.valueOf(((Number) pair2.second).intValue())));
            }
            C4034q c4034qA = AbstractC4040w.a("description", microphoneInfo.getDescription());
            C4034q c4034qA2 = AbstractC4040w.a("id", Integer.valueOf(microphoneInfo.getId()));
            C4034q c4034qA3 = AbstractC4040w.a("type", Integer.valueOf(microphoneInfo.getType()));
            C4034q c4034qA4 = AbstractC4040w.a(SentryLockReason.JsonKeys.ADDRESS, microphoneInfo.getAddress());
            C4034q c4034qA5 = AbstractC4040w.a("location", Integer.valueOf(microphoneInfo.getLocation()));
            C4034q c4034qA6 = AbstractC4040w.a("group", Integer.valueOf(microphoneInfo.getGroup()));
            C4034q c4034qA7 = AbstractC4040w.a("indexInTheGroup", Integer.valueOf(microphoneInfo.getIndexInTheGroup()));
            a aVar = f46472j;
            MicrophoneInfo.Coordinate3F position = microphoneInfo.getPosition();
            AbstractC4862t.d(position, "getPosition(...)");
            C4034q c4034qA8 = AbstractC4040w.a("position", aVar.a(position));
            MicrophoneInfo.Coordinate3F orientation = microphoneInfo.getOrientation();
            AbstractC4862t.d(orientation, "getOrientation(...)");
            arrayList.add(Q.l(c4034qA, c4034qA2, c4034qA3, c4034qA4, c4034qA5, c4034qA6, c4034qA7, c4034qA8, AbstractC4040w.a(Device.JsonKeys.ORIENTATION, aVar.a(orientation)), AbstractC4040w.a("frequencyResponse", arrayList2), AbstractC4040w.a("channelMapping", arrayList3), AbstractC4040w.a("sensitivity", Float.valueOf(microphoneInfo.getSensitivity())), AbstractC4040w.a("maxSpl", Float.valueOf(microphoneInfo.getMaxSpl())), AbstractC4040w.a("minSpl", Float.valueOf(microphoneInfo.getMinSpl())), AbstractC4040w.a("directionality", Integer.valueOf(microphoneInfo.getDirectionality()))));
        }
        return arrayList;
    }

    public final Object r() {
        AudioManager audioManager = this.f46479g;
        AbstractC4862t.b(audioManager);
        return Integer.valueOf(audioManager.getMode());
    }

    public final Object s(String str) {
        AudioManager audioManager = this.f46479g;
        AbstractC4862t.b(audioManager);
        String parameters = audioManager.getParameters(str);
        AbstractC4862t.d(parameters, "getParameters(...)");
        return parameters;
    }

    public final Object t(String str) {
        AudioManager audioManager = this.f46479g;
        AbstractC4862t.b(audioManager);
        String property = audioManager.getProperty(str);
        AbstractC4862t.d(property, "getProperty(...)");
        return property;
    }

    public final Object u() {
        AudioManager audioManager = this.f46479g;
        AbstractC4862t.b(audioManager);
        return Integer.valueOf(audioManager.getRingerMode());
    }

    public final Object v(int i10) {
        AudioManager audioManager = this.f46479g;
        AbstractC4862t.b(audioManager);
        return Integer.valueOf(audioManager.getStreamMaxVolume(i10));
    }

    public final Object w(int i10) {
        AudioManager audioManager = this.f46479g;
        AbstractC4862t.b(audioManager);
        return Integer.valueOf(audioManager.getStreamMinVolume(i10));
    }

    public final Object x(int i10) {
        AudioManager audioManager = this.f46479g;
        AbstractC4862t.b(audioManager);
        return Integer.valueOf(audioManager.getStreamVolume(i10));
    }

    public final Object y(int i10, int i11, int i12) {
        AudioManager audioManager = this.f46479g;
        AbstractC4862t.b(audioManager);
        return Float.valueOf(audioManager.getStreamVolumeDb(i10, i11, i12));
    }

    public final void z() {
        this.f46480h = new b();
        AudioManager audioManager = this.f46479g;
        AbstractC4862t.b(audioManager);
        Object obj = this.f46480h;
        AbstractC4862t.c(obj, "null cannot be cast to non-null type android.media.AudioDeviceCallback");
        audioManager.registerAudioDeviceCallback((AudioDeviceCallback) obj, this.f46473a);
    }
}
