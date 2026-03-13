package com.hiennv.flutter_callkit_incoming.widgets;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.RelativeLayout;
import com.hiennv.flutter_callkit_incoming.R;
import com.hiennv.flutter_callkit_incoming.Utils;
import io.sentry.Session;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import org.apache.tika.metadata.MachineMetadata;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 /2\u00020\u0001:\u00020/B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0003¢\u0006\u0004\b\r\u0010\bJ\r\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012R\u0016\u0010\u0018\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012R\u0016\u0010\u0019\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR$\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R*\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0018\u00010%j\n\u0012\u0004\u0012\u00020&\u0018\u0001`'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R,\u0010.\u001a\u001a\u0012\b\u0012\u00060-R\u00020\u00000%j\f\u0012\b\u0012\u00060-R\u00020\u0000`'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010)¨\u00061"}, d2 = {"Lcom/hiennv/flutter_callkit_incoming/widgets/RippleRelativeLayout;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", Session.JsonKeys.ATTRS, "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lfc/H;", Session.JsonKeys.INIT, "startRippleAnimation", "()V", "stopRippleAnimation", "rippleColor", "I", "", "rippleRadius", "F", "rippleDurationTime", "rippleAmount", "rippleDelay", "rippleScale", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "", "value", "isRippleAnimationRunning", "Z", "()Z", "Landroid/animation/AnimatorSet;", "animatorSet", "Landroid/animation/AnimatorSet;", "Ljava/util/ArrayList;", "Landroid/animation/Animator;", "Lkotlin/collections/ArrayList;", "animatorList", "Ljava/util/ArrayList;", "Landroid/widget/RelativeLayout$LayoutParams;", "rippleParams", "Landroid/widget/RelativeLayout$LayoutParams;", "Lcom/hiennv/flutter_callkit_incoming/widgets/RippleRelativeLayout$RippleView;", "rippleViewList", "Companion", "RippleView", "flutter_callkit_incoming_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RippleRelativeLayout extends RelativeLayout {
    private static final int DEFAULT_DURATION_TIME = 6000;
    private static final int DEFAULT_RIPPLE_COUNT = 5;
    private static final float DEFAULT_SCALE = 6.0f;
    private ArrayList<Animator> animatorList;
    private AnimatorSet animatorSet;
    private boolean isRippleAnimationRunning;
    private Paint paint;
    private int rippleAmount;
    private int rippleColor;
    private int rippleDelay;
    private int rippleDurationTime;
    private RelativeLayout.LayoutParams rippleParams;
    private float rippleRadius;
    private float rippleScale;
    private final ArrayList<RippleView> rippleViewList;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/hiennv/flutter_callkit_incoming/widgets/RippleRelativeLayout$RippleView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "<init>", "(Lcom/hiennv/flutter_callkit_incoming/widgets/RippleRelativeLayout;Landroid/content/Context;)V", "Landroid/graphics/Canvas;", "canvas", "Lfc/H;", "onDraw", "(Landroid/graphics/Canvas;)V", "flutter_callkit_incoming_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class RippleView extends View {
        public RippleView(Context context) {
            super(context);
            setVisibility(4);
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            AbstractC4862t.e(canvas, "canvas");
            float fMin = Math.min(getWidth(), getHeight()) / 2.0f;
            Paint paint = RippleRelativeLayout.this.paint;
            AbstractC4862t.b(paint);
            canvas.drawCircle(fMin, fMin, fMin, paint);
        }
    }

    public RippleRelativeLayout(Context context) {
        super(context);
        this.paint = new Paint();
        this.rippleViewList = new ArrayList<>();
    }

    @SuppressLint({"CustomViewStyleable"})
    private final void init(Context context, AttributeSet attrs) {
        if (isInEditMode()) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.ripple_relativeLayout);
        AbstractC4862t.d(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.rippleColor = typedArrayObtainStyledAttributes.getColor(R.styleable.ripple_relativeLayout_ripple_color, getResources().getColor(R.color.ripple_main_color));
        this.rippleRadius = typedArrayObtainStyledAttributes.getDimension(R.styleable.ripple_relativeLayout_ripple_radius, Utils.INSTANCE.dpToPx(30.0f));
        this.rippleDurationTime = typedArrayObtainStyledAttributes.getInt(R.styleable.ripple_relativeLayout_ripple_duration, DEFAULT_DURATION_TIME);
        this.rippleAmount = typedArrayObtainStyledAttributes.getInt(R.styleable.ripple_relativeLayout_ripple_amount, 5);
        this.rippleScale = typedArrayObtainStyledAttributes.getFloat(R.styleable.ripple_relativeLayout_ripple_scale, DEFAULT_SCALE);
        typedArrayObtainStyledAttributes.recycle();
        this.rippleDelay = this.rippleDurationTime / this.rippleAmount;
        Paint paint = new Paint();
        this.paint = paint;
        paint.setAntiAlias(true);
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setColor(this.rippleColor);
        float f10 = 2;
        float f11 = this.rippleRadius;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (f10 * f11), (int) (f10 * f11));
        this.rippleParams = layoutParams;
        AbstractC4862t.b(layoutParams);
        layoutParams.addRule(13, -1);
        AnimatorSet animatorSet = new AnimatorSet();
        this.animatorSet = animatorSet;
        AbstractC4862t.b(animatorSet);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        this.animatorList = new ArrayList<>();
        int i10 = this.rippleAmount;
        for (int i11 = 0; i11 < i10; i11++) {
            RippleView rippleView = new RippleView(getContext());
            addView(rippleView, this.rippleParams);
            this.rippleViewList.add(rippleView);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(rippleView, "ScaleX", 1.0f, this.rippleScale);
            objectAnimatorOfFloat.setRepeatCount(-1);
            objectAnimatorOfFloat.setRepeatMode(1);
            objectAnimatorOfFloat.setStartDelay(this.rippleDelay * i11);
            objectAnimatorOfFloat.setDuration(this.rippleDurationTime);
            ArrayList<Animator> arrayList = this.animatorList;
            AbstractC4862t.b(arrayList);
            arrayList.add(objectAnimatorOfFloat);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(rippleView, "ScaleY", 1.0f, this.rippleScale);
            objectAnimatorOfFloat2.setRepeatCount(-1);
            objectAnimatorOfFloat2.setRepeatMode(1);
            objectAnimatorOfFloat2.setStartDelay(this.rippleDelay * i11);
            objectAnimatorOfFloat2.setDuration(this.rippleDurationTime);
            ArrayList<Animator> arrayList2 = this.animatorList;
            AbstractC4862t.b(arrayList2);
            arrayList2.add(objectAnimatorOfFloat2);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(rippleView, MachineMetadata.MACHINE_ALPHA, 1.0f, 0.0f);
            objectAnimatorOfFloat3.setRepeatCount(-1);
            objectAnimatorOfFloat3.setRepeatMode(1);
            objectAnimatorOfFloat3.setStartDelay(this.rippleDelay * i11);
            objectAnimatorOfFloat3.setDuration(this.rippleDurationTime);
            ArrayList<Animator> arrayList3 = this.animatorList;
            AbstractC4862t.b(arrayList3);
            arrayList3.add(objectAnimatorOfFloat3);
        }
        AnimatorSet animatorSet2 = this.animatorSet;
        AbstractC4862t.b(animatorSet2);
        animatorSet2.playTogether(this.animatorList);
        startRippleAnimation();
    }

    /* JADX INFO: renamed from: isRippleAnimationRunning, reason: from getter */
    public final boolean getIsRippleAnimationRunning() {
        return this.isRippleAnimationRunning;
    }

    public final void startRippleAnimation() {
        if (this.isRippleAnimationRunning) {
            return;
        }
        Iterator<RippleView> it = this.rippleViewList.iterator();
        AbstractC4862t.d(it, "iterator(...)");
        while (it.hasNext()) {
            RippleView next = it.next();
            AbstractC4862t.d(next, "next(...)");
            next.setVisibility(0);
        }
        AnimatorSet animatorSet = this.animatorSet;
        AbstractC4862t.b(animatorSet);
        animatorSet.start();
        this.isRippleAnimationRunning = true;
    }

    public final void stopRippleAnimation() {
        if (this.isRippleAnimationRunning) {
            AnimatorSet animatorSet = this.animatorSet;
            AbstractC4862t.b(animatorSet);
            animatorSet.end();
            this.isRippleAnimationRunning = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC4862t.e(context, "context");
        this.paint = new Paint();
        this.rippleViewList = new ArrayList<>();
        init(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleRelativeLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AbstractC4862t.e(context, "context");
        this.paint = new Paint();
        this.rippleViewList = new ArrayList<>();
        init(context, attributeSet);
    }
}
