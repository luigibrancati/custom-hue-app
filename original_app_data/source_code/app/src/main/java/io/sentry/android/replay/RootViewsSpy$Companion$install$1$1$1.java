package io.sentry.android.replay;

import android.view.View;
import io.sentry.ISentryLifecycleToken;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import tc.AbstractC5877a;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "mViews", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class RootViewsSpy$Companion$install$1$1$1 extends v implements l {
    final /* synthetic */ RootViewsSpy $this_apply;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RootViewsSpy$Companion$install$1$1$1(RootViewsSpy rootViewsSpy) {
        super(1);
        this.$this_apply = rootViewsSpy;
    }

    @Override // vc.l
    public final ArrayList<View> invoke(ArrayList<View> mViews) throws Exception {
        AbstractC4862t.e(mViews, "mViews");
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.$this_apply.viewListLock.acquire();
        try {
            ArrayList<View> arrayList = this.$this_apply.delegatingViewList;
            arrayList.addAll(mViews);
            AbstractC5877a.a(iSentryLifecycleTokenAcquire, null);
            return arrayList;
        } finally {
        }
    }
}
