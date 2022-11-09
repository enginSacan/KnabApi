package model;
@lombok.Data
@lombok.Builder
public class SwitcherView implements SerializableJson{
    String _id;
    String viewType;
    Boolean enabled;
}
