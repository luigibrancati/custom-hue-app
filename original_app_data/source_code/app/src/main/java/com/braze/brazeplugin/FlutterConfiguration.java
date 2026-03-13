package com.braze.brazeplugin;

import Bc.k;
import android.annotation.SuppressLint;
import android.content.Context;
import com.braze.ui.inappmessage.InAppMessageOperation;
import gc.P;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/braze/brazeplugin/FlutterConfiguration;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "isAutomaticInitializationEnabled", "", "automaticIntegrationInAppMessageOperation", "Lcom/braze/ui/inappmessage/InAppMessageOperation;", "Companion", "braze_plugin_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FlutterConfiguration {
    private static final Map<String, InAppMessageOperation> IAM_OPERATION_ENUM_MAP;
    private final Context context;

    static {
        InAppMessageOperation[] inAppMessageOperationArrValues = InAppMessageOperation.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(k.e(P.e(inAppMessageOperationArrValues.length), 16));
        for (InAppMessageOperation inAppMessageOperation : inAppMessageOperationArrValues) {
            linkedHashMap.put(inAppMessageOperation.name(), inAppMessageOperation);
        }
        IAM_OPERATION_ENUM_MAP = linkedHashMap;
    }

    public FlutterConfiguration(Context context) {
        AbstractC4862t.e(context, "context");
        this.context = context;
    }

    @SuppressLint({"DiscouragedApi"})
    public final InAppMessageOperation automaticIntegrationInAppMessageOperation() {
        InAppMessageOperation inAppMessageOperation = InAppMessageOperation.DISPLAY_NOW;
        int identifier = this.context.getResources().getIdentifier("com_braze_flutter_automatic_integration_iam_operation", "string", this.context.getPackageName());
        if (identifier != 0) {
            try {
                String string = this.context.getResources().getString(identifier);
                AbstractC4862t.d(string, "getString(...)");
                String upperCase = string.toUpperCase(Locale.ROOT);
                AbstractC4862t.d(upperCase, "toUpperCase(...)");
                InAppMessageOperation inAppMessageOperation2 = IAM_OPERATION_ENUM_MAP.get(upperCase);
                if (inAppMessageOperation2 != null) {
                    return inAppMessageOperation2;
                }
            } catch (Exception unused) {
            }
        }
        return inAppMessageOperation;
    }

    @SuppressLint({"DiscouragedApi"})
    public final boolean isAutomaticInitializationEnabled() {
        int identifier = this.context.getResources().getIdentifier("com_braze_flutter_enable_automatic_integration_initializer", "bool", this.context.getPackageName());
        if (identifier == 0) {
            return true;
        }
        try {
            return this.context.getResources().getBoolean(identifier);
        } catch (Exception unused) {
            return true;
        }
    }
}
