package com.google.android.material.textfield;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import c7.h;
import com.google.android.material.textfield.TextInputLayout;
import n7.C5148k;
import t7.AbstractC5857c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class c extends AbstractC5857c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextWatcher f30946e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextInputLayout.f f30947f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextInputLayout.g f30948g;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends C5148k {
        public a() {
        }

        @Override // n7.C5148k, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            c.this.f44778c.setChecked(!r0.g());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements TextInputLayout.f {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            c.this.f44778c.setChecked(!r0.g());
            editText.removeTextChangedListener(c.this.f30946e);
            editText.addTextChangedListener(c.this.f30946e);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C0367c implements TextInputLayout.g {

        /* JADX INFO: renamed from: com.google.android.material.textfield.c$c$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ EditText f30952a;

            public a(EditText editText) {
                this.f30952a = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f30952a.removeTextChangedListener(c.this.f30946e);
            }
        }

        public C0367c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i10) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i10 != 1) {
                return;
            }
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            editText.post(new a(editText));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText editText = c.this.f44776a.getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            if (c.this.g()) {
                editText.setTransformationMethod(null);
            } else {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            if (selectionEnd >= 0) {
                editText.setSelection(selectionEnd);
            }
            c.this.f44776a.U();
        }
    }

    public c(TextInputLayout textInputLayout, int i10) {
        super(textInputLayout, i10);
        this.f30946e = new a();
        this.f30947f = new b();
        this.f30948g = new C0367c();
    }

    public static boolean h(EditText editText) {
        if (editText != null) {
            return editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224;
        }
        return false;
    }

    @Override // t7.AbstractC5857c
    public void a() {
        TextInputLayout textInputLayout = this.f44776a;
        int i10 = this.f44779d;
        if (i10 == 0) {
            i10 = c7.d.f25895a;
        }
        textInputLayout.setEndIconDrawable(i10);
        TextInputLayout textInputLayout2 = this.f44776a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(h.f25975p));
        this.f44776a.setEndIconVisible(true);
        this.f44776a.setEndIconCheckable(true);
        this.f44776a.setEndIconOnClickListener(new d());
        this.f44776a.g(this.f30947f);
        this.f44776a.h(this.f30948g);
        EditText editText = this.f44776a.getEditText();
        if (h(editText)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public final boolean g() {
        EditText editText = this.f44776a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }
}
