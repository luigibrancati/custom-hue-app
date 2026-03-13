package w7;

import android.app.PendingIntent;

/* JADX INFO: renamed from: w7.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6162e extends AbstractC6159b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PendingIntent f46309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f46310b;

    public C6162e(PendingIntent pendingIntent, boolean z10) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null pendingIntent");
        }
        this.f46309a = pendingIntent;
        this.f46310b = z10;
    }

    @Override // w7.AbstractC6159b
    public final PendingIntent a() {
        return this.f46309a;
    }

    @Override // w7.AbstractC6159b
    public final boolean b() {
        return this.f46310b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6159b) {
            AbstractC6159b abstractC6159b = (AbstractC6159b) obj;
            if (this.f46309a.equals(abstractC6159b.a()) && this.f46310b == abstractC6159b.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.f46310b ? 1237 : 1231) ^ ((this.f46309a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ReviewInfo{pendingIntent=" + this.f46309a.toString() + ", isNoOp=" + this.f46310b + "}";
    }
}
