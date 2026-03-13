package org.apache.tika.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class StreamGobbler implements Runnable {
    private final InputStream is;
    private final int maxBufferLength;
    List<String> lines = new ArrayList();
    long streamLength = 0;
    boolean isTruncated = false;

    public StreamGobbler(InputStream inputStream, int i10) {
        this.is = inputStream;
        this.maxBufferLength = i10;
    }

    public boolean getIsTruncated() {
        return this.isTruncated;
    }

    public List<String> getLines() {
        return this.lines;
    }

    public long getStreamLength() {
        return this.streamLength;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.is, StandardCharsets.UTF_8));
            try {
                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    if (this.maxBufferLength >= 0) {
                        long length = this.streamLength + ((long) line.length());
                        int i10 = this.maxBufferLength;
                        if (length > i10) {
                            int i11 = i10 - ((int) this.streamLength);
                            if (i11 > 0) {
                                this.isTruncated = true;
                                this.lines.add(line.substring(0, Math.min(line.length(), i11)));
                            }
                        } else {
                            this.lines.add(line);
                        }
                    }
                    this.streamLength += (long) line.length();
                }
                bufferedReader.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }
}
