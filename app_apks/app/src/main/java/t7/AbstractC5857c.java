package t7;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: t7.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5857c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextInputLayout f44776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f44777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CheckableImageButton f44778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f44779d;

    public AbstractC5857c(TextInputLayout textInputLayout, int i10) {
        this.f44776a = textInputLayout;
        this.f44777b = textInputLayout.getContext();
        this.f44778c = textInputLayout.getEndIconView();
        this.f44779d = i10;
    }

    public abstract void a();

    public boolean b(int i10) {
        return true;
    }

    public boolean d() {
        return false;
    }

    public void c(boolean z10) {
    }
}
