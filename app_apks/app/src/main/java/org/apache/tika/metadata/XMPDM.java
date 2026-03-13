package org.apache.tika.metadata;

import io.sentry.protocol.Request;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface XMPDM {
    public static final Property ABS_PEAK_AUDIO_FILE_PATH = Property.internalURI("xmpDM:absPeakAudioFilePath");
    public static final Property ALBUM = Property.externalText("xmpDM:album");
    public static final Property ALT_TAPE_NAME = Property.externalText("xmpDM:altTapeName");
    public static final Property ARTIST = Property.externalText("xmpDM:artist");
    public static final Property ALBUM_ARTIST = Property.externalText("xmpDM:albumArtist");
    public static final Property AUDIO_MOD_DATE = Property.internalDate("xmpDM:audioModDate");
    public static final Property AUDIO_SAMPLE_RATE = Property.internalInteger("xmpDM:audioSampleRate");
    public static final Property AUDIO_SAMPLE_TYPE = Property.internalClosedChoise("xmpDM:audioSampleType", "8Int", "16Int", "32Int", "32Float");
    public static final Property AUDIO_CHANNEL_TYPE = Property.internalClosedChoise("xmpDM:audioChannelType", "Mono", "Stereo", "5.1", "7.1");
    public static final Property AUDIO_COMPRESSOR = Property.internalText("xmpDM:audioCompressor");
    public static final Property COMPILATION = Property.externalInteger("xmpDM:compilation");
    public static final Property COMPOSER = Property.externalText("xmpDM:composer");
    public static final Property COPYRIGHT = Property.externalText("xmpDM:copyright");
    public static final Property DISC_NUMBER = Property.externalInteger("xmpDM:discNumber");
    public static final Property DURATION = Property.externalReal("xmpDM:duration");
    public static final Property ENGINEER = Property.externalText("xmpDM:engineer");
    public static final Property FILE_DATA_RATE = Property.internalRational("xmpDM:fileDataRate");
    public static final Property GENRE = Property.externalText("xmpDM:genre");
    public static final Property INSTRUMENT = Property.externalText("xmpDM:instrument");
    public static final Property KEY = Property.internalClosedChoise("xmpDM:key", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B");
    public static final Property LOG_COMMENT = Property.externalText("xmpDM:logComment");
    public static final Property LOOP = Property.internalBoolean("xmpDM:loop");
    public static final Property NUMBER_OF_BEATS = Property.internalReal("xmpDM:numberOfBeats");
    public static final Property METADATA_MOD_DATE = Property.internalDate("xmpDM:metadataModDate");
    public static final Property PULL_DOWN = Property.internalClosedChoise("xmpDM:pullDown", "WSSWW", "SSWWW", "SWWWS", "WWWSS", "WWSSW", "WSSWW_24p", "SSWWW_24p", "SWWWS_24p", "WWWSS_24p", "WWSSW_24p");
    public static final Property RELATIVE_PEAK_AUDIO_FILE_PATH = Property.internalURI("xmpDM:relativePeakAudioFilePath");
    public static final Property RELEASE_DATE = Property.externalDate("xmpDM:releaseDate");
    public static final Property SCALE_TYPE = Property.internalClosedChoise("xmpDM:scaleType", "Major", "Minor", "Both", "Neither");
    public static final Property SCENE = Property.externalText("xmpDM:scene");
    public static final Property SHOT_DATE = Property.externalDate("xmpDM:shotDate");
    public static final Property SHOT_LOCATION = Property.externalText("xmpDM:shotLocation");
    public static final Property SHOT_NAME = Property.externalText("xmpDM:shotName");
    public static final Property SPEAKER_PLACEMENT = Property.externalText("xmpDM:speakerPlacement");
    public static final Property STRETCH_MODE = Property.internalClosedChoise("xmpDM:stretchMode", "Fixed length", "Time-Scale", "Resample", "Beat Splice", "Hybrid");
    public static final Property TAPE_NAME = Property.externalText("xmpDM:tapeName");
    public static final Property TEMPO = Property.internalReal("xmpDM:tempo");
    public static final Property TIME_SIGNATURE = Property.internalClosedChoise("xmpDM:timeSignature", "2/4", "3/4", "4/4", "5/4", "7/4", "6/8", "9/8", "12/8", Request.JsonKeys.OTHER);
    public static final Property TRACK_NUMBER = Property.externalInteger("xmpDM:trackNumber");
    public static final Property VIDEO_ALPHA_MODE = Property.externalClosedChoise("xmpDM:videoAlphaMode", "straight", "pre-multiplied");
    public static final Property VIDEO_ALPHA_UNITY_IS_TRANSPARENT = Property.internalBoolean("xmpDM:videoAlphaUnityIsTransparent");
    public static final Property VIDEO_COLOR_SPACE = Property.internalClosedChoise("xmpDM:videoColorSpace", "sRGB", "CCIR-601", "CCIR-709");
    public static final Property VIDEO_COMPRESSOR = Property.internalText("xmpDM:videoCompressor");
    public static final Property VIDEO_FIELD_ORDER = Property.internalClosedChoise("xmpDM:videoFieldOrder", "Upper", "Lower", "Progressive");
    public static final Property VIDEO_FRAME_RATE = Property.internalOpenChoise("xmpDM:videoFrameRate", "24", "NTSC", "PAL");
    public static final Property VIDEO_MOD_DATE = Property.internalDate("xmpDM:videoModDate");
    public static final Property VIDEO_PIXEL_DEPTH = Property.internalClosedChoise("xmpDM:videoPixelDepth", "8Int", "16Int", "32Int", "32Float");
    public static final Property VIDEO_PIXEL_ASPECT_RATIO = Property.internalRational("xmpDM:videoPixelAspectRatio");

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Deprecated
    public static class ChannelTypePropertyConverter {
        private static final Property property = XMPDM.AUDIO_CHANNEL_TYPE;

        public static String convert(Object obj) {
            if (obj instanceof String) {
                return (String) obj;
            }
            if (!(obj instanceof Integer)) {
                return null;
            }
            int iIntValue = ((Integer) obj).intValue();
            if (iIntValue == 1) {
                return "Mono";
            }
            if (iIntValue == 2) {
                return "Stereo";
            }
            if (iIntValue == 5) {
                return "5.1";
            }
            if (iIntValue == 7) {
                return "7.1";
            }
            return null;
        }

        public static void convertAndSet(Metadata metadata, Object obj) {
            if ((obj instanceof Integer) || (obj instanceof Long)) {
                metadata.set(property, convert(obj));
            }
            if (obj instanceof Date) {
                metadata.set(property, (Date) obj);
            }
            if (obj instanceof String) {
                metadata.set(property, (String) obj);
            }
        }
    }
}
