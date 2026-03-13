package s1;

import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC2736q;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class n extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f43996b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ComponentCallbacksC2736q fragment, ViewGroup container) {
        super(fragment, "Attempting to add fragment " + fragment + " to container " + container + " which is not a FragmentContainerView");
        AbstractC4862t.e(fragment, "fragment");
        AbstractC4862t.e(container, "container");
        this.f43996b = container;
    }
}
