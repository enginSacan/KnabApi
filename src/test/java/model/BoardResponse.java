package model;

import client.BoardHandler;

@lombok.Data
@lombok.Builder
public class BoardResponse implements SerializableJson{

        String id;
        String name;
        String desc;
        DescData descData;
        Boolean closed;
        String idOrganization;
        String idEnterprise;
        Boolean pinned;
        String url;
        String shortUrl;
        Prefs prefs;
        LabelNames labelNames;

}
