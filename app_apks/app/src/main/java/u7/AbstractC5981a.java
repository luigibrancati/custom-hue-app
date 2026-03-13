package u7;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import c7.AbstractC3079a;
import n.C5059d;

/* JADX INFO: renamed from: u7.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5981a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f45231a = {R.attr.theme, AbstractC3079a.f25847z};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f45232b = {AbstractC3079a.f25842u};

    public static int a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f45231a);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    public static int b(Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f45232b, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static Context c(Context context, AttributeSet attributeSet, int i10, int i11) {
        int iB = b(context, attributeSet, i10, i11);
        boolean z10 = (context instanceof C5059d) && ((C5059d) context).c() == iB;
        if (iB == 0 || z10) {
            return context;
        }
        C5059d c5059d = new C5059d(context, iB);
        int iA = a(context, attributeSet);
        if (iA != 0) {
            c5059d.getTheme().applyStyle(iA, true);
        }
        return c5059d;
    }
}
