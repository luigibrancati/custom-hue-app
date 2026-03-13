package com.google.android.filament;

import org.apache.tika.metadata.MachineMetadata;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
abstract class Platform {
    private static Platform mCurrentPlatform;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class UnknownPlatform extends Platform {
        @Override // com.google.android.filament.Platform
        public long getSharedContextNativeHandle(Object obj) {
            return 0L;
        }

        @Override // com.google.android.filament.Platform
        public void log(String str) {
            System.out.println(str);
        }

        @Override // com.google.android.filament.Platform
        public boolean validateSharedContext(Object obj) {
            return false;
        }

        @Override // com.google.android.filament.Platform
        public boolean validateStreamSource(Object obj) {
            return false;
        }

        @Override // com.google.android.filament.Platform
        public boolean validateSurface(Object obj) {
            return false;
        }

        @Override // com.google.android.filament.Platform
        public void warn(String str) {
            System.out.println(str);
        }

        private UnknownPlatform() {
        }
    }

    public static Platform get() {
        if (mCurrentPlatform == null) {
            try {
                if (isAndroid()) {
                    int i10 = AndroidPlatform.f28924a;
                    mCurrentPlatform = (Platform) AndroidPlatform.class.newInstance();
                } else {
                    mCurrentPlatform = (Platform) Class.forName("com.google.android.filament.DesktopPlatform").newInstance();
                }
            } catch (Exception unused) {
            }
            if (mCurrentPlatform == null) {
                mCurrentPlatform = new UnknownPlatform();
            }
        }
        return mCurrentPlatform;
    }

    public static boolean isAndroid() {
        return "The Android Project".equalsIgnoreCase(System.getProperty("java.vendor"));
    }

    public static boolean isLinux() {
        return System.getProperty("os.name").contains(MachineMetadata.PLATFORM_LINUX) && !isAndroid();
    }

    public static boolean isMacOS() {
        return System.getProperty("os.name").contains("Mac OS X");
    }

    public static boolean isWindows() {
        return System.getProperty("os.name").contains(MachineMetadata.PLATFORM_WINDOWS);
    }

    public abstract long getSharedContextNativeHandle(Object obj);

    public abstract void log(String str);

    public abstract boolean validateSharedContext(Object obj);

    public abstract boolean validateStreamSource(Object obj);

    public abstract boolean validateSurface(Object obj);

    public abstract void warn(String str);
}
