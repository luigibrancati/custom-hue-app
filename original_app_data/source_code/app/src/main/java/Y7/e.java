package Y7;

import P7.q;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import e8.C3952C;
import e8.t;
import f8.k;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences.Editor f19824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19825b;

    public e(Context context, String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        this.f19825b = str;
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.f19824a = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            this.f19824a = applicationContext.getSharedPreferences(str2, 0).edit();
        }
    }

    @Override // P7.q
    public void a(C3952C c3952c) throws IOException {
        if (!this.f19824a.putString(this.f19825b, k.b(c3952c.g())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    @Override // P7.q
    public void b(t tVar) throws IOException {
        if (!this.f19824a.putString(this.f19825b, k.b(tVar.g())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
