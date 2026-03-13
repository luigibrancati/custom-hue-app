package s1;

import androidx.fragment.app.ComponentCallbacksC2736q;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class j extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ComponentCallbacksC2736q f43992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43993c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ComponentCallbacksC2736q fragment, ComponentCallbacksC2736q targetFragment, int i10) {
        super(fragment, "Attempting to set target fragment " + targetFragment + " with request code " + i10 + " for fragment " + fragment);
        AbstractC4862t.e(fragment, "fragment");
        AbstractC4862t.e(targetFragment, "targetFragment");
        this.f43992b = targetFragment;
        this.f43993c = i10;
    }
}
