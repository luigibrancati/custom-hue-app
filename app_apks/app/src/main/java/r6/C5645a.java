package r6;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: r6.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5645a extends AbstractC6157a {
    public static final Parcelable.Creator<C5645a> CREATOR = new C5648d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f43753a;

    public C5645a(Intent intent) {
        this.f43753a = intent;
    }

    public Intent d() {
        return this.f43753a;
    }

    public String e() {
        String stringExtra = this.f43753a.getStringExtra("google.message_id");
        return stringExtra == null ? this.f43753a.getStringExtra("message_id") : stringExtra;
    }

    public final Integer f() {
        if (this.f43753a.hasExtra("google.product_id")) {
            return Integer.valueOf(this.f43753a.getIntExtra("google.product_id", 0));
        }
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.u(parcel, 1, this.f43753a, i10, false);
        w6.c.b(parcel, iA);
    }
}
