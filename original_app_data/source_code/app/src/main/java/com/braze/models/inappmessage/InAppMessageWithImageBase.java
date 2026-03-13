package com.braze.models.inappmessage;

import Od.F;
import android.graphics.Bitmap;
import com.braze.managers.m0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0013\b'\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001.B\t\b\u0014¢\u0006\u0004\b\u0003\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0003\u0010\tJ#\u0010\u000e\u001a\u00020\r2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR(\u0010\u001d\u001a\u00020\u001c8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b#\u0010\u0004\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010$\u001a\u0004\u0018\u00010\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010*\u001a\u0004\u0018\u00010\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)¨\u0006/"}, d2 = {"Lcom/braze/models/inappmessage/InAppMessageWithImageBase;", "Lcom/braze/models/inappmessage/InAppMessageBase;", "Lcom/braze/models/inappmessage/IInAppMessageWithImage;", "<init>", "()V", "Lorg/json/JSONObject;", "jsonObject", "Lcom/braze/managers/m0;", "brazeManager", "(Lorg/json/JSONObject;Lcom/braze/managers/m0;)V", "", "", "remotePathToLocalAssetMap", "Lfc/H;", "setLocalPrefetchedAssetPaths", "(Ljava/util/Map;)V", "", "getRemoteAssetPathsForPrefetch", "()Ljava/util/List;", "forJsonPut", "()Lorg/json/JSONObject;", "Landroid/graphics/Bitmap;", "bitmap", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "setBitmap", "(Landroid/graphics/Bitmap;)V", "", "imageDownloadSuccessful", "Z", "getImageDownloadSuccessful", "()Z", "setImageDownloadSuccessful", "(Z)V", "getImageDownloadSuccessful$annotations", "localImageUrl", "Ljava/lang/String;", "getLocalImageUrl", "()Ljava/lang/String;", "setLocalImageUrl", "(Ljava/lang/String;)V", "remoteImageUrl", "getRemoteImageUrl", "setRemoteImageUrl", "Companion", "com/braze/models/inappmessage/i", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class InAppMessageWithImageBase extends InAppMessageBase implements IInAppMessageWithImage {
    public static final i Companion = new i();
    private Bitmap bitmap;
    private boolean imageDownloadSuccessful;
    private String localImageUrl;
    private String remoteImageUrl;

    public InAppMessageWithImageBase() {
    }

    @Override // com.braze.models.inappmessage.IInAppMessageWithImage
    public Bitmap getBitmap() {
        return this.bitmap;
    }

    public boolean getImageDownloadSuccessful() {
        return this.imageDownloadSuccessful;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageWithImage
    public String getLocalImageUrl() {
        return this.localImageUrl;
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessage
    public List<String> getRemoteAssetPathsForPrefetch() {
        ArrayList arrayList = new ArrayList();
        String remoteImageUrl = getRemoteImageUrl();
        if (remoteImageUrl != null && !F.k0(remoteImageUrl)) {
            arrayList.add(remoteImageUrl);
        }
        return arrayList;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageWithImage
    public String getRemoteImageUrl() {
        return this.remoteImageUrl;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageWithImage
    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageWithImage
    public void setImageDownloadSuccessful(boolean z10) {
        this.imageDownloadSuccessful = z10;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageWithImage
    public void setLocalImageUrl(String str) {
        this.localImageUrl = str;
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessage
    public void setLocalPrefetchedAssetPaths(Map<String, String> remotePathToLocalAssetMap) {
        AbstractC4862t.e(remotePathToLocalAssetMap, "remotePathToLocalAssetMap");
        if (remotePathToLocalAssetMap.isEmpty()) {
            return;
        }
        setLocalImageUrl(((String[]) remotePathToLocalAssetMap.values().toArray(new String[0]))[0]);
    }

    public void setRemoteImageUrl(String str) {
        this.remoteImageUrl = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageWithImageBase(JSONObject jsonObject, m0 brazeManager) {
        super(jsonObject, brazeManager, false, false, 12, null);
        AbstractC4862t.e(jsonObject, "jsonObject");
        AbstractC4862t.e(brazeManager, "brazeManager");
        setRemoteImageUrl(jsonObject.optString("image_url"));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut */
    public JSONObject getKey() {
        JSONObject jsonObject = getJsonObject();
        if (jsonObject != null) {
            return jsonObject;
        }
        JSONObject jsonObject2 = super.getKey();
        try {
            jsonObject2.putOpt("image_url", getRemoteImageUrl());
        } catch (JSONException unused) {
        }
        return jsonObject2;
    }
}
