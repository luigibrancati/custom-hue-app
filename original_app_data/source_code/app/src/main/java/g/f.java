package g;

import android.content.Context;
import android.content.Intent;
import g.AbstractC4051a;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractC4051a {
    @Override // g.AbstractC4051a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, String input) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(input, "input");
        return e.f34783a.a(new String[]{input});
    }

    @Override // g.AbstractC4051a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public AbstractC4051a.C0450a b(Context context, String input) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(input, "input");
        if (L0.a.a(context, input) == 0) {
            return new AbstractC4051a.C0450a(Boolean.TRUE);
        }
        return null;
    }

    @Override // g.AbstractC4051a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Boolean c(int i10, Intent intent) {
        if (intent == null || i10 != -1) {
            return Boolean.FALSE;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        boolean z10 = false;
        if (intArrayExtra != null) {
            int length = intArrayExtra.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                if (intArrayExtra[i11] == 0) {
                    z10 = true;
                    break;
                }
                i11++;
            }
        }
        return Boolean.valueOf(z10);
    }
}
