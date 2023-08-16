package com.imer1c.profile;

public class ProfileCurseFile {
    private final int projectID;
    private final int fileID;
    private final boolean required;

    public ProfileCurseFile(int projectID, int fileID, boolean required) {
        this.projectID = projectID;
        this.fileID = fileID;
        this.required = required;
    }

    public int getProjectID() {
        return projectID;
    }

    public int getFileID() {
        return fileID;
    }

    public boolean isRequired() {
        return required;
    }
}
