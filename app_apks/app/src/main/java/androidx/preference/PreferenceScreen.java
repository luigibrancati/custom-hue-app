package androidx.preference;

import N0.i;
import T2.c;
import android.R;
import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public boolean f23958R;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, i.a(context, c.f16071f, R.attr.preferenceScreenStyle));
        this.f23958R = true;
    }

    @Override // androidx.preference.Preference
    public void H() {
        if (s() == null && q() == null && U() != 0) {
            y();
            throw null;
        }
    }
}
