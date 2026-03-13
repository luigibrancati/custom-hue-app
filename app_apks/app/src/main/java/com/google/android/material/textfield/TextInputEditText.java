package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import c7.AbstractC3079a;
import c7.i;
import c7.j;
import n7.AbstractC5144g;
import n7.l;
import p.C5349k;
import u7.AbstractC5981a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class TextInputEditText extends C5349k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Rect f30800g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f30801h;

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC3079a.f25833l);
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean d(TextInputLayout textInputLayout) {
        return textInputLayout != null && this.f30801h;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!d(textInputLayout) || rect == null) {
            return;
        }
        textInputLayout.getFocusedRect(this.f30800g);
        rect.bottom = this.f30800g.bottom;
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        TextInputLayout textInputLayout = getTextInputLayout();
        return d(textInputLayout) ? textInputLayout.getGlobalVisibleRect(rect, point) : super.getGlobalVisibleRect(rect, point);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        return (textInputLayout == null || !textInputLayout.O()) ? super.getHint() : textInputLayout.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.O() && super.getHint() == null && AbstractC5144g.a()) {
            setHint("");
        }
    }

    @Override // p.C5349k, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getTextInputLayout();
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(Rect rect) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!d(textInputLayout) || rect == null) {
            return super.requestRectangleOnScreen(rect);
        }
        this.f30800g.set(rect.left, rect.top, rect.right, rect.bottom + (textInputLayout.getHeight() - getHeight()));
        return super.requestRectangleOnScreen(this.f30800g);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z10) {
        this.f30801h = z10;
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i10) {
        super(AbstractC5981a.c(context, attributeSet, i10, 0), attributeSet, i10);
        this.f30800g = new Rect();
        TypedArray typedArrayH = l.h(context, attributeSet, j.f26080M4, i10, i.f25979d, new int[0]);
        setTextInputLayoutFocusedRectEnabled(typedArrayH.getBoolean(j.f26087N4, false));
        typedArrayH.recycle();
    }
}
