package R3;

import Q3.C1863h;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import kotlin.jvm.internal.AbstractC4862t;
import l3.InterfaceC4877c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static final void c(Context context, InterfaceC4877c sqLiteDatabase) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(sqLiteDatabase, "sqLiteDatabase");
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i10 = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i11 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            sqLiteDatabase.v();
            try {
                sqLiteDatabase.Q("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i10)});
                sqLiteDatabase.Q("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i11)});
                sharedPreferences.edit().clear().apply();
                sqLiteDatabase.P();
            } finally {
                sqLiteDatabase.V();
            }
        }
    }

    public static final int d(WorkDatabase workDatabase, String str) {
        Long lA = workDatabase.S().a(str);
        int iLongValue = lA != null ? (int) lA.longValue() : 0;
        e(workDatabase, str, iLongValue != Integer.MAX_VALUE ? iLongValue + 1 : 0);
        return iLongValue;
    }

    public static final void e(WorkDatabase workDatabase, String str, int i10) {
        workDatabase.S().b(new C1863h(str, Long.valueOf(i10)));
    }
}
