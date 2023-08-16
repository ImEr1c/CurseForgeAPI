package com.imer1c.schemas;

public class Pagination {
    private final int index;
    private final int pageSize;
    private final int resultCount;
    private final int totalCount;

    public Pagination(int index, int pageSize, int resultCount, int totalCount) {
        this.index = index;
        this.pageSize = pageSize;
        this.resultCount = resultCount;
        this.totalCount = totalCount;
    }

    public int getIndex() {
        return index;
    }

    public int getPageSize() {
        return pageSize;
    }

    public int getResultCount() {
        return resultCount;
    }

    public int getTotalCount() {
        return totalCount;
    }
}
