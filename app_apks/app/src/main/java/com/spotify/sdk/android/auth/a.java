package com.spotify.sdk.android.auth;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import com.spotify.sdk.android.auth.b;
import com.spotify.sdk.android.auth.d;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f32676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f32677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.spotify.sdk.android.auth.b f32678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f32679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f32680e;

    /* JADX INFO: renamed from: com.spotify.sdk.android.auth.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C0392a implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.spotify.sdk.android.auth.b f32681a;

        public C0392a(com.spotify.sdk.android.auth.b bVar) {
            this.f32681a = bVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        void a();

        void b(d dVar);
    }

    public a(Activity activity) {
        ArrayList arrayList = new ArrayList();
        this.f32679d = arrayList;
        this.f32676a = activity;
        arrayList.add(new Ja.c());
        this.f32679d.add(new Ia.a().a());
    }

    public static Intent e(Activity activity, c cVar) {
        Intent intentC = LoginActivity.c(activity, cVar);
        intentC.addFlags(67108864);
        return intentC;
    }

    public static d f(int i10, Intent intent) {
        return (i10 != -1 || LoginActivity.e(intent) == null) ? new d.b().g(d.c.EMPTY).a() : LoginActivity.e(intent);
    }

    public static void h(Activity activity, int i10, c cVar) {
        activity.startActivityForResult(e(activity, cVar), i10);
    }

    public void a(c cVar) {
        if (this.f32677b) {
            return;
        }
        this.f32677b = true;
        for (com.spotify.sdk.android.auth.b bVar : this.f32679d) {
            if (k(bVar, cVar)) {
                this.f32678c = bVar;
                return;
            }
        }
    }

    public void b() {
        if (this.f32677b) {
            this.f32677b = false;
            c(this.f32678c);
            b bVar = this.f32680e;
            if (bVar != null) {
                bVar.a();
                this.f32680e = null;
            }
        }
    }

    public final void c(com.spotify.sdk.android.auth.b bVar) {
        if (bVar != null) {
            bVar.c(null);
            bVar.stop();
        }
    }

    public void d(d dVar) {
        i(this.f32678c, dVar);
    }

    public void g() {
        com.spotify.sdk.android.auth.b bVar = this.f32678c;
        if (bVar == null || !bVar.b()) {
            return;
        }
        Log.i("Spotify Auth Client", "Spotify auth response: User cancelled");
        d(new d.b().g(d.c.EMPTY).a());
    }

    public final void i(com.spotify.sdk.android.auth.b bVar, d dVar) {
        this.f32677b = false;
        c(bVar);
        b bVar2 = this.f32680e;
        if (bVar2 == null) {
            Log.w("Spotify Auth Client", "Can't deliver the Spotify Auth response. The listener is null");
        } else {
            bVar2.b(dVar);
            this.f32680e = null;
        }
    }

    public void j(b bVar) {
        this.f32680e = bVar;
    }

    public final boolean k(com.spotify.sdk.android.auth.b bVar, c cVar) {
        bVar.c(new C0392a(bVar));
        if (bVar.a(this.f32676a, cVar)) {
            return true;
        }
        c(bVar);
        return false;
    }
}
