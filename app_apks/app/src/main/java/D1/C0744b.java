package D1;

import G1.M;
import android.media.AudioAttributes;
import android.os.Build;

/* JADX INFO: renamed from: D1.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C0744b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0744b f1660h = new e().a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f1661i = M.z0(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f1662j = M.z0(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f1663k = M.z0(2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f1664l = M.z0(3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f1665m = M.z0(4);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f1666n = M.z0(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f1672f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f1673g;

    /* JADX INFO: renamed from: D1.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0035b {
        public static void a(AudioAttributes.Builder builder, int i10) {
            builder.setAllowedCapturePolicy(i10);
        }
    }

    /* JADX INFO: renamed from: D1.b$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {
        public static void a(AudioAttributes.Builder builder, boolean z10) {
            builder.setIsContentSpatialized(z10);
        }

        public static void b(AudioAttributes.Builder builder, int i10) {
            builder.setSpatializationBehavior(i10);
        }
    }

    /* JADX INFO: renamed from: D1.b$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioAttributes f1674a;

        public d(C0744b c0744b) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c0744b.f1667a).setFlags(c0744b.f1668b).setUsage(c0744b.f1669c);
            int i10 = Build.VERSION.SDK_INT;
            C0035b.a(usage, c0744b.f1670d);
            if (i10 >= 32) {
                c.b(usage, c0744b.f1671e);
                c.a(usage, c0744b.f1672f);
            }
            this.f1674a = usage.build();
        }
    }

    /* JADX INFO: renamed from: D1.b$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1675a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1676b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1677c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f1678d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1679e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f1680f = false;

        public C0744b a() {
            return new C0744b(this.f1675a, this.f1676b, this.f1677c, this.f1678d, this.f1679e, this.f1680f);
        }

        public e b(int i10) {
            this.f1675a = i10;
            return this;
        }
    }

    public d a() {
        if (this.f1673g == null) {
            this.f1673g = new d();
        }
        return this.f1673g;
    }

    public int b() {
        if ((this.f1668b & 1) == 1) {
            return 1;
        }
        switch (this.f1669c) {
        }
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0744b.class == obj.getClass()) {
            C0744b c0744b = (C0744b) obj;
            if (this.f1667a == c0744b.f1667a && this.f1668b == c0744b.f1668b && this.f1669c == c0744b.f1669c && this.f1670d == c0744b.f1670d && this.f1671e == c0744b.f1671e && this.f1672f == c0744b.f1672f) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((527 + this.f1667a) * 31) + this.f1668b) * 31) + this.f1669c) * 31) + this.f1670d) * 31) + this.f1671e) * 31) + (this.f1672f ? 1 : 0);
    }

    public C0744b(int i10, int i11, int i12, int i13, int i14, boolean z10) {
        this.f1667a = i10;
        this.f1668b = i11;
        this.f1669c = i12;
        this.f1670d = i13;
        this.f1671e = i14;
        this.f1672f = z10;
    }
}
