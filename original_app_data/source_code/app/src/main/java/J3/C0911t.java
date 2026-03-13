package J3;

import android.content.Context;
import f3.AbstractC3989b;
import kotlin.jvm.internal.AbstractC4862t;
import l3.InterfaceC4877c;

/* JADX INFO: renamed from: J3.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C0911t extends AbstractC3989b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f6089c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0911t(Context mContext, int i10, int i11) {
        super(i10, i11);
        AbstractC4862t.e(mContext, "mContext");
        this.f6089c = mContext;
    }

    @Override // f3.AbstractC3989b
    public void b(InterfaceC4877c db2) {
        AbstractC4862t.e(db2, "db");
        if (this.f34133b >= 10) {
            db2.Q("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
        } else {
            this.f6089c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
