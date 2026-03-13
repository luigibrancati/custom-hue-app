package io.flutter.plugins.imagepicker;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.AbstractC2754j;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC2758n;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.embedding.engine.plugins.lifecycle.FlutterLifecycleAdapter;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugins.imagepicker.ImagePickerDelegate;
import io.flutter.plugins.imagepicker.Messages;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class ImagePickerPlugin implements FlutterPlugin, ActivityAware, Messages.ImagePickerApi {
    ActivityState activityState;
    private FlutterPlugin.FlutterPluginBinding pluginBinding;

    /* JADX INFO: renamed from: io.flutter.plugins.imagepicker.ImagePickerPlugin$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$imagepicker$Messages$SourceCamera;
        static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$imagepicker$Messages$SourceType;

        static {
            int[] iArr = new int[Messages.SourceType.values().length];
            $SwitchMap$io$flutter$plugins$imagepicker$Messages$SourceType = iArr;
            try {
                iArr[Messages.SourceType.GALLERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$plugins$imagepicker$Messages$SourceType[Messages.SourceType.CAMERA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Messages.SourceCamera.values().length];
            $SwitchMap$io$flutter$plugins$imagepicker$Messages$SourceCamera = iArr2;
            try {
                iArr2[Messages.SourceCamera.FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$flutter$plugins$imagepicker$Messages$SourceCamera[Messages.SourceCamera.REAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public ImagePickerPlugin() {
    }

    private ImagePickerDelegate getImagePickerDelegate() {
        ActivityState activityState = this.activityState;
        if (activityState == null || activityState.getActivity() == null) {
            return null;
        }
        return this.activityState.getDelegate();
    }

    private void setCameraDevice(ImagePickerDelegate imagePickerDelegate, Messages.SourceSpecification sourceSpecification) {
        Messages.SourceCamera camera = sourceSpecification.getCamera();
        if (camera != null) {
            imagePickerDelegate.setCameraDevice(AnonymousClass1.$SwitchMap$io$flutter$plugins$imagepicker$Messages$SourceCamera[camera.ordinal()] != 1 ? ImagePickerDelegate.CameraDevice.REAR : ImagePickerDelegate.CameraDevice.FRONT);
        }
    }

    private void setup(BinaryMessenger binaryMessenger, Application application, Activity activity, ActivityPluginBinding activityPluginBinding) {
        this.activityState = new ActivityState(application, activity, binaryMessenger, this, activityPluginBinding);
    }

    private void tearDown() {
        ActivityState activityState = this.activityState;
        if (activityState != null) {
            activityState.release();
            this.activityState = null;
        }
    }

    public final ImagePickerDelegate constructDelegate(Activity activity) {
        return new ImagePickerDelegate(activity, new ImageResizer(activity, new ExifDataCopier()), new ImagePickerCache(activity));
    }

    public final ActivityState getActivityState() {
        return this.activityState;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        setup(this.pluginBinding.getBinaryMessenger(), (Application) this.pluginBinding.getApplicationContext(), activityPluginBinding.getActivity(), activityPluginBinding);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.pluginBinding = flutterPluginBinding;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        tearDown();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.pluginBinding = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }

    @Override // io.flutter.plugins.imagepicker.Messages.ImagePickerApi
    public void pickImages(Messages.SourceSpecification sourceSpecification, Messages.ImageSelectionOptions imageSelectionOptions, Messages.GeneralOptions generalOptions, Messages.Result<List<String>> result) {
        ImagePickerDelegate imagePickerDelegate = getImagePickerDelegate();
        if (imagePickerDelegate == null) {
            result.error(new Messages.FlutterError("no_activity", "image_picker plugin requires a foreground activity.", null));
            return;
        }
        setCameraDevice(imagePickerDelegate, sourceSpecification);
        if (generalOptions.getAllowMultiple().booleanValue()) {
            imagePickerDelegate.chooseMultiImageFromGallery(imageSelectionOptions, generalOptions.getUsePhotoPicker().booleanValue(), ImagePickerUtils.getLimitFromOption(generalOptions), result);
            return;
        }
        int i10 = AnonymousClass1.$SwitchMap$io$flutter$plugins$imagepicker$Messages$SourceType[sourceSpecification.getType().ordinal()];
        if (i10 == 1) {
            imagePickerDelegate.chooseImageFromGallery(imageSelectionOptions, generalOptions.getUsePhotoPicker().booleanValue(), result);
        } else {
            if (i10 != 2) {
                return;
            }
            imagePickerDelegate.takeImageWithCamera(imageSelectionOptions, result);
        }
    }

    @Override // io.flutter.plugins.imagepicker.Messages.ImagePickerApi
    public void pickMedia(Messages.MediaSelectionOptions mediaSelectionOptions, Messages.GeneralOptions generalOptions, Messages.Result<List<String>> result) {
        ImagePickerDelegate imagePickerDelegate = getImagePickerDelegate();
        if (imagePickerDelegate == null) {
            result.error(new Messages.FlutterError("no_activity", "image_picker plugin requires a foreground activity.", null));
        } else {
            imagePickerDelegate.chooseMediaFromGallery(mediaSelectionOptions, generalOptions, result);
        }
    }

    @Override // io.flutter.plugins.imagepicker.Messages.ImagePickerApi
    public void pickVideos(Messages.SourceSpecification sourceSpecification, Messages.VideoSelectionOptions videoSelectionOptions, Messages.GeneralOptions generalOptions, Messages.Result<List<String>> result) {
        ImagePickerDelegate imagePickerDelegate = getImagePickerDelegate();
        if (imagePickerDelegate == null) {
            result.error(new Messages.FlutterError("no_activity", "image_picker plugin requires a foreground activity.", null));
            return;
        }
        setCameraDevice(imagePickerDelegate, sourceSpecification);
        if (generalOptions.getAllowMultiple().booleanValue()) {
            imagePickerDelegate.chooseMultiVideoFromGallery(videoSelectionOptions, generalOptions.getUsePhotoPicker().booleanValue(), ImagePickerUtils.getLimitFromOption(generalOptions), result);
            return;
        }
        int i10 = AnonymousClass1.$SwitchMap$io$flutter$plugins$imagepicker$Messages$SourceType[sourceSpecification.getType().ordinal()];
        if (i10 == 1) {
            imagePickerDelegate.chooseVideoFromGallery(videoSelectionOptions, generalOptions.getUsePhotoPicker().booleanValue(), result);
        } else {
            if (i10 != 2) {
                return;
            }
            imagePickerDelegate.takeVideoWithCamera(videoSelectionOptions, result);
        }
    }

    @Override // io.flutter.plugins.imagepicker.Messages.ImagePickerApi
    public Messages.CacheRetrievalResult retrieveLostResults() {
        ImagePickerDelegate imagePickerDelegate = getImagePickerDelegate();
        if (imagePickerDelegate != null) {
            return imagePickerDelegate.retrieveLostImage();
        }
        throw new Messages.FlutterError("no_activity", "image_picker plugin requires a foreground activity.", null);
    }

    public ImagePickerPlugin(ImagePickerDelegate imagePickerDelegate, Activity activity) {
        this.activityState = new ActivityState(imagePickerDelegate, activity);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class ActivityState {
        private Activity activity;
        private ActivityPluginBinding activityBinding;
        private Application application;
        private ImagePickerDelegate delegate;
        private AbstractC2754j lifecycle;
        private BinaryMessenger messenger;
        private LifeCycleObserver observer;

        public ActivityState(Application application, Activity activity, BinaryMessenger binaryMessenger, Messages.ImagePickerApi imagePickerApi, ActivityPluginBinding activityPluginBinding) {
            this.application = application;
            this.activity = activity;
            this.activityBinding = activityPluginBinding;
            this.messenger = binaryMessenger;
            this.delegate = ImagePickerPlugin.this.constructDelegate(activity);
            Messages.ImagePickerApi.setUp(binaryMessenger, imagePickerApi);
            this.observer = ImagePickerPlugin.this.new LifeCycleObserver(activity);
            activityPluginBinding.addActivityResultListener(this.delegate);
            activityPluginBinding.addRequestPermissionsResultListener(this.delegate);
            AbstractC2754j activityLifecycle = FlutterLifecycleAdapter.getActivityLifecycle(activityPluginBinding);
            this.lifecycle = activityLifecycle;
            activityLifecycle.a(this.observer);
        }

        public Activity getActivity() {
            return this.activity;
        }

        public ImagePickerDelegate getDelegate() {
            return this.delegate;
        }

        public void release() {
            ActivityPluginBinding activityPluginBinding = this.activityBinding;
            if (activityPluginBinding != null) {
                activityPluginBinding.removeActivityResultListener(this.delegate);
                this.activityBinding.removeRequestPermissionsResultListener(this.delegate);
                this.activityBinding = null;
            }
            AbstractC2754j abstractC2754j = this.lifecycle;
            if (abstractC2754j != null) {
                abstractC2754j.c(this.observer);
                this.lifecycle = null;
            }
            Messages.ImagePickerApi.setUp(this.messenger, null);
            Application application = this.application;
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(this.observer);
                this.application = null;
            }
            this.activity = null;
            this.observer = null;
            this.delegate = null;
        }

        public ActivityState(ImagePickerDelegate imagePickerDelegate, Activity activity) {
            this.activity = activity;
            this.delegate = imagePickerDelegate;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class LifeCycleObserver implements Application.ActivityLifecycleCallbacks, DefaultLifecycleObserver {
        private final Activity thisActivity;

        public LifeCycleObserver(Activity activity) {
            this.thisActivity = activity;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.thisActivity != activity || activity.getApplicationContext() == null) {
                return;
            }
            ((Application) activity.getApplicationContext()).unregisterActivityLifecycleCallbacks(this);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            if (this.thisActivity == activity) {
                ImagePickerPlugin.this.activityState.getDelegate().saveStateBeforeResult();
            }
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(InterfaceC2758n interfaceC2758n) {
            onActivityDestroyed(this.thisActivity);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStop(InterfaceC2758n interfaceC2758n) {
            onActivityStopped(this.thisActivity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onCreate(InterfaceC2758n interfaceC2758n) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onPause(InterfaceC2758n interfaceC2758n) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(InterfaceC2758n interfaceC2758n) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStart(InterfaceC2758n interfaceC2758n) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
