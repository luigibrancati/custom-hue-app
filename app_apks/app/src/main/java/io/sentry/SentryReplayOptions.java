package io.sentry;

import io.sentry.protocol.SdkVersion;
import io.sentry.util.SampleRateUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.apache.tika.metadata.HttpHeaders;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SentryReplayOptions {
    public static final String ANDROIDX_MEDIA_VIEW_CLASS_NAME = "androidx.media3.ui.PlayerView";
    private static final List<String> DEFAULT_HEADERS = Collections.unmodifiableList(Arrays.asList(HttpHeaders.CONTENT_TYPE, HttpHeaders.CONTENT_LENGTH, "Accept"));
    public static final String EXOPLAYER_CLASS_NAME = "com.google.android.exoplayer2.ui.PlayerView";
    public static final String EXOPLAYER_STYLED_CLASS_NAME = "com.google.android.exoplayer2.ui.StyledPlayerView";
    public static final String IMAGE_VIEW_CLASS_NAME = "android.widget.ImageView";
    public static final int MAX_NETWORK_BODY_SIZE = 153600;
    public static final String TEXT_VIEW_CLASS_NAME = "android.widget.TextView";
    public static final String VIDEO_VIEW_CLASS_NAME = "android.widget.VideoView";
    public static final String WEB_VIEW_CLASS_NAME = "android.webkit.WebView";
    private boolean debug;
    private long errorReplayDuration;
    private int frameRate;
    private Set<String> maskViewClasses;
    private String maskViewContainerClass;
    private boolean networkCaptureBodies;
    private List<String> networkDetailAllowUrls;
    private List<String> networkDetailDenyUrls;
    private List<String> networkRequestHeaders;
    private List<String> networkResponseHeaders;
    private Double onErrorSampleRate;
    private SentryReplayQuality quality;
    private ScreenshotStrategyType screenshotStrategy;
    private SdkVersion sdkVersion;
    private long sessionDuration;
    private Double sessionSampleRate;
    private long sessionSegmentDuration;
    private boolean trackConfiguration;
    private Set<String> unmaskViewClasses;
    private String unmaskViewContainerClass;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum SentryReplayQuality {
        LOW(0.8f, 50000, 10),
        MEDIUM(1.0f, 75000, 30),
        HIGH(1.0f, 100000, 50);

        public final int bitRate;
        public final int screenshotQuality;
        public final float sizeScale;

        SentryReplayQuality(float f10, int i10, int i11) {
            this.sizeScale = f10;
            this.bitRate = i10;
            this.screenshotQuality = i11;
        }

        public String serializedName() {
            return name().toLowerCase(Locale.ROOT);
        }
    }

    public SentryReplayOptions(boolean z10, SdkVersion sdkVersion) {
        this.maskViewClasses = new CopyOnWriteArraySet();
        this.unmaskViewClasses = new CopyOnWriteArraySet();
        this.maskViewContainerClass = null;
        this.unmaskViewContainerClass = null;
        this.quality = SentryReplayQuality.MEDIUM;
        this.frameRate = 1;
        this.errorReplayDuration = TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION;
        this.sessionSegmentDuration = 5000L;
        this.sessionDuration = 3600000L;
        this.trackConfiguration = true;
        this.debug = false;
        this.screenshotStrategy = ScreenshotStrategyType.PIXEL_COPY;
        List<String> list = Collections.EMPTY_LIST;
        this.networkDetailAllowUrls = list;
        this.networkDetailDenyUrls = list;
        this.networkCaptureBodies = true;
        List<String> list2 = DEFAULT_HEADERS;
        this.networkRequestHeaders = list2;
        this.networkResponseHeaders = list2;
        if (z10) {
            return;
        }
        setMaskAllText(true);
        setMaskAllImages(true);
        this.maskViewClasses.add(WEB_VIEW_CLASS_NAME);
        this.maskViewClasses.add(VIDEO_VIEW_CLASS_NAME);
        this.maskViewClasses.add(ANDROIDX_MEDIA_VIEW_CLASS_NAME);
        this.maskViewClasses.add(EXOPLAYER_CLASS_NAME);
        this.maskViewClasses.add(EXOPLAYER_STYLED_CLASS_NAME);
        this.sdkVersion = sdkVersion;
    }

    public static List<String> getNetworkDetailsDefaultHeaders() {
        return DEFAULT_HEADERS;
    }

    private static List<String> mergeHeaders(List<String> list, List<String> list2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(list);
        linkedHashSet.addAll(list2);
        return Collections.unmodifiableList(new ArrayList(linkedHashSet));
    }

    public void addMaskViewClass(String str) {
        this.maskViewClasses.add(str);
    }

    public void addUnmaskViewClass(String str) {
        this.unmaskViewClasses.add(str);
    }

    public long getErrorReplayDuration() {
        return this.errorReplayDuration;
    }

    public int getFrameRate() {
        return this.frameRate;
    }

    public Set<String> getMaskViewClasses() {
        return this.maskViewClasses;
    }

    public String getMaskViewContainerClass() {
        return this.maskViewContainerClass;
    }

    public List<String> getNetworkDetailAllowUrls() {
        return this.networkDetailAllowUrls;
    }

    public List<String> getNetworkDetailDenyUrls() {
        return this.networkDetailDenyUrls;
    }

    public List<String> getNetworkRequestHeaders() {
        return this.networkRequestHeaders;
    }

    public List<String> getNetworkResponseHeaders() {
        return this.networkResponseHeaders;
    }

    public Double getOnErrorSampleRate() {
        return this.onErrorSampleRate;
    }

    public SentryReplayQuality getQuality() {
        return this.quality;
    }

    public ScreenshotStrategyType getScreenshotStrategy() {
        return this.screenshotStrategy;
    }

    public SdkVersion getSdkVersion() {
        return this.sdkVersion;
    }

    public long getSessionDuration() {
        return this.sessionDuration;
    }

    public Double getSessionSampleRate() {
        return this.sessionSampleRate;
    }

    public long getSessionSegmentDuration() {
        return this.sessionSegmentDuration;
    }

    public Set<String> getUnmaskViewClasses() {
        return this.unmaskViewClasses;
    }

    public String getUnmaskViewContainerClass() {
        return this.unmaskViewContainerClass;
    }

    public boolean isDebug() {
        return this.debug;
    }

    public boolean isNetworkCaptureBodies() {
        return this.networkCaptureBodies;
    }

    public boolean isSessionReplayEnabled() {
        return getSessionSampleRate() != null && getSessionSampleRate().doubleValue() > 0.0d;
    }

    public boolean isSessionReplayForErrorsEnabled() {
        return getOnErrorSampleRate() != null && getOnErrorSampleRate().doubleValue() > 0.0d;
    }

    public boolean isTrackConfiguration() {
        return this.trackConfiguration;
    }

    public void setDebug(boolean z10) {
        this.debug = z10;
    }

    public void setMaskAllImages(boolean z10) {
        if (z10) {
            addMaskViewClass(IMAGE_VIEW_CLASS_NAME);
            this.unmaskViewClasses.remove(IMAGE_VIEW_CLASS_NAME);
        } else {
            addUnmaskViewClass(IMAGE_VIEW_CLASS_NAME);
            this.maskViewClasses.remove(IMAGE_VIEW_CLASS_NAME);
        }
    }

    public void setMaskAllText(boolean z10) {
        if (z10) {
            addMaskViewClass(TEXT_VIEW_CLASS_NAME);
            this.unmaskViewClasses.remove(TEXT_VIEW_CLASS_NAME);
        } else {
            addUnmaskViewClass(TEXT_VIEW_CLASS_NAME);
            this.maskViewClasses.remove(TEXT_VIEW_CLASS_NAME);
        }
    }

    public void setMaskViewContainerClass(String str) {
        addMaskViewClass(str);
        this.maskViewContainerClass = str;
    }

    public void setNetworkCaptureBodies(boolean z10) {
        this.networkCaptureBodies = z10;
    }

    public void setNetworkDetailAllowUrls(List<String> list) {
        this.networkDetailAllowUrls = Collections.unmodifiableList(new ArrayList(list));
    }

    public void setNetworkDetailDenyUrls(List<String> list) {
        this.networkDetailDenyUrls = Collections.unmodifiableList(new ArrayList(list));
    }

    public void setNetworkRequestHeaders(List<String> list) {
        this.networkRequestHeaders = mergeHeaders(DEFAULT_HEADERS, list);
    }

    public void setNetworkResponseHeaders(List<String> list) {
        this.networkResponseHeaders = mergeHeaders(DEFAULT_HEADERS, list);
    }

    public void setOnErrorSampleRate(Double d10) {
        if (SampleRateUtils.isValidSampleRate(d10)) {
            this.onErrorSampleRate = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public void setQuality(SentryReplayQuality sentryReplayQuality) {
        this.quality = sentryReplayQuality;
    }

    public void setScreenshotStrategy(ScreenshotStrategyType screenshotStrategyType) {
        this.screenshotStrategy = screenshotStrategyType;
    }

    public void setSdkVersion(SdkVersion sdkVersion) {
        this.sdkVersion = sdkVersion;
    }

    public void setSessionSampleRate(Double d10) {
        if (SampleRateUtils.isValidSampleRate(d10)) {
            this.sessionSampleRate = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public void setTrackConfiguration(boolean z10) {
        this.trackConfiguration = z10;
    }

    public void setUnmaskViewContainerClass(String str) {
        this.unmaskViewContainerClass = str;
    }

    public SentryReplayOptions(Double d10, Double d11, SdkVersion sdkVersion) {
        this(false, sdkVersion);
        this.sessionSampleRate = d10;
        this.onErrorSampleRate = d11;
        this.sdkVersion = sdkVersion;
    }
}
