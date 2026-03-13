package ef;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f33975a;

    /* JADX INFO: renamed from: ef.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum EnumC0435a {
        defaultSource,
        microphone,
        voiceDownlink,
        camCorder,
        remote_submix,
        unprocessed,
        voice_call,
        voice_communication,
        voice_performance,
        voice_recognition,
        voiceUpLink,
        bluetoothHFP,
        headsetMic,
        lineIn
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum b {
        defaultCodec,
        aacADTS,
        opusOGG,
        opusCAF,
        mp3,
        vorbisOGG,
        pcm16,
        pcm16WAV,
        pcm16AIFF,
        pcm16CAF,
        flac,
        aacMP4,
        amrNB,
        amrWB,
        pcm8,
        pcmFloat32,
        pcmWebM,
        opusWebM,
        vorbisWebM,
        pcmFloat32WAV
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum c {
        VERBOSE,
        DBG,
        INFO,
        WARNING,
        ERROR,
        WTF,
        NOTHING
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum d {
        PLAYER_IS_STOPPED,
        PLAYER_IS_PLAYING,
        PLAYER_IS_PAUSED
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum e {
        RECORDER_IS_STOPPED,
        RECORDER_IS_PAUSED,
        RECORDER_IS_RECORDING
    }

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        return !str.contains("/") ? b(str) : str;
    }

    public static String b(String str) {
        return f33975a.getCacheDir() + "/" + str;
    }
}
