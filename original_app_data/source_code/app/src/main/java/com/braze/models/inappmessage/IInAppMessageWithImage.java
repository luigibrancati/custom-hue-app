package com.braze.models.inappmessage;

import android.graphics.Bitmap;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\bg\u0018\u00002\u00020\u0001R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\u0004\"\u0004\b\t\u0010\u0006R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00118&@&X¦\u000e¢\u0006\u0012\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, d2 = {"Lcom/braze/models/inappmessage/IInAppMessageWithImage;", "", "", "getRemoteImageUrl", "()Ljava/lang/String;", "setRemoteImageUrl", "(Ljava/lang/String;)V", "remoteImageUrl", "getLocalImageUrl", "setLocalImageUrl", "localImageUrl", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "setBitmap", "(Landroid/graphics/Bitmap;)V", "bitmap", "", "getImageDownloadSuccessful", "()Z", "setImageDownloadSuccessful", "(Z)V", "getImageDownloadSuccessful$annotations", "()V", "imageDownloadSuccessful", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IInAppMessageWithImage {
    Bitmap getBitmap();

    String getLocalImageUrl();

    String getRemoteImageUrl();

    void setBitmap(Bitmap bitmap);

    void setImageDownloadSuccessful(boolean z10);

    void setLocalImageUrl(String str);
}
