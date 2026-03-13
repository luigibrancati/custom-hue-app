package s6;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.Objects;

/* JADX INFO: renamed from: s6.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class HandlerC5792k extends H6.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f44172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GoogleApiAvailability f44173c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC5792k(GoogleApiAvailability googleApiAvailability, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        Objects.requireNonNull(googleApiAvailability);
        this.f44173c = googleApiAvailability;
        this.f44172b = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 39);
            sb2.append("Don't know how to handle this message: ");
            sb2.append(i10);
            Log.w("GoogleApiAvailability", sb2.toString());
            return;
        }
        GoogleApiAvailability googleApiAvailability = this.f44173c;
        Context context = this.f44172b;
        int iG = googleApiAvailability.g(context);
        if (googleApiAvailability.j(iG)) {
            googleApiAvailability.o(context, iG);
        }
    }
}
