package s1;

import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC2736q;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: s1.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5707d extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f43991b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5707d(ComponentCallbacksC2736q fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
        AbstractC4862t.e(fragment, "fragment");
        this.f43991b = viewGroup;
    }
}
