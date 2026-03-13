package com.braze.ui.inappmessage.listeners;

import android.view.MotionEvent;
import android.view.View;
import com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0017B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/braze/ui/inappmessage/listeners/TouchAwareSwipeDismissTouchListener;", "Lcom/braze/ui/inappmessage/listeners/SwipeDismissTouchListener;", "Landroid/view/View;", "view", "", "token", "Lcom/braze/ui/inappmessage/listeners/SwipeDismissTouchListener$DismissCallbacks;", "callbacks", "<init>", "(Landroid/view/View;Ljava/lang/Object;Lcom/braze/ui/inappmessage/listeners/SwipeDismissTouchListener$DismissCallbacks;)V", "(Landroid/view/View;Lcom/braze/ui/inappmessage/listeners/SwipeDismissTouchListener$DismissCallbacks;)V", "Lcom/braze/ui/inappmessage/listeners/TouchAwareSwipeDismissTouchListener$ITouchListener;", "newTouchListener", "Lfc/H;", "setTouchListener", "(Lcom/braze/ui/inappmessage/listeners/TouchAwareSwipeDismissTouchListener$ITouchListener;)V", "Landroid/view/MotionEvent;", "motionEvent", "", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "touchListener", "Lcom/braze/ui/inappmessage/listeners/TouchAwareSwipeDismissTouchListener$ITouchListener;", "ITouchListener", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TouchAwareSwipeDismissTouchListener extends SwipeDismissTouchListener {
    private ITouchListener touchListener;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/braze/ui/inappmessage/listeners/TouchAwareSwipeDismissTouchListener$ITouchListener;", "", "Lfc/H;", "onTouchStartedOrContinued", "()V", "onTouchEnded", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ITouchListener {
        void onTouchEnded();

        void onTouchStartedOrContinued();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouchAwareSwipeDismissTouchListener(View view, Object obj, SwipeDismissTouchListener.DismissCallbacks dismissCallbacks) {
        super(view, obj, dismissCallbacks);
        AbstractC4862t.e(view, "view");
    }

    @Override // com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener, android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        ITouchListener iTouchListener;
        AbstractC4862t.e(view, "view");
        AbstractC4862t.e(motionEvent, "motionEvent");
        int action = motionEvent.getAction();
        if (action == 0) {
            ITouchListener iTouchListener2 = this.touchListener;
            if (iTouchListener2 != null) {
                iTouchListener2.onTouchStartedOrContinued();
            }
        } else if ((action == 1 || action == 3) && (iTouchListener = this.touchListener) != null) {
            iTouchListener.onTouchEnded();
        }
        return super.onTouch(view, motionEvent);
    }

    public final void setTouchListener(ITouchListener newTouchListener) {
        AbstractC4862t.e(newTouchListener, "newTouchListener");
        this.touchListener = newTouchListener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TouchAwareSwipeDismissTouchListener(View view, SwipeDismissTouchListener.DismissCallbacks dismissCallbacks) {
        this(view, null, dismissCallbacks);
        AbstractC4862t.e(view, "view");
    }
}
