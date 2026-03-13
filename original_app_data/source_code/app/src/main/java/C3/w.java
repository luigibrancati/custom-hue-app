package C3;

import Y0.S;
import android.app.Activity;
import android.content.Context;
import gc.C4206t;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class w implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G3.c f1150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f1151c;

    public w() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // C3.v
    public t b(Activity activity) {
        AbstractC4862t.e(activity, "activity");
        return G3.f.f4467a.a().b(activity, this.f1150b);
    }

    public t c(Context context) {
        AbstractC4862t.e(context, "context");
        return G3.f.f4467a.a().a(context, this.f1150b);
    }

    public w(G3.c densityCompatHelper) {
        AbstractC4862t.e(densityCompatHelper, "densityCompatHelper");
        this.f1150b = densityCompatHelper;
        this.f1151c = C4206t.f(Integer.valueOf(S.o.g()), Integer.valueOf(S.o.f()), Integer.valueOf(S.o.a()), Integer.valueOf(S.o.c()), Integer.valueOf(S.o.i()), Integer.valueOf(S.o.e()), Integer.valueOf(S.o.j()), Integer.valueOf(S.o.b()));
    }

    public /* synthetic */ w(G3.c cVar, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? G3.c.f4463a.a() : cVar);
    }
}
