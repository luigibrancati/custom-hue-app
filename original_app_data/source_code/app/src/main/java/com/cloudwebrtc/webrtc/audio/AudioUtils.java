package com.cloudwebrtc.webrtc.audio;

import android.media.AudioDeviceInfo;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class AudioUtils {
    private static final String TAG = "AudioUtils";

    public static Integer getAudioAttributesContentTypeFromString(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
            case "sonification":
                break;
            case "speech":
                break;
            case "unknown":
                break;
            case "movie":
                break;
            case "music":
                break;
            default:
                Log.w(TAG, "Unknown audio attributes content type:" + str);
                break;
        }
        return null;
    }

    public static Integer getAudioAttributesUsageTypeForString(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
            case "notificationEvent":
                break;
            case "voiceCommunication":
                break;
            case "unknown":
                break;
            case "game":
                break;
            case "assistanceSonification":
                break;
            case "alarm":
                break;
            case "media":
                break;
            case "notification":
                break;
            case "assistanceAccessibility":
                break;
            case "notificationRingtone":
                break;
            case "assistant":
                break;
            case "assistanceNavigationGuidance":
                break;
            case "voiceCommunicationSignalling":
                break;
            default:
                Log.w(TAG, "Unknown audio attributes usage type: " + str);
                break;
        }
        return null;
    }

    public static String getAudioDeviceId(AudioDeviceInfo audioDeviceInfo) {
        String address = audioDeviceInfo.getAddress();
        String str = "" + audioDeviceInfo.getId();
        if (audioDeviceInfo.getType() == 15) {
            str = "microphone-" + address;
        }
        if (audioDeviceInfo.getType() == 3) {
            str = "wired-headset";
        }
        return audioDeviceInfo.getType() == 7 ? "bluetooth" : str;
    }

    public static String getAudioDeviceLabel(AudioDeviceInfo audioDeviceInfo) {
        String address = audioDeviceInfo.getAddress();
        String string = audioDeviceInfo.getProductName().toString();
        if (audioDeviceInfo.getType() == 15) {
            string = "Built-in Microphone (" + address + ")";
        }
        if (audioDeviceInfo.getType() == 3) {
            string = "Wired Headset Microphone";
        }
        return audioDeviceInfo.getType() == 7 ? audioDeviceInfo.getProductName().toString() : string;
    }

    public static String getAudioGroupId(AudioDeviceInfo audioDeviceInfo) {
        String str = "" + audioDeviceInfo.getType();
        if (audioDeviceInfo.getType() == 15) {
            str = "microphone";
        }
        if (audioDeviceInfo.getType() == 3) {
            str = "wired-headset";
        }
        return audioDeviceInfo.getType() == 7 ? "bluetooth" : str;
    }

    public static Integer getAudioModeForString(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
            case "callScreening":
                break;
            case "ringtone":
                break;
            case "inCall":
                break;
            case "normal":
                break;
            case "inCommunication":
                break;
            default:
                Log.w(TAG, "Unknown audio mode: " + str);
                break;
        }
        return null;
    }

    public static Integer getFocusModeForString(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
            case "gainTransient":
                break;
            case "gainTransientExclusive":
                break;
            case "gainTransientMayDuck":
                break;
            case "gain":
                break;
            case "loss":
                break;
            default:
                Log.w(TAG, "Unknown audio focus mode: " + str);
                break;
        }
        return null;
    }

    public static Integer getStreamTypeForString(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
            case "voiceCall":
                break;
            case "system":
                break;
            case "accessibility":
                break;
            case "dtmf":
                break;
            case "ring":
                break;
            case "alarm":
                break;
            case "music":
                break;
            case "notification":
                break;
            default:
                Log.w(TAG, "Unknown audio stream type: " + str);
                break;
        }
        return null;
    }
}
