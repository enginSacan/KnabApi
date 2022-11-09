package model;

import java.lang.reflect.Array;
import java.util.List;

@lombok.Data
@lombok.Builder
public class Prefs implements SerializableJson{
    String permissionLevel;
    String hideVotes;
    String voting;
    String comments;
    String invitations;
    Boolean selfJoin;
    Boolean cardCovers;
    Boolean isTemplate;
    String cardAging;
    Boolean calendarFeedEnabled;
    List<String> hiddenPluginBoardButtons;
    List<SwitcherView> switcherViews;
    String background;
    String backgroundColor;
    String backgroundImage;
    String backgroundImageScaled;
    Boolean backgroundTile;
    String backgroundBrightness;
    String backgroundBottomColor;
    String backgroundTopColor;
    Boolean canBePublic;
    Boolean canBeEnterprise;
    Boolean canBeOrg;
    Boolean canBePrivate;
    Boolean canInvite;
}
