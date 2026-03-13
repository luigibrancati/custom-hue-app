package X6;

import android.content.SharedPreferences;
import android.util.Pair;
import java.util.Objects;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class L2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ N2 f18399e;

    public /* synthetic */ L2(N2 n22, String str, long j10, byte[] bArr) {
        Objects.requireNonNull(n22);
        this.f18399e = n22;
        AbstractC6056k.f("health_monitor");
        AbstractC6056k.a(j10 > 0);
        this.f18395a = "health_monitor:start";
        this.f18396b = "health_monitor:count";
        this.f18397c = "health_monitor:value";
        this.f18398d = j10;
    }

    public final void a(String str, long j10) {
        N2 n22 = this.f18399e;
        n22.h();
        if (d() == 0) {
            c();
        }
        if (str == null) {
            str = "";
        }
        SharedPreferences sharedPreferencesP = n22.p();
        String str2 = this.f18396b;
        long j11 = sharedPreferencesP.getLong(str2, 0L);
        if (j11 <= 0) {
            SharedPreferences.Editor editorEdit = n22.p().edit();
            editorEdit.putString(this.f18397c, str);
            editorEdit.putLong(str2, 1L);
            editorEdit.apply();
            return;
        }
        long jNextLong = n22.f18400a.C().q0().nextLong() & Long.MAX_VALUE;
        long j12 = j11 + 1;
        long j13 = Long.MAX_VALUE / j12;
        SharedPreferences.Editor editorEdit2 = n22.p().edit();
        if (jNextLong < j13) {
            editorEdit2.putString(this.f18397c, str);
        }
        editorEdit2.putLong(str2, j12);
        editorEdit2.apply();
    }

    public final Pair b() {
        long jAbs;
        N2 n22 = this.f18399e;
        n22.h();
        n22.h();
        long jD = d();
        if (jD == 0) {
            c();
            jAbs = 0;
        } else {
            jAbs = Math.abs(jD - n22.f18400a.e().a());
        }
        long j10 = this.f18398d;
        if (jAbs < j10) {
            return null;
        }
        if (jAbs > j10 + j10) {
            c();
            return null;
        }
        String string = n22.p().getString(this.f18397c, null);
        long j11 = n22.p().getLong(this.f18396b, 0L);
        c();
        return (string == null || j11 <= 0) ? N2.f18421A : new Pair(string, Long.valueOf(j11));
    }

    public final void c() {
        N2 n22 = this.f18399e;
        n22.h();
        long jA = n22.f18400a.e().a();
        SharedPreferences.Editor editorEdit = n22.p().edit();
        editorEdit.remove(this.f18396b);
        editorEdit.remove(this.f18397c);
        editorEdit.putLong(this.f18395a, jA);
        editorEdit.apply();
    }

    public final long d() {
        return this.f18399e.p().getLong(this.f18395a, 0L);
    }
}
