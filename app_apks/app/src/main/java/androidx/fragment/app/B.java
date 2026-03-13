package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.sentry.protocol.Request;
import r1.AbstractC5526c;
import s1.C5706c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class B implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J f23002a;

    public B(J j10) {
        this.f23002a = j10;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        P pX;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f23002a);
        }
        if (!Request.JsonKeys.FRAGMENT.equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, Constants.CLASS);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC5526c.f43507a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(AbstractC5526c.f43508b);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(AbstractC5526c.f43509c, -1);
        String string = typedArrayObtainStyledAttributes.getString(AbstractC5526c.f43510d);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue == null || !C2744z.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id2 = view != null ? view.getId() : 0;
        if (id2 == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        ComponentCallbacksC2736q componentCallbacksC2736qK0 = resourceId != -1 ? this.f23002a.k0(resourceId) : null;
        if (componentCallbacksC2736qK0 == null && string != null) {
            componentCallbacksC2736qK0 = this.f23002a.l0(string);
        }
        if (componentCallbacksC2736qK0 == null && id2 != -1) {
            componentCallbacksC2736qK0 = this.f23002a.k0(id2);
        }
        if (componentCallbacksC2736qK0 == null) {
            componentCallbacksC2736qK0 = this.f23002a.w0().a(context.getClassLoader(), attributeValue);
            componentCallbacksC2736qK0.mFromLayout = true;
            componentCallbacksC2736qK0.mFragmentId = resourceId != 0 ? resourceId : id2;
            componentCallbacksC2736qK0.mContainerId = id2;
            componentCallbacksC2736qK0.mTag = string;
            componentCallbacksC2736qK0.mInLayout = true;
            J j10 = this.f23002a;
            componentCallbacksC2736qK0.mFragmentManager = j10;
            componentCallbacksC2736qK0.mHost = j10.y0();
            componentCallbacksC2736qK0.onInflate(this.f23002a.y0().f(), attributeSet, componentCallbacksC2736qK0.mSavedFragmentState);
            pX = this.f23002a.j(componentCallbacksC2736qK0);
            if (J.L0(2)) {
                Log.v("FragmentManager", "Fragment " + componentCallbacksC2736qK0 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            if (componentCallbacksC2736qK0.mInLayout) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
            }
            componentCallbacksC2736qK0.mInLayout = true;
            J j11 = this.f23002a;
            componentCallbacksC2736qK0.mFragmentManager = j11;
            componentCallbacksC2736qK0.mHost = j11.y0();
            componentCallbacksC2736qK0.onInflate(this.f23002a.y0().f(), attributeSet, componentCallbacksC2736qK0.mSavedFragmentState);
            pX = this.f23002a.x(componentCallbacksC2736qK0);
            if (J.L0(2)) {
                Log.v("FragmentManager", "Retained Fragment " + componentCallbacksC2736qK0 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        C5706c.g(componentCallbacksC2736qK0, viewGroup);
        componentCallbacksC2736qK0.mContainer = viewGroup;
        pX.m();
        pX.j();
        View view2 = componentCallbacksC2736qK0.mView;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (componentCallbacksC2736qK0.mView.getTag() == null) {
            componentCallbacksC2736qK0.mView.setTag(string);
        }
        componentCallbacksC2736qK0.mView.addOnAttachStateChangeListener(new a(pX));
        return componentCallbacksC2736qK0.mView;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ P f23003a;

        public a(P p10) {
            this.f23003a = p10;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            ComponentCallbacksC2736q componentCallbacksC2736qK = this.f23003a.k();
            this.f23003a.m();
            a0.u((ViewGroup) componentCallbacksC2736qK.mView.getParent(), B.this.f23002a).q();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
