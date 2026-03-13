package io.flutter.plugins.imagepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import com.google.android.libraries.barhopper.RecognitionOptions;
import io.flutter.plugins.imagepicker.Messages;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
final class ImagePickerUtils {
    public static int getLimitFromOption(Messages.GeneralOptions generalOptions) {
        Long limit = generalOptions.getLimit();
        int maxItems = getMaxItems();
        return (limit == null || limit.longValue() >= ((long) maxItems)) ? maxItems : Math.toIntExact(limit.longValue());
    }

    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    public static int getMaxItems() {
        if (Build.VERSION.SDK_INT >= 33 || SdkExtensions.getExtensionVersion(30) >= 2) {
            return MediaStore.getPickImagesMaxLimit();
        }
        return Integer.MAX_VALUE;
    }

    private static PackageInfo getPermissionsPackageInfoPreApi33(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, RecognitionOptions.AZTEC);
    }

    private static boolean isPermissionPresentInManifest(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            return Arrays.asList((Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(4096L)) : getPermissionsPackageInfoPreApi33(packageManager, context.getPackageName())).requestedPermissions).contains(str);
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static boolean needRequestCameraPermission(Context context) {
        return isPermissionPresentInManifest(context, "android.permission.CAMERA");
    }
}
