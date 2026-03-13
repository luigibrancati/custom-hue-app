package I3;

import android.app.Notification;

/* JADX INFO: renamed from: I3.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C0880j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Notification f5620c;

    public C0880j(int i10, Notification notification, int i11) {
        this.f5618a = i10;
        this.f5620c = notification;
        this.f5619b = i11;
    }

    public int a() {
        return this.f5619b;
    }

    public Notification b() {
        return this.f5620c;
    }

    public int c() {
        return this.f5618a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0880j.class != obj.getClass()) {
            return false;
        }
        C0880j c0880j = (C0880j) obj;
        if (this.f5618a == c0880j.f5618a && this.f5619b == c0880j.f5619b) {
            return this.f5620c.equals(c0880j.f5620c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f5618a * 31) + this.f5619b) * 31) + this.f5620c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f5618a + ", mForegroundServiceType=" + this.f5619b + ", mNotification=" + this.f5620c + '}';
    }
}
