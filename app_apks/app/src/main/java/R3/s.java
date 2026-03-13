package R3;

import Q3.C1863h;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import l3.InterfaceC4877c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkDatabase f14543a;

    public s(WorkDatabase workDatabase) {
        this.f14543a = workDatabase;
    }

    public static void c(Context context, InterfaceC4877c interfaceC4877c) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j10 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j11 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            interfaceC4877c.v();
            try {
                interfaceC4877c.Q("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j10)});
                interfaceC4877c.Q("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j11)});
                sharedPreferences.edit().clear().apply();
                interfaceC4877c.P();
            } finally {
                interfaceC4877c.V();
            }
        }
    }

    public long a() {
        Long lA = this.f14543a.S().a("last_force_stop_ms");
        if (lA != null) {
            return lA.longValue();
        }
        return 0L;
    }

    public boolean b() {
        Long lA = this.f14543a.S().a("reschedule_needed");
        return lA != null && lA.longValue() == 1;
    }

    public void d(long j10) {
        this.f14543a.S().b(new C1863h("last_force_stop_ms", Long.valueOf(j10)));
    }

    public void e(boolean z10) {
        this.f14543a.S().b(new C1863h("reschedule_needed", z10));
    }
}
