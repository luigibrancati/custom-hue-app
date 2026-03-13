package s1;

import androidx.fragment.app.ComponentCallbacksC2736q;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class m extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComponentCallbacksC2736q f43995a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ComponentCallbacksC2736q fragment, String str) {
        super(str);
        AbstractC4862t.e(fragment, "fragment");
        this.f43995a = fragment;
    }

    public final ComponentCallbacksC2736q a() {
        return this.f43995a;
    }
}
