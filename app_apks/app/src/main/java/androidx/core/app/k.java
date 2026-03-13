package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.provider.Settings;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f22483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f22485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f22486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f22487f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Uri f22488g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AudioAttributes f22489h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f22490i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f22491j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f22492k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long[] f22493l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f22494m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f22495n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f22496o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f22497p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f22498q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f22499r;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {
        public static boolean a(NotificationChannel notificationChannel) {
            return notificationChannel.canBypassDnd();
        }

        public static boolean b(NotificationChannel notificationChannel) {
            return notificationChannel.canShowBadge();
        }

        public static NotificationChannel c(String str, CharSequence charSequence, int i10) {
            return new NotificationChannel(str, charSequence, i10);
        }

        public static void d(NotificationChannel notificationChannel, boolean z10) {
            notificationChannel.enableLights(z10);
        }

        public static void e(NotificationChannel notificationChannel, boolean z10) {
            notificationChannel.enableVibration(z10);
        }

        public static AudioAttributes f(NotificationChannel notificationChannel) {
            return notificationChannel.getAudioAttributes();
        }

        public static String g(NotificationChannel notificationChannel) {
            return notificationChannel.getDescription();
        }

        public static String h(NotificationChannel notificationChannel) {
            return notificationChannel.getGroup();
        }

        public static String i(NotificationChannel notificationChannel) {
            return notificationChannel.getId();
        }

        public static int j(NotificationChannel notificationChannel) {
            return notificationChannel.getImportance();
        }

        public static int k(NotificationChannel notificationChannel) {
            return notificationChannel.getLightColor();
        }

        public static int l(NotificationChannel notificationChannel) {
            return notificationChannel.getLockscreenVisibility();
        }

        public static CharSequence m(NotificationChannel notificationChannel) {
            return notificationChannel.getName();
        }

        public static Uri n(NotificationChannel notificationChannel) {
            return notificationChannel.getSound();
        }

        public static long[] o(NotificationChannel notificationChannel) {
            return notificationChannel.getVibrationPattern();
        }

        public static void p(NotificationChannel notificationChannel, String str) {
            notificationChannel.setDescription(str);
        }

        public static void q(NotificationChannel notificationChannel, String str) {
            notificationChannel.setGroup(str);
        }

        public static void r(NotificationChannel notificationChannel, int i10) {
            notificationChannel.setLightColor(i10);
        }

        public static void s(NotificationChannel notificationChannel, boolean z10) {
            notificationChannel.setShowBadge(z10);
        }

        public static void t(NotificationChannel notificationChannel, Uri uri, AudioAttributes audioAttributes) {
            notificationChannel.setSound(uri, audioAttributes);
        }

        public static void u(NotificationChannel notificationChannel, long[] jArr) {
            notificationChannel.setVibrationPattern(jArr);
        }

        public static boolean v(NotificationChannel notificationChannel) {
            return notificationChannel.shouldShowLights();
        }

        public static boolean w(NotificationChannel notificationChannel) {
            return notificationChannel.shouldVibrate();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {
        public static boolean a(NotificationChannel notificationChannel) {
            return notificationChannel.canBubble();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c {
        public static String a(NotificationChannel notificationChannel) {
            return notificationChannel.getConversationId();
        }

        public static String b(NotificationChannel notificationChannel) {
            return notificationChannel.getParentChannelId();
        }

        public static boolean c(NotificationChannel notificationChannel) {
            return notificationChannel.isImportantConversation();
        }

        public static void d(NotificationChannel notificationChannel, String str, String str2) {
            notificationChannel.setConversationId(str, str2);
        }
    }

    public k(String str, int i10) {
        this.f22487f = true;
        this.f22488g = Settings.System.DEFAULT_NOTIFICATION_URI;
        this.f22491j = 0;
        this.f22482a = (String) X0.h.g(str);
        this.f22484c = i10;
        this.f22489h = Notification.AUDIO_ATTRIBUTES_DEFAULT;
    }

    public NotificationChannel a() {
        String str;
        NotificationChannel notificationChannelC = a.c(this.f22482a, this.f22483b, this.f22484c);
        a.p(notificationChannelC, this.f22485d);
        a.q(notificationChannelC, this.f22486e);
        a.s(notificationChannelC, this.f22487f);
        a.t(notificationChannelC, this.f22488g, this.f22489h);
        a.d(notificationChannelC, this.f22490i);
        a.r(notificationChannelC, this.f22491j);
        a.u(notificationChannelC, this.f22493l);
        a.e(notificationChannelC, this.f22492k);
        String str2 = this.f22494m;
        if (str2 != null && (str = this.f22495n) != null) {
            c.d(notificationChannelC, str2, str);
        }
        return notificationChannelC;
    }

    public k(NotificationChannel notificationChannel) {
        this(a.i(notificationChannel), a.j(notificationChannel));
        this.f22483b = a.m(notificationChannel);
        this.f22485d = a.g(notificationChannel);
        this.f22486e = a.h(notificationChannel);
        this.f22487f = a.b(notificationChannel);
        this.f22488g = a.n(notificationChannel);
        this.f22489h = a.f(notificationChannel);
        this.f22490i = a.v(notificationChannel);
        this.f22491j = a.k(notificationChannel);
        this.f22492k = a.w(notificationChannel);
        this.f22493l = a.o(notificationChannel);
        this.f22494m = c.b(notificationChannel);
        this.f22495n = c.a(notificationChannel);
        this.f22496o = a.a(notificationChannel);
        this.f22497p = a.l(notificationChannel);
        this.f22498q = b.a(notificationChannel);
        this.f22499r = c.c(notificationChannel);
    }
}
