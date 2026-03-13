package io.flutter.plugins.imagepicker;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import com.google.ar.core.ImageMetadata;
import f.i;
import g.d;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.imagepicker.ImagePickerCache;
import io.flutter.plugins.imagepicker.Messages;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class ImagePickerDelegate implements PluginRegistry.ActivityResultListener, PluginRegistry.RequestPermissionsResultListener {
    static final int REQUEST_CAMERA_IMAGE_PERMISSION = 2345;
    static final int REQUEST_CAMERA_VIDEO_PERMISSION = 2355;
    static final int REQUEST_CODE_CHOOSE_IMAGE_FROM_GALLERY = 2342;
    static final int REQUEST_CODE_CHOOSE_MEDIA_FROM_GALLERY = 2347;
    static final int REQUEST_CODE_CHOOSE_MULTI_IMAGE_FROM_GALLERY = 2346;
    static final int REQUEST_CODE_CHOOSE_MULTI_VIDEO_FROM_GALLERY = 2348;
    static final int REQUEST_CODE_CHOOSE_VIDEO_FROM_GALLERY = 2352;
    static final int REQUEST_CODE_TAKE_IMAGE_WITH_CAMERA = 2343;
    static final int REQUEST_CODE_TAKE_VIDEO_WITH_CAMERA = 2353;
    private final Activity activity;
    private final ImagePickerCache cache;
    private CameraDevice cameraDevice;
    private final ExecutorService executor;
    final String fileProviderName;
    private final FileUriResolver fileUriResolver;
    private final FileUtils fileUtils;
    private final ImageResizer imageResizer;
    private PendingCallState pendingCallState;
    private final Object pendingCallStateLock;
    private Uri pendingCameraMediaUri;
    private final PermissionManager permissionManager;

    /* JADX INFO: renamed from: io.flutter.plugins.imagepicker.ImagePickerDelegate$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class AnonymousClass2 implements FileUriResolver {
        final /* synthetic */ Activity val$activity;

        public AnonymousClass2(Activity activity) {
            this.val$activity = activity;
        }

        @Override // io.flutter.plugins.imagepicker.ImagePickerDelegate.FileUriResolver
        public void getFullImagePath(Uri uri, final OnPathReadyListener onPathReadyListener) {
            MediaScannerConnection.scanFile(this.val$activity, new String[]{uri != null ? uri.getPath() : ""}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: io.flutter.plugins.imagepicker.j
                @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                public final void onScanCompleted(String str, Uri uri2) {
                    onPathReadyListener.onPathReady(str);
                }
            });
        }

        @Override // io.flutter.plugins.imagepicker.ImagePickerDelegate.FileUriResolver
        public Uri resolveFileProviderUriForFile(String str, File file) {
            return L0.b.getUriForFile(this.val$activity, str, file);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum CameraDevice {
        REAR,
        FRONT
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface FileUriResolver {
        void getFullImagePath(Uri uri, OnPathReadyListener onPathReadyListener);

        Uri resolveFileProviderUriForFile(String str, File file);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class MediaPath {
        final String mimeType;
        final String path;

        public MediaPath(String str, String str2) {
            this.path = str;
            this.mimeType = str2;
        }

        public String getMimeType() {
            return this.mimeType;
        }

        public String getPath() {
            return this.path;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface OnPathReadyListener {
        void onPathReady(String str);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class PendingCallState {
        public final Messages.ImageSelectionOptions imageOptions;
        public final Messages.Result<List<String>> result;
        public final Messages.VideoSelectionOptions videoOptions;

        public PendingCallState(Messages.ImageSelectionOptions imageSelectionOptions, Messages.VideoSelectionOptions videoSelectionOptions, Messages.Result<List<String>> result) {
            this.imageOptions = imageSelectionOptions;
            this.videoOptions = videoSelectionOptions;
            this.result = result;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface PermissionManager {
        void askForPermission(String str, int i10);

        boolean isPermissionGranted(String str);

        boolean needRequestCameraPermission();
    }

    public ImagePickerDelegate(final Activity activity, ImageResizer imageResizer, ImagePickerCache imagePickerCache) {
        this(activity, imageResizer, null, null, null, imagePickerCache, new PermissionManager() { // from class: io.flutter.plugins.imagepicker.ImagePickerDelegate.1
            @Override // io.flutter.plugins.imagepicker.ImagePickerDelegate.PermissionManager
            public void askForPermission(String str, int i10) {
                androidx.core.app.a.v(activity, new String[]{str}, i10);
            }

            @Override // io.flutter.plugins.imagepicker.ImagePickerDelegate.PermissionManager
            public boolean isPermissionGranted(String str) {
                return L0.a.a(activity, str) == 0;
            }

            @Override // io.flutter.plugins.imagepicker.ImagePickerDelegate.PermissionManager
            public boolean needRequestCameraPermission() {
                return ImagePickerUtils.needRequestCameraPermission(activity);
            }
        }, new AnonymousClass2(activity), new FileUtils(), Executors.newSingleThreadExecutor());
    }

    private File createTemporaryWritableFile(String str) {
        String string = UUID.randomUUID().toString();
        File cacheDir = this.activity.getCacheDir();
        try {
            cacheDir.mkdirs();
            return File.createTempFile(string, str, cacheDir);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    private File createTemporaryWritableImageFile() {
        return createTemporaryWritableFile(".jpg");
    }

    private File createTemporaryWritableVideoFile() {
        return createTemporaryWritableFile(".mp4");
    }

    private void finishWithAlreadyActiveError(Messages.Result<List<String>> result) {
        result.error(new Messages.FlutterError("already_active", "Image picker is already active", null));
    }

    private void finishWithError(String str, String str2) {
        Messages.Result<List<String>> result;
        synchronized (this.pendingCallStateLock) {
            try {
                PendingCallState pendingCallState = this.pendingCallState;
                result = pendingCallState != null ? pendingCallState.result : null;
                this.pendingCallState = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (result == null) {
            this.cache.saveResult(null, str, str2);
        } else {
            result.error(new Messages.FlutterError(str, str2, null));
        }
    }

    private void finishWithListSuccess(ArrayList<String> arrayList) {
        Messages.Result<List<String>> result;
        synchronized (this.pendingCallStateLock) {
            try {
                PendingCallState pendingCallState = this.pendingCallState;
                result = pendingCallState != null ? pendingCallState.result : null;
                this.pendingCallState = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (result == null) {
            this.cache.saveResult(arrayList, null, null);
        } else {
            result.success(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishWithSuccess(String str) {
        Messages.Result<List<String>> result;
        ArrayList<String> arrayList = new ArrayList<>();
        if (str != null) {
            arrayList.add(str);
        }
        synchronized (this.pendingCallStateLock) {
            try {
                PendingCallState pendingCallState = this.pendingCallState;
                result = pendingCallState != null ? pendingCallState.result : null;
                this.pendingCallState = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (result != null) {
            result.success(arrayList);
        } else {
            if (arrayList.isEmpty()) {
                return;
            }
            this.cache.saveResult(arrayList, null, null);
        }
    }

    private ArrayList<MediaPath> getPathsFromIntent(Intent intent, boolean z10) {
        String pathFromUri;
        ArrayList<MediaPath> arrayList = new ArrayList<>();
        Uri data = intent.getData();
        if (data != null) {
            String pathFromUri2 = this.fileUtils.getPathFromUri(this.activity, data);
            if (pathFromUri2 == null) {
                return null;
            }
            arrayList.add(new MediaPath(pathFromUri2, null));
            return arrayList;
        }
        if (intent.getClipData() == null) {
            return null;
        }
        for (int i10 = 0; i10 < intent.getClipData().getItemCount(); i10++) {
            Uri uri = intent.getClipData().getItemAt(i10).getUri();
            if (uri == null || (pathFromUri = this.fileUtils.getPathFromUri(this.activity, uri)) == null) {
                return null;
            }
            arrayList.add(new MediaPath(pathFromUri, z10 ? this.activity.getContentResolver().getType(uri) : null));
        }
        return arrayList;
    }

    private String getResizedImagePath(String str, Messages.ImageSelectionOptions imageSelectionOptions) {
        return this.imageResizer.resizeImageIfNeeded(str, imageSelectionOptions.getMaxWidth(), imageSelectionOptions.getMaxHeight(), imageSelectionOptions.getQuality().intValue());
    }

    private void grantUriPermissions(Intent intent, Uri uri) {
        PackageManager packageManager = this.activity.getPackageManager();
        Iterator<ResolveInfo> it = (Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(65536L)) : queryIntentActivitiesPreApi33(packageManager, intent)).iterator();
        while (it.hasNext()) {
            this.activity.grantUriPermission(it.next().activityInfo.packageName, uri, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: handleCaptureImageResult, reason: merged with bridge method [inline-methods] */
    public void lambda$onActivityResult$3(int i10) {
        if (i10 != -1) {
            finishWithSuccess(null);
            return;
        }
        Uri uri = this.pendingCameraMediaUri;
        FileUriResolver fileUriResolver = this.fileUriResolver;
        if (uri == null) {
            uri = Uri.parse(this.cache.retrievePendingCameraMediaUriPath());
        }
        fileUriResolver.getFullImagePath(uri, new OnPathReadyListener() { // from class: io.flutter.plugins.imagepicker.h
            @Override // io.flutter.plugins.imagepicker.ImagePickerDelegate.OnPathReadyListener
            public final void onPathReady(String str) {
                this.f37942a.lambda$handleCaptureImageResult$7(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: handleCaptureVideoResult, reason: merged with bridge method [inline-methods] */
    public void lambda$onActivityResult$6(int i10) {
        if (i10 != -1) {
            finishWithSuccess(null);
            return;
        }
        Uri uri = this.pendingCameraMediaUri;
        FileUriResolver fileUriResolver = this.fileUriResolver;
        if (uri == null) {
            uri = Uri.parse(this.cache.retrievePendingCameraMediaUriPath());
        }
        fileUriResolver.getFullImagePath(uri, new OnPathReadyListener() { // from class: io.flutter.plugins.imagepicker.i
            @Override // io.flutter.plugins.imagepicker.ImagePickerDelegate.OnPathReadyListener
            public final void onPathReady(String str) {
                this.f37943a.finishWithSuccess(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: handleChooseImageResult, reason: merged with bridge method [inline-methods] */
    public void lambda$onActivityResult$0(int i10, Intent intent) {
        if (i10 != -1 || intent == null) {
            finishWithSuccess(null);
            return;
        }
        ArrayList<MediaPath> pathsFromIntent = getPathsFromIntent(intent, false);
        if (pathsFromIntent == null) {
            finishWithError("no_valid_image_uri", "Cannot find the selected image.");
        } else {
            handleMediaResult(pathsFromIntent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: handleChooseMediaResult, reason: merged with bridge method [inline-methods] */
    public void lambda$onActivityResult$4(int i10, Intent intent) {
        if (i10 != -1 || intent == null) {
            finishWithSuccess(null);
            return;
        }
        ArrayList<MediaPath> pathsFromIntent = getPathsFromIntent(intent, true);
        if (pathsFromIntent == null) {
            finishWithError("no_valid_media_uri", "Cannot find the selected media.");
        } else {
            handleMediaResult(pathsFromIntent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: handleChooseMultiImageResult, reason: merged with bridge method [inline-methods] */
    public void lambda$onActivityResult$1(int i10, Intent intent) {
        if (i10 != -1 || intent == null) {
            finishWithSuccess(null);
            return;
        }
        ArrayList<MediaPath> pathsFromIntent = getPathsFromIntent(intent, false);
        if (pathsFromIntent == null) {
            finishWithError("missing_valid_image_uri", "Cannot find at least one of the selected images.");
        } else {
            handleMediaResult(pathsFromIntent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: handleChooseMultiVideoResult, reason: merged with bridge method [inline-methods] */
    public void lambda$onActivityResult$2(int i10, Intent intent) {
        if (i10 != -1 || intent == null) {
            finishWithSuccess(null);
            return;
        }
        ArrayList<MediaPath> pathsFromIntent = getPathsFromIntent(intent, false);
        if (pathsFromIntent == null) {
            finishWithError("missing_valid_video_uri", "Cannot find at least one of the selected videos.");
        } else {
            handleMediaResult(pathsFromIntent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: handleChooseVideoResult, reason: merged with bridge method [inline-methods] */
    public void lambda$onActivityResult$5(int i10, Intent intent) {
        if (i10 != -1 || intent == null) {
            finishWithSuccess(null);
            return;
        }
        ArrayList<MediaPath> pathsFromIntent = getPathsFromIntent(intent, false);
        if (pathsFromIntent == null || pathsFromIntent.size() < 1) {
            finishWithError("no_valid_video_uri", "Cannot find the selected video.");
        } else {
            finishWithSuccess(pathsFromIntent.get(0).path);
        }
    }

    private void handleMediaResult(ArrayList<MediaPath> arrayList) {
        Messages.ImageSelectionOptions imageSelectionOptions;
        synchronized (this.pendingCallStateLock) {
            try {
                PendingCallState pendingCallState = this.pendingCallState;
                imageSelectionOptions = pendingCallState != null ? pendingCallState.imageOptions : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        int i10 = 0;
        if (imageSelectionOptions == null) {
            while (i10 < arrayList.size()) {
                arrayList2.add(arrayList.get(i10).path);
                i10++;
            }
            finishWithListSuccess(arrayList2);
            return;
        }
        while (i10 < arrayList.size()) {
            MediaPath mediaPath = arrayList.get(i10);
            String resizedImagePath = mediaPath.path;
            String str = mediaPath.mimeType;
            if (str == null || !str.startsWith("video/")) {
                resizedImagePath = getResizedImagePath(mediaPath.path, imageSelectionOptions);
            }
            arrayList2.add(resizedImagePath);
            i10++;
        }
        finishWithListSuccess(arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleCaptureImageResult$7(String str) {
        handleImageResult(str, true);
    }

    private void launchMultiPickImageFromGalleryIntent(Boolean bool, int i10) {
        Intent intent;
        if (bool.booleanValue()) {
            intent = new g.c(i10).a(this.activity, new i.a().b(d.C0451d.f34779a).a());
        } else {
            intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        this.activity.startActivityForResult(intent, REQUEST_CODE_CHOOSE_MULTI_IMAGE_FROM_GALLERY);
    }

    private void launchMultiPickVideoFromGalleryIntent(Boolean bool, int i10) {
        Intent intent;
        if (bool.booleanValue()) {
            intent = new g.c(i10).a(this.activity, new i.a().b(d.f.f34782a).a());
        } else {
            intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("video/*");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        this.activity.startActivityForResult(intent, REQUEST_CODE_CHOOSE_MULTI_VIDEO_FROM_GALLERY);
    }

    private void launchPickImageFromGalleryIntent(Boolean bool) {
        Intent intent;
        if (bool.booleanValue()) {
            intent = new g.d().a(this.activity, new i.a().b(d.C0451d.f34779a).a());
        } else {
            intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
        }
        this.activity.startActivityForResult(intent, REQUEST_CODE_CHOOSE_IMAGE_FROM_GALLERY);
    }

    private void launchPickMediaFromGalleryIntent(Messages.GeneralOptions generalOptions) {
        Intent intentA;
        if (generalOptions.getUsePhotoPicker().booleanValue()) {
            intentA = generalOptions.getAllowMultiple().booleanValue() ? new g.c(ImagePickerUtils.getLimitFromOption(generalOptions)).a(this.activity, new i.a().b(d.c.f34778a).a()) : new g.d().a(this.activity, new i.a().b(d.c.f34778a).a());
        } else {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            intent.putExtra("CONTENT_TYPE", new String[]{"video/*", "image/*"});
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", generalOptions.getAllowMultiple());
            intentA = intent;
        }
        this.activity.startActivityForResult(intentA, REQUEST_CODE_CHOOSE_MEDIA_FROM_GALLERY);
    }

    private void launchPickVideoFromGalleryIntent(Boolean bool) {
        Intent intent;
        if (bool.booleanValue()) {
            intent = new g.d().a(this.activity, new i.a().b(d.f.f34782a).a());
        } else {
            intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("video/*");
        }
        this.activity.startActivityForResult(intent, REQUEST_CODE_CHOOSE_VIDEO_FROM_GALLERY);
    }

    private void launchTakeImageWithCameraIntent() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (this.cameraDevice == CameraDevice.FRONT) {
            useFrontCamera(intent);
        }
        File fileCreateTemporaryWritableImageFile = createTemporaryWritableImageFile();
        this.pendingCameraMediaUri = Uri.parse("file:" + fileCreateTemporaryWritableImageFile.getAbsolutePath());
        Uri uriResolveFileProviderUriForFile = this.fileUriResolver.resolveFileProviderUriForFile(this.fileProviderName, fileCreateTemporaryWritableImageFile);
        intent.putExtra("output", uriResolveFileProviderUriForFile);
        grantUriPermissions(intent, uriResolveFileProviderUriForFile);
        try {
            try {
                this.activity.startActivityForResult(intent, REQUEST_CODE_TAKE_IMAGE_WITH_CAMERA);
            } catch (SecurityException e10) {
                e10.printStackTrace();
                finishWithError("no_available_camera", "No cameras available for taking pictures.");
            }
        } catch (ActivityNotFoundException unused) {
            fileCreateTemporaryWritableImageFile.delete();
            finishWithError("no_available_camera", "No cameras available for taking pictures.");
        }
    }

    private void launchTakeVideoWithCameraIntent() {
        Messages.VideoSelectionOptions videoSelectionOptions;
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        synchronized (this.pendingCallStateLock) {
            try {
                PendingCallState pendingCallState = this.pendingCallState;
                videoSelectionOptions = pendingCallState != null ? pendingCallState.videoOptions : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (videoSelectionOptions != null && videoSelectionOptions.getMaxDurationSeconds() != null) {
            intent.putExtra("android.intent.extra.durationLimit", videoSelectionOptions.getMaxDurationSeconds().intValue());
        }
        if (this.cameraDevice == CameraDevice.FRONT) {
            useFrontCamera(intent);
        }
        File fileCreateTemporaryWritableVideoFile = createTemporaryWritableVideoFile();
        this.pendingCameraMediaUri = Uri.parse("file:" + fileCreateTemporaryWritableVideoFile.getAbsolutePath());
        Uri uriResolveFileProviderUriForFile = this.fileUriResolver.resolveFileProviderUriForFile(this.fileProviderName, fileCreateTemporaryWritableVideoFile);
        intent.putExtra("output", uriResolveFileProviderUriForFile);
        grantUriPermissions(intent, uriResolveFileProviderUriForFile);
        try {
            try {
                this.activity.startActivityForResult(intent, REQUEST_CODE_TAKE_VIDEO_WITH_CAMERA);
            } catch (SecurityException e10) {
                e10.printStackTrace();
                finishWithError("no_available_camera", "No cameras available for taking pictures.");
            }
        } catch (ActivityNotFoundException unused) {
            fileCreateTemporaryWritableVideoFile.delete();
            finishWithError("no_available_camera", "No cameras available for taking pictures.");
        }
    }

    private boolean needRequestCameraPermission() {
        PermissionManager permissionManager = this.permissionManager;
        if (permissionManager == null) {
            return false;
        }
        return permissionManager.needRequestCameraPermission();
    }

    private static List<ResolveInfo> queryIntentActivitiesPreApi33(PackageManager packageManager, Intent intent) {
        return packageManager.queryIntentActivities(intent, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE);
    }

    private boolean setPendingOptionsAndResult(Messages.ImageSelectionOptions imageSelectionOptions, Messages.VideoSelectionOptions videoSelectionOptions, Messages.Result<List<String>> result) {
        synchronized (this.pendingCallStateLock) {
            try {
                if (this.pendingCallState != null) {
                    return false;
                }
                this.pendingCallState = new PendingCallState(imageSelectionOptions, videoSelectionOptions, result);
                this.cache.clear();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void useFrontCamera(Intent intent) {
        intent.putExtra("android.intent.extras.CAMERA_FACING", 0);
        intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
    }

    public void chooseImageFromGallery(Messages.ImageSelectionOptions imageSelectionOptions, boolean z10, Messages.Result<List<String>> result) {
        if (setPendingOptionsAndResult(imageSelectionOptions, null, result)) {
            launchPickImageFromGalleryIntent(Boolean.valueOf(z10));
        } else {
            finishWithAlreadyActiveError(result);
        }
    }

    public void chooseMediaFromGallery(Messages.MediaSelectionOptions mediaSelectionOptions, Messages.GeneralOptions generalOptions, Messages.Result<List<String>> result) {
        if (setPendingOptionsAndResult(mediaSelectionOptions.getImageSelectionOptions(), null, result)) {
            launchPickMediaFromGalleryIntent(generalOptions);
        } else {
            finishWithAlreadyActiveError(result);
        }
    }

    public void chooseMultiImageFromGallery(Messages.ImageSelectionOptions imageSelectionOptions, boolean z10, int i10, Messages.Result<List<String>> result) {
        if (setPendingOptionsAndResult(imageSelectionOptions, null, result)) {
            launchMultiPickImageFromGalleryIntent(Boolean.valueOf(z10), i10);
        } else {
            finishWithAlreadyActiveError(result);
        }
    }

    public void chooseMultiVideoFromGallery(Messages.VideoSelectionOptions videoSelectionOptions, boolean z10, int i10, Messages.Result<List<String>> result) {
        if (setPendingOptionsAndResult(null, videoSelectionOptions, result)) {
            launchMultiPickVideoFromGalleryIntent(Boolean.valueOf(z10), i10);
        } else {
            finishWithAlreadyActiveError(result);
        }
    }

    public void chooseVideoFromGallery(Messages.VideoSelectionOptions videoSelectionOptions, boolean z10, Messages.Result<List<String>> result) {
        if (setPendingOptionsAndResult(null, videoSelectionOptions, result)) {
            launchPickVideoFromGalleryIntent(Boolean.valueOf(z10));
        } else {
            finishWithAlreadyActiveError(result);
        }
    }

    public void handleImageResult(String str, boolean z10) {
        Messages.ImageSelectionOptions imageSelectionOptions;
        synchronized (this.pendingCallStateLock) {
            try {
                PendingCallState pendingCallState = this.pendingCallState;
                imageSelectionOptions = pendingCallState != null ? pendingCallState.imageOptions : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (imageSelectionOptions == null) {
            finishWithSuccess(str);
            return;
        }
        String resizedImagePath = getResizedImagePath(str, imageSelectionOptions);
        if (resizedImagePath != null && !resizedImagePath.equals(str) && z10) {
            new File(str).delete();
        }
        finishWithSuccess(resizedImagePath);
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i10, final int i11, final Intent intent) {
        Runnable runnable;
        if (i10 == REQUEST_CODE_CHOOSE_IMAGE_FROM_GALLERY) {
            runnable = new Runnable() { // from class: io.flutter.plugins.imagepicker.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37923a.lambda$onActivityResult$0(i11, intent);
                }
            };
        } else if (i10 == REQUEST_CODE_TAKE_IMAGE_WITH_CAMERA) {
            runnable = new Runnable() { // from class: io.flutter.plugins.imagepicker.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37932a.lambda$onActivityResult$3(i11);
                }
            };
        } else if (i10 == REQUEST_CODE_CHOOSE_VIDEO_FROM_GALLERY) {
            runnable = new Runnable() { // from class: io.flutter.plugins.imagepicker.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37937a.lambda$onActivityResult$5(i11, intent);
                }
            };
        } else if (i10 != REQUEST_CODE_TAKE_VIDEO_WITH_CAMERA) {
            switch (i10) {
                case REQUEST_CODE_CHOOSE_MULTI_IMAGE_FROM_GALLERY /* 2346 */:
                    runnable = new Runnable() { // from class: io.flutter.plugins.imagepicker.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f37926a.lambda$onActivityResult$1(i11, intent);
                        }
                    };
                    break;
                case REQUEST_CODE_CHOOSE_MEDIA_FROM_GALLERY /* 2347 */:
                    runnable = new Runnable() { // from class: io.flutter.plugins.imagepicker.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f37934a.lambda$onActivityResult$4(i11, intent);
                        }
                    };
                    break;
                case REQUEST_CODE_CHOOSE_MULTI_VIDEO_FROM_GALLERY /* 2348 */:
                    runnable = new Runnable() { // from class: io.flutter.plugins.imagepicker.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f37929a.lambda$onActivityResult$2(i11, intent);
                        }
                    };
                    break;
                default:
                    return false;
            }
        } else {
            runnable = new Runnable() { // from class: io.flutter.plugins.imagepicker.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37940a.lambda$onActivityResult$6(i11);
                }
            };
        }
        this.executor.execute(runnable);
        return true;
    }

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        boolean z10 = iArr.length > 0 && iArr[0] == 0;
        if (i10 != REQUEST_CAMERA_IMAGE_PERMISSION) {
            if (i10 != REQUEST_CAMERA_VIDEO_PERMISSION) {
                return false;
            }
            if (z10) {
                launchTakeVideoWithCameraIntent();
            }
        } else if (z10) {
            launchTakeImageWithCameraIntent();
        }
        if (!z10 && (i10 == REQUEST_CAMERA_IMAGE_PERMISSION || i10 == REQUEST_CAMERA_VIDEO_PERMISSION)) {
            finishWithError("camera_access_denied", "The user did not allow camera access.");
        }
        return true;
    }

    public Messages.CacheRetrievalResult retrieveLostImage() {
        Map<String, Object> cacheMap = this.cache.getCacheMap();
        if (cacheMap.isEmpty()) {
            return null;
        }
        Messages.CacheRetrievalResult.Builder builder = new Messages.CacheRetrievalResult.Builder();
        Messages.CacheRetrievalType cacheRetrievalType = (Messages.CacheRetrievalType) cacheMap.get("type");
        if (cacheRetrievalType != null) {
            builder.setType(cacheRetrievalType);
        }
        builder.setError((Messages.CacheRetrievalError) cacheMap.get("error"));
        ArrayList<String> arrayList = (ArrayList) cacheMap.get("pathList");
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (String str : arrayList) {
                Double d10 = (Double) cacheMap.get("maxWidth");
                Double d11 = (Double) cacheMap.get("maxHeight");
                Integer num = (Integer) cacheMap.get("imageQuality");
                arrayList2.add(this.imageResizer.resizeImageIfNeeded(str, d10, d11, num == null ? 100 : num.intValue()));
            }
            builder.setPaths(arrayList2);
        }
        this.cache.clear();
        return builder.build();
    }

    public void saveStateBeforeResult() {
        synchronized (this.pendingCallStateLock) {
            try {
                PendingCallState pendingCallState = this.pendingCallState;
                if (pendingCallState == null) {
                    return;
                }
                Messages.ImageSelectionOptions imageSelectionOptions = pendingCallState.imageOptions;
                this.cache.saveType(imageSelectionOptions != null ? ImagePickerCache.CacheType.IMAGE : ImagePickerCache.CacheType.VIDEO);
                if (imageSelectionOptions != null) {
                    this.cache.saveDimensionWithOutputOptions(imageSelectionOptions);
                }
                Uri uri = this.pendingCameraMediaUri;
                if (uri != null) {
                    this.cache.savePendingCameraMediaUriPath(uri);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setCameraDevice(CameraDevice cameraDevice) {
        this.cameraDevice = cameraDevice;
    }

    public void takeImageWithCamera(Messages.ImageSelectionOptions imageSelectionOptions, Messages.Result<List<String>> result) {
        if (!setPendingOptionsAndResult(imageSelectionOptions, null, result)) {
            finishWithAlreadyActiveError(result);
        } else if (!needRequestCameraPermission() || this.permissionManager.isPermissionGranted("android.permission.CAMERA")) {
            launchTakeImageWithCameraIntent();
        } else {
            this.permissionManager.askForPermission("android.permission.CAMERA", REQUEST_CAMERA_IMAGE_PERMISSION);
        }
    }

    public void takeVideoWithCamera(Messages.VideoSelectionOptions videoSelectionOptions, Messages.Result<List<String>> result) {
        if (!setPendingOptionsAndResult(null, videoSelectionOptions, result)) {
            finishWithAlreadyActiveError(result);
        } else if (!needRequestCameraPermission() || this.permissionManager.isPermissionGranted("android.permission.CAMERA")) {
            launchTakeVideoWithCameraIntent();
        } else {
            this.permissionManager.askForPermission("android.permission.CAMERA", REQUEST_CAMERA_VIDEO_PERMISSION);
        }
    }

    public ImagePickerDelegate(Activity activity, ImageResizer imageResizer, Messages.ImageSelectionOptions imageSelectionOptions, Messages.VideoSelectionOptions videoSelectionOptions, Messages.Result<List<String>> result, ImagePickerCache imagePickerCache, PermissionManager permissionManager, FileUriResolver fileUriResolver, FileUtils fileUtils, ExecutorService executorService) {
        this.pendingCallStateLock = new Object();
        this.activity = activity;
        this.imageResizer = imageResizer;
        this.fileProviderName = activity.getPackageName() + ".flutter.image_provider";
        if (result != null) {
            this.pendingCallState = new PendingCallState(imageSelectionOptions, videoSelectionOptions, result);
        }
        this.permissionManager = permissionManager;
        this.fileUriResolver = fileUriResolver;
        this.fileUtils = fileUtils;
        this.cache = imagePickerCache;
        this.executor = executorService;
    }
}
