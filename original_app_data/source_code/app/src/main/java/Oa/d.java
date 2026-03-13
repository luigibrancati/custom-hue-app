package Oa;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AudioFocusRequest f12109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12111f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12112g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12113h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12114i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f12115j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Pa.b f12116k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AudioManager f12117l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Pa.a f12118m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e f12119n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AudioManager.OnAudioFocusChangeListener f12120o;

    public d(Context context, Pa.b logger, AudioManager audioManager, Pa.a build, e audioFocusRequest, AudioManager.OnAudioFocusChangeListener audioFocusChangeListener) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(logger, "logger");
        AbstractC4862t.e(audioManager, "audioManager");
        AbstractC4862t.e(build, "build");
        AbstractC4862t.e(audioFocusRequest, "audioFocusRequest");
        AbstractC4862t.e(audioFocusChangeListener, "audioFocusChangeListener");
        this.f12115j = context;
        this.f12116k = logger;
        this.f12117l = audioManager;
        this.f12118m = build;
        this.f12119n = audioFocusRequest;
        this.f12120o = audioFocusChangeListener;
        this.f12110e = 3;
        this.f12111f = 2;
        this.f12113h = 2;
        this.f12114i = 1;
    }

    public final void a() {
        this.f12106a = this.f12117l.getMode();
        this.f12107b = this.f12117l.isMicrophoneMute();
        this.f12108c = this.f12117l.isSpeakerphoneOn();
    }

    public final void b(boolean z10) {
        AudioManager audioManager = this.f12117l;
        if (z10) {
            audioManager.startBluetoothSco();
        } else {
            audioManager.stopBluetoothSco();
        }
    }

    public final void c(boolean z10) {
        this.f12117l.setSpeakerphoneOn(z10);
    }

    public final int d() {
        return this.f12110e;
    }

    public final boolean e() {
        boolean zHasSystemFeature = this.f12115j.getPackageManager().hasSystemFeature("android.hardware.telephony");
        if (zHasSystemFeature) {
            this.f12116k.a("AudioDeviceManager", "Earpiece available");
        }
        return zHasSystemFeature;
    }

    public final void f(boolean z10) {
        this.f12117l.setMicrophoneMute(z10);
    }

    public final void g() {
        this.f12117l.setMode(this.f12106a);
        f(this.f12107b);
        c(this.f12108c);
        if (this.f12118m.a() < 26) {
            this.f12117l.abandonAudioFocus(this.f12120o);
            return;
        }
        AudioFocusRequest audioFocusRequest = this.f12109d;
        if (audioFocusRequest != null) {
            this.f12117l.abandonAudioFocusRequest(audioFocusRequest);
        }
        this.f12109d = null;
    }

    public final void h(int i10) {
        this.f12114i = i10;
    }

    public final void i(int i10) {
        this.f12113h = i10;
    }

    public final void j() {
        if (this.f12118m.a() >= 26) {
            AudioFocusRequest audioFocusRequestA = this.f12119n.a(this.f12120o, this.f12111f, this.f12113h, this.f12114i);
            this.f12109d = audioFocusRequestA;
            if (audioFocusRequestA != null) {
                this.f12117l.requestAudioFocus(audioFocusRequestA);
            }
        } else {
            this.f12117l.requestAudioFocus(this.f12120o, this.f12112g, this.f12111f);
        }
        this.f12117l.setMode(this.f12110e);
    }

    public final void k(int i10) {
        this.f12110e = i10;
    }

    public final void l(int i10) {
        this.f12112g = i10;
    }

    public final void m(int i10) {
        this.f12111f = i10;
    }

    public /* synthetic */ d(Context context, Pa.b bVar, AudioManager audioManager, Pa.a aVar, e eVar, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, int i10, AbstractC4854k abstractC4854k) {
        this(context, bVar, audioManager, (i10 & 8) != 0 ? new Pa.a() : aVar, (i10 & 16) != 0 ? new e() : eVar, onAudioFocusChangeListener);
    }
}
