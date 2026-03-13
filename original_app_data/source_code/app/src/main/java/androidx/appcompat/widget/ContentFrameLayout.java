package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TypedValue f21746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TypedValue f21747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f21748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TypedValue f21749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TypedValue f21750e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TypedValue f21751f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Rect f21752g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f21753h;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public void a(int i10, int i11, int i12, int i13) {
        this.f21752g.set(i10, i11, i12, i13);
        if (isLaidOut()) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f21750e == null) {
            this.f21750e = new TypedValue();
        }
        return this.f21750e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f21751f == null) {
            this.f21751f = new TypedValue();
        }
        return this.f21751f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f21748c == null) {
            this.f21748c = new TypedValue();
        }
        return this.f21748c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f21749d == null) {
            this.f21749d = new TypedValue();
        }
        return this.f21749d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f21746a == null) {
            this.f21746a = new TypedValue();
        }
        return this.f21746a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f21747b == null) {
            this.f21747b = new TypedValue();
        }
        return this.f21747b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f21753h;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f21753h;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00db  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.f21753h = aVar;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f21752g = new Rect();
    }
}
