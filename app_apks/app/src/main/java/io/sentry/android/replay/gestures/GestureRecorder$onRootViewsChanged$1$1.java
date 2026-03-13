package io.sentry.android.replay.gestures;

import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/ref/WeakReference;", "Landroid/view/View;", "invoke", "(Ljava/lang/ref/WeakReference;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class GestureRecorder$onRootViewsChanged$1$1 extends v implements l {
    final /* synthetic */ View $root;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestureRecorder$onRootViewsChanged$1$1(View view) {
        super(1);
        this.$root = view;
    }

    @Override // vc.l
    public final Boolean invoke(WeakReference<View> it) {
        AbstractC4862t.e(it, "it");
        return Boolean.valueOf(AbstractC4862t.a(it.get(), this.$root));
    }
}
