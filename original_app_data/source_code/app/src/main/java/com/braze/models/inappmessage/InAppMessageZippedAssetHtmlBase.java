package com.braze.models.inappmessage;

import Od.F;
import com.braze.managers.m0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\r\b'\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0017B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0003\u0010\tJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/braze/models/inappmessage/InAppMessageZippedAssetHtmlBase;", "Lcom/braze/models/inappmessage/InAppMessageHtmlBase;", "Lcom/braze/models/inappmessage/IInAppMessageZippedAssetHtml;", "<init>", "()V", "Lorg/json/JSONObject;", "jsonObject", "Lcom/braze/managers/m0;", "brazeManager", "(Lorg/json/JSONObject;Lcom/braze/managers/m0;)V", "", "", "getRemoteAssetPathsForPrefetch", "()Ljava/util/List;", "forJsonPut", "()Lorg/json/JSONObject;", "assetsZipRemoteUrl", "Ljava/lang/String;", "getAssetsZipRemoteUrl", "()Ljava/lang/String;", "setAssetsZipRemoteUrl", "(Ljava/lang/String;)V", "Companion", "com/braze/models/inappmessage/j", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class InAppMessageZippedAssetHtmlBase extends InAppMessageHtmlBase implements IInAppMessageZippedAssetHtml {
    public static final j Companion = new j();
    private String assetsZipRemoteUrl;

    public InAppMessageZippedAssetHtmlBase() {
    }

    @Override // com.braze.models.inappmessage.IInAppMessageZippedAssetHtml
    public String getAssetsZipRemoteUrl() {
        return this.assetsZipRemoteUrl;
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessage
    public List<String> getRemoteAssetPathsForPrefetch() {
        ArrayList arrayList = new ArrayList();
        String assetsZipRemoteUrl = getAssetsZipRemoteUrl();
        if (assetsZipRemoteUrl != null && !F.k0(assetsZipRemoteUrl)) {
            arrayList.add(assetsZipRemoteUrl);
        }
        return arrayList;
    }

    public void setAssetsZipRemoteUrl(String str) {
        this.assetsZipRemoteUrl = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageZippedAssetHtmlBase(JSONObject jsonObject, m0 brazeManager) {
        super(jsonObject, brazeManager);
        AbstractC4862t.e(jsonObject, "jsonObject");
        AbstractC4862t.e(brazeManager, "brazeManager");
        String strOptString = jsonObject.optString("zipped_assets_url");
        AbstractC4862t.b(strOptString);
        if (F.k0(strOptString)) {
            return;
        }
        setAssetsZipRemoteUrl(strOptString);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut */
    public JSONObject getKey() {
        JSONObject jsonObject = getJsonObject();
        if (jsonObject != null) {
            return jsonObject;
        }
        JSONObject key = super.getKey();
        try {
            key.putOpt("zipped_assets_url", getAssetsZipRemoteUrl());
        } catch (JSONException unused) {
        }
        return key;
    }
}
