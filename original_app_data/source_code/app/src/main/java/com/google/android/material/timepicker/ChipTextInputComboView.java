package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import c7.e;
import c7.g;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import n7.C5148k;
import n7.n;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Chip f30955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextInputLayout f30956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EditText f30957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextWatcher f30958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f30959e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b extends C5148k {
        public b() {
        }

        @Override // n7.C5148k, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f30955a.setText(ChipTextInputComboView.this.c("00"));
            } else {
                ChipTextInputComboView.this.f30955a.setText(ChipTextInputComboView.this.c(editable));
            }
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final String c(CharSequence charSequence) {
        return c.a(getResources(), charSequence);
    }

    public final void d() {
        this.f30957c.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f30955a.isChecked();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        this.f30955a.setChecked(z10);
        this.f30957c.setVisibility(z10 ? 0 : 4);
        this.f30955a.setVisibility(z10 ? 8 : 0);
        if (isChecked()) {
            n.h(this.f30957c);
            if (TextUtils.isEmpty(this.f30957c.getText())) {
                return;
            }
            EditText editText = this.f30957c;
            editText.setSelection(editText.getText().length());
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f30955a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i10, Object obj) {
        this.f30955a.setTag(i10, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f30955a.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(g.f25948g, (ViewGroup) this, false);
        this.f30955a = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(g.f25949h, (ViewGroup) this, false);
        this.f30956b = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f30957c = editText;
        editText.setVisibility(4);
        b bVar = new b();
        this.f30958d = bVar;
        editText.addTextChangedListener(bVar);
        d();
        addView(chip);
        addView(textInputLayout);
        this.f30959e = (TextView) findViewById(e.f25926l);
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
