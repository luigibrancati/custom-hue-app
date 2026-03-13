package org.webrtc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes5.dex */
public class VideoCodecInfo {
    public static final String H264_CONSTRAINED_BASELINE_3_1 = "42e01f";
    public static final String H264_CONSTRAINED_HIGH_3_1 = "640c1f";
    public static final String H264_FMTP_LEVEL_ASYMMETRY_ALLOWED = "level-asymmetry-allowed";
    public static final String H264_FMTP_PACKETIZATION_MODE = "packetization-mode";
    public static final String H264_FMTP_PROFILE_LEVEL_ID = "profile-level-id";
    public static final String H264_LEVEL_3_1 = "1f";
    public static final String H264_PROFILE_CONSTRAINED_BASELINE = "42e0";
    public static final String H264_PROFILE_CONSTRAINED_HIGH = "640c";
    public final String name;
    public final Map<String, String> params;

    @Deprecated
    public final int payload;
    public final List<String> scalabilityModes;

    @CalledByNative
    public VideoCodecInfo(String str, Map<String, String> map, List<String> list) {
        this.payload = 0;
        this.name = str;
        this.params = map;
        this.scalabilityModes = list;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoCodecInfo)) {
            return false;
        }
        VideoCodecInfo videoCodecInfo = (VideoCodecInfo) obj;
        return this.name.equalsIgnoreCase(videoCodecInfo.name) && this.params.equals(videoCodecInfo.params);
    }

    @CalledByNative
    public String getName() {
        return this.name;
    }

    @CalledByNative
    public Map getParams() {
        return this.params;
    }

    @CalledByNative
    public List<String> getScalabilityModes() {
        return this.scalabilityModes;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.name.toUpperCase(Locale.ROOT), this.params});
    }

    public String toString() {
        return "VideoCodec{" + this.name + StringUtils.SPACE + String.valueOf(this.params) + "}";
    }

    @Deprecated
    public VideoCodecInfo(int i10, String str, Map<String, String> map) {
        this.payload = i10;
        this.name = str;
        this.params = map;
        this.scalabilityModes = new ArrayList();
    }
}
