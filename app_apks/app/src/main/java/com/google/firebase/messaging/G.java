package com.google.firebase.messaging;

import M8.j;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import b7.InterfaceC2869c;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import h8.C4288f;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import r6.C5647c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4288f f31611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L f31612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5647c f31613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final O8.b f31614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final O8.b f31615e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final P8.h f31616f;

    public G(C4288f c4288f, L l10, O8.b bVar, O8.b bVar2, P8.h hVar) {
        this(c4288f, l10, new C5647c(c4288f.m()), bVar, bVar2, hVar);
    }

    public static /* synthetic */ String a(G g10, Task task) {
        g10.getClass();
        return g10.h((Bundle) task.n(IOException.class));
    }

    public static String b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    public static boolean i(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    public Task c() {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return d(l(L.c(this.f31611a), "*", bundle));
    }

    public final Task d(Task task) {
        return task.j(new X2.g(), new InterfaceC2869c() { // from class: com.google.firebase.messaging.F
            @Override // b7.InterfaceC2869c
            public final Object a(Task task2) {
                return G.a(this.f31605a, task2);
            }
        });
    }

    public final String e() {
        try {
            return b(MessageDigest.getInstance("SHA-1").digest(this.f31611a.q().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    public Task f() {
        return this.f31613c.a();
    }

    public Task g() {
        return d(l(L.c(this.f31611a), "*", new Bundle()));
    }

    public final String h(Bundle bundle) throws IOException {
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    public final void j(String str, String str2, Bundle bundle) {
        j.a aVarB;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.f31611a.r().c());
        bundle.putString("gmsv", Integer.toString(this.f31612b.d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f31612b.a());
        bundle.putString("app_ver_name", this.f31612b.b());
        bundle.putString("firebase-app-name-hash", e());
        try {
            String strB = ((P8.m) Tasks.await(this.f31616f.a(false))).b();
            if (TextUtils.isEmpty(strB)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", strB);
            }
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e10);
        }
        bundle.putString("appid", (String) Tasks.await(this.f31616f.getId()));
        bundle.putString("cliv", "fcm-25.0.1");
        M8.j jVar = (M8.j) this.f31615e.get();
        j9.i iVar = (j9.i) this.f31614d.get();
        if (jVar == null || iVar == null || (aVarB = jVar.b("fire-iid")) == j.a.NONE) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(aVarB.b()));
        bundle.putString("Firebase-Client", iVar.a());
    }

    public Task k(boolean z10) {
        return this.f31613c.d(z10);
    }

    public final Task l(String str, String str2, Bundle bundle) {
        try {
            j(str, str2, bundle);
            return this.f31613c.c(bundle);
        } catch (InterruptedException | ExecutionException e10) {
            return Tasks.d(e10);
        }
    }

    public Task m(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return d(l(str, "/topics/" + str2, bundle));
    }

    public Task n(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", "1");
        return d(l(str, "/topics/" + str2, bundle));
    }

    public G(C4288f c4288f, L l10, C5647c c5647c, O8.b bVar, O8.b bVar2, P8.h hVar) {
        this.f31611a = c4288f;
        this.f31612b = l10;
        this.f31613c = c5647c;
        this.f31614d = bVar;
        this.f31615e = bVar2;
        this.f31616f = hVar;
    }
}
