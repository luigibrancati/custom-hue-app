package j7;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: j7.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class ViewOnTouchListenerC4746a implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Dialog f39090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f39093d;

    public ViewOnTouchListenerC4746a(Dialog dialog, Rect rect) {
        this.f39090a = dialog;
        this.f39091b = rect.left;
        this.f39092c = rect.top;
        this.f39093d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = this.f39091b + viewFindViewById.getLeft();
        int width = viewFindViewById.getWidth() + left;
        if (new RectF(left, this.f39092c + viewFindViewById.getTop(), width, viewFindViewById.getHeight() + r3).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        view.performClick();
        return this.f39090a.onTouchEvent(motionEventObtain);
    }
}
