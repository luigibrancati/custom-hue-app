package io.flutter.plugins.imagepicker;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import io.flutter.plugins.imagepicker.Messages;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class ImagePickerCache {
    private static final String FLUTTER_IMAGE_PICKER_IMAGE_PATH_KEY = "flutter_image_picker_image_path";
    static final String MAP_KEY_ERROR = "error";
    static final String MAP_KEY_IMAGE_QUALITY = "imageQuality";
    static final String MAP_KEY_MAX_HEIGHT = "maxHeight";
    static final String MAP_KEY_MAX_WIDTH = "maxWidth";
    static final String MAP_KEY_PATH_LIST = "pathList";
    static final String MAP_KEY_TYPE = "type";
    private static final String MAP_TYPE_VALUE_IMAGE = "image";
    private static final String MAP_TYPE_VALUE_VIDEO = "video";
    static final String SHARED_PREFERENCES_NAME = "flutter_image_picker_shared_preference";
    private static final String SHARED_PREFERENCE_ERROR_CODE_KEY = "flutter_image_picker_error_code";
    private static final String SHARED_PREFERENCE_ERROR_MESSAGE_KEY = "flutter_image_picker_error_message";
    private static final String SHARED_PREFERENCE_IMAGE_QUALITY_KEY = "flutter_image_picker_image_quality";
    private static final String SHARED_PREFERENCE_MAX_HEIGHT_KEY = "flutter_image_picker_max_height";
    private static final String SHARED_PREFERENCE_MAX_WIDTH_KEY = "flutter_image_picker_max_width";
    private static final String SHARED_PREFERENCE_PENDING_IMAGE_URI_PATH_KEY = "flutter_image_picker_pending_image_uri";
    private static final String SHARED_PREFERENCE_TYPE_KEY = "flutter_image_picker_type";
    private final Context context;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum CacheType {
        IMAGE,
        VIDEO
    }

    public ImagePickerCache(Context context) {
        this.context = context;
    }

    private void setType(String str) {
        this.context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit().putString(SHARED_PREFERENCE_TYPE_KEY, str).apply();
    }

    public void clear() {
        this.context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit().clear().apply();
    }

    public Map<String, Object> getCacheMap() {
        Set<String> stringSet;
        HashMap map = new HashMap();
        boolean z10 = false;
        SharedPreferences sharedPreferences = this.context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0);
        boolean z11 = true;
        if (sharedPreferences.contains(FLUTTER_IMAGE_PICKER_IMAGE_PATH_KEY) && (stringSet = sharedPreferences.getStringSet(FLUTTER_IMAGE_PICKER_IMAGE_PATH_KEY, null)) != null) {
            map.put(MAP_KEY_PATH_LIST, new ArrayList(stringSet));
            z10 = true;
        }
        if (sharedPreferences.contains(SHARED_PREFERENCE_ERROR_CODE_KEY)) {
            Messages.CacheRetrievalError.Builder builder = new Messages.CacheRetrievalError.Builder();
            builder.setCode(sharedPreferences.getString(SHARED_PREFERENCE_ERROR_CODE_KEY, ""));
            if (sharedPreferences.contains(SHARED_PREFERENCE_ERROR_MESSAGE_KEY)) {
                builder.setMessage(sharedPreferences.getString(SHARED_PREFERENCE_ERROR_MESSAGE_KEY, ""));
            }
            map.put(MAP_KEY_ERROR, builder.build());
        } else {
            z11 = z10;
        }
        if (z11) {
            if (sharedPreferences.contains(SHARED_PREFERENCE_TYPE_KEY)) {
                map.put("type", sharedPreferences.getString(SHARED_PREFERENCE_TYPE_KEY, "").equals("video") ? Messages.CacheRetrievalType.VIDEO : Messages.CacheRetrievalType.IMAGE);
            }
            if (sharedPreferences.contains(SHARED_PREFERENCE_MAX_WIDTH_KEY)) {
                map.put(MAP_KEY_MAX_WIDTH, Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong(SHARED_PREFERENCE_MAX_WIDTH_KEY, 0L))));
            }
            if (sharedPreferences.contains(SHARED_PREFERENCE_MAX_HEIGHT_KEY)) {
                map.put(MAP_KEY_MAX_HEIGHT, Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong(SHARED_PREFERENCE_MAX_HEIGHT_KEY, 0L))));
            }
            map.put(MAP_KEY_IMAGE_QUALITY, Integer.valueOf(sharedPreferences.getInt(SHARED_PREFERENCE_IMAGE_QUALITY_KEY, 100)));
        }
        return map;
    }

    public String retrievePendingCameraMediaUriPath() {
        return this.context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(SHARED_PREFERENCE_PENDING_IMAGE_URI_PATH_KEY, "");
    }

    public void saveDimensionWithOutputOptions(Messages.ImageSelectionOptions imageSelectionOptions) {
        SharedPreferences.Editor editorEdit = this.context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
        if (imageSelectionOptions.getMaxWidth() != null) {
            editorEdit.putLong(SHARED_PREFERENCE_MAX_WIDTH_KEY, Double.doubleToRawLongBits(imageSelectionOptions.getMaxWidth().doubleValue()));
        }
        if (imageSelectionOptions.getMaxHeight() != null) {
            editorEdit.putLong(SHARED_PREFERENCE_MAX_HEIGHT_KEY, Double.doubleToRawLongBits(imageSelectionOptions.getMaxHeight().doubleValue()));
        }
        editorEdit.putInt(SHARED_PREFERENCE_IMAGE_QUALITY_KEY, imageSelectionOptions.getQuality().intValue());
        editorEdit.apply();
    }

    public void savePendingCameraMediaUriPath(Uri uri) {
        this.context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit().putString(SHARED_PREFERENCE_PENDING_IMAGE_URI_PATH_KEY, uri.getPath()).apply();
    }

    public void saveResult(ArrayList<String> arrayList, String str, String str2) {
        SharedPreferences.Editor editorEdit = this.context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
        if (arrayList != null) {
            editorEdit.putStringSet(FLUTTER_IMAGE_PICKER_IMAGE_PATH_KEY, new HashSet(arrayList));
        }
        if (str != null) {
            editorEdit.putString(SHARED_PREFERENCE_ERROR_CODE_KEY, str);
        }
        if (str2 != null) {
            editorEdit.putString(SHARED_PREFERENCE_ERROR_MESSAGE_KEY, str2);
        }
        editorEdit.apply();
    }

    public void saveType(CacheType cacheType) {
        int iOrdinal = cacheType.ordinal();
        if (iOrdinal == 0) {
            setType(MAP_TYPE_VALUE_IMAGE);
        } else {
            if (iOrdinal != 1) {
                return;
            }
            setType("video");
        }
    }
}
