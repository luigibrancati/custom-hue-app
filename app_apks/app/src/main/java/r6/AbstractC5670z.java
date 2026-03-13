package r6;

import android.os.Bundle;
import android.util.Log;
import b7.C2878l;

/* JADX INFO: renamed from: r6.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5670z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2878l f43801b = new C2878l();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f43803d;

    public AbstractC5670z(int i10, int i11, Bundle bundle) {
        this.f43800a = i10;
        this.f43802c = i11;
        this.f43803d = bundle;
    }

    public abstract void a(Bundle bundle);

    public abstract boolean b();

    public final void c(C5638A c5638a) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + c5638a.toString());
        }
        this.f43801b.b(c5638a);
    }

    public final void d(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(obj));
        }
        this.f43801b.c(obj);
    }

    public final String toString() {
        return "Request { what=" + this.f43802c + " id=" + this.f43800a + " oneWay=" + b() + "}";
    }
}
