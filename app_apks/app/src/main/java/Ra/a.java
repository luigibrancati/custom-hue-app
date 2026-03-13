package Ra;

import Oa.c;
import Ra.b;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Handler;
import fc.C4032o;
import gc.C4179C;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends AudioDeviceCallback implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b.a f15020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AudioManager f15021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f15022c;

    public a(AudioManager audioManager, Handler handler) {
        AbstractC4862t.e(audioManager, "audioManager");
        AbstractC4862t.e(handler, "handler");
        this.f15021b = audioManager;
        this.f15022c = handler;
    }

    @Override // Ra.b
    public boolean a(c audioDevice) {
        AbstractC4862t.e(audioDevice, "audioDevice");
        AudioDeviceInfo[] devices = this.f15021b.getDevices(2);
        AbstractC4862t.d(devices, "this.audioManager\n      …ager.GET_DEVICES_OUTPUTS)");
        for (AudioDeviceInfo it : devices) {
            AbstractC4862t.d(it, "it");
            if (d(it, audioDevice)) {
                return true;
            }
        }
        return false;
    }

    @Override // Ra.b
    public boolean b(b.a listener) {
        AbstractC4862t.e(listener, "listener");
        this.f15020a = listener;
        this.f15021b.registerAudioDeviceCallback(this, this.f15022c);
        return true;
    }

    public final c c(AudioDeviceInfo audioDevice) {
        AbstractC4862t.e(audioDevice, "$this$audioDevice");
        if (audioDevice.getType() == 7 || audioDevice.getType() == 8) {
            return new c.a(audioDevice.getProductName().toString());
        }
        if (audioDevice.getType() == 26 || audioDevice.getType() == 27) {
            return new c.a(audioDevice.getProductName().toString());
        }
        if (audioDevice.getType() == 3 || audioDevice.getType() == 4 || audioDevice.getType() == 22) {
            return new c.d(null, 1, null);
        }
        if (audioDevice.getType() == 1) {
            return new c.b(null, 1, null);
        }
        if (audioDevice.getType() == 2) {
            return new c.C0158c(null, 1, null);
        }
        return null;
    }

    public final boolean d(AudioDeviceInfo isAudioDevice, c audioDevice) {
        AbstractC4862t.e(isAudioDevice, "$this$isAudioDevice");
        AbstractC4862t.e(audioDevice, "audioDevice");
        if (audioDevice instanceof c.a) {
            return isAudioDevice.getType() == 7 || isAudioDevice.getType() == 8 || isAudioDevice.getType() == 26 || isAudioDevice.getType() == 27;
        }
        if (audioDevice instanceof c.b) {
            return isAudioDevice.getType() == 1;
        }
        if (audioDevice instanceof c.C0158c) {
            return isAudioDevice.getType() == 2;
        }
        if (audioDevice instanceof c.d) {
            return isAudioDevice.getType() == 3 || isAudioDevice.getType() == 4 || isAudioDevice.getType() == 22;
        }
        throw new C4032o();
    }

    @Override // android.media.AudioDeviceCallback
    public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        super.onAudioDevicesAdded(audioDeviceInfoArr);
        if (audioDeviceInfoArr != null) {
            ArrayList arrayList = new ArrayList();
            for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                c cVarC = c(audioDeviceInfo);
                if (cVarC != null) {
                    arrayList.add(cVarC);
                }
            }
            Set<c> setZ0 = C4179C.Z0(arrayList);
            if (setZ0 != null) {
                for (c cVar : setZ0) {
                    b.a aVar = this.f15020a;
                    if (aVar != null) {
                        aVar.b(cVar);
                    }
                }
            }
        }
    }

    @Override // android.media.AudioDeviceCallback
    public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        super.onAudioDevicesRemoved(audioDeviceInfoArr);
        if (audioDeviceInfoArr != null) {
            ArrayList arrayList = new ArrayList();
            for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                c cVarC = c(audioDeviceInfo);
                if (cVarC != null) {
                    arrayList.add(cVarC);
                }
            }
            Set<c> setZ0 = C4179C.Z0(arrayList);
            if (setZ0 != null) {
                for (c cVar : setZ0) {
                    b.a aVar = this.f15020a;
                    if (aVar != null) {
                        aVar.a(cVar);
                    }
                }
            }
        }
    }
}
