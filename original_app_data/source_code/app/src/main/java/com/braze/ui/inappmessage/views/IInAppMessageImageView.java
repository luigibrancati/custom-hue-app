package com.braze.ui.inappmessage.views;

import com.braze.enums.inappmessage.CropType;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Lcom/braze/ui/inappmessage/views/IInAppMessageImageView;", "", "", "topLeft", "topRight", "bottomLeft", "bottomRight", "Lfc/H;", "setCornersRadiiPx", "(FFFF)V", "cornersRadius", "setCornersRadiusPx", "(F)V", "Lcom/braze/enums/inappmessage/CropType;", "cropType", "setInAppMessageImageCropType", "(Lcom/braze/enums/inappmessage/CropType;)V", "", "altImage", "setAltImageText", "(Ljava/lang/String;)V", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IInAppMessageImageView {
    void setAltImageText(String altImage);

    void setCornersRadiiPx(float topLeft, float topRight, float bottomLeft, float bottomRight);

    void setCornersRadiusPx(float cornersRadius);

    void setInAppMessageImageCropType(CropType cropType);
}
