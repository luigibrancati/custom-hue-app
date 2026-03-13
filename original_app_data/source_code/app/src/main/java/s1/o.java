package s1;

import androidx.fragment.app.ComponentCallbacksC2736q;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class o extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ComponentCallbacksC2736q f43997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43998c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ComponentCallbacksC2736q fragment, ComponentCallbacksC2736q expectedParentFragment, int i10) {
        super(fragment, "Attempting to nest fragment " + fragment + " within the view of parent fragment " + expectedParentFragment + " via container with ID " + i10 + " without using parent's childFragmentManager");
        AbstractC4862t.e(fragment, "fragment");
        AbstractC4862t.e(expectedParentFragment, "expectedParentFragment");
        this.f43997b = expectedParentFragment;
        this.f43998c = i10;
    }
}
