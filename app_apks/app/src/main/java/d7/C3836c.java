package d7;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import b0.J;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: d7.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C3836c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J f33151a = new J();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J f33152b = new J();

    public static void a(C3836c c3836c, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c3836c.e(objectAnimator.getPropertyName(), objectAnimator.getValues());
            c3836c.f(objectAnimator.getPropertyName(), C3837d.a(objectAnimator));
        } else {
            throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
        }
    }

    public static C3836c b(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        if (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return c(context, resourceId);
    }

    public static C3836c c(Context context, int i10) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i10);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return d(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return d(arrayList);
        } catch (Exception e10) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i10), e10);
            return null;
        }
    }

    public static C3836c d(List list) {
        C3836c c3836c = new C3836c();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            a(c3836c, (Animator) list.get(i10));
        }
        return c3836c;
    }

    public void e(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f33152b.put(str, propertyValuesHolderArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3836c) {
            return this.f33151a.equals(((C3836c) obj).f33151a);
        }
        return false;
    }

    public void f(String str, C3837d c3837d) {
        this.f33151a.put(str, c3837d);
    }

    public int hashCode() {
        return this.f33151a.hashCode();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f33151a + "}\n";
    }
}
