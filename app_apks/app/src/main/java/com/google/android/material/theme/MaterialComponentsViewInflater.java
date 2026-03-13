package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import h7.C4282a;
import i.m;
import o7.C5228a;
import p.C5324C;
import p.C5341c;
import p.C5343e;
import p.C5344f;
import p.C5359u;
import t7.f;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class MaterialComponentsViewInflater extends m {
    @Override // i.m
    public C5341c c(Context context, AttributeSet attributeSet) {
        return new f(context, attributeSet);
    }

    @Override // i.m
    public C5343e d(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // i.m
    public C5344f e(Context context, AttributeSet attributeSet) {
        return new C4282a(context, attributeSet);
    }

    @Override // i.m
    public C5359u k(Context context, AttributeSet attributeSet) {
        return new C5228a(context, attributeSet);
    }

    @Override // i.m
    public C5324C o(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
