package com.imer1c.requests.body;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetModFilesRequestBody implements IBody {
    private final List<Integer> fileIds;

    private GetModFilesRequestBody(List<Integer> fileIds) {
        this.fileIds = fileIds;
    }

    public List<Integer> getFileIds() {
        return fileIds;
    }

    public static class Builder {
        private final List<Integer> fileIds = new ArrayList<>();

        public Builder addFileId(int fileId) {
            this.fileIds.add(fileId);
            return this;
        }

        public Builder addFileIds(Integer... fileIds) {
            this.fileIds.addAll(Arrays.asList(fileIds));
            return this;
        }

        public GetModFilesRequestBody build() {
            return new GetModFilesRequestBody(this.fileIds);
        }
    }
}
