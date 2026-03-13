package r6;

import android.util.Log;
import java.util.Objects;

/* JADX INFO: renamed from: r6.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5655k extends ClassLoader {
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z10) {
        if (!Objects.equals(str, "com.google.android.gms.iid.MessengerCompat")) {
            return super.loadClass(str, z10);
        }
        if (!Log.isLoggable("CloudMessengerCompat", 3)) {
            return com.google.android.gms.cloudmessaging.a.class;
        }
        Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
        return com.google.android.gms.cloudmessaging.a.class;
    }
}
