package io.sentry.android.replay;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import org.apache.tika.mime.MimeTypesReaderMetKeys;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroid/view/View;", "Lfc/H;", "sentryReplayMask", "(Landroid/view/View;)V", "sentryReplayUnmask", "sentry-android-replay_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ViewExtensionsKt {
    public static final void sentryReplayMask(View view) {
        AbstractC4862t.e(view, "<this>");
        view.setTag(R.id.sentry_privacy, MimeTypesReaderMetKeys.MATCH_MASK_ATTR);
    }

    public static final void sentryReplayUnmask(View view) {
        AbstractC4862t.e(view, "<this>");
        view.setTag(R.id.sentry_privacy, "unmask");
    }
}
