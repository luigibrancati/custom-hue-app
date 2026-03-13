package z4;

import android.content.SharedPreferences;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: z4.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6505d implements N4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f48746a;

    public C6505d(SharedPreferences sharedPreferences) {
        AbstractC4862t.e(sharedPreferences, "sharedPreferences");
        this.f48746a = sharedPreferences;
    }

    @Override // N4.b
    public void a(String key) {
        AbstractC4862t.e(key, "key");
        this.f48746a.edit().remove(key).commit();
    }

    @Override // N4.b
    public long getLong(String key, long j10) {
        AbstractC4862t.e(key, "key");
        return this.f48746a.getLong(key, j10);
    }

    @Override // N4.b
    public boolean putLong(String key, long j10) {
        AbstractC4862t.e(key, "key");
        return this.f48746a.edit().putLong(key, j10).commit();
    }
}
