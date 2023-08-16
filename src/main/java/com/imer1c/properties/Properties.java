package com.imer1c.properties;

import com.imer1c.enums.ModLoaderType;
import com.imer1c.enums.ModsSearchSortField;

import javax.swing.*;

public class Properties {
    public static final IPropertyFactory<String> GAME_VERSION = IPropertyFactory.createFactory("gameVersion");
    public static final IPropertyFactory<ModLoaderType> MOD_LOADER_TYPE = IPropertyFactory.createFactory("modLoaderType");
    public static final IPropertyFactory<Integer> GAME_VERSION_TYPE_ID = IPropertyFactory.createFactory("gameVersionTypeId");
    public static final IPropertyFactory<Integer> INDEX = IPropertyFactory.createFactory("index");
    public static final IPropertyFactory<Integer> PAGE_SIZE = IPropertyFactory.createFactory("pageSize");
    public static final IPropertyFactory<Boolean> SORT_DESCENDING = IPropertyFactory.createFactory("sortDescending");
    public static final IPropertyFactory<String> VERSION = IPropertyFactory.createFactory("version");
    public static final IPropertyFactory<Boolean> INCLUDE_ALL = IPropertyFactory.createFactory("includeAll");
    public static final IPropertyFactory<Integer> GAME_ID = IPropertyFactory.createFactory("gameId");
    public static final IPropertyFactory<Integer> CLASS_ID = IPropertyFactory.createFactory("classId");
    public static final IPropertyFactory<Boolean> CLASSES_ONLY = IPropertyFactory.createFactory("classesOnly");
    public static final IPropertyFactory<Integer> CATEGORY_ID = IPropertyFactory.createFactory("categoryId");
    public static final IPropertyFactory<String> SEARCH_FILTER = IPropertyFactory.createFactory("searchFilter");
    public static final IPropertyFactory<ModsSearchSortField> SORT_FIELD = IPropertyFactory.createFactory("sortField");
    public static final IPropertyFactory<SortOrder> SORT_ORDER = IPropertyFactory.createFactory("sortOrder");
    public static final IPropertyFactory<String> SLUG = IPropertyFactory.createFactory("slug");
}
