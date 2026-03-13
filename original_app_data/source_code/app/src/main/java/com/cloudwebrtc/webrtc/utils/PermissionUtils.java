package com.cloudwebrtc.webrtc.utils;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class PermissionUtils {
    private static final String GRANT_RESULTS = "GRANT_RESULT";
    private static final String PERMISSIONS = "PERMISSION";
    private static final String REQUEST_CODE = "REQUEST_CODE";
    private static final String RESULT_RECEIVER = "RESULT_RECEIVER";
    private static int requestCode;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface Callback {
        void invoke(String[] strArr, int[] iArr);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class RequestPermissionsFragment extends Fragment {
        private void checkSelfPermissions(boolean z10) {
            Bundle arguments = getArguments();
            String[] stringArray = arguments.getStringArray(PermissionUtils.PERMISSIONS);
            int length = stringArray.length;
            Activity activity = getActivity();
            int[] iArr = new int[length];
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < length; i10++) {
                String str = stringArray[i10];
                int iCheckSelfPermission = activity.checkSelfPermission(str);
                iArr[i10] = iCheckSelfPermission;
                if (iCheckSelfPermission != 0) {
                    arrayList.add(str);
                }
            }
            int i11 = arguments.getInt(PermissionUtils.REQUEST_CODE, 0);
            if (!arrayList.isEmpty() && z10) {
                requestPermissions((String[]) arrayList.toArray(new String[arrayList.size()]), i11);
            } else {
                finish();
                PermissionUtils.send((ResultReceiver) arguments.getParcelable(PermissionUtils.RESULT_RECEIVER), i11, stringArray, iArr);
            }
        }

        private void finish() {
            Activity activity = getActivity();
            if (activity != null) {
                activity.getFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
            }
        }

        @Override // android.app.Fragment
        public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
            Bundle arguments = getArguments();
            if (arguments.getInt(PermissionUtils.REQUEST_CODE, 0) != i10) {
                return;
            }
            if (strArr.length != 0 && iArr.length != 0) {
                checkSelfPermissions(false);
            } else {
                finish();
                PermissionUtils.requestPermissions(getContext(), getActivity(), arguments.getStringArray(PermissionUtils.PERMISSIONS), (ResultReceiver) arguments.getParcelable(PermissionUtils.RESULT_RECEIVER));
            }
        }

        @Override // android.app.Fragment
        public void onResume() {
            super.onResume();
            checkSelfPermissions(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void requestPermissions(Context context, Activity activity, String[] strArr, ResultReceiver resultReceiver) {
        int length = strArr.length;
        int[] iArr = new int[length];
        boolean z10 = true;
        for (int i10 = 0; i10 < length; i10++) {
            int iCheckSelfPermission = activity != null ? activity.checkSelfPermission(strArr[i10]) : L0.a.a(context, strArr[i10]);
            iArr[i10] = iCheckSelfPermission;
            if (iCheckSelfPermission != 0) {
                z10 = false;
            }
        }
        int i11 = requestCode + 1;
        requestCode = i11;
        if (z10 || context.getApplicationInfo().targetSdkVersion < 23) {
            send(resultReceiver, i11, strArr, iArr);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt(REQUEST_CODE, i11);
        bundle.putParcelable(RESULT_RECEIVER, resultReceiver);
        bundle.putStringArray(PERMISSIONS, strArr);
        RequestPermissionsFragment requestPermissionsFragment = new RequestPermissionsFragment();
        requestPermissionsFragment.setArguments(bundle);
        if (activity != null) {
            try {
                activity.getFragmentManager().beginTransaction().add(requestPermissionsFragment, RequestPermissionsFragment.class.getName() + "-" + i11).commit();
            } catch (IllegalStateException unused) {
                send(resultReceiver, i11, strArr, iArr);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void send(ResultReceiver resultReceiver, int i10, String[] strArr, int[] iArr) {
        Bundle bundle = new Bundle();
        bundle.putStringArray(PERMISSIONS, strArr);
        bundle.putIntArray(GRANT_RESULTS, iArr);
        resultReceiver.send(i10, bundle);
    }

    public static void requestPermissions(Context context, Activity activity, String[] strArr, final Callback callback) {
        requestPermissions(context, activity, strArr, new ResultReceiver(new Handler(Looper.getMainLooper())) { // from class: com.cloudwebrtc.webrtc.utils.PermissionUtils.1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i10, Bundle bundle) {
                callback.invoke(bundle.getStringArray(PermissionUtils.PERMISSIONS), bundle.getIntArray(PermissionUtils.GRANT_RESULTS));
            }
        });
    }
}
