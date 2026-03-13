package com.cloudwebrtc.webrtc.record;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.os.Handler;
import android.os.Looper;
import io.flutter.plugin.common.MethodChannel;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import org.webrtc.VideoTrack;
import org.webrtc.YuvHelper;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class FrameCapturer implements VideoSink {
    private final MethodChannel.Result callback;
    private File file;
    private boolean gotFrame = false;
    private final VideoTrack videoTrack;

    public FrameCapturer(VideoTrack videoTrack, File file, MethodChannel.Result result) {
        this.videoTrack = videoTrack;
        this.file = file;
        this.callback = result;
        videoTrack.addSink(this);
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        if (this.gotFrame) {
            return;
        }
        this.gotFrame = true;
        videoFrame.retain();
        VideoFrame.I420Buffer i420 = videoFrame.getBuffer().toI420();
        ByteBuffer dataY = i420.getDataY();
        ByteBuffer dataU = i420.getDataU();
        ByteBuffer dataV = i420.getDataV();
        int width = i420.getWidth();
        int height = i420.getHeight();
        int[] iArr = {i420.getStrideY(), i420.getStrideU(), i420.getStrideV()};
        int i10 = (width * height) + (((width + 1) / 2) * ((height + 1) / 2) * 2);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i10);
        YuvHelper.I420ToNV12(dataY, iArr[0], dataV, iArr[2], dataU, iArr[1], byteBufferAllocateDirect, width, height);
        YuvImage yuvImage = new YuvImage(Arrays.copyOfRange(byteBufferAllocateDirect.array(), byteBufferAllocateDirect.arrayOffset(), i10), 17, width, height, null);
        i420.release();
        videoFrame.release();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.cloudwebrtc.webrtc.record.c
            @Override // java.lang.Runnable
            public final void run() {
                FrameCapturer frameCapturer = this.f28818a;
                frameCapturer.videoTrack.removeSink(frameCapturer);
            }
        });
        try {
            if (!this.file.exists()) {
                this.file.getParentFile().mkdirs();
                this.file.createNewFile();
            }
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.file);
                    try {
                        yuvImage.compressToJpeg(new Rect(0, 0, width, height), 100, fileOutputStream);
                        int rotation = videoFrame.getRotation();
                        if (rotation != 0) {
                            if (rotation != 90 && rotation != 180 && rotation != 270) {
                                throw new RuntimeException("Invalid rotation");
                            }
                            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(this.file.toString());
                            Matrix matrix = new Matrix();
                            matrix.postRotate(videoFrame.getRotation());
                            Bitmap.createBitmap(bitmapDecodeFile, 0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), matrix, true).compress(Bitmap.CompressFormat.JPEG, 100, new FileOutputStream(this.file));
                        }
                        this.callback.success(null);
                        fileOutputStream.close();
                    } finally {
                    }
                } catch (IOException e10) {
                    this.callback.error("IOException", e10.getLocalizedMessage(), e10);
                } catch (IllegalArgumentException e11) {
                    this.callback.error("IllegalArgumentException", e11.getLocalizedMessage(), e11);
                }
            } finally {
                this.file = null;
            }
        } catch (IOException e12) {
            this.callback.error("IOException", e12.getLocalizedMessage(), e12);
        }
    }
}
