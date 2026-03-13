package io.sentry.android.replay;

import android.graphics.Bitmap;
import java.io.File;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\f"}, d2 = {"Lio/sentry/android/replay/ScreenshotRecorderCallback;", "", "Landroid/graphics/Bitmap;", "bitmap", "Lfc/H;", "onScreenshotRecorded", "(Landroid/graphics/Bitmap;)V", "Ljava/io/File;", "screenshot", "", "frameTimestamp", "(Ljava/io/File;J)V", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ScreenshotRecorderCallback {
    void onScreenshotRecorded(Bitmap bitmap);

    void onScreenshotRecorded(File screenshot, long frameTimestamp);
}
