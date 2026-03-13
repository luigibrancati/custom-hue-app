package com.cloudwebrtc.webrtc.utils;

import android.util.Log;
import java.util.List;
import java.util.Map;
import org.webrtc.MediaConstraints;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class MediaConstraintsUtils {
    public static final String TAG = "MediaConstraintsUtils";

    /* JADX INFO: renamed from: com.cloudwebrtc.webrtc.utils.MediaConstraintsUtils$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$cloudwebrtc$webrtc$utils$ObjectType;

        static {
            int[] iArr = new int[ObjectType.values().length];
            $SwitchMap$com$cloudwebrtc$webrtc$utils$ObjectType = iArr;
            try {
                iArr[ObjectType.Boolean.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$cloudwebrtc$webrtc$utils$ObjectType[ObjectType.Number.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$cloudwebrtc$webrtc$utils$ObjectType[ObjectType.String.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static String getMapStrValue(ConstraintsMap constraintsMap, String str) {
        if (!constraintsMap.hasKey(str)) {
            return null;
        }
        int i10 = AnonymousClass1.$SwitchMap$com$cloudwebrtc$webrtc$utils$ObjectType[constraintsMap.getType(str).ordinal()];
        if (i10 == 1) {
            return String.valueOf(constraintsMap.getBoolean(str));
        }
        if (i10 == 2) {
            return String.valueOf(constraintsMap.getDouble(str));
        }
        if (i10 != 3) {
            return null;
        }
        return constraintsMap.getString(str);
    }

    private static void parseConstraints(ConstraintsMap constraintsMap, List<MediaConstraints.KeyValuePair> list) {
        for (Map.Entry<String, Object> entry : constraintsMap.toMap().entrySet()) {
            list.add(new MediaConstraints.KeyValuePair(entry.getKey(), getMapStrValue(constraintsMap, entry.getKey())));
        }
    }

    public static MediaConstraints parseMediaConstraints(ConstraintsMap constraintsMap) {
        MediaConstraints mediaConstraints = new MediaConstraints();
        if (constraintsMap.hasKey("mandatory") && constraintsMap.getType("mandatory") == ObjectType.Map) {
            parseConstraints(constraintsMap.getMap("mandatory"), mediaConstraints.mandatory);
        } else {
            Log.d(TAG, "mandatory constraints are not a map");
        }
        if (!constraintsMap.hasKey("optional") || constraintsMap.getType("optional") != ObjectType.Array) {
            Log.d(TAG, "optional constraints are not an array");
            return mediaConstraints;
        }
        ConstraintsArray array = constraintsMap.getArray("optional");
        int size = array.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (array.getType(i10) == ObjectType.Map) {
                parseConstraints(array.getMap(i10), mediaConstraints.optional);
            }
        }
        return mediaConstraints;
    }
}
