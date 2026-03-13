package s1;

import androidx.fragment.app.ComponentCallbacksC2736q;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class k extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f43994b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ComponentCallbacksC2736q fragment, boolean z10) {
        super(fragment, "Attempting to set user visible hint to " + z10 + " for fragment " + fragment);
        AbstractC4862t.e(fragment, "fragment");
        this.f43994b = z10;
    }
}
