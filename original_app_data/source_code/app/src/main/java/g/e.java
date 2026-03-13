package g;

import Bc.k;
import android.content.Context;
import android.content.Intent;
import fc.AbstractC4040w;
import fc.C4034q;
import g.AbstractC4051a;
import gc.C4179C;
import gc.C4204q;
import gc.P;
import gc.Q;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e extends AbstractC4051a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f34783a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final Intent a(String[] input) {
            AbstractC4862t.e(input, "input");
            Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
            AbstractC4862t.d(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }

        public a() {
        }
    }

    @Override // g.AbstractC4051a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, String[] input) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(input, "input");
        return f34783a.a(input);
    }

    @Override // g.AbstractC4051a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public AbstractC4051a.C0450a b(Context context, String[] input) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(input, "input");
        if (input.length == 0) {
            return new AbstractC4051a.C0450a(Q.i());
        }
        for (String str : input) {
            if (L0.a.a(context, str) != 0) {
                return null;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(k.e(P.e(input.length), 16));
        for (String str2 : input) {
            C4034q c4034qA = AbstractC4040w.a(str2, Boolean.TRUE);
            linkedHashMap.put(c4034qA.e(), c4034qA.f());
        }
        return new AbstractC4051a.C0450a(linkedHashMap);
    }

    @Override // g.AbstractC4051a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Map c(int i10, Intent intent) {
        if (i10 != -1) {
            return Q.i();
        }
        if (intent == null) {
            return Q.i();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return Q.i();
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i11 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i11 == 0));
        }
        return Q.s(C4179C.d1(C4204q.S(stringArrayExtra), arrayList));
    }
}
