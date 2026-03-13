package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import r1.AbstractC5524a;

/* JADX INFO: renamed from: androidx.fragment.app.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2741w {
    public static int a(ComponentCallbacksC2736q componentCallbacksC2736q, boolean z10, boolean z11) {
        return z11 ? z10 ? componentCallbacksC2736q.getPopEnterAnim() : componentCallbacksC2736q.getPopExitAnim() : z10 ? componentCallbacksC2736q.getEnterAnim() : componentCallbacksC2736q.getExitAnim();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0071 A[Catch: RuntimeException -> 0x0077, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0077, blocks: (B:32:0x006b, B:34:0x0071), top: B:45:0x006b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.fragment.app.AbstractC2741w.a b(android.content.Context r4, androidx.fragment.app.ComponentCallbacksC2736q r5, boolean r6, boolean r7) {
        /*
            int r0 = r5.getNextTransition()
            int r7 = a(r5, r6, r7)
            r1 = 0
            r5.setAnimations(r1, r1, r1, r1)
            android.view.ViewGroup r1 = r5.mContainer
            r2 = 0
            if (r1 == 0) goto L20
            int r3 = r1.AbstractC5525b.f43506c
            java.lang.Object r1 = r1.getTag(r3)
            if (r1 == 0) goto L20
            android.view.ViewGroup r1 = r5.mContainer
            int r3 = r1.AbstractC5525b.f43506c
            r1.setTag(r3, r2)
        L20:
            android.view.ViewGroup r1 = r5.mContainer
            if (r1 == 0) goto L2b
            android.animation.LayoutTransition r1 = r1.getLayoutTransition()
            if (r1 == 0) goto L2b
            return r2
        L2b:
            android.view.animation.Animation r1 = r5.onCreateAnimation(r0, r6, r7)
            if (r1 == 0) goto L37
            androidx.fragment.app.w$a r4 = new androidx.fragment.app.w$a
            r4.<init>(r1)
            return r4
        L37:
            android.animation.Animator r5 = r5.onCreateAnimator(r0, r6, r7)
            if (r5 == 0) goto L43
            androidx.fragment.app.w$a r4 = new androidx.fragment.app.w$a
            r4.<init>(r5)
            return r4
        L43:
            if (r7 != 0) goto L4b
            if (r0 == 0) goto L4b
            int r7 = d(r4, r0, r6)
        L4b:
            if (r7 == 0) goto L87
            android.content.res.Resources r5 = r4.getResources()
            java.lang.String r5 = r5.getResourceTypeName(r7)
            java.lang.String r6 = "anim"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L6b
            android.view.animation.Animation r6 = android.view.animation.AnimationUtils.loadAnimation(r4, r7)     // Catch: android.content.res.Resources.NotFoundException -> L69 java.lang.RuntimeException -> L6b
            if (r6 == 0) goto L87
            androidx.fragment.app.w$a r0 = new androidx.fragment.app.w$a     // Catch: android.content.res.Resources.NotFoundException -> L69 java.lang.RuntimeException -> L6b
            r0.<init>(r6)     // Catch: android.content.res.Resources.NotFoundException -> L69 java.lang.RuntimeException -> L6b
            return r0
        L69:
            r4 = move-exception
            throw r4
        L6b:
            android.animation.Animator r6 = android.animation.AnimatorInflater.loadAnimator(r4, r7)     // Catch: java.lang.RuntimeException -> L77
            if (r6 == 0) goto L87
            androidx.fragment.app.w$a r0 = new androidx.fragment.app.w$a     // Catch: java.lang.RuntimeException -> L77
            r0.<init>(r6)     // Catch: java.lang.RuntimeException -> L77
            return r0
        L77:
            r6 = move-exception
            if (r5 != 0) goto L86
            android.view.animation.Animation r4 = android.view.animation.AnimationUtils.loadAnimation(r4, r7)
            if (r4 == 0) goto L87
            androidx.fragment.app.w$a r5 = new androidx.fragment.app.w$a
            r5.<init>(r4)
            return r5
        L86:
            throw r6
        L87:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.AbstractC2741w.b(android.content.Context, androidx.fragment.app.q, boolean, boolean):androidx.fragment.app.w$a");
    }

    public static int c(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i10});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static int d(Context context, int i10, boolean z10) {
        if (i10 == 4097) {
            return z10 ? AbstractC5524a.f43502e : AbstractC5524a.f43503f;
        }
        if (i10 == 8194) {
            return z10 ? AbstractC5524a.f43498a : AbstractC5524a.f43499b;
        }
        if (i10 == 8197) {
            return z10 ? c(context, R.attr.activityCloseEnterAnimation) : c(context, R.attr.activityCloseExitAnimation);
        }
        if (i10 == 4099) {
            return z10 ? AbstractC5524a.f43500c : AbstractC5524a.f43501d;
        }
        if (i10 != 4100) {
            return -1;
        }
        return z10 ? c(context, R.attr.activityOpenEnterAnimation) : c(context, R.attr.activityOpenExitAnimation);
    }

    /* JADX INFO: renamed from: androidx.fragment.app.w$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Animation f23375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AnimatorSet f23376b;

        public a(Animation animation) {
            this.f23375a = animation;
            this.f23376b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        public a(Animator animator) {
            this.f23375a = null;
            AnimatorSet animatorSet = new AnimatorSet();
            this.f23376b = animatorSet;
            animatorSet.play(animator);
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.w$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b extends AnimationSet implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ViewGroup f23377a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f23378b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f23379c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f23380d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f23381e;

        public b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f23381e = true;
            this.f23377a = viewGroup;
            this.f23378b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation) {
            this.f23381e = true;
            if (this.f23379c) {
                return !this.f23380d;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.f23379c = true;
                Y0.y.a(this.f23377a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f23379c || !this.f23381e) {
                this.f23377a.endViewTransition(this.f23378b);
                this.f23380d = true;
            } else {
                this.f23381e = false;
                this.f23377a.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation, float f10) {
            this.f23381e = true;
            if (this.f23379c) {
                return !this.f23380d;
            }
            if (!super.getTransformation(j10, transformation, f10)) {
                this.f23379c = true;
                Y0.y.a(this.f23377a, this);
            }
            return true;
        }
    }
}
