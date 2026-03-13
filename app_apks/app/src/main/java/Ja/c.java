package Ja;

import android.app.Activity;
import com.spotify.sdk.android.auth.b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class c implements com.spotify.sdk.android.auth.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f6370a;

    @Override // com.spotify.sdk.android.auth.b
    public boolean a(Activity activity, com.spotify.sdk.android.auth.c cVar) {
        d dVar = new d(activity, cVar, new b());
        this.f6370a = dVar;
        return dVar.b();
    }

    @Override // com.spotify.sdk.android.auth.b
    public boolean b() {
        return false;
    }

    @Override // com.spotify.sdk.android.auth.b
    public void stop() {
        d dVar = this.f6370a;
        if (dVar != null) {
            dVar.c();
        }
    }

    @Override // com.spotify.sdk.android.auth.b
    public void c(b.a aVar) {
    }
}
