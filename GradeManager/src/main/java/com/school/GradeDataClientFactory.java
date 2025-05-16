package com.school;

public class GradeDataClientFactory {
    public static GradeDataClient GetDataClient(GradeStorageMode storageMode)
    {
        switch (storageMode) {
            case XML:
                return new XmlGradeDataClient();
            case JSON:
                return new JsonGradeDataClient();
                
            default:
                throw new IllegalArgumentException("Invalid storage mode");
        }
    }
}
