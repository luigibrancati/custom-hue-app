package s1;

import androidx.fragment.app.ComponentCallbacksC2736q;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: s1.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5704a extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f43982b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5704a(ComponentCallbacksC2736q fragment, String previousFragmentId) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + previousFragmentId);
        AbstractC4862t.e(fragment, "fragment");
        AbstractC4862t.e(previousFragmentId, "previousFragmentId");
        this.f43982b = previousFragmentId;
    }
}
