package g;

import android.content.Context;
import android.content.Intent;
import f.C3982a;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC4051a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f34784a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    @Override // g.AbstractC4051a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, Intent input) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(input, "input");
        return input;
    }

    @Override // g.AbstractC4051a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public C3982a c(int i10, Intent intent) {
        return new C3982a(i10, intent);
    }
}
