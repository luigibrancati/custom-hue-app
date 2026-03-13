package io.sentry.android.replay;

import android.view.View;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bà\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/sentry/android/replay/OnRootViewsChangedListener;", "", "Landroid/view/View;", "view", "", "added", "Lfc/H;", "onRootViewsChanged", "(Landroid/view/View;Z)V", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface OnRootViewsChangedListener {
    void onRootViewsChanged(View view, boolean added);
}
