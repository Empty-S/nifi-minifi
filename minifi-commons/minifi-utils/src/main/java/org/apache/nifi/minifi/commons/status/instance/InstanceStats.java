/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.nifi.minifi.commons.status.instance;

public class InstanceStats implements java.io.Serializable {
    private long bytesRead;
    private long bytesWritten;
    private long bytesSent;
    private int flowFilesSent;
    private long bytesTransferred;
    private int flowFilesTransferred;
    private long bytesReceived;
    private int flowFilesReceived;

    public InstanceStats() {
    }

    public long getBytesRead() {
        return bytesRead;
    }

    public void setBytesRead(long bytesRead) {
        this.bytesRead = bytesRead;
    }

    public long getBytesWritten() {
        return bytesWritten;
    }

    public void setBytesWritten(long bytesWritten) {
        this.bytesWritten = bytesWritten;
    }

    public long getBytesSent() {
        return bytesSent;
    }

    public void setBytesSent(long bytesSent) {
        this.bytesSent = bytesSent;
    }

    public int getFlowfilesSent() {
        return flowFilesSent;
    }

    public void setFlowfilesSent(int flowFilesSent) {
        this.flowFilesSent = flowFilesSent;
    }

    public long getBytesTransferred() {
        return bytesTransferred;
    }

    public void setBytesTransferred(long bytesTransferred) {
        this.bytesTransferred = bytesTransferred;
    }

    public int getFlowfilesTransferred() {
        return flowFilesTransferred;
    }

    public void setFlowfilesTransferred(int flowFilesTransferred) {
        this.flowFilesTransferred = flowFilesTransferred;
    }

    public long getBytesReceived() {
        return bytesReceived;
    }

    public void setBytesReceived(long bytesReceived) {
        this.bytesReceived = bytesReceived;
    }

    public int getFlowfilesReceived() {
        return flowFilesReceived;
    }

    public void setFlowfilesReceived(int flowFilesReceived) {
        this.flowFilesReceived = flowFilesReceived;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InstanceStats that = (InstanceStats) o;

        if (getBytesRead() != that.getBytesRead()) return false;
        if (getBytesWritten() != that.getBytesWritten()) return false;
        if (getBytesSent() != that.getBytesSent()) return false;
        if (getFlowfilesSent() != that.getFlowfilesSent()) return false;
        if (getBytesTransferred() != that.getBytesTransferred()) return false;
        if (getFlowfilesTransferred() != that.getFlowfilesTransferred()) return false;
        if (getBytesReceived() != that.getBytesReceived()) return false;
        return getFlowfilesReceived() == that.getFlowfilesReceived();

    }

    @Override
    public int hashCode() {
        int result = (int) (getBytesRead() ^ (getBytesRead() >>> 32));
        result = 31 * result + (int) (getBytesWritten() ^ (getBytesWritten() >>> 32));
        result = 31 * result + (int) (getBytesSent() ^ (getBytesSent() >>> 32));
        result = 31 * result + getFlowfilesSent();
        result = 31 * result + (int) (getBytesTransferred() ^ (getBytesTransferred() >>> 32));
        result = 31 * result + getFlowfilesTransferred();
        result = 31 * result + (int) (getBytesReceived() ^ (getBytesReceived() >>> 32));
        result = 31 * result + getFlowfilesReceived();
        return result;
    }

    @Override
    public String toString() {
        return "{" +
                "bytesRead=" + bytesRead +
                ", bytesWritten=" + bytesWritten +
                ", bytesSent=" + bytesSent +
                ", flowFilesSent=" + flowFilesSent +
                ", bytesTransferred=" + bytesTransferred +
                ", flowFilesTransferred=" + flowFilesTransferred +
                ", bytesReceived=" + bytesReceived +
                ", flowFilesReceived=" + flowFilesReceived +
                '}';
    }
}
