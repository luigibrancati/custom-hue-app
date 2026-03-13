package com.braze.ui.inappmessage.jsinterface;

import android.content.Context;
import com.braze.ui.UserJavascriptInterfaceBase;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/braze/ui/inappmessage/jsinterface/InAppMessageUserJavascriptInterface;", "Lcom/braze/ui/UserJavascriptInterfaceBase;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InAppMessageUserJavascriptInterface extends UserJavascriptInterfaceBase {
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageUserJavascriptInterface(Context context) {
        super(context);
        AbstractC4862t.e(context, "context");
        this.context = context;
    }
}
