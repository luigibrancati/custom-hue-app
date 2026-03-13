package com.braze.ui.actions.brazeactions;

import android.net.Uri;
import com.braze.models.cards.Card;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.IInAppMessageImmersive;
import com.braze.models.inappmessage.MessageButton;
import com.braze.ui.actions.brazeactions.BrazeActionParser;
import com.braze.ui.actions.brazeactions.steps.ContainerStep;
import com.braze.ui.actions.brazeactions.steps.StepData;
import fc.C4034q;
import gc.C4205s;
import gc.C4206t;
import gc.C4207u;
import gc.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u0004\u0018\u00010\u0002H\u0000\u001a\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a\u001e\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¨\u0006\u000f"}, d2 = {"containsAnyPushPermissionBrazeActions", "", "Lcom/braze/models/inappmessage/IInAppMessage;", "containsInvalidBrazeAction", "Lcom/braze/models/cards/Card;", "getAllUris", "", "Landroid/net/Uri;", "getAllBrazeActionStepTypes", "Lcom/braze/ui/actions/brazeactions/BrazeActionParser$ActionType;", "json", "Lorg/json/JSONObject;", "doAnyTypesMatch", "actionType", "uriList", "android-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class BrazeActionUtils {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrazeActionParser.ActionType.values().length];
            try {
                iArr[BrazeActionParser.ActionType.CONTAINER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean containsAnyPushPermissionBrazeActions(IInAppMessage iInAppMessage) {
        AbstractC4862t.e(iInAppMessage, "<this>");
        return doAnyTypesMatch(BrazeActionParser.ActionType.REQUEST_PUSH_PERMISSION, getAllUris(iInAppMessage));
    }

    public static final boolean containsInvalidBrazeAction(IInAppMessage iInAppMessage) {
        AbstractC4862t.e(iInAppMessage, "<this>");
        return doAnyTypesMatch(BrazeActionParser.ActionType.INVALID, getAllUris(iInAppMessage));
    }

    public static final boolean doAnyTypesMatch(BrazeActionParser.ActionType actionType, List<? extends Uri> uriList) {
        JSONObject jSONObject;
        AbstractC4862t.e(actionType, "actionType");
        AbstractC4862t.e(uriList, "uriList");
        ArrayList arrayList = new ArrayList();
        for (Object obj : uriList) {
            if (BrazeActionParser.INSTANCE.isBrazeActionUri((Uri) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C4207u.v(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C4034q brazeActionVersionAndJson$android_sdk_ui_release = BrazeActionParser.INSTANCE.getBrazeActionVersionAndJson$android_sdk_ui_release((Uri) it.next());
            if (brazeActionVersionAndJson$android_sdk_ui_release == null || (jSONObject = (JSONObject) brazeActionVersionAndJson$android_sdk_ui_release.f()) == null) {
                jSONObject = new JSONObject();
            }
            arrayList2.add(jSONObject);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            y.C(arrayList3, getAllBrazeActionStepTypes((JSONObject) it2.next()));
        }
        if (arrayList3.isEmpty()) {
            return false;
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            if (((BrazeActionParser.ActionType) it3.next()) == actionType) {
                return true;
            }
        }
        return false;
    }

    public static final /* synthetic */ List getAllBrazeActionStepTypes(JSONObject json) {
        AbstractC4862t.e(json, "json");
        ArrayList arrayList = new ArrayList();
        StepData stepData = new StepData(json, null, 2, null);
        BrazeActionParser.ActionType actionType$android_sdk_ui_release = BrazeActionParser.INSTANCE.getActionType$android_sdk_ui_release(stepData);
        if (WhenMappings.$EnumSwitchMapping$0[actionType$android_sdk_ui_release.ordinal()] != 1) {
            arrayList.add(actionType$android_sdk_ui_release);
            return arrayList;
        }
        Iterator childStepIterator$android_sdk_ui_release = ContainerStep.INSTANCE.getChildStepIterator$android_sdk_ui_release(stepData);
        while (childStepIterator$android_sdk_ui_release.hasNext()) {
            arrayList.addAll(getAllBrazeActionStepTypes((JSONObject) childStepIterator$android_sdk_ui_release.next()));
        }
        return arrayList;
    }

    public static final /* synthetic */ List getAllUris(IInAppMessage iInAppMessage) {
        if (iInAppMessage == null) {
            return C4206t.k();
        }
        ArrayList arrayList = new ArrayList();
        Uri internalUri = iInAppMessage.getInternalUri();
        if (internalUri != null) {
            arrayList.add(internalUri);
        }
        if (iInAppMessage instanceof IInAppMessageImmersive) {
            List<MessageButton> messageButtons = ((IInAppMessageImmersive) iInAppMessage).getMessageButtons();
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = messageButtons.iterator();
            while (it.hasNext()) {
                Uri uri = ((MessageButton) it.next()).getUri();
                if (uri != null) {
                    arrayList2.add(uri);
                }
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    public static final boolean containsInvalidBrazeAction(Card card) {
        AbstractC4862t.e(card, "<this>");
        String url = card.getUrl();
        if (url != null) {
            return doAnyTypesMatch(BrazeActionParser.ActionType.INVALID, C4205s.d(Uri.parse(url)));
        }
        return false;
    }
}
