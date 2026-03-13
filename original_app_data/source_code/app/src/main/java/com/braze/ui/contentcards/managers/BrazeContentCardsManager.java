package com.braze.ui.contentcards.managers;

import com.braze.ui.contentcards.listeners.DefaultContentCardsActionListener;
import com.braze.ui.contentcards.listeners.IContentCardsActionListener;
import com.braze.ui.contentcards.managers.BrazeContentCardsManager;
import fc.C4029l;
import fc.InterfaceC4028k;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R.\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/braze/ui/contentcards/managers/BrazeContentCardsManager;", "", "<init>", "()V", "Lcom/braze/ui/contentcards/listeners/IContentCardsActionListener;", "value", "contentCardsActionListener", "Lcom/braze/ui/contentcards/listeners/IContentCardsActionListener;", "getContentCardsActionListener", "()Lcom/braze/ui/contentcards/listeners/IContentCardsActionListener;", "setContentCardsActionListener", "(Lcom/braze/ui/contentcards/listeners/IContentCardsActionListener;)V", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class BrazeContentCardsManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC4028k instance$delegate = C4029l.b(new InterfaceC6082a() { // from class: H5.a
        @Override // vc.InterfaceC6082a
        public final Object invoke() {
            return BrazeContentCardsManager.instance_delegate$lambda$0();
        }
    });
    private IContentCardsActionListener contentCardsActionListener = new DefaultContentCardsActionListener();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\n\u001a\u00020\u00048FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/braze/ui/contentcards/managers/BrazeContentCardsManager$Companion;", "", "<init>", "()V", "Lcom/braze/ui/contentcards/managers/BrazeContentCardsManager;", "instance$delegate", "Lfc/k;", "getInstance", "()Lcom/braze/ui/contentcards/managers/BrazeContentCardsManager;", "getInstance$annotations", "instance", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        public final BrazeContentCardsManager getInstance() {
            return (BrazeContentCardsManager) BrazeContentCardsManager.instance$delegate.getValue();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BrazeContentCardsManager instance_delegate$lambda$0() {
        return new BrazeContentCardsManager();
    }

    public final IContentCardsActionListener getContentCardsActionListener() {
        return this.contentCardsActionListener;
    }
}
