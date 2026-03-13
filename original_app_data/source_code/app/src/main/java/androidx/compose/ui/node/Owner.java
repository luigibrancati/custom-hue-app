package androidx.compose.ui.node;

import kotlin.Metadata;
import r0.AbstractC5523a;
import v0.r;
import vc.InterfaceC6082a;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJE\u0010\u0011\u001a\u00020\u00102\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00060\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/Owner;", "", "Landroidx/compose/ui/node/b;", "layoutNode", "", "affectsLookahead", "Lfc/H;", "a", "(Landroidx/compose/ui/node/b;Z)V", "Lkotlin/Function2;", "Lo0/d;", "Lr0/a;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "explicitLayer", "Lv0/r;", "c", "(Lvc/p;Lvc/a;Lr0/a;)Lv0/r;", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface Owner {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f22056a;

    /* JADX INFO: renamed from: androidx.compose.ui.node.Owner$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f22056a = new Companion();
    }

    static /* synthetic */ void b(Owner owner, b bVar, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forceMeasureTheSubtree");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        owner.a(bVar, z10);
    }

    static /* synthetic */ r d(Owner owner, p pVar, InterfaceC6082a interfaceC6082a, AbstractC5523a abstractC5523a, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLayer");
        }
        if ((i10 & 4) != 0) {
            abstractC5523a = null;
        }
        owner.c(pVar, interfaceC6082a, abstractC5523a);
        return null;
    }

    void a(b layoutNode, boolean affectsLookahead);

    r c(p drawBlock, InterfaceC6082a invalidateParentLayer, AbstractC5523a explicitLayer);
}
