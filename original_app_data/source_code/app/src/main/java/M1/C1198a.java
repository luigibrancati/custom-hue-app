package M1;

import D1.C0744b;
import G1.AbstractC0853a;
import G1.M;
import K7.AbstractC1081v;
import K7.AbstractC1083x;
import K7.AbstractC1085z;
import K7.Y;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: M1.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1198a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1198a f9081c = new C1198a(AbstractC1081v.A(e.f9086d));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC1081v f9082d = AbstractC1081v.E(2, 5, 6);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC1083x f9083e = new AbstractC1083x.a().f(5, 6).f(17, 6).f(7, 6).f(30, 10).f(18, 6).f(6, 8).f(8, 8).f(14, 8).c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f9084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9085b;

    /* JADX INFO: renamed from: M1.a$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public static AbstractC1085z a() {
            AbstractC1085z.a aVarI = new AbstractC1085z.a().i(8, 7);
            int i10 = Build.VERSION.SDK_INT;
            aVarI.i(26, 27);
            if (i10 >= 33) {
                aVarI.a(30);
            }
            return aVarI.l();
        }

        public static boolean b(AudioManager audioManager, C1200c c1200c) {
            AudioDeviceInfo[] devices = c1200c == null ? ((AudioManager) AbstractC0853a.e(audioManager)).getDevices(2) : new AudioDeviceInfo[]{c1200c.f9105a};
            AbstractC1085z abstractC1085zA = a();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (abstractC1085zA.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: M1.a$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {
        public static AbstractC1081v a(C0744b c0744b) {
            AbstractC1081v.a aVarR = AbstractC1081v.r();
            Y it = C1198a.f9083e.keySet().iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int iIntValue = num.intValue();
                if (Build.VERSION.SDK_INT >= M.K(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), c0744b.a().f1674a)) {
                    aVarR.a(num);
                }
            }
            aVarR.a(2);
            return aVarR.k();
        }

        public static int b(int i10, int i11, C0744b c0744b) {
            for (int i12 = 10; i12 > 0; i12--) {
                int iM = M.M(i12);
                if (iM != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(iM).build(), c0744b.a().f1674a)) {
                    return i12;
                }
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: M1.a$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d {
        public static C1198a a(AudioManager audioManager, C0744b c0744b) {
            return new C1198a(C1198a.c(audioManager.getDirectProfilesForAttributes(c0744b.a().f1674a)));
        }

        public static C1200c b(AudioManager audioManager, C0744b c0744b) {
            List<AudioDeviceInfo> audioDevicesForAttributes = ((AudioManager) AbstractC0853a.e(audioManager)).getAudioDevicesForAttributes(c0744b.a().f1674a);
            if (audioDevicesForAttributes.isEmpty()) {
                return null;
            }
            return new C1200c(audioDevicesForAttributes.get(0));
        }
    }

    public static boolean b() {
        String str = Build.MANUFACTURER;
        return str.equals("Amazon") || str.equals("Xiaomi");
    }

    public static AbstractC1081v c(List list) {
        HashMap map = new HashMap();
        map.put(2, new HashSet(N7.g.c(12)));
        for (int i10 = 0; i10 < list.size(); i10++) {
            AudioProfile audioProfile = (AudioProfile) list.get(i10);
            if (audioProfile.getEncapsulationType() != 1) {
                int format = audioProfile.getFormat();
                if (M.D0(format) || f9083e.containsKey(Integer.valueOf(format))) {
                    if (map.containsKey(Integer.valueOf(format))) {
                        ((Set) AbstractC0853a.e((Set) map.get(Integer.valueOf(format)))).addAll(N7.g.c(audioProfile.getChannelMasks()));
                    } else {
                        map.put(Integer.valueOf(format), new HashSet(N7.g.c(audioProfile.getChannelMasks())));
                    }
                }
            }
        }
        AbstractC1081v.a aVarR = AbstractC1081v.r();
        for (Map.Entry entry : map.entrySet()) {
            aVarR.a(new e(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return aVarR.k();
    }

    public static AbstractC1081v d(int[] iArr, int i10) {
        AbstractC1081v.a aVarR = AbstractC1081v.r();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i11 : iArr) {
            aVarR.a(new e(i11, i10));
        }
        return aVarR.k();
    }

    public static C1198a e(Context context, C0744b c0744b, C1200c c1200c) {
        return f(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), c0744b, c1200c);
    }

    public static C1198a f(Context context, Intent intent, C0744b c0744b, C1200c c1200c) {
        AudioManager audioManagerC = E1.c.c(context);
        if (c1200c == null) {
            c1200c = Build.VERSION.SDK_INT >= 33 ? d.b(audioManagerC, c0744b) : null;
        }
        if (Build.VERSION.SDK_INT >= 33 && (M.H0(context) || M.A0(context))) {
            return d.a(audioManagerC, c0744b);
        }
        if (b.b(audioManagerC, c1200c)) {
            return f9081c;
        }
        AbstractC1085z.a aVar = new AbstractC1085z.a();
        aVar.a(2);
        if (M.H0(context) || M.A0(context)) {
            aVar.j(c.a(c0744b));
            return new C1198a(d(N7.g.o(aVar.l()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z10 = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if ((z10 || b()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            aVar.j(f9082d);
        }
        if (intent == null || z10 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new C1198a(d(N7.g.o(aVar.l()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            aVar.j(N7.g.c(intArrayExtra));
        }
        return new C1198a(d(N7.g.o(aVar.l()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    public static int g(int i10) {
        return M.M(i10);
    }

    public static Uri i() {
        if (b()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1198a)) {
            return false;
        }
        C1198a c1198a = (C1198a) obj;
        return M.s(this.f9084a, c1198a.f9084a) && this.f9085b == c1198a.f9085b;
    }

    public Pair h(D1.o oVar, C0744b c0744b) {
        int iF = D1.v.f((String) AbstractC0853a.e(oVar.f1805o), oVar.f1801k);
        if (!f9083e.containsKey(Integer.valueOf(iF))) {
            return null;
        }
        if (iF == 18 && !k(18)) {
            iF = 6;
        } else if ((iF == 8 && !k(8)) || (iF == 30 && !k(30))) {
            iF = 7;
        }
        if (!k(iF)) {
            return null;
        }
        e eVar = (e) AbstractC0853a.e((e) this.f9084a.get(iF));
        int iB = oVar.f1780G;
        if (iB == -1 || iF == 18) {
            int i10 = oVar.f1781H;
            if (i10 == -1) {
                i10 = 48000;
            }
            iB = eVar.b(i10, c0744b);
        } else if (!oVar.f1805o.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
            if (!eVar.c(iB)) {
                return null;
            }
        } else if (iB > 10) {
            return null;
        }
        int iG = g(iB);
        if (iG == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iF), Integer.valueOf(iG));
    }

    public int hashCode() {
        return this.f9085b + (M.t(this.f9084a) * 31);
    }

    public boolean j(D1.o oVar, C0744b c0744b) {
        return h(oVar, c0744b) != null;
    }

    public boolean k(int i10) {
        return M.q(this.f9084a, i10);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f9085b + ", audioProfiles=" + this.f9084a + "]";
    }

    public C1198a(List list) {
        this.f9084a = new SparseArray();
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = (e) list.get(i10);
            this.f9084a.put(eVar.f9087a, eVar);
        }
        int iMax = 0;
        for (int i11 = 0; i11 < this.f9084a.size(); i11++) {
            iMax = Math.max(iMax, ((e) this.f9084a.valueAt(i11)).f9088b);
        }
        this.f9085b = iMax;
    }

    /* JADX INFO: renamed from: M1.a$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f9086d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9088b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AbstractC1085z f9089c;

        static {
            f9086d = Build.VERSION.SDK_INT >= 33 ? new e(2, a(10)) : new e(2, 10);
        }

        public e(int i10, Set set) {
            this.f9087a = i10;
            AbstractC1085z abstractC1085zT = AbstractC1085z.t(set);
            this.f9089c = abstractC1085zT;
            Y it = abstractC1085zT.iterator();
            int iMax = 0;
            while (it.hasNext()) {
                iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
            }
            this.f9088b = iMax;
        }

        public static AbstractC1085z a(int i10) {
            AbstractC1085z.a aVar = new AbstractC1085z.a();
            for (int i11 = 1; i11 <= i10; i11++) {
                aVar.a(Integer.valueOf(M.M(i11)));
            }
            return aVar.l();
        }

        public int b(int i10, C0744b c0744b) {
            return this.f9089c != null ? this.f9088b : c.b(this.f9087a, i10, c0744b);
        }

        public boolean c(int i10) {
            if (this.f9089c == null) {
                return i10 <= this.f9088b;
            }
            int iM = M.M(i10);
            if (iM == 0) {
                return false;
            }
            return this.f9089c.contains(Integer.valueOf(iM));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f9087a == eVar.f9087a && this.f9088b == eVar.f9088b && Objects.equals(this.f9089c, eVar.f9089c);
        }

        public int hashCode() {
            int i10 = ((this.f9087a * 31) + this.f9088b) * 31;
            AbstractC1085z abstractC1085z = this.f9089c;
            return i10 + (abstractC1085z == null ? 0 : abstractC1085z.hashCode());
        }

        public String toString() {
            return "AudioProfile[format=" + this.f9087a + ", maxChannelCount=" + this.f9088b + ", channelMasks=" + this.f9089c + "]";
        }

        public e(int i10, int i11) {
            this.f9087a = i10;
            this.f9088b = i11;
            this.f9089c = null;
        }
    }
}
