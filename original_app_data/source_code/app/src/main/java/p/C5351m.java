package p;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import p1.C5382f;

/* JADX INFO: renamed from: p.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C5351m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f41962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5382f f41963b;

    public C5351m(TextView textView) {
        this.f41962a = textView;
        this.f41963b = new C5382f(textView, false);
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f41963b.a(inputFilterArr);
    }

    public boolean b() {
        return this.f41963b.b();
    }

    public void c(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f41962a.getContext().obtainStyledAttributes(attributeSet, h.j.f36077g0, i10, 0);
        try {
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(h.j.f36147u0) ? typedArrayObtainStyledAttributes.getBoolean(h.j.f36147u0, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            e(z10);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void d(boolean z10) {
        this.f41963b.c(z10);
    }

    public void e(boolean z10) {
        this.f41963b.d(z10);
    }

    public TransformationMethod f(TransformationMethod transformationMethod) {
        return this.f41963b.e(transformationMethod);
    }
}
