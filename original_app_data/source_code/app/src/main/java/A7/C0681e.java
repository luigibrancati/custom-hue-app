package A7;

import android.app.PendingIntent;
import java.util.List;

/* JADX INFO: renamed from: A7.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C0681e extends AbstractC0679c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f191f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f192g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final PendingIntent f193h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f194i;

    public C0681e(int i10, int i11, int i12, long j10, long j11, List list, List list2, PendingIntent pendingIntent, List list3) {
        this.f186a = i10;
        this.f187b = i11;
        this.f188c = i12;
        this.f189d = j10;
        this.f190e = j11;
        this.f191f = list;
        this.f192g = list2;
        this.f193h = pendingIntent;
        this.f194i = list3;
    }

    @Override // A7.AbstractC0679c
    public final long a() {
        return this.f189d;
    }

    @Override // A7.AbstractC0679c
    public final int b() {
        return this.f188c;
    }

    @Override // A7.AbstractC0679c
    public final PendingIntent c() {
        return this.f193h;
    }

    @Override // A7.AbstractC0679c
    public final int d() {
        return this.f186a;
    }

    @Override // A7.AbstractC0679c
    public final int e() {
        return this.f187b;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        PendingIntent pendingIntent;
        List list3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0679c) {
            AbstractC0679c abstractC0679c = (AbstractC0679c) obj;
            if (this.f186a == abstractC0679c.d() && this.f187b == abstractC0679c.e() && this.f188c == abstractC0679c.b() && this.f189d == abstractC0679c.a() && this.f190e == abstractC0679c.f() && ((list = this.f191f) != null ? list.equals(abstractC0679c.h()) : abstractC0679c.h() == null) && ((list2 = this.f192g) != null ? list2.equals(abstractC0679c.g()) : abstractC0679c.g() == null) && ((pendingIntent = this.f193h) != null ? pendingIntent.equals(abstractC0679c.c()) : abstractC0679c.c() == null) && ((list3 = this.f194i) != null ? list3.equals(abstractC0679c.i()) : abstractC0679c.i() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // A7.AbstractC0679c
    public final long f() {
        return this.f190e;
    }

    @Override // A7.AbstractC0679c
    public final List g() {
        return this.f192g;
    }

    @Override // A7.AbstractC0679c
    public final List h() {
        return this.f191f;
    }

    public final int hashCode() {
        int i10 = ((((this.f186a ^ 1000003) * 1000003) ^ this.f187b) * 1000003) ^ this.f188c;
        long j10 = this.f189d;
        long j11 = j10 ^ (j10 >>> 32);
        long j12 = this.f190e;
        long j13 = (j12 >>> 32) ^ j12;
        List list = this.f191f;
        int iHashCode = ((((((i10 * 1000003) ^ ((int) j11)) * 1000003) ^ ((int) j13)) * 1000003) ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f192g;
        int iHashCode2 = (iHashCode ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        PendingIntent pendingIntent = this.f193h;
        int iHashCode3 = (iHashCode2 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        List list3 = this.f194i;
        return iHashCode3 ^ (list3 != null ? list3.hashCode() : 0);
    }

    @Override // A7.AbstractC0679c
    public final List i() {
        return this.f194i;
    }

    public final String toString() {
        return "SplitInstallSessionState{sessionId=" + this.f186a + ", status=" + this.f187b + ", errorCode=" + this.f188c + ", bytesDownloaded=" + this.f189d + ", totalBytesToDownload=" + this.f190e + ", moduleNamesNullable=" + String.valueOf(this.f191f) + ", languagesNullable=" + String.valueOf(this.f192g) + ", resolutionIntent=" + String.valueOf(this.f193h) + ", splitFileIntents=" + String.valueOf(this.f194i) + "}";
    }
}
